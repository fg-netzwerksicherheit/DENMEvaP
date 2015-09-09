;;;
;;;   Copyright 2015, Frankfurt University of Applied Sciences
;;;
;;;   This software is released under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;

(ns
  ^{:author "Ruediger Gad",
    :doc "Functions for JMS interaction"} 
  cljActiveMqRunner.jms
  (:use [clojure.string :only (split)])
  (:import (org.apache.activemq ActiveMQConnectionFactory ActiveMQSslConnectionFactory)
           (org.apache.activemq.broker BrokerService)
           (java.util ArrayList)
           (java.security SecureRandom)
           (java.security.cert X509Certificate)
           (com.esotericsoftware.kryo Kryo)
           (com.esotericsoftware.kryo.io Input Output)
           (org.xerial.snappy Snappy)
           (com.ning.compress.lzf LZFDecoder LZFEncoder)
           (javax.net.ssl KeyManager TrustManager X509KeyManager X509ExtendedKeyManager X509TrustManager)
           (javax.jms BytesMessage Connection DeliveryMode Message MessageListener ObjectMessage Session Topic)))

(defn start-broker [address]
  (doto (BrokerService.)
    (.addConnector address)
    (.setPersistent false)
    (.setUseJmx false)
    (.start)))

(defmacro with-endpoint [server endpoint & body]
  `(let [factory# (if (.startsWith ~server "ssl")
                    (doto (ActiveMQSslConnectionFactory. ~server)
                      (.setTrustStore "client.ts") (.setTrustStorePassword "password")
                      (.setKeyStore "client.ks") (.setKeyStorePassword "password"))
;                      (.setKeyAndTrustManagers
;                        (into-array KeyManager [(proxy [X509ExtendedKeyManager] []
;                                                  (chooseClientAlias [kt# i# s#] (println "1"))
;                                                  (chooseEngineClientAlias [kt# i# s#] (println "1.2"))
;                                                  (chooseEngineServerAlias [kt# i# s#] (println "1.3"))
;                                                  (chooseServerAlias [kt# i# s#] (println "2"))
;                                                  (getCertificateChain [a#] (println "3"))
;                                                  (getClientAliases [kt# i#] (println "4"))
;                                                  (getPrivateKey [a#] (println "5"))
;                                                  (getServerAliases [kt# i#] (println "6"))
;                                                  )])
;                        (into-array TrustManager [(reify X509TrustManager
;                                                    (getAcceptedIssuers [this] (println "foo")nil)
;                                                    (checkClientTrusted [this certs authType] (println "bar"))
;                                                    (checkServerTrusted [this certs authType] (println "baz")))])
;                        (SecureRandom.))
;                      (.setBrokerURL ~server))
                    (ActiveMQConnectionFactory. ~server))
         ~'connection (doto (.createConnection factory#) (.start))
         ~'session (.createSession ~'connection false Session/AUTO_ACKNOWLEDGE)
         split-endpoint# (split ~endpoint #":")
         endpoint-type# (first split-endpoint#)
         endpoint-name# (last split-endpoint#)
         ~'endpoint (cond
                      (= "topic" endpoint-type#) (.createTopic ~'session endpoint-name#)
                      (= "queue" endpoint-type#) (.createQueue ~'session endpoint-name#))]
     ~@body))


(defn init-topic [server topic-name]
  (with-endpoint server topic-name
    (.close connection)
    endpoint))

(defn create-producer [server endpoint]
  (println "Creating producer for endpoint: " endpoint)
  (with-endpoint server endpoint
    (let [producer (doto 
                     (.createProducer session endpoint)
                     (.setDeliveryMode DeliveryMode/NON_PERSISTENT))
          byte-array-type (type (byte-array 1))]
      (fn [o]
        (cond
          (= :close o) (.close connection)
          :default (if (= (type o) byte-array-type)
                     (.send producer (doto (.createBytesMessage session) (.writeBytes ^bytes o)))
                     (.send producer (.createObjectMessage session o))))))))

(defn close [s]
  (s :close))

;;; FIXME: Add unit test(s) for this one...
;;; Gotta do some stubbing and mocking there. =)
(defn create-pooled-producer [server endpoint pool-size]
  (let [producer (create-producer server endpoint)
        pool (ref [])
        pool-fn (fn [data]
                  (dosync 
                    (alter pool #(conj % data))
;                    (println "pool size:" (count @pool))
                    (when (>= (count @pool) pool-size)
;                      (print ".")
                      (producer @pool)
                      (ref-set pool []))))]
    (fn [o]
      (cond
        (= :close o) (close producer)
        :default (pool-fn o)))))

(defn create-pooled-arraylist-producer [server endpoint pool-size]
  (let [producer (create-producer server endpoint)
        pool (ArrayList. (* pool-size 2))]
    (fn [o]
      (cond
        (= :close o) (producer :close)
        :default (do
                   (.add pool o)
                   (when (>= (.size pool) pool-size)
                     (producer pool)
                     (.clear pool)))))))

(defn create-kryo-pooled-arraylist-producer [server endpoint pool-size]
  (let [producer (create-producer server endpoint)
        pool (ArrayList. (* pool-size 2))
        out (Output. 2048000)
        kryo (Kryo.)]
    (fn [o]
      (cond
        (= :close o) (producer :close)
        :default (do
                   (.add pool o)
                   (when (>= (.size pool) pool-size)
                     (let [obj (.writeObject kryo out pool)
                           b-array (.toBytes out)]
                       (producer b-array)
                       (.clear out)
                       (.clear pool))))))))

(defn create-kryo-lzf-pooled-arraylist-producer [server endpoint pool-size]
  (let [producer (create-producer server endpoint)
        pool (ArrayList. (* pool-size 2))
        out (Output. 2048000)
        kryo (Kryo.)]
    (fn [o]
      (cond
        (= :close o) (producer :close)
        :default (do
                   (.add pool o)
                   (when (>= (.size pool) pool-size)
                     (let [obj (.writeObject kryo out pool)
                           b-array (.toBytes out)]
                       (producer (LZFEncoder/encode ^bytes b-array))
                       (.clear out)
                       (.clear pool))))))))

(defn create-kryo-snappy-pooled-arraylist-producer [server endpoint pool-size]
  (let [producer (create-producer server endpoint)
        pool (ArrayList. (* pool-size 2))
        out (Output. 2048000)
        kryo (Kryo.)]
    (fn [o]
      (cond
        (= :close o) (producer :close)
        :default (do
                   (.add pool o)
                   (when (>= (.size pool) pool-size)
                     (let [obj (.writeObject kryo out pool)
                           b-array (.toBytes out)]
                       (producer (Snappy/compress ^bytes b-array))
                       (.clear out)
                       (.clear pool))))))))

(defn create-consumer [server endpoint cb]
  (println "Creating consumer for endpoint: " endpoint)
  (with-endpoint server endpoint
    (let [listener (proxy [MessageListener] []
            (onMessage [^Message m] (cond
                                      (instance? ObjectMessage m)  (cb (.getObject ^ObjectMessage m))
                                      (instance? BytesMessage m) (let [data (byte-array (.getBodyLength ^BytesMessage m))]
                                                                   (.readBytes ^BytesMessage m data)
                                                                   (cb data))
                                      :default (println "Unknown message type:" (type m)))))
          consumer (doto
                     (.createConsumer session endpoint)
                     (.setMessageListener listener))]      
      (fn [k]
        (cond
          (= :close k) (do
                         (println "Closing consumer for endpoint:" endpoint)
                         (.close connection)))))))

(defn create-kryo-consumer [server endpoint cb]
  (println "Creating consumer for endpoint: " endpoint)
  (with-endpoint server endpoint
    (let [kryo (Kryo.)
          in (Input.)
          listener (proxy [MessageListener] []
            (onMessage [^Message m] (cond
                                      (instance? ObjectMessage m)  (cb (.getObject ^ObjectMessage m))
                                      (instance? BytesMessage m) (let [data (byte-array (.getBodyLength ^BytesMessage m))]
                                                                   (.readBytes ^BytesMessage m data)
                                                                   (.setBuffer in data)
                                                                   (cb (.readObject kryo in ArrayList)))
                                      :default (println "Unknown message type:" (type m)))))
          consumer (doto
                     (.createConsumer session endpoint)
                     (.setMessageListener listener))]      
      (fn [k]
        (cond
          (= :close k) (do
                         (println "Closing consumer for endpoint:" endpoint)
                         (.close connection)))))))

(defn create-kryo-lzf-consumer [server endpoint cb]
  (println "Creating consumer for endpoint: " endpoint)
  (with-endpoint server endpoint
    (let [kryo (Kryo.)
          in (Input.)
          listener (proxy [MessageListener] []
            (onMessage [^Message m] (cond
                                      (instance? ObjectMessage m)  (cb (.getObject ^ObjectMessage m))
                                      (instance? BytesMessage m) (let [data (byte-array (.getBodyLength ^BytesMessage m))]
                                                                   (.readBytes ^BytesMessage m data)
                                                                   (.setBuffer in (LZFDecoder/decode ^bytes data))
                                                                   (cb (.readObject kryo in ArrayList)))
                                      :default (println "Unknown message type:" (type m)))))
          consumer (doto
                     (.createConsumer session endpoint)
                     (.setMessageListener listener))]      
      (fn [k]
        (cond
          (= :close k) (do
                         (println "Closing consumer for endpoint:" endpoint)
                         (.close connection)))))))

(defn create-kryo-snappy-consumer [server endpoint cb]
  (println "Creating consumer for endpoint: " endpoint)
  (with-endpoint server endpoint
    (let [kryo (Kryo.)
          in (Input.)
          listener (proxy [MessageListener] []
            (onMessage [^Message m] (cond
                                      (instance? ObjectMessage m)  (cb (.getObject ^ObjectMessage m))
                                      (instance? BytesMessage m) (let [data (byte-array (.getBodyLength ^BytesMessage m))]
                                                                   (.readBytes ^BytesMessage m data)
                                                                   (.setBuffer in (Snappy/uncompress ^bytes data))
                                                                   (cb (.readObject kryo in ArrayList)))
                                      :default (println "Unknown message type:" (type m)))))
          consumer (doto
                     (.createConsumer session endpoint)
                     (.setMessageListener listener))]      
      (fn [k]
        (cond
          (= :close k) (do
                         (println "Closing consumer for endpoint:" endpoint)
                         (.close connection)))))))


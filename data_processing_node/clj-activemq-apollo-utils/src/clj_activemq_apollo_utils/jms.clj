;;;
;;;   Copyright 2015, Frankfurt University of Applied Sciences
;;;
;;;   This software is released under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;

(ns clj-activemq-apollo-utils.jms
  ^{:author "Ruediger Gad",
    :doc "Convenience functions for JMS specific functionality such as creating connections, destinations etc."}
  (:use clojure.java.io)
  (:import (java.util ArrayList)
           (javax.jms DeliveryMode BytesMessage Message MessageConsumer MessageListener MessageProducer ObjectMessage Session)
           (javax.net.ssl SSLContext)
           (java.security SecureRandom)
           (com.esotericsoftware.kryo Kryo)
           (com.esotericsoftware.kryo.io Input Output)
           (org.xerial.snappy Snappy)
           (com.ning.compress.lzf LZFDecoder LZFEncoder)
           (java.security.cert X509Certificate)
           (javax.net.ssl KeyManager TrustManager X509KeyManager X509ExtendedKeyManager X509TrustManager)
;           (org.apache.activemq ActiveMQConnectionFactory)
;           (org.apache.activemq.command ActiveMQTopic)
           (org.fusesource.stomp.jms StompJmsConnectionFactory StompJmsDestination)
           (javax.jms DeliveryMode)))

(defn create-and-start-connection
  "Create and start a JMS connection.
   By default, a StompJmsConnection will be created.
   This can be changed by supplying a different connection factory."
  ([uri]
   (create-and-start-connection uri (StompJmsConnectionFactory.)))
;   (create-and-start-connection uri (ActiveMQConnectionFactory. uri)))
  ([uri factory]
   (when (.startsWith uri "tls")
     (println "tls URI, setting SSLContext.")
     (.setSslContext factory (doto (SSLContext/getInstance "TLS")
                               (.init
                                 (into-array KeyManager [(reify X509KeyManager
                                                           (chooseClientAlias [this kt i s] (println "1"))
                                                           (chooseServerAlias [this kt i s] (println "2"))
                                                           (getCertificateChain [this a] (println "3"))
                                                           (getClientAliases [this kt i] (println "4"))
                                                           (getPrivateKey [this a] (println "5"))
                                                           (getServerAliases [this kt i] (println "6")))])
                                 (into-array TrustManager [(reify X509TrustManager
                                                             (getAcceptedIssuers [this] (println "foo"))
                                                             (checkClientTrusted [this certs authType] (println "bar"))
                                                             (checkServerTrusted [this certs authType] (println "baz")))])
                                 (SecureRandom.)))))
   (cond
     (= StompJmsConnectionFactory (type factory)) (.setBrokerURI factory uri))
   (doto (.createConnection factory) (.start))))

(defn create-session
  ([conn]
   (.createSession conn false Session/AUTO_ACKNOWLEDGE)))

(defn create-producer
  ([brkr-uri dst]
   (let [connection (create-and-start-connection brkr-uri)
         ^Session session (create-session connection)
         ^MessageProducer producer (.createProducer session (StompJmsDestination. dst))
;         ^MessageProducer producer (.createProducer session (ActiveMQTopic. dst))
         byte-array-type (type (byte-array 1))
         _ (.setDeliveryMode producer DeliveryMode/NON_PERSISTENT)]
     (fn [arg]
       (cond
         (= arg :close) (.close connection)
         :default (if (= (type arg) byte-array-type)
                    (.send producer (doto (.createBytesMessage session) (.writeBytes ^bytes arg)))
                    (.send producer (.createObjectMessage session arg))))))))

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
        (= :close o) (producer :close)
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

(defn create-consumer
  ([brkr-uri dst cb]
   (let [connection (create-and-start-connection brkr-uri)
         ^Session session (create-session connection)
         listener (proxy [MessageListener] []
                     (onMessage [^Message m] (cond
                                               (instance? ObjectMessage m)  (cb (.getObject ^ObjectMessage m))
                                               (instance? BytesMessage m) (let [data (byte-array (.getBodyLength ^BytesMessage m))]
                                                                            (.readBytes ^BytesMessage m data)
                                                                            (cb data))
                                               :default (println "Unknown message type:" (type m)))))
         ^MessageConsumer consumer (doto
                                     (.createConsumer session (StompJmsDestination. dst))
                                     (.setMessageListener listener))
;         consumer (.createConsumer session (StompJmsDestination. dst))
         ]
     (fn [arg]
       (cond
         (= arg :close) (.close connection)
         :default (println "Invalid operation:" arg))))))

(defn create-kryo-consumer
  ([brkr-uri dst cb]
   (let [kryo (Kryo.)
         in (Input.)
         connection (create-and-start-connection brkr-uri)
         ^Session session (create-session connection)
         listener (proxy [MessageListener] []
                     (onMessage [^Message m] (cond
                                               (instance? ObjectMessage m)  (cb (.getObject ^ObjectMessage m))
                                               (instance? BytesMessage m) (let [data (byte-array (.getBodyLength ^BytesMessage m))]
                                                                            (.readBytes ^BytesMessage m data)
                                                                            (.setBuffer in ^bytes data)
                                                                            (cb (.readObject kryo in ArrayList)))
                                               :default (println "Unknown message type:" (type m)))))
         ^MessageConsumer consumer (doto
                                     (.createConsumer session (StompJmsDestination. dst))
                                     (.setMessageListener listener))
;         consumer (.createConsumer session (StompJmsDestination. dst))
         ]
     (fn [arg]
       (cond
         (= arg :close) (.close connection)
         :default (println "Invalid operation:" arg))))))

(defn create-kryo-lzf-consumer
  ([brkr-uri dst cb]
   (let [kryo (Kryo.)
         in (Input.)
         connection (create-and-start-connection brkr-uri)
         ^Session session (create-session connection)
         listener (proxy [MessageListener] []
                     (onMessage [^Message m] (cond
                                               (instance? ObjectMessage m)  (cb (.getObject ^ObjectMessage m))
                                               (instance? BytesMessage m) (let [data (byte-array (.getBodyLength ^BytesMessage m))]
                                                                            (.readBytes ^BytesMessage m data)
                                                                            (.setBuffer in (LZFDecoder/decode ^bytes data))
                                                                            (cb (.readObject kryo in ArrayList)))
                                               :default (println "Unknown message type:" (type m)))))
         ^MessageConsumer consumer (doto
                                     (.createConsumer session (StompJmsDestination. dst))
                                     (.setMessageListener listener))
;         consumer (.createConsumer session (StompJmsDestination. dst))
         ]
     (fn [arg]
       (cond
         (= arg :close) (.close connection)
         :default (println "Invalid operation:" arg))))))

(defn create-kryo-snappy-consumer
  ([brkr-uri dst cb]
   (let [kryo (Kryo.)
         in (Input.)
         connection (create-and-start-connection brkr-uri)
         ^Session session (create-session connection)
         listener (proxy [MessageListener] []
                     (onMessage [^Message m] (cond
                                               (instance? ObjectMessage m)  (cb (.getObject ^ObjectMessage m))
                                               (instance? BytesMessage m) (let [data (byte-array (.getBodyLength ^BytesMessage m))]
                                                                            (.readBytes ^BytesMessage m data)
                                                                            (.setBuffer in (Snappy/uncompress ^bytes data))
                                                                            (cb (.readObject kryo in ArrayList)))
                                               :default (println "Unknown message type:" (type m)))))
         ^MessageConsumer consumer (doto
                                     (.createConsumer session (StompJmsDestination. dst))
                                     (.setMessageListener listener))
;         consumer (.createConsumer session (StompJmsDestination. dst))
         ]
     (fn [arg]
       (cond
         (= arg :close) (.close connection)
         :default (println "Invalid operation:" arg))))))


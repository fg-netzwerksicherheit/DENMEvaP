;;;
;;;   Copyright 2015, Frankfurt University of Applied Sciences
;;;
;;;   This software is released under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;

(ns clj-activemq-apollo-utils.jms
  ^{:author "Ruediger Gad",
    :doc "Convenience functions for Apache ActiveMQ Apollo JMS specific functionality such as creating connections, destinations etc."}
  (:use clojure.java.io)
  (:import (java.util ArrayList)
           (javax.jms DeliveryMode BytesMessage Message MessageConsumer MessageListener MessageProducer ObjectMessage Session)
           (com.esotericsoftware.kryo Kryo)
           (com.esotericsoftware.kryo.io Input Output)
           (org.xerial.snappy Snappy)
           (com.ning.compress.lzf LZFDecoder LZFEncoder)
           (org.fusesource.stomp.jms StompJmsConnectionFactory StompJmsDestination)))

(def ^:dynamic *kryo-output-size* 2048000)

(defn create-and-start-connection
  "Create and start a JMS connection.
   By default, a StompJmsConnection will be created.
   This can be changed by supplying a different connection factory."
  ([uri]
   (create-and-start-connection uri (StompJmsConnectionFactory.)))
  ([uri factory]
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

(defn create-pooled-arraylist-kryo-producer
  ([server endpoint pool-size]
    (create-pooled-arraylist-kryo-producer
      server endpoint pool-size (fn [^bytes ba] ba)))
  ([server endpoint pool-size ba-out-fn]
    (let [producer (create-producer server endpoint)
          pool (ArrayList. (+ pool-size 1))
          out (Output. *kryo-output-size*)
          kryo (Kryo.)]
      (fn [o]
        (cond
          (= :close o) (producer :close)
          :default (do
                     (.add pool o)
                     (when (>= (.size pool) pool-size)
                       (let [obj (.writeObject kryo out pool)
                             ^bytes b-array (ba-out-fn (.toBytes out))]
                         (producer b-array)
                         (.clear out)
                         (.clear pool)))))))))

(defn create-pooled-arraylist-kryo-lzf-producer [server endpoint pool-size]
  (create-pooled-arraylist-kryo-producer
    server endpoint pool-size (fn [^bytes ba] (LZFEncoder/encode ba))))

(defn create-pooled-arraylist-kryo-snappy-producer [server endpoint pool-size]
  (create-pooled-arraylist-kryo-producer
    server endpoint pool-size (fn [^bytes ba] (Snappy/compress ba))))

(defn create-consumer
  [brkr-uri dst cb]
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
                                     (.setMessageListener listener))]
     (fn [arg]
       (cond
         (= arg :close) (.close connection)
         :default (println "Invalid operation:" arg)))))

(defn create-kryo-consumer
  ([brkr-uri dst cb]
   (create-kryo-consumer
     brkr-uri dst cb (fn [^bytes ba] ba)))
  ([brkr-uri dst cb ba-in-fn]
   (let [kryo (Kryo.)
         in (Input.)
         connection (create-and-start-connection brkr-uri)
         ^Session session (create-session connection)
         listener (proxy [MessageListener] []
                     (onMessage [^Message m] (cond
                                               (instance? ObjectMessage m)  (cb (.getObject ^ObjectMessage m))
                                               (instance? BytesMessage m) (let [data (byte-array (.getBodyLength ^BytesMessage m))]
                                                                            (.readBytes ^BytesMessage m data)
                                                                            (.setBuffer in ^bytes (ba-in-fn data))
                                                                            (cb (.readObject kryo in ArrayList)))
                                               :default (println "Unknown message type:" (type m)))))
         ^MessageConsumer consumer (doto
                                     (.createConsumer session (StompJmsDestination. dst))
                                     (.setMessageListener listener))]
     (fn [arg]
       (cond
         (= arg :close) (.close connection)
         :default (println "Invalid operation:" arg))))))

(defn create-kryo-lzf-consumer [brkr-uri dst cb]
  (create-kryo-consumer
    brkr-uri dst cb (fn [^bytes ba] (LZFDecoder/decode ba))))

(defn create-kryo-snappy-consumer [brkr-uri dst cb]
  (create-kryo-consumer
    brkr-uri dst cb (fn [^bytes ba] (Snappy/uncompress ba))))


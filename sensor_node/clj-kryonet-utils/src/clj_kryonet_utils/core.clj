;;;
;;;   Copyright 2015, Frankfurt University of Applied Sciences
;;;
;;;   This software is released under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;

(ns clj-kryonet-utils.core
  (:import (com.esotericsoftware.kryonet Connection Client EndPoint Listener Server)
           (java.util ArrayList)))

(def ^:dynamic *timeout* 2000)

(defn start-server
  [port]
  (doto (Server.) (.start) (.bind port port)))

(defn add-listener
  [server f]
  (let [listener (proxy [Listener] []
                   (received [conn obj]
                     (f conn obj)))]
    (.addListener server listener)))

(defn send-tcp
  [^Connection conn data]
  (.sendTCP conn data))

(defn send-udp
  [^Connection conn data]
  (.sendUDP conn data))

(defn start-client
  [uri port]
  (let [client (doto (Client. (int (Math/pow 2 18)) (int (Math/pow 2 18))) (.start) (.connect *timeout* uri port port) (.setKeepAliveUDP *timeout*))]
    (doto (Thread. #(.update client *timeout*)) (.start))
    client))

(defn register
  [endpoint & objects]
  (doseq [obj objects]
    (doto (.getKryo endpoint) (.register (type obj)))))

(defn prefer-ipv4
  []
  (System/setProperty "java.net.preferIPv4Stack" "true"))

(defn create-pooled-arraylist-producer [client pool-size send-fn]
  (let [pool (ArrayList. (* pool-size 2))]
    (fn [o]
      (cond
        (= :close o) (do 
                       (println "Stopping the kryonet client.")
                       (.stop client))
        :default (do
                   (.add pool o)
                   (when (>= (.size pool) pool-size)
                    (send-fn client pool)
                    (.clear pool)))))))


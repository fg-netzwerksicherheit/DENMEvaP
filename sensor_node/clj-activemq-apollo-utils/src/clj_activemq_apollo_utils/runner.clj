;;;
;;;   Copyright 2015, Frankfurt University of Applied Sciences
;;;
;;;   This software is released under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;

(ns clj-activemq-apollo-utils.runner
  ^{:author "Ruediger Gad",
    :doc "Utility functions for running the Apache ActiveMQ Apollo broker embedded."}
  (:use clojure.java.io)
  (:import (java.util.concurrent CountDownLatch)
           (org.apache.activemq.apollo.broker Broker)
           (org.apache.activemq.apollo.broker.store.leveldb.dto LevelDBStoreDTO)
           (org.apache.activemq.apollo.dto AcceptingConnectorDTO BrokerDTO QueueSettingsDTO TopicDTO VirtualHostDTO WebAdminDTO)))

(defn create-broker-config
  "Create a broker config in form of a BrokerDTO instance.
   Right now, just a simple default config is created."
  ([]
   (let [brkr-dto (BrokerDTO.)
         vhost-dto (VirtualHostDTO.)
         _ (set! (. vhost-dto id) "localhost")
         _ (.. vhost-dto host_names (add "localhost"))
         _ (.. vhost-dto host_names (add "127.0.0.1"))
         _ (.. vhost-dto host_names (add "foo-stomp"))
         _ (set! (. vhost-dto auto_create_destinations) true)
         topic-dto (TopicDTO.)
         _ (set! (. topic-dto id) "sniffer.header.parsed")
         _ (set! (. topic-dto slow_consumer_policy) "queue")
         queue-settings-dto (QueueSettingsDTO.)
         _ (set! (. queue-settings-dto persistent) false)
         _ (set! (. queue-settings-dto full_policy) "drop head")
         _ (set! (. topic-dto subscription) queue-settings-dto)
         _ (.add (. vhost-dto topics) topic-dto)
         lvl-db-store (LevelDBStoreDTO.)
         _ (set! (. lvl-db-store directory) (file "./data"))
         _ (set! (. vhost-dto store) lvl-db-store)
         _ (.. brkr-dto virtual_hosts (add vhost-dto))
         accepting-connector-dto (AcceptingConnectorDTO.)
         _ (set! (. accepting-connector-dto id) "tcp")
         _ (set! (. accepting-connector-dto bind) "tcp://127.0.0.1:61613")
         _ (set! (. accepting-connector-dto connection_limit) (int 1024))
         _ (.. brkr-dto connectors (add accepting-connector-dto))
;         accepting-connector-dto-udp (AcceptingConnectorDTO.)
;         _ (set! (. accepting-connector-dto-udp id) "stomp-udp")
;         _ (set! (. accepting-connector-dto-udp bind) "udp://[::]:61613")
;         _ (set! (. accepting-connector-dto-udp connection_limit) (int 1024))
;         _ (.. brkr-dto connectors (add accepting-connector-dto-udp))
         web-adm-dto (WebAdminDTO.)
         _ (set! (. web-adm-dto bind) "http://127.0.0.1:8080")
         _ (.. brkr-dto web_admins (add web-adm-dto))]
     brkr-dto)))

(defn create-broker
  "Create a broker from a given BrokerDTO configuration instance.
   Right now, the tmp directory is hard coded to \"./tmp\"."
  [brkr-cfg]
  (let [brkr (doto (Broker.)
               (.setTmp (file "./tmp"))
               (.setConfig brkr-cfg))]
   brkr))

(defn start-broker
  "Start the given broker.
   This function waits until the broker had been started.
   Optionally, an additional function can be supplied.
   That function will be called after the broker had started."
  ([brkr]
   (start-broker brkr #(println "Broker started.")))
  ([brkr f]
   (let [latch (CountDownLatch. 1)]
     (.start brkr #(do (.countDown latch) (f)))
     (.await latch))))

(defn stop-broker
  "Stop the given broker.
   This function waits until the broker was stopped.
   Optionally, an additional function can be supplied.
   That function will be called after the broker stopped."
  ([brkr]
   (stop-broker brkr #(println "Broker stopped.")))
  ([brkr f]
   (let [latch (CountDownLatch. 1)]
     (.stop brkr #(do (.countDown latch) (f)))
     (.await latch))))

(defn create-and-start-broker
  "Convenience function that creates and starts a broker.
   Right now, only a broker with default settings is created."
  ([]
   (let [brkr (create-broker (create-broker-config))]
     (start-broker brkr #(println "Broker started with default config."))
     brkr)))


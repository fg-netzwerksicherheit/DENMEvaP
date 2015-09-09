;;;
;;;   Copyright 2015, Frankfurt University of Applied Sciences
;;;
;;;   This software is released under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;

(ns clj-activemq-apollo-utils.jms-tests
  ^{:author "Ruediger Gad",
    :doc "Tests for JMS specific functionality such as creating connections, destinations etc."}
  (:use clojure.test
        clj-assorted-utils.util
        clj-activemq-apollo-utils.jms
        clj-activemq-apollo-utils.runner)
  (:import (javax.jms Connection DeliveryMode MessageListener Session Topic)
           (org.apache.activemq.apollo.broker Broker)
           (org.fusesource.stomp.jms StompJmsConnection StompJmsConnectionFactory StompJmsSession)))

(defn start-stop-broker-fixture [f]
  (let [brkr (create-and-start-broker)]
    (f)
    (stop-broker brkr)))
(use-fixtures :each start-stop-broker-fixture)

(deftest create-and-start-connection-test
  (let [conn (create-and-start-connection "tcp://127.0.0.1:61613" (StompJmsConnectionFactory.))]
    (is (= StompJmsConnection (type conn)))
    (.close conn)))

(deftest create-and-start-connection-test-stomp-default
  (let [conn (create-and-start-connection "tcp://127.0.0.1:61613")]
    (is (= StompJmsConnection (type conn)))
    (.close conn)))

(deftest create-session-test
  (let [conn (create-and-start-connection "tcp://127.0.0.1:61613")
        session (create-session conn)]
    (is (= StompJmsSession (type session)))))

(deftest create-producer-test
  (let [producer (create-producer "tcp://127.0.0.1:61613" "/topic/foo")]
    (is (fn? producer))
    (producer :close)))

(deftest create-consumer-test
  (let [cb-fn (fn [msg])
        consumer (create-consumer "tcp://127.0.0.1:61613" "/topic/foo" cb-fn)]
    (consumer :close)))

(deftest create-consumer-test
  (let [data-received (prepare-flag)
        cb-fn (fn [_] (set-flag data-received))
        consumer (create-consumer "tcp://127.0.0.1:61613" "/topic/foo.bar" cb-fn)
        producer (create-producer "tcp://127.0.0.1:61613" "/topic/foo.bar")]
    (producer "blub")
    (await-flag data-received)
    (is (flag-set? data-received))
    (consumer :close)))


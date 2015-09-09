;;;
;;;   Copyright 2015, Frankfurt University of Applied Sciences
;;;
;;;   This software is released under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;

(ns clj-activemq-apollo-utils.runner-tests
  ^{:author "Ruediger Gad",
    :doc "Tests for running the ActiveMQ Apollo broker embedded."}
  (:use clojure.test
        clj-assorted-utils.util
        clj-activemq-apollo-utils.runner)
  (:import (org.apache.activemq.apollo.broker Broker)
           (org.apache.activemq.apollo.dto BrokerDTO)))

(deftest create-default-broker-config-test
  (let [brkr-cfg (create-broker-config)]
    (is (not (nil? brkr-cfg)))
    (is (= BrokerDTO (type brkr-cfg)))))

(deftest create-broker-test
  (let [brkr (create-broker (create-broker-config))]
    (is (not (nil? brkr)))
    (is Broker (type brkr))))

(deftest start-stop-broker-test
  (let [brkr (create-broker (create-broker-config))
        _ (start-broker brkr)]
    (is Broker (type brkr))
    (stop-broker brkr)))

(deftest create-and-start-stop-broker-test
  (let [brkr (create-and-start-broker)]
    (is Broker (type brkr))
    (stop-broker brkr)))


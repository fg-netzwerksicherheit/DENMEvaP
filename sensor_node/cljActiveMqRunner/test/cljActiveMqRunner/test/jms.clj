;;;
;;;   Copyright 2015, Frankfurt University of Applied Sciences
;;;
;;;   This software is released under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;

(ns 
  ^{:author "Ruediger Gad",
    :doc "Tests for JMS interaction"}  
  cljActiveMqRunner.test.jms
  (:use clojure.test
        clj-assorted-utils.util
        cljActiveMqRunner.jms))

(def local-jms-server "tcp://localhost:61616")
(def test-topic "topic:/testtopic")
(def test-delay 200)

(defn jms-broker-fixture [f]
  (let [broker (start-broker local-jms-server)]
    (f)
    (.stop broker)))

(use-fixtures :each jms-broker-fixture)

(deftest test-fixture
  (is true))

(deftest test-create-topic
  (let [topic (create-producer local-jms-server test-topic)]
    (is (not (nil? topic)))))

(deftest producer-consumer
  (let [producer (create-producer local-jms-server test-topic)
        was-run (prepare-flag)
        consume-fn (fn [_] (set-flag was-run))
        consumer (create-consumer local-jms-server test-topic consume-fn)]
    (is (not (nil? producer)))
    (is (not (nil? consumer)))
    (producer "¡Hola!")
    (Thread/sleep test-delay)
    (is (flag-set? was-run))
    (close producer)
    (close consumer)))

(deftest send-list
  (let [producer (create-producer local-jms-server test-topic)
        received (ref '())    
        consume-fn (fn [obj] (dosync (ref-set received obj)))
        consumer (create-consumer local-jms-server test-topic consume-fn)
        data '(:a :b :c)]
    (is (not= data @received))
    (producer data)
    (Thread/sleep test-delay)
    (is (= data @received))))


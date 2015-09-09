;;;
;;;   Copyright 2015, Frankfurt University of Applied Sciences
;;;
;;;   This software is released under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;

(ns clj-kryonet-utils.core-test
  (:use clojure.test
        clj-kryonet-utils.core)
  (:import (com.esotericsoftware.kryonet Connection Client Server)
           (java.util ArrayList HashMap)
           (java.util.concurrent CountDownLatch)))

(def port 12345)
(def uri "127.0.0.1")

(prefer-ipv4)

(deftest start-server-test
  (let [srvr (start-server port)]
    (is (= Server (type srvr)))
    (.stop srvr)))

(deftest add-listener-fn-test
  (let [srvr (start-server port)]
    (add-listener srvr (fn [_ _]))
    (.stop srvr)))

(deftest create-client-test
  (let [srvr (start-server port)
        clnt (start-client uri port)]
    (is (= Client (type clnt)))
    (.stop clnt)
    (.stop srvr)))

(deftest register-class-test
  (let [srvr (start-server port)]
    (register srvr [])
    (.stop srvr)))

(deftest send-to-server-via-tcp-test
  (let [srvr (start-server port)
        latch (CountDownLatch. 1)
        rcvd  (ref "")
        _ (add-listener srvr (fn [_ o]
                               (when (= (type "a") (type o))
                                 (dosync
                                   (ref-set rcvd o))
                                 (.countDown latch))))
        clnt (start-client uri port)]
    (send-tcp clnt "foo")
    (.await latch)
    (is (= "foo" @rcvd))
    (.stop clnt)
    (.stop srvr)))

(deftest send-to-server-via-udp-test
  (let [srvr (start-server port)
        latch (CountDownLatch. 1)
        rcvd  (ref "")
        _ (add-listener srvr (fn [_ o]
                               (when (= (type "a") (type o))
                                 (dosync
                                   (ref-set rcvd o))
                                 (.countDown latch))))
        clnt (start-client uri port)]
    (send-udp clnt "foo")
    (.await latch)
    (is (= "foo" @rcvd))
    (.stop clnt)
    (.stop srvr)))

(deftest send-map-to-server-via-udp-test
  (let [srvr (start-server port)
        latch (CountDownLatch. 1)
        rcvd  (ref "")
        _ (add-listener srvr (fn [_ o]
                               (when (= HashMap (type o))
                                 (dosync
                                   (ref-set rcvd o))
                                 (.countDown latch))))
        clnt (start-client uri port)
        _ (register srvr (HashMap.))
        _ (register clnt (HashMap.))]
    (send-udp clnt (HashMap. {"foo" "bar"}))
    (.await latch)
    (is (= (HashMap. {"foo" "bar"}) @rcvd))
    (.stop clnt)
    (.stop srvr)))

(deftest send-mixed-value-map-to-server-via-udp-test
  (let [srvr (start-server port)
        latch (CountDownLatch. 1)
        rcvd  (ref "")
        _ (add-listener srvr (fn [_ o]
                               (when (= HashMap (type o))
                                 (dosync
                                   (ref-set rcvd o))
                                 (.countDown latch))))
        clnt (start-client uri port)
        _ (register srvr (HashMap.))
        _ (register clnt (HashMap.))]
    (send-udp clnt (HashMap. {"foo" "bar" "blah" 42}))
    (.await latch)
    (is (= (HashMap. {"foo" "bar" "blah" 42}) @rcvd))
    (.stop clnt)
    (.stop srvr)))

(deftest send-arraylist-to-server-via-udp-test
  (let [srvr (start-server port)
        latch (CountDownLatch. 1)
        rcvd  (ref [])
        _ (add-listener srvr (fn [_ o]
                               (when (= ArrayList (type o))
                                 (dosync
                                   (ref-set rcvd o))
                                 (.countDown latch))))
        clnt (start-client uri port)
        _ (register srvr (ArrayList.))
        _ (register clnt (ArrayList.))]
    (send-udp clnt (ArrayList. ["fooaabb"]))
    (.await latch)
    (is (= (ArrayList. ["fooaabb"]) @rcvd))
    (.stop clnt)
    (.stop srvr)))

(deftest pooled-arraylist-producer-via-udp-test
  (let [srvr (start-server port)
        latch (CountDownLatch. 1)
        rcvd  (ref [])
        _ (add-listener srvr (fn [_ o]
                               (when (= ArrayList (type o))
                                 (dosync
                                   (ref-set rcvd o))
                                 (.countDown latch))))
        client (start-client uri port)
        producer (create-pooled-arraylist-producer client 4 send-udp)
        _ (register srvr (ArrayList.))
        _ (register client (ArrayList.))]
    (producer "a")
    (producer "b")
    (producer "c")
    (producer "d")
    (.await latch)
    (is (= (ArrayList. ["a" "b" "c" "d"]) @rcvd))
    (producer :close)
    (.stop srvr)))


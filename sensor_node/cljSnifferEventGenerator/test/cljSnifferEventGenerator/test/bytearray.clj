;;;
;;;   Copyright 2015, Frankfurt University of Applied Sciences
;;;
;;;   This software is released under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;

(ns 
  ^{:author "Ruediger Gad",
    :doc "Tests for ByteArray helper."}
  cljSnifferEventGenerator.test.bytearray
  (:use clojure.test
        clj-assorted-utils.util
        cljSnifferEventGenerator.packet
        cljSnifferEventGenerator.test.packet-data
        clj-net-pcap.core
        clj-net-pcap.pcap-data)
  (:import (cljSnifferEventGenerator ByteArrayHelper)
           (java.nio ByteBuffer)))

(deftest simple-get-int-test
  (let [data (.array (doto (ByteBuffer/allocate 4) (.putInt 42) (.flip)))]
    (is (= 42 (ByteArrayHelper/getInt data 0)))))

(deftest simple-get-long-test
  (let [data (.array (doto (ByteBuffer/allocate 8) (.putLong 1) (.flip)))]
    (is (= 1 (ByteArrayHelper/getLong data 0)))))

(deftest simple-get-int-test2
  (let [data (.array (doto (ByteBuffer/allocate 4) (.putInt 4096) (.flip)))]
    (is (= 4096 (ByteArrayHelper/getInt data 0)))))

(deftest simple-get-long-test2
  (let [data (.array (doto (ByteBuffer/allocate 8) (.putLong 4096) (.flip)))]
    (is (= 4096 (ByteArrayHelper/getLong data 0)))))

(deftest simple-get-int-test3
  (let [data (.array (doto (ByteBuffer/allocate 4) (.putInt 1701) (.flip)))]
    (is (= 1701 (ByteArrayHelper/getInt data 0)))))

(deftest simple-get-long-test3
  (let [data (.array (doto (ByteBuffer/allocate 8) (.putLong 1701) (.flip)))]
    (is (= 1701 (ByteArrayHelper/getLong data 0)))))

(deftest simple-get-int-test4
  (let [data (.array (doto (ByteBuffer/allocate 4) (.putInt 12345) (.flip)))]
    (is (= 12345 (ByteArrayHelper/getInt data 0)))))

(deftest simple-get-int-test5
  (let [data (.array (doto (ByteBuffer/allocate 4) (.putInt 359) (.flip)))]
    (is (= 359 (ByteArrayHelper/getInt data 0)))))

(deftest simple-get-int-test6
  (let [data (.array (doto (ByteBuffer/allocate 4) (.putInt 1234567) (.flip)))]
    (is (= 1234567 (ByteArrayHelper/getInt data 0)))))


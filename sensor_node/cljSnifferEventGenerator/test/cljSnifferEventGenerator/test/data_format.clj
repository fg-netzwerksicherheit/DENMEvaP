;;;
;;;   Copyright 2015, Frankfurt University of Applied Sciences
;;;
;;;   This software is released under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;

(ns 
  ^{:author "Ruediger Gad",
    :doc "Tests for evaluating the data format."}
  cljSnifferEventGenerator.test.data-format
 (:use
   clojure.test
   clj-assorted-utils.util
   clj-net-pcap.core
   clj-net-pcap.native
   clj-net-pcap.pcap
   clj-net-pcap.pcap-data
   cljSnifferEventGenerator.packet))

(defn process-individual-packets [file-name description]
  (let [handler-fn (fn [p _]
                     (let [parsed-packet (pcap-packet-to-nested-maps p)
                           wirelen (get-in parsed-packet ["PcapHeader" "wirelen"])
                           parsed-packet-ba (object-to-byte-array parsed-packet)
                           parsed-packet-ba-gzip (compress-object-to-byte-array parsed-packet :gzip)
                           packet-header (extract-headers p)
                           packet-header-ba-gzip (compress-object-to-byte-array packet-header :gzip)]
                       (println description
                                wirelen
                                (alength parsed-packet-ba)
                                (alength parsed-packet-ba-gzip)
                                (alength packet-header)
                                (alength packet-header-ba-gzip))))]
    (process-pcap-file file-name handler-fn)))

(defn process-packets-to-vector [file-name description]
  (let [parsed-packet-vector (ref [])
        packet-header-vector (ref [])
        cumulated-wirelen (ref 0)
        cumulated-headerlen (ref 0)
        handler-fn (fn [p _]
                     (let [parsed-packet (pcap-packet-to-nested-maps p)
                           wirelen (get-in parsed-packet ["PcapHeader" "wirelen"])
                           parsed-packet-ba (object-to-byte-array parsed-packet)
                           parsed-packet-ba-gzip (compress-object-to-byte-array parsed-packet :gzip)
                           packet-header (extract-headers p)
                           headerlen (alength packet-header)
                           packet-header-ba-gzip (compress-object-to-byte-array packet-header :gzip)
                           parsed-len (alength (object-to-byte-array @parsed-packet-vector))
                           parsed-gzip-len (alength (compress-object-to-byte-array @parsed-packet-vector :gzip))
                           header-obj-len (alength (object-to-byte-array @packet-header-vector))
                           header-gzip-len (alength (compress-object-to-byte-array @packet-header-vector :gzip))
                           percentage (fn [cnt] (str "(" (float (if (not= @cumulated-wirelen 0) (* (/ cnt @cumulated-wirelen) 100.0) 0)) "%)"))]
                       (when (= 0 (mod (count @parsed-packet-vector) 10))
                         (println 
                           description
                           "count:" (count @parsed-packet-vector)
                           "cumulated-wirelen:" @cumulated-wirelen
                           "parsed:" parsed-len (percentage parsed-len)
                           "parsed-gzip:" parsed-gzip-len (percentage parsed-gzip-len)
                           "cumulated-headerlen:" @cumulated-headerlen
                           "header" header-obj-len (percentage header-obj-len)
                           "header-gzip:" header-gzip-len (percentage header-gzip-len)))
                       (dosync
                         (alter cumulated-wirelen + wirelen)
                         (alter cumulated-headerlen + headerlen)
                         (alter parsed-packet-vector conj parsed-packet)
                         (alter packet-header-vector conj packet-header))))]
    (process-pcap-file file-name handler-fn)))

;(deftest process-short-test-data
;  (process-individual-packets 
;    "test/cljSnifferEventGenerator/test/data/test_data_short_wlan0_2012-02-26.pcap"
;    "process-short-test-data:"))

(deftest process-short-test-data-in-vector
  (process-packets-to-vector
    "test/cljSnifferEventGenerator/test/data/test_data_short_wlan0_2012-02-26.pcap"
    "process-short-test-data-in-vector"))

;(deftest process-short-test-data-2
;  (process-individual-packets 
;    "test/cljSnifferEventGenerator/test/data/test_data_short_wlan0_2012-02-26_2.pcap"
;    "process-short-test-data-2:"))

(deftest process-short-test-data-in-vector-2
  (process-packets-to-vector
    "test/cljSnifferEventGenerator/test/data/test_data_short_wlan0_2012-02-26_2.pcap"
    "process-short-test-data-in-vector-2"))

;(deftest process-short-test-data-3
;  (process-individual-packets 
;    "test/cljSnifferEventGenerator/test/data/test_data_short_wlan0_2012-02-26_3.pcap"
;    "process-short-test-data-3:"))

(deftest process-short-test-data-in-vector-3
  (process-packets-to-vector
    "test/cljSnifferEventGenerator/test/data/test_data_short_wlan0_2012-02-26_3.pcap"
    "process-short-test-data-in-vector-3"))


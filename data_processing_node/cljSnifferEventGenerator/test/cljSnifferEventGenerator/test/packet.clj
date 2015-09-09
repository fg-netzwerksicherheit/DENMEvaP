;;;
;;;   Copyright 2015, Frankfurt University of Applied Sciences
;;;
;;;   This software is released under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;

(ns 
  ^{:author "Ruediger Gad",
    :doc "Tests for dis-/ re-assembling packets and messing with the packet
          data in general."}
  cljSnifferEventGenerator.test.packet
  (:use clojure.test
        clj-assorted-utils.util
        cljSnifferEventGenerator.packet
        cljSnifferEventGenerator.test.packet-data
        clj-net-pcap.core
        clj-net-pcap.pcap-data)
  (:import (org.jnetpcap.protocol.network Icmp)
           (org.jnetpcap.nio JMemory$Type)
           (org.jnetpcap.packet PcapPacket)
           (org.jnetpcap.protocol.tcpip Tcp Tcp$Flag Tcp$Timestamp)))

(deftest pcap-packet-from-byte-array-seq
  (let [data [47 109 47 80 0 0 0 0 49 -45 11 0 0 0 0 0 98 0 0 0 98 0 0 0 6 0 0 0 0 0 0 0 108 109 -104 69 0 0 2 0 2 2 0 0 -58 0 -88 -64 94 69 -62 -83 1 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 15 0 0 0 0 0 0 0 7 16 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 98 0 0 0 98 0 0 0 4 0 0 0 0 0 0 0 1 0 0 0 0 8 0 0 0 0 0 0 14 0 0 0 84 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 2 0 0 0 0 8 0 0 14 0 0 0 20 0 0 0 64 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 12 0 0 0 0 8 0 0 34 0 0 0 8 0 0 0 56 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 8 0 0 42 0 0 0 56 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 4 14 61 -80 -122 116 -34 43 8 120 9 8 0 69 0 0 84 0 0 64 0 64 1 -122 26 -64 -88 0 -58 -83 -62 69 94 8 0 -2 -92 16 -15 0 7 47 109 47 80 0 0 0 0 -65 -46 11 0 0 0 0 0 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55]
        pcap-packet (get-packet-from-seq data)
        icmp (Icmp.)]
    (is (= org.jnetpcap.packet.PcapPacket (type pcap-packet)))
    (is (= (count data) (.getTotalSize pcap-packet)))
    (is (.hasHeader pcap-packet icmp))))

(deftest pcap-packet-from-byte-array-seq-without-payload
;;;
;;; Alright, this is going to be quite nasty. What did we do:
;;; First of all, we removed the "payload" from the ICMP packet.
;;; This is intended as a proof of concept whether we can discard a payload in
;;; general.
;;; The payload had been removed by simply deleting the end of the data list.
;;; Note: apparently the total length of the captured packet data is stored in
;;; the pcap header. Simply deleting data from the packet data yields in an
;;; error when trying to restore the PcapPacket.
;;; In order to successfully restore the PcapPacket we need to change that
;;; length information as well. The length information is stored in "byte" 17.
;;; For more details compare the data list in this test to the data list in the 
;;; above pcap-packet-from-byte-array-seq test.
;;;
  (let [data [47 109 47 80 0 0 0 0 49 -45 11 0 0 0 0 0 58 0 0 0 98 0 0 0 6 0 0 0 0 0 0 0 108 109 -104 69 0 0 2 0 2 2 0 0 -58 0 -88 -64 94 69 -62 -83 1 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 15 0 0 0 0 0 0 0 7 16 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 98 0 0 0 98 0 0 0 4 0 0 0 0 0 0 0 1 0 0 0 0 8 0 0 0 0 0 0 14 0 0 0 84 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 2 0 0 0 0 8 0 0 14 0 0 0 20 0 0 0 64 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 12 0 0 0 0 8 0 0 34 0 0 0 8 0 0 0 56 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 8 0 0 42 0 0 0 56 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 4 14 61 -80 -122 116 -34 43 8 120 9 8 0 69 0 0 84 0 0 64 0 64 1 -122 26 -64 -88 0 -58 -83 -62 69 94 8 0 -2 -92 16 -15 0 7 47 109 47 80 0 0 0 0 -65 -46 11 0 0 0 0 0]
        pcap-packet (get-packet-from-seq data)
        icmp (Icmp.)]
    (is (= org.jnetpcap.packet.PcapPacket (type pcap-packet)))
    (is (= (count data) (.getTotalSize pcap-packet)))
    (is (.hasHeader pcap-packet icmp))))

;;; This test is intendet to assure our packet data is actually consistent.
;;; This should save us from tearing our hair out and searching for errors
;;; while in fact that data itself could be "damaged".
(deftest test-very-large-packet-consistency
  (let [pcap-packet (get-packet-from-seq very-large-packet)
        header (.getCaptureHeader pcap-packet)
        tcp (Tcp.)
        parsed (pcap-packet-to-nested-maps pcap-packet)]
    (is (= 1159 (count very-large-packet)))
    (is (= 791 (.wirelen header)))
    (is (= 1345284830372580000 (.timestampInNanos header)))
    (is (.hasHeader pcap-packet tcp))
    (is (= very-large-packet-parsed parsed))))

;;; This test checks if the wirelen stays the same even if we cut down the 
;;; the indicated length of our caputred data artificially.
;;; More generally, we test if the information gained by parsing the packet
;;; remains the same as well.
;;; Good news everyone: it does stay the same.
(deftest test-very-large-packet-length-manipulation
  (let [pcap-packet (get-packet-from-seq (change-int-in-byte-vector very-large-packet 16 #(- % 20)))
        header (.getCaptureHeader pcap-packet)
        parsed (pcap-packet-to-nested-maps pcap-packet)]
    (is (= 791 (.wirelen header)))
    (is (= very-large-packet-parsed parsed))))

(deftest test-get-overall-header-length
  (let [pcap-packet (get-packet-from-seq very-large-packet)]
    (is (= 66 (get-overall-header-length pcap-packet)))))

(deftest test-get-data-offset
  (let [pcap-packet (get-packet-from-seq very-large-packet)]
    (is (= 368 (get-data-offset pcap-packet)))))

(deftest test-extract-headers
  (let [pcap-packet (get-packet-from-seq very-large-packet)
        headers (extract-headers pcap-packet)]
    ;;; Extract exactly one byte more than the headers we want so we get 
    ;;; jNetPcap to correctly add a "next header" entry in the last header
    ;;; with a header id of 0.
    (is (= 91 (alength headers)))
    (is (= (type (byte-array 0)) (type headers)))))

(deftest test-restore-packet
  (let [pcap-packet (get-packet-from-seq very-large-packet)
        headers (extract-headers pcap-packet)
        restored-packet (restore-packet headers)]
    (is (= org.jnetpcap.packet.PcapPacket (type restored-packet)))
    (is (= very-large-packet-parsed (pcap-packet-to-nested-maps restored-packet)))))

(deftest test-extract-headers-no-tcp-payload
  (let [pcap-packet (get-packet-from-seq tcp-packet-no-payload)
        headers (extract-headers pcap-packet)]
    ;;; Extract exactly one byte more than the headers we want so we get 
    ;;; jNetPcap to correctly add a "next header" entry in the last header
    ;;; with a header id of 0.
    (is (= 90 (alength headers)))
    (is (= (type (byte-array 0)) (type headers)))))

(deftest test-restore-packet-no-tcp-payload
  (let [pcap-packet (get-packet-from-seq tcp-packet-no-payload)
        headers (extract-headers pcap-packet)
        restored-packet (restore-packet headers)]
    (is (= org.jnetpcap.packet.PcapPacket (type restored-packet)))
    (is (= tcp-packet-no-payload-parsed (pcap-packet-to-nested-maps restored-packet)))))

(deftest test-extract-headers-igmp-1
  (let [pcap-packet (get-packet-from-seq igmp-packet-1)
        headers (extract-headers pcap-packet)]))


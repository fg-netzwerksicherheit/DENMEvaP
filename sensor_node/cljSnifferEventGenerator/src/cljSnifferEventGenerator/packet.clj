;;;
;;;   Copyright 2015, Frankfurt University of Applied Sciences
;;;
;;;   This software is released under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;

(ns 
  ^{:author "Ruediger Gad",
    :doc "Utils for processing PcapPackets."}
  cljSnifferEventGenerator.packet
  (:use clj-net-pcap.native)
  (:import (java.util Arrays)
           (org.jnetpcap PcapHeader)
           (org.jnetpcap.nio JBuffer JMemory$Type)
           (org.jnetpcap.packet JPacket$State PcapPacket)
           (org.jnetpcap.protocol JProtocol)))

(defn get-packet-from-seq [data]
  (let [buffer (byte-array (map byte data))
        pcap-packet (PcapPacket. JMemory$Type/POINTER)
        _ (.transferStateAndDataFrom pcap-packet buffer)]
    pcap-packet))

(defn get-overall-header-length [^PcapPacket pcap-packet]
  (let [state (.getState pcap-packet)
        header-count (.getHeaderCount state)
        payload-index (.findHeaderIndex state JProtocol/PAYLOAD_ID)]
    (loop [idx 0 acc 0]
      (if
        (or
          (and (> payload-index 0) (>= idx (dec payload-index)))
          (>= idx (dec header-count)))
        (+ acc (.getHeaderLengthByIndex state idx))
        (recur (inc idx) (+ acc (.getHeaderLengthByIndex state idx)))))))

(defn get-data-offset [^PcapPacket pcap-packet]
  (+
    (JPacket$State/sizeof (.getHeaderCount pcap-packet))
    (PcapHeader/sizeof)))

(defn extract-headers [^PcapPacket pcap-packet]
  (if pcap-packet
    (let [buffer-orig (byte-array (.getTotalSize pcap-packet) (byte 0))
          _ (.transferStateAndDataTo pcap-packet buffer-orig)
          pcap-header-size (PcapHeader/sizeof)
          protocol-header-size (get-overall-header-length pcap-packet)
          ;;; In case there is some payload we make our array one byte bigger 
          ;;; than the headers we want so we get jNetPcap to correctly add a "next 
          ;;; header" entry in the last header with a header id of 0.
          payload-dummy (if (> 
                              (-> (.getState pcap-packet) (.findHeaderIndex JProtocol/PAYLOAD_ID))
                              0)
                          1
                          0)
          buffer (byte-array (+ pcap-header-size protocol-header-size payload-dummy) (byte 0))
          _ (-> (.getCaptureHeader pcap-packet) (.hdr-len protocol-header-size))
          _ (System/arraycopy buffer-orig 0 buffer 0 pcap-header-size)
          _ (System/arraycopy buffer-orig (get-data-offset pcap-packet) buffer pcap-header-size protocol-header-size)]
      buffer)))

;;; Note to self: a possible optimization here would be to not create new instances of
;;; PcapHeader and PcapPacket by using a closure.
(defn restore-packet [data]
  (let [pcap-header-size (PcapHeader/sizeof)
        pcap-header-buffer (JBuffer. (Arrays/copyOf data pcap-header-size))
        protocol-data-buffer (JBuffer. (Arrays/copyOfRange data pcap-header-size (alength data)))
        pcap-header (PcapHeader.)
        _ (.peer pcap-header pcap-header-buffer 0)
        pcap-packet (PcapPacket. JMemory$Type/POINTER)
        _ (.transferHeaderAndDataFrom pcap-packet pcap-header protocol-data-buffer)
        ;;; For now on we hardcode the id of the first header found in the packet to 1.
        _ (.scan pcap-packet 1)]
    pcap-packet))


;;;
;;;   Copyright 2015, Frankfurt University of Applied Sciences
;;;
;;;   This software is released under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;

(ns 
  ^{:author "Ruediger Gad",
    :doc "Adapter class to enable usage from Java."} 
  cljSnifferEventGenerator.JavaTools
  (:import (java.util HashMap Map))
  (:gen-class
    :methods [#^{:static true} [getNestedMapSample [] java.util.Map]
              #^{:static true} [getFlatMapSample [] java.util.Map]]))

(def packet-with-all-fields
   {"PcapHeader" {"timestampInNanos" 1328637777385632000, "wirelen" 74},
    "Arp" {"index" 1, "operationDescription" "REQUEST", "next" 0,
           "targetMac" "00:00:00:00:00:00", "targetIp" "192.168.20.120",
           "sourceMac" "90:E6:BA:3C:9A:B4", "sourceIp" "192.168.20.134"},
    "DataLinkLayer" {"index" 0, "ProtocolType" "Ethernet",
                     "destination" "00:0F:CD:55:82:0A", "source" "E8:9D:87:B1:45:2F", "next" 2},
    "NetworkLayer" {"index" 1, "ProtocolType" "Ip4",
                    "destination" "173.194.34.235", "source" "10.141.155.38",
                    "id" 52116, "tos" 0, "ttl" 64, "next" 4},
    "Icmp" {"index" 2, "typeDescription" "echo reply", "next" 0},
    "Tcp" {"index" 2, 
           "destination" 80, "source" 57160, "ack" 0, "seq" 944024458,
           "flags" #{"SYN"}, "tsval" 85811230}
    "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}
    "Http" {"index" 3, "RequestUrl" "/ga.js", 
            "Referer" "http://esper.codehaus.org/esper-4.5.0/doc/reference/en/html/functionreference.html",
            "RequestMethod" "GET", "RequestVersion" "HTTP/1.1"}}
  )

(def packet-with-all-fields-flat
  (doto (HashMap.)
    (.put "ts" 123)
    (.put "len" 123)
    (.put "ethSrc" "abc")
    (.put "ethDst" "abc")
    (.put "arpOpDesc" "abc")
    (.put "arpTargetMac" "abc")
    (.put "arpTargetIp" "abc")
    (.put "arpSourceMac" "abc")
    (.put "arpSourceIp" "abc")
    (.put "ipSrc" "abc")
    (.put "ipDst" "abc")
    (.put "ipVer" 4)
    (.put "ipId" 123)
    (.put "ipTtl" 123)
    (.put "ipChecksum" 123)
    (.put "icmpEchoSeq" 123)
    (.put "icmpType" "abc")
    (.put "tcpSrc" 123)
    (.put "tcpDst" 123)
    (.put "tcpAck" 123)
    (.put "tcpSeq" 123)
    (.put "tcpFlags" 123)
    (.put "tcpTsval" 123)
    (.put "tcpTsecr" 123)
    (.put "udpDst" 123)
    (.put "udpSrc" 123)
    ))

(defn -getNestedMapSample
  []
  packet-with-all-fields)

(defn -getFlatMapSample
  []
  packet-with-all-fields-flat)


;;;
;;;   Copyright 2015, Frankfurt University of Applied Sciences
;;;
;;;   This software is released under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;

(ns 
  ^{:author "Ruediger Gad",
    :doc "Tests data."}
  cljSnifferEventGenerator.test.packet-data
  )

(def very-large-packet 
  [-34 106 47 80 0 0 0 0 100 -81 5 0 0 0 0 0 23 3 0 0 23 3 0 0 22 0 0 0 0 0 0 0 -47 102 -43 -98 1 0 3 0 2 2 4 0 -4 -74 125 94 -58 0 -88 -64 6 0 0 0 6 0 0 0 9 26 0 0 -11 -54 0 0 -58 0 -88 -64 -4 -74 125 94 6 0 0 0 6 0 0 0 -11 -54 0 0 9 26 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 28 0 0 0 0 0 0 0 23 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 23 3 0 0 23 3 0 0 4 0 0 0 0 0 0 0 1 0 0 0 0 8 0 0 0 0 0 0 14 0 0 0 9 3 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 2 0 0 0 0 8 0 0 14 0 0 0 20 0 0 0 -11 2 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 4 0 0 0 0 8 0 0 34 0 0 0 32 0 0 0 -43 2 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 8 0 0 66 0 0 0 -43 2 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 116 -34 43 8 120 9 0 4 14 61 -80 -122 8 0 69 0 3 9 40 -40 64 0 53 6 67 47 94 125 -74 -4 -64 -88 0 -58 26 9 -54 -11 -100 104 -75 93 -18 111 82 26 -128 24 0 91 -110 -70 0 0 1 1 8 10 -49 21 -21 27 0 35 35 -100 98 105 108 101 32 103 103 111 101 98 101 108 32 72 13 10 58 97 100 97 109 115 46 102 114 101 101 110 111 100 101 46 110 101 116 32 51 53 52 32 114 99 103 32 49 53 50 32 35 110 101 109 111 109 111 98 105 108 101 32 119 48 48 116 32 72 13 10 58 97 100 97 109 115 46 102 114 101 101 110 111 100 101 46 110 101 116 32 51 53 52 32 114 99 103 32 49 53 50 32 35 110 101 109 111 109 111 98 105 108 101 32 115 112 101 99 105 97 108 32 72 13 10 58 97 100 97 109 115 46 102 114 101 101 110 111 100 101 46 110 101 116 32 51 53 52 32 114 99 103 32 49 53 50 32 35 110 101 109 111 109 111 98 105 108 101 32 105 101 107 107 117 32 72 13 10 58 97 100 97 109 115 46 102 114 101 101 110 111 100 101 46 110 101 116 32 51 53 52 32 114 99 103 32 49 53 50 32 35 110 101 109 111 109 111 98 105 108 101 32 115 97 117 110 97 98 97 100 32 72 13 10 58 97 100 97 109 115 46 102 114 101 101 110 111 100 101 46 110 101 116 32 51 53 52 32 114 99 103 32 49 53 50 32 35 110 101 109 111 109 111 98 105 108 101 32 116 97 110 117 107 32 72 13 10 58 97 100 97 109 115 46 102 114 101 101 110 111 100 101 46 110 101 116 32 51 53 52 32 114 99 103 32 49 53 50 32 35 110 101 109 111 109 111 98 105 108 101 32 107 105 109 106 117 32 71 13 10 58 97 100 97 109 115 46 102 114 101 101 110 111 100 101 46 110 101 116 32 51 53 52 32 114 99 103 32 49 53 50 32 35 110 101 109 111 109 111 98 105 108 101 32 77 105 114 118 32 72 13 10 58 97 100 97 109 115 46 102 114 101 101 110 111 100 101 46 110 101 116 32 51 53 52 32 114 99 103 32 49 53 50 32 35 110 101 109 111 109 111 98 105 108 101 32 97 108 116 101 114 101 103 111 32 72 13 10 58 97 100 97 109 115 46 102 114 101 101 110 111 100 101 46 110 101 116 32 51 53 52 32 114 99 103 32 49 53 50 32 35 110 101 109 111 109 111 98 105 108 101 32 116 101 118 101 32 72 13 10 58 97 100 97 109 115 46 102 114 101 101 110 111 100 101 46 110 101 116 32 51 53 52 32 114 99 103 32 49 53 50 32 35 110 101 109 111 109 111 98 105 108 101 32 95 109 111 103 117 114 105 115 111 32 72 13 10 58 97 100 97 109 115 46 102 114 101 101 110 111 100 101 46 110 101 116 32 51 53 52 32 114 99 103 32 49 53 50 32 35 110 101 109 111 109 111 98 105 108 101 32 116 104 101 45 98 111 115 115 32 72 13 10 58 97 100 97 109 115 46 102 114 101 101 110 111 100 101 46 110 101 116 32 51 53 52 32 114 99 103 32 49 53 50 32 35 110 101 109 111 109 111 98 105 108 101 32 80 97 105 109 101 110 32 72 13 10 58 97 100 97 109 115 46 102 114 101 101 110 111 100 101 46 110 101 116 32 51 49 53 32 114 99 103 32 35 110 101 109 111 109 111 98 105 108 101 32 58 69 110 100 32 111 102 32 47 87 72 79 32 108 105 115 116 46 13 10])

(def very-large-packet-parsed
  {"PcapHeader" {"timestampInNanos" 1345284830372580000, "wirelen" 791},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "74:DE:2B:08:78:09",
  "source" "00:04:0E:3D:B0:86",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.0.198",
  "source" "94.125.182.252",
  "id" 10456,
  "tos" 0,
  "ttl" 53,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 51957,
  "source" 6665,
  "ack" 4000272922,
  "seq" 2624107869,
  "flags" #{"PSH" "ACK"},
  "next" 0}})

(def tcp-packet-no-payload
  [-29 106 47 80 0 0 0 0 36 50 0 0 0 0 0 0 66 0 0 0 66 0 0 0 22 0 0 0 0 0 0 0 -47 102 -43 -98 1 0 3 0 2 2 4 0 -58 0 -88 -64 -4 -74 125 94 6 0 0 0 6 0 0 0 -11 -54 0 0 9 26 0 0 -4 -74 125 94 -58 0 -88 -64 6 0 0 0 6 0 0 0 9 26 0 0 -11 -54 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 33 0 0 0 0 0 0 0 22 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 66 0 0 0 66 0 0 0 3 0 0 0 0 0 0 0 1 0 0 0 0 8 0 0 0 0 0 0 14 0 0 0 52 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 2 0 0 0 0 8 0 0 14 0 0 0 20 0 0 0 32 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 4 0 0 0 0 8 0 0 34 0 0 0 32 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 4 14 61 -80 -122 116 -34 43 8 120 9 8 0 69 0 0 52 -31 -87 64 0 64 6 -126 50 -64 -88 0 -58 94 125 -74 -4 -54 -11 26 9 -18 111 82 52 -100 104 -72 116 -128 16 1 96 -41 14 0 0 1 1 8 10 0 35 53 -3 -49 21 -17 -92])

(def tcp-packet-no-payload-parsed
  {"PcapHeader" {"timestampInNanos" 1345284835012836000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "00:04:0E:3D:B0:86",
  "source" "74:DE:2B:08:78:09",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "94.125.182.252",
  "source" "192.168.0.198",
  "id" 57769,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6665,
  "source" 51957,
  "ack" 2624108660,
  "seq" 4000272948,
  "flags" #{"ACK"}}})

(def igmp-packet-1
  [82 84 47 80 0 0 0 0 -11 -35 4 0 0 0 0 0 50 0 0 0 50 0 0 0 6 0 0 0 0 0 0 0 -82 32 0 0 0 0 2 0 2 2 0 0 1 0 -88 -64 1 0 0 -32 2 0 0 0 2 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 7 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 50 0 0 0 50 0 0 0 3 0 0 0 0 0 0 0 1 0 0 0 0 8 0 0 0 0 0 0 14 0 0 0 36 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 2 0 0 0 0 8 0 0 14 0 0 0 24 0 0 0 12 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 8 0 0 38 0 0 0 12 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 94 0 0 1 0 4 14 61 -80 -122 8 0 70 -64 0 36 9 -21 64 0 1 2 57 126 -64 -88 0 1 -32 0 0 1 -108 4 0 0 17 100 -20 30 0 0 0 0 2 125 0 0])

(def igmp-packet-1-parsed
  {"PcapHeader" {"timestampInNanos" 1345279058318965000, "wirelen" 50},
   "DataLinkLayer"
   {"index" 0,
      "ProtocolType" "Ethernet",
      "destination" "01:00:5E:00:00:01",
      "source" "00:04:0E:3D:B0:86",
      "next" 2},
   "NetworkLayer"
   {"index" 1,
      "ProtocolType" "Ip4",
      "destination" "224.0.0.1",
      "source" "192.168.0.1",
      "id" 2539,
      "tos" 192,
      "ttl" 1,
      "next" 0}})

(def igmp-packet-2
  [84 84 47 80 0 0 0 0 -96 122 2 0 0 0 0 0 46 0 0 0 46 0 0 0 6 0 0 0 0 0 0 0 -82 32 71 0 0 0 2 0 2 2 0 0 -68 0 -88 -64 -5 0 0 -32 2 0 0 0 2 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 7 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 46 0 0 0 46 0 0 0 3 0 0 0 0 0 0 0 1 0 0 0 0 8 0 0 0 0 0 0 14 0 0 0 32 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 2 0 0 0 0 8 0 0 14 0 0 0 24 0 0 0 8 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 8 0 0 38 0 0 0 8 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 94 0 0 -5 -44 -102 32 119 79 -30 8 0 70 0 0 32 105 -78 0 0 1 2 24 -58 -64 -88 0 -68 -32 0 0 -5 -108 4 0 0 22 0 9 4 -32 0 0 -5])

(def igmp-packet-2-parsed
  {"PcapHeader" {"timestampInNanos" 1345279060162464000, "wirelen" 46},
   "DataLinkLayer"
   {"index" 0,
      "ProtocolType" "Ethernet",
      "destination" "01:00:5E:00:00:FB",
      "source" "D4:9A:20:77:4F:E2",
      "next" 2},
   "NetworkLayer"
   {"index" 1,
      "ProtocolType" "Ip4",
      "destination" "224.0.0.251",
      "source" "192.168.0.188",
      "id" 27058,
      "tos" 0,
      "ttl" 1,
      "next" 0}})


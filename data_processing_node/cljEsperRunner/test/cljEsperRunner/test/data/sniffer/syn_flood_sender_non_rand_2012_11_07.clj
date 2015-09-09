;;;
;;;   
;;;   Copyright (C) 2015, Frankfurt University of Applied Sciences
;;;
;;;   This program is free software; you can redistribute it and/or modify it under the terms of the
;;;   GNU General Public License as published by the Free Software Foundation; either version 2 of the License,
;;;   or (at your option) any later version.
;;;
;;;   This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
;;;   without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
;;;   See the GNU General Public License for more details.
;;;
;;;   You should have received a copy of the GNU General Public License along with this program;
;;;   if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
;;;
;;;
;;;   Linking this library statically or dynamically with other modules is making a combined work based on this library.
;;;   Thus, the terms and conditions of the GNU General Public License cover the whole combination.
;;;
;;;   As a special exception, the copyright holders of this library give you permission to link this library with
;;;   independent modules to produce an executable, regardless of the license terms of these independent modules,
;;;   and to copy and distribute the resulting executable under terms of your choice, provided that you also meet,
;;;   for each linked independent module, the terms and conditions of the license of that module. An independent module
;;;   is a module which is not derived from or based on this library. If you modify this library, you may extend
;;;   this exception to your version of the library, but you are not obligated to do so. If you do not wish to do so,
;;;   delete this exception statement from your version.
;;;   
;;;
;;;
;;;   In addition, this software is also licensed under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;
;;;

(ns 
  ^{:author "Ruediger Gad",
    :doc "Sample data",
    :description "Sample data of a SYN flood generated with mausezahn.
The source IP address was _not_ randomized."
    :raw-file "syn_flood_sender_non-rand_2012-11-07.out"
    :date "2012-11-07"}
   cljEsperRunner.test.data.sniffer.syn-flood-sender-non-rand-2012-11-07)

(def data-set [
{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302859953334000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302860000743000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58562,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665487442,
  "seq" 1720018229,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302860001014000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62897,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018236,
  "seq" 1665487442,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302860001043000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58563,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665487706,
  "seq" 1720018236,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302860001104000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58564,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665487706,
  "seq" 1720018236,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302860001280000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62898,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018248,
  "seq" 1665487706,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302860040769000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58565,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665487709,
  "seq" 1720018248,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302860501837000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58566,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665487709,
  "seq" 1720018248,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302860502107000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62899,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018255,
  "seq" 1665487709,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302860502134000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58567,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665487973,
  "seq" 1720018255,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302860502185000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58568,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665487973,
  "seq" 1720018255,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302860502362000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62900,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018267,
  "seq" 1665487973,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302860541778000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58569,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665487976,
  "seq" 1720018267,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302860985515000, "wirelen" 156},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57669,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619552087,
  "seq" 846302916,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302860985548000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 38067,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846303006,
  "seq" 2619552087,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302861002625000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58570,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665487976,
  "seq" 1720018267,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302861002881000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62901,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018274,
  "seq" 1665487976,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302861002906000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58571,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665488240,
  "seq" 1720018274,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302861002958000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58572,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665488240,
  "seq" 1720018274,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302861003138000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62902,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018286,
  "seq" 1665488240,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302861042784000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58573,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665488243,
  "seq" 1720018286,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302861503789000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58574,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665488243,
  "seq" 1720018286,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302861504051000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62903,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018293,
  "seq" 1665488243,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302861504077000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58575,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665488507,
  "seq" 1720018293,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302861504130000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58576,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665488507,
  "seq" 1720018293,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302861504308000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62904,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018305,
  "seq" 1665488507,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302861543779000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58577,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665488510,
  "seq" 1720018305,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302861953278000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302862004580000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58578,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665488510,
  "seq" 1720018305,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302862004858000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62905,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018312,
  "seq" 1665488510,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302862004885000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58579,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665488774,
  "seq" 1720018312,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302862004943000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58580,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665488774,
  "seq" 1720018312,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302862005120000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62906,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018324,
  "seq" 1665488774,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302862035064000, "wirelen" 204},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57670,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619552087,
  "seq" 846303006,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302862035161000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 38068,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846303144,
  "seq" 2619552087,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302862044803000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58581,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665488777,
  "seq" 1720018324,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302862505509000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58582,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665488777,
  "seq" 1720018324,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302862505787000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62907,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018331,
  "seq" 1665488777,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302862505809000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58583,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665489041,
  "seq" 1720018331,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302862505857000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58584,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665489041,
  "seq" 1720018331,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302862506035000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62908,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018343,
  "seq" 1665489041,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302862545771000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58585,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665489044,
  "seq" 1720018343,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302862627078000, "wirelen" 172},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57671,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619552087,
  "seq" 846303144,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302862627112000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 38069,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846303250,
  "seq" 2619552087,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302863006162000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58586,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665489044,
  "seq" 1720018343,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302863006415000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62909,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018350,
  "seq" 1665489044,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302863006440000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58587,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665489308,
  "seq" 1720018350,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302863006481000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58588,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665489308,
  "seq" 1720018350,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302863006664000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62910,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018362,
  "seq" 1665489308,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302863045770000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58589,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665489311,
  "seq" 1720018362,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302863507172000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58590,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665489311,
  "seq" 1720018362,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302863507490000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62911,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018369,
  "seq" 1665489311,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302863507513000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58591,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665489575,
  "seq" 1720018369,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302863507558000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58592,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665489575,
  "seq" 1720018369,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302863507742000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62912,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018381,
  "seq" 1665489575,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302863547769000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58593,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665489578,
  "seq" 1720018381,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302863708960000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.0.251",
  "source" "192.168.20.126",
  "id" 35919,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 631,
  "source" 55846,
  "ack" 0,
  "seq" 4154631295,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302863953222000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864008139000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58594,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665489578,
  "seq" 1720018381,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864008386000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62913,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018388,
  "seq" 1665489578,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864008410000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58595,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665489842,
  "seq" 1720018388,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864008457000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58596,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665489842,
  "seq" 1720018388,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864008647000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62914,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018400,
  "seq" 1665489842,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864047772000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58597,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665489845,
  "seq" 1720018400,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864099255000, "wirelen" 220},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57672,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619552087,
  "seq" 846303250,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864099280000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 38070,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846303404,
  "seq" 2619552087,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864509602000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58598,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665489845,
  "seq" 1720018400,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864509865000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62915,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018407,
  "seq" 1665489845,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864509887000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58599,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665490109,
  "seq" 1720018407,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864510045000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58600,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665490109,
  "seq" 1720018407,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864510228000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62916,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018419,
  "seq" 1665490109,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864549771000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58601,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665490112,
  "seq" 1720018419,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864710768000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.0.251",
  "source" "192.168.20.126",
  "id" 35920,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 631,
  "source" 55846,
  "ack" 0,
  "seq" 4154631295,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864746957000, "wirelen" 140},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 38071,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846303404,
  "seq" 2619552087,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864772853000, "wirelen" 156},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57673,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619552161,
  "seq" 846303404,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864772875000, "wirelen" 140},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 38072,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846303494,
  "seq" 2619552161,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864798948000, "wirelen" 464},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57674,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619552235,
  "seq" 846303494,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864799929000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57675,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619552235,
  "seq" 846303892,
  "flags" #{"ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864799968000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 38073,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846305340,
  "seq" 2619552235,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864800479000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57676,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619552235,
  "seq" 846305340,
  "flags" #{"ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864825429000, "wirelen" 250},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57678,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619552235,
  "seq" 846308236,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864825472000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 38074,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846306788,
  "seq" 2619552235,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864825483000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57677,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619552235,
  "seq" 846306788,
  "flags" #{"ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302864825498000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 38075,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846308420,
  "seq" 2619552235,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302865010511000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58602,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665490112,
  "seq" 1720018419,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302865010786000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62917,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018426,
  "seq" 1665490112,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302865010809000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58603,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665490376,
  "seq" 1720018426,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302865010857000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58604,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665490376,
  "seq" 1720018426,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302865011035000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62918,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018438,
  "seq" 1665490376,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302865050768000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58605,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665490379,
  "seq" 1720018438,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302865511417000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58606,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665490379,
  "seq" 1720018438,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302865511684000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62919,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018445,
  "seq" 1665490379,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302865511718000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58607,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665490643,
  "seq" 1720018445,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302865511780000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58608,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665490643,
  "seq" 1720018445,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302865511955000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62920,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018457,
  "seq" 1665490643,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302865551780000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58609,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665490646,
  "seq" 1720018457,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302865953166000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302866011926000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58610,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665490646,
  "seq" 1720018457,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302866012212000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62921,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018464,
  "seq" 1665490646,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302866012247000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58611,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665490910,
  "seq" 1720018464,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302866012312000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58612,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665490910,
  "seq" 1720018464,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302866012489000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62922,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018476,
  "seq" 1665490910,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302866051826000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58613,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665490913,
  "seq" 1720018476,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302866512898000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58614,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665490913,
  "seq" 1720018476,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302866513174000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62923,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018483,
  "seq" 1665490913,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302866513198000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58615,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665491177,
  "seq" 1720018483,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302866513244000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58616,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665491177,
  "seq" 1720018483,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302866513424000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62924,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018495,
  "seq" 1665491177,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302866552772000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58617,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665491180,
  "seq" 1720018495,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302866716767000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.0.251",
  "source" "192.168.20.126",
  "id" 35921,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 631,
  "source" 55846,
  "ack" 0,
  "seq" 4154631295,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302867013149000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58618,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665491180,
  "seq" 1720018495,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302867013405000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62925,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018502,
  "seq" 1665491180,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302867013428000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58619,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665491444,
  "seq" 1720018502,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302867013478000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58620,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665491444,
  "seq" 1720018502,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302867013659000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62926,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018514,
  "seq" 1665491444,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302867052771000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58621,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665491447,
  "seq" 1720018514,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302867514144000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58622,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665491447,
  "seq" 1720018514,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302867514404000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62927,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018521,
  "seq" 1665491447,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302867514427000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58623,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665491711,
  "seq" 1720018521,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302867514476000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58624,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665491711,
  "seq" 1720018521,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302867514655000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62928,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018533,
  "seq" 1665491711,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302867553781000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58625,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665491714,
  "seq" 1720018533,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302867953111000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302868014617000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58626,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665491714,
  "seq" 1720018533,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302868014880000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62929,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018540,
  "seq" 1665491714,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302868014902000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58627,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665491978,
  "seq" 1720018540,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302868015113000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58628,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665491978,
  "seq" 1720018540,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302868015296000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62930,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018552,
  "seq" 1665491978,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302868054770000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58629,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665491981,
  "seq" 1720018552,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302868515878000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58630,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665491981,
  "seq" 1720018552,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302868516142000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62931,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018559,
  "seq" 1665491981,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302868516166000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58631,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665492245,
  "seq" 1720018559,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302868516211000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58632,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665492245,
  "seq" 1720018559,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302868516385000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62932,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018571,
  "seq" 1665492245,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302868555778000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58633,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665492248,
  "seq" 1720018571,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302869016824000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58634,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665492248,
  "seq" 1720018571,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302869017088000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62933,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018578,
  "seq" 1665492248,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302869017123000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58635,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665492512,
  "seq" 1720018578,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302869017175000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58636,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665492512,
  "seq" 1720018578,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302869017353000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62934,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018590,
  "seq" 1665492512,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302869056783000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58637,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665492515,
  "seq" 1720018590,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302869517942000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58638,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665492515,
  "seq" 1720018590,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302869518220000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62935,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018597,
  "seq" 1665492515,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302869518255000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58639,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665492779,
  "seq" 1720018597,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302869518399000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58640,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665492779,
  "seq" 1720018597,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302869518593000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62936,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018609,
  "seq" 1665492779,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302869557788000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58641,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665492782,
  "seq" 1720018609,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302869953056000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302870019092000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58642,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665492782,
  "seq" 1720018609,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302870019347000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62937,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018616,
  "seq" 1665492782,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302870019392000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58643,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665493046,
  "seq" 1720018616,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302870019430000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58644,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665493046,
  "seq" 1720018616,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302870019623000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62938,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018628,
  "seq" 1665493046,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302870058776000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58645,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665493049,
  "seq" 1720018628,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302870520220000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58646,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665493049,
  "seq" 1720018628,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302870520487000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62939,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018635,
  "seq" 1665493049,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302870520538000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58647,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665493313,
  "seq" 1720018635,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302870520614000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58648,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665493313,
  "seq" 1720018635,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302870520795000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62940,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018647,
  "seq" 1665493313,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302870530113000, "wirelen" 204},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57679,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619552235,
  "seq" 846308420,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302870530201000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 38076,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846308558,
  "seq" 2619552235,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302870560816000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58649,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665493316,
  "seq" 1720018647,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302870724768000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.0.251",
  "source" "192.168.20.126",
  "id" 35922,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 631,
  "source" 55846,
  "ack" 0,
  "seq" 4154631295,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871021236000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58650,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665493316,
  "seq" 1720018647,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871021504000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62941,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018654,
  "seq" 1665493316,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871021536000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58651,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665493580,
  "seq" 1720018654,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871021614000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58652,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665493580,
  "seq" 1720018654,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871021797000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62942,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018666,
  "seq" 1665493580,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871061791000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58653,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665493583,
  "seq" 1720018666,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871163367000, "wirelen" 119},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 7080,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 48843,
  "source" 143,
  "ack" 959157322,
  "seq" 644923954,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871163403000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 38906,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 48843,
  "ack" 644924007,
  "seq" 959157322,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871164156000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 38907,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 48843,
  "ack" 644924007,
  "seq" 959157322,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871164864000, "wirelen" 119},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 7081,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 48843,
  "source" 143,
  "ack" 959157359,
  "seq" 644924007,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871165095000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 38908,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 48843,
  "ack" 644924060,
  "seq" 959157359,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871165752000, "wirelen" 119},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 7082,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 48843,
  "source" 143,
  "ack" 959157396,
  "seq" 644924060,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871165947000, "wirelen" 135},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 38909,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 48843,
  "ack" 644924113,
  "seq" 959157396,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871166733000, "wirelen" 215},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 7083,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 48843,
  "source" 143,
  "ack" 959157465,
  "seq" 644924113,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871166948000, "wirelen" 119},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 38910,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 48843,
  "ack" 644924262,
  "seq" 959157465,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871167751000, "wirelen" 151},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 7084,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 48843,
  "source" 143,
  "ack" 959157518,
  "seq" 644924262,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871169139000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 38911,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 48843,
  "ack" 644924347,
  "seq" 959157518,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871169922000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 7085,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 48843,
  "source" 143,
  "ack" 959157555,
  "seq" 644924347,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871209774000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 38912,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 48843,
  "ack" 644924384,
  "seq" 959157555,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871522408000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58654,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665493583,
  "seq" 1720018666,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871522737000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62943,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018673,
  "seq" 1665493583,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871522790000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58655,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665493847,
  "seq" 1720018673,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871522892000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58656,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665493847,
  "seq" 1720018673,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871523087000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62944,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018685,
  "seq" 1665493847,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871562789000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58657,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665493850,
  "seq" 1720018685,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871612179000, "wirelen" 119},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 53416,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 47818,
  "source" 143,
  "ack" 2483631739,
  "seq" 1459896682,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871612226000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 24414,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 47818,
  "ack" 1459896735,
  "seq" 2483631739,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871612993000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 24415,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 47818,
  "ack" 1459896735,
  "seq" 2483631739,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871613574000, "wirelen" 119},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 53417,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 47818,
  "source" 143,
  "ack" 2483631776,
  "seq" 1459896735,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871613813000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 24416,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 47818,
  "ack" 1459896788,
  "seq" 2483631776,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871614445000, "wirelen" 119},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 53418,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 47818,
  "source" 143,
  "ack" 2483631813,
  "seq" 1459896788,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871614624000, "wirelen" 119},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 24417,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 47818,
  "ack" 1459896841,
  "seq" 2483631813,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871615237000, "wirelen" 215},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 53419,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 47818,
  "source" 143,
  "ack" 2483631866,
  "seq" 1459896841,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871615432000, "wirelen" 135},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 24418,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 47818,
  "ack" 1459896990,
  "seq" 2483631866,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871616304000, "wirelen" 183},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 53420,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 47818,
  "source" 143,
  "ack" 2483631935,
  "seq" 1459896990,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871624420000, "wirelen" 119},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 54672,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 47827,
  "source" 143,
  "ack" 575863615,
  "seq" 1544001677,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871624455000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 48366,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 47827,
  "ack" 1544001730,
  "seq" 575863615,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871633039000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 48367,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 47827,
  "ack" 1544001730,
  "seq" 575863615,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871633666000, "wirelen" 119},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 54673,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 47827,
  "source" 143,
  "ack" 575863652,
  "seq" 1544001730,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871636249000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 48368,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 47827,
  "ack" 1544001783,
  "seq" 575863652,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871636296000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 24419,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 47818,
  "ack" 1459897107,
  "seq" 2483631935,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871637431000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 53421,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 47818,
  "source" 143,
  "ack" 2483631972,
  "seq" 1459897107,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871637452000, "wirelen" 119},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 54674,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 47827,
  "source" 143,
  "ack" 575863689,
  "seq" 1544001783,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871637631000, "wirelen" 119},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 48369,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 47827,
  "ack" 1544001836,
  "seq" 575863689,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871638565000, "wirelen" 215},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 54675,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 47827,
  "source" 143,
  "ack" 575863742,
  "seq" 1544001836,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871638704000, "wirelen" 135},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 48370,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 47827,
  "ack" 1544001985,
  "seq" 575863742,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871639693000, "wirelen" 167},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 54676,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 47827,
  "source" 143,
  "ack" 575863811,
  "seq" 1544001985,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871643640000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 48371,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 47827,
  "ack" 1544002086,
  "seq" 575863811,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871644572000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 54677,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 47827,
  "source" 143,
  "ack" 575863848,
  "seq" 1544002086,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871665344000, "wirelen" 165},
 "DataLinkLayer"
 {"index" 0,
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "90:E6:BA:3C:9A:26",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "255.255.255.255",
  "source" "192.168.20.194",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871665667000, "wirelen" 165},
 "DataLinkLayer"
 {"index" 0,
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "90:E6:BA:3C:9A:26",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.255",
  "source" "192.168.20.194",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871676767000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 24420,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 47818,
  "ack" 1459897144,
  "seq" 2483631972,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871683757000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 48372,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 47827,
  "ack" 1544002123,
  "seq" 575863848,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871844328000, "wirelen" 119},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 25105,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 48971,
  "source" 143,
  "ack" 3047057885,
  "seq" 921966681,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871844373000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 22947,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 48971,
  "ack" 921966734,
  "seq" 3047057885,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871844970000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 22948,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 48971,
  "ack" 921966734,
  "seq" 3047057885,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871845628000, "wirelen" 119},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 25106,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 48971,
  "source" 143,
  "ack" 3047057922,
  "seq" 921966734,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871845885000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 22949,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 48971,
  "ack" 921966787,
  "seq" 3047057922,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871846535000, "wirelen" 119},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 25107,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 48971,
  "source" 143,
  "ack" 3047057959,
  "seq" 921966787,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871846680000, "wirelen" 119},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 22950,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 48971,
  "ack" 921966840,
  "seq" 3047057959,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871847251000, "wirelen" 215},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 25108,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 48971,
  "source" 143,
  "ack" 3047058012,
  "seq" 921966840,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871848302000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 22951,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 48971,
  "ack" 921966989,
  "seq" 3047058012,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871849076000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "194.95.81.200",
  "id" 25109,
  "tos" 0,
  "ttl" 62,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 48971,
  "source" 143,
  "ack" 3047058049,
  "seq" 921966989,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871888772000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "194.95.81.200",
  "source" "192.168.20.126",
  "id" 22952,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 143,
  "source" 48971,
  "ack" 921967026,
  "seq" 3047058049,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302871953015000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302872023466000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58658,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665493850,
  "seq" 1720018685,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302872023729000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62945,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018692,
  "seq" 1665493850,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302872023783000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58659,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665494114,
  "seq" 1720018692,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302872023831000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58660,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665494114,
  "seq" 1720018692,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302872024016000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62946,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018704,
  "seq" 1665494114,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302872063773000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58661,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665494117,
  "seq" 1720018704,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302872072421000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:0E",
  "source" "24:B6:57:08:B2:8C",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302872278735000, "wirelen" 268},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57680,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619552235,
  "seq" 846308558,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302872278788000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 38077,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846308760,
  "seq" 2619552235,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302872524643000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58662,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665494117,
  "seq" 1720018704,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302872524924000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62947,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018711,
  "seq" 1665494117,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302872524992000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58663,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665494381,
  "seq" 1720018711,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302872525085000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58664,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665494381,
  "seq" 1720018711,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302872525260000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62948,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018723,
  "seq" 1665494381,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302872564787000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58665,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665494384,
  "seq" 1720018723,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302873025369000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58666,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665494384,
  "seq" 1720018723,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302873025633000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62949,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018730,
  "seq" 1665494384,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302873025680000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58667,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665494648,
  "seq" 1720018730,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302873025730000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58668,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665494648,
  "seq" 1720018730,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302873025909000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62950,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018742,
  "seq" 1665494648,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302873065781000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58669,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665494651,
  "seq" 1720018742,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302873526498000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58670,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665494651,
  "seq" 1720018742,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302873526774000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62951,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018749,
  "seq" 1665494651,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302873526818000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58671,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665494915,
  "seq" 1720018749,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302873526867000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58672,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665494915,
  "seq" 1720018749,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302873527053000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62952,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018761,
  "seq" 1665494915,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302873566775000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58673,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665494918,
  "seq" 1720018761,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302873879073000, "wirelen" 161},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:00:0C:CC:CC:CC",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302873952965000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302874027553000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58674,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665494918,
  "seq" 1720018761,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302874027824000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62953,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018768,
  "seq" 1665494918,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302874027870000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58675,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665495182,
  "seq" 1720018768,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302874027919000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58676,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665495182,
  "seq" 1720018768,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302874028104000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62954,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018780,
  "seq" 1665495182,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302874067771000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58677,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665495185,
  "seq" 1720018780,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302874528701000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58678,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665495185,
  "seq" 1720018780,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302874528969000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62955,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018787,
  "seq" 1665495185,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302874529022000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58679,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665495449,
  "seq" 1720018787,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302874529152000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58680,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665495449,
  "seq" 1720018787,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302874529335000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62956,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018799,
  "seq" 1665495449,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302874568788000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58681,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665495452,
  "seq" 1720018799,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302875029875000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58682,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665495452,
  "seq" 1720018799,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302875030136000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62957,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018806,
  "seq" 1665495452,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302875030194000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58683,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665495716,
  "seq" 1720018806,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302875030252000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58684,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665495716,
  "seq" 1720018806,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302875030438000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62958,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018818,
  "seq" 1665495716,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302875069781000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58685,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665495719,
  "seq" 1720018818,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302875463164000, "wirelen" 156},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 38078,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846308760,
  "seq" 2619552235,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302875489027000, "wirelen" 156},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57681,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619552325,
  "seq" 846308760,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302875489081000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 38079,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846308850,
  "seq" 2619552325,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302875531144000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58686,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665495719,
  "seq" 1720018818,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302875531418000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62959,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018825,
  "seq" 1665495719,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302875531446000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58687,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665495983,
  "seq" 1720018825,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302875531877000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58688,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665495983,
  "seq" 1720018825,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302875532074000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62960,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018837,
  "seq" 1665495983,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302875571775000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58689,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665495986,
  "seq" 1720018837,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302875952907000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302876032583000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58690,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665495986,
  "seq" 1720018837,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302876032848000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62961,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018844,
  "seq" 1665495986,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302876032896000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58691,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665496250,
  "seq" 1720018844,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302876032950000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58692,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665496250,
  "seq" 1720018844,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302876033132000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62962,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018856,
  "seq" 1665496250,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302876072774000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58693,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665496253,
  "seq" 1720018856,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302876533732000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58694,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665496253,
  "seq" 1720018856,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302876534004000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62963,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018863,
  "seq" 1665496253,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302876534059000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58695,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665496517,
  "seq" 1720018863,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302876534122000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58696,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665496517,
  "seq" 1720018863,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302876534307000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62964,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018875,
  "seq" 1665496517,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302876573783000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58697,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665496520,
  "seq" 1720018875,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302876763954000, "wirelen" 156},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57682,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619552325,
  "seq" 846308850,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302876763998000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 38080,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846308940,
  "seq" 2619552325,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302877034974000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58698,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665496520,
  "seq" 1720018875,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302877035241000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62965,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018882,
  "seq" 1665496520,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302877035290000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58699,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665496784,
  "seq" 1720018882,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302877035356000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58700,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665496784,
  "seq" 1720018882,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302877035536000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62966,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018894,
  "seq" 1665496784,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302877074772000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58701,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665496787,
  "seq" 1720018894,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302877259720000, "wirelen" 188},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57683,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619552325,
  "seq" 846308940,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302877259760000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 38081,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846309062,
  "seq" 2619552325,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302877536126000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58702,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665496787,
  "seq" 1720018894,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302877536392000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62967,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018901,
  "seq" 1665496787,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302877536423000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58703,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665497051,
  "seq" 1720018901,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302877536845000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58704,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665497051,
  "seq" 1720018901,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302877537030000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62968,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018913,
  "seq" 1665497051,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302877576773000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58705,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665497054,
  "seq" 1720018913,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302877952855000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302878037622000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58706,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665497054,
  "seq" 1720018913,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302878037881000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62969,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018920,
  "seq" 1665497054,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302878037923000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58707,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665497318,
  "seq" 1720018920,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302878037970000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58708,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665497318,
  "seq" 1720018920,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302878038158000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62970,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018932,
  "seq" 1665497318,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302878077782000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58709,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665497321,
  "seq" 1720018932,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302878537821000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58710,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665497321,
  "seq" 1720018932,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302878538099000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62971,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018939,
  "seq" 1665497321,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302878538149000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58711,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665497585,
  "seq" 1720018939,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302878538208000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58712,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665497585,
  "seq" 1720018939,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302878538393000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62972,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018951,
  "seq" 1665497585,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302878577773000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58713,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665497588,
  "seq" 1720018951,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302878732775000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.0.251",
  "source" "192.168.20.126",
  "id" 35923,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 631,
  "source" 55846,
  "ack" 0,
  "seq" 4154631295,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302879039082000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58714,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665497588,
  "seq" 1720018951,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302879039339000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62973,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018958,
  "seq" 1665497588,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302879039404000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58715,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665497852,
  "seq" 1720018958,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302879039502000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58716,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665497852,
  "seq" 1720018958,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302879039682000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62974,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018970,
  "seq" 1665497852,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302879078772000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58717,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665497855,
  "seq" 1720018970,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302879540282000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58718,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665497855,
  "seq" 1720018970,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302879540545000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62975,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018977,
  "seq" 1665497855,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302879540570000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58719,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665498119,
  "seq" 1720018977,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302879540625000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58720,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665498119,
  "seq" 1720018977,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302879540806000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62976,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018989,
  "seq" 1665498119,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302879580775000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58721,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665498122,
  "seq" 1720018989,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302879952793000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302880041334000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58722,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665498122,
  "seq" 1720018989,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302880041611000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62977,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720018996,
  "seq" 1665498122,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302880041641000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58723,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665498386,
  "seq" 1720018996,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302880041711000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58724,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665498386,
  "seq" 1720018996,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302880041893000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62978,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019008,
  "seq" 1665498386,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302880081776000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58725,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665498389,
  "seq" 1720019008,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302880542493000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58726,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665498389,
  "seq" 1720019008,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302880542752000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62979,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019015,
  "seq" 1665498389,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302880542782000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58727,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665498653,
  "seq" 1720019015,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302880542854000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58728,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665498653,
  "seq" 1720019015,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302880543033000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62980,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019027,
  "seq" 1665498653,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302880582776000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58729,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665498656,
  "seq" 1720019027,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302881043818000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58730,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665498656,
  "seq" 1720019027,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302881044082000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62981,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019034,
  "seq" 1665498656,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302881044133000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58731,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665498920,
  "seq" 1720019034,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302881044186000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58732,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665498920,
  "seq" 1720019034,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302881044371000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62982,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019046,
  "seq" 1665498920,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302881083778000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58733,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665498923,
  "seq" 1720019046,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302881373199000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "205.188.17.193",
  "source" "192.168.20.126",
  "id" 22948,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 443,
  "source" 42610,
  "ack" 836471776,
  "seq" 2156868895,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302881373220000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "205.188.10.221",
  "source" "192.168.20.126",
  "id" 61320,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 443,
  "source" 53605,
  "ack" 545821032,
  "seq" 1205897457,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302881373235000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "64.12.30.49",
  "source" "192.168.20.126",
  "id" 3495,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 443,
  "source" 53237,
  "ack" 459334019,
  "seq" 1609886920,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302881486879000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "64.12.30.49",
  "id" 30277,
  "tos" 32,
  "ttl" 104,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 53237,
  "source" 443,
  "ack" 1609886926,
  "seq" 459334019,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302881486900000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "205.188.17.193",
  "id" 8246,
  "tos" 32,
  "ttl" 103,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 42610,
  "source" 443,
  "ack" 2156868901,
  "seq" 836471776,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302881491390000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "205.188.10.221",
  "id" 64723,
  "tos" 32,
  "ttl" 103,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 53605,
  "source" 443,
  "ack" 1205897463,
  "seq" 545821032,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302881544977000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58734,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665498923,
  "seq" 1720019046,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302881545248000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62983,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019053,
  "seq" 1665498923,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302881545285000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58735,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665499187,
  "seq" 1720019053,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302881545355000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58736,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665499187,
  "seq" 1720019053,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302881545538000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62984,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019065,
  "seq" 1665499187,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302881584777000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58737,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665499190,
  "seq" 1720019065,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302881952755000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302882046154000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58738,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665499190,
  "seq" 1720019065,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302882046413000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62985,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019072,
  "seq" 1665499190,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302882046458000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58739,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665499454,
  "seq" 1720019072,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302882048836000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58740,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665499454,
  "seq" 1720019072,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302882049026000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62986,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019084,
  "seq" 1665499454,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302882088780000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58741,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665499457,
  "seq" 1720019084,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302882546688000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58742,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665499457,
  "seq" 1720019084,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302882546949000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62987,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019091,
  "seq" 1665499457,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302882546984000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58743,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665499721,
  "seq" 1720019091,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302882547044000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58744,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665499721,
  "seq" 1720019091,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302882547225000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62988,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019103,
  "seq" 1665499721,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302882586787000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58745,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665499724,
  "seq" 1720019103,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302883047341000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58746,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665499724,
  "seq" 1720019103,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302883047612000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62989,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019110,
  "seq" 1665499724,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302883047647000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58747,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665499988,
  "seq" 1720019110,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302883047707000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58748,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665499988,
  "seq" 1720019110,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302883047886000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62990,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019122,
  "seq" 1665499988,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302883087781000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58749,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665499991,
  "seq" 1720019122,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302883548536000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58750,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665499991,
  "seq" 1720019122,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302883548848000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62991,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019129,
  "seq" 1665499991,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302883548880000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58751,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665500255,
  "seq" 1720019129,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302883548943000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58752,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665500255,
  "seq" 1720019129,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302883549122000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62992,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019141,
  "seq" 1665500255,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302883588776000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58753,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665500258,
  "seq" 1720019141,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302883952714000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302884049741000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58754,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665500258,
  "seq" 1720019141,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302884049998000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62993,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019148,
  "seq" 1665500258,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302884050030000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58755,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665500522,
  "seq" 1720019148,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302884050098000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58756,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665500522,
  "seq" 1720019148,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302884050280000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62994,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019160,
  "seq" 1665500522,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302884089776000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58757,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665500525,
  "seq" 1720019160,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302884550880000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58758,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665500525,
  "seq" 1720019160,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302884551186000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62995,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019167,
  "seq" 1665500525,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302884551222000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58759,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665500789,
  "seq" 1720019167,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302884551314000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58760,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665500789,
  "seq" 1720019167,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302884551496000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62996,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019179,
  "seq" 1665500789,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302884590778000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58761,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665500792,
  "seq" 1720019179,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302885052136000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58762,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665500792,
  "seq" 1720019179,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302885052395000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62997,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019186,
  "seq" 1665500792,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302885052426000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58763,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665501056,
  "seq" 1720019186,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302885052493000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58764,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665501056,
  "seq" 1720019186,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302885052671000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62998,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019198,
  "seq" 1665501056,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302885091776000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58765,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665501059,
  "seq" 1720019198,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302885127839000, "wirelen" 220},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57684,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619552325,
  "seq" 846309062,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302885127861000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 38082,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846309216,
  "seq" 2619552325,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302885553377000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58766,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665501059,
  "seq" 1720019198,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302885554530000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 62999,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019205,
  "seq" 1665501059,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302885554560000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58767,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665501323,
  "seq" 1720019205,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302885554782000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58768,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665501323,
  "seq" 1720019205,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302885554966000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63000,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019217,
  "seq" 1665501323,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302885594777000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58769,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665501326,
  "seq" 1720019217,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302885952643000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302886054228000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58770,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665501326,
  "seq" 1720019217,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302886054501000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63001,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019224,
  "seq" 1665501326,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302886054530000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58771,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665501590,
  "seq" 1720019224,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302886054597000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58772,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665501590,
  "seq" 1720019224,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302886054779000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63002,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019236,
  "seq" 1665501590,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302886094775000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58773,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665501593,
  "seq" 1720019236,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302886555453000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58774,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665501593,
  "seq" 1720019236,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302886555718000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63003,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019243,
  "seq" 1665501593,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302886555750000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58775,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665501857,
  "seq" 1720019243,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302886555819000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58776,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665501857,
  "seq" 1720019243,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302886555997000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63004,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019255,
  "seq" 1665501857,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302886595772000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58777,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665501860,
  "seq" 1720019255,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302887056610000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58778,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665501860,
  "seq" 1720019255,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302887056873000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63005,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019262,
  "seq" 1665501860,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302887056905000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58779,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665502124,
  "seq" 1720019262,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302887056974000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58780,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665502124,
  "seq" 1720019262,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302887057157000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63006,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019274,
  "seq" 1665502124,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302887096779000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58781,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665502127,
  "seq" 1720019274,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302887557464000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58782,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665502127,
  "seq" 1720019274,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302887557753000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63007,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019281,
  "seq" 1665502127,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302887557787000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58783,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665502391,
  "seq" 1720019281,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302887557965000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58784,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665502391,
  "seq" 1720019281,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302887558150000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63008,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019293,
  "seq" 1665502391,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302887597777000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58785,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665502394,
  "seq" 1720019293,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302887952593000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302888058054000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58786,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665502394,
  "seq" 1720019293,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302888058318000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63009,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019300,
  "seq" 1665502394,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302888058366000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58787,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665502658,
  "seq" 1720019300,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302888058439000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58788,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665502658,
  "seq" 1720019300,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302888058596000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63010,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019312,
  "seq" 1665502658,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302888097775000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58789,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665502661,
  "seq" 1720019312,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302888559273000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58790,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665502661,
  "seq" 1720019312,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302888559541000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63011,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019319,
  "seq" 1665502661,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302888559572000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58791,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665502925,
  "seq" 1720019319,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302888561878000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58792,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665502925,
  "seq" 1720019319,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302888562075000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63012,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019331,
  "seq" 1665502925,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302888601779000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58793,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665502928,
  "seq" 1720019331,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302889060564000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58794,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665502928,
  "seq" 1720019331,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302889060831000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63013,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019338,
  "seq" 1665502928,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302889060876000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58795,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665503192,
  "seq" 1720019338,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302889060925000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58796,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665503192,
  "seq" 1720019338,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302889061111000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63014,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019350,
  "seq" 1665503192,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302889100774000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58797,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665503195,
  "seq" 1720019350,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302889561703000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58798,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665503195,
  "seq" 1720019350,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302889561974000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63015,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019357,
  "seq" 1665503195,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302889562025000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58799,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665503459,
  "seq" 1720019357,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302889562082000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58800,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665503459,
  "seq" 1720019357,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302889562264000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63016,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019369,
  "seq" 1665503459,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302889601771000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58801,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665503462,
  "seq" 1720019369,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302889952547000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302890062809000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58802,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665503462,
  "seq" 1720019369,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302890063066000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63017,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019376,
  "seq" 1665503462,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302890063107000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58803,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665503726,
  "seq" 1720019376,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302890063158000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58804,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665503726,
  "seq" 1720019376,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302890063361000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63018,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019388,
  "seq" 1665503726,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302890102779000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58805,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665503729,
  "seq" 1720019388,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302890563339000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58806,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665503729,
  "seq" 1720019388,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302890563622000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63019,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019395,
  "seq" 1665503729,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302890563652000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58807,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665503993,
  "seq" 1720019395,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302890563710000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58808,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665503993,
  "seq" 1720019395,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302890563890000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63020,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019407,
  "seq" 1665503993,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302890603775000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58809,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665503996,
  "seq" 1720019407,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302891064388000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58810,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665503996,
  "seq" 1720019407,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302891064650000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63021,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019414,
  "seq" 1665503996,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302891064696000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58811,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665504260,
  "seq" 1720019414,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302891064741000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58812,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665504260,
  "seq" 1720019414,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302891064931000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63022,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019426,
  "seq" 1665504260,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302891104775000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58813,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665504263,
  "seq" 1720019426,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302891403833000, "wirelen" 172},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57685,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619552325,
  "seq" 846309216,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302891403871000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 38083,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846309322,
  "seq" 2619552325,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302891565525000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58814,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665504263,
  "seq" 1720019426,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302891565966000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63023,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019433,
  "seq" 1665504263,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302891566008000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58815,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665504527,
  "seq" 1720019433,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302891566057000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58816,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665504527,
  "seq" 1720019433,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302891566246000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63024,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019445,
  "seq" 1665504527,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302891605773000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58817,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665504530,
  "seq" 1720019445,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302891952489000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302892066219000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58818,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665504530,
  "seq" 1720019445,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302892066488000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63025,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019452,
  "seq" 1665504530,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302892066539000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58819,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665504794,
  "seq" 1720019452,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302892066590000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58820,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665504794,
  "seq" 1720019452,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302892066772000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63026,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019464,
  "seq" 1665504794,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302892106775000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58821,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665504797,
  "seq" 1720019464,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302892567373000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58822,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665504797,
  "seq" 1720019464,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302892567648000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63027,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019471,
  "seq" 1665504797,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302892567698000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58823,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665505061,
  "seq" 1720019471,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302892567763000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58824,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665505061,
  "seq" 1720019471,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302892567941000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63028,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019483,
  "seq" 1665505061,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302892607773000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58825,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665505064,
  "seq" 1720019483,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302893068668000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58826,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665505064,
  "seq" 1720019483,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302893068928000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63029,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019490,
  "seq" 1665505064,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302893068978000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58827,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665505328,
  "seq" 1720019490,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302893069031000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58828,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665505328,
  "seq" 1720019490,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302893069215000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63030,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019502,
  "seq" 1665505328,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302893108782000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58829,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665505331,
  "seq" 1720019502,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302893569818000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58830,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665505331,
  "seq" 1720019502,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302893570101000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63031,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019509,
  "seq" 1665505331,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302893570156000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58831,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665505595,
  "seq" 1720019509,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302893570233000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58832,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665505595,
  "seq" 1720019509,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302893570417000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63032,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019521,
  "seq" 1665505595,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302893609770000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58833,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665505598,
  "seq" 1720019521,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302893952446000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302894070896000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58834,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665505598,
  "seq" 1720019521,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302894071156000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63033,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019528,
  "seq" 1665505598,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302894071187000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58835,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665505862,
  "seq" 1720019528,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302894071255000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58836,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665505862,
  "seq" 1720019528,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302894071441000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63034,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019540,
  "seq" 1665505862,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302894110774000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58837,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665505865,
  "seq" 1720019540,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302894572067000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58838,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665505865,
  "seq" 1720019540,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302894572341000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63035,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019547,
  "seq" 1665505865,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302894572373000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58839,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665506129,
  "seq" 1720019547,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302894573206000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58840,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665506129,
  "seq" 1720019547,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302894573402000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63036,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019559,
  "seq" 1665506129,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302894612802000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58841,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665506132,
  "seq" 1720019559,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302894764775000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.0.251",
  "source" "192.168.20.126",
  "id" 35924,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 631,
  "source" 55846,
  "ack" 0,
  "seq" 4154631295,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302895073262000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58842,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665506132,
  "seq" 1720019559,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302895073532000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63037,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019566,
  "seq" 1665506132,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302895073594000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58843,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665506396,
  "seq" 1720019566,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302895073675000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58844,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665506396,
  "seq" 1720019566,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302895073853000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63038,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019578,
  "seq" 1665506396,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302895113774000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58845,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665506399,
  "seq" 1720019578,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302895574461000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58846,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665506399,
  "seq" 1720019578,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302895574727000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63039,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019585,
  "seq" 1665506399,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302895574757000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58847,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665506663,
  "seq" 1720019585,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302895574812000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58848,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665506663,
  "seq" 1720019585,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302895574970000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63040,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019597,
  "seq" 1665506663,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302895614794000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58849,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665506666,
  "seq" 1720019597,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302895952399000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302896075580000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58850,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665506666,
  "seq" 1720019597,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302896075846000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63041,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019604,
  "seq" 1665506666,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302896075892000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58851,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665506930,
  "seq" 1720019604,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302896075942000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58852,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665506930,
  "seq" 1720019604,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302896076123000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63042,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019616,
  "seq" 1665506930,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302896115773000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58853,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665506933,
  "seq" 1720019616,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302896576710000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58854,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665506933,
  "seq" 1720019616,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302896576997000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63043,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019623,
  "seq" 1665506933,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302896577046000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58855,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665507197,
  "seq" 1720019623,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302896577101000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58856,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665507197,
  "seq" 1720019623,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302896577287000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63044,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019635,
  "seq" 1665507197,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302896616774000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58857,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665507200,
  "seq" 1720019635,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302897077868000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58858,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665507200,
  "seq" 1720019635,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302897078132000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63045,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019642,
  "seq" 1665507200,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302897078181000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58859,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665507464,
  "seq" 1720019642,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302897078232000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58860,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665507464,
  "seq" 1720019642,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302897078414000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63046,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019654,
  "seq" 1665507464,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302897117775000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58861,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665507467,
  "seq" 1720019654,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302897578564000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58862,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665507467,
  "seq" 1720019654,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302897579753000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63047,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019661,
  "seq" 1665507467,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302897579801000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58863,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665507731,
  "seq" 1720019661,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302897580052000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58864,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665507731,
  "seq" 1720019661,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302897580239000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63048,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019673,
  "seq" 1665507731,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302897619790000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58865,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665507734,
  "seq" 1720019673,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302897952344000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302898079855000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58866,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665507734,
  "seq" 1720019673,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302898080124000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63049,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019680,
  "seq" 1665507734,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302898080156000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58867,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665507998,
  "seq" 1720019680,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302898080848000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58868,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665507998,
  "seq" 1720019680,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302898081042000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63050,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019692,
  "seq" 1665507998,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302898120772000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58869,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665508001,
  "seq" 1720019692,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302898580648000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58870,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665508001,
  "seq" 1720019692,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302898580914000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63051,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019699,
  "seq" 1665508001,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302898580943000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58871,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665508265,
  "seq" 1720019699,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302898581252000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58872,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665508265,
  "seq" 1720019699,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302898581431000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63052,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019711,
  "seq" 1665508265,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302898620775000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58873,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665508268,
  "seq" 1720019711,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302899081897000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58874,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665508268,
  "seq" 1720019711,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302899082177000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63053,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019718,
  "seq" 1665508268,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302899082219000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58875,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665508532,
  "seq" 1720019718,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302899084603000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58876,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665508532,
  "seq" 1720019718,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302899084813000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63054,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019730,
  "seq" 1665508532,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302899124772000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58877,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665508535,
  "seq" 1720019730,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302899613101000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58878,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665508535,
  "seq" 1720019730,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302899613393000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63055,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019737,
  "seq" 1665508535,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302899613500000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58879,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665508799,
  "seq" 1720019737,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302899613878000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58880,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665508799,
  "seq" 1720019737,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302899614100000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63056,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019749,
  "seq" 1665508799,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302899653782000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58881,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665508802,
  "seq" 1720019749,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302899952281000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302900113827000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58882,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665508802,
  "seq" 1720019749,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302900114061000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63057,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019756,
  "seq" 1665508802,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302900114090000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58883,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665509066,
  "seq" 1720019756,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302900114159000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58884,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665509066,
  "seq" 1720019756,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302900114334000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63058,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019768,
  "seq" 1665509066,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302900153775000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58885,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665509069,
  "seq" 1720019768,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302900615004000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58886,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665509069,
  "seq" 1720019768,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302900615244000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63059,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019775,
  "seq" 1665509069,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302900615276000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58887,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665509333,
  "seq" 1720019775,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302900615339000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58888,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665509333,
  "seq" 1720019775,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302900615524000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63060,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019787,
  "seq" 1665509333,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302900654796000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58889,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665509336,
  "seq" 1720019787,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302900780111000, "wirelen" 188},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57686,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619552325,
  "seq" 846309322,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302900780144000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 38084,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846309444,
  "seq" 2619552325,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302901116269000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58890,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665509336,
  "seq" 1720019787,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302901116509000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63061,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019794,
  "seq" 1665509336,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302901116545000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58891,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665509600,
  "seq" 1720019794,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302901116587000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58892,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665509600,
  "seq" 1720019794,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302901116770000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63062,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019806,
  "seq" 1665509600,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302901156785000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58893,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665509603,
  "seq" 1720019806,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302901617386000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58894,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665509603,
  "seq" 1720019806,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302901617621000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63063,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019813,
  "seq" 1665509603,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302901617654000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58895,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665509867,
  "seq" 1720019813,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302901617701000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58896,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665509867,
  "seq" 1720019813,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302901617874000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63064,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019825,
  "seq" 1665509867,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302901657779000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58897,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665509870,
  "seq" 1720019825,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302901697593000, "wirelen" 165},
 "DataLinkLayer"
 {"index" 0,
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "90:E6:BA:3C:9A:26",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "255.255.255.255",
  "source" "192.168.20.194",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302901697934000, "wirelen" 165},
 "DataLinkLayer"
 {"index" 0,
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "90:E6:BA:3C:9A:26",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.255",
  "source" "192.168.20.194",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302901952227000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302902071640000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:0E",
  "source" "24:B6:57:08:B2:8C",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302902118291000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58898,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665509870,
  "seq" 1720019825,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302902118525000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63065,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019832,
  "seq" 1665509870,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302902118557000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58899,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665510134,
  "seq" 1720019832,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302902118616000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58900,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665510134,
  "seq" 1720019832,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302902118790000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63066,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019844,
  "seq" 1665510134,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302902158778000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58901,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665510137,
  "seq" 1720019844,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302902619447000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58902,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665510137,
  "seq" 1720019844,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302902619685000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63067,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019851,
  "seq" 1665510137,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302902619715000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58903,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665510401,
  "seq" 1720019851,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302902619799000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58904,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665510401,
  "seq" 1720019851,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302902619975000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63068,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019863,
  "seq" 1665510401,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302902659775000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58905,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665510404,
  "seq" 1720019863,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302903120603000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58906,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665510404,
  "seq" 1720019863,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302903120835000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63069,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019870,
  "seq" 1665510404,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302903120865000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58907,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665510668,
  "seq" 1720019870,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302903120937000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58908,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665510668,
  "seq" 1720019870,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302903121113000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63070,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019882,
  "seq" 1665510668,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302903160773000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58909,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665510671,
  "seq" 1720019882,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302903621803000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58910,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665510671,
  "seq" 1720019882,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302903622044000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63071,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019889,
  "seq" 1665510671,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302903622075000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58911,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665510935,
  "seq" 1720019889,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302903622146000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58912,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665510935,
  "seq" 1720019889,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302903622322000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63072,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019901,
  "seq" 1665510935,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302903661775000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58913,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665510938,
  "seq" 1720019901,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302903952176000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302904122849000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58914,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665510938,
  "seq" 1720019901,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302904123077000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63073,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019908,
  "seq" 1665510938,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302904123106000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58915,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665511202,
  "seq" 1720019908,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302904123174000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58916,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665511202,
  "seq" 1720019908,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302904123351000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63074,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019920,
  "seq" 1665511202,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302904162784000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58917,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665511205,
  "seq" 1720019920,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302904623951000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58918,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665511205,
  "seq" 1720019920,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302904624183000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63075,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019927,
  "seq" 1665511205,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302904624210000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58919,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665511469,
  "seq" 1720019927,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302904624261000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58920,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665511469,
  "seq" 1720019927,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302904624435000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63076,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019939,
  "seq" 1665511469,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302904663772000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58921,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665511472,
  "seq" 1720019939,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905124647000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58922,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665511472,
  "seq" 1720019939,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905124882000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63077,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019946,
  "seq" 1665511472,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905124910000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58923,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665511736,
  "seq" 1720019946,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905125872000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58924,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665511736,
  "seq" 1720019946,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905126062000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 63078,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720019958,
  "seq" 1665511736,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905165775000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58925,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665511739,
  "seq" 1720019958,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323264000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57116,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323284000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57117,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323294000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57118,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323303000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57119,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323311000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57120,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323319000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57121,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323327000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57122,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323335000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57123,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323343000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57124,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323352000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57125,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323360000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57126,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323367000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57127,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323372000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57128,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323378000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57129,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323385000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57130,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323393000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57131,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323402000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57132,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323411000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57133,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323420000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57134,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323428000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57135,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323436000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57136,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323443000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57137,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323448000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57138,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323454000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57139,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323462000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57140,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323470000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57141,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323479000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57142,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323488000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57143,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323496000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57144,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323504000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57145,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323512000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57146,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323518000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57147,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323524000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57148,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323529000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57149,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323538000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57150,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323546000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57151,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323554000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57152,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323562000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57153,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323570000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57154,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323576000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57155,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323582000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57156,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323587000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57157,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323592000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57158,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323598000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57159,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323603000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57160,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323608000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57161,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323615000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57162,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323620000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57163,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323629000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57164,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323638000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57165,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323647000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57166,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323652000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57167,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323658000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57168,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323663000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57169,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323671000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57170,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323679000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57171,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323688000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57172,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323696000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57173,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323704000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57174,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323713000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57175,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323721000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57176,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323727000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57177,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323734000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57178,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323743000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57179,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323759000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57180,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323765000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57181,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323774000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57182,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323780000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57183,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323786000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57184,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323792000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57185,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323798000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57186,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323804000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57187,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323810000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57188,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323816000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57189,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323822000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57190,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323828000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57191,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323834000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57192,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323840000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57193,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323846000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57194,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323851000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57195,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323857000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57196,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323863000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57197,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323869000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57198,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323874000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57199,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323880000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57200,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323886000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57201,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323892000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57202,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323898000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57203,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323903000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57204,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323909000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57205,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323915000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57206,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323922000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57207,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323929000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57208,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323935000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57209,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323941000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57210,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323947000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57211,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323953000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57212,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323958000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57213,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323964000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57214,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323970000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57215,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323976000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57216,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323982000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57217,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323987000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57218,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323993000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57219,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905323998000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57220,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324003000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57221,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324009000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57222,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324014000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57223,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324020000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57224,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324025000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57225,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324031000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57226,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324038000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57227,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324044000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57228,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324049000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57229,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324054000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57230,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324060000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57231,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324066000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57232,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324071000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57233,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324076000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57234,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324082000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57235,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324088000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57236,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324095000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57237,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324101000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57238,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324106000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57239,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324111000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57240,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324117000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57241,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324122000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57242,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324128000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57243,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324133000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57244,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324138000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57245,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324144000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57246,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324150000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57247,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324155000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57248,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324161000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57249,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324166000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57250,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324171000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57251,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324177000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57252,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324182000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57253,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324187000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57254,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324193000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57255,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324199000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57256,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324205000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57257,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324211000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57258,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324217000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57259,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324222000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57260,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324228000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57261,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324233000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57262,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324239000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57263,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324246000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57264,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324252000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57265,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324257000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57266,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324263000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57267,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324268000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57268,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324274000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57269,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324279000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57270,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324284000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57271,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324290000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57272,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324295000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57273,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324301000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57274,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324306000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57275,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324313000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57276,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324319000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57277,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324325000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57278,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324331000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57279,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324337000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57280,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324342000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57281,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324348000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57282,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324354000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57283,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324359000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57284,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324364000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57285,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324371000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57286,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324377000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57287,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324382000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57288,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324388000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57289,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324394000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57290,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324399000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57291,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324404000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57292,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324410000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57293,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324415000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57294,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324420000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57295,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324426000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57296,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324432000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57297,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324437000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57298,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324442000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57299,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324448000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57300,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324453000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57301,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324458000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57302,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324464000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57303,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324469000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57304,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324475000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57305,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324480000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57306,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324488000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57307,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324494000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57308,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324500000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57309,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324506000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57310,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324512000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57311,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324517000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57312,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324523000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57313,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324528000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57314,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324534000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57315,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324540000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57316,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324546000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57317,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324551000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57318,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324556000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57319,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324562000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57320,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324567000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57321,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324572000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57322,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324578000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57323,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324583000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57324,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324590000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57325,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324595000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57326,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324601000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57327,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324606000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57328,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324612000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57329,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324617000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57330,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324623000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57331,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324628000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57332,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324633000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57333,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324639000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57334,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324644000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57335,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324649000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57336,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324655000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57337,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324660000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57338,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324666000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57339,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324672000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57340,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324677000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57341,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324682000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57342,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324688000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57343,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324693000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57344,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324699000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57345,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324704000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57346,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324711000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57347,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324718000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57348,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324723000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57349,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324729000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57350,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324735000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57351,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324740000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57352,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324751000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57353,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324758000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57354,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324765000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57355,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324771000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57356,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324777000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57357,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324782000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57358,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324787000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57359,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324793000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57360,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324798000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57361,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324804000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57362,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324809000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57363,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324815000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57364,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324821000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57365,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324826000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57366,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324832000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57367,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324839000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57368,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324844000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57369,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324850000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57370,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324856000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57371,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324861000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57372,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324867000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57373,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324873000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57374,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324879000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57375,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324884000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57376,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324891000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57377,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324898000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57378,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324904000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57379,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324910000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57380,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324915000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57381,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324921000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57382,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324927000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57383,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324933000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57384,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324938000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57385,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324944000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57386,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324951000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57387,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324956000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57388,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324962000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57389,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324967000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57390,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324973000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57391,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324979000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57392,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324984000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57393,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324990000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57394,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905324996000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57395,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325002000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57396,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325008000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57397,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325013000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57398,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325018000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57399,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325024000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57400,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325029000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57401,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325034000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57402,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325040000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57403,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325045000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57404,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325050000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57405,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325056000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57406,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325062000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57407,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325067000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57408,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325073000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57409,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325078000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57410,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325084000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57411,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325090000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57412,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325096000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57413,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325101000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57414,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325106000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57415,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325112000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57416,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325118000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57417,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325123000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57418,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325129000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57419,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325134000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57420,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325140000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57421,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325145000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57422,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325151000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57423,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325157000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57424,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325162000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57425,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325168000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57426,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325173000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57427,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325178000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57428,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325184000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57429,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325190000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57430,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325195000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57431,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325201000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57432,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325206000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57433,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325212000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57434,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325217000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57435,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325223000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57436,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325229000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57437,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325234000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57438,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325239000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57439,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325245000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57440,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325250000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57441,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325256000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57442,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325261000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57443,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325266000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57444,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325272000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57445,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325277000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57446,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325283000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57447,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325289000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57448,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325294000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57449,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325300000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57450,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325305000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57451,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325310000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57452,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325316000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57453,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325321000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57454,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325327000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57455,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325332000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57456,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325338000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57457,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325343000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57458,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325348000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57459,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325354000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57460,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325359000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57461,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325364000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57462,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325370000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57463,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325375000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57464,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325380000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57465,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325386000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57466,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325393000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57467,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325399000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57468,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325405000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57469,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325410000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57470,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325416000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57471,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325421000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57472,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325427000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57473,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325433000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57474,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325438000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57475,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325443000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57476,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325449000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57477,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325455000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57478,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325460000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57479,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325466000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57480,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325471000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57481,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325477000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57482,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325483000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57483,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325488000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57484,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325493000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57485,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325499000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57486,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325505000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57487,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325511000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57488,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325516000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57489,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325522000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57490,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325527000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57491,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325532000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57492,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325538000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57493,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325543000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57494,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325549000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57495,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325554000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57496,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325560000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57497,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325565000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57498,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325570000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57499,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325576000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57500,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325581000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57501,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325588000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57502,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325593000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57503,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325599000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57504,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325604000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57505,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325609000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57506,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325615000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57507,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325621000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57508,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325627000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57509,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325632000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57510,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325638000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57511,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325643000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57512,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325649000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57513,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325654000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57514,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325660000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57515,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325666000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57516,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325671000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57517,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325676000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57518,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325682000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57519,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325687000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57520,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325692000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57521,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325698000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57522,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325703000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57523,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325709000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57524,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325714000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57525,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325720000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57526,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325726000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57527,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325731000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57528,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325737000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57529,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325743000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57530,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325755000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57531,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325761000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57532,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325767000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57533,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325772000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57534,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325777000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57535,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325783000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57536,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325789000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57537,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325794000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57538,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325799000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57539,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325804000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57540,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325810000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57541,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325815000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57542,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325821000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57543,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325826000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57544,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325831000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57545,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325837000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57546,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325844000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57547,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325850000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57548,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325855000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57549,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325860000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57550,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325866000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57551,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325871000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57552,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325877000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57553,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325882000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57554,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325888000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57555,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325894000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57556,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325900000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57557,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325906000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57558,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325912000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57559,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325918000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57560,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325923000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57561,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325928000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57562,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325934000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57563,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325940000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57564,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325945000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57565,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325951000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57566,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325957000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57567,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325962000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57568,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325967000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57569,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325972000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57570,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325978000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57571,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325983000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57572,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325989000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57573,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905325994000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57574,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326000000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57575,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326005000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57576,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326011000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57577,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326017000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57578,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326022000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57579,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326028000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57580,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326034000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57581,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326039000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57582,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326045000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57583,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326050000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57584,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326056000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57585,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326061000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57586,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326068000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57587,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326073000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57588,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326078000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57589,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326084000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57590,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326090000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57591,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326095000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57592,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326101000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57593,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326106000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57594,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326112000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57595,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326117000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57596,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326124000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57597,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326130000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57598,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326135000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57599,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326141000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57600,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326146000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57601,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326151000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57602,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326157000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57603,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326162000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57604,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326167000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57605,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326173000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57606,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326178000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57607,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326184000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57608,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326189000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57609,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326195000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57610,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326200000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57611,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326205000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57612,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326211000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57613,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326216000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57614,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326222000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57615,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326227000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57616,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326234000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57617,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326239000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57618,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326244000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57619,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326250000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57620,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326255000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57621,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326261000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57622,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326266000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57623,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326271000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57624,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326277000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57625,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326282000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57626,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326288000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57627,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326293000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57628,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326299000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57629,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326304000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57630,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326309000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57631,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326315000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57632,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326320000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57633,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326327000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57634,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326332000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57635,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326338000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57636,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326344000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57637,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326350000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57638,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326355000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57639,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326361000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57640,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326366000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57641,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326372000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57642,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326378000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57643,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326384000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57644,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326389000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57645,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326395000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57646,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326401000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57647,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326406000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57648,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326412000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57649,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326417000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57650,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326424000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57651,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326429000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57652,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326435000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57653,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326441000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57654,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326446000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57655,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326451000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57656,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326457000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57657,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326462000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57658,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326468000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57659,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326473000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57660,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326479000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57661,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326484000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57662,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326490000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57663,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326495000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57664,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326501000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57665,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326506000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57666,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326513000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57667,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326520000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57668,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326525000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57669,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326531000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57670,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326536000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57671,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326541000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57672,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326547000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57673,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326552000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57674,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326557000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57675,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326563000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57676,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326568000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57677,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326573000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57678,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326579000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57679,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326584000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57680,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326590000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57681,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326595000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57682,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326600000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57683,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326606000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57684,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326611000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57685,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326617000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57686,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326623000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57687,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326628000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57688,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326634000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57689,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326640000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57690,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326646000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57691,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326651000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57692,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326657000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57693,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326662000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57694,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326668000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57695,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326673000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57696,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326679000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57697,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326684000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57698,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326690000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57699,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326696000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57700,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326701000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57701,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326707000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57702,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326712000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57703,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326718000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57704,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326723000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57705,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326729000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57706,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326735000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57707,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326740000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57708,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326751000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57709,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326757000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57710,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326762000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57711,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326768000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57712,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326774000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57713,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326779000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57714,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326784000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57715,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326790000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57716,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326796000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57717,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326801000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57718,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326806000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57719,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326812000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57720,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326817000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57721,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326823000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57722,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326828000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57723,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326833000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57724,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326839000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57725,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326844000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57726,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326850000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57727,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326855000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57728,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326860000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57729,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326866000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57730,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326871000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57731,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326877000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57732,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326882000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57733,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326887000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57734,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326893000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57735,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326899000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57736,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326905000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57737,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326911000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57738,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326916000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57739,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326922000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57740,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326927000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57741,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326933000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57742,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326938000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57743,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326944000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57744,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326949000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57745,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326954000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57746,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326961000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57747,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326966000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57748,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326972000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57749,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326977000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57750,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326982000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57751,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326988000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57752,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326993000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57753,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905326999000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57754,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327004000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57755,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327010000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57756,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327016000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57757,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327021000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57758,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327027000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57759,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327032000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57760,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327038000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57761,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327044000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57762,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327049000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57763,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327054000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57764,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327060000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57765,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327065000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57766,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327072000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57767,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327077000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57768,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327083000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57769,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327088000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57770,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327094000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57771,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327099000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57772,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327105000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57773,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327110000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57774,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327116000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57775,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327121000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57776,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327127000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57777,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327132000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57778,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327138000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57779,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327143000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57780,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327149000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57781,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327155000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57782,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327160000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57783,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327166000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57784,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327171000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57785,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327176000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57786,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327182000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57787,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327188000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57788,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327193000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57789,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327199000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57790,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327204000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57791,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327210000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57792,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327215000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57793,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327221000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57794,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327226000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57795,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327231000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57796,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327237000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57797,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327242000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57798,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327248000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57799,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327253000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57800,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327259000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57801,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327265000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57802,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327270000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57803,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327275000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57804,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327281000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57805,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327287000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57806,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327292000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57807,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327298000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57808,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327303000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57809,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327308000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57810,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327314000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57811,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327319000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57812,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327324000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57813,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327330000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57814,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327335000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57815,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327341000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57816,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327347000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57817,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327352000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57818,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327357000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57819,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327363000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57820,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327368000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57821,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327373000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57822,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327379000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57823,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327384000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57824,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327389000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57825,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327395000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57826,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327402000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57827,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327408000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57828,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327414000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57829,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327419000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57830,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327425000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57831,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327430000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57832,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327436000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57833,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327441000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57834,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327447000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57835,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327453000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57836,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327459000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57837,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327466000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57838,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327471000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57839,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327476000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57840,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327482000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57841,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327487000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57842,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327493000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57843,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327499000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57844,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327504000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57845,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327510000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57846,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327516000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57847,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327521000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57848,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327526000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57849,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327532000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57850,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327538000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57851,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327544000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57852,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327549000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57853,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327555000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57854,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327560000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57855,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327565000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57856,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327572000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57857,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327578000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57858,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327583000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57859,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327588000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57860,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327594000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57861,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327599000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57862,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327604000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57863,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327610000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57864,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327615000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57865,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327620000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57866,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327626000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57867,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327632000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57868,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327637000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57869,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327642000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57870,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327648000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57871,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327653000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57872,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327658000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57873,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327664000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57874,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327670000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57875,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327675000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57876,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327681000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57877,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327686000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57878,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327691000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57879,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327697000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57880,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327703000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57881,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327709000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57882,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327714000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57883,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327720000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57884,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327725000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57885,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327730000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57886,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327736000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57887,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327741000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57888,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327753000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57889,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327759000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57890,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327765000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57891,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327770000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57892,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327776000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57893,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327781000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57894,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327787000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57895,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327793000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57896,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327799000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57897,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327805000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57898,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327811000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57899,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327816000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57900,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327821000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57901,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327827000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57902,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327832000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57903,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327838000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57904,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327843000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57905,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327848000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57906,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327854000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57907,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327860000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57908,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327865000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57909,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327870000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57910,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327876000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57911,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327881000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57912,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327886000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57913,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327892000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57914,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327897000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57915,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327903000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57916,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327910000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57917,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327916000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57918,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327922000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57919,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327927000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57920,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327933000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57921,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327938000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57922,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327944000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57923,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327949000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57924,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327955000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57925,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327961000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57926,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327967000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57927,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327972000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57928,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327978000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57929,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327983000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57930,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327989000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57931,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905327994000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57932,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328000000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57933,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328005000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57934,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328011000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57935,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328016000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57936,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328022000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57937,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328027000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57938,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328033000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57939,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328038000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57940,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328044000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57941,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328050000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57942,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328055000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57943,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328061000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57944,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328066000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57945,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328072000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57946,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328078000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57947,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328084000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57948,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328089000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57949,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328095000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57950,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328100000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57951,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328106000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57952,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328111000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57953,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328117000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57954,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328122000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57955,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328128000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57956,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328134000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57957,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328141000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57958,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328146000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57959,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328151000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57960,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328157000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57961,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328163000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57962,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328168000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57963,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328173000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57964,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328179000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57965,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328185000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57966,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328192000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57967,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328197000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57968,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328203000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57969,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328208000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57970,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328214000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57971,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328220000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57972,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328225000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57973,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328231000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57974,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328237000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57975,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328242000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57976,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328248000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57977,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328253000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57978,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328258000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57979,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328264000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57980,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328269000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57981,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328274000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57982,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328280000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57983,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328285000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57984,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328291000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57985,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328297000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57986,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328302000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57987,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328308000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57988,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328313000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57989,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328318000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57990,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328324000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57991,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328329000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57992,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328335000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57993,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328341000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57994,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328346000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57995,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328352000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57996,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328357000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57997,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328363000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57998,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328368000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 57999,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328373000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58000,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328379000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58001,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328384000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58002,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328390000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58003,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328395000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58004,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328401000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58005,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328407000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58006,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328413000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58007,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328418000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58008,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328423000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58009,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328429000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58010,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328434000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58011,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328440000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58012,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328445000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58013,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328450000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58014,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328456000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58015,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328461000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58016,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328467000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58017,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328472000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58018,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328478000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58019,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328483000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58020,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328488000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58021,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328494000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58022,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328499000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58023,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328504000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58024,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328510000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58025,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328516000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58026,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328522000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58027,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328528000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58028,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328533000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58029,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328538000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58030,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328543000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58031,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328549000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58032,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328554000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58033,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328559000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58034,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328565000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58035,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328570000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58036,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328576000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58037,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328581000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58038,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328587000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58039,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328592000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58040,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328597000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58041,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328603000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58042,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328609000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58043,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328614000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58044,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328620000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58045,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328626000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58046,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328632000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58047,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328637000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58048,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328643000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58049,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328648000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58050,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328654000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58051,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328659000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58052,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328665000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58053,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328670000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58054,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328675000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58055,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328681000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58056,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328687000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58057,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328692000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58058,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328697000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58059,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328703000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58060,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328708000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58061,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328714000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58062,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328719000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58063,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328724000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58064,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328730000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58065,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328735000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58066,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328741000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58067,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328843000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58068,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328862000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58069,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328878000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58070,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328893000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58071,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328908000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58072,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328924000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58073,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328940000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58074,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328954000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58075,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328972000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58076,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328983000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58077,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905328995000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58078,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329006000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58079,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329018000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58080,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329030000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58081,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329041000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58082,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329053000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58083,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329064000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58084,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329076000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58085,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329087000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58086,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329098000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58087,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329109000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58088,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329120000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58089,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329132000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58090,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329143000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58091,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329155000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58092,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329166000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58093,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329177000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58094,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329188000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58095,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329200000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58096,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329211000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58097,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329223000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58098,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329234000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58099,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329245000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58100,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329267000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58101,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329279000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58102,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329290000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58103,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329303000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58104,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329314000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58105,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329325000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58106,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329337000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58107,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329349000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58108,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329360000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58109,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329371000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58110,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329382000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58111,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329394000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58112,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329405000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58113,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329416000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58114,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329428000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58115,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329439000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58116,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329450000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58117,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329461000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58118,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329473000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58119,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329484000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58120,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329496000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58121,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329507000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58122,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329518000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58123,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329530000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58124,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329541000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58125,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329552000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58126,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329564000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58127,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329575000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58128,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329586000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58129,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329597000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58130,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329609000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58131,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329620000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58132,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329631000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58133,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329642000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58134,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329654000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58135,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329665000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58136,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329676000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58137,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329687000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58138,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329698000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58139,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329710000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58140,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329721000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58141,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329732000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58142,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329744000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58143,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329762000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58144,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329773000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58145,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329784000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58146,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329807000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58147,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329818000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58148,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329830000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58149,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329841000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58150,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329852000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58151,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329864000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58152,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329875000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58153,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329886000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58154,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329897000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58155,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329908000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58156,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329920000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58157,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329931000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58158,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329942000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58159,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329953000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58160,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329965000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58161,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329976000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58162,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329987000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58163,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905329998000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58164,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330009000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58165,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330020000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58166,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330032000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58167,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330043000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58168,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330055000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58169,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330066000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58170,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330077000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58171,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330089000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58172,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330100000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58173,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330111000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58174,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330122000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58175,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330133000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58176,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330145000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58177,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330156000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58178,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330168000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58179,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330179000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58180,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330190000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58181,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330201000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58182,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330212000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58183,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330224000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58184,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330235000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58185,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330246000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58186,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330258000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58187,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330269000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58188,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330280000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58189,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330291000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58190,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330302000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58191,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330323000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58192,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330335000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58193,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330346000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58194,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330357000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58195,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330368000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58196,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330380000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58197,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330392000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58198,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330403000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58199,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330414000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58200,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330425000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58201,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330437000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58202,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330448000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58203,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330459000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58204,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330470000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58205,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330481000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58206,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330493000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58207,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330504000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58208,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330516000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58209,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330527000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58210,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330538000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58211,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330549000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58212,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330561000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58213,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330572000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58214,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330583000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58215,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330594000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58216,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330606000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58217,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330617000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58218,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330628000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58219,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330640000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58220,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330651000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58221,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330662000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58222,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330673000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58223,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330685000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58224,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330696000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58225,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330707000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58226,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330719000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58227,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330730000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58228,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330741000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58229,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330758000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58230,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330769000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58231,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330781000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58232,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330793000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58233,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330804000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58234,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330816000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58235,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330827000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58236,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330839000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58237,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330861000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58238,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330872000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58239,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330883000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58240,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330894000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58241,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330906000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58242,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330917000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58243,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330928000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58244,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330939000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58245,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330951000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58246,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330962000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58247,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330973000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58248,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330984000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58249,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905330996000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58250,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331007000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58251,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331018000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58252,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331030000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58253,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331041000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58254,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331052000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58255,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331064000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58256,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331075000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58257,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331087000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58258,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331098000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58259,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331109000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58260,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331120000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58261,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331131000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58262,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331142000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58263,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331154000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58264,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331165000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58265,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331176000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58266,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331188000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58267,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331199000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58268,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331210000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58269,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331222000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58270,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331233000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58271,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331244000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58272,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331255000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58273,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331266000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58274,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331277000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58275,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331288000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58276,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331300000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58277,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331311000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58278,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331322000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58279,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331333000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58280,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331345000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58281,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331356000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58282,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331377000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58283,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331388000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58284,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331399000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58285,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331411000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58286,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331423000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58287,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331434000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58288,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331445000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58289,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331457000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58290,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331469000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58291,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331480000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58292,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331491000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58293,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331502000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58294,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331513000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58295,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331524000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58296,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331536000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58297,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331547000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58298,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331558000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58299,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331569000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58300,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331580000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58301,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331592000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58302,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331603000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58303,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331614000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58304,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331625000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58305,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331636000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58306,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331648000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58307,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331659000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58308,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331670000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58309,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331681000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58310,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331692000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58311,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331704000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58312,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331715000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58313,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331726000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58314,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331737000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58315,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331753000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58316,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331765000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58317,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331776000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58318,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331787000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58319,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331798000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58320,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331810000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58321,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331821000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58322,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331832000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58323,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331843000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58324,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331854000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58325,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331865000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58326,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331877000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58327,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331888000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58328,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331910000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58329,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331921000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58330,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331932000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58331,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331944000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58332,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331955000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58333,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331966000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58334,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331977000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58335,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905331988000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58336,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332000000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58337,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332011000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58338,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332022000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58339,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332033000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58340,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332045000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58341,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332056000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58342,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332067000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58343,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332078000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58344,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332089000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58345,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332100000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58346,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332112000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58347,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332123000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58348,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332135000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58349,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332146000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58350,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332157000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58351,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332168000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58352,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332179000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58353,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332191000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58354,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332202000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58355,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332213000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58356,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332225000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58357,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332236000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58358,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332247000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58359,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332258000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58360,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332269000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58361,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332281000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58362,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332292000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58363,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332303000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58364,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332314000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58365,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332325000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58366,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332337000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58367,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332348000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58368,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332359000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58369,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332371000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58370,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332382000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58371,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332393000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58372,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332404000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58373,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332425000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58374,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332436000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58375,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332448000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58376,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332459000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58377,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332471000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58378,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332482000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58379,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332493000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58380,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332504000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58381,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332515000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58382,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332526000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58383,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332538000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58384,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332549000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58385,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332560000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58386,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332572000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58387,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332583000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58388,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332594000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58389,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332605000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58390,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332616000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58391,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332627000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58392,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332639000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58393,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332650000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58394,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332661000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58395,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332672000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58396,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332684000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58397,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332695000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58398,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332706000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58399,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332717000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58400,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332728000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58401,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332740000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58402,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332756000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58403,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332768000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58404,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332779000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58405,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332790000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58406,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332802000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58407,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332813000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58408,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332824000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58409,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332835000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58410,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332847000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58411,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332858000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58412,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332869000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58413,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332880000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58414,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332891000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58415,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332902000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58416,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332914000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58417,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332925000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58418,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332936000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58419,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332958000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58420,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332969000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58421,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332981000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58422,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905332992000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58423,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333003000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58424,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333015000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58425,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333022000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58426,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333029000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58427,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333034000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58428,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333038000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58429,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333043000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58430,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333047000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58431,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333052000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58432,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333057000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58433,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333061000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58434,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333065000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58435,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333070000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58436,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333074000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58437,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333079000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58438,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333083000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58439,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333088000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58440,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333093000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58441,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333098000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58442,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333102000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58443,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333107000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58444,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333111000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58445,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333115000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58446,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333120000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58447,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333124000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58448,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333129000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58449,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333133000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58450,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333137000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58451,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333142000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58452,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333146000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58453,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333151000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58454,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333156000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58455,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333160000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58456,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333165000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58457,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333169000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58458,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333174000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58459,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333178000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58460,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333183000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58461,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333187000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58462,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333192000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58463,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333196000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58464,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333200000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58465,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333204000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58466,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333208000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58467,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333213000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58468,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333218000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58469,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333222000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58470,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333226000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58471,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333230000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58472,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333235000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58473,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333239000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58474,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333243000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58475,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333248000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58476,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333252000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58477,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333257000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58478,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333262000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58479,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333267000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58480,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333271000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58481,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333275000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58482,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333279000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58483,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333283000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58484,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333287000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58485,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333292000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58486,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333296000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58487,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333300000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58488,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333305000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58489,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333309000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58490,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333314000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58491,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333318000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58492,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333322000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58493,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333326000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58494,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333331000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58495,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333335000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58496,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333339000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58497,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333344000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58498,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333349000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58499,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333353000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58500,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333358000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58501,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333362000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58502,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333367000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58503,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333371000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58504,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333375000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58505,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333379000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58506,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333384000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58507,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333388000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58508,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333393000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58509,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333397000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58510,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333401000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58511,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333406000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58512,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333410000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58513,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333414000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58514,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333419000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58515,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333424000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58516,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333429000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58517,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333433000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58518,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333438000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58519,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333442000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58520,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333447000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58521,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333451000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58522,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333455000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58523,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333460000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58524,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333465000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58525,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333469000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58526,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333474000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58527,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333478000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58528,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333483000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58529,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333487000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58530,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333491000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58531,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333496000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58532,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333500000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58533,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333505000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58534,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333509000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58535,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333514000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58536,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333518000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58537,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333523000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58538,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333527000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58539,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333531000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58540,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333536000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58541,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333540000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58542,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333544000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58543,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333549000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58544,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333553000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58545,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333557000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58546,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333561000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58547,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333566000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58548,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333571000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58549,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333575000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58550,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333579000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58551,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333583000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58552,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333588000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58553,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333592000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58554,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333596000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58555,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333600000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58556,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333604000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58557,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333608000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58558,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333613000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58559,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333617000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58560,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333621000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58561,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333626000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58562,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333630000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58563,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333634000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58564,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333638000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58565,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333642000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58566,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333647000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58567,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333651000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58568,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333655000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58569,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333659000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58570,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333664000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58571,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333669000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58572,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333673000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58573,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333678000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58574,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333682000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58575,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333686000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58576,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333690000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58577,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333694000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58578,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333699000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58579,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333704000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58580,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333709000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58581,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333713000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58582,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333717000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58583,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333722000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58584,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333726000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58585,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333730000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58586,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333734000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58587,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333738000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58588,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333743000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58589,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333754000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58590,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333759000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58591,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333764000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58592,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333768000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58593,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333772000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58594,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333777000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58595,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333781000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58596,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333785000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58597,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333790000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58598,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333795000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58599,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333799000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58600,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333804000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58601,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333811000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58602,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333815000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58603,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333820000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58604,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333824000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58605,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333829000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58606,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333833000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58607,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333838000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58608,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333843000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58609,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333848000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58610,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333852000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58611,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333857000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58612,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333861000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58613,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333865000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58614,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333870000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58615,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333875000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58616,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333879000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58617,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333883000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58618,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333888000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58619,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333892000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58620,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333897000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 58621,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302905333902000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
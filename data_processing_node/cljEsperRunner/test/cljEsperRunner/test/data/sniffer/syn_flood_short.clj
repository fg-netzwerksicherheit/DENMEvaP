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
The source IP address was randomized. This is an excerpt of the full data"
    :raw-file "syn_flood_sender_rand_2012-11-07.out"
    :date "2012-11-07"}
   cljEsperRunner.test.data.sniffer.syn-flood-short)

(def data-set [
{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756497000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "48.0.234.64",
  "id" 47132,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756507000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "95.250.16.0",
  "id" 47133,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756518000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "41.126.179.64",
  "id" 47134,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756527000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "171.186.164.0",
  "id" 47135,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756537000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "200.155.208.0",
  "id" 47136,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756547000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "63.139.153.64",
  "id" 47137,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756556000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "204.182.254.0",
  "id" 47138,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756566000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "18.223.217.64",
  "id" 47139,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756576000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "8.61.215.64",
  "id" 47140,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756585000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "193.2.15.0",
  "id" 47141,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756595000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "63.51.112.0",
  "id" 47142,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756604000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "1.139.24.22",
  "id" 47143,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}])

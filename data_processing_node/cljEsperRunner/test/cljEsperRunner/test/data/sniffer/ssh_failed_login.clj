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
    :description "Complete TCP connection of an SSH login attempt that ultimately failed due to not entering the correct password. Actually, already the user did not exist."
    :raw-file "ssh_failed_login_2012-08-21.out"
    :date "2012-08-21"}
   cljEsperRunner.test.data.sniffer.ssh-failed-login)

(def data-set [

{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607641741000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 18354,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 22,
  "source" 37261,
  "ack" 0,
  "seq" 468799824,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607641918000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 37261,
  "source" 22,
  "ack" 468799825,
  "seq" 4259079952,
  "flags" #{"SYN" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607641962000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 18355,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 22,
  "source" 37261,
  "ack" 4259079953,
  "seq" 468799825,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607648516000, "wirelen" 98},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 23431,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 37261,
  "source" 22,
  "ack" 468799825,
  "seq" 4259079953,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607648570000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 18356,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 22,
  "source" 37261,
  "ack" 4259079985,
  "seq" 468799825,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607648654000, "wirelen" 87},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 18357,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 22,
  "source" 37261,
  "ack" 4259079985,
  "seq" 468799825,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607648815000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 23432,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 37261,
  "source" 22,
  "ack" 468799846,
  "seq" 4259079985,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607648906000, "wirelen" 1098},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 18358,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 22,
  "source" 37261,
  "ack" 4259079985,
  "seq" 468799846,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607649300000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 23433,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 37261,
  "source" 22,
  "ack" 468800878,
  "seq" 4259079985,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607649736000, "wirelen" 922},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 23434,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 37261,
  "source" 22,
  "ack" 468800878,
  "seq" 4259079985,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607649854000, "wirelen" 90},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 18359,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 22,
  "source" 37261,
  "ack" 4259080841,
  "seq" 468800878,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607652030000, "wirelen" 218},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 23435,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 37261,
  "source" 22,
  "ack" 468800902,
  "seq" 4259080841,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607652827000, "wirelen" 210},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 18360,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 22,
  "source" 37261,
  "ack" 4259080993,
  "seq" 468800902,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607660187000, "wirelen" 786},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 23436,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 37261,
  "source" 22,
  "ack" 468801046,
  "seq" 4259080993,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607661053000, "wirelen" 82},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 18361,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 22,
  "source" 37261,
  "ack" 4259081713,
  "seq" 468801046,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607700305000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 23437,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 37261,
  "source" 22,
  "ack" 468801062,
  "seq" 4259081713,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607700344000, "wirelen" 114},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 18362,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 22,
  "source" 37261,
  "ack" 4259081713,
  "seq" 468801062,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607700496000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 23438,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 37261,
  "source" 22,
  "ack" 468801110,
  "seq" 4259081713,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607700505000, "wirelen" 114},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 23439,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 37261,
  "source" 22,
  "ack" 468801110,
  "seq" 4259081713,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607700595000, "wirelen" 146},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 18363,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 22,
  "source" 37261,
  "ack" 4259081761,
  "seq" 468801110,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607702444000, "wirelen" 146},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 23440,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 37261,
  "source" 22,
  "ack" 468801190,
  "seq" 4259081761,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607702543000, "wirelen" 434},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 18364,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 22,
  "source" 37261,
  "ack" 4259081841,
  "seq" 468801190,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607702958000, "wirelen" 146},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 23441,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 37261,
  "source" 22,
  "ack" 468801558,
  "seq" 4259081841,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607703021000, "wirelen" 162},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 18365,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 22,
  "source" 37261,
  "ack" 4259081921,
  "seq" 468801558,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607705206000, "wirelen" 130},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 23442,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 37261,
  "source" 22,
  "ack" 468801654,
  "seq" 4259081921,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607705467000, "wirelen" 146},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 18366,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 22,
  "source" 37261,
  "ack" 4259081985,
  "seq" 468801654,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544607745312000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 23443,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 37261,
  "source" 22,
  "ack" 468801734,
  "seq" 4259081985,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544609870873000, "wirelen" 146},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 23444,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 37261,
  "source" 22,
  "ack" 468801734,
  "seq" 4259081985,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544609870969000, "wirelen" 162},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 18367,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 22,
  "source" 37261,
  "ack" 4259082065,
  "seq" 468801734,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544609871349000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 23445,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 37261,
  "source" 22,
  "ack" 468801830,
  "seq" 4259082065,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544609872222000, "wirelen" 130},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 23446,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 37261,
  "source" 22,
  "ack" 468801830,
  "seq" 4259082065,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544609872856000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 18368,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 22,
  "source" 37261,
  "ack" 4259082129,
  "seq" 468801830,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544609874056000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 23447,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 37261,
  "source" 22,
  "ack" 468801831,
  "seq" 4259082129,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1345544609874083000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 18369,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 22,
  "source" 37261,
  "ack" 4259082130,
  "seq" 468801831,
  "flags" #{"ACK"}}}}
])

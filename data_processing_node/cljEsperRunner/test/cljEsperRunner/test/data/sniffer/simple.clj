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
    :doc "Sniffer sample data"}
  cljEsperRunner.test.data.sniffer.simple)

(def tcp-destination-port-80-syn
  {"sniffer.header.parsed"
   {"PcapHeader" {"timestampInNanos" 1329381150782546000, "wirelen" 74},
    "DataLinkLayer"
    {"index" 0,
     "ProtocolType" "Ethernet",
     "destination" "E0:91:F5:CE:B1:67",
     "source" "74:DE:2B:08:78:09",
     "next" 2},
    "NetworkLayer"
    {"index" 1,
     "ProtocolType" "Ip4",
     "destination" "74.200.247.188",
     "source" "192.168.1.6",
     "id" 42253,
     "tos" 0,
     "ttl" 64,
     "next" 4},
    "Tcp"
    {"index" 2,
     "destination" 80,
     "source" 34099,
     "ack" 0,
     "seq" 1580041357,
     "flags" #{"SYN"},
     "tsval" 52306304}}}
  )

(def icmp-echo-request
  {"sniffer.header.parsed"
   {"PcapHeader" {"timestampInNanos" 1328783776480294000, "wirelen" 98},
    "DataLinkLayer" {"index" 0, "ProtocolType" "Ethernet",
                     "destination" "00:0F:CD:55:82:0A", "source" "E8:9D:87:B1:45:2F", "next" 2},
    "NetworkLayer" {"index" 1, "ProtocolType" "Ip4",
                    "destination" "173.194.34.248", "source" "10.141.155.60",
                    "id" 0, "tos" 0, "ttl" 64, "next" 12},
    "Icmp" {"index" 2, "typeDescription" "echo request", "next" 0}}}
  )

(def icmp-echo-reply
  {"sniffer.header.parsed"
   {"PcapHeader" {"timestampInNanos" 1328783776495754000, "wirelen" 98},
    "DataLinkLayer" {"index" 0, "ProtocolType" "Ethernet",
                     "destination" "E8:9D:87:B1:45:2F", "source" "00:0F:CD:55:82:0A", "next" 2},
    "NetworkLayer" {"index" 1, "ProtocolType" "Ip4",
                    "destination" "10.141.155.60", "source" "173.194.34.248",
                    "id" 52900, "tos" 0, "ttl" 50,"next" 12},
    "Icmp" {"index" 2, "typeDescription" "echo reply", "next" 0}}}
  )

(def tcp-connection-established
  [
   {"sniffer.header.parsed"
    {"PcapHeader" {"timestampInNanos" 1329381150782546000, "wirelen" 74},
     "DataLinkLayer"
     {"index" 0,
      "ProtocolType" "Ethernet",
      "destination" "E0:91:F5:CE:B1:67",
      "source" "74:DE:2B:08:78:09",
      "next" 2},
     "NetworkLayer"
     {"index" 1,
      "ProtocolType" "Ip4",
      "destination" "74.200.247.188",
      "source" "192.168.1.6",
      "id" 42253,
      "tos" 0,
      "type" 6,
      "ttl" 64,
      "next" 4},
     "Tcp"
     {"index" 2,
      "destination" 80,
      "source" 34099,
      "ack" 0,
      "seq" 1580041357,
      "flags" #{"SYN"},
      "tsval" 52306304}}}
   {"sniffer.header.parsed"
    {"PcapHeader" {"timestampInNanos" 1329381150941520000, "wirelen" 74},
     "DataLinkLayer"
     {"index" 0,
      "ProtocolType" "Ethernet",
      "destination" "74:DE:2B:08:78:09",
      "source" "E0:91:F5:CE:B1:67",
      "next" 2},
     "NetworkLayer"
     {"index" 1,
      "ProtocolType" "Ip4",
      "destination" "192.168.1.6",
      "source" "74.200.247.188",
      "id" 0,
      "tos" 0,
      "type" 6,
      "ttl" 47,
      "next" 4},
     "Tcp"
     {"index" 2,
      "destination" 34099,
      "source" 80,
      "ack" 1580041358,
      "seq" 1439216712,
      "flags" #{"SYN" "ACK"},
      "tsval" 332061901,
      "tsecr" 52306304}}}
   {"sniffer.header.parsed"
    {"PcapHeader" {"timestampInNanos" 1329381150941549000, "wirelen" 66},
     "DataLinkLayer"
     {"index" 0,
      "ProtocolType" "Ethernet",
      "destination" "E0:91:F5:CE:B1:67",
      "source" "74:DE:2B:08:78:09",
      "next" 2},
     "NetworkLayer"
     {"index" 1,
      "ProtocolType" "Ip4",
      "destination" "74.200.247.188",
      "source" "192.168.1.6",
      "id" 42254,
      "tos" 0,
      "type" 6,
      "ttl" 64,
      "next" 4},
     "Tcp"
     {"index" 2,
      "destination" 80,
      "source" 34099,
      "ack" 1439216713,
      "seq" 1580041358,
      "flags" #{"ACK"},
      "tsval" 52306463,
      "tsecr" 332061901}}}
   ]
  )

(def tcp-connection-finished
  [{"sniffer.header.parsed"
    {"PcapHeader" {"timestampInNanos" 1329381151090611000, "wirelen" 66},
     "DataLinkLayer"
     {"index" 0,
      "ProtocolType" "Ethernet",
      "destination" "74:DE:2B:08:78:09",
      "source" "E0:91:F5:CE:B1:67",
      "next" 2},
     "NetworkLayer"
     {"index" 1,
      "ProtocolType" "Ip4",
      "destination" "192.168.1.6",
      "source" "74.200.247.188",
      "id" 26805,
      "tos" 0,
      "ttl" 47,
      "next" 4},
     "Tcp"
     {"index" 2,
      "destination" 34099,
      "source" 80,
      "ack" 1580042435,
      "seq" 1439216963,
      "flags" #{"ACK" "FIN"},
      "tsval" 332061945,
      "tsecr" 52306463}}}
   {"sniffer.header.parsed"
    {"PcapHeader" {"timestampInNanos" 1329381151091671000, "wirelen" 66},
     "DataLinkLayer"
     {"index" 0,
      "ProtocolType" "Ethernet",
      "destination" "E0:91:F5:CE:B1:67",
      "source" "74:DE:2B:08:78:09",
      "next" 2},
     "NetworkLayer"
     {"index" 1,
      "ProtocolType" "Ip4",
      "destination" "74.200.247.188",
      "source" "192.168.1.6",
      "id" 42258,
      "tos" 0,
      "ttl" 64,
      "next" 4},
     "Tcp"
     {"index" 2,
      "destination" 80,
      "source" 34099,
      "ack" 1439216964,
      "seq" 1580042435,
      "flags" #{"ACK" "FIN"},
      "tsval" 52306613,
      "tsecr" 332061945}}}
   {"sniffer.header.parsed"
    {"PcapHeader" {"timestampInNanos" 1329381151327096000, "wirelen" 66},
     "DataLinkLayer"
     {"index" 0,
      "ProtocolType" "Ethernet",
      "destination" "74:DE:2B:08:78:09",
      "source" "E0:91:F5:CE:B1:67",
      "next" 2},
     "NetworkLayer"
     {"index" 1,
      "ProtocolType" "Ip4",
      "destination" "192.168.1.6",
      "source" "74.200.247.188",
      "id" 26806,
      "tos" 0,
      "ttl" 47,
      "next" 4},
     "Tcp"
     {"index" 2,
      "destination" 34099,
      "source" 80,
      "ack" 1580042436,
      "seq" 1439216964,
      "flags" #{"ACK"},
      "tsval" 332061978,
      "tsecr" 52306613}}}
   ]
  )

(def tcp-connection-established-localhost-ip6
  [{"sniffer.header.parsed"
    {"PcapHeader" {"timestampInNanos" 1329481006759367000, "wirelen" 94},
     "DataLinkLayer"
     {"index" 0,
      "ProtocolType" "Ethernet",
      "destination" "00:00:00:00:00:00",
      "source" "00:00:00:00:00:00",
      "next" 3},
     "NetworkLayer"
     {"index" 1,
      "ProtocolType" "Ip6",
      "destination" "::0001",
      "source" "::0001",
      "flowLabel" 0,
      "hopLimit" 64,
      "trafficClass" 0,
      "next" 4},
     "Tcp"
     {"index" 2,
      "destination" 37183,
      "source" 47513,
      "ack" 0,
      "seq" 4204641715,
      "flags" #{"SYN"},
      "tsval" 22319495}}}
   {"sniffer.header.parsed"
    {"PcapHeader" {"timestampInNanos" 1329481006759394000, "wirelen" 94},
     "DataLinkLayer"
     {"index" 0,
      "ProtocolType" "Ethernet",
      "destination" "00:00:00:00:00:00",
      "source" "00:00:00:00:00:00",
      "next" 3},
     "NetworkLayer"
     {"index" 1,
      "ProtocolType" "Ip6",
      "destination" "::0001",
      "source" "::0001",
      "flowLabel" 0,
      "hopLimit" 64,
      "trafficClass" 0,
      "next" 4},
     "Tcp"
     {"index" 2,
      "destination" 47513,
      "source" 37183,
      "ack" 4204641716,
      "seq" 780423268,
      "flags" #{"SYN" "ACK"},
      "tsval" 22319495,
      "tsecr" 22319495}}}
   {"sniffer.header.parsed"
    {"PcapHeader" {"timestampInNanos" 1329481006759416000, "wirelen" 86},
     "DataLinkLayer"
     {"index" 0,
      "ProtocolType" "Ethernet",
      "destination" "00:00:00:00:00:00",
      "source" "00:00:00:00:00:00",
      "next" 3},
     "NetworkLayer"
     {"index" 1,
      "ProtocolType" "Ip6",
      "destination" "::0001",
      "source" "::0001",
      "flowLabel" 0,
      "hopLimit" 64,
      "trafficClass" 0,
      "next" 4},
     "Tcp"
     {"index" 2,
      "destination" 37183,
      "source" 47513,
      "ack" 780423269,
      "seq" 4204641716,
      "flags" #{"ACK"},
      "tsval" 22319495,
      "tsecr" 22319495}}}
   ]
  )

(def tcp-connection-finished-localhost-ip6
  [{"sniffer.header.parsed"
    {"PcapHeader" {"timestampInNanos" 1329481006759465000, "wirelen" 86},
     "DataLinkLayer"
     {"index" 0,
      "ProtocolType" "Ethernet",
      "destination" "00:00:00:00:00:00",
      "source" "00:00:00:00:00:00",
      "next" 3},
     "NetworkLayer"
     {"index" 1,
      "ProtocolType" "Ip6",
      "destination" "::0001",
      "source" "::0001",
      "flowLabel" 0,
      "hopLimit" 64,
      "trafficClass" 0,
      "next" 4},
     "Tcp"
     {"index" 2,
      "destination" 37183,
      "source" 47513,
      "ack" 780423269,
      "seq" 4204641716,
      "flags" #{"ACK" "FIN"},
      "tsval" 22319495,
      "tsecr" 22319495}}}
   {"sniffer.header.parsed"
    {"PcapHeader" {"timestampInNanos" 1329481006759811000, "wirelen" 86},
     "DataLinkLayer"
     {"index" 0,
      "ProtocolType" "Ethernet",
      "destination" "00:00:00:00:00:00",
      "source" "00:00:00:00:00:00",
      "next" 3},
     "NetworkLayer"
     {"index" 1,
      "ProtocolType" "Ip6",
      "destination" "::0001",
      "source" "::0001",
      "flowLabel" 0,
      "hopLimit" 64,
      "trafficClass" 0,
      "next" 4},
     "Tcp"
     {"index" 2,
      "destination" 47513,
      "source" 37183,
      "ack" 4204641717,
      "seq" 780423269,
      "flags" #{"ACK" "FIN"},
      "tsval" 22319495,
      "tsecr" 22319495}}}
   {"sniffer.header.parsed"
    {"PcapHeader" {"timestampInNanos" 1329481006759827000, "wirelen" 86},
     "DataLinkLayer"
     {"index" 0,
      "ProtocolType" "Ethernet",
      "destination" "00:00:00:00:00:00",
      "source" "00:00:00:00:00:00",
      "next" 3},
     "NetworkLayer"
     {"index" 1,
      "ProtocolType" "Ip6",
      "destination" "::0001",
      "source" "::0001",
      "flowLabel" 0,
      "hopLimit" 64,
      "trafficClass" 0,
      "next" 4},
     "Tcp"
     {"index" 2,
      "destination" 37183,
      "source" 47513,
      "ack" 780423270,
      "seq" 4204641717,
      "flags" #{"ACK"},
      "tsval" 22319495,
      "tsecr" 22319495}}}
   ]
  )

(def arp-reply
{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821231418711000, "wirelen" 42},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "E8:9D:87:B1:45:2F",
  "targetIp" "192.168.20.189",
  "sourceMac" "90:E6:BA:3C:9A:47",
  "sourceIp" "192.168.20.126"}}})

(def arp-request
{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821232704740000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "90:E6:BA:3C:9A:B4",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REQUEST",
  "targetMac" "00:00:00:00:00:00",
  "targetIp" "192.168.20.120",
  "sourceMac" "90:E6:BA:3C:9A:B4",
  "sourceIp" "192.168.20.134",
  "next" 0}}})


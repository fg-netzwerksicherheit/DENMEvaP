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
    :description "ARP spoofing attack with the newer version of cljNetPcap.
The attack was performed twice in order and had been stopped in between."
    :raw-file "arp_spoofing_attack_victim_2012-11-13.out"
    :date "2012-11-13"}
   cljEsperRunner.test.data.sniffer.arp-spoofing-attack-victim-2012-11-13)

(def data-set [
{:help false, :stats 0, :filter "", :interface "em1"}
{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821228223857000, "wirelen" 154},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "00:1F:16:11:11:21",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "255.255.255.255",
  "source" "192.168.20.105",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821228224201000, "wirelen" 154},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "00:1F:16:11:11:21",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.255",
  "source" "192.168.20.105",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821229209714000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821231148907000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:0E",
  "source" "24:B6:57:08:B2:8C",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821231209663000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821231418251000, "wirelen" 167},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "213.239.200.187",
  "source" "192.168.20.126",
  "id" 50883,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 5222,
  "source" 55511,
  "ack" 1537330967,
  "seq" 2420648774,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821231418682000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REQUEST",
  "targetMac" "00:00:00:00:00:00",
  "targetIp" "192.168.20.126",
  "sourceMac" "E8:9D:87:B1:45:2F",
  "sourceIp" "192.168.20.189",
  "next" 0}}}


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
  "sourceIp" "192.168.20.126"}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821231419015000, "wirelen" 195},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.189",
  "id" 62888,
  "tos" 192,
  "ttl" 64,
  "next" 12},
 "Icmp" {"index" 2, "typeDescription" "redirect", "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821231634050000, "wirelen" 167},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "213.239.200.187",
  "source" "192.168.20.126",
  "id" 50884,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 5222,
  "source" 55511,
  "ack" 1537330967,
  "seq" 2420648774,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821231634429000, "wirelen" 195},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.189",
  "id" 62889,
  "tos" 192,
  "ttl" 64,
  "next" 12},
 "Icmp" {"index" 2, "typeDescription" "redirect", "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821232067047000, "wirelen" 167},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "213.239.200.187",
  "source" "192.168.20.126",
  "id" 50885,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 5222,
  "source" 55511,
  "ack" 1537330967,
  "seq" 2420648774,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821232067438000, "wirelen" 195},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.189",
  "id" 62890,
  "tos" 192,
  "ttl" 64,
  "next" 12},
 "Icmp" {"index" 2, "typeDescription" "redirect", "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821232209915000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E8:9D:87:B1:45:2F",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821232934043000, "wirelen" 167},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "213.239.200.187",
  "source" "192.168.20.126",
  "id" 50886,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 5222,
  "source" 55511,
  "ack" 1537330967,
  "seq" 2420648774,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821232934456000, "wirelen" 195},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.189",
  "id" 62891,
  "tos" 192,
  "ttl" 64,
  "next" 12},
 "Icmp" {"index" 2, "typeDescription" "redirect", "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821233209598000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821233468760000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821234468891000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821234666046000, "wirelen" 167},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "213.239.200.187",
  "source" "192.168.20.126",
  "id" 50887,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 5222,
  "source" 55511,
  "ack" 1537330967,
  "seq" 2420648774,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821234666458000, "wirelen" 195},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.189",
  "id" 62892,
  "tos" 192,
  "ttl" 64,
  "next" 12},
 "Icmp" {"index" 2, "typeDescription" "redirect", "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821235209551000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821237209509000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821238126042000, "wirelen" 167},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "213.239.200.187",
  "source" "192.168.20.126",
  "id" 50888,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 5222,
  "source" 55511,
  "ack" 1537330967,
  "seq" 2420648774,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821238126442000, "wirelen" 195},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.189",
  "id" 62893,
  "tos" 192,
  "ttl" 64,
  "next" 12},
 "Icmp" {"index" 2, "typeDescription" "redirect", "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821238524735000, "wirelen" 165},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "90:E6:BA:3C:9A:26",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "255.255.255.255",
  "source" "192.168.20.194",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821238525055000, "wirelen" 165},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "90:E6:BA:3C:9A:26",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.255",
  "source" "192.168.20.194",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821239209450000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821241209404000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821242210336000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E8:9D:87:B1:45:2F",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821242706072000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821243209362000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821243469065000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821243541201000, "wirelen" 161},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "33:33:00:01:00:02",
  "source" "B4:B5:2F:F4:95:5D",
  "next" 3},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip6",
  "destination" "0FF02::0001:0002",
  "source" "0FE080::0B60B5:2F0FF:0FE0F4:0955D",
  "flowLabel" 0,
  "hopLimit" 1,
  "trafficClass" 0,
  "next" 5},
 "Udp" {"index" 2, "destination" 547, "source" 546}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821244469195000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821245054080000, "wirelen" 167},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "213.239.200.187",
  "source" "192.168.20.126",
  "id" 50889,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 5222,
  "source" 55511,
  "ack" 1537330967,
  "seq" 2420648774,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821245054523000, "wirelen" 195},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.189",
  "id" 62894,
  "tos" 192,
  "ttl" 64,
  "next" 12},
 "Icmp" {"index" 2, "typeDescription" "redirect", "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821245209298000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821247209241000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821249209205000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821251209149000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821252210718000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E8:9D:87:B1:45:2F",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821253209104000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821254170615000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821254969562000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821255209050000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821255968694000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821257208992000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821258259782000, "wirelen" 154},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "00:1F:16:11:11:21",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "255.255.255.255",
  "source" "192.168.20.105",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821258260472000, "wirelen" 154},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "00:1F:16:11:11:21",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.255",
  "source" "192.168.20.105",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821258926048000, "wirelen" 167},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "213.239.200.187",
  "source" "192.168.20.126",
  "id" 50890,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 5222,
  "source" 55511,
  "ack" 1537330967,
  "seq" 2420648774,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821258926441000, "wirelen" 195},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.189",
  "id" 62895,
  "tos" 192,
  "ttl" 64,
  "next" 12},
 "Icmp" {"index" 2, "typeDescription" "redirect", "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821259208940000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821261148144000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:0E",
  "source" "24:B6:57:08:B2:8C",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821261208889000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821262211121000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E8:9D:87:B1:45:2F",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821263208838000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821264708926000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821265208790000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821265468932000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821266469062000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821267208739000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821268062219000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.0.251",
  "source" "192.168.20.126",
  "id" 15415,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 631,
  "source" 55494,
  "ack" 0,
  "seq" 4054312455,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821268062554000, "wirelen" 102},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.189",
  "id" 62896,
  "tos" 192,
  "ttl" 64,
  "next" 12},
 "Icmp" {"index" 2, "typeDescription" "redirect", "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821268558133000, "wirelen" 165},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "90:E6:BA:3C:9A:26",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "255.255.255.255",
  "source" "192.168.20.194",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821268558443000, "wirelen" 165},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "90:E6:BA:3C:9A:26",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.255",
  "source" "192.168.20.194",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821269064044000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.0.251",
  "source" "192.168.20.126",
  "id" 15416,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 631,
  "source" 55494,
  "ack" 0,
  "seq" 4054312455,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821269134931000, "wirelen" 161},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:00:0C:CC:CC:CC",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821269208699000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821271070046000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.0.251",
  "source" "192.168.20.126",
  "id" 15417,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 631,
  "source" 55494,
  "ack" 0,
  "seq" 4054312455,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821271208636000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821272211505000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E8:9D:87:B1:45:2F",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821273208594000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821274710235000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821275078045000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.0.251",
  "source" "192.168.20.126",
  "id" 15418,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 631,
  "source" 55494,
  "ack" 0,
  "seq" 4054312455,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821275208533000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821275469236000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821276469370000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821277208489000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821279208448000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821279790043000, "wirelen" 156},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "208.82.117.76",
  "source" "192.168.20.126",
  "id" 63666,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 58344,
  "ack" 1196903234,
  "seq" 427955200,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821281208384000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821282211923000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E8:9D:87:B1:45:2F",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821283086049000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.0.251",
  "source" "192.168.20.126",
  "id" 15419,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 631,
  "source" 55494,
  "ack" 0,
  "seq" 4054312455,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821283208330000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821285208286000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821286178788000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821286638056000, "wirelen" 167},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "213.239.200.187",
  "source" "192.168.20.126",
  "id" 50891,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 5222,
  "source" 55511,
  "ack" 1537330967,
  "seq" 2420648774,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821286968757000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821287208239000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821287968868000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288095200000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E0:CB:4E:E3:38:46",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288301689000, "wirelen" 154},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "00:1F:16:11:11:21",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "255.255.255.255",
  "source" "192.168.20.105",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288302372000, "wirelen" 154},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "00:1F:16:11:11:21",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.255",
  "source" "192.168.20.105",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288337114000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "50.16.251.76",
  "id" 54777,
  "tos" 32,
  "ttl" 45,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 56498,
  "source" 80,
  "ack" 641101255,
  "seq" 2032098019,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288337280000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 44364,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56498,
  "ack" 2032098020,
  "seq" 641101255,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288337308000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "50.16.251.76",
  "id" 29554,
  "tos" 32,
  "ttl" 45,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 56500,
  "source" 80,
  "ack" 892456090,
  "seq" 2030012175,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288337315000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "50.16.251.76",
  "id" 39539,
  "tos" 32,
  "ttl" 45,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 56505,
  "source" 80,
  "ack" 1083526898,
  "seq" 2035706867,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288337350000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 48479,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56505,
  "ack" 2035706868,
  "seq" 1083526898,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288337363000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 13551,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56500,
  "ack" 2030012176,
  "seq" 892456090,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288428776000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "50.16.251.76",
  "id" 54778,
  "tos" 32,
  "ttl" 45,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 56498,
  "source" 80,
  "ack" 641101256,
  "seq" 2032098020,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288429972000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "50.16.251.76",
  "id" 29555,
  "tos" 32,
  "ttl" 45,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 56500,
  "source" 80,
  "ack" 892456091,
  "seq" 2030012176,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288430334000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "50.16.251.76",
  "id" 39540,
  "tos" 32,
  "ttl" 45,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 56505,
  "source" 80,
  "ack" 1083526899,
  "seq" 2035706868,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288514760000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 55179,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 33513,
  "source" 445,
  "ack" 373391420,
  "seq" 1273427277,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288514823000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 20434,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 445,
  "source" 33513,
  "ack" 1273427278,
  "seq" 373391420,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288514864000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 14207,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 445,
  "source" 33548,
  "ack" 0,
  "seq" 750722411,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288514982000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 55180,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 33513,
  "source" 445,
  "ack" 373391421,
  "seq" 1273427278,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288514996000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 33548,
  "source" 445,
  "ack" 750722412,
  "seq" 943118864,
  "flags" #{"SYN" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288515011000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 14208,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 445,
  "source" 33548,
  "ack" 943118865,
  "seq" 750722412,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288591904000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "50.16.251.76",
  "id" 13661,
  "tos" 32,
  "ttl" 45,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 56499,
  "source" 80,
  "ack" 2608212412,
  "seq" 2027735265,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288592011000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 59879,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56499,
  "ack" 2027735266,
  "seq" 2608212412,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821288686749000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "50.16.251.76",
  "id" 13662,
  "tos" 32,
  "ttl" 45,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 56499,
  "source" 80,
  "ack" 2608212413,
  "seq" 2027735266,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289082935000, "wirelen" 119},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8426,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833153,
  "seq" 3267557301,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289082975000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18557,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267557354,
  "seq" 2789833153,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289084065000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18558,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267557354,
  "seq" 2789833153,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289092449000, "wirelen" 119},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8427,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833190,
  "seq" 3267557354,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289092797000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18559,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267557407,
  "seq" 2789833190,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289095554000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E0:CB:4E:E3:38:46",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289101522000, "wirelen" 119},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8428,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833227,
  "seq" 3267557407,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289101702000, "wirelen" 135},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18560,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267557460,
  "seq" 2789833227,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289114493000, "wirelen" 167},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8429,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833296,
  "seq" 3267557460,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289132012000, "wirelen" 279},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18561,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267557561,
  "seq" 2789833296,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289141157000, "wirelen" 599},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8430,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833509,
  "seq" 3267557561,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289181046000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18562,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267558094,
  "seq" 2789833509,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289192182000, "wirelen" 135},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8431,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833509,
  "seq" 3267558094,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289192200000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18563,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267558163,
  "seq" 2789833509,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289208190000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289223791000, "wirelen" 151},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18564,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267558163,
  "seq" 2789833509,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289244304000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8432,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267558163,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289244356000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8433,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267559611,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289244377000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18565,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267561059,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289244561000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8434,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267561059,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289244581000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8435,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267562507,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289244593000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18566,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267563955,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289244792000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8436,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267563955,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289251776000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8437,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267565403,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289251813000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18567,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267566851,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289251833000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8438,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267566851,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289252013000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8439,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267568299,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289252039000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18568,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267569747,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289252150000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8440,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267569747,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289252171000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8441,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267571195,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289252181000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18569,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267572643,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289252411000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8442,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267572643,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289259165000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8443,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267574091,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289259181000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18570,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267575539,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289259292000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8444,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267575539,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289259415000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8445,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267576987,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289259428000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18571,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267578435,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289259440000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8446,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267578435,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289259668000, "wirelen" 2962},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8447,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267579883,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289259683000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18572,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267582779,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289266831000, "wirelen" 2962},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8449,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267582779,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289266857000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18573,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267585675,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289267054000, "wirelen" 2962},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8451,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267585675,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289267071000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18574,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267588571,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289268013000, "wirelen" 2962},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8453,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267588571,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289268030000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18575,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267591467,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289268614000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8455,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267591467,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289269193000, "wirelen" 8754},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8456,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267592915,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289269217000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18576,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267601603,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289275114000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8462,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267601603,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289275259000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8463,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267603051,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289275275000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18577,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267604499,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289275289000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8464,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267604499,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289275518000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8465,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267605947,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289275541000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18578,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267607395,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289275558000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8466,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267607395,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289275757000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8467,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267608843,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289275780000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18579,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267610291,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289277061000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8468,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267610291,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289277116000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8469,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267611739,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289277138000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18580,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267613187,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289277294000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8470,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267613187,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289277403000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8471,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267614635,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289277528000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18581,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267616083,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289277541000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8472,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267616083,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289277659000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8473,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267617531,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289277671000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18582,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267618979,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289277797000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8474,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267618979,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289277921000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8475,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267620427,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289277931000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18583,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267621875,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289278075000, "wirelen" 2962},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8476,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267621875,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289278089000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18584,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267624771,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289278295000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8478,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267624771,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289283233000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8479,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267626219,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289283261000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18585,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267627667,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289283278000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8480,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267627667,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289283470000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8481,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267629115,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289283485000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18586,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267630563,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289284751000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8482,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267630563,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289284889000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8483,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267632011,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289284905000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18587,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267633459,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289285015000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8484,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267633459,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289285240000, "wirelen" 2962},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8485,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267634907,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289285255000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18588,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267637803,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289285392000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8487,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267637803,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289285514000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8488,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267639251,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289285527000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18589,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267640699,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289285540000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8489,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267640699,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289285768000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8490,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267642147,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289285780000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18590,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267643595,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289285898000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8491,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267643595,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289286040000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8492,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267645043,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289286052000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18591,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267646491,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289286065000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8493,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267646491,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289286286000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8494,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267647939,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289286302000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18592,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267649387,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289286414000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8495,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267649387,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289286532000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8496,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267650835,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289286544000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18593,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267652283,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289286663000, "wirelen" 2962},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8497,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267652283,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289286679000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18594,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267655179,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289286910000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8499,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267655179,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289290770000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8500,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267656627,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289290788000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18595,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267658075,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289290900000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8501,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267658075,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289291026000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8502,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267659523,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289291038000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18596,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267660971,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289291152000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8503,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267660971,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289291276000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8504,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267662419,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289291288000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18597,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267663867,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289293110000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8505,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267663867,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289293238000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8506,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267665315,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289293256000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18598,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267666763,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289293361000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8507,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267666763,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289293483000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8508,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267668211,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289293497000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18599,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267669659,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289293613000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8509,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267669659,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289293736000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8510,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267671107,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289293750000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18600,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267672555,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289293865000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8511,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267672555,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289293996000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8512,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267674003,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289294011000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18601,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267675451,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289294027000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8513,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267675451,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289294247000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8514,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267676899,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289294261000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18602,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267678347,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289294273000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8515,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267678347,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289294502000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8516,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267679795,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289294517000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18603,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267681243,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289294627000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8517,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267681243,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289294751000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8518,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267682691,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289294762000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18604,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267684139,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289294875000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8519,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267684139,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289295004000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8520,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267685587,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289295016000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18605,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267687035,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289295128000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8521,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267687035,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289295254000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8522,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267688483,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289295268000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18606,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267689931,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289295380000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8523,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267689931,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289295522000, "wirelen" 2962},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8524,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267691379,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289295533000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18607,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267694275,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289295762000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8526,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267694275,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289300619000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8527,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267695723,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289300651000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18608,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267697171,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289300668000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8528,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267697171,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289300871000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8529,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267698619,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289300892000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18609,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267700067,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289300906000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8530,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267700067,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289301111000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8531,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267701515,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289301128000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18610,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267702963,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289301254000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8532,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267702963,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289301378000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8533,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267704411,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289301394000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18611,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267705859,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289301410000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8534,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267705859,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289301637000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8535,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267707307,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289301652000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18612,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267708755,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289301666000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8536,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267708755,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289301891000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8537,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267710203,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289301907000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18613,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267711651,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289302202000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8538,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267711651,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289302331000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8539,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267713099,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289302352000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18614,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267714547,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289302368000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8540,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267714547,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289302947000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8541,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267715995,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289302975000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18615,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267717443,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289303105000, "wirelen" 2962},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8542,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267717443,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289303121000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18616,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267720339,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289303341000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8544,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267720339,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289303364000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8545,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267721787,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289303374000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18617,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267723235,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289303591000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8546,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267723235,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289303712000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8547,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267724683,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289303728000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18618,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267726131,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289303852000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8548,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267726131,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289303874000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8549,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267727579,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289303883000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18619,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267729027,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289304099000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8550,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267729027,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289308207000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8551,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267730475,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289308250000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18620,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267731923,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289308272000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8552,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267731923,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289308449000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8553,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267733371,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289308471000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18621,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267734819,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289308593000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8554,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267734819,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289308617000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8555,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267736267,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289308648000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18622,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267737715,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289308832000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8556,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267737715,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289308855000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8557,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267739163,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289308866000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18623,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267740611,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289309090000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8558,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267740611,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289309207000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8559,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267742059,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289309218000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18624,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267743507,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289309230000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8560,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267743507,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289309458000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8561,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267744955,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289309470000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18625,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267746403,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289309580000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8562,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267746403,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289309717000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8563,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267747851,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289309730000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18626,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267749299,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289309744000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8564,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267749299,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289309957000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8565,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267750747,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289309972000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18627,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267752195,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289310088000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8566,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267752195,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289310216000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8567,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267753643,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289310230000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18628,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267755091,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289310243000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8568,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267755091,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289310470000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8569,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267756539,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289310482000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18629,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267757987,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289310494000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8570,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267757987,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289310714000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8571,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267759435,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289310725000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18630,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267760883,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289311165000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8572,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267760883,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289311296000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8573,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267762331,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289311312000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18631,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267763779,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289311326000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8574,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267763779,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289311541000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8575,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267765227,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289311556000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18632,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267766675,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289311679000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8576,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267766675,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289311701000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8577,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267768123,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289311717000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18633,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267769571,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289311927000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8578,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267769571,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289311949000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8579,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267771019,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289311961000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18634,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267772467,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289312185000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8580,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267772467,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289312291000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8581,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267773915,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289312303000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18635,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267775363,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289312417000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8582,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267775363,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289312559000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8583,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267776811,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289312572000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18636,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267778259,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289312584000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8584,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267778259,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289312816000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8585,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267779707,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289312829000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18637,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267781155,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289312849000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8586,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267781155,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289316387000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8587,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267782603,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289316407000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18638,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267784051,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289316421000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8588,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267784051,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289316634000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8589,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267785499,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289316653000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18639,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267786947,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289316787000, "wirelen" 2962},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8590,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267786947,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289316798000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18640,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267789843,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289317016000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8592,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267789843,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289317157000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8593,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267791291,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289317166000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18641,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267792739,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289317276000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8594,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267792739,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289317401000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8595,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267794187,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289317412000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18642,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267795635,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289317527000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8596,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267795635,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289317660000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8597,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267797083,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289317672000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18643,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267798531,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289317685000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8598,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267798531,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289317909000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8599,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267799979,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289317921000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18644,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267801427,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289318045000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8600,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267801427,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289318155000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8601,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267802875,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289318166000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18645,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267804323,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289318286000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8602,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267804323,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289318411000, "wirelen" 2687},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8603,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833594,
  "seq" 3267805771,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289318422000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18646,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267808392,
  "seq" 2789833594,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289329964000, "wirelen" 215},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18647,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267808392,
  "seq" 2789833594,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289337776000, "wirelen" 895},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8606,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833743,
  "seq" 3267809840,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289337800000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18648,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267808392,
  "seq" 2789833743,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289337809000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8605,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833743,
  "seq" 3267808392,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289337823000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18649,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267810669,
  "seq" 2789833743,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289344805000, "wirelen" 135},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8607,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833743,
  "seq" 3267810669,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289344825000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18650,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267810738,
  "seq" 2789833743,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289353808000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18651,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267810738,
  "seq" 2789833743,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289360601000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.227.17.170",
  "id" 8608,
  "tos" 0,
  "ttl" 55,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41467,
  "source" 993,
  "ack" 2789833780,
  "seq" 3267810738,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821289400039000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18652,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267810775,
  "seq" 2789833780,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821290095966000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E0:CB:4E:E3:38:46",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821291147390000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:0E",
  "source" "24:B6:57:08:B2:8C",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821291208153000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821293208078000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821295207218000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "67.207.128.232",
  "id" 44714,
  "tos" 32,
  "ttl" 44,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 40644,
  "source" 80,
  "ack" 272977515,
  "seq" 794533491,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821295207311000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "67.207.128.232",
  "source" "192.168.20.126",
  "id" 49138,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 40644,
  "ack" 794533492,
  "seq" 272977515,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821295208032000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821295318140000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "67.207.128.232",
  "id" 44715,
  "tos" 32,
  "ttl" 44,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 40644,
  "source" 80,
  "ack" 272977516,
  "seq" 794533492,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821296713111000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821297207991000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821297469105000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821298469241000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821298591373000, "wirelen" 165},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "90:E6:BA:3C:9A:26",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "255.255.255.255",
  "source" "192.168.20.194",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821298591712000, "wirelen" 165},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "90:E6:BA:3C:9A:26",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.255",
  "source" "192.168.20.194",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821299118049000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.0.251",
  "source" "192.168.20.126",
  "id" 15420,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 631,
  "source" 55494,
  "ack" 0,
  "seq" 4054312455,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821299207944000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821301207876000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821302916982000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:00:5E:00:00:01",
  "source" "E8:9A:8F:6E:DD:97",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "224.0.0.1",
  "source" "0.0.0.0",
  "id" 0,
  "tos" 192,
  "ttl" 1,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821302917009000, "wirelen" 86},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "33:33:00:00:00:01",
  "source" "E8:9A:8F:6E:DD:97",
  "next" 3},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip6",
  "destination" "0FF02::0001",
  "source" "0FE080::0EA09A:08F0FF:0FE6E:0DD097",
  "flowLabel" 0,
  "hopLimit" 1,
  "trafficClass" 0,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821302954452000, "wirelen" 86},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "33:33:FF:A1:E8:51",
  "source" "48:5B:39:A1:E8:51",
  "next" 3},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip6",
  "destination" "0FF02::0001:0FF0A1:0E851",
  "source" "0FE080::4A5B:390FF:0FE0A1:0E851",
  "flowLabel" 0,
  "hopLimit" 1,
  "trafficClass" 0,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821302968937000, "wirelen" 86},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "33:33:FF:40:30:B2",
  "source" "90:E6:BA:3C:9A:B4",
  "next" 3},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip6",
  "destination" "0FF02::0001:0FF40:300B2",
  "source" "0FE080::5D67:0800AD:5040:300B2",
  "flowLabel" 0,
  "hopLimit" 1,
  "trafficClass" 0,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821302968960000, "wirelen" 86},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "33:33:00:01:00:03",
  "source" "90:E6:BA:3C:9A:B4",
  "next" 3},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip6",
  "destination" "0FF02::0001:0003",
  "source" "0FE080::5D67:0800AD:5040:300B2",
  "flowLabel" 0,
  "hopLimit" 1,
  "trafficClass" 0,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821302968969000, "wirelen" 86},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "33:33:00:00:00:0C",
  "source" "90:E6:BA:3C:9A:B4",
  "next" 3},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip6",
  "destination" "0FF02::000C",
  "source" "0FE080::5D67:0800AD:5040:300B2",
  "flowLabel" 0,
  "hopLimit" 1,
  "trafficClass" 0,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821303024927000, "wirelen" 86},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "33:33:FF:B1:45:2F",
  "source" "E8:9D:87:B1:45:2F",
  "next" 3},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip6",
  "destination" "0FF02::0001:0FF0B1:452F",
  "source" "0FE080::0EA09D:0870FF:0FE0B1:452F",
  "flowLabel" 0,
  "hopLimit" 1,
  "trafficClass" 0,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821303123588000, "wirelen" 86},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "33:33:FF:F4:95:5D",
  "source" "B4:B5:2F:F4:95:5D",
  "next" 3},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip6",
  "destination" "0FF02::0001:0FF0F4:0955D",
  "source" "0FE080::0B60B5:2F0FF:0FE0F4:0955D",
  "flowLabel" 0,
  "hopLimit" 1,
  "trafficClass" 0,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821303146870000, "wirelen" 86},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "33:33:FF:11:11:21",
  "source" "00:1F:16:11:11:21",
  "next" 3},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip6",
  "destination" "0FF02::0001:0FF11:1121",
  "source" "0FE080::021F:160FF:0FE11:1121",
  "flowLabel" 0,
  "hopLimit" 1,
  "trafficClass" 0,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821303191048000, "wirelen" 86},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "33:33:FF:3C:9A:47",
  "source" "90:E6:BA:3C:9A:47",
  "next" 3},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip6",
  "destination" "0FF02::0001:0FF3C:09A47",
  "source" "0FE080::0920E6:0BA0FF:0FE3C:09A47",
  "flowLabel" 0,
  "hopLimit" 1,
  "trafficClass" 0,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821303206176000, "wirelen" 86},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "33:33:00:00:00:FB",
  "source" "E0:CB:4E:E3:38:56",
  "next" 3},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip6",
  "destination" "0FF02::000FB",
  "source" "0FE080::0E20CB:4E0FF:0FE0E3:3856",
  "flowLabel" 0,
  "hopLimit" 1,
  "trafficClass" 0,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821303207820000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821303389790000, "wirelen" 86},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "33:33:FF:3C:9A:26",
  "source" "90:E6:BA:3C:9A:26",
  "next" 3},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip6",
  "destination" "0FF02::0001:0FF3C:09A26",
  "source" "0FE080::0920E6:0BA0FF:0FE3C:09A26",
  "flowLabel" 0,
  "hopLimit" 1,
  "trafficClass" 0,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821303599822000, "wirelen" 82},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:00:5E:00:00:FD",
  "source" "90:E6:BA:3C:9A:B4",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "224.0.0.253",
  "source" "192.168.20.134",
  "id" 25849,
  "tos" 0,
  "ttl" 1,
  "next" 5},
 "Udp" {"index" 2, "destination" 3544, "source" 58571, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821303870252000, "wirelen" 86},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "33:33:FF:E3:38:56",
  "source" "E0:CB:4E:E3:38:56",
  "next" 3},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip6",
  "destination" "0FF02::0001:0FF0E3:3856",
  "source" "0FE080::0E20CB:4E0FF:0FE0E3:3856",
  "flowLabel" 0,
  "hopLimit" 1,
  "trafficClass" 0,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821304157350000, "wirelen" 260},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.255",
  "source" "192.168.20.1",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 138, "source" 138}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821304157384000, "wirelen" 222},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.255",
  "source" "192.168.20.1",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 138, "source" 138}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821304623113000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 53760,
  "tos" 0,
  "ttl" 64,
  "next" 12},
 "Icmp" {"index" 2, "typeDescription" "echo reply"}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821304623140000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 32487,
  "tos" 0,
  "ttl" 64,
  "next" 12},
 "Icmp" {"index" 2, "typeDescription" "echo request"}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821304623161000, "wirelen" 42},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 40561,
  "tos" 0,
  "ttl" 64,
  "next" 12},
 "Icmp" {"index" 2, "typeDescription" "echo reply"}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821304623166000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E8:9D:87:B1:45:2F",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821305207784000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821306410475000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:00:5E:00:00:FB",
  "source" "48:5B:39:A1:E8:51",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "224.0.0.251",
  "source" "192.168.20.191",
  "id" 0,
  "tos" 192,
  "ttl" 1,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821306469389000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:00:5E:00:00:FD",
  "source" "90:E6:BA:3C:9A:B4",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "224.0.0.253",
  "source" "192.168.20.134",
  "id" 25850,
  "tos" 0,
  "ttl" 1,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821306623613000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E8:9D:87:B1:45:2F",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821306714397000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821306912497000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:00:5E:00:00:FB",
  "source" "00:14:38:EA:94:C0",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "224.0.0.251",
  "source" "192.168.20.20",
  "id" 5714,
  "tos" 0,
  "ttl" 1,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821307207724000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821307469410000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821308469544000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821308469561000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:00:5E:7F:FF:FA",
  "source" "90:E6:BA:3C:9A:B4",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "239.255.255.250",
  "source" "192.168.20.134",
  "id" 20197,
  "tos" 0,
  "ttl" 1,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821308624050000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E8:9D:87:B1:45:2F",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821309207686000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821309885066000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:00:5E:00:01:3C",
  "source" "B4:B5:2F:F4:95:5D",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "224.0.1.60",
  "source" "192.168.20.21",
  "id" 13809,
  "tos" 0,
  "ttl" 1,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821309900287000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:00:5E:00:01:3C",
  "source" "00:14:38:EA:94:C0",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "224.0.1.60",
  "source" "192.168.20.20",
  "id" 5716,
  "tos" 0,
  "ttl" 1,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821310624550000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E8:9D:87:B1:45:2F",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821310968977000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:00:5E:00:00:FC",
  "source" "90:E6:BA:3C:9A:B4",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "224.0.0.252",
  "source" "192.168.20.134",
  "id" 24112,
  "tos" 0,
  "ttl" 1,
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821311207628000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821312625033000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E8:9D:87:B1:45:2F",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821313207573000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821315207526000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821317207473000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821318185946000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821318341470000, "wirelen" 154},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "00:1F:16:11:11:21",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "255.255.255.255",
  "source" "192.168.20.105",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821318342157000, "wirelen" 154},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "00:1F:16:11:11:21",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.255",
  "source" "192.168.20.105",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821318968929000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821319207422000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821319969059000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821320653538000, "wirelen" 77},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 42911,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 53, "source" 45465}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821320653566000, "wirelen" 77},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 42912,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 53, "source" 45465}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821320653999000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REQUEST",
  "targetMac" "00:00:00:00:00:00",
  "targetIp" "192.168.20.126",
  "sourceMac" "E8:9D:87:B1:45:2F",
  "sourceIp" "192.168.20.189",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821320654048000, "wirelen" 42},
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
  "sourceIp" "192.168.20.126"}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821320654370000, "wirelen" 105},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.189",
  "id" 62897,
  "tos" 192,
  "ttl" 64,
  "next" 12},
 "Icmp"
 {"index" 2, "typeDescription" "destination unreachable", "next" 2},
 "Udp" {"index" 4, "destination" 53, "source" 45465}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821320654398000, "wirelen" 105},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.189",
  "id" 62898,
  "tos" 192,
  "ttl" 64,
  "next" 12},
 "Icmp"
 {"index" 2, "typeDescription" "destination unreachable", "next" 2},
 "Udp" {"index" 4, "destination" 53, "source" 45465}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821320654437000, "wirelen" 77},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 42912,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 53, "source" 38310}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821320654449000, "wirelen" 77},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 42913,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 53, "source" 38310}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821320654785000, "wirelen" 105},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.189",
  "id" 62899,
  "tos" 192,
  "ttl" 64,
  "next" 12},
 "Icmp"
 {"index" 2, "typeDescription" "destination unreachable", "next" 2},
 "Udp" {"index" 4, "destination" 53, "source" 38310}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821320654802000, "wirelen" 105},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.189",
  "id" 62900,
  "tos" 192,
  "ttl" 64,
  "next" 12},
 "Icmp"
 {"index" 2, "typeDescription" "destination unreachable", "next" 2},
 "Udp" {"index" 4, "destination" 53, "source" 38310}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821320654847000, "wirelen" 102},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 42912,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 53, "source" 37294}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821320654856000, "wirelen" 102},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 42913,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 53, "source" 37294}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821320655108000, "wirelen" 130},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.189",
  "id" 62901,
  "tos" 192,
  "ttl" 64,
  "next" 12},
 "Icmp"
 {"index" 2, "typeDescription" "destination unreachable", "next" 2},
 "Udp" {"index" 4, "destination" 53, "source" 37294}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821320655124000, "wirelen" 130},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.189",
  "id" 62902,
  "tos" 192,
  "ttl" 64,
  "next" 12},
 "Icmp"
 {"index" 2, "typeDescription" "destination unreachable", "next" 2},
 "Udp" {"index" 4, "destination" 53, "source" 37294}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821320655144000, "wirelen" 102},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 42913,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 53, "source" 35086}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821320655155000, "wirelen" 102},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 42914,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 53, "source" 35086}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821321146625000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:0E",
  "source" "24:B6:57:08:B2:8C",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821321207367000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821322625444000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E8:9D:87:B1:45:2F",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821323207326000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821324161198000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18653,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267810775,
  "seq" 2789833780,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821324161624000, "wirelen" 131},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.189",
  "id" 62903,
  "tos" 192,
  "ttl" 64,
  "next" 12},
 "Icmp" {"index" 2, "typeDescription" "redirect", "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821324371043000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18654,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267810775,
  "seq" 2789833780,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821324371400000, "wirelen" 131},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.189",
  "id" 62904,
  "tos" 192,
  "ttl" 64,
  "next" 12},
 "Icmp" {"index" 2, "typeDescription" "redirect", "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821324792052000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18655,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267810775,
  "seq" 2789833780,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821324792449000, "wirelen" 131},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.189",
  "id" 62905,
  "tos" 192,
  "ttl" 64,
  "next" 12},
 "Icmp" {"index" 2, "typeDescription" "redirect", "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821325207269000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821325217814000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "74.125.132.101",
  "source" "192.168.20.126",
  "id" 57137,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 47435,
  "ack" 3509057616,
  "seq" 1354247072,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821325217858000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "95.100.220.20",
  "source" "192.168.20.126",
  "id" 41290,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 44943,
  "ack" 3514245537,
  "seq" 2310297896,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821325217872000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 9739,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56504,
  "ack" 2033652751,
  "seq" 3148535855,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821325217884000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 32947,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56513,
  "ack" 2045829811,
  "seq" 2142599928,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821325422049000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "95.100.220.20",
  "source" "192.168.20.126",
  "id" 41291,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 44943,
  "ack" 3514245537,
  "seq" 2310297896,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821325450051000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "74.125.132.101",
  "source" "192.168.20.126",
  "id" 57138,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 47435,
  "ack" 3509057616,
  "seq" 1354247072,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821325514056000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 32948,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56513,
  "ack" 2045829811,
  "seq" 2142599928,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821325517045000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 9740,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56504,
  "ack" 2033652751,
  "seq" 3148535855,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821325634050000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18656,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267810775,
  "seq" 2789833780,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821325833064000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "95.100.220.20",
  "source" "192.168.20.126",
  "id" 41292,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 44943,
  "ack" 3514245537,
  "seq" 2310297896,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821325917059000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "74.125.132.101",
  "source" "192.168.20.126",
  "id" 57139,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 47435,
  "ack" 3509057616,
  "seq" 1354247072,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326108059000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 32949,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56513,
  "ack" 2045829811,
  "seq" 2142599928,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326116049000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 9741,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56504,
  "ack" 2033652751,
  "seq" 3148535855,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326218028000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "204.93.223.146",
  "source" "192.168.20.126",
  "id" 2613,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 59633,
  "ack" 3863109645,
  "seq" 1671427907,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326218070000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.184",
  "source" "192.168.20.126",
  "id" 4592,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 45468,
  "ack" 1452938820,
  "seq" 2293232409,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326218085000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.178",
  "source" "192.168.20.126",
  "id" 55997,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 53599,
  "ack" 1154249418,
  "seq" 2771854475,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326218099000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.184",
  "source" "192.168.20.126",
  "id" 35831,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 45467,
  "ack" 1450302732,
  "seq" 3417997471,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326218115000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "199.59.150.9",
  "source" "192.168.20.126",
  "id" 13299,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 46084,
  "ack" 103023432,
  "seq" 2558183186,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326218128000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.168",
  "source" "192.168.20.126",
  "id" 11872,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 41201,
  "ack" 53936343,
  "seq" 698079394,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326424059000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.178",
  "source" "192.168.20.126",
  "id" 55998,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 53599,
  "ack" 1154249418,
  "seq" 2771854475,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326425046000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.184",
  "source" "192.168.20.126",
  "id" 35832,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 45467,
  "ack" 1450302732,
  "seq" 3417997471,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326426035000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.184",
  "source" "192.168.20.126",
  "id" 4593,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 45468,
  "ack" 1452938820,
  "seq" 2293232409,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326426050000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.168",
  "source" "192.168.20.126",
  "id" 11873,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 41201,
  "ack" 53936343,
  "seq" 698079394,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326654077000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "95.100.220.20",
  "source" "192.168.20.126",
  "id" 41293,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 44943,
  "ack" 3514245537,
  "seq" 2310297896,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326705055000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "199.59.150.9",
  "source" "192.168.20.126",
  "id" 13300,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 46084,
  "ack" 103023432,
  "seq" 2558183186,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326756054000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "204.93.223.146",
  "source" "192.168.20.126",
  "id" 2614,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 59633,
  "ack" 3863109645,
  "seq" 1671427907,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326837052000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.178",
  "source" "192.168.20.126",
  "id" 55999,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 53599,
  "ack" 1154249418,
  "seq" 2771854475,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326840044000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.184",
  "source" "192.168.20.126",
  "id" 35833,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 45467,
  "ack" 1450302732,
  "seq" 3417997471,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326843043000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.184",
  "source" "192.168.20.126",
  "id" 4594,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 45468,
  "ack" 1452938820,
  "seq" 2293232409,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326843065000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.168",
  "source" "192.168.20.126",
  "id" 11874,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 41201,
  "ack" 53936343,
  "seq" 698079394,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821326850050000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "74.125.132.101",
  "source" "192.168.20.126",
  "id" 57140,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 47435,
  "ack" 3509057616,
  "seq" 1354247072,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821327207228000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821327218266000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "74.125.132.101",
  "source" "192.168.20.126",
  "id" 6693,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 47438,
  "ack" 3504032771,
  "seq" 2904881201,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821327294058000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 32950,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56513,
  "ack" 2045829811,
  "seq" 2142599928,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821327314051000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 9742,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56504,
  "ack" 2033652751,
  "seq" 3148535855,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821327318053000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18657,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267810775,
  "seq" 2789833780,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821327446057000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "74.125.132.101",
  "source" "192.168.20.126",
  "id" 6694,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 47438,
  "ack" 3504032771,
  "seq" 2904881201,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821327662062000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.178",
  "source" "192.168.20.126",
  "id" 56000,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 53599,
  "ack" 1154249418,
  "seq" 2771854475,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821327670048000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.184",
  "source" "192.168.20.126",
  "id" 35834,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 45467,
  "ack" 1450302732,
  "seq" 3417997471,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821327678046000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "199.59.150.9",
  "source" "192.168.20.126",
  "id" 13301,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 46084,
  "ack" 103023432,
  "seq" 2558183186,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821327678071000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.184",
  "source" "192.168.20.126",
  "id" 4595,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 45468,
  "ack" 1452938820,
  "seq" 2293232409,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821327678076000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.168",
  "source" "192.168.20.126",
  "id" 11875,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 41201,
  "ack" 53936343,
  "seq" 698079394,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821327830064000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "204.93.223.146",
  "source" "192.168.20.126",
  "id" 2615,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 59633,
  "ack" 3863109645,
  "seq" 1671427907,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821327903049000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "74.125.132.101",
  "source" "192.168.20.126",
  "id" 6695,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 47438,
  "ack" 3504032771,
  "seq" 2904881201,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821328298060000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "95.100.220.20",
  "source" "192.168.20.126",
  "id" 41294,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 44943,
  "ack" 3514245537,
  "seq" 2310297896,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821328624873000, "wirelen" 165},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "90:E6:BA:3C:9A:26",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "255.255.255.255",
  "source" "192.168.20.194",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821328625191000, "wirelen" 165},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "90:E6:BA:3C:9A:26",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.255",
  "source" "192.168.20.194",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821328717274000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821328718058000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "74.125.132.101",
  "source" "192.168.20.126",
  "id" 57141,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 47435,
  "ack" 3509057616,
  "seq" 1354247072,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821328818058000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "74.125.132.101",
  "source" "192.168.20.126",
  "id" 6696,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 47438,
  "ack" 3504032771,
  "seq" 2904881201,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821329133413000, "wirelen" 161},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:00:0C:CC:CC:CC",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821329207173000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821329314056000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.178",
  "source" "192.168.20.126",
  "id" 56001,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 53599,
  "ack" 1154249418,
  "seq" 2771854475,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821329330036000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.184",
  "source" "192.168.20.126",
  "id" 35835,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 45467,
  "ack" 1450302732,
  "seq" 3417997471,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821329346032000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.184",
  "source" "192.168.20.126",
  "id" 4596,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 45468,
  "ack" 1452938820,
  "seq" 2293232409,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821329346044000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.168",
  "source" "192.168.20.126",
  "id" 11876,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 41201,
  "ack" 53936343,
  "seq" 698079394,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821329469280000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821329626079000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "199.59.150.9",
  "source" "192.168.20.126",
  "id" 13302,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 46084,
  "ack" 103023432,
  "seq" 2558183186,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821329670049000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 32951,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56513,
  "ack" 2045829811,
  "seq" 2142599928,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821329710033000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 9743,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56504,
  "ack" 2033652751,
  "seq" 3148535855,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821329982039000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "204.93.223.146",
  "source" "192.168.20.126",
  "id" 2616,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 59633,
  "ack" 3863109645,
  "seq" 1671427907,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821330469413000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821330646050000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "74.125.132.101",
  "source" "192.168.20.126",
  "id" 6697,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 47438,
  "ack" 3504032771,
  "seq" 2904881201,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821330686044000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18658,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267810775,
  "seq" 2789833780,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821331207125000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821331582068000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "95.100.220.20",
  "source" "192.168.20.126",
  "id" 41295,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 44943,
  "ack" 3514245537,
  "seq" 2310297896,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821332454050000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "74.125.132.101",
  "source" "192.168.20.126",
  "id" 57142,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 47435,
  "ack" 3509057616,
  "seq" 1354247072,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821332622034000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.178",
  "source" "192.168.20.126",
  "id" 56002,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 53599,
  "ack" 1154249418,
  "seq" 2771854475,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821332625848000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E8:9D:87:B1:45:2F",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821332654046000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.184",
  "source" "192.168.20.126",
  "id" 35836,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 45467,
  "ack" 1450302732,
  "seq" 3417997471,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821332686042000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.184",
  "source" "192.168.20.126",
  "id" 4597,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 45468,
  "ack" 1452938820,
  "seq" 2293232409,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821332686058000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.168",
  "source" "192.168.20.126",
  "id" 11877,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 41201,
  "ack" 53936343,
  "seq" 698079394,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821333207075000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821333518081000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "199.59.150.9",
  "source" "192.168.20.126",
  "id" 13303,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 46084,
  "ack" 103023432,
  "seq" 2558183186,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821334286044000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "204.93.223.146",
  "source" "192.168.20.126",
  "id" 2617,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 59633,
  "ack" 3863109645,
  "seq" 1671427907,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821334302032000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "74.125.132.101",
  "source" "192.168.20.126",
  "id" 6698,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 47438,
  "ack" 3504032771,
  "seq" 2904881201,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821334414036000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 32952,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56513,
  "ack" 2045829811,
  "seq" 2142599928,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821334510038000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 9744,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56504,
  "ack" 2033652751,
  "seq" 3148535855,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821335207013000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821337206967000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821337422050000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18659,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267810775,
  "seq" 2789833780,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821338158074000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "95.100.220.20",
  "source" "192.168.20.126",
  "id" 41296,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 44943,
  "ack" 3514245537,
  "seq" 2310297896,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821338718591000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821339206926000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821339230051000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.178",
  "source" "192.168.20.126",
  "id" 56003,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 53599,
  "ack" 1154249418,
  "seq" 2771854475,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821339294066000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.184",
  "source" "192.168.20.126",
  "id" 35837,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 45467,
  "ack" 1450302732,
  "seq" 3417997471,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821339358037000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.184",
  "source" "192.168.20.126",
  "id" 4598,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 45468,
  "ack" 1452938820,
  "seq" 2293232409,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821339358049000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.168",
  "source" "192.168.20.126",
  "id" 11878,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 41201,
  "ack" 53936343,
  "seq" 698079394,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821339469586000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821339918076000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "74.125.132.101",
  "source" "192.168.20.126",
  "id" 57143,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 47435,
  "ack" 3509057616,
  "seq" 1354247072,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821340469718000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821341206860000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821341310058000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "199.59.150.9",
  "source" "192.168.20.126",
  "id" 13304,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 46084,
  "ack" 103023432,
  "seq" 2558183186,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821341614060000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "74.125.132.101",
  "source" "192.168.20.126",
  "id" 6699,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 47438,
  "ack" 3504032771,
  "seq" 2904881201,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821341998050000, "wirelen" 167},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "213.239.200.187",
  "source" "192.168.20.126",
  "id" 50892,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 5222,
  "source" 55511,
  "ack" 1537330967,
  "seq" 2420648774,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821342626299000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E8:9D:87:B1:45:2F",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821342894063000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "204.93.223.146",
  "source" "192.168.20.126",
  "id" 2618,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 59633,
  "ack" 3863109645,
  "seq" 1671427907,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821343206821000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821343918084000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 32953,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56513,
  "ack" 2045829811,
  "seq" 2142599928,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821344110074000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 9745,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56504,
  "ack" 2033652751,
  "seq" 3148535855,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821345206779000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821347206717000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821348380539000, "wirelen" 154},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "00:1F:16:11:11:21",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "255.255.255.255",
  "source" "192.168.20.105",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821348381238000, "wirelen" 154},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "00:1F:16:11:11:21",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.255",
  "source" "192.168.20.105",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821348578233000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REQUEST",
  "targetMac" "00:00:00:00:00:00",
  "targetIp" "192.168.20.1",
  "sourceMac" "E8:9D:87:B1:45:2F",
  "sourceIp" "192.168.20.189",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821349206668000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821349208059000, "wirelen" 151},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "33:33:00:01:00:02",
  "source" "90:E6:BA:3C:9A:B4",
  "next" 3},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip6",
  "destination" "0FF02::0001:0002",
  "source" "0FE080::5D67:0800AD:5040:300B2",
  "flowLabel" 0,
  "hopLimit" 1,
  "trafficClass" 0,
  "next" 5},
 "Udp" {"index" 2, "destination" 547, "source" 546}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821350208046000, "wirelen" 151},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "33:33:00:01:00:02",
  "source" "90:E6:BA:3C:9A:B4",
  "next" 3},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip6",
  "destination" "0FF02::0001:0002",
  "source" "0FE080::5D67:0800AD:5040:300B2",
  "flowLabel" 0,
  "hopLimit" 1,
  "trafficClass" 0,
  "next" 5},
 "Udp" {"index" 2, "destination" 547, "source" 546}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821350894049000, "wirelen" 103},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.227.17.170",
  "source" "192.168.20.126",
  "id" 18660,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 993,
  "source" 41467,
  "ack" 3267810775,
  "seq" 2789833780,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821351145863000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:0E",
  "source" "24:B6:57:08:B2:8C",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821351173277000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821351206618000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821351208155000, "wirelen" 151},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "33:33:00:01:00:02",
  "source" "90:E6:BA:3C:9A:B4",
  "next" 3},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip6",
  "destination" "0FF02::0001:0002",
  "source" "0FE080::5D67:0800AD:5040:300B2",
  "flowLabel" 0,
  "hopLimit" 1,
  "trafficClass" 0,
  "next" 5},
 "Udp" {"index" 2, "destination" 547, "source" 546}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821351310068000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "95.100.220.20",
  "source" "192.168.20.126",
  "id" 41297,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 44943,
  "ack" 3514245537,
  "seq" 2310297896,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821351412463000, "wirelen" 193},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E8:9D:87:B1:45:2F",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "213.239.200.187",
  "source" "192.168.20.126",
  "id" 50893,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 5222,
  "source" 55511,
  "ack" 1537330967,
  "seq" 2420648875,
  "flags" #{"PSH" "ACK" "FIN"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821351789166000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E0:CB:4E:E3:38:46",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821351826491000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 41749,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 33548,
  "source" 445,
  "ack" 750722412,
  "seq" 943118865,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821351826533000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 14209,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 445,
  "source" 33548,
  "ack" 943118866,
  "seq" 750722412,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821351826565000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 48115,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 445,
  "source" 33549,
  "ack" 0,
  "seq" 3769146007,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821351826694000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 41750,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 33548,
  "source" 445,
  "ack" 750722413,
  "seq" 943118866,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821351826708000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 33549,
  "source" 445,
  "ack" 3769146008,
  "seq" 3003638655,
  "flags" #{"SYN" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821351826723000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 48116,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 445,
  "source" 33549,
  "ack" 3003638656,
  "seq" 3769146008,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821351969209000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821352430056000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.178",
  "source" "192.168.20.126",
  "id" 56004,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 53599,
  "ack" 1154249418,
  "seq" 2771854475,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821352437063000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.201.100.178",
  "id" 48034,
  "tos" 0,
  "ttl" 58,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 53599,
  "source" 80,
  "ack" 2771854476,
  "seq" 1154249418,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821352437114000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.178",
  "source" "192.168.20.126",
  "id" 56005,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 53599,
  "ack" 1154249419,
  "seq" 2771854476,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821352558053000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.184",
  "source" "192.168.20.126",
  "id" 35838,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 45467,
  "ack" 1450302732,
  "seq" 3417997471,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821352564876000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.201.100.184",
  "id" 48866,
  "tos" 0,
  "ttl" 58,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 45467,
  "source" 80,
  "ack" 3417997472,
  "seq" 1450302732,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821352564926000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.184",
  "source" "192.168.20.126",
  "id" 35839,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 45467,
  "ack" 1450302733,
  "seq" 3417997472,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821352686068000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.184",
  "source" "192.168.20.126",
  "id" 4599,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 45468,
  "ack" 1452938820,
  "seq" 2293232409,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821352686090000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.168",
  "source" "192.168.20.126",
  "id" 11879,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 41201,
  "ack" 53936343,
  "seq" 698079394,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821352692431000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.201.100.184",
  "id" 31531,
  "tos" 0,
  "ttl" 58,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 45468,
  "source" 80,
  "ack" 2293232410,
  "seq" 1452938820,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821352692455000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.184",
  "source" "192.168.20.126",
  "id" 4600,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 45468,
  "ack" 1452938821,
  "seq" 2293232410,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821352692465000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "212.201.100.168",
  "id" 10345,
  "tos" 0,
  "ttl" 58,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 41201,
  "source" 80,
  "ack" 698079395,
  "seq" 53936343,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821352692477000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "212.201.100.168",
  "source" "192.168.20.126",
  "id" 11880,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 41201,
  "ack" 53936344,
  "seq" 698079395,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821352789463000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E0:CB:4E:E3:38:46",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821352969349000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821353206560000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821353208498000, "wirelen" 151},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "33:33:00:01:00:02",
  "source" "90:E6:BA:3C:9A:B4",
  "next" 3},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip6",
  "destination" "0FF02::0001:0002",
  "source" "0FE080::5D67:0800AD:5040:300B2",
  "flowLabel" 0,
  "hopLimit" 1,
  "trafficClass" 0,
  "next" 5},
 "Udp" {"index" 2, "destination" 547, "source" 546}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821353789798000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E8:9D:87:B1:45:2F",
  "next" 16},
 "Arp"
 {"index" 1,
  "operationDescription" "REPLY",
  "targetMac" "90:E6:BA:3C:9A:47",
  "targetIp" "192.168.20.126",
  "sourceMac" "E0:CB:4E:E3:38:46",
  "sourceIp" "192.168.20.1",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821354862051000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "74.125.132.101",
  "source" "192.168.20.126",
  "id" 57144,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 47435,
  "ack" 3509057616,
  "seq" 1354247072,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821354879997000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "74.125.132.101",
  "id" 38024,
  "tos" 0,
  "ttl" 47,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 47435,
  "source" 80,
  "ack" 1354247073,
  "seq" 3509057616,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821354880043000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "74.125.132.101",
  "source" "192.168.20.126",
  "id" 57145,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 47435,
  "ack" 3509057617,
  "seq" 1354247073,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821355206509000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821356238050000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "74.125.132.101",
  "source" "192.168.20.126",
  "id" 6700,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 47438,
  "ack" 3504032771,
  "seq" 2904881201,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821356256072000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.126",
  "source" "74.125.132.101",
  "id" 53593,
  "tos" 0,
  "ttl" 47,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 47438,
  "source" 80,
  "ack" 2904881202,
  "seq" 3504032771,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821356256115000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "74.125.132.101",
  "source" "192.168.20.126",
  "id" 6701,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 47438,
  "ack" 3504032772,
  "seq" 2904881202,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821356910050000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "199.59.150.9",
  "source" "192.168.20.126",
  "id" 13305,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 46084,
  "ack" 103023432,
  "seq" 2558183186,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821357206458000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821357209139000, "wirelen" 151},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "33:33:00:01:00:02",
  "source" "90:E6:BA:3C:9A:B4",
  "next" 3},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip6",
  "destination" "0FF02::0001:0002",
  "source" "0FE080::5D67:0800AD:5040:300B2",
  "flowLabel" 0,
  "hopLimit" 1,
  "trafficClass" 0,
  "next" 5},
 "Udp" {"index" 2, "destination" 547, "source" 546}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821358658221000, "wirelen" 165},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "90:E6:BA:3C:9A:26",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "255.255.255.255",
  "source" "192.168.20.194",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821358658530000, "wirelen" 165},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "90:E6:BA:3C:9A:26",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.20.255",
  "source" "192.168.20.194",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821359206409000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821360110068000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "204.93.223.146",
  "source" "192.168.20.126",
  "id" 2619,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 59633,
  "ack" 3863109645,
  "seq" 1671427907,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821361182225000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.0.251",
  "source" "192.168.20.126",
  "id" 29244,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 631,
  "source" 55497,
  "ack" 0,
  "seq" 3754768332,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821361206358000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821361721591000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821362184048000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "192.168.0.251",
  "source" "192.168.20.126",
  "id" 29245,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 631,
  "source" 55497,
  "ack" 0,
  "seq" 3754768332,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821362469589000, "wirelen" 60},
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
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821362926051000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 32954,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56513,
  "ack" 2045829811,
  "seq" 2142599928,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821363206312000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821363310054000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "ProtocolType" "Ethernet",
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "ProtocolType" "Ip4",
  "destination" "50.16.251.76",
  "source" "192.168.20.126",
  "id" 9746,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 56504,
  "ack" 2033652751,
  "seq" 3148535855,
  "flags" #{"ACK" "FIN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352821363469721000, "wirelen" 60},
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
  "next" 0}}}


])

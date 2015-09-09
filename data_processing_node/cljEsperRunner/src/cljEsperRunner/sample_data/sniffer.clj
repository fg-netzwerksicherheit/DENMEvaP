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
  cljEsperRunner.sample-data.sniffer)

(def packet-with-all-fields
  {"sniffer.header.parsed"
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
            "RequestMethod" "GET", "RequestVersion" "HTTP/1.1"}}}
  )


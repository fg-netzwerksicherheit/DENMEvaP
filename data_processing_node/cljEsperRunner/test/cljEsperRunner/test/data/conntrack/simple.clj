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
    :doc "Conntrack sample data"}
  cljEsperRunner.test.data.conntrack.simple)

(def tcp-new-SYN-SENT 
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.1.6",
      "dst" "150.214.76.53"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 48250, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "150.214.76.53",
      "dst" "192.168.1.6"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 48250}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 895162776,
     "unreplied" nil}}},
  "timestamp" 1334782197937,
  "relativeTimestamp" 249780038400527}})

(def tcp-update-SYN-RECV
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.1.6",
      "dst" "150.214.76.53"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 48250, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "150.214.76.53",
      "dst" "192.168.1.6"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 48250}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 895162776}}},
  "timestamp" 1334782198068,
  "relativeTimestamp" 249780169644241}})

(def tcp-update-ESTABLISHED
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.1.6",
      "dst" "150.214.76.53"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 48250, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "150.214.76.53",
      "dst" "192.168.1.6"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 48250}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 895162776,
     "assured" nil}}},
  "timestamp" 1334782198189,
  "relativeTimestamp" 249780290530985}})

;;;
;;; This sample data had been manually edited to match the layer3 and layer4
;;; source and destination addresses of the sniffer sample data.
;;; This edited data is required for testing the combined TCP duration delta event pattern.
;;;
(def tcp-update-ESTABLISHED-2
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.1.6",
      "dst" "74.200.247.188"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 34099, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "74.200.247.177",
      "dst" "192.168.1.6"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 34099}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 895162776,
     "assured" nil}}},
  "timestamp" 1334782198189,
  "relativeTimestamp" 249780290530985}})

(def tcp-update-FIN-WAIT
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.1.6",
      "dst" "150.214.76.53"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 48250, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "150.214.76.53",
      "dst" "192.168.1.6"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 48250}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 895162776,
     "assured" nil}}},
  "timestamp" 1334782213237,
  "relativeTimestamp" 249795338754774}})

(def tcp-update-LAST-ACK
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.1.6",
      "dst" "150.214.76.53"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 48250, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "150.214.76.53",
      "dst" "192.168.1.6"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 48250}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 895162776,
     "assured" nil}}},
  "timestamp" 1334782213369,
  "relativeTimestamp" 249795470370769}})

(def tcp-update-TIME-WAIT
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.1.6",
      "dst" "150.214.76.53"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 48250, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "150.214.76.53",
      "dst" "192.168.1.6"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 48250}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 895162776,
     "assured" nil}}},
  "timestamp" 1334782213496,
  "relativeTimestamp" 249795597678575}})

;;;
;;; This sample data had been manually edited to match the layer3 and layer4
;;; source and destination addresses of the sniffer sample data.
;;; This edited data is required for testing the combined TCP duration delta event pattern.
;;;
(def tcp-update-TIME-WAIT-2
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.1.6",
      "dst" "74.200.247.188"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 34099, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "74.200.247.188",
      "dst" "192.168.1.6"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 34099}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 895162776,
     "assured" nil}}},
  "timestamp" 1334782213496,
  "relativeTimestamp" 249795597678575}})

(def tcp-update-destroy
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.1.6",
      "dst" "150.214.76.53"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 48250, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "150.214.76.53",
      "dst" "192.168.1.6"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 48250}},
    "independent" {"id" 895162776, "assured" nil, "deltatime" 135}}},
  "timestamp" 1334782333280,
  "relativeTimestamp" 249915381618190}})

(def udp-new
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.1.6",
      "dst" "62.42.230.24"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 37301, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "62.42.230.24",
      "dst" "192.168.1.6"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 37301}},
    "independent" {"timeout" 30, "id" 915960080, "unreplied" nil}}},
  "timestamp" 1334782349252,
  "relativeTimestamp" 249931353405242}})

(def udp-update
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.1.6",
      "dst" "62.42.230.24"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 37301, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "62.42.230.24",
      "dst" "192.168.1.6"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 37301}},
    "independent" {"timeout" 29, "id" 915960080}}},
  "timestamp" 1334782349719,
  "relativeTimestamp" 249931820611624}})

(def udp-destroy
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.1.6",
      "dst" "62.42.230.24"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 37301, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "62.42.230.24",
      "dst" "192.168.1.6"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 37301}},
    "independent" {"id" 915960080, "deltatime" 30}}},
  "timestamp" 1334782379350,
  "relativeTimestamp" 249961451548443}})



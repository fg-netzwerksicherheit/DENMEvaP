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
    :description "Short version of: A simulated SSH brute force attack via sshpass. Note: the server was configured for pubkey authentication only while login attempts were made with passwords."
    :raw-file "ssh_brute_force_sshpass_wlan0_2012-11-26.out"
    :date "2012-11-26"}
   cljEsperRunner.test.data.conntrack.simple-ssh-brute-force)

(def data-set [
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.100"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 45289, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45289}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582697896,
     "unreplied" nil}}},
  "timestamp" 1353918716930,
  "relativeTimestamp" 137789055582121}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.100"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 45289, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45289}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582697896}}},
  "timestamp" 1353918717284,
  "relativeTimestamp" 137789409372748}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.100"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 45289, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45289}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582697896,
     "assured" nil}}},
  "timestamp" 1353918717344,
  "relativeTimestamp" 137789469373708}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.100"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 45289, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45289}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582697896,
     "assured" nil}}},
  "timestamp" 1353918771036,
  "relativeTimestamp" 137843161440586}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.100"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 45289, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45289}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 59,
     "id" 582697896,
     "assured" nil}}},
  "timestamp" 1353918771104,
  "relativeTimestamp" 137843228778385}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.100"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 45289, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45289}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582697896,
     "assured" nil}}},
  "timestamp" 1353918771172,
  "relativeTimestamp" 137843296758608}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.100"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 45289, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45289}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 582697896, "assured" nil}}},
  "timestamp" 1353918771238,
  "relativeTimestamp" 137843362912576}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.100"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 45290, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45290}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865236152,
     "unreplied" nil}}},
  "timestamp" 1353918780191,
  "relativeTimestamp" 137852316613818}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.100"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 45290, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45290}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865236152}}},
  "timestamp" 1353918780564,
  "relativeTimestamp" 137852689527502}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.100"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 45290, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45290}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865236152,
     "assured" nil}}},
  "timestamp" 1353918780630,
  "relativeTimestamp" 137852755447402}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.100"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 45289, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45289}},
    "independent" {"id" 582697896, "assured" nil}}},
  "timestamp" 1353918781038,
  "relativeTimestamp" 137853163371823}}
     ])

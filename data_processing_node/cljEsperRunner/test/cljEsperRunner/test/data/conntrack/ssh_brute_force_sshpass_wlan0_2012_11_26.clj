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
    :description "A simulated SSH brute force attack via sshpass. Note: the server was configured for pubkey authentication only while login attempts were made with passwords."
    :raw-file "ssh_brute_force_sshpass_wlan0_2012-11-26.out"
    :date "2012-11-26"}
   cljEsperRunner.test.data.conntrack.ssh-brute-force-sshpass-wlan0-2012-11-26)

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
      "dst" "83.170.94.214"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 52935, "dport" 7000}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "83.170.94.214",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 7000, "dport" 52935}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 433020,
     "id" 6518256,
     "unreplied" nil}}},
  "timestamp" 1353918633244,
  "relativeTimestamp" 137705368852049}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "83.170.94.214"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 52935, "dport" 7000}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "83.170.94.214",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 7000, "dport" 52935}},
    "independent" {"timeout" 432000, "id" 6518256}}},
  "timestamp" 1353918635018,
  "relativeTimestamp" 137707142929530}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "83.170.94.214"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 52935, "dport" 7000}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "83.170.94.214",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 7000, "dport" 52935}},
    "independent" {"timeout" 432000, "id" 6518256, "assured" nil}}},
  "timestamp" 1353918636363,
  "relativeTimestamp" 137708488217448}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "64.12.30.45"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 58335, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "64.12.30.45",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 58335}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 433012,
     "id" 865236464,
     "unreplied" nil}}},
  "timestamp" 1353918641084,
  "relativeTimestamp" 137713208839186}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "64.12.30.63"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 39571, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "64.12.30.63",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 39571}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 433012,
     "id" 865236776,
     "unreplied" nil}}},
  "timestamp" 1353918641264,
  "relativeTimestamp" 137713389458269}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "64.12.30.45"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 58335, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "64.12.30.45",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 58335}},
    "independent" {"timeout" 432000, "id" 865236464}}},
  "timestamp" 1353918641381,
  "relativeTimestamp" 137713506683471}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "64.12.30.63"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 39571, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "64.12.30.63",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 39571}},
    "independent" {"timeout" 432000, "id" 865236776}}},
  "timestamp" 1353918641461,
  "relativeTimestamp" 137713586660617}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "64.12.30.45"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 58335, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "64.12.30.45",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 58335}},
    "independent" {"timeout" 300, "id" 865236464, "assured" nil}}},
  "timestamp" 1353918671082,
  "relativeTimestamp" 137743206793698}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "64.12.30.63"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 39571, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "64.12.30.63",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 39571}},
    "independent" {"timeout" 300, "id" 865236776, "assured" nil}}},
  "timestamp" 1353918671151,
  "relativeTimestamp" 137743275837738}}
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
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865236152,
     "assured" nil}}},
  "timestamp" 1353918781110,
  "relativeTimestamp" 137853235261188}}
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
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865236152,
     "assured" nil}}},
  "timestamp" 1353918781149,
  "relativeTimestamp" 137853274164494}}
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
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865236152,
     "assured" nil}}},
  "timestamp" 1353918781187,
  "relativeTimestamp" 137853312608238}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45291, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45291}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095542608,
     "unreplied" nil}}},
  "timestamp" 1353918806332,
  "relativeTimestamp" 137878457616933}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45291, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45291}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095542608}}},
  "timestamp" 1353918806674,
  "relativeTimestamp" 137878799146365}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45291, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45291}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095542608,
     "assured" nil}}},
  "timestamp" 1353918806707,
  "relativeTimestamp" 137878832065467}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45291, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45291}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095542608,
     "assured" nil}}},
  "timestamp" 1353918806936,
  "relativeTimestamp" 137879061361208}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45292, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45292}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095544792,
     "unreplied" nil}}},
  "timestamp" 1353918806974,
  "relativeTimestamp" 137879098736658}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45291, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45291}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095542608,
     "assured" nil}}},
  "timestamp" 1353918807024,
  "relativeTimestamp" 137879148896784}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45291, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45291}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095542608,
     "assured" nil}}},
  "timestamp" 1353918807068,
  "relativeTimestamp" 137879192722611}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45292, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45292}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095544792}}},
  "timestamp" 1353918807108,
  "relativeTimestamp" 137879233306273}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45292, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45292}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095544792,
     "assured" nil}}},
  "timestamp" 1353918807143,
  "relativeTimestamp" 137879267793181}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45292, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45292}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095544792,
     "assured" nil}}},
  "timestamp" 1353918807350,
  "relativeTimestamp" 137879474813512}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45292, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45292}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095544792,
     "assured" nil}}},
  "timestamp" 1353918807385,
  "relativeTimestamp" 137879510452136}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45292, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45292}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095544792,
     "assured" nil}}},
  "timestamp" 1353918807423,
  "relativeTimestamp" 137879547722167}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45293, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45293}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582697584,
     "unreplied" nil}}},
  "timestamp" 1353918807454,
  "relativeTimestamp" 137879579411482}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45293, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45293}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582697584}}},
  "timestamp" 1353918807485,
  "relativeTimestamp" 137879610095743}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45293, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45293}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582697584,
     "assured" nil}}},
  "timestamp" 1353918807513,
  "relativeTimestamp" 137879638642430}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45293, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45293}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582697584,
     "assured" nil}}},
  "timestamp" 1353918807654,
  "relativeTimestamp" 137879778848947}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45294, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45294}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582697272,
     "unreplied" nil}}},
  "timestamp" 1353918807692,
  "relativeTimestamp" 137879817426008}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45294, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45294}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582697272}}},
  "timestamp" 1353918807723,
  "relativeTimestamp" 137879847816430}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45294, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45294}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582697272,
     "assured" nil}}},
  "timestamp" 1353918807753,
  "relativeTimestamp" 137879878437117}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45293, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45293}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582697584,
     "assured" nil}}},
  "timestamp" 1353918807799,
  "relativeTimestamp" 137879923824420}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45293, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45293}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582697584,
     "assured" nil}}},
  "timestamp" 1353918807843,
  "relativeTimestamp" 137879968350321}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45294, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45294}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582697272,
     "assured" nil}}},
  "timestamp" 1353918808078,
  "relativeTimestamp" 137880202855940}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45295, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45295}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865235840,
     "unreplied" nil}}},
  "timestamp" 1353918808108,
  "relativeTimestamp" 137880233051214}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45294, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45294}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582697272,
     "assured" nil}}},
  "timestamp" 1353918808142,
  "relativeTimestamp" 137880267509354}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45294, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45294}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582697272,
     "assured" nil}}},
  "timestamp" 1353918808174,
  "relativeTimestamp" 137880299180714}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45295, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45295}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865235840}}},
  "timestamp" 1353918808208,
  "relativeTimestamp" 137880333430962}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45295, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45295}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865235840,
     "assured" nil}}},
  "timestamp" 1353918808235,
  "relativeTimestamp" 137880359939522}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45295, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45295}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865235840,
     "assured" nil}}},
  "timestamp" 1353918808392,
  "relativeTimestamp" 137880517377930}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45296, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45296}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865235528,
     "unreplied" nil}}},
  "timestamp" 1353918808422,
  "relativeTimestamp" 137880546843766}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45295, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45295}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865235840,
     "assured" nil}}},
  "timestamp" 1353918808459,
  "relativeTimestamp" 137880584358082}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45295, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45295}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865235840,
     "assured" nil}}},
  "timestamp" 1353918808500,
  "relativeTimestamp" 137880625336125}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45296, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45296}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865235528}}},
  "timestamp" 1353918808532,
  "relativeTimestamp" 137880657432178}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45296, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45296}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865235528,
     "assured" nil}}},
  "timestamp" 1353918808560,
  "relativeTimestamp" 137880685117842}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45296, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45296}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865235528,
     "assured" nil}}},
  "timestamp" 1353918808675,
  "relativeTimestamp" 137880800701365}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45297, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45297}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865235216,
     "unreplied" nil}}},
  "timestamp" 1353918808703,
  "relativeTimestamp" 137880828584846}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45296, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45296}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865235528,
     "assured" nil}}},
  "timestamp" 1353918808729,
  "relativeTimestamp" 137880854350902}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45296, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45296}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865235528,
     "assured" nil}}},
  "timestamp" 1353918808755,
  "relativeTimestamp" 137880880361420}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45297, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45297}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865235216}}},
  "timestamp" 1353918808786,
  "relativeTimestamp" 137880910978613}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45297, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45297}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865235216,
     "assured" nil}}},
  "timestamp" 1353918808811,
  "relativeTimestamp" 137880936219966}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45297, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45297}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865235216,
     "assured" nil}}},
  "timestamp" 1353918809008,
  "relativeTimestamp" 137881133040137}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45298, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45298}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582696960,
     "unreplied" nil}}},
  "timestamp" 1353918809036,
  "relativeTimestamp" 137881161206586}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45298, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45298}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582696960}}},
  "timestamp" 1353918809067,
  "relativeTimestamp" 137881191865171}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45298, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45298}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582696960,
     "assured" nil}}},
  "timestamp" 1353918809092,
  "relativeTimestamp" 137881217429113}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45297, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45297}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865235216,
     "assured" nil}}},
  "timestamp" 1353918809121,
  "relativeTimestamp" 137881246324751}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45297, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45297}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865235216,
     "assured" nil}}},
  "timestamp" 1353918809147,
  "relativeTimestamp" 137881271720091}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45298, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45298}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582696960,
     "assured" nil}}},
  "timestamp" 1353918809406,
  "relativeTimestamp" 137881531462939}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45299, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45299}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582698832,
     "unreplied" nil}}},
  "timestamp" 1353918809448,
  "relativeTimestamp" 137881573673730}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45299, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45299}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582698832}}},
  "timestamp" 1353918809475,
  "relativeTimestamp" 137881600389403}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45299, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45299}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582698832,
     "assured" nil}}},
  "timestamp" 1353918809501,
  "relativeTimestamp" 137881626079759}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45298, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45298}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 582696960,
     "assured" nil}}},
  "timestamp" 1353918809526,
  "relativeTimestamp" 137881651456391}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45298, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45298}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582696960,
     "assured" nil}}},
  "timestamp" 1353918809559,
  "relativeTimestamp" 137881684205568}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45298, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45298}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582696960,
     "assured" nil}}},
  "timestamp" 1353918809584,
  "relativeTimestamp" 137881708715275}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45299, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45299}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582698832,
     "assured" nil}}},
  "timestamp" 1353918809688,
  "relativeTimestamp" 137881812871436}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45300, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45300}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865234904,
     "unreplied" nil}}},
  "timestamp" 1353918809721,
  "relativeTimestamp" 137881845808434}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45300, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45300}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865234904}}},
  "timestamp" 1353918809745,
  "relativeTimestamp" 137881870500460}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45300, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45300}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865234904,
     "assured" nil}}},
  "timestamp" 1353918809770,
  "relativeTimestamp" 137881895251077}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45299, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45299}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582698832,
     "assured" nil}}},
  "timestamp" 1353918809795,
  "relativeTimestamp" 137881919781527}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45299, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45299}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582698832,
     "assured" nil}}},
  "timestamp" 1353918809821,
  "relativeTimestamp" 137881946199329}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45300, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45300}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865234904,
     "assured" nil}}},
  "timestamp" 1353918810178,
  "relativeTimestamp" 137882303250203}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45301, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45301}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582699144,
     "unreplied" nil}}},
  "timestamp" 1353918810302,
  "relativeTimestamp" 137882426878372}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45300, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45300}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 865234904,
     "assured" nil}}},
  "timestamp" 1353918810401,
  "relativeTimestamp" 137882525928166}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45301, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45301}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582699144}}},
  "timestamp" 1353918810514,
  "relativeTimestamp" 137882639213448}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45301, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45301}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582699144,
     "assured" nil}}},
  "timestamp" 1353918810642,
  "relativeTimestamp" 137882767360104}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45300, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45300}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865234904,
     "assured" nil}}},
  "timestamp" 1353918810745,
  "relativeTimestamp" 137882870638416}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45300, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45300}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865234904,
     "assured" nil}}},
  "timestamp" 1353918810852,
  "relativeTimestamp" 137882977534839}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45301, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45301}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582699144,
     "assured" nil}}},
  "timestamp" 1353918810957,
  "relativeTimestamp" 137883081847230}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45301, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45301}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 29,
     "id" 582699144,
     "assured" nil}}},
  "timestamp" 1353918811058,
  "relativeTimestamp" 137883183264573}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45301, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45301}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582699144,
     "assured" nil}}},
  "timestamp" 1353918811203,
  "relativeTimestamp" 137883328109661}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45302, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45302}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865234592,
     "unreplied" nil}}},
  "timestamp" 1353918811311,
  "relativeTimestamp" 137883436538832}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45302, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45302}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865234592}}},
  "timestamp" 1353918811412,
  "relativeTimestamp" 137883537258529}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45302, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45302}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865234592,
     "assured" nil}}},
  "timestamp" 1353918811522,
  "relativeTimestamp" 137883647349403}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45302, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45302}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865234592,
     "assured" nil}}},
  "timestamp" 1353918811647,
  "relativeTimestamp" 137883772396608}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45302, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45302}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865234592,
     "assured" nil}}},
  "timestamp" 1353918811751,
  "relativeTimestamp" 137883876341621}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45302, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45302}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865234592,
     "assured" nil}}},
  "timestamp" 1353918811851,
  "relativeTimestamp" 137883976309114}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45303, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45303}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 6517944,
     "unreplied" nil}}},
  "timestamp" 1353918811970,
  "relativeTimestamp" 137884095258213}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45303, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45303}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 6517944}}},
  "timestamp" 1353918812091,
  "relativeTimestamp" 137884215920581}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45303, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45303}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 6517944,
     "assured" nil}}},
  "timestamp" 1353918812192,
  "relativeTimestamp" 137884317262274}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45303, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45303}},
    "independent"
    {"state" "FIN_WAIT", "timeout" 120, "id" 6517944, "assured" nil}}},
  "timestamp" 1353918812287,
  "relativeTimestamp" 137884412575182}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45303, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45303}},
    "independent"
    {"state" "LAST_ACK", "timeout" 30, "id" 6517944, "assured" nil}}},
  "timestamp" 1353918812395,
  "relativeTimestamp" 137884520444200}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45303, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45303}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 6517944,
     "assured" nil}}},
  "timestamp" 1353918812508,
  "relativeTimestamp" 137884632927479}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45304, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45304}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095546352,
     "unreplied" nil}}},
  "timestamp" 1353918812620,
  "relativeTimestamp" 137884745312807}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45304, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45304}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095546352}}},
  "timestamp" 1353918812723,
  "relativeTimestamp" 137884848626424}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45304, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45304}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095546352,
     "assured" nil}}},
  "timestamp" 1353918812839,
  "relativeTimestamp" 137884964320171}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45304, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45304}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095546352,
     "assured" nil}}},
  "timestamp" 1353918812956,
  "relativeTimestamp" 137885080870051}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45305, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45305}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582699456,
     "unreplied" nil}}},
  "timestamp" 1353918813085,
  "relativeTimestamp" 137885209859558}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45305, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45305}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582699456}}},
  "timestamp" 1353918813246,
  "relativeTimestamp" 137885370790843}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45305, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45305}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582699456,
     "assured" nil}}},
  "timestamp" 1353918813367,
  "relativeTimestamp" 137885492420954}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45304, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45304}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 1095546352,
     "assured" nil}}},
  "timestamp" 1353918813463,
  "relativeTimestamp" 137885588156411}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45304, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45304}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095546352,
     "assured" nil}}},
  "timestamp" 1353918813587,
  "relativeTimestamp" 137885711804029}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45304, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45304}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095546352,
     "assured" nil}}},
  "timestamp" 1353918813734,
  "relativeTimestamp" 137885859465960}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45305, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45305}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582699456,
     "assured" nil}}},
  "timestamp" 1353918813832,
  "relativeTimestamp" 137885957216088}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45306, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45306}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582699768,
     "unreplied" nil}}},
  "timestamp" 1353918813932,
  "relativeTimestamp" 137886057692179}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45306, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45306}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582699768}}},
  "timestamp" 1353918814032,
  "relativeTimestamp" 137886157095946}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45306, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45306}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582699768,
     "assured" nil}}},
  "timestamp" 1353918814170,
  "relativeTimestamp" 137886294745473}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45305, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45305}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 582699456,
     "assured" nil}}},
  "timestamp" 1353918814275,
  "relativeTimestamp" 137886400059850}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45305, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45305}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582699456,
     "assured" nil}}},
  "timestamp" 1353918814372,
  "relativeTimestamp" 137886496873975}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45305, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45305}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582699456,
     "assured" nil}}},
  "timestamp" 1353918814464,
  "relativeTimestamp" 137886588933170}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45306, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45306}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582699768,
     "assured" nil}}},
  "timestamp" 1353918814557,
  "relativeTimestamp" 137886681902777}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45306, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45306}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582699768,
     "assured" nil}}},
  "timestamp" 1353918814676,
  "relativeTimestamp" 137886800716395}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45306, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45306}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582699768,
     "assured" nil}}},
  "timestamp" 1353918814812,
  "relativeTimestamp" 137886937271318}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45307, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45307}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582700080,
     "unreplied" nil}}},
  "timestamp" 1353918814906,
  "relativeTimestamp" 137887031189566}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45307, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45307}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582700080}}},
  "timestamp" 1353918815007,
  "relativeTimestamp" 137887132261145}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45307, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45307}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582700080,
     "assured" nil}}},
  "timestamp" 1353918815100,
  "relativeTimestamp" 137887225209611}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45307, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45307}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582700080,
     "assured" nil}}},
  "timestamp" 1353918815251,
  "relativeTimestamp" 137887376520217}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45307, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45307}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582700080,
     "assured" nil}}},
  "timestamp" 1353918815369,
  "relativeTimestamp" 137887494363489}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45307, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45307}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582700080,
     "assured" nil}}},
  "timestamp" 1353918815486,
  "relativeTimestamp" 137887611390875}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45308, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45308}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582700392,
     "unreplied" nil}}},
  "timestamp" 1353918815591,
  "relativeTimestamp" 137887716633488}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45308, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45308}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582700392}}},
  "timestamp" 1353918815692,
  "relativeTimestamp" 137887816882233}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45308, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45308}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582700392,
     "assured" nil}}},
  "timestamp" 1353918815849,
  "relativeTimestamp" 137887974547892}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45308, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45308}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582700392,
     "assured" nil}}},
  "timestamp" 1353918815969,
  "relativeTimestamp" 137888094164771}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45308, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45308}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582700392,
     "assured" nil}}},
  "timestamp" 1353918816069,
  "relativeTimestamp" 137888194184707}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45308, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45308}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582700392,
     "assured" nil}}},
  "timestamp" 1353918816169,
  "relativeTimestamp" 137888293973821}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45309, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45309}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095543232,
     "unreplied" nil}}},
  "timestamp" 1353918816308,
  "relativeTimestamp" 137888433091362}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45309, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45309}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095543232}}},
  "timestamp" 1353918816443,
  "relativeTimestamp" 137888567844775}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45309, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45309}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095543232,
     "assured" nil}}},
  "timestamp" 1353918816569,
  "relativeTimestamp" 137888694396046}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45309, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45309}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095543232,
     "assured" nil}}},
  "timestamp" 1353918816670,
  "relativeTimestamp" 137888794817678}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45309, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45309}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095543232,
     "assured" nil}}},
  "timestamp" 1353918816818,
  "relativeTimestamp" 137888943434324}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45309, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45309}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095543232,
     "assured" nil}}},
  "timestamp" 1353918816927,
  "relativeTimestamp" 137889051719709}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45310, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45310}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865234280,
     "unreplied" nil}}},
  "timestamp" 1353918817033,
  "relativeTimestamp" 137889158360608}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45310, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45310}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865234280}}},
  "timestamp" 1353918817171,
  "relativeTimestamp" 137889296371349}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45310, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45310}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865234280,
     "assured" nil}}},
  "timestamp" 1353918817301,
  "relativeTimestamp" 137889426555823}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45310, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45310}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865234280,
     "assured" nil}}},
  "timestamp" 1353918817429,
  "relativeTimestamp" 137889554482851}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45310, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45310}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865234280,
     "assured" nil}}},
  "timestamp" 1353918817531,
  "relativeTimestamp" 137889656352521}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45310, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45310}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865234280,
     "assured" nil}}},
  "timestamp" 1353918817629,
  "relativeTimestamp" 137889754561508}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45311, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45311}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865233968,
     "unreplied" nil}}},
  "timestamp" 1353918817775,
  "relativeTimestamp" 137889900645562}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45311, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45311}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865233968}}},
  "timestamp" 1353918817919,
  "relativeTimestamp" 137890044497659}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45311, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45311}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865233968,
     "assured" nil}}},
  "timestamp" 1353918818022,
  "relativeTimestamp" 137890146770232}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45311, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45311}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865233968,
     "assured" nil}}},
  "timestamp" 1353918818113,
  "relativeTimestamp" 137890238366237}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45311, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45311}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865233968,
     "assured" nil}}},
  "timestamp" 1353918818227,
  "relativeTimestamp" 137890352666404}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45311, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45311}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865233968,
     "assured" nil}}},
  "timestamp" 1353918818361,
  "relativeTimestamp" 137890486111494}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45312, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45312}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095548536,
     "unreplied" nil}}},
  "timestamp" 1353918818478,
  "relativeTimestamp" 137890603259040}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45312, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45312}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095548536}}},
  "timestamp" 1353918818570,
  "relativeTimestamp" 137890695087421}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45312, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45312}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095548536,
     "assured" nil}}},
  "timestamp" 1353918818663,
  "relativeTimestamp" 137890788254837}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45312, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45312}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095548536,
     "assured" nil}}},
  "timestamp" 1353918818798,
  "relativeTimestamp" 137890922891833}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45312, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45312}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095548536,
     "assured" nil}}},
  "timestamp" 1353918818941,
  "relativeTimestamp" 137891066570937}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45312, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45312}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095548536,
     "assured" nil}}},
  "timestamp" 1353918819027,
  "relativeTimestamp" 137891152450905}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45313, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45313}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 6517632,
     "unreplied" nil}}},
  "timestamp" 1353918819132,
  "relativeTimestamp" 137891257089711}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45313, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45313}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 6517632}}},
  "timestamp" 1353918819222,
  "relativeTimestamp" 137891346858855}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45313, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45313}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 6517632,
     "assured" nil}}},
  "timestamp" 1353918819308,
  "relativeTimestamp" 137891432936758}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45313, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45313}},
    "independent"
    {"state" "FIN_WAIT", "timeout" 120, "id" 6517632, "assured" nil}}},
  "timestamp" 1353918819459,
  "relativeTimestamp" 137891584577648}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45313, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45313}},
    "independent"
    {"state" "LAST_ACK", "timeout" 30, "id" 6517632, "assured" nil}}},
  "timestamp" 1353918819598,
  "relativeTimestamp" 137891723352707}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45313, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45313}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 6517632,
     "assured" nil}}},
  "timestamp" 1353918819704,
  "relativeTimestamp" 137891828987004}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45314, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45314}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 6517320,
     "unreplied" nil}}},
  "timestamp" 1353918819816,
  "relativeTimestamp" 137891941637152}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45314, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45314}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 6517320}}},
  "timestamp" 1353918819918,
  "relativeTimestamp" 137892043278980}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45314, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45314}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 6517320,
     "assured" nil}}},
  "timestamp" 1353918820039,
  "relativeTimestamp" 137892163744882}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45314, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45314}},
    "independent"
    {"state" "FIN_WAIT", "timeout" 120, "id" 6517320, "assured" nil}}},
  "timestamp" 1353918820174,
  "relativeTimestamp" 137892299211724}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45314, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45314}},
    "independent"
    {"state" "LAST_ACK", "timeout" 29, "id" 6517320, "assured" nil}}},
  "timestamp" 1353918820278,
  "relativeTimestamp" 137892403263619}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45314, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45314}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 6517320,
     "assured" nil}}},
  "timestamp" 1353918820382,
  "relativeTimestamp" 137892507066180}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45315, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45315}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582700704,
     "unreplied" nil}}},
  "timestamp" 1353918820509,
  "relativeTimestamp" 137892634242916}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45315, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45315}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582700704}}},
  "timestamp" 1353918820625,
  "relativeTimestamp" 137892749949807}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45315, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45315}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582700704,
     "assured" nil}}},
  "timestamp" 1353918820705,
  "relativeTimestamp" 137892830617327}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45315, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45315}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582700704,
     "assured" nil}}},
  "timestamp" 1353918820804,
  "relativeTimestamp" 137892929501089}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45315, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45315}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582700704,
     "assured" nil}}},
  "timestamp" 1353918820892,
  "relativeTimestamp" 137893017530405}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45315, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45315}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582700704,
     "assured" nil}}},
  "timestamp" 1353918820981,
  "relativeTimestamp" 137893105861275}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45316, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45316}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582701016,
     "unreplied" nil}}},
  "timestamp" 1353918821094,
  "relativeTimestamp" 137893218901100}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45316, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45316}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582701016}}},
  "timestamp" 1353918821319,
  "relativeTimestamp" 137893444560410}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45316, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45316}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582701016,
     "assured" nil}}},
  "timestamp" 1353918821490,
  "relativeTimestamp" 137893615249577}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45316, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45316}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582701016,
     "assured" nil}}},
  "timestamp" 1353918821619,
  "relativeTimestamp" 137893744612469}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45316, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45316}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582701016,
     "assured" nil}}},
  "timestamp" 1353918821770,
  "relativeTimestamp" 137893895210620}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45316, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45316}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582701016,
     "assured" nil}}},
  "timestamp" 1353918821852,
  "relativeTimestamp" 137893977037678}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45317, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45317}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582701328,
     "unreplied" nil}}},
  "timestamp" 1353918821958,
  "relativeTimestamp" 137894083156479}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45317, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45317}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582701328}}},
  "timestamp" 1353918822094,
  "relativeTimestamp" 137894219444265}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45317, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45317}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582701328,
     "assured" nil}}},
  "timestamp" 1353918822217,
  "relativeTimestamp" 137894342078071}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45317, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45317}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582701328,
     "assured" nil}}},
  "timestamp" 1353918822382,
  "relativeTimestamp" 137894507087035}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45317, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45317}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582701328,
     "assured" nil}}},
  "timestamp" 1353918822484,
  "relativeTimestamp" 137894609582877}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45317, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45317}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582701328,
     "assured" nil}}},
  "timestamp" 1353918822601,
  "relativeTimestamp" 137894725975346}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45318, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45318}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582701640,
     "unreplied" nil}}},
  "timestamp" 1353918822726,
  "relativeTimestamp" 137894851487016}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45318, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45318}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582701640}}},
  "timestamp" 1353918822835,
  "relativeTimestamp" 137894959896978}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45318, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45318}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582701640,
     "assured" nil}}},
  "timestamp" 1353918822938,
  "relativeTimestamp" 137895062720890}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45318, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45318}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582701640,
     "assured" nil}}},
  "timestamp" 1353918823030,
  "relativeTimestamp" 137895155679939}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45319, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45319}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582701952,
     "unreplied" nil}}},
  "timestamp" 1353918823203,
  "relativeTimestamp" 137895327866489}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45319, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45319}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582701952}}},
  "timestamp" 1353918823286,
  "relativeTimestamp" 137895410886883}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45319, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45319}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582701952,
     "assured" nil}}},
  "timestamp" 1353918823372,
  "relativeTimestamp" 137895497267698}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45318, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45318}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 582701640,
     "assured" nil}}},
  "timestamp" 1353918823508,
  "relativeTimestamp" 137895633685594}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45318, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45318}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582701640,
     "assured" nil}}},
  "timestamp" 1353918823645,
  "relativeTimestamp" 137895770164806}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45318, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45318}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582701640,
     "assured" nil}}},
  "timestamp" 1353918823727,
  "relativeTimestamp" 137895852411254}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45319, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45319}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582701952,
     "assured" nil}}},
  "timestamp" 1353918823817,
  "relativeTimestamp" 137895941749442}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45319, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45319}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582701952,
     "assured" nil}}},
  "timestamp" 1353918823919,
  "relativeTimestamp" 137896044464251}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45319, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45319}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582701952,
     "assured" nil}}},
  "timestamp" 1353918824003,
  "relativeTimestamp" 137896128532164}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45320, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45320}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 6517008,
     "unreplied" nil}}},
  "timestamp" 1353918824094,
  "relativeTimestamp" 137896219436220}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45320, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45320}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 6517008}}},
  "timestamp" 1353918824220,
  "relativeTimestamp" 137896345550183}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45320, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45320}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 6517008,
     "assured" nil}}},
  "timestamp" 1353918824311,
  "relativeTimestamp" 137896436192347}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45320, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45320}},
    "independent"
    {"state" "FIN_WAIT", "timeout" 120, "id" 6517008, "assured" nil}}},
  "timestamp" 1353918824399,
  "relativeTimestamp" 137896524540991}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45321, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45321}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095541048,
     "unreplied" nil}}},
  "timestamp" 1353918824489,
  "relativeTimestamp" 137896614322813}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45320, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45320}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 6517008,
     "assured" nil}}},
  "timestamp" 1353918824583,
  "relativeTimestamp" 137896708573479}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45321, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45321}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095541048}}},
  "timestamp" 1353918824666,
  "relativeTimestamp" 137896791639095}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45321, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45321}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095541048,
     "assured" nil}}},
  "timestamp" 1353918824788,
  "relativeTimestamp" 137896913144083}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45320, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45320}},
    "independent"
    {"state" "LAST_ACK", "timeout" 30, "id" 6517008, "assured" nil}}},
  "timestamp" 1353918824900,
  "relativeTimestamp" 137897025670551}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45320, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45320}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 6517008,
     "assured" nil}}},
  "timestamp" 1353918824991,
  "relativeTimestamp" 137897116687076}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45321, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45321}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095541048,
     "assured" nil}}},
  "timestamp" 1353918825072,
  "relativeTimestamp" 137897196972580}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45321, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45321}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095541048,
     "assured" nil}}},
  "timestamp" 1353918825156,
  "relativeTimestamp" 137897281150794}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45321, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45321}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095541048,
     "assured" nil}}},
  "timestamp" 1353918825237,
  "relativeTimestamp" 137897361937453}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45322, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45322}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582702264,
     "unreplied" nil}}},
  "timestamp" 1353918825320,
  "relativeTimestamp" 137897445419723}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45322, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45322}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582702264}}},
  "timestamp" 1353918825428,
  "relativeTimestamp" 137897552933550}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45322, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45322}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582702264,
     "assured" nil}}},
  "timestamp" 1353918825511,
  "relativeTimestamp" 137897636060620}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45322, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45322}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 119,
     "id" 582702264,
     "assured" nil}}},
  "timestamp" 1353918825594,
  "relativeTimestamp" 137897718802226}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45323, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45323}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865233656,
     "unreplied" nil}}},
  "timestamp" 1353918825679,
  "relativeTimestamp" 137897804283668}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45323, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45323}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865233656}}},
  "timestamp" 1353918825772,
  "relativeTimestamp" 137897897446613}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45323, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45323}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865233656,
     "assured" nil}}},
  "timestamp" 1353918825849,
  "relativeTimestamp" 137897974384681}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45322, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45322}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 582702264,
     "assured" nil}}},
  "timestamp" 1353918825936,
  "relativeTimestamp" 137898061068743}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45322, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45322}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582702264,
     "assured" nil}}},
  "timestamp" 1353918826056,
  "relativeTimestamp" 137898181159505}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45322, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45322}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582702264,
     "assured" nil}}},
  "timestamp" 1353918826155,
  "relativeTimestamp" 137898280258570}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45323, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45323}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865233656,
     "assured" nil}}},
  "timestamp" 1353918826235,
  "relativeTimestamp" 137898359812792}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45323, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45323}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865233656,
     "assured" nil}}},
  "timestamp" 1353918826314,
  "relativeTimestamp" 137898438966716}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45323, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45323}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865233656,
     "assured" nil}}},
  "timestamp" 1353918826400,
  "relativeTimestamp" 137898524824686}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45324, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45324}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582702576,
     "unreplied" nil}}},
  "timestamp" 1353918826509,
  "relativeTimestamp" 137898634547434}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45324, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45324}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582702576}}},
  "timestamp" 1353918826653,
  "relativeTimestamp" 137898778426842}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45324, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45324}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582702576,
     "assured" nil}}},
  "timestamp" 1353918826750,
  "relativeTimestamp" 137898874922477}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45324, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45324}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582702576,
     "assured" nil}}},
  "timestamp" 1353918826853,
  "relativeTimestamp" 137898978518143}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45325, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45325}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582702888,
     "unreplied" nil}}},
  "timestamp" 1353918826972,
  "relativeTimestamp" 137899097551473}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45325, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45325}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582702888}}},
  "timestamp" 1353918827088,
  "relativeTimestamp" 137899213477521}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45325, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45325}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582702888,
     "assured" nil}}},
  "timestamp" 1353918827173,
  "relativeTimestamp" 137899298191844}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45324, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45324}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 582702576,
     "assured" nil}}},
  "timestamp" 1353918827259,
  "relativeTimestamp" 137899384184339}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45324, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45324}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582702576,
     "assured" nil}}},
  "timestamp" 1353918827373,
  "relativeTimestamp" 137899497957837}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45324, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45324}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582702576,
     "assured" nil}}},
  "timestamp" 1353918827503,
  "relativeTimestamp" 137899627990723}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45325, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45325}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582702888,
     "assured" nil}}},
  "timestamp" 1353918827688,
  "relativeTimestamp" 137899813086968}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45325, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45325}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582702888,
     "assured" nil}}},
  "timestamp" 1353918827804,
  "relativeTimestamp" 137899929186804}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45325, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45325}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582702888,
     "assured" nil}}},
  "timestamp" 1353918827899,
  "relativeTimestamp" 137900024185416}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45326, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45326}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865233344,
     "unreplied" nil}}},
  "timestamp" 1353918828013,
  "relativeTimestamp" 137900138333509}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45326, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45326}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865233344}}},
  "timestamp" 1353918828147,
  "relativeTimestamp" 137900272266839}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45326, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45326}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865233344,
     "assured" nil}}},
  "timestamp" 1353918828222,
  "relativeTimestamp" 137900347172241}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45326, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45326}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865233344,
     "assured" nil}}},
  "timestamp" 1353918828305,
  "relativeTimestamp" 137900430509306}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45326, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45326}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865233344,
     "assured" nil}}},
  "timestamp" 1353918828384,
  "relativeTimestamp" 137900509289925}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45326, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45326}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865233344,
     "assured" nil}}},
  "timestamp" 1353918828471,
  "relativeTimestamp" 137900595712609}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45327, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45327}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582703200,
     "unreplied" nil}}},
  "timestamp" 1353918828584,
  "relativeTimestamp" 137900709587282}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45327, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45327}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582703200}}},
  "timestamp" 1353918828689,
  "relativeTimestamp" 137900814462003}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45327, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45327}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582703200,
     "assured" nil}}},
  "timestamp" 1353918828773,
  "relativeTimestamp" 137900897744484}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45327, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45327}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582703200,
     "assured" nil}}},
  "timestamp" 1353918828851,
  "relativeTimestamp" 137900976708214}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45327, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45327}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582703200,
     "assured" nil}}},
  "timestamp" 1353918828932,
  "relativeTimestamp" 137901056752280}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45327, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45327}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582703200,
     "assured" nil}}},
  "timestamp" 1353918829013,
  "relativeTimestamp" 137901138689995}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45328, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45328}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582703512,
     "unreplied" nil}}},
  "timestamp" 1353918829114,
  "relativeTimestamp" 137901239064040}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45328, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45328}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582703512}}},
  "timestamp" 1353918829239,
  "relativeTimestamp" 137901363794984}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45328, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45328}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582703512,
     "assured" nil}}},
  "timestamp" 1353918829329,
  "relativeTimestamp" 137901454577825}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45328, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45328}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582703512,
     "assured" nil}}},
  "timestamp" 1353918829412,
  "relativeTimestamp" 137901537365116}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45328, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45328}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582703512,
     "assured" nil}}},
  "timestamp" 1353918829498,
  "relativeTimestamp" 137901623205504}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45328, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45328}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582703512,
     "assured" nil}}},
  "timestamp" 1353918829601,
  "relativeTimestamp" 137901726429503}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45329, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45329}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865233032,
     "unreplied" nil}}},
  "timestamp" 1353918829706,
  "relativeTimestamp" 137901831613565}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45329, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45329}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865233032}}},
  "timestamp" 1353918829785,
  "relativeTimestamp" 137901910540992}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45329, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45329}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865233032,
     "assured" nil}}},
  "timestamp" 1353918829882,
  "relativeTimestamp" 137902007082620}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45329, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45329}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865233032,
     "assured" nil}}},
  "timestamp" 1353918829975,
  "relativeTimestamp" 137902099847123}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45329, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45329}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865233032,
     "assured" nil}}},
  "timestamp" 1353918830068,
  "relativeTimestamp" 137902193129344}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45329, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45329}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865233032,
     "assured" nil}}},
  "timestamp" 1353918830147,
  "relativeTimestamp" 137902271864585}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45330, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45330}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095542296,
     "unreplied" nil}}},
  "timestamp" 1353918830238,
  "relativeTimestamp" 137902362918330}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45330, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45330}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095542296}}},
  "timestamp" 1353918830338,
  "relativeTimestamp" 137902462890710}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45330, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45330}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095542296,
     "assured" nil}}},
  "timestamp" 1353918830410,
  "relativeTimestamp" 137902535511348}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45330, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45330}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095542296,
     "assured" nil}}},
  "timestamp" 1353918830490,
  "relativeTimestamp" 137902615602767}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45330, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45330}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095542296,
     "assured" nil}}},
  "timestamp" 1353918830572,
  "relativeTimestamp" 137902697383084}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45330, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45330}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095542296,
     "assured" nil}}},
  "timestamp" 1353918830659,
  "relativeTimestamp" 137902784705648}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45331, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45331}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095543544,
     "unreplied" nil}}},
  "timestamp" 1353918830765,
  "relativeTimestamp" 137902890659575}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45331, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45331}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095543544}}},
  "timestamp" 1353918830852,
  "relativeTimestamp" 137902976921309}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45331, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45331}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095543544,
     "assured" nil}}},
  "timestamp" 1353918830935,
  "relativeTimestamp" 137903060201456}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45331, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45331}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095543544,
     "assured" nil}}},
  "timestamp" 1353918831031,
  "relativeTimestamp" 137903156446327}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45331, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45331}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095543544,
     "assured" nil}}},
  "timestamp" 1353918831111,
  "relativeTimestamp" 137903236454483}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45331, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45331}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095543544,
     "assured" nil}}},
  "timestamp" 1353918831215,
  "relativeTimestamp" 137903340664147}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45332, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45332}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 6516696,
     "unreplied" nil}}},
  "timestamp" 1353918831315,
  "relativeTimestamp" 137903440289469}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45332, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45332}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 6516696}}},
  "timestamp" 1353918831413,
  "relativeTimestamp" 137903538059036}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45332, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45332}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 6516696,
     "assured" nil}}},
  "timestamp" 1353918831497,
  "relativeTimestamp" 137903622423620}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45332, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45332}},
    "independent"
    {"state" "FIN_WAIT", "timeout" 120, "id" 6516696, "assured" nil}}},
  "timestamp" 1353918831581,
  "relativeTimestamp" 137903706703839}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45332, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45332}},
    "independent"
    {"state" "LAST_ACK", "timeout" 29, "id" 6516696, "assured" nil}}},
  "timestamp" 1353918831663,
  "relativeTimestamp" 137903788329541}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45332, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45332}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 6516696,
     "assured" nil}}},
  "timestamp" 1353918831815,
  "relativeTimestamp" 137903939860490}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45333, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45333}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 6516384,
     "unreplied" nil}}},
  "timestamp" 1353918831904,
  "relativeTimestamp" 137904029316175}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45333, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45333}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 6516384}}},
  "timestamp" 1353918831987,
  "relativeTimestamp" 137904111847173}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45333, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45333}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 6516384,
     "assured" nil}}},
  "timestamp" 1353918832058,
  "relativeTimestamp" 137904183392604}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45333, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45333}},
    "independent"
    {"state" "FIN_WAIT", "timeout" 120, "id" 6516384, "assured" nil}}},
  "timestamp" 1353918832135,
  "relativeTimestamp" 137904260185547}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45333, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45333}},
    "independent"
    {"state" "LAST_ACK", "timeout" 30, "id" 6516384, "assured" nil}}},
  "timestamp" 1353918832237,
  "relativeTimestamp" 137904362047279}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45333, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45333}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 6516384,
     "assured" nil}}},
  "timestamp" 1353918832352,
  "relativeTimestamp" 137904476714113}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45334, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45334}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095540736,
     "unreplied" nil}}},
  "timestamp" 1353918832430,
  "relativeTimestamp" 137904555215459}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45334, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45334}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095540736}}},
  "timestamp" 1353918832508,
  "relativeTimestamp" 137904633391032}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45334, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45334}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095540736,
     "assured" nil}}},
  "timestamp" 1353918832580,
  "relativeTimestamp" 137904705119005}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45334, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45334}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095540736,
     "assured" nil}}},
  "timestamp" 1353918832657,
  "relativeTimestamp" 137904782602033}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45334, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45334}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095540736,
     "assured" nil}}},
  "timestamp" 1353918832733,
  "relativeTimestamp" 137904858673482}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45334, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45334}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095540736,
     "assured" nil}}},
  "timestamp" 1353918832836,
  "relativeTimestamp" 137904960846338}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45335, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45335}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095547912,
     "unreplied" nil}}},
  "timestamp" 1353918832914,
  "relativeTimestamp" 137905039327534}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45335, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45335}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095547912}}},
  "timestamp" 1353918832990,
  "relativeTimestamp" 137905115009681}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45335, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45335}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095547912,
     "assured" nil}}},
  "timestamp" 1353918833068,
  "relativeTimestamp" 137905193158076}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45335, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45335}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095547912,
     "assured" nil}}},
  "timestamp" 1353918833159,
  "relativeTimestamp" 137905283956337}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45335, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45335}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095547912,
     "assured" nil}}},
  "timestamp" 1353918833240,
  "relativeTimestamp" 137905365238897}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45335, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45335}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095547912,
     "assured" nil}}},
  "timestamp" 1353918833313,
  "relativeTimestamp" 137905438164325}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45336, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45336}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865232720,
     "unreplied" nil}}},
  "timestamp" 1353918833387,
  "relativeTimestamp" 137905511779837}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45336, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45336}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865232720}}},
  "timestamp" 1353918833510,
  "relativeTimestamp" 137905635150523}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45336, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45336}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865232720,
     "assured" nil}}},
  "timestamp" 1353918833586,
  "relativeTimestamp" 137905711675460}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45336, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45336}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865232720,
     "assured" nil}}},
  "timestamp" 1353918833674,
  "relativeTimestamp" 137905799174453}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45336, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45336}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865232720,
     "assured" nil}}},
  "timestamp" 1353918833768,
  "relativeTimestamp" 137905893685720}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45336, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45336}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865232720,
     "assured" nil}}},
  "timestamp" 1353918833879,
  "relativeTimestamp" 137906004080637}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45337, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45337}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095546664,
     "unreplied" nil}}},
  "timestamp" 1353918833985,
  "relativeTimestamp" 137906110104066}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45337, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45337}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095546664}}},
  "timestamp" 1353918834099,
  "relativeTimestamp" 137906224507598}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45337, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45337}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095546664,
     "assured" nil}}},
  "timestamp" 1353918834211,
  "relativeTimestamp" 137906335821327}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45337, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45337}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095546664,
     "assured" nil}}},
  "timestamp" 1353918834306,
  "relativeTimestamp" 137906431456189}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45338, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45338}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865232408,
     "unreplied" nil}}},
  "timestamp" 1353918834384,
  "relativeTimestamp" 137906509181036}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45337, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45337}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 1095546664,
     "assured" nil}}},
  "timestamp" 1353918834489,
  "relativeTimestamp" 137906614153508}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45338, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45338}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865232408}}},
  "timestamp" 1353918834582,
  "relativeTimestamp" 137906706769343}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45338, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45338}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865232408,
     "assured" nil}}},
  "timestamp" 1353918834657,
  "relativeTimestamp" 137906782482936}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45337, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45337}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095546664,
     "assured" nil}}},
  "timestamp" 1353918834737,
  "relativeTimestamp" 137906862286122}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45337, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45337}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095546664,
     "assured" nil}}},
  "timestamp" 1353918834832,
  "relativeTimestamp" 137906957506988}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45338, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45338}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865232408,
     "assured" nil}}},
  "timestamp" 1353918834907,
  "relativeTimestamp" 137907031913002}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45338, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45338}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865232408,
     "assured" nil}}},
  "timestamp" 1353918834980,
  "relativeTimestamp" 137907105541478}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45338, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45338}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865232408,
     "assured" nil}}},
  "timestamp" 1353918835059,
  "relativeTimestamp" 137907184512268}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45339, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45339}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865232096,
     "unreplied" nil}}},
  "timestamp" 1353918835149,
  "relativeTimestamp" 137907273994868}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45339, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45339}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865232096}}},
  "timestamp" 1353918835235,
  "relativeTimestamp" 137907360239954}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45339, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45339}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865232096,
     "assured" nil}}},
  "timestamp" 1353918835311,
  "relativeTimestamp" 137907436134798}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45339, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45339}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865232096,
     "assured" nil}}},
  "timestamp" 1353918835384,
  "relativeTimestamp" 137907509435933}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45339, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45339}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865232096,
     "assured" nil}}},
  "timestamp" 1353918835459,
  "relativeTimestamp" 137907584160062}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45339, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45339}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865232096,
     "assured" nil}}},
  "timestamp" 1353918835542,
  "relativeTimestamp" 137907667123476}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45340, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45340}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582703824,
     "unreplied" nil}}},
  "timestamp" 1353918835652,
  "relativeTimestamp" 137907777298494}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45340, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45340}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582703824}}},
  "timestamp" 1353918835733,
  "relativeTimestamp" 137907857981921}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45340, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45340}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582703824,
     "assured" nil}}},
  "timestamp" 1353918835809,
  "relativeTimestamp" 137907934329651}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45340, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45340}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582703824,
     "assured" nil}}},
  "timestamp" 1353918835893,
  "relativeTimestamp" 137908017900842}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45340, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45340}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582703824,
     "assured" nil}}},
  "timestamp" 1353918835972,
  "relativeTimestamp" 137908097166751}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45340, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45340}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582703824,
     "assured" nil}}},
  "timestamp" 1353918836054,
  "relativeTimestamp" 137908179425613}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45341, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45341}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095543856,
     "unreplied" nil}}},
  "timestamp" 1353918836160,
  "relativeTimestamp" 137908285390650}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45341, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45341}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095543856}}},
  "timestamp" 1353918836271,
  "relativeTimestamp" 137908396328066}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45341, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45341}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095543856,
     "assured" nil}}},
  "timestamp" 1353918836351,
  "relativeTimestamp" 137908476161009}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45341, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45341}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095543856,
     "assured" nil}}},
  "timestamp" 1353918836427,
  "relativeTimestamp" 137908552387630}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45341, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45341}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095543856,
     "assured" nil}}},
  "timestamp" 1353918836503,
  "relativeTimestamp" 137908628448369}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45341, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45341}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095543856,
     "assured" nil}}},
  "timestamp" 1353918836576,
  "relativeTimestamp" 137908701029147}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45342, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45342}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865231784,
     "unreplied" nil}}},
  "timestamp" 1353918836686,
  "relativeTimestamp" 137908811251802}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45342, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45342}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865231784}}},
  "timestamp" 1353918836787,
  "relativeTimestamp" 137908912401916}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45342, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45342}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865231784,
     "assured" nil}}},
  "timestamp" 1353918836856,
  "relativeTimestamp" 137908980859518}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45342, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45342}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865231784,
     "assured" nil}}},
  "timestamp" 1353918836928,
  "relativeTimestamp" 137909053667550}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45342, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45342}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865231784,
     "assured" nil}}},
  "timestamp" 1353918837009,
  "relativeTimestamp" 137909134080333}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45342, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45342}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865231784,
     "assured" nil}}},
  "timestamp" 1353918837081,
  "relativeTimestamp" 137909206505893}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45343, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45343}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095541360,
     "unreplied" nil}}},
  "timestamp" 1353918837190,
  "relativeTimestamp" 137909315081923}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45343, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45343}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095541360}}},
  "timestamp" 1353918837290,
  "relativeTimestamp" 137909414724530}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45343, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45343}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095541360,
     "assured" nil}}},
  "timestamp" 1353918837369,
  "relativeTimestamp" 137909494546628}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45343, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45343}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095541360,
     "assured" nil}}},
  "timestamp" 1353918837449,
  "relativeTimestamp" 137909574580864}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45343, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45343}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095541360,
     "assured" nil}}},
  "timestamp" 1353918837577,
  "relativeTimestamp" 137909702346340}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45343, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45343}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095541360,
     "assured" nil}}},
  "timestamp" 1353918837659,
  "relativeTimestamp" 137909784605653}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45344, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45344}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095547600,
     "unreplied" nil}}},
  "timestamp" 1353918837731,
  "relativeTimestamp" 137909856601921}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45344, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45344}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095547600}}},
  "timestamp" 1353918837823,
  "relativeTimestamp" 137909948339170}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45344, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45344}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095547600,
     "assured" nil}}},
  "timestamp" 1353918837918,
  "relativeTimestamp" 137910043306897}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45344, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45344}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095547600,
     "assured" nil}}},
  "timestamp" 1353918838001,
  "relativeTimestamp" 137910126284473}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45344, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45344}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095547600,
     "assured" nil}}},
  "timestamp" 1353918838081,
  "relativeTimestamp" 137910206409032}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45344, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45344}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095547600,
     "assured" nil}}},
  "timestamp" 1353918838157,
  "relativeTimestamp" 137910282521504}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45345, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45345}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582704136,
     "unreplied" nil}}},
  "timestamp" 1353918838233,
  "relativeTimestamp" 137910357884441}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45345, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45345}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582704136}}},
  "timestamp" 1353918838338,
  "relativeTimestamp" 137910463420061}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45345, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45345}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582704136,
     "assured" nil}}},
  "timestamp" 1353918838431,
  "relativeTimestamp" 137910556663463}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45345, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45345}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582704136,
     "assured" nil}}},
  "timestamp" 1353918838506,
  "relativeTimestamp" 137910631197618}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45345, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45345}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582704136,
     "assured" nil}}},
  "timestamp" 1353918838584,
  "relativeTimestamp" 137910709315234}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45345, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45345}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582704136,
     "assured" nil}}},
  "timestamp" 1353918838659,
  "relativeTimestamp" 137910783812625}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45346, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45346}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095545416,
     "unreplied" nil}}},
  "timestamp" 1353918838738,
  "relativeTimestamp" 137910863533049}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45346, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45346}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095545416}}},
  "timestamp" 1353918838816,
  "relativeTimestamp" 137910940982612}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45346, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45346}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095545416,
     "assured" nil}}},
  "timestamp" 1353918838887,
  "relativeTimestamp" 137911012598436}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45346, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45346}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095545416,
     "assured" nil}}},
  "timestamp" 1353918838979,
  "relativeTimestamp" 137911104182990}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45346, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45346}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095545416,
     "assured" nil}}},
  "timestamp" 1353918839083,
  "relativeTimestamp" 137911207787666}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45346, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45346}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095545416,
     "assured" nil}}},
  "timestamp" 1353918839181,
  "relativeTimestamp" 137911305872932}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45347, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45347}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865231472,
     "unreplied" nil}}},
  "timestamp" 1353918839256,
  "relativeTimestamp" 137911381180150}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45347, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45347}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865231472}}},
  "timestamp" 1353918839331,
  "relativeTimestamp" 137911456247183}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45347, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45347}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865231472,
     "assured" nil}}},
  "timestamp" 1353918839403,
  "relativeTimestamp" 137911528506956}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45347, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45347}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865231472,
     "assured" nil}}},
  "timestamp" 1353918839482,
  "relativeTimestamp" 137911606853386}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45347, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45347}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865231472,
     "assured" nil}}},
  "timestamp" 1353918839571,
  "relativeTimestamp" 137911695875873}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45347, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45347}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865231472,
     "assured" nil}}},
  "timestamp" 1353918839653,
  "relativeTimestamp" 137911777782356}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45348, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45348}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095548224,
     "unreplied" nil}}},
  "timestamp" 1353918839728,
  "relativeTimestamp" 137911852806056}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45348, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45348}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095548224}}},
  "timestamp" 1353918839811,
  "relativeTimestamp" 137911935985389}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45348, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45348}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095548224,
     "assured" nil}}},
  "timestamp" 1353918839885,
  "relativeTimestamp" 137912010229696}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 56811, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.1",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 56811}},
    "independent" {"timeout" 30, "id" 6516072, "unreplied" nil}}},
  "timestamp" 1353918839968,
  "relativeTimestamp" 137912093601927}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 56811, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.1",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 56811}},
    "independent" {"timeout" 29, "id" 6516072}}},
  "timestamp" 1353918840072,
  "relativeTimestamp" 137912196854946}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 56811, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.1",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 56811}},
    "independent" {"timeout" 180, "id" 6516072, "assured" nil}}},
  "timestamp" 1353918840165,
  "relativeTimestamp" 137912290311804}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "95.128.201.66"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 48195, "dport" 110}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "95.128.201.66",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 110, "dport" 48195}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 6515760,
     "unreplied" nil}}},
  "timestamp" 1353918840237,
  "relativeTimestamp" 137912362204411}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "95.128.201.66"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 48195, "dport" 110}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "95.128.201.66",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 110, "dport" 48195}},
    "independent" {"id" 6515760, "unreplied" nil}}},
  "timestamp" 1353918840311,
  "relativeTimestamp" 137912436133384}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45348, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45348}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095548224,
     "assured" nil}}},
  "timestamp" 1353918840388,
  "relativeTimestamp" 137912513515147}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45348, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45348}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095548224,
     "assured" nil}}},
  "timestamp" 1353918840462,
  "relativeTimestamp" 137912587511663}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45348, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45348}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095548224,
     "assured" nil}}},
  "timestamp" 1353918840539,
  "relativeTimestamp" 137912664276919}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45350, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45350}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 6515448,
     "unreplied" nil}}},
  "timestamp" 1353918840626,
  "relativeTimestamp" 137912751400862}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45350, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45350}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 6515448}}},
  "timestamp" 1353918840706,
  "relativeTimestamp" 137912830964806}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45350, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45350}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 6515448,
     "assured" nil}}},
  "timestamp" 1353918840787,
  "relativeTimestamp" 137912912169565}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45350, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45350}},
    "independent"
    {"state" "FIN_WAIT", "timeout" 119, "id" 6515448, "assured" nil}}},
  "timestamp" 1353918840871,
  "relativeTimestamp" 137912995894600}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45350, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45350}},
    "independent"
    {"state" "LAST_ACK", "timeout" 30, "id" 6515448, "assured" nil}}},
  "timestamp" 1353918840947,
  "relativeTimestamp" 137913072569100}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45350, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45350}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 6515448,
     "assured" nil}}},
  "timestamp" 1353918841057,
  "relativeTimestamp" 137913182662313}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45351, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45351}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095545104,
     "unreplied" nil}}},
  "timestamp" 1353918841167,
  "relativeTimestamp" 137913292372042}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45351, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45351}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095545104}}},
  "timestamp" 1353918841243,
  "relativeTimestamp" 137913368089623}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45351, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45351}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095545104,
     "assured" nil}}},
  "timestamp" 1353918841319,
  "relativeTimestamp" 137913444247994}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45351, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45351}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095545104,
     "assured" nil}}},
  "timestamp" 1353918841404,
  "relativeTimestamp" 137913529215686}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45351, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45351}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095545104,
     "assured" nil}}},
  "timestamp" 1353918841476,
  "relativeTimestamp" 137913601703702}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45351, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45351}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095545104,
     "assured" nil}}},
  "timestamp" 1353918841548,
  "relativeTimestamp" 137913673344359}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45352, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45352}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865231160,
     "unreplied" nil}}},
  "timestamp" 1353918841639,
  "relativeTimestamp" 137913763914628}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45352, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45352}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865231160}}},
  "timestamp" 1353918841742,
  "relativeTimestamp" 137913866940037}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45352, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45352}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865231160,
     "assured" nil}}},
  "timestamp" 1353918841835,
  "relativeTimestamp" 137913960449222}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45352, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45352}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865231160,
     "assured" nil}}},
  "timestamp" 1353918841908,
  "relativeTimestamp" 137914033519675}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45352, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45352}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865231160,
     "assured" nil}}},
  "timestamp" 1353918841985,
  "relativeTimestamp" 137914110195403}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45352, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45352}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865231160,
     "assured" nil}}},
  "timestamp" 1353918842059,
  "relativeTimestamp" 137914184080442}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45353, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45353}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865230848,
     "unreplied" nil}}},
  "timestamp" 1353918842142,
  "relativeTimestamp" 137914267545096}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45353, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45353}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865230848}}},
  "timestamp" 1353918842246,
  "relativeTimestamp" 137914371700711}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45353, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45353}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865230848,
     "assured" nil}}},
  "timestamp" 1353918842349,
  "relativeTimestamp" 137914474328830}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45353, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45353}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865230848,
     "assured" nil}}},
  "timestamp" 1353918842423,
  "relativeTimestamp" 137914548078853}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45353, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45353}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865230848,
     "assured" nil}}},
  "timestamp" 1353918842503,
  "relativeTimestamp" 137914627795833}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45353, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45353}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865230848,
     "assured" nil}}},
  "timestamp" 1353918842575,
  "relativeTimestamp" 137914699847145}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45354, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45354}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095544168,
     "unreplied" nil}}},
  "timestamp" 1353918842666,
  "relativeTimestamp" 137914791454450}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45354, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45354}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095544168}}},
  "timestamp" 1353918842781,
  "relativeTimestamp" 137914906177185}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45354, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45354}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095544168,
     "assured" nil}}},
  "timestamp" 1353918842865,
  "relativeTimestamp" 137914989828689}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45354, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45354}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095544168,
     "assured" nil}}},
  "timestamp" 1353918842938,
  "relativeTimestamp" 137915062750960}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45354, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45354}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095544168,
     "assured" nil}}},
  "timestamp" 1353918843010,
  "relativeTimestamp" 137915135630735}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45354, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45354}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095544168,
     "assured" nil}}},
  "timestamp" 1353918843084,
  "relativeTimestamp" 137915209396277}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45355, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45355}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 6515136,
     "unreplied" nil}}},
  "timestamp" 1353918843202,
  "relativeTimestamp" 137915327248095}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45355, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45355}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 6515136}}},
  "timestamp" 1353918843300,
  "relativeTimestamp" 137915425105210}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45355, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45355}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 6515136,
     "assured" nil}}},
  "timestamp" 1353918843370,
  "relativeTimestamp" 137915495120779}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45355, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45355}},
    "independent"
    {"state" "FIN_WAIT", "timeout" 120, "id" 6515136, "assured" nil}}},
  "timestamp" 1353918843451,
  "relativeTimestamp" 137915576487393}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45355, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45355}},
    "independent"
    {"state" "LAST_ACK", "timeout" 30, "id" 6515136, "assured" nil}}},
  "timestamp" 1353918843526,
  "relativeTimestamp" 137915651411506}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45355, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45355}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 6515136,
     "assured" nil}}},
  "timestamp" 1353918843599,
  "relativeTimestamp" 137915723719641}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45356, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45356}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 6514824,
     "unreplied" nil}}},
  "timestamp" 1353918843680,
  "relativeTimestamp" 137915804797551}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45356, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45356}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 6514824}}},
  "timestamp" 1353918843788,
  "relativeTimestamp" 137915912764209}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45356, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45356}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 6514824,
     "assured" nil}}},
  "timestamp" 1353918843867,
  "relativeTimestamp" 137915991860107}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45356, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45356}},
    "independent"
    {"state" "FIN_WAIT", "timeout" 120, "id" 6514824, "assured" nil}}},
  "timestamp" 1353918843960,
  "relativeTimestamp" 137916085526109}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45356, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45356}},
    "independent"
    {"state" "LAST_ACK", "timeout" 30, "id" 6514824, "assured" nil}}},
  "timestamp" 1353918844037,
  "relativeTimestamp" 137916162347917}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45356, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45356}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 6514824,
     "assured" nil}}},
  "timestamp" 1353918844128,
  "relativeTimestamp" 137916253215186}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45357, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45357}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865237088,
     "unreplied" nil}}},
  "timestamp" 1353918844232,
  "relativeTimestamp" 137916356797887}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45357, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45357}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865237088}}},
  "timestamp" 1353918844344,
  "relativeTimestamp" 137916469586459}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45357, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45357}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865237088,
     "assured" nil}}},
  "timestamp" 1353918844432,
  "relativeTimestamp" 137916557562068}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45357, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45357}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865237088,
     "assured" nil}}},
  "timestamp" 1353918844505,
  "relativeTimestamp" 137916629782047}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45358, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45358}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582704448,
     "unreplied" nil}}},
  "timestamp" 1353918844577,
  "relativeTimestamp" 137916702093604}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45358, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45358}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582704448}}},
  "timestamp" 1353918844654,
  "relativeTimestamp" 137916779674710}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45358, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45358}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582704448,
     "assured" nil}}},
  "timestamp" 1353918844760,
  "relativeTimestamp" 137916884751287}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45357, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45357}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 865237088,
     "assured" nil}}},
  "timestamp" 1353918844861,
  "relativeTimestamp" 137916986661524}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45357, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45357}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865237088,
     "assured" nil}}},
  "timestamp" 1353918844939,
  "relativeTimestamp" 137917063819836}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45357, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45357}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865237088,
     "assured" nil}}},
  "timestamp" 1353918845013,
  "relativeTimestamp" 137917137935210}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45358, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45358}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582704448,
     "assured" nil}}},
  "timestamp" 1353918845102,
  "relativeTimestamp" 137917227313760}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45358, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45358}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582704448,
     "assured" nil}}},
  "timestamp" 1353918845176,
  "relativeTimestamp" 137917300808934}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45358, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45358}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582704448,
     "assured" nil}}},
  "timestamp" 1353918845281,
  "relativeTimestamp" 137917405730967}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45359, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45359}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582704760,
     "unreplied" nil}}},
  "timestamp" 1353918845376,
  "relativeTimestamp" 137917501293115}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45359, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45359}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582704760}}},
  "timestamp" 1353918845457,
  "relativeTimestamp" 137917581728965}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45359, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45359}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582704760,
     "assured" nil}}},
  "timestamp" 1353918845537,
  "relativeTimestamp" 137917661917194}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45359, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45359}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582704760,
     "assured" nil}}},
  "timestamp" 1353918845610,
  "relativeTimestamp" 137917735562590}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45359, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45359}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582704760,
     "assured" nil}}},
  "timestamp" 1353918845685,
  "relativeTimestamp" 137917810186522}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45359, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45359}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582704760,
     "assured" nil}}},
  "timestamp" 1353918845776,
  "relativeTimestamp" 137917900757188}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45360, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45360}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582697896,
     "unreplied" nil}}},
  "timestamp" 1353918845874,
  "relativeTimestamp" 137917999439082}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45360, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45360}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582697896}}},
  "timestamp" 1353918845951,
  "relativeTimestamp" 137918076273881}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45360, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45360}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582697896,
     "assured" nil}}},
  "timestamp" 1353918846022,
  "relativeTimestamp" 137918147109263}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45360, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45360}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582697896,
     "assured" nil}}},
  "timestamp" 1353918846100,
  "relativeTimestamp" 137918225182568}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45361, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45361}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 6514512,
     "unreplied" nil}}},
  "timestamp" 1353918846176,
  "relativeTimestamp" 137918300909901}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45360, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45360}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 582697896,
     "assured" nil}}},
  "timestamp" 1353918846252,
  "relativeTimestamp" 137918377679322}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45361, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45361}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 6514512}}},
  "timestamp" 1353918846350,
  "relativeTimestamp" 137918474899132}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45361, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45361}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 6514512,
     "assured" nil}}},
  "timestamp" 1353918846445,
  "relativeTimestamp" 137918569884058}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45360, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45360}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582697896,
     "assured" nil}}},
  "timestamp" 1353918846519,
  "relativeTimestamp" 137918643967556}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45360, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45360}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582697896,
     "assured" nil}}},
  "timestamp" 1353918846593,
  "relativeTimestamp" 137918718385993}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45361, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45361}},
    "independent"
    {"state" "FIN_WAIT", "timeout" 120, "id" 6514512, "assured" nil}}},
  "timestamp" 1353918846673,
  "relativeTimestamp" 137918798499839}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45361, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45361}},
    "independent"
    {"state" "LAST_ACK", "timeout" 30, "id" 6514512, "assured" nil}}},
  "timestamp" 1353918846765,
  "relativeTimestamp" 137918890135980}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45361, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45361}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 6514512,
     "assured" nil}}},
  "timestamp" 1353918846866,
  "relativeTimestamp" 137918991608177}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45362, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45362}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 6514200,
     "unreplied" nil}}},
  "timestamp" 1353918846945,
  "relativeTimestamp" 137919069893825}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45362, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45362}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 6514200}}},
  "timestamp" 1353918847025,
  "relativeTimestamp" 137919150041116}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45362, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45362}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 6514200,
     "assured" nil}}},
  "timestamp" 1353918847123,
  "relativeTimestamp" 137919247916983}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45362, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45362}},
    "independent"
    {"state" "FIN_WAIT", "timeout" 120, "id" 6514200, "assured" nil}}},
  "timestamp" 1353918847199,
  "relativeTimestamp" 137919323729235}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45362, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45362}},
    "independent"
    {"state" "LAST_ACK", "timeout" 30, "id" 6514200, "assured" nil}}},
  "timestamp" 1353918847274,
  "relativeTimestamp" 137919399633794}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45362, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45362}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 6514200,
     "assured" nil}}},
  "timestamp" 1353918847367,
  "relativeTimestamp" 137919492081820}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45363, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45363}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865237400,
     "unreplied" nil}}},
  "timestamp" 1353918847464,
  "relativeTimestamp" 137919589019627}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45363, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45363}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865237400}}},
  "timestamp" 1353918847537,
  "relativeTimestamp" 137919662369403}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45363, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45363}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865237400,
     "assured" nil}}},
  "timestamp" 1353918847607,
  "relativeTimestamp" 137919731995853}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45363, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45363}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865237400,
     "assured" nil}}},
  "timestamp" 1353918847681,
  "relativeTimestamp" 137919805864655}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45363, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45363}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865237400,
     "assured" nil}}},
  "timestamp" 1353918847772,
  "relativeTimestamp" 137919896865625}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45363, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45363}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865237400,
     "assured" nil}}},
  "timestamp" 1353918847855,
  "relativeTimestamp" 137919980405831}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45364, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45364}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582698208,
     "unreplied" nil}}},
  "timestamp" 1353918847936,
  "relativeTimestamp" 137920061249882}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45364, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45364}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582698208}}},
  "timestamp" 1353918848007,
  "relativeTimestamp" 137920132644085}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45364, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45364}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582698208,
     "assured" nil}}},
  "timestamp" 1353918848080,
  "relativeTimestamp" 137920204864395}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45364, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45364}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582698208,
     "assured" nil}}},
  "timestamp" 1353918848150,
  "relativeTimestamp" 137920275363519}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45364, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45364}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 29,
     "id" 582698208,
     "assured" nil}}},
  "timestamp" 1353918848220,
  "relativeTimestamp" 137920345697278}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45364, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45364}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582698208,
     "assured" nil}}},
  "timestamp" 1353918848311,
  "relativeTimestamp" 137920436692591}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45365, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45365}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095545728,
     "unreplied" nil}}},
  "timestamp" 1353918848404,
  "relativeTimestamp" 137920529487944}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45365, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45365}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095545728}}},
  "timestamp" 1353918848477,
  "relativeTimestamp" 137920601830803}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45365, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45365}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095545728,
     "assured" nil}}},
  "timestamp" 1353918848546,
  "relativeTimestamp" 137920671549728}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45365, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45365}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095545728,
     "assured" nil}}},
  "timestamp" 1353918848618,
  "relativeTimestamp" 137920743461774}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45366, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45366}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095546040,
     "unreplied" nil}}},
  "timestamp" 1353918848695,
  "relativeTimestamp" 137920819952172}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45366, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45366}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095546040}}},
  "timestamp" 1353918848766,
  "relativeTimestamp" 137920891668270}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45366, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45366}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095546040,
     "assured" nil}}},
  "timestamp" 1353918848836,
  "relativeTimestamp" 137920961629353}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45365, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45365}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 1095545728,
     "assured" nil}}},
  "timestamp" 1353918848913,
  "relativeTimestamp" 137921038297781}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45365, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45365}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095545728,
     "assured" nil}}},
  "timestamp" 1353918848986,
  "relativeTimestamp" 137921111365126}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45365, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45365}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095545728,
     "assured" nil}}},
  "timestamp" 1353918849058,
  "relativeTimestamp" 137921182817099}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45366, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45366}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095546040,
     "assured" nil}}},
  "timestamp" 1353918849132,
  "relativeTimestamp" 137921257476448}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45366, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45366}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095546040,
     "assured" nil}}},
  "timestamp" 1353918849210,
  "relativeTimestamp" 137921335707661}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45366, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45366}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095546040,
     "assured" nil}}},
  "timestamp" 1353918849283,
  "relativeTimestamp" 137921408093150}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45367, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45367}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095544480,
     "unreplied" nil}}},
  "timestamp" 1353918849354,
  "relativeTimestamp" 137921479102842}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45367, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45367}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095544480}}},
  "timestamp" 1353918849426,
  "relativeTimestamp" 137921551198820}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45367, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45367}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095544480,
     "assured" nil}}},
  "timestamp" 1353918849500,
  "relativeTimestamp" 137921624787141}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45367, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45367}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095544480,
     "assured" nil}}},
  "timestamp" 1353918849572,
  "relativeTimestamp" 137921696892845}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45367, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45367}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095544480,
     "assured" nil}}},
  "timestamp" 1353918849644,
  "relativeTimestamp" 137921769665624}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45367, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45367}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095544480,
     "assured" nil}}},
  "timestamp" 1353918849727,
  "relativeTimestamp" 137921851876742}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45368, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45368}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865237712,
     "unreplied" nil}}},
  "timestamp" 1353918849837,
  "relativeTimestamp" 137921961782771}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45368, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45368}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865237712}}},
  "timestamp" 1353918849955,
  "relativeTimestamp" 137922080381937}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45368, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45368}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865237712,
     "assured" nil}}},
  "timestamp" 1353918850064,
  "relativeTimestamp" 137922189580477}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45368, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45368}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865237712,
     "assured" nil}}},
  "timestamp" 1353918850168,
  "relativeTimestamp" 137922292933429}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45368, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45368}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865237712,
     "assured" nil}}},
  "timestamp" 1353918850271,
  "relativeTimestamp" 137922396259599}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45368, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45368}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865237712,
     "assured" nil}}},
  "timestamp" 1353918850341,
  "relativeTimestamp" 137922466533623}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45369, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45369}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865238024,
     "unreplied" nil}}},
  "timestamp" 1353918850411,
  "relativeTimestamp" 137922536400594}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45369, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45369}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865238024}}},
  "timestamp" 1353918850486,
  "relativeTimestamp" 137922610808302}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45369, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45369}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865238024,
     "assured" nil}}},
  "timestamp" 1353918850554,
  "relativeTimestamp" 137922678887511}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45369, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45369}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865238024,
     "assured" nil}}},
  "timestamp" 1353918850630,
  "relativeTimestamp" 137922755421463}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45369, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45369}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865238024,
     "assured" nil}}},
  "timestamp" 1353918850700,
  "relativeTimestamp" 137922825657179}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45369, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45369}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865238024,
     "assured" nil}}},
  "timestamp" 1353918850770,
  "relativeTimestamp" 137922894831974}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45370, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45370}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095547288,
     "unreplied" nil}}},
  "timestamp" 1353918850849,
  "relativeTimestamp" 137922974145529}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45370, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45370}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095547288}}},
  "timestamp" 1353918850966,
  "relativeTimestamp" 137923091144108}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45370, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45370}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095547288,
     "assured" nil}}},
  "timestamp" 1353918851044,
  "relativeTimestamp" 137923169468057}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45370, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45370}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 119,
     "id" 1095547288,
     "assured" nil}}},
  "timestamp" 1353918851120,
  "relativeTimestamp" 137923245552120}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45370, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45370}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095547288,
     "assured" nil}}},
  "timestamp" 1353918851194,
  "relativeTimestamp" 137923319647820}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45370, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45370}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095547288,
     "assured" nil}}},
  "timestamp" 1353918851265,
  "relativeTimestamp" 137923389807575}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45371, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45371}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865238336,
     "unreplied" nil}}},
  "timestamp" 1353918851339,
  "relativeTimestamp" 137923463749125}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45371, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45371}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865238336}}},
  "timestamp" 1353918851409,
  "relativeTimestamp" 137923534141253}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45371, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45371}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865238336,
     "assured" nil}}},
  "timestamp" 1353918851499,
  "relativeTimestamp" 137923624295254}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45371, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45371}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865238336,
     "assured" nil}}},
  "timestamp" 1353918851590,
  "relativeTimestamp" 137923714836287}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45371, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45371}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865238336,
     "assured" nil}}},
  "timestamp" 1353918851660,
  "relativeTimestamp" 137923785646761}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45371, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45371}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865238336,
     "assured" nil}}},
  "timestamp" 1353918851735,
  "relativeTimestamp" 137923860427049}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45372, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45372}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 582698520,
     "unreplied" nil}}},
  "timestamp" 1353918851805,
  "relativeTimestamp" 137923930529714}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45372, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45372}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 582698520}}},
  "timestamp" 1353918851876,
  "relativeTimestamp" 137924000865478}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45372, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45372}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 582698520,
     "assured" nil}}},
  "timestamp" 1353918851946,
  "relativeTimestamp" 137924070797021}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45372, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45372}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 582698520,
     "assured" nil}}},
  "timestamp" 1353918852017,
  "relativeTimestamp" 137924142524193}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45372, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45372}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 582698520,
     "assured" nil}}},
  "timestamp" 1353918852091,
  "relativeTimestamp" 137924215751716}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45372, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45372}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 582698520,
     "assured" nil}}},
  "timestamp" 1353918852161,
  "relativeTimestamp" 137924286435690}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45373, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45373}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095541984,
     "unreplied" nil}}},
  "timestamp" 1353918852232,
  "relativeTimestamp" 137924357381836}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45373, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45373}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095541984}}},
  "timestamp" 1353918852302,
  "relativeTimestamp" 137924427467814}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45373, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45373}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095541984,
     "assured" nil}}},
  "timestamp" 1353918852370,
  "relativeTimestamp" 137924494917095}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45373, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45373}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095541984,
     "assured" nil}}},
  "timestamp" 1353918852444,
  "relativeTimestamp" 137924568922136}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45373, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45373}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 29,
     "id" 1095541984,
     "assured" nil}}},
  "timestamp" 1353918852515,
  "relativeTimestamp" 137924639898752}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45373, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45373}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095541984,
     "assured" nil}}},
  "timestamp" 1353918852587,
  "relativeTimestamp" 137924712696155}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45374, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45374}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095541672,
     "unreplied" nil}}},
  "timestamp" 1353918852659,
  "relativeTimestamp" 137924783967183}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45374, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45374}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095541672}}},
  "timestamp" 1353918852734,
  "relativeTimestamp" 137924859326584}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45374, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45374}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095541672,
     "assured" nil}}},
  "timestamp" 1353918852802,
  "relativeTimestamp" 137924927287525}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45374, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45374}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095541672,
     "assured" nil}}},
  "timestamp" 1353918852872,
  "relativeTimestamp" 137924997662562}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45374, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45374}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095541672,
     "assured" nil}}},
  "timestamp" 1353918852945,
  "relativeTimestamp" 137925070038706}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45374, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45374}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095541672,
     "assured" nil}}},
  "timestamp" 1353918853015,
  "relativeTimestamp" 137925140492182}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45375, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45375}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 27311736,
     "unreplied" nil}}},
  "timestamp" 1353918853093,
  "relativeTimestamp" 137925218255439}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45375, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45375}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 27311736}}},
  "timestamp" 1353918853163,
  "relativeTimestamp" 137925288510556}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45375, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45375}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 27311736,
     "assured" nil}}},
  "timestamp" 1353918853232,
  "relativeTimestamp" 137925357305467}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45375, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45375}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 27311736,
     "assured" nil}}},
  "timestamp" 1353918853302,
  "relativeTimestamp" 137925427392417}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45375, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45375}},
    "independent"
    {"state" "LAST_ACK", "timeout" 30, "id" 27311736, "assured" nil}}},
  "timestamp" 1353918853376,
  "relativeTimestamp" 137925500874116}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45375, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45375}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 27311736,
     "assured" nil}}},
  "timestamp" 1353918853446,
  "relativeTimestamp" 137925570988688}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45376, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45376}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 27311424,
     "unreplied" nil}}},
  "timestamp" 1353918853516,
  "relativeTimestamp" 137925641398851}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45376, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45376}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 27311424}}},
  "timestamp" 1353918853586,
  "relativeTimestamp" 137925711328248}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45376, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45376}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 27311424,
     "assured" nil}}},
  "timestamp" 1353918853675,
  "relativeTimestamp" 137925800691884}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45376, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45376}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 27311424,
     "assured" nil}}},
  "timestamp" 1353918853785,
  "relativeTimestamp" 137925910653519}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45376, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45376}},
    "independent"
    {"state" "LAST_ACK", "timeout" 30, "id" 27311424, "assured" nil}}},
  "timestamp" 1353918853868,
  "relativeTimestamp" 137925993573038}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45376, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45376}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 27311424,
     "assured" nil}}},
  "timestamp" 1353918853939,
  "relativeTimestamp" 137926063796061}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45377, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45377}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 27311112,
     "unreplied" nil}}},
  "timestamp" 1353918854008,
  "relativeTimestamp" 137926133201346}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45377, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45377}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 27311112}}},
  "timestamp" 1353918854082,
  "relativeTimestamp" 137926207122280}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45377, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45377}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 27311112,
     "assured" nil}}},
  "timestamp" 1353918854148,
  "relativeTimestamp" 137926273619905}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45377, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45377}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 27311112,
     "assured" nil}}},
  "timestamp" 1353918854225,
  "relativeTimestamp" 137926350345477}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45377, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45377}},
    "independent"
    {"state" "LAST_ACK", "timeout" 30, "id" 27311112, "assured" nil}}},
  "timestamp" 1353918854293,
  "relativeTimestamp" 137926418294090}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45377, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45377}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 27311112,
     "assured" nil}}},
  "timestamp" 1353918854364,
  "relativeTimestamp" 137926489157149}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45378, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45378}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 6513888,
     "unreplied" nil}}},
  "timestamp" 1353918854433,
  "relativeTimestamp" 137926558654011}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45378, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45378}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 6513888}}},
  "timestamp" 1353918854503,
  "relativeTimestamp" 137926627953802}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45378, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45378}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 6513888,
     "assured" nil}}},
  "timestamp" 1353918854576,
  "relativeTimestamp" 137926701212977}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45378, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45378}},
    "independent"
    {"state" "FIN_WAIT", "timeout" 120, "id" 6513888, "assured" nil}}},
  "timestamp" 1353918854647,
  "relativeTimestamp" 137926772602404}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45378, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45378}},
    "independent"
    {"state" "LAST_ACK", "timeout" 30, "id" 6513888, "assured" nil}}},
  "timestamp" 1353918854724,
  "relativeTimestamp" 137926848902740}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45378, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45378}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 6513888,
     "assured" nil}}},
  "timestamp" 1353918854814,
  "relativeTimestamp" 137926939538453}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45379, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45379}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095546976,
     "unreplied" nil}}},
  "timestamp" 1353918854884,
  "relativeTimestamp" 137927009379817}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45379, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45379}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095546976}}},
  "timestamp" 1353918854960,
  "relativeTimestamp" 137927084887448}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45379, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45379}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095546976,
     "assured" nil}}},
  "timestamp" 1353918855028,
  "relativeTimestamp" 137927152862792}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45379, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45379}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095546976,
     "assured" nil}}},
  "timestamp" 1353918855097,
  "relativeTimestamp" 137927222353947}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45379, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45379}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095546976,
     "assured" nil}}},
  "timestamp" 1353918855167,
  "relativeTimestamp" 137927291794697}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45379, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45379}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095546976,
     "assured" nil}}},
  "timestamp" 1353918855237,
  "relativeTimestamp" 137927361732353}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45380, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45380}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865238648,
     "unreplied" nil}}},
  "timestamp" 1353918855311,
  "relativeTimestamp" 137927435922318}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45380, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45380}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865238648}}},
  "timestamp" 1353918855380,
  "relativeTimestamp" 137927504966007}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45380, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45380}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865238648,
     "assured" nil}}},
  "timestamp" 1353918855448,
  "relativeTimestamp" 137927573585687}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45380, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45380}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865238648,
     "assured" nil}}},
  "timestamp" 1353918855520,
  "relativeTimestamp" 137927644787934}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45380, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45380}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865238648,
     "assured" nil}}},
  "timestamp" 1353918855590,
  "relativeTimestamp" 137927715376201}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45380, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45380}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865238648,
     "assured" nil}}},
  "timestamp" 1353918855688,
  "relativeTimestamp" 137927813107912}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45381, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45381}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 27310800,
     "unreplied" nil}}},
  "timestamp" 1353918855764,
  "relativeTimestamp" 137927888961993}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45381, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45381}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 27310800}}},
  "timestamp" 1353918855832,
  "relativeTimestamp" 137927957259256}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45381, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45381}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 27310800,
     "assured" nil}}},
  "timestamp" 1353918855918,
  "relativeTimestamp" 137928043047689}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45381, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45381}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 27310800,
     "assured" nil}}},
  "timestamp" 1353918856010,
  "relativeTimestamp" 137928134791383}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45381, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45381}},
    "independent"
    {"state" "LAST_ACK", "timeout" 30, "id" 27310800, "assured" nil}}},
  "timestamp" 1353918856077,
  "relativeTimestamp" 137928202216068}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45381, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45381}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 27310800,
     "assured" nil}}},
  "timestamp" 1353918856144,
  "relativeTimestamp" 137928268842847}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45382, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45382}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865255032,
     "unreplied" nil}}},
  "timestamp" 1353918856216,
  "relativeTimestamp" 137928341338420}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45382, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45382}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865255032}}},
  "timestamp" 1353918856319,
  "relativeTimestamp" 137928444543080}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45382, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45382}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865255032,
     "assured" nil}}},
  "timestamp" 1353918856385,
  "relativeTimestamp" 137928510286135}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45382, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45382}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865255032,
     "assured" nil}}},
  "timestamp" 1353918856452,
  "relativeTimestamp" 137928577500423}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45382, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45382}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865255032,
     "assured" nil}}},
  "timestamp" 1353918856520,
  "relativeTimestamp" 137928644854189}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45382, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45382}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865255032,
     "assured" nil}}},
  "timestamp" 1353918856591,
  "relativeTimestamp" 137928716145639}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45383, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45383}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 6513576,
     "unreplied" nil}}},
  "timestamp" 1353918856658,
  "relativeTimestamp" 137928783244150}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45383, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45383}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 6513576}}},
  "timestamp" 1353918856726,
  "relativeTimestamp" 137928851648050}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45383, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45383}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 6513576,
     "assured" nil}}},
  "timestamp" 1353918856791,
  "relativeTimestamp" 137928916594560}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45383, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45383}},
    "independent"
    {"state" "FIN_WAIT", "timeout" 120, "id" 6513576, "assured" nil}}},
  "timestamp" 1353918856861,
  "relativeTimestamp" 137928986288270}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45383, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45383}},
    "independent"
    {"state" "LAST_ACK", "timeout" 30, "id" 6513576, "assured" nil}}},
  "timestamp" 1353918856937,
  "relativeTimestamp" 137929062474548}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45383, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45383}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 6513576,
     "assured" nil}}},
  "timestamp" 1353918857005,
  "relativeTimestamp" 137929129847325}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45384, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45384}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865254720,
     "unreplied" nil}}},
  "timestamp" 1353918857073,
  "relativeTimestamp" 137929197760674}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45384, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45384}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865254720}}},
  "timestamp" 1353918857141,
  "relativeTimestamp" 137929266686432}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45384, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45384}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865254720,
     "assured" nil}}},
  "timestamp" 1353918857208,
  "relativeTimestamp" 137929333372529}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45384, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45384}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865254720,
     "assured" nil}}},
  "timestamp" 1353918857280,
  "relativeTimestamp" 137929405057390}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45384, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45384}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 29,
     "id" 865254720,
     "assured" nil}}},
  "timestamp" 1353918857348,
  "relativeTimestamp" 137929473239378}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45384, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45384}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865254720,
     "assured" nil}}},
  "timestamp" 1353918857416,
  "relativeTimestamp" 137929541480605}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45385, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45385}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1095542920,
     "unreplied" nil}}},
  "timestamp" 1353918857485,
  "relativeTimestamp" 137929610162786}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45385, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45385}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1095542920}}},
  "timestamp" 1353918857553,
  "relativeTimestamp" 137929678531937}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45385, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45385}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1095542920,
     "assured" nil}}},
  "timestamp" 1353918857622,
  "relativeTimestamp" 137929747493190}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45385, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45385}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1095542920,
     "assured" nil}}},
  "timestamp" 1353918857691,
  "relativeTimestamp" 137929815918740}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45385, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45385}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1095542920,
     "assured" nil}}},
  "timestamp" 1353918857759,
  "relativeTimestamp" 137929883843449}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45385, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45385}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1095542920,
     "assured" nil}}},
  "timestamp" 1353918857827,
  "relativeTimestamp" 137929951959924}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45386, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45386}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1164661632,
     "unreplied" nil}}},
  "timestamp" 1353918857895,
  "relativeTimestamp" 137930020550862}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45386, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45386}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1164661632}}},
  "timestamp" 1353918857967,
  "relativeTimestamp" 137930092299769}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45386, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45386}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1164661632,
     "assured" nil}}},
  "timestamp" 1353918858033,
  "relativeTimestamp" 137930157899098}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45386, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45386}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1164661632,
     "assured" nil}}},
  "timestamp" 1353918858101,
  "relativeTimestamp" 137930226017842}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45386, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45386}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1164661632,
     "assured" nil}}},
  "timestamp" 1353918858170,
  "relativeTimestamp" 137930295073244}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45386, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45386}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1164661632,
     "assured" nil}}},
  "timestamp" 1353918858242,
  "relativeTimestamp" 137930367456108}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45387, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45387}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865254408,
     "unreplied" nil}}},
  "timestamp" 1353918858311,
  "relativeTimestamp" 137930435845986}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45387, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45387}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865254408}}},
  "timestamp" 1353918858379,
  "relativeTimestamp" 137930503868828}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45387, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45387}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865254408,
     "assured" nil}}},
  "timestamp" 1353918858445,
  "relativeTimestamp" 137930570497179}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45387, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45387}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 865254408,
     "assured" nil}}},
  "timestamp" 1353918858518,
  "relativeTimestamp" 137930643249886}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45387, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45387}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 865254408,
     "assured" nil}}},
  "timestamp" 1353918858587,
  "relativeTimestamp" 137930711844478}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45387, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45387}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 865254408,
     "assured" nil}}},
  "timestamp" 1353918858655,
  "relativeTimestamp" 137930780060748}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45388, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45388}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 6513264,
     "unreplied" nil}}},
  "timestamp" 1353918858724,
  "relativeTimestamp" 137930849139784}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45388, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45388}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 6513264}}},
  "timestamp" 1353918858793,
  "relativeTimestamp" 137930918038891}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45388, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45388}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 6513264,
     "assured" nil}}},
  "timestamp" 1353918858861,
  "relativeTimestamp" 137930986439825}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45388, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45388}},
    "independent"
    {"state" "FIN_WAIT", "timeout" 120, "id" 6513264, "assured" nil}}},
  "timestamp" 1353918858930,
  "relativeTimestamp" 137931055045703}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45388, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45388}},
    "independent"
    {"state" "LAST_ACK", "timeout" 30, "id" 6513264, "assured" nil}}},
  "timestamp" 1353918859007,
  "relativeTimestamp" 137931132266497}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45388, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45388}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 6513264,
     "assured" nil}}},
  "timestamp" 1353918859113,
  "relativeTimestamp" 137931237803803}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45389, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45389}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 6512952,
     "unreplied" nil}}},
  "timestamp" 1353918859188,
  "relativeTimestamp" 137931312810859}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45389, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45389}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 6512952}}},
  "timestamp" 1353918859256,
  "relativeTimestamp" 137931381062530}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45389, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45389}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 6512952,
     "assured" nil}}},
  "timestamp" 1353918859322,
  "relativeTimestamp" 137931446983523}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45389, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45389}},
    "independent"
    {"state" "FIN_WAIT", "timeout" 120, "id" 6512952, "assured" nil}}},
  "timestamp" 1353918859394,
  "relativeTimestamp" 137931518944896}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45389, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45389}},
    "independent"
    {"state" "LAST_ACK", "timeout" 30, "id" 6512952, "assured" nil}}},
  "timestamp" 1353918859462,
  "relativeTimestamp" 137931587279624}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45389, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45389}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 6512952,
     "assured" nil}}},
  "timestamp" 1353918859530,
  "relativeTimestamp" 137931654816925}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45390, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45390}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1164659760,
     "unreplied" nil}}},
  "timestamp" 1353918859599,
  "relativeTimestamp" 137931724424178}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45390, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45390}},
    "independent"
    {"state" "SYN_RECV", "timeout" 60, "id" 1164659760}}},
  "timestamp" 1353918859673,
  "relativeTimestamp" 137931798112516}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45390, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45390}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 1164659760,
     "assured" nil}}},
  "timestamp" 1353918859747,
  "relativeTimestamp" 137931871749526}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45390, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45390}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1164659760,
     "assured" nil}}},
  "timestamp" 1353918859815,
  "relativeTimestamp" 137931939908561}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45390, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45390}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1164659760,
     "assured" nil}}},
  "timestamp" 1353918859883,
  "relativeTimestamp" 137932008040917}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45390, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45390}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 1164659760,
     "assured" nil}}},
  "timestamp" 1353918859955,
  "relativeTimestamp" 137932080637936}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45391, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45391}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 27310488,
     "unreplied" nil}}},
  "timestamp" 1353918860024,
  "relativeTimestamp" 137932149052385}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45391, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45391}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 27310488}}},
  "timestamp" 1353918860092,
  "relativeTimestamp" 137932217676434}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45391, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45391}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 27310488,
     "assured" nil}}},
  "timestamp" 1353918860168,
  "relativeTimestamp" 137932292980944}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45391, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45391}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 27310488,
     "assured" nil}}},
  "timestamp" 1353918860237,
  "relativeTimestamp" 137932361966052}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45391, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45391}},
    "independent"
    {"state" "LAST_ACK", "timeout" 30, "id" 27310488, "assured" nil}}},
  "timestamp" 1353918860305,
  "relativeTimestamp" 137932429954125}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45391, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45391}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 27310488,
     "assured" nil}}},
  "timestamp" 1353918860373,
  "relativeTimestamp" 137932497947289}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "194.95.81.200"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 58158, "dport" 143}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "194.95.81.200",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 143, "dport" 58158}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432803,
     "id" 1164664440,
     "unreplied" nil}}},
  "timestamp" 1353918860450,
  "relativeTimestamp" 137932575227778}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "194.95.81.200"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 58158, "dport" 143}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "194.95.81.200",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 143, "dport" 58158}},
    "independent" {"timeout" 432000, "id" 1164664440}}},
  "timestamp" 1353918860518,
  "relativeTimestamp" 137932643300297}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45290, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45290}},
    "independent" {"id" 865236152, "assured" nil}}},
  "timestamp" 1353918901057,
  "relativeTimestamp" 137973181929366}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45291, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45291}},
    "independent" {"id" 1095542608, "assured" nil}}},
  "timestamp" 1353918926944,
  "relativeTimestamp" 137999069399606}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45292, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45292}},
    "independent" {"id" 1095544792, "assured" nil}}},
  "timestamp" 1353918927354,
  "relativeTimestamp" 137999479451060}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45293, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45293}},
    "independent" {"id" 582697584, "assured" nil}}},
  "timestamp" 1353918927663,
  "relativeTimestamp" 137999788603509}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45294, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45294}},
    "independent" {"id" 582697272, "assured" nil}}},
  "timestamp" 1353918928090,
  "relativeTimestamp" 138000215355991}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45295, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45295}},
    "independent" {"id" 865235840, "assured" nil}}},
  "timestamp" 1353918928405,
  "relativeTimestamp" 138000530514682}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45296, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45296}},
    "independent" {"id" 865235528, "assured" nil}}},
  "timestamp" 1353918928690,
  "relativeTimestamp" 138000815339634}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45297, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45297}},
    "independent" {"id" 865235216, "assured" nil}}},
  "timestamp" 1353918929028,
  "relativeTimestamp" 138001153422779}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45298, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45298}},
    "independent" {"id" 582696960, "assured" nil}}},
  "timestamp" 1353918929537,
  "relativeTimestamp" 138001662418893}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45299, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45299}},
    "independent" {"id" 582698832, "assured" nil}}},
  "timestamp" 1353918929708,
  "relativeTimestamp" 138001833244074}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45300, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45300}},
    "independent" {"id" 865234904, "assured" nil}}},
  "timestamp" 1353918930310,
  "relativeTimestamp" 138002435422843}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45301, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45301}},
    "independent" {"id" 582699144, "assured" nil}}},
  "timestamp" 1353918930487,
  "relativeTimestamp" 138002612500628}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45302, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45302}},
    "independent" {"id" 865234592, "assured" nil}}},
  "timestamp" 1353918931146,
  "relativeTimestamp" 138003271594348}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45303, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45303}},
    "independent" {"id" 6517944, "assured" nil}}},
  "timestamp" 1353918931987,
  "relativeTimestamp" 138004112150929}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45304, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45304}},
    "independent" {"id" 1095546352, "assured" nil}}},
  "timestamp" 1353918932749,
  "relativeTimestamp" 138004873759907}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45305, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45305}},
    "independent" {"id" 582699456, "assured" nil}}},
  "timestamp" 1353918932928,
  "relativeTimestamp" 138005053454359}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45306, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45306}},
    "independent" {"id" 582699768, "assured" nil}}},
  "timestamp" 1353918933110,
  "relativeTimestamp" 138005235347424}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45307, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45307}},
    "independent" {"id" 582700080, "assured" nil}}},
  "timestamp" 1353918933560,
  "relativeTimestamp" 138005685478877}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45308, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45308}},
    "independent" {"id" 582700392, "assured" nil}}},
  "timestamp" 1353918934078,
  "relativeTimestamp" 138006203118802}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45309, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45309}},
    "independent" {"id" 1095543232, "assured" nil}}},
  "timestamp" 1353918934784,
  "relativeTimestamp" 138006909061009}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45310, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45310}},
    "independent" {"id" 865234280, "assured" nil}}},
  "timestamp" 1353918935155,
  "relativeTimestamp" 138007280384972}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45311, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45311}},
    "independent" {"id" 865233968, "assured" nil}}},
  "timestamp" 1353918935493,
  "relativeTimestamp" 138007618351107}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45312, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45312}},
    "independent" {"id" 1095548536, "assured" nil}}},
  "timestamp" 1353918935855,
  "relativeTimestamp" 138007980415179}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45313, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45313}},
    "independent" {"id" 6517632, "assured" nil}}},
  "timestamp" 1353918936288,
  "relativeTimestamp" 138008413423069}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45314, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45314}},
    "independent" {"id" 6517320, "assured" nil}}},
  "timestamp" 1353918936683,
  "relativeTimestamp" 138008808395180}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45315, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45315}},
    "independent" {"id" 582700704, "assured" nil}}},
  "timestamp" 1353918936988,
  "relativeTimestamp" 138009113398916}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45316, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45316}},
    "independent" {"id" 582701016, "assured" nil}}},
  "timestamp" 1353918937317,
  "relativeTimestamp" 138009442500766}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45317, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45317}},
    "independent" {"id" 582701328, "assured" nil}}},
  "timestamp" 1353918937634,
  "relativeTimestamp" 138009759249502}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45318, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45318}},
    "independent" {"id" 582701640, "assured" nil}}},
  "timestamp" 1353918938224,
  "relativeTimestamp" 138010349315398}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45319, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45319}},
    "independent" {"id" 582701952, "assured" nil}}},
  "timestamp" 1353918938295,
  "relativeTimestamp" 138010420176272}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45320, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45320}},
    "independent" {"id" 6517008, "assured" nil}}},
  "timestamp" 1353918938932,
  "relativeTimestamp" 138011057343912}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45321, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45321}},
    "independent" {"id" 1095541048, "assured" nil}}},
  "timestamp" 1353918939053,
  "relativeTimestamp" 138011178299299}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45322, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45322}},
    "independent" {"id" 582702264, "assured" nil}}},
  "timestamp" 1353918939597,
  "relativeTimestamp" 138011722406231}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45323, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45323}},
    "independent" {"id" 865233656, "assured" nil}}},
  "timestamp" 1353918939729,
  "relativeTimestamp" 138011854497811}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45324, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45324}},
    "independent" {"id" 582702576, "assured" nil}}},
  "timestamp" 1353918940209,
  "relativeTimestamp" 138012334372528}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45325, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45325}},
    "independent" {"id" 582702888, "assured" nil}}},
  "timestamp" 1353918940394,
  "relativeTimestamp" 138012519405991}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45326, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45326}},
    "independent" {"id" 865233344, "assured" nil}}},
  "timestamp" 1353918940780,
  "relativeTimestamp" 138012904803221}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45327, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45327}},
    "independent" {"id" 582703200, "assured" nil}}},
  "timestamp" 1353918941201,
  "relativeTimestamp" 138013326357471}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45328, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45328}},
    "independent" {"id" 582703512, "assured" nil}}},
  "timestamp" 1353918941631,
  "relativeTimestamp" 138013756423722}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45329, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45329}},
    "independent" {"id" 865233032, "assured" nil}}},
  "timestamp" 1353918942365,
  "relativeTimestamp" 138014490292533}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45330, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45330}},
    "independent" {"id" 1095542296, "assured" nil}}},
  "timestamp" 1353918943084,
  "relativeTimestamp" 138015208913325}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45331, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45331}},
    "independent" {"id" 1095543544, "assured" nil}}},
  "timestamp" 1353918943794,
  "relativeTimestamp" 138015919555443}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45332, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45332}},
    "independent" {"id" 6516696, "assured" nil}}},
  "timestamp" 1353918944511,
  "relativeTimestamp" 138016636161473}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45333, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45333}},
    "independent" {"id" 6516384, "assured" nil}}},
  "timestamp" 1353918944971,
  "relativeTimestamp" 138017096556384}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45334, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45334}},
    "independent" {"id" 1095540736, "assured" nil}}},
  "timestamp" 1353918945685,
  "relativeTimestamp" 138017810647729}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45335, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45335}},
    "independent" {"id" 1095547912, "assured" nil}}},
  "timestamp" 1353918946115,
  "relativeTimestamp" 138018240281441}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45336, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45336}},
    "independent" {"id" 865232720, "assured" nil}}},
  "timestamp" 1353918946522,
  "relativeTimestamp" 138018647286766}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45337, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45337}},
    "independent" {"id" 1095546664, "assured" nil}}},
  "timestamp" 1353918947106,
  "relativeTimestamp" 138019231420126}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45338, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45338}},
    "independent" {"id" 865232408, "assured" nil}}},
  "timestamp" 1353918947414,
  "relativeTimestamp" 138019539416220}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45339, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45339}},
    "independent" {"id" 865232096, "assured" nil}}},
  "timestamp" 1353918947772,
  "relativeTimestamp" 138019897071980}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45340, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45340}},
    "independent" {"id" 582703824, "assured" nil}}},
  "timestamp" 1353918948090,
  "relativeTimestamp" 138020215288117}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45341, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45341}},
    "independent" {"id" 1095543856, "assured" nil}}},
  "timestamp" 1353918948461,
  "relativeTimestamp" 138020586312292}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45342, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45342}},
    "independent" {"id" 865231784, "assured" nil}}},
  "timestamp" 1353918948932,
  "relativeTimestamp" 138021057443130}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45343, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45343}},
    "independent" {"id" 1095541360, "assured" nil}}},
  "timestamp" 1353918949243,
  "relativeTimestamp" 138021368519660}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45344, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45344}},
    "independent" {"id" 1095547600, "assured" nil}}},
  "timestamp" 1353918949581,
  "relativeTimestamp" 138021706279252}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "194.95.81.200"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 58158, "dport" 143}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "194.95.81.200",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 143, "dport" 58158}},
    "independent" {"timeout" 300, "id" 1164664440, "assured" nil}}},
  "timestamp" 1353918949840,
  "relativeTimestamp" 138021965347472}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "194.95.81.200"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 58158, "dport" 143}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "194.95.81.200",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 143, "dport" 58158}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 1164664440,
     "assured" nil}}},
  "timestamp" 1353918949946,
  "relativeTimestamp" 138022070967121}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 45522, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.1",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 45522}},
    "independent" {"timeout" 30, "id" 865254096, "unreplied" nil}}},
  "timestamp" 1353918950040,
  "relativeTimestamp" 138022165161264}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 45522, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.1",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 45522}},
    "independent" {"timeout" 30, "id" 865254096}}},
  "timestamp" 1353918950112,
  "relativeTimestamp" 138022236811367}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 45522, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.1",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 45522}},
    "independent" {"timeout" 180, "id" 865254096, "assured" nil}}},
  "timestamp" 1353918950186,
  "relativeTimestamp" 138022310887062}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "194.95.81.200"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 58262, "dport" 143}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "194.95.81.200",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 143, "dport" 58262}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 27310176,
     "unreplied" nil}}},
  "timestamp" 1353918950253,
  "relativeTimestamp" 138022378429550}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "194.95.81.200"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 58158, "dport" 143}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "194.95.81.200",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 143, "dport" 58158}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 1164664440,
     "assured" nil}}},
  "timestamp" 1353918950325,
  "relativeTimestamp" 138022449741581}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "194.95.81.200"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 58158, "dport" 143}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "194.95.81.200",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 143, "dport" 58158}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 1164664440,
     "assured" nil}}},
  "timestamp" 1353918950417,
  "relativeTimestamp" 138022541768707}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "194.95.81.200"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 58158, "dport" 143}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "194.95.81.200",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 143, "dport" 58158}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 1164664440, "assured" nil}}},
  "timestamp" 1353918950518,
  "relativeTimestamp" 138022643037756}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "194.95.81.200"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 58262, "dport" 143}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "194.95.81.200",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 143, "dport" 58262}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 27310176}}},
  "timestamp" 1353918950617,
  "relativeTimestamp" 138022742144022}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "194.95.81.200"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 58262, "dport" 143}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "194.95.81.200",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 143, "dport" 58262}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 27310176,
     "assured" nil}}},
  "timestamp" 1353918950705,
  "relativeTimestamp" 138022830407548}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45345, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45345}},
    "independent" {"id" 582704136, "assured" nil}}},
  "timestamp" 1353918950787,
  "relativeTimestamp" 138022912492206}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45346, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45346}},
    "independent" {"id" 1095545416, "assured" nil}}},
  "timestamp" 1353918950865,
  "relativeTimestamp" 138022990361549}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45347, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45347}},
    "independent" {"id" 865231472, "assured" nil}}},
  "timestamp" 1353918950961,
  "relativeTimestamp" 138023086532814}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45348, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45348}},
    "independent" {"id" 1095548224, "assured" nil}}},
  "timestamp" 1353918951177,
  "relativeTimestamp" 138023302098081}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45350, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45350}},
    "independent" {"id" 6515448, "assured" nil}}},
  "timestamp" 1353918951907,
  "relativeTimestamp" 138024032275826}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45351, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45351}},
    "independent" {"id" 1095545104, "assured" nil}}},
  "timestamp" 1353918952389,
  "relativeTimestamp" 138024514360540}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45352, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45352}},
    "independent" {"id" 865231160, "assured" nil}}},
  "timestamp" 1353918953121,
  "relativeTimestamp" 138025246375060}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45353, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45353}},
    "independent" {"id" 865230848, "assured" nil}}},
  "timestamp" 1353918953646,
  "relativeTimestamp" 138025771377921}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45354, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45354}},
    "independent" {"id" 1095544168, "assured" nil}}},
  "timestamp" 1353918954103,
  "relativeTimestamp" 138026228404949}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45355, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45355}},
    "independent" {"id" 6515136, "assured" nil}}},
  "timestamp" 1353918954787,
  "relativeTimestamp" 138026912264580}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45356, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45356}},
    "independent" {"id" 6514824, "assured" nil}}},
  "timestamp" 1353918955252,
  "relativeTimestamp" 138027376882046}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45357, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45357}},
    "independent" {"id" 865237088, "assured" nil}}},
  "timestamp" 1353918956098,
  "relativeTimestamp" 138028223274479}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45358, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45358}},
    "independent" {"id" 582704448, "assured" nil}}},
  "timestamp" 1353918956263,
  "relativeTimestamp" 138028388486182}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45359, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45359}},
    "independent" {"id" 582704760, "assured" nil}}},
  "timestamp" 1353918956648,
  "relativeTimestamp" 138028773532641}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45360, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45360}},
    "independent" {"id" 582697896, "assured" nil}}},
  "timestamp" 1353918957322,
  "relativeTimestamp" 138029447472690}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45361, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45361}},
    "independent" {"id" 6514512, "assured" nil}}},
  "timestamp" 1353918957463,
  "relativeTimestamp" 138029588160281}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45362, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45362}},
    "independent" {"id" 6514200, "assured" nil}}},
  "timestamp" 1353918958020,
  "relativeTimestamp" 138030145202955}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45363, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45363}},
    "independent" {"id" 865237400, "assured" nil}}},
  "timestamp" 1353918958350,
  "relativeTimestamp" 138030475135130}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45364, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45364}},
    "independent" {"id" 582698208, "assured" nil}}},
  "timestamp" 1353918958721,
  "relativeTimestamp" 138030846492184}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45365, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45365}},
    "independent" {"id" 1095545728, "assured" nil}}},
  "timestamp" 1353918959255,
  "relativeTimestamp" 138031380330823}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45366, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45366}},
    "independent" {"id" 1095546040, "assured" nil}}},
  "timestamp" 1353918959409,
  "relativeTimestamp" 138031534314598}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45367, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45367}},
    "independent" {"id" 1095544480, "assured" nil}}},
  "timestamp" 1353918959741,
  "relativeTimestamp" 138031866445081}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "194.95.81.200"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 58158, "dport" 143}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "194.95.81.200",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 143, "dport" 58158}},
    "independent" {"id" 1164664440, "assured" nil}}},
  "timestamp" 1353918959876,
  "relativeTimestamp" 138032001292685}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45368, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45368}},
    "independent" {"id" 865237712, "assured" nil}}},
  "timestamp" 1353918960053,
  "relativeTimestamp" 138032178474275}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45369, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45369}},
    "independent" {"id" 865238024, "assured" nil}}},
  "timestamp" 1353918960370,
  "relativeTimestamp" 138032495237134}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45370, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45370}},
    "independent" {"id" 1095547288, "assured" nil}}},
  "timestamp" 1353918960756,
  "relativeTimestamp" 138032881281702}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45371, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45371}},
    "independent" {"id" 865238336, "assured" nil}}},
  "timestamp" 1353918961067,
  "relativeTimestamp" 138033192246789}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45372, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45372}},
    "independent" {"id" 582698520, "assured" nil}}},
  "timestamp" 1353918961387,
  "relativeTimestamp" 138033512085759}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45373, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45373}},
    "independent" {"id" 1095541984, "assured" nil}}},
  "timestamp" 1353918961789,
  "relativeTimestamp" 138033914193870}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45374, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45374}},
    "independent" {"id" 1095541672, "assured" nil}}},
  "timestamp" 1353918962133,
  "relativeTimestamp" 138034258173905}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45375, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45375}},
    "independent" {"id" 27311736, "assured" nil}}},
  "timestamp" 1353918962461,
  "relativeTimestamp" 138034586251542}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45376, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45376}},
    "independent" {"id" 27311424, "assured" nil}}},
  "timestamp" 1353918962776,
  "relativeTimestamp" 138034901128457}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45377, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45377}},
    "independent" {"id" 27311112, "assured" nil}}},
  "timestamp" 1353918963124,
  "relativeTimestamp" 138035249133975}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45378, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45378}},
    "independent" {"id" 6513888, "assured" nil}}},
  "timestamp" 1353918963442,
  "relativeTimestamp" 138035567118212}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45379, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45379}},
    "independent" {"id" 1095546976, "assured" nil}}},
  "timestamp" 1353918963768,
  "relativeTimestamp" 138035893347224}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45380, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45380}},
    "independent" {"id" 865238648, "assured" nil}}},
  "timestamp" 1353918964074,
  "relativeTimestamp" 138036199131785}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45381, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45381}},
    "independent" {"id" 27310800, "assured" nil}}},
  "timestamp" 1353918964391,
  "relativeTimestamp" 138036516132056}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45382, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45382}},
    "independent" {"id" 865255032, "assured" nil}}},
  "timestamp" 1353918964735,
  "relativeTimestamp" 138036860249323}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45383, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45383}},
    "independent" {"id" 6513576, "assured" nil}}},
  "timestamp" 1353918965075,
  "relativeTimestamp" 138037200134176}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45384, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45384}},
    "independent" {"id" 865254720, "assured" nil}}},
  "timestamp" 1353918965414,
  "relativeTimestamp" 138037539262310}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45385, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45385}},
    "independent" {"id" 1095542920, "assured" nil}}},
  "timestamp" 1353918965755,
  "relativeTimestamp" 138037880243688}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45386, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45386}},
    "independent" {"id" 1164661632, "assured" nil}}},
  "timestamp" 1353918966059,
  "relativeTimestamp" 138038184696786}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45387, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45387}},
    "independent" {"id" 865254408, "assured" nil}}},
  "timestamp" 1353918966389,
  "relativeTimestamp" 138038514282277}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45388, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45388}},
    "independent" {"id" 6513264, "assured" nil}}},
  "timestamp" 1353918966730,
  "relativeTimestamp" 138038855203038}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45389, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45389}},
    "independent" {"id" 6512952, "assured" nil}}},
  "timestamp" 1353918967061,
  "relativeTimestamp" 138039186151753}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45390, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45390}},
    "independent" {"id" 1164659760, "assured" nil}}},
  "timestamp" 1353918967407,
  "relativeTimestamp" 138039532241419}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 45391, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.100",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 45391}},
    "independent" {"id" 27310488, "assured" nil}}},
  "timestamp" 1353918967751,
  "relativeTimestamp" 138039876335939}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 56811, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.1",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 56811}},
    "independent" {"id" 6516072, "assured" nil}}},
  "timestamp" 1353919010952,
  "relativeTimestamp" 138083076754283}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "212.227.17.186"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 44301, "dport" 993}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.227.17.186",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 993, "dport" 44301}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432552,
     "id" 6512640,
     "unreplied" nil}}},
  "timestamp" 1353919100796,
  "relativeTimestamp" 138172921107867}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "212.227.17.186"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 44301, "dport" 993}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.227.17.186",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 993, "dport" 44301}},
    "independent" {"timeout" 432000, "id" 6512640}}},
  "timestamp" 1353919100837,
  "relativeTimestamp" 138172962333724}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "212.227.17.186"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 44301, "dport" 993}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.227.17.186",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 993, "dport" 44301}},
    "independent" {"timeout" 432000, "id" 6512640, "assured" nil}}},
  "timestamp" 1353919100861,
  "relativeTimestamp" 138172985923984}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 41125, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.1",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 41125}},
    "independent" {"timeout" 30, "id" 1164663816, "unreplied" nil}}},
  "timestamp" 1353919113581,
  "relativeTimestamp" 138185705721957}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 41125, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.1",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 41125}},
    "independent" {"timeout" 29, "id" 1164663816}}},
  "timestamp" 1353919113621,
  "relativeTimestamp" 138185746679013}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 41125, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.1",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 41125}},
    "independent" {"timeout" 180, "id" 1164663816, "assured" nil}}},
  "timestamp" 1353919113638,
  "relativeTimestamp" 138185763216837}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "173.194.69.102"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 39409, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.194.69.102",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 39409}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 6518568,
     "unreplied" nil}}},
  "timestamp" 1353919113655,
  "relativeTimestamp" 138185779959209}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "173.194.69.102"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 39409, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.194.69.102",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 39409}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 6518568}}},
  "timestamp" 1353919113673,
  "relativeTimestamp" 138185798087670}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "173.194.69.102"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 39409, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.194.69.102",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 39409}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 6518568,
     "assured" nil}}},
  "timestamp" 1353919113693,
  "relativeTimestamp" 138185818389516}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 55396, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.1",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 55396}},
    "independent" {"timeout" 30, "id" 6518880, "unreplied" nil}}},
  "timestamp" 1353919113754,
  "relativeTimestamp" 138185879051594}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 55396, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.1",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 55396}},
    "independent" {"timeout" 29, "id" 6518880}}},
  "timestamp" 1353919113796,
  "relativeTimestamp" 138185921275980}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 55396, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.1",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 55396}},
    "independent" {"timeout" 180, "id" 6518880, "assured" nil}}},
  "timestamp" 1353919113813,
  "relativeTimestamp" 138185937814287}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "173.194.69.138"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 39183, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.194.69.138",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 39183}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 6519192,
     "unreplied" nil}}},
  "timestamp" 1353919113831,
  "relativeTimestamp" 138185955762865}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "173.194.69.138"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 39183, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.194.69.138",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 39183}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 6519192}}},
  "timestamp" 1353919113848,
  "relativeTimestamp" 138185973155114}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "173.194.69.138"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 39183, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.194.69.138",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 39183}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 6519192,
     "assured" nil}}},
  "timestamp" 1353919113865,
  "relativeTimestamp" 138185989955035}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "192.168.0.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 45522, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.1",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 45522}},
    "independent" {"id" 865254096, "assured" nil}}},
  "timestamp" 1353919129845,
  "relativeTimestamp" 138201970703661}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "64.12.73.163"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 55951, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "64.12.73.163",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 55951}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 865254096,
     "unreplied" nil}}},
  "timestamp" 1353919177577,
  "relativeTimestamp" 138249702056282}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "64.12.73.163"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 55951, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "64.12.73.163",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 55951}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 865254096}}},
  "timestamp" 1353919177704,
  "relativeTimestamp" 138249828773608}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "64.12.73.163"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 55951, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "64.12.73.163",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 55951}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 865254096,
     "assured" nil}}},
  "timestamp" 1353919177724,
  "relativeTimestamp" 138249849192438}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "173.194.69.102"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 39409, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.194.69.102",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 39409}},
    "independent"
    {"state" "FIN_WAIT", "timeout" 120, "id" 6518568, "assured" nil}}},
  "timestamp" 1353919228851,
  "relativeTimestamp" 138300976696694}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "173.194.69.102"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 39409, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.194.69.102",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 39409}},
    "independent"
    {"state" "LAST_ACK", "timeout" 30, "id" 6518568, "assured" nil}}},
  "timestamp" 1353919228899,
  "relativeTimestamp" 138301024697331}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "173.194.69.102"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 39409, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.194.69.102",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 39409}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 6518568,
     "assured" nil}}},
  "timestamp" 1353919228917,
  "relativeTimestamp" 138301042216833}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.198",
      "dst" "173.194.69.138"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 39183, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.194.69.138",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 39183}},
    "independent"
    {"state" "FIN_WAIT", "timeout" 120, "id" 6519192, "assured" nil}}},
  "timestamp" 1353919229852,
  "relativeTimestamp" 138301977431384}}
     ])

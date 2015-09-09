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
    :description "Syn flood via Mausezahn on wlan0."
    :raw-file "syn_flood_sender_rand_2012-11-26.out"
    :date "2012-11-26"}
   cljEsperRunner.test.data.conntrack.syn-flood-sender-rand-2012-11-26)

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
     "timeout" 433501,
     "id" 1888899656,
     "unreplied" nil}}},
  "timestamp" 1353918152120,
  "relativeTimestamp" 137224245445951}}
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
    "independent" {"timeout" 432000, "id" 1888899656}}},
  "timestamp" 1353918152382,
  "relativeTimestamp" 137224507497303}}
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
    "independent" {"timeout" 431999, "id" 1888899656, "assured" nil}}},
  "timestamp" 1353918152865,
  "relativeTimestamp" 137224990697696}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 55647, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "64.12.73.163",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 55647}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 433492,
     "id" 1095548224,
     "unreplied" nil}}},
  "timestamp" 1353918161112,
  "relativeTimestamp" 137233237135143}}
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
     "timeout" 433492,
     "id" 1095543232,
     "unreplied" nil}}},
  "timestamp" 1353918161775,
  "relativeTimestamp" 137233900601013}}
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
     "timeout" 433492,
     "id" 1095544792,
     "unreplied" nil}}},
  "timestamp" 1353918162256,
  "relativeTimestamp" 137234380826248}}
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
    "independent" {"timeout" 432000, "id" 1095544792}}},
  "timestamp" 1353918162695,
  "relativeTimestamp" 137234819966020}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 55647, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "64.12.73.163",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 55647}},
    "independent" {"timeout" 432000, "id" 1095548224}}},
  "timestamp" 1353918163031,
  "relativeTimestamp" 137235156245196}}
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
    "independent" {"timeout" 432000, "id" 1095543232}}},
  "timestamp" 1353918163399,
  "relativeTimestamp" 137235523837793}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 55647, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "64.12.73.163",
      "dst" "192.168.0.198"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 55647}},
    "independent" {"timeout" 300, "id" 1095548224, "assured" nil}}},
  "timestamp" 1353918191068,
  "relativeTimestamp" 137263193370737}}
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
    "independent" {"timeout" 300, "id" 1095543232, "assured" nil}}},
  "timestamp" 1353918191131,
  "relativeTimestamp" 137263255859125}}
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
    "independent" {"timeout" 300, "id" 1095544792, "assured" nil}}},
  "timestamp" 1353918191194,
  "relativeTimestamp" 137263319323698}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "209.93.198.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "209.93.198.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888899968,
     "unreplied" nil}}},
  "timestamp" 1353918226025,
  "relativeTimestamp" 137298150207190}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "29.253.75.160",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "29.253.75.160"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888898096,
     "unreplied" nil}}},
  "timestamp" 1353918226121,
  "relativeTimestamp" 137298246574741}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "5.201.74.120",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "5.201.74.120"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888900280,
     "unreplied" nil}}},
  "timestamp" 1353918226186,
  "relativeTimestamp" 137298311597495}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "46.135.175.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "46.135.175.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888899344,
     "unreplied" nil}}},
  "timestamp" 1353918226263,
  "relativeTimestamp" 137298387895232}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "37.44.219.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "37.44.219.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888898720,
     "unreplied" nil}}},
  "timestamp" 1353918226338,
  "relativeTimestamp" 137298462831481}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "68.186.104.128",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "68.186.104.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888895912,
     "unreplied" nil}}},
  "timestamp" 1353918226434,
  "relativeTimestamp" 137298559012094}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "73.169.204.128",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "73.169.204.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888895600,
     "unreplied" nil}}},
  "timestamp" 1353918226517,
  "relativeTimestamp" 137298641930615}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "95.104.190.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "95.104.190.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888896536,
     "unreplied" nil}}},
  "timestamp" 1353918226627,
  "relativeTimestamp" 137298752124023}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "146.26.163.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "146.26.163.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888900592,
     "unreplied" nil}}},
  "timestamp" 1353918226691,
  "relativeTimestamp" 137298815809814}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "30.14.64.192",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "30.14.64.192"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888901216,
     "unreplied" nil}}},
  "timestamp" 1353918226795,
  "relativeTimestamp" 137298920601853}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "119.110.129.128",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "119.110.129.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888900904,
     "unreplied" nil}}},
  "timestamp" 1353918226881,
  "relativeTimestamp" 137299005954161}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "119.156.74.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "119.156.74.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888898408,
     "unreplied" nil}}},
  "timestamp" 1353918226941,
  "relativeTimestamp" 137299065896354}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "77.57.110.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "77.57.110.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888895288,
     "unreplied" nil}}},
  "timestamp" 1353918227000,
  "relativeTimestamp" 137299125549806}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "99.58.40.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "99.58.40.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888901840,
     "unreplied" nil}}},
  "timestamp" 1353918227089,
  "relativeTimestamp" 137299214602553}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "34.134.212.192",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "34.134.212.192"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888902776,
     "unreplied" nil}}},
  "timestamp" 1353918227149,
  "relativeTimestamp" 137299274408926}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "93.99.109.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "93.99.109.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888897472,
     "unreplied" nil}}},
  "timestamp" 1353918227215,
  "relativeTimestamp" 137299340579122}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "186.132.64.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "186.132.64.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888901528,
     "unreplied" nil}}},
  "timestamp" 1353918227274,
  "relativeTimestamp" 137299399185517}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "106.221.96.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "106.221.96.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888897160,
     "unreplied" nil}}},
  "timestamp" 1353918227536,
  "relativeTimestamp" 137299661223726}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "52.254.242.192",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "52.254.242.192"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888902152,
     "unreplied" nil}}},
  "timestamp" 1353918227909,
  "relativeTimestamp" 137300034594659}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "3.170.149.236",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "3.170.149.236"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888896224,
     "unreplied" nil}}},
  "timestamp" 1353918228224,
  "relativeTimestamp" 137300348860588}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "124.145.228.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "124.145.228.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888899032,
     "unreplied" nil}}},
  "timestamp" 1353918228456,
  "relativeTimestamp" 137300581526213}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "6.42.120.96",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "6.42.120.96"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888897784,
     "unreplied" nil}}},
  "timestamp" 1353918228718,
  "relativeTimestamp" 137300842804066}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "31.229.144.96",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "31.229.144.96"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888894976,
     "unreplied" nil}}},
  "timestamp" 1353918229004,
  "relativeTimestamp" 137301128965291}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "205.232.70.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "205.232.70.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888896848,
     "unreplied" nil}}},
  "timestamp" 1353918229282,
  "relativeTimestamp" 137301406733860}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "189.65.72.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "189.65.72.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1888902464,
     "unreplied" nil}}},
  "timestamp" 1353918229610,
  "relativeTimestamp" 137301735290183}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "56.112.218.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "56.112.218.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096295960,
     "unreplied" nil}}},
  "timestamp" 1353918229817,
  "relativeTimestamp" 137301942158780}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "46.18.223.192",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "46.18.223.192"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096299704,
     "unreplied" nil}}},
  "timestamp" 1353918230004,
  "relativeTimestamp" 137302128865149}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "204.224.72.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "204.224.72.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096294400,
     "unreplied" nil}}},
  "timestamp" 1353918230174,
  "relativeTimestamp" 137302299450224}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "3.17.219.132",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "3.17.219.132"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096299392,
     "unreplied" nil}}},
  "timestamp" 1353918230303,
  "relativeTimestamp" 137302428704108}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "174.176.17.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "174.176.17.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096299080,
     "unreplied" nil}}},
  "timestamp" 1353918230433,
  "relativeTimestamp" 137302557749577}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "143.219.94.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "143.219.94.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096297520,
     "unreplied" nil}}},
  "timestamp" 1353918230600,
  "relativeTimestamp" 137302725515574}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.111.162.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "212.111.162.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096295024,
     "unreplied" nil}}},
  "timestamp" 1353918230732,
  "relativeTimestamp" 137302857027711}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "204.173.93.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "204.173.93.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096294712,
     "unreplied" nil}}},
  "timestamp" 1353918230877,
  "relativeTimestamp" 137303002182179}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "149.164.168.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "149.164.168.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096297208,
     "unreplied" nil}}},
  "timestamp" 1353918231010,
  "relativeTimestamp" 137303135237339}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "34.247.80.128",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "34.247.80.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096296896,
     "unreplied" nil}}},
  "timestamp" 1353918231135,
  "relativeTimestamp" 137303260234191}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "17.218.56.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "17.218.56.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096296584,
     "unreplied" nil}}},
  "timestamp" 1353918231298,
  "relativeTimestamp" 137303423164257}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "218.95.16.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "218.95.16.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096296272,
     "unreplied" nil}}},
  "timestamp" 1353918231455,
  "relativeTimestamp" 137303580398918}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "108.161.28.128",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "108.161.28.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096295336,
     "unreplied" nil}}},
  "timestamp" 1353918231566,
  "relativeTimestamp" 137303691288047}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "113.66.246.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "113.66.246.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096300952,
     "unreplied" nil}}},
  "timestamp" 1353918231679,
  "relativeTimestamp" 137303803853978}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "140.121.179.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "140.121.179.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096300328,
     "unreplied" nil}}},
  "timestamp" 1353918231812,
  "relativeTimestamp" 137303937154314}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "138.175.93.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "138.175.93.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096300640,
     "unreplied" nil}}},
  "timestamp" 1353918231944,
  "relativeTimestamp" 137304069413209}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "8.177.119.176",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "8.177.119.176"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096301888,
     "unreplied" nil}}},
  "timestamp" 1353918232081,
  "relativeTimestamp" 137304206564088}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "36.21.253.192",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "36.21.253.192"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096302200,
     "unreplied" nil}}},
  "timestamp" 1353918232219,
  "relativeTimestamp" 137304344615392}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "215.232.203.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "215.232.203.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096295648,
     "unreplied" nil}}},
  "timestamp" 1353918232339,
  "relativeTimestamp" 137304464204818}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "107.235.159.128",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "107.235.159.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096301264,
     "unreplied" nil}}},
  "timestamp" 1353918232469,
  "relativeTimestamp" 137304593974095}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "70.156.210.128",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "70.156.210.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096301576,
     "unreplied" nil}}},
  "timestamp" 1353918232589,
  "relativeTimestamp" 137304714059350}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "85.76.56.128",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "85.76.56.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096300016,
     "unreplied" nil}}},
  "timestamp" 1353918232703,
  "relativeTimestamp" 137304828397724}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "70.111.224.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "70.111.224.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096297832,
     "unreplied" nil}}},
  "timestamp" 1353918232841,
  "relativeTimestamp" 137304966406211}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "177.122.50.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "177.122.50.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096298144,
     "unreplied" nil}}},
  "timestamp" 1353918233027,
  "relativeTimestamp" 137305151930607}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "138.75.44.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "138.75.44.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096298456,
     "unreplied" nil}}},
  "timestamp" 1353918233157,
  "relativeTimestamp" 137305282285843}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "74.26.117.128",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "74.26.117.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1096298768,
     "unreplied" nil}}},
  "timestamp" 1353918233295,
  "relativeTimestamp" 137305420299226}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "78.12.22.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "78.12.22.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916133984,
     "unreplied" nil}}},
  "timestamp" 1353918233448,
  "relativeTimestamp" 137305573592707}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "144.117.164.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "144.117.164.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916131488,
     "unreplied" nil}}},
  "timestamp" 1353918233555,
  "relativeTimestamp" 137305680332439}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "106.0.6.128",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "106.0.6.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916134296,
     "unreplied" nil}}},
  "timestamp" 1353918233658,
  "relativeTimestamp" 137305782879402}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "59.244.92.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "59.244.92.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916133048,
     "unreplied" nil}}},
  "timestamp" 1353918233783,
  "relativeTimestamp" 137305908655515}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "109.182.235.128",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "109.182.235.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916132424,
     "unreplied" nil}}},
  "timestamp" 1353918233998,
  "relativeTimestamp" 137306123362928}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "162.112.224.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "162.112.224.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916127744,
     "unreplied" nil}}},
  "timestamp" 1353918234146,
  "relativeTimestamp" 137306271556068}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "106.7.59.128",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "106.7.59.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916133672,
     "unreplied" nil}}},
  "timestamp" 1353918234256,
  "relativeTimestamp" 137306381149934}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "90.151.52.128",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "90.151.52.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916130240,
     "unreplied" nil}}},
  "timestamp" 1353918234354,
  "relativeTimestamp" 137306479095811}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "165.130.188.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "165.130.188.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916133360,
     "unreplied" nil}}},
  "timestamp" 1353918234479,
  "relativeTimestamp" 137306604647104}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "56.183.77.128",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "56.183.77.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916130552,
     "unreplied" nil}}},
  "timestamp" 1353918234604,
  "relativeTimestamp" 137306729335205}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "10.114.145.160",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "10.114.145.160"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916134920,
     "unreplied" nil}}},
  "timestamp" 1353918234711,
  "relativeTimestamp" 137306835895681}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "153.242.93.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "153.242.93.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916131800,
     "unreplied" nil}}},
  "timestamp" 1353918234835,
  "relativeTimestamp" 137306959915890}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "37.100.170.64",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "37.100.170.64"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916129616,
     "unreplied" nil}}},
  "timestamp" 1353918234982,
  "relativeTimestamp" 137307107672474}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "160.23.58.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "160.23.58.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916129304,
     "unreplied" nil}}},
  "timestamp" 1353918235091,
  "relativeTimestamp" 137307215880535}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "188.233.173.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "188.233.173.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916135544,
     "unreplied" nil}}},
  "timestamp" 1353918235204,
  "relativeTimestamp" 137307328727770}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "55.62.226.64",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "55.62.226.64"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916128992,
     "unreplied" nil}}},
  "timestamp" 1353918235301,
  "relativeTimestamp" 137307426517827}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "154.118.74.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "154.118.74.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916135232,
     "unreplied" nil}}},
  "timestamp" 1353918235405,
  "relativeTimestamp" 137307530381887}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "73.138.202.128",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "73.138.202.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916128056,
     "unreplied" nil}}},
  "timestamp" 1353918235512,
  "relativeTimestamp" 137307637128706}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "168.129.216.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "168.129.216.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916131176,
     "unreplied" nil}}},
  "timestamp" 1353918235618,
  "relativeTimestamp" 137307743155894}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "70.239.253.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "70.239.253.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916132736,
     "unreplied" nil}}},
  "timestamp" 1353918235717,
  "relativeTimestamp" 137307842353672}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.58.40.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "212.58.40.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916128368,
     "unreplied" nil}}},
  "timestamp" 1353918235871,
  "relativeTimestamp" 137307996527902}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "177.51.80.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "177.51.80.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916130864,
     "unreplied" nil}}},
  "timestamp" 1353918235969,
  "relativeTimestamp" 137308094370646}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "107.5.251.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "107.5.251.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916132112,
     "unreplied" nil}}},
  "timestamp" 1353918236068,
  "relativeTimestamp" 137308192948103}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "204.34.243.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "204.34.243.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916129928,
     "unreplied" nil}}},
  "timestamp" 1353918236170,
  "relativeTimestamp" 137308294889660}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "61.30.239.64",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "61.30.239.64"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916128680,
     "unreplied" nil}}},
  "timestamp" 1353918236276,
  "relativeTimestamp" 137308401380650}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "177.162.206.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "177.162.206.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 916134608,
     "unreplied" nil}}},
  "timestamp" 1353918236393,
  "relativeTimestamp" 137308518185498}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "65.111.44.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "65.111.44.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890126272,
     "unreplied" nil}}},
  "timestamp" 1353918236488,
  "relativeTimestamp" 137308613181213}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "131.142.207.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "131.142.207.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890130328,
     "unreplied" nil}}},
  "timestamp" 1353918236591,
  "relativeTimestamp" 137308716496880}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "131.28.255.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "131.28.255.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890125024,
     "unreplied" nil}}},
  "timestamp" 1353918236689,
  "relativeTimestamp" 137308813817073}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "203.186.87.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "203.186.87.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890131576,
     "unreplied" nil}}},
  "timestamp" 1353918236783,
  "relativeTimestamp" 137308908347874}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "205.169.69.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "205.169.69.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890131264,
     "unreplied" nil}}},
  "timestamp" 1353918236880,
  "relativeTimestamp" 137309005079946}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "209.41.22.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "209.41.22.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890130016,
     "unreplied" nil}}},
  "timestamp" 1353918236987,
  "relativeTimestamp" 137309111834545}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "124.47.251.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "124.47.251.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890129704,
     "unreplied" nil}}},
  "timestamp" 1353918237135,
  "relativeTimestamp" 137309260577406}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "87.169.75.128",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "87.169.75.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890128456,
     "unreplied" nil}}},
  "timestamp" 1353918237230,
  "relativeTimestamp" 137309355089445}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "45.29.113.128",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "45.29.113.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890125336,
     "unreplied" nil}}},
  "timestamp" 1353918237328,
  "relativeTimestamp" 137309452877939}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "9.230.230.240",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "9.230.230.240"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890125960,
     "unreplied" nil}}},
  "timestamp" 1353918237428,
  "relativeTimestamp" 137309552828299}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "26.26.43.64",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "26.26.43.64"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890126896,
     "unreplied" nil}}},
  "timestamp" 1353918237529,
  "relativeTimestamp" 137309653726261}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "151.36.174.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "151.36.174.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890126584,
     "unreplied" nil}}},
  "timestamp" 1353918237622,
  "relativeTimestamp" 137309747682400}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "100.126.27.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "100.126.27.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890130952,
     "unreplied" nil}}},
  "timestamp" 1353918237731,
  "relativeTimestamp" 137309856135130}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "191.156.231.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "191.156.231.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890129392,
     "unreplied" nil}}},
  "timestamp" 1353918237835,
  "relativeTimestamp" 137309960195534}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "207.219.251.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "207.219.251.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890129080,
     "unreplied" nil}}},
  "timestamp" 1353918237937,
  "relativeTimestamp" 137310062591100}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "110.240.173.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "110.240.173.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890127520,
     "unreplied" nil}}},
  "timestamp" 1353918238031,
  "relativeTimestamp" 137310156599368}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "121.143.68.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "121.143.68.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890127832,
     "unreplied" nil}}},
  "timestamp" 1353918238126,
  "relativeTimestamp" 137310251116337}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "21.64.164.224",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "21.64.164.224"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890128144,
     "unreplied" nil}}},
  "timestamp" 1353918238221,
  "relativeTimestamp" 137310346125572}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "47.7.230.128",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "47.7.230.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890128768,
     "unreplied" nil}}},
  "timestamp" 1353918238314,
  "relativeTimestamp" 137310439446025}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "86.120.241.128",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "86.120.241.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890130640,
     "unreplied" nil}}},
  "timestamp" 1353918238407,
  "relativeTimestamp" 137310532567818}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "76.127.135.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "76.127.135.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890124088,
     "unreplied" nil}}},
  "timestamp" 1353918238511,
  "relativeTimestamp" 137310636610321}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "201.126.49.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "201.126.49.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890123776,
     "unreplied" nil}}},
  "timestamp" 1353918238609,
  "relativeTimestamp" 137310733821884}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "160.3.188.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "160.3.188.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890124400,
     "unreplied" nil}}},
  "timestamp" 1353918238709,
  "relativeTimestamp" 137310833871007}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "21.1.95.96",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "21.1.95.96"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890127208,
     "unreplied" nil}}},
  "timestamp" 1353918238870,
  "relativeTimestamp" 137310995281716}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "48.110.45.192",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "48.110.45.192"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890124712,
     "unreplied" nil}}},
  "timestamp" 1353918238990,
  "relativeTimestamp" 137311115288908}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "148.61.227.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "148.61.227.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1890125648,
     "unreplied" nil}}},
  "timestamp" 1353918239083,
  "relativeTimestamp" 137311208472700}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "198.52.176.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "198.52.176.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 16941056,
     "unreplied" nil}}},
  "timestamp" 1353918239178,
  "relativeTimestamp" 137311303644009}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "155.116.41.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "155.116.41.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 16941368,
     "unreplied" nil}}},
  "timestamp" 1353918239278,
  "relativeTimestamp" 137311402781966}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "128.96.214.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "128.96.214.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 16941680,
     "unreplied" nil}}},
  "timestamp" 1353918239372,
  "relativeTimestamp" 137311496809547}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "35.83.159.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "35.83.159.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 16941992,
     "unreplied" nil}}},
  "timestamp" 1353918239504,
  "relativeTimestamp" 137311629075203}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "109.22.246.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "109.22.246.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 16942304,
     "unreplied" nil}}},
  "timestamp" 1353918239608,
  "relativeTimestamp" 137311732751873}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "193.208.2.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "193.208.2.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 16942616,
     "unreplied" nil}}},
  "timestamp" 1353918239716,
  "relativeTimestamp" 137311841541090}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "166.226.110.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "166.226.110.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 16942928,
     "unreplied" nil}}},
  "timestamp" 1353918239808,
  "relativeTimestamp" 137311932749245}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "16.51.245.160",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "16.51.245.160"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 16943240,
     "unreplied" nil}}},
  "timestamp" 1353918239899,
  "relativeTimestamp" 137312023828638}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.138.89.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "173.138.89.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 16943552,
     "unreplied" nil}}},
  "timestamp" 1353918239987,
  "relativeTimestamp" 137312112612365}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "148.139.180.0",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "148.139.180.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 16943864,
     "unreplied" nil}}},
  "timestamp" 1353918240082,
  "relativeTimestamp" 137312207452488}}
])

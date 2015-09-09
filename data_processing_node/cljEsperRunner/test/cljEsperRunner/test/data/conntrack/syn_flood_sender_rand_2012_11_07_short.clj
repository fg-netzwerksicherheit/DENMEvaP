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
    :doc "Short version of conntrack syn-flood sample data from 2012-11-07."}
   cljEsperRunner.test.data.conntrack.syn-flood-sender-rand-2012-11-07-short)

(def data-set
[{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "10.140.72.80",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "10.140.72.80"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1499193968,
     "unreplied" nil}}},
  "timestamp" 1352304748016,
  "relativeTimestamp" 25853091347462}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "169.169.53.0",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "169.169.53.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1499193656,
     "unreplied" nil}}},
  "timestamp" 1352304748080,
  "relativeTimestamp" 25853156033380}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "59.124.133.192",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "59.124.133.192"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1499193344,
     "unreplied" nil}}},
  "timestamp" 1352304748122,
  "relativeTimestamp" 25853197589398}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "45.121.223.0",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "45.121.223.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1499198336,
     "unreplied" nil}}},
  "timestamp" 1352304748154,
  "relativeTimestamp" 25853230191068}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "129.249.155.0",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "129.249.155.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1499198648,
     "unreplied" nil}}},
  "timestamp" 1352304748195,
  "relativeTimestamp" 25853270331962}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "122.184.94.128",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "122.184.94.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1499198960,
     "unreplied" nil}}},
  "timestamp" 1352304748236,
  "relativeTimestamp" 25853311403866}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "9.10.68.80",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "9.10.68.80"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1499199272,
     "unreplied" nil}}},
  "timestamp" 1352304748269,
  "relativeTimestamp" 25853344856011}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "119.67.203.0",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "119.67.203.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1499199584,
     "unreplied" nil}}},
  "timestamp" 1352304748299,
  "relativeTimestamp" 25853375025667}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "79.143.233.128",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "79.143.233.128"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1499199896,
     "unreplied" nil}}},
  "timestamp" 1352304748345,
  "relativeTimestamp" 25853420725171}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.167.46.0",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "23.167.46.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1499200208,
     "unreplied" nil}}},
  "timestamp" 1352304748375,
  "relativeTimestamp" 25853451064604}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "76.219.62.0",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "76.219.62.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1499200520,
     "unreplied" nil}}},
  "timestamp" 1352304748412,
  "relativeTimestamp" 25853487262476}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "143.120.193.0",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "143.120.193.0"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1499200832,
     "unreplied" nil}}},
  "timestamp" 1352304748442,
  "relativeTimestamp" 25853517817499}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "39.200.154.192",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 0, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "39.200.154.192"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 0}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 1499201144,
     "unreplied" nil}}},
  "timestamp" 1352304748478,
  "relativeTimestamp" 25853554161094}}])

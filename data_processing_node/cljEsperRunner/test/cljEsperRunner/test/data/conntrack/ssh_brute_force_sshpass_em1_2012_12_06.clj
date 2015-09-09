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
    :description "Sample of a simple SSH brute force attack."
    :raw-file "ssh_brute_force_sshpass_em1_2012-12-06.out"
    :date "2012-12-06"}
   cljEsperRunner.test.data.conntrack.ssh-brute-force-sshpass-em1-2012-12-06)

(def data-set [
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35948, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35948}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812460480,
     "unreplied" nil}}},
  "timestamp" 1354804310003,
  "relativeTimestamp" 13398099347309}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35948, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35948}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812460480}}},
  "timestamp" 1354804310267,
  "relativeTimestamp" 13398363990915}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35948, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35948}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812460480,
     "assured" nil}}},
  "timestamp" 1354804310495,
  "relativeTimestamp" 13398591835735}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35948, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35948}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812460480,
     "assured" nil}}},
  "timestamp" 1354804312212,
  "relativeTimestamp" 13400308301084}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35948, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35948}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812460480,
     "assured" nil}}},
  "timestamp" 1354804312326,
  "relativeTimestamp" 13400423071234}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35948, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35948}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812460480,
     "assured" nil}}},
  "timestamp" 1354804312413,
  "relativeTimestamp" 13400510041872}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35949, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35949}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812465160,
     "unreplied" nil}}},
  "timestamp" 1354804312501,
  "relativeTimestamp" 13400597851798}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35949, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35949}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812465160}}},
  "timestamp" 1354804312570,
  "relativeTimestamp" 13400667289623}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35949, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35949}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812465160,
     "assured" nil}}},
  "timestamp" 1354804312652,
  "relativeTimestamp" 13400748928440}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35949, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35949}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812465160,
     "assured" nil}}},
  "timestamp" 1354804314589,
  "relativeTimestamp" 13402685995239}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35949, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35949}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812465160,
     "assured" nil}}},
  "timestamp" 1354804314652,
  "relativeTimestamp" 13402748976991}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35949, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35949}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812465160,
     "assured" nil}}},
  "timestamp" 1354804314727,
  "relativeTimestamp" 13402824210718}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35950, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35950}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586802712,
     "unreplied" nil}}},
  "timestamp" 1354804314793,
  "relativeTimestamp" 13402889343068}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35950, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35950}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586802712}}},
  "timestamp" 1354804314856,
  "relativeTimestamp" 13402952651333}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35950, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35950}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586802712,
     "assured" nil}}},
  "timestamp" 1354804314920,
  "relativeTimestamp" 13403016385133}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35950, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35950}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 586802712,
     "assured" nil}}},
  "timestamp" 1354804316581,
  "relativeTimestamp" 13404677377087}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35950, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35950}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 586802712,
     "assured" nil}}},
  "timestamp" 1354804316665,
  "relativeTimestamp" 13404761394844}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35950, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35950}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 586802712,
     "assured" nil}}},
  "timestamp" 1354804316717,
  "relativeTimestamp" 13404813596096}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35951, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35951}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586805520,
     "unreplied" nil}}},
  "timestamp" 1354804316771,
  "relativeTimestamp" 13404867538145}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35951, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35951}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586805520}}},
  "timestamp" 1354804316822,
  "relativeTimestamp" 13404918874193}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35951, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35951}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586805520,
     "assured" nil}}},
  "timestamp" 1354804316867,
  "relativeTimestamp" 13404963645408}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "213.239.200.187"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 48545, "dport" 5222}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "213.239.200.187",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 5222, "dport" 48545}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 433587,
     "id" 134186832,
     "unreplied" nil}}},
  "timestamp" 1354804318083,
  "relativeTimestamp" 13406179315396}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "213.239.200.187"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 48545, "dport" 5222}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "213.239.200.187",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 5222, "dport" 48545}},
    "independent" {"timeout" 432000, "id" 134186832}}},
  "timestamp" 1354804318120,
  "relativeTimestamp" 13406216421378}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "213.239.200.187"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 48545, "dport" 5222}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "213.239.200.187",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 5222, "dport" 48545}},
    "independent" {"timeout" 432000, "id" 134186832, "assured" nil}}},
  "timestamp" 1354804318166,
  "relativeTimestamp" 13406262335200}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "205.188.10.221"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 39424, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "205.188.10.221",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 39424}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 433586,
     "id" 586804896,
     "unreplied" nil}}},
  "timestamp" 1354804319080,
  "relativeTimestamp" 13407176784905}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "64.12.30.49"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 50280, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "64.12.30.49",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 50280}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 433586,
     "id" 586802088,
     "unreplied" nil}}},
  "timestamp" 1354804319117,
  "relativeTimestamp" 13407213960856}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35951, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35951}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 586805520,
     "assured" nil}}},
  "timestamp" 1354804319173,
  "relativeTimestamp" 13407269362627}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35951, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35951}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 586805520,
     "assured" nil}}},
  "timestamp" 1354804319204,
  "relativeTimestamp" 13407301145032}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35951, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35951}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 586805520,
     "assured" nil}}},
  "timestamp" 1354804319241,
  "relativeTimestamp" 13407337552032}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35952, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35952}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134188080,
     "unreplied" nil}}},
  "timestamp" 1354804319274,
  "relativeTimestamp" 13407371078523}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35952, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35952}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134188080}}},
  "timestamp" 1354804319306,
  "relativeTimestamp" 13407403292022}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35952, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35952}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134188080,
     "assured" nil}}},
  "timestamp" 1354804319341,
  "relativeTimestamp" 13407437894682}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "205.188.10.221"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 39424, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "205.188.10.221",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 39424}},
    "independent" {"timeout" 432000, "id" 586804896}}},
  "timestamp" 1354804319374,
  "relativeTimestamp" 13407470729415}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "64.12.30.49"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 50280, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "64.12.30.49",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 50280}},
    "independent" {"timeout" 432000, "id" 586802088}}},
  "timestamp" 1354804319405,
  "relativeTimestamp" 13407501860595}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35952, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35952}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134188080,
     "assured" nil}}},
  "timestamp" 1354804321518,
  "relativeTimestamp" 13409614472917}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35952, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35952}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134188080,
     "assured" nil}}},
  "timestamp" 1354804321548,
  "relativeTimestamp" 13409645200874}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35952, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35952}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 134188080,
     "assured" nil}}},
  "timestamp" 1354804321592,
  "relativeTimestamp" 13409688728623}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35953, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35953}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838659744,
     "unreplied" nil}}},
  "timestamp" 1354804321628,
  "relativeTimestamp" 13409724836292}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35953, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35953}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838659744}}},
  "timestamp" 1354804321663,
  "relativeTimestamp" 13409759825753}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35953, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35953}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838659744,
     "assured" nil}}},
  "timestamp" 1354804321697,
  "relativeTimestamp" 13409793399772}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35953, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35953}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838659744,
     "assured" nil}}},
  "timestamp" 1354804323468,
  "relativeTimestamp" 13411564320549}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35953, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35953}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838659744,
     "assured" nil}}},
  "timestamp" 1354804323501,
  "relativeTimestamp" 13411597765501}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35953, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35953}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838659744,
     "assured" nil}}},
  "timestamp" 1354804323528,
  "relativeTimestamp" 13411624870876}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35954, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35954}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838657560,
     "unreplied" nil}}},
  "timestamp" 1354804323567,
  "relativeTimestamp" 13411663670058}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35954, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35954}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838657560}}},
  "timestamp" 1354804323595,
  "relativeTimestamp" 13411691415816}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35954, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35954}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838657560,
     "assured" nil}}},
  "timestamp" 1354804323621,
  "relativeTimestamp" 13411717627810}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "193.219.128.49"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 39758, "dport" 7000}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "193.219.128.49",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 7000, "dport" 39758}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 433580,
     "id" 812461104,
     "unreplied" nil}}},
  "timestamp" 1354804324754,
  "relativeTimestamp" 13412850921204}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "193.219.128.49"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 39758, "dport" 7000}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "193.219.128.49",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 7000, "dport" 39758}},
    "independent" {"timeout" 432000, "id" 812461104}}},
  "timestamp" 1354804324801,
  "relativeTimestamp" 13412898253040}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "193.219.128.49"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 39758, "dport" 7000}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "193.219.128.49",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 7000, "dport" 39758}},
    "independent" {"timeout" 432000, "id" 812461104, "assured" nil}}},
  "timestamp" 1354804324830,
  "relativeTimestamp" 13412927123943}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35954, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35954}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838657560,
     "assured" nil}}},
  "timestamp" 1354804325694,
  "relativeTimestamp" 13413790759712}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35954, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35954}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 29,
     "id" 838657560,
     "assured" nil}}},
  "timestamp" 1354804325724,
  "relativeTimestamp" 13413820453499}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35954, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35954}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838657560,
     "assured" nil}}},
  "timestamp" 1354804325755,
  "relativeTimestamp" 13413851745119}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35955, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35955}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838658184,
     "unreplied" nil}}},
  "timestamp" 1354804325780,
  "relativeTimestamp" 13413877245110}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35955, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35955}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838658184}}},
  "timestamp" 1354804325809,
  "relativeTimestamp" 13413905326343}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35955, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35955}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838658184,
     "assured" nil}}},
  "timestamp" 1354804325833,
  "relativeTimestamp" 13413929623007}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35955, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35955}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838658184,
     "assured" nil}}},
  "timestamp" 1354804327862,
  "relativeTimestamp" 13415958680096}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35955, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35955}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838658184,
     "assured" nil}}},
  "timestamp" 1354804327896,
  "relativeTimestamp" 13415992377567}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35955, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35955}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838658184,
     "assured" nil}}},
  "timestamp" 1354804327925,
  "relativeTimestamp" 13416022110759}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35956, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35956}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586801776,
     "unreplied" nil}}},
  "timestamp" 1354804327959,
  "relativeTimestamp" 13416055408902}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35956, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35956}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586801776}}},
  "timestamp" 1354804327991,
  "relativeTimestamp" 13416087441379}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35956, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35956}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586801776,
     "assured" nil}}},
  "timestamp" 1354804328022,
  "relativeTimestamp" 13416118534677}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35956, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35956}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 586801776,
     "assured" nil}}},
  "timestamp" 1354804330298,
  "relativeTimestamp" 13418395036890}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35956, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35956}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 586801776,
     "assured" nil}}},
  "timestamp" 1354804330325,
  "relativeTimestamp" 13418421328777}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35956, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35956}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 586801776,
     "assured" nil}}},
  "timestamp" 1354804330350,
  "relativeTimestamp" 13418446363601}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35957, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35957}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586803024,
     "unreplied" nil}}},
  "timestamp" 1354804330375,
  "relativeTimestamp" 13418471900055}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35957, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35957}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586803024}}},
  "timestamp" 1354804330399,
  "relativeTimestamp" 13418495524591}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35957, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35957}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586803024,
     "assured" nil}}},
  "timestamp" 1354804330422,
  "relativeTimestamp" 13418518823361}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35957, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35957}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 586803024,
     "assured" nil}}},
  "timestamp" 1354804333153,
  "relativeTimestamp" 13421249398365}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35957, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35957}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 586803024,
     "assured" nil}}},
  "timestamp" 1354804333185,
  "relativeTimestamp" 13421281973304}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35957, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35957}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 586803024,
     "assured" nil}}},
  "timestamp" 1354804333215,
  "relativeTimestamp" 13421312231783}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35958, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35958}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812461416,
     "unreplied" nil}}},
  "timestamp" 1354804333245,
  "relativeTimestamp" 13421341590415}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35958, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35958}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812461416}}},
  "timestamp" 1354804333269,
  "relativeTimestamp" 13421365782361}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35958, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35958}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812461416,
     "assured" nil}}},
  "timestamp" 1354804333298,
  "relativeTimestamp" 13421395042913}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35958, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35958}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812461416,
     "assured" nil}}},
  "timestamp" 1354804334752,
  "relativeTimestamp" 13422848510964}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35958, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35958}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812461416,
     "assured" nil}}},
  "timestamp" 1354804334777,
  "relativeTimestamp" 13422873915378}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35958, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35958}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812461416,
     "assured" nil}}},
  "timestamp" 1354804334808,
  "relativeTimestamp" 13422905210149}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35959, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35959}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838657872,
     "unreplied" nil}}},
  "timestamp" 1354804334842,
  "relativeTimestamp" 13422939021759}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35959, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35959}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838657872}}},
  "timestamp" 1354804334871,
  "relativeTimestamp" 13422968070090}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35959, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35959}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838657872,
     "assured" nil}}},
  "timestamp" 1354804334897,
  "relativeTimestamp" 13422993896362}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35959, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35959}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838657872,
     "assured" nil}}},
  "timestamp" 1354804336487,
  "relativeTimestamp" 13424583312121}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35960, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35960}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838656936,
     "unreplied" nil}}},
  "timestamp" 1354804336516,
  "relativeTimestamp" 13424612625320}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35960, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35960}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838656936}}},
  "timestamp" 1354804336545,
  "relativeTimestamp" 13424641964381}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35960, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35960}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838656936,
     "assured" nil}}},
  "timestamp" 1354804336568,
  "relativeTimestamp" 13424664907683}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35959, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35959}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 838657872,
     "assured" nil}}},
  "timestamp" 1354804336597,
  "relativeTimestamp" 13424694133745}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35959, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35959}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 838657872, "assured" nil}}},
  "timestamp" 1354804338420,
  "relativeTimestamp" 13426516603937}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35960, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35960}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838656936,
     "assured" nil}}},
  "timestamp" 1354804338495,
  "relativeTimestamp" 13426591555094}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35960, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35960}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838656936,
     "assured" nil}}},
  "timestamp" 1354804338523,
  "relativeTimestamp" 13426619689003}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35960, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35960}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838656936,
     "assured" nil}}},
  "timestamp" 1354804338550,
  "relativeTimestamp" 13426646995007}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35961, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35961}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812464848,
     "unreplied" nil}}},
  "timestamp" 1354804338576,
  "relativeTimestamp" 13426672891329}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35961, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35961}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812464848}}},
  "timestamp" 1354804338601,
  "relativeTimestamp" 13426697867808}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35961, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35961}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812464848,
     "assured" nil}}},
  "timestamp" 1354804338625,
  "relativeTimestamp" 13426722278590}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35961, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35961}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812464848,
     "assured" nil}}},
  "timestamp" 1354804340444,
  "relativeTimestamp" 13428540524385}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35962, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35962}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812462040,
     "unreplied" nil}}},
  "timestamp" 1354804340468,
  "relativeTimestamp" 13428564467903}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35962, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35962}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812462040}}},
  "timestamp" 1354804340491,
  "relativeTimestamp" 13428587475126}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35962, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35962}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812462040,
     "assured" nil}}},
  "timestamp" 1354804340514,
  "relativeTimestamp" 13428611125333}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35961, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35961}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 812464848,
     "assured" nil}}},
  "timestamp" 1354804340541,
  "relativeTimestamp" 13428637371864}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35961, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35961}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 812464848, "assured" nil}}},
  "timestamp" 1354804342592,
  "relativeTimestamp" 13430688979486}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35962, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35962}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812462040,
     "assured" nil}}},
  "timestamp" 1354804342670,
  "relativeTimestamp" 13430767091667}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35963, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35963}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838657248,
     "unreplied" nil}}},
  "timestamp" 1354804342695,
  "relativeTimestamp" 13430791632174}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35963, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35963}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838657248}}},
  "timestamp" 1354804342716,
  "relativeTimestamp" 13430813244532}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35963, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35963}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838657248,
     "assured" nil}}},
  "timestamp" 1354804342737,
  "relativeTimestamp" 13430834286541}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35962, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35962}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 812462040,
     "assured" nil}}},
  "timestamp" 1354804342759,
  "relativeTimestamp" 13430856064509}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 59777, "dport" 445}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 445, "dport" 59777}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 433562,
     "id" 586802400,
     "unreplied" nil}}},
  "timestamp" 1354804343170,
  "relativeTimestamp" 13431267038262}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 59777, "dport" 445}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 445, "dport" 59777}},
    "independent" {"timeout" 432000, "id" 586802400}}},
  "timestamp" 1354804343198,
  "relativeTimestamp" 13431294381960}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 59777, "dport" 445}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 445, "dport" 59777}},
    "independent" {"timeout" 432000, "id" 586802400, "assured" nil}}},
  "timestamp" 1354804343221,
  "relativeTimestamp" 13431318018674}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35962, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35962}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 812462040, "assured" nil}}},
  "timestamp" 1354804345429,
  "relativeTimestamp" 13433525404395}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35963, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35963}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838657248,
     "assured" nil}}},
  "timestamp" 1354804345503,
  "relativeTimestamp" 13433600040581}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35963, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35963}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838657248,
     "assured" nil}}},
  "timestamp" 1354804345528,
  "relativeTimestamp" 13433624744016}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35963, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35963}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838657248,
     "assured" nil}}},
  "timestamp" 1354804345549,
  "relativeTimestamp" 13433645740274}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35964, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35964}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838658496,
     "unreplied" nil}}},
  "timestamp" 1354804345578,
  "relativeTimestamp" 13433674531791}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35964, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35964}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838658496}}},
  "timestamp" 1354804345605,
  "relativeTimestamp" 13433701792204}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35964, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35964}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838658496,
     "assured" nil}}},
  "timestamp" 1354804345632,
  "relativeTimestamp" 13433729248723}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35964, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35964}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838658496,
     "assured" nil}}},
  "timestamp" 1354804347080,
  "relativeTimestamp" 13435176855320}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35964, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35964}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838658496,
     "assured" nil}}},
  "timestamp" 1354804347107,
  "relativeTimestamp" 13435204065297}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35964, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35964}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838658496,
     "assured" nil}}},
  "timestamp" 1354804347136,
  "relativeTimestamp" 13435232855265}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35965, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35965}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134187456,
     "unreplied" nil}}},
  "timestamp" 1354804347165,
  "relativeTimestamp" 13435261714764}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35965, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35965}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134187456}}},
  "timestamp" 1354804347200,
  "relativeTimestamp" 13435297176824}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35965, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35965}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134187456,
     "assured" nil}}},
  "timestamp" 1354804347225,
  "relativeTimestamp" 13435321744851}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35959, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35959}},
    "independent" {"id" 838657872, "assured" nil}}},
  "timestamp" 1354804348418,
  "relativeTimestamp" 13436514990243}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "205.188.10.221"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 39424, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "205.188.10.221",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 39424}},
    "independent" {"timeout" 300, "id" 586804896, "assured" nil}}},
  "timestamp" 1354804349079,
  "relativeTimestamp" 13437175490220}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "64.12.30.49"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 50280, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "64.12.30.49",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 50280}},
    "independent" {"timeout" 300, "id" 586802088, "assured" nil}}},
  "timestamp" 1354804349103,
  "relativeTimestamp" 13437199814764}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35965, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35965}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134187456,
     "assured" nil}}},
  "timestamp" 1354804349133,
  "relativeTimestamp" 13437229407203}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35965, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35965}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134187456,
     "assured" nil}}},
  "timestamp" 1354804349157,
  "relativeTimestamp" 13437254173517}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35965, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35965}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 134187456,
     "assured" nil}}},
  "timestamp" 1354804349181,
  "relativeTimestamp" 13437277489558}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35966, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35966}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134192448,
     "unreplied" nil}}},
  "timestamp" 1354804349205,
  "relativeTimestamp" 13437301640470}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35966, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35966}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134192448}}},
  "timestamp" 1354804349233,
  "relativeTimestamp" 13437330264304}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35966, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35966}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134192448,
     "assured" nil}}},
  "timestamp" 1354804349265,
  "relativeTimestamp" 13437361851400}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35966, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35966}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134192448,
     "assured" nil}}},
  "timestamp" 1354804351119,
  "relativeTimestamp" 13439216146238}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35966, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35966}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134192448,
     "assured" nil}}},
  "timestamp" 1354804351144,
  "relativeTimestamp" 13439240539326}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35966, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35966}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 134192448,
     "assured" nil}}},
  "timestamp" 1354804351170,
  "relativeTimestamp" 13439266617838}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35967, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35967}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838656312,
     "unreplied" nil}}},
  "timestamp" 1354804351195,
  "relativeTimestamp" 13439292051674}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35967, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35967}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838656312}}},
  "timestamp" 1354804351216,
  "relativeTimestamp" 13439313185582}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35967, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35967}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838656312,
     "assured" nil}}},
  "timestamp" 1354804351239,
  "relativeTimestamp" 13439335547179}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35961, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35961}},
    "independent" {"id" 812464848, "assured" nil}}},
  "timestamp" 1354804352591,
  "relativeTimestamp" 13440688170962}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35967, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35967}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838656312,
     "assured" nil}}},
  "timestamp" 1354804353050,
  "relativeTimestamp" 13441146600270}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35967, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35967}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838656312,
     "assured" nil}}},
  "timestamp" 1354804353079,
  "relativeTimestamp" 13441176092175}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35967, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35967}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838656312,
     "assured" nil}}},
  "timestamp" 1354804353107,
  "relativeTimestamp" 13441203866580}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35968, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35968}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812461728,
     "unreplied" nil}}},
  "timestamp" 1354804353135,
  "relativeTimestamp" 13441232106796}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35968, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35968}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812461728}}},
  "timestamp" 1354804353163,
  "relativeTimestamp" 13441260121280}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35968, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35968}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812461728,
     "assured" nil}}},
  "timestamp" 1354804353190,
  "relativeTimestamp" 13441287227116}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35968, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35968}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812461728,
     "assured" nil}}},
  "timestamp" 1354804355257,
  "relativeTimestamp" 13443353932065}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35968, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35968}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812461728,
     "assured" nil}}},
  "timestamp" 1354804355295,
  "relativeTimestamp" 13443391819997}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35968, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35968}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812461728,
     "assured" nil}}},
  "timestamp" 1354804355325,
  "relativeTimestamp" 13443421842498}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35969, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35969}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586801464,
     "unreplied" nil}}},
  "timestamp" 1354804355352,
  "relativeTimestamp" 13443449061058}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35969, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35969}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586801464}}},
  "timestamp" 1354804355382,
  "relativeTimestamp" 13443478933088}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35969, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35969}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586801464,
     "assured" nil}}},
  "timestamp" 1354804355409,
  "relativeTimestamp" 13443505618860}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35962, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35962}},
    "independent" {"id" 812462040, "assured" nil}}},
  "timestamp" 1354804355431,
  "relativeTimestamp" 13443528229271}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35969, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35969}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 586801464,
     "assured" nil}}},
  "timestamp" 1354804356878,
  "relativeTimestamp" 13444974697813}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35969, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35969}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 586801464,
     "assured" nil}}},
  "timestamp" 1354804356913,
  "relativeTimestamp" 13445009800621}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35969, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35969}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 586801464,
     "assured" nil}}},
  "timestamp" 1354804356943,
  "relativeTimestamp" 13445039459868}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35970, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35970}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838656624,
     "unreplied" nil}}},
  "timestamp" 1354804356973,
  "relativeTimestamp" 13445069837312}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35970, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35970}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838656624}}},
  "timestamp" 1354804357004,
  "relativeTimestamp" 13445100878779}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35970, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35970}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838656624,
     "assured" nil}}},
  "timestamp" 1354804357028,
  "relativeTimestamp" 13445124747231}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 59148, "dport" 631}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 631, "dport" 59148}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838657872,
     "unreplied" nil}}},
  "timestamp" 1354804357875,
  "relativeTimestamp" 13445971544539}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35970, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35970}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838656624,
     "assured" nil}}},
  "timestamp" 1354804358632,
  "relativeTimestamp" 13446728740337}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35970, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35970}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838656624,
     "assured" nil}}},
  "timestamp" 1354804358654,
  "relativeTimestamp" 13446750762964}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35970, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35970}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838656624,
     "assured" nil}}},
  "timestamp" 1354804358674,
  "relativeTimestamp" 13446770916487}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35972, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35972}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812462664,
     "unreplied" nil}}},
  "timestamp" 1354804358694,
  "relativeTimestamp" 13446790914095}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35972, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35972}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812462664}}},
  "timestamp" 1354804358714,
  "relativeTimestamp" 13446810976930}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35972, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35972}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812462664,
     "assured" nil}}},
  "timestamp" 1354804358734,
  "relativeTimestamp" 13446830559951}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35972, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35972}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812462664,
     "assured" nil}}},
  "timestamp" 1354804360660,
  "relativeTimestamp" 13448756907500}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35972, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35972}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812462664,
     "assured" nil}}},
  "timestamp" 1354804360684,
  "relativeTimestamp" 13448780692013}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35972, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35972}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812462664,
     "assured" nil}}},
  "timestamp" 1354804360705,
  "relativeTimestamp" 13448801300720}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35973, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35973}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134188392,
     "unreplied" nil}}},
  "timestamp" 1354804360725,
  "relativeTimestamp" 13448822222268}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35973, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35973}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134188392}}},
  "timestamp" 1354804360746,
  "relativeTimestamp" 13448843048481}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35973, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35973}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134188392,
     "assured" nil}}},
  "timestamp" 1354804360765,
  "relativeTimestamp" 13448862208546}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "213.239.200.187"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 48545, "dport" 5222}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "213.239.200.187",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 5222, "dport" 48545}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134186832,
     "assured" nil}}},
  "timestamp" 1354804361955,
  "relativeTimestamp" 13450052189333}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "213.239.200.187"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 48545, "dport" 5222}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "213.239.200.187",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 5222, "dport" 48545}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 134186832,
     "assured" nil}}},
  "timestamp" 1354804361986,
  "relativeTimestamp" 13450082727625}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "213.239.200.187"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 48545, "dport" 5222}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "213.239.200.187",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 5222, "dport" 48545}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134186832,
     "assured" nil}}},
  "timestamp" 1354804362011,
  "relativeTimestamp" 13450107651067}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "213.239.200.187"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 48545, "dport" 5222}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "213.239.200.187",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 5222, "dport" 48545}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 134186832, "assured" nil}}},
  "timestamp" 1354804362037,
  "relativeTimestamp" 13450134078045}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35973, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35973}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134188392,
     "assured" nil}}},
  "timestamp" 1354804362630,
  "relativeTimestamp" 13450726368447}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35974, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35974}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586806768,
     "unreplied" nil}}},
  "timestamp" 1354804362654,
  "relativeTimestamp" 13450750854588}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35974, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35974}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586806768}}},
  "timestamp" 1354804362680,
  "relativeTimestamp" 13450776532059}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35974, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35974}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586806768,
     "assured" nil}}},
  "timestamp" 1354804362706,
  "relativeTimestamp" 13450802311305}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35973, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35973}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 134188392,
     "assured" nil}}},
  "timestamp" 1354804362729,
  "relativeTimestamp" 13450825704634}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35973, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35973}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 134188392, "assured" nil}}},
  "timestamp" 1354804364799,
  "relativeTimestamp" 13452895301534}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35974, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35974}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 586806768,
     "assured" nil}}},
  "timestamp" 1354804364872,
  "relativeTimestamp" 13452968874406}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35974, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35974}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 586806768,
     "assured" nil}}},
  "timestamp" 1354804364902,
  "relativeTimestamp" 13452998991495}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35974, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35974}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 586806768,
     "assured" nil}}},
  "timestamp" 1354804364929,
  "relativeTimestamp" 13453025776807}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35975, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35975}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838661616,
     "unreplied" nil}}},
  "timestamp" 1354804364952,
  "relativeTimestamp" 13453048721738}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35975, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35975}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838661616}}},
  "timestamp" 1354804364972,
  "relativeTimestamp" 13453069131101}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35975, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35975}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838661616,
     "assured" nil}}},
  "timestamp" 1354804364992,
  "relativeTimestamp" 13453088622157}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35975, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35975}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838661616,
     "assured" nil}}},
  "timestamp" 1354804367057,
  "relativeTimestamp" 13455153835101}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35975, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35975}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838661616,
     "assured" nil}}},
  "timestamp" 1354804367083,
  "relativeTimestamp" 13455179751744}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35975, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35975}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838661616,
     "assured" nil}}},
  "timestamp" 1354804367107,
  "relativeTimestamp" 13455204243820}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35976, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35976}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838659120,
     "unreplied" nil}}},
  "timestamp" 1354804367130,
  "relativeTimestamp" 13455226618856}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35976, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35976}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838659120}}},
  "timestamp" 1354804367154,
  "relativeTimestamp" 13455250311908}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35976, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35976}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838659120,
     "assured" nil}}},
  "timestamp" 1354804367177,
  "relativeTimestamp" 13455273623930}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35976, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35976}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838659120,
     "assured" nil}}},
  "timestamp" 1354804369519,
  "relativeTimestamp" 13457616044882}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35976, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35976}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838659120,
     "assured" nil}}},
  "timestamp" 1354804369543,
  "relativeTimestamp" 13457639435612}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35976, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35976}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838659120,
     "assured" nil}}},
  "timestamp" 1354804369564,
  "relativeTimestamp" 13457660426799}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35977, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35977}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586804272,
     "unreplied" nil}}},
  "timestamp" 1354804369583,
  "relativeTimestamp" 13457679467051}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35977, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35977}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586804272}}},
  "timestamp" 1354804369607,
  "relativeTimestamp" 13457703982959}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35977, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35977}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586804272,
     "assured" nil}}},
  "timestamp" 1354804369631,
  "relativeTimestamp" 13457727793885}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35977, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35977}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 119,
     "id" 586804272,
     "assured" nil}}},
  "timestamp" 1354804371055,
  "relativeTimestamp" 13459152194398}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35977, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35977}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 586804272,
     "assured" nil}}},
  "timestamp" 1354804371081,
  "relativeTimestamp" 13459177315763}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35977, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35977}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 586804272,
     "assured" nil}}},
  "timestamp" 1354804371101,
  "relativeTimestamp" 13459197512192}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35978, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35978}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812465472,
     "unreplied" nil}}},
  "timestamp" 1354804371124,
  "relativeTimestamp" 13459220956956}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35978, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35978}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812465472}}},
  "timestamp" 1354804371149,
  "relativeTimestamp" 13459245868285}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35978, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35978}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812465472,
     "assured" nil}}},
  "timestamp" 1354804371177,
  "relativeTimestamp" 13459273482035}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "213.239.200.187"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 48545, "dport" 5222}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "213.239.200.187",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 5222, "dport" 48545}},
    "independent" {"id" 134186832, "assured" nil}}},
  "timestamp" 1354804371966,
  "relativeTimestamp" 13460062607637}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35978, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35978}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812465472,
     "assured" nil}}},
  "timestamp" 1354804373069,
  "relativeTimestamp" 13461166037424}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35978, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35978}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812465472,
     "assured" nil}}},
  "timestamp" 1354804373093,
  "relativeTimestamp" 13461189875023}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35978, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35978}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812465472,
     "assured" nil}}},
  "timestamp" 1354804373112,
  "relativeTimestamp" 13461208708134}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35979, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35979}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838660680,
     "unreplied" nil}}},
  "timestamp" 1354804373131,
  "relativeTimestamp" 13461227509669}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35979, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35979}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838660680}}},
  "timestamp" 1354804373150,
  "relativeTimestamp" 13461246705101}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35979, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35979}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838660680,
     "assured" nil}}},
  "timestamp" 1354804373169,
  "relativeTimestamp" 13461265913882}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35973, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35973}},
    "independent" {"id" 134188392, "assured" nil}}},
  "timestamp" 1354804374798,
  "relativeTimestamp" 13462894627630}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35979, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35979}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838660680,
     "assured" nil}}},
  "timestamp" 1354804375689,
  "relativeTimestamp" 13463785927284}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35979, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35979}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838660680,
     "assured" nil}}},
  "timestamp" 1354804375713,
  "relativeTimestamp" 13463810274739}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35979, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35979}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838660680,
     "assured" nil}}},
  "timestamp" 1354804375733,
  "relativeTimestamp" 13463829897336}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35980, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35980}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812463912,
     "unreplied" nil}}},
  "timestamp" 1354804375754,
  "relativeTimestamp" 13463850610331}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35980, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35980}},
    "independent" {"state" "SYN_RECV", "timeout" 59, "id" 812463912}}},
  "timestamp" 1354804375781,
  "relativeTimestamp" 13463877771010}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35980, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35980}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812463912,
     "assured" nil}}},
  "timestamp" 1354804375806,
  "relativeTimestamp" 13463902456555}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 45889, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 45889}},
    "independent" {"timeout" 30, "id" 586804584, "unreplied" nil}}},
  "timestamp" 1354804375831,
  "relativeTimestamp" 13463927983747}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 45889, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 45889}},
    "independent" {"timeout" 30, "id" 586804584}}},
  "timestamp" 1354804375853,
  "relativeTimestamp" 13463949600611}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 50566, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 50566}},
    "independent" {"timeout" 30, "id" 812458920, "unreplied" nil}}},
  "timestamp" 1354804375876,
  "relativeTimestamp" 13463972420355}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 50566, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 50566}},
    "independent" {"timeout" 29, "id" 812458920}}},
  "timestamp" 1354804375900,
  "relativeTimestamp" 13463996347911}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 50566, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 50566}},
    "independent" {"timeout" 180, "id" 812458920, "assured" nil}}},
  "timestamp" 1354804375923,
  "relativeTimestamp" 13464019711959}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "213.239.200.187"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 49165, "dport" 5222}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "213.239.200.187",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 5222, "dport" 49165}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812462976,
     "unreplied" nil}}},
  "timestamp" 1354804375947,
  "relativeTimestamp" 13464044292609}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "213.239.200.187"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 49165, "dport" 5222}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "213.239.200.187",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 5222, "dport" 49165}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812462976}}},
  "timestamp" 1354804375966,
  "relativeTimestamp" 13464062999120}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "213.239.200.187"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 49165, "dport" 5222}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "213.239.200.187",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 5222, "dport" 49165}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812462976,
     "assured" nil}}},
  "timestamp" 1354804375985,
  "relativeTimestamp" 13464082137916}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35980, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35980}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812463912,
     "assured" nil}}},
  "timestamp" 1354804377715,
  "relativeTimestamp" 13465811563370}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35980, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35980}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812463912,
     "assured" nil}}},
  "timestamp" 1354804377734,
  "relativeTimestamp" 13465831292718}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35980, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35980}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812463912,
     "assured" nil}}},
  "timestamp" 1354804377753,
  "relativeTimestamp" 13465849926248}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35982, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35982}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838658808,
     "unreplied" nil}}},
  "timestamp" 1354804377774,
  "relativeTimestamp" 13465870458314}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35982, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35982}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838658808}}},
  "timestamp" 1354804377792,
  "relativeTimestamp" 13465889139565}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35982, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35982}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838658808,
     "assured" nil}}},
  "timestamp" 1354804377810,
  "relativeTimestamp" 13465907152736}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35982, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35982}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838658808,
     "assured" nil}}},
  "timestamp" 1354804380018,
  "relativeTimestamp" 13468115255381}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35982, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35982}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838658808,
     "assured" nil}}},
  "timestamp" 1354804380040,
  "relativeTimestamp" 13468136766769}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35982, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35982}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838658808,
     "assured" nil}}},
  "timestamp" 1354804380061,
  "relativeTimestamp" 13468157830919}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35983, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35983}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812462352,
     "unreplied" nil}}},
  "timestamp" 1354804380083,
  "relativeTimestamp" 13468180229868}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35983, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35983}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812462352}}},
  "timestamp" 1354804380104,
  "relativeTimestamp" 13468200729760}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35983, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35983}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812462352,
     "assured" nil}}},
  "timestamp" 1354804380123,
  "relativeTimestamp" 13468220242611}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35983, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35983}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812462352,
     "assured" nil}}},
  "timestamp" 1354804381597,
  "relativeTimestamp" 13469693628740}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35983, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35983}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812462352,
     "assured" nil}}},
  "timestamp" 1354804381625,
  "relativeTimestamp" 13469721501746}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35983, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35983}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812462352,
     "assured" nil}}},
  "timestamp" 1354804381649,
  "relativeTimestamp" 13469745429686}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35984, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35984}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134191200,
     "unreplied" nil}}},
  "timestamp" 1354804381675,
  "relativeTimestamp" 13469772067375}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35984, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35984}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134191200}}},
  "timestamp" 1354804381702,
  "relativeTimestamp" 13469798303147}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35984, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35984}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134191200,
     "assured" nil}}},
  "timestamp" 1354804381721,
  "relativeTimestamp" 13469818054366}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35984, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35984}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134191200,
     "assured" nil}}},
  "timestamp" 1354804383450,
  "relativeTimestamp" 13471546676805}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35984, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35984}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134191200,
     "assured" nil}}},
  "timestamp" 1354804383471,
  "relativeTimestamp" 13471567711079}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35984, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35984}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 134191200,
     "assured" nil}}},
  "timestamp" 1354804383490,
  "relativeTimestamp" 13471587156102}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35985, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35985}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812460168,
     "unreplied" nil}}},
  "timestamp" 1354804383510,
  "relativeTimestamp" 13471606825193}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35985, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35985}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812460168}}},
  "timestamp" 1354804383529,
  "relativeTimestamp" 13471625368768}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35985, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35985}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812460168,
     "assured" nil}}},
  "timestamp" 1354804383546,
  "relativeTimestamp" 13471642987960}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35985, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35985}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812460168,
     "assured" nil}}},
  "timestamp" 1354804385245,
  "relativeTimestamp" 13473342291110}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35985, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35985}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812460168,
     "assured" nil}}},
  "timestamp" 1354804385267,
  "relativeTimestamp" 13473363981368}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35985, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35985}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812460168,
     "assured" nil}}},
  "timestamp" 1354804385287,
  "relativeTimestamp" 13473383427809}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35986, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35986}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838660056,
     "unreplied" nil}}},
  "timestamp" 1354804385305,
  "relativeTimestamp" 13473401561189}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35986, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35986}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838660056}}},
  "timestamp" 1354804385324,
  "relativeTimestamp" 13473420351775}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35986, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35986}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838660056,
     "assured" nil}}},
  "timestamp" 1354804385341,
  "relativeTimestamp" 13473437825715}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 55350, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 55350}},
    "independent" {"timeout" 30, "id" 812464536, "unreplied" nil}}},
  "timestamp" 1354804387454,
  "relativeTimestamp" 13475551289860}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 55350, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 55350}},
    "independent" {"timeout" 30, "id" 812464536}}},
  "timestamp" 1354804387474,
  "relativeTimestamp" 13475570382953}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35986, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35986}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838660056,
     "assured" nil}}},
  "timestamp" 1354804387645,
  "relativeTimestamp" 13475741402788}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35986, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35986}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838660056,
     "assured" nil}}},
  "timestamp" 1354804387665,
  "relativeTimestamp" 13475762281722}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35986, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35986}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838660056,
     "assured" nil}}},
  "timestamp" 1354804387685,
  "relativeTimestamp" 13475782051646}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35987, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35987}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838659432,
     "unreplied" nil}}},
  "timestamp" 1354804387705,
  "relativeTimestamp" 13475801795865}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35987, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35987}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838659432}}},
  "timestamp" 1354804387724,
  "relativeTimestamp" 13475821219474}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35987, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35987}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838659432,
     "assured" nil}}},
  "timestamp" 1354804387748,
  "relativeTimestamp" 13475844754452}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35987, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35987}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838659432,
     "assured" nil}}},
  "timestamp" 1354804389664,
  "relativeTimestamp" 13477761158159}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35987, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35987}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838659432,
     "assured" nil}}},
  "timestamp" 1354804389685,
  "relativeTimestamp" 13477781965547}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35987, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35987}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838659432,
     "assured" nil}}},
  "timestamp" 1354804389704,
  "relativeTimestamp" 13477800496137}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35988, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35988}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134188704,
     "unreplied" nil}}},
  "timestamp" 1354804389723,
  "relativeTimestamp" 13477819333028}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35988, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35988}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134188704}}},
  "timestamp" 1354804389745,
  "relativeTimestamp" 13477841415927}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35988, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35988}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134188704,
     "assured" nil}}},
  "timestamp" 1354804389762,
  "relativeTimestamp" 13477858683688}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35988, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35988}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134188704,
     "assured" nil}}},
  "timestamp" 1354804391948,
  "relativeTimestamp" 13480044311645}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35989, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35989}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838663800,
     "unreplied" nil}}},
  "timestamp" 1354804391971,
  "relativeTimestamp" 13480067464214}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35989, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35989}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838663800}}},
  "timestamp" 1354804391995,
  "relativeTimestamp" 13480091352654}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35989, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35989}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838663800,
     "assured" nil}}},
  "timestamp" 1354804392019,
  "relativeTimestamp" 13480115349182}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35988, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35988}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 134188704,
     "assured" nil}}},
  "timestamp" 1354804392042,
  "relativeTimestamp" 13480139143399}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35988, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35988}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 134188704, "assured" nil}}},
  "timestamp" 1354804393430,
  "relativeTimestamp" 13481526394795}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35989, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35989}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838663800,
     "assured" nil}}},
  "timestamp" 1354804393504,
  "relativeTimestamp" 13481601206525}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35989, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35989}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838663800,
     "assured" nil}}},
  "timestamp" 1354804393526,
  "relativeTimestamp" 13481622697530}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35989, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35989}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838663800,
     "assured" nil}}},
  "timestamp" 1354804393544,
  "relativeTimestamp" 13481641164569}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35990, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35990}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838660992,
     "unreplied" nil}}},
  "timestamp" 1354804393564,
  "relativeTimestamp" 13481661252187}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35990, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35990}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838660992}}},
  "timestamp" 1354804393590,
  "relativeTimestamp" 13481686435812}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35990, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35990}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838660992,
     "assured" nil}}},
  "timestamp" 1354804393612,
  "relativeTimestamp" 13481708682263}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35990, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35990}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838660992,
     "assured" nil}}},
  "timestamp" 1354804395337,
  "relativeTimestamp" 13483433625057}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35990, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35990}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838660992,
     "assured" nil}}},
  "timestamp" 1354804395359,
  "relativeTimestamp" 13483456132045}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35990, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35990}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838660992,
     "assured" nil}}},
  "timestamp" 1354804395382,
  "relativeTimestamp" 13483478922308}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35991, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35991}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586807704,
     "unreplied" nil}}},
  "timestamp" 1354804395401,
  "relativeTimestamp" 13483498117533}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35991, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35991}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586807704}}},
  "timestamp" 1354804395423,
  "relativeTimestamp" 13483519457639}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35991, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35991}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586807704,
     "assured" nil}}},
  "timestamp" 1354804395446,
  "relativeTimestamp" 13483542565645}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35991, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35991}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 586807704,
     "assured" nil}}},
  "timestamp" 1354804397113,
  "relativeTimestamp" 13485209604200}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35992, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35992}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134190888,
     "unreplied" nil}}},
  "timestamp" 1354804397136,
  "relativeTimestamp" 13485232518266}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35992, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35992}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134190888}}},
  "timestamp" 1354804397160,
  "relativeTimestamp" 13485257025915}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35992, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35992}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134190888,
     "assured" nil}}},
  "timestamp" 1354804397185,
  "relativeTimestamp" 13485281833567}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35991, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35991}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 586807704,
     "assured" nil}}},
  "timestamp" 1354804397209,
  "relativeTimestamp" 13485305925367}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35991, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35991}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 586807704, "assured" nil}}},
  "timestamp" 1354804399949,
  "relativeTimestamp" 13488046260386}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35992, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35992}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134190888,
     "assured" nil}}},
  "timestamp" 1354804400026,
  "relativeTimestamp" 13488123081347}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35992, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35992}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134190888,
     "assured" nil}}},
  "timestamp" 1354804400052,
  "relativeTimestamp" 13488149240603}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35992, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35992}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 134190888,
     "assured" nil}}},
  "timestamp" 1354804400070,
  "relativeTimestamp" 13488166818496}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35993, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35993}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812463288,
     "unreplied" nil}}},
  "timestamp" 1354804400088,
  "relativeTimestamp" 13488184435051}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35993, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35993}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812463288}}},
  "timestamp" 1354804400106,
  "relativeTimestamp" 13488202422482}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35993, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35993}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812463288,
     "assured" nil}}},
  "timestamp" 1354804400124,
  "relativeTimestamp" 13488220881177}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35993, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35993}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812463288,
     "assured" nil}}},
  "timestamp" 1354804401683,
  "relativeTimestamp" 13489779455698}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35993, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35993}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812463288,
     "assured" nil}}},
  "timestamp" 1354804401705,
  "relativeTimestamp" 13489801359663}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35993, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35993}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812463288,
     "assured" nil}}},
  "timestamp" 1354804401722,
  "relativeTimestamp" 13489819006657}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35994, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35994}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586808016,
     "unreplied" nil}}},
  "timestamp" 1354804401741,
  "relativeTimestamp" 13489838219858}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35994, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35994}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586808016}}},
  "timestamp" 1354804401759,
  "relativeTimestamp" 13489856234684}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35994, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35994}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586808016,
     "assured" nil}}},
  "timestamp" 1354804401778,
  "relativeTimestamp" 13489874557440}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "194.95.81.200"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 34351, "dport" 143}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "194.95.81.200",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 143, "dport" 34351}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 433503,
     "id" 838663488,
     "unreplied" nil}}},
  "timestamp" 1354804402140,
  "relativeTimestamp" 13490237200587}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "194.95.81.200"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 34351, "dport" 143}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "194.95.81.200",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 143, "dport" 34351}},
    "independent" {"timeout" 432000, "id" 838663488}}},
  "timestamp" 1354804402183,
  "relativeTimestamp" 13490279770619}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35988, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35988}},
    "independent" {"id" 134188704, "assured" nil}}},
  "timestamp" 1354804403428,
  "relativeTimestamp" 13491525123689}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35994, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35994}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 586808016,
     "assured" nil}}},
  "timestamp" 1354804403950,
  "relativeTimestamp" 13492046936841}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35994, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35994}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 586808016,
     "assured" nil}}},
  "timestamp" 1354804403974,
  "relativeTimestamp" 13492070929780}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35994, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35994}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 586808016,
     "assured" nil}}},
  "timestamp" 1354804403994,
  "relativeTimestamp" 13492090390893}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35995, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35995}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838660368,
     "unreplied" nil}}},
  "timestamp" 1354804404011,
  "relativeTimestamp" 13492108118059}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35995, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35995}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838660368}}},
  "timestamp" 1354804404031,
  "relativeTimestamp" 13492127393966}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35995, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35995}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838660368,
     "assured" nil}}},
  "timestamp" 1354804404050,
  "relativeTimestamp" 13492146966384}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35995, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35995}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838660368,
     "assured" nil}}},
  "timestamp" 1354804405824,
  "relativeTimestamp" 13493920639262}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35996, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35996}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812464224,
     "unreplied" nil}}},
  "timestamp" 1354804405848,
  "relativeTimestamp" 13493944368386}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35996, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35996}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812464224}}},
  "timestamp" 1354804405872,
  "relativeTimestamp" 13493969000093}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35996, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35996}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812464224,
     "assured" nil}}},
  "timestamp" 1354804405896,
  "relativeTimestamp" 13493992996362}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 45889, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 45889}},
    "independent" {"id" 586804584}}},
  "timestamp" 1354804405919,
  "relativeTimestamp" 13494015743855}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35995, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35995}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 838660368,
     "assured" nil}}},
  "timestamp" 1354804405941,
  "relativeTimestamp" 13494037511723}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35995, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35995}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 838660368, "assured" nil}}},
  "timestamp" 1354804407562,
  "relativeTimestamp" 13495658495278}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35996, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35996}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812464224,
     "assured" nil}}},
  "timestamp" 1354804407646,
  "relativeTimestamp" 13495743269127}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35997, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35997}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812465784,
     "unreplied" nil}}},
  "timestamp" 1354804407679,
  "relativeTimestamp" 13495775739471}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35997, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35997}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812465784}}},
  "timestamp" 1354804407704,
  "relativeTimestamp" 13495800751108}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35997, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35997}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812465784,
     "assured" nil}}},
  "timestamp" 1354804407730,
  "relativeTimestamp" 13495827032578}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35996, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35996}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 812464224,
     "assured" nil}}},
  "timestamp" 1354804407752,
  "relativeTimestamp" 13495848467930}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35991, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35991}},
    "independent" {"id" 586807704, "assured" nil}}},
  "timestamp" 1354804409948,
  "relativeTimestamp" 13498045098319}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35996, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35996}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 812464224, "assured" nil}}},
  "timestamp" 1354804409997,
  "relativeTimestamp" 13498093640353}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35997, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35997}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812465784,
     "assured" nil}}},
  "timestamp" 1354804410078,
  "relativeTimestamp" 13498174825335}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35998, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35998}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812463600,
     "unreplied" nil}}},
  "timestamp" 1354804410103,
  "relativeTimestamp" 13498199601595}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35998, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35998}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812463600}}},
  "timestamp" 1354804410124,
  "relativeTimestamp" 13498221135500}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35998, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35998}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812463600,
     "assured" nil}}},
  "timestamp" 1354804410143,
  "relativeTimestamp" 13498239317514}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35997, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35997}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 812465784,
     "assured" nil}}},
  "timestamp" 1354804410166,
  "relativeTimestamp" 13498262488251}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35997, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35997}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 812465784, "assured" nil}}},
  "timestamp" 1354804412026,
  "relativeTimestamp" 13500122832592}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35998, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35998}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812463600,
     "assured" nil}}},
  "timestamp" 1354804412107,
  "relativeTimestamp" 13500204126389}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35998, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35998}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812463600,
     "assured" nil}}},
  "timestamp" 1354804412127,
  "relativeTimestamp" 13500223537077}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35998, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35998}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812463600,
     "assured" nil}}},
  "timestamp" 1354804412146,
  "relativeTimestamp" 13500242752597}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35999, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35999}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134190264,
     "unreplied" nil}}},
  "timestamp" 1354804412167,
  "relativeTimestamp" 13500263380358}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35999, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35999}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134190264}}},
  "timestamp" 1354804412186,
  "relativeTimestamp" 13500282429302}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35999, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35999}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134190264,
     "assured" nil}}},
  "timestamp" 1354804412208,
  "relativeTimestamp" 13500304485983}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "194.95.81.200"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 34351, "dport" 143}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "194.95.81.200",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 143, "dport" 34351}},
    "independent" {"timeout" 432000, "id" 838663488, "assured" nil}}},
  "timestamp" 1354804412827,
  "relativeTimestamp" 13500924037547}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35999, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35999}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134190264,
     "assured" nil}}},
  "timestamp" 1354804413748,
  "relativeTimestamp" 13501845096411}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35999, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35999}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134190264,
     "assured" nil}}},
  "timestamp" 1354804413768,
  "relativeTimestamp" 13501865126629}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35999, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35999}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 134190264,
     "assured" nil}}},
  "timestamp" 1354804413788,
  "relativeTimestamp" 13501884561765}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36000, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36000}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838661304,
     "unreplied" nil}}},
  "timestamp" 1354804413805,
  "relativeTimestamp" 13501901895384}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36000, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36000}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838661304}}},
  "timestamp" 1354804413823,
  "relativeTimestamp" 13501919707415}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36000, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36000}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838661304,
     "assured" nil}}},
  "timestamp" 1354804413842,
  "relativeTimestamp" 13501938312878}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36000, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36000}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838661304,
     "assured" nil}}},
  "timestamp" 1354804415660,
  "relativeTimestamp" 13503757200375}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36000, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36000}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838661304,
     "assured" nil}}},
  "timestamp" 1354804415682,
  "relativeTimestamp" 13503778919857}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36000, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36000}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838661304,
     "assured" nil}}},
  "timestamp" 1354804415701,
  "relativeTimestamp" 13503797375156}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36001, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36001}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812462040,
     "unreplied" nil}}},
  "timestamp" 1354804415718,
  "relativeTimestamp" 13503814868714}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36001, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36001}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812462040}}},
  "timestamp" 1354804415736,
  "relativeTimestamp" 13503832995616}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36001, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36001}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812462040,
     "assured" nil}}},
  "timestamp" 1354804415756,
  "relativeTimestamp" 13503852878734}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 55350, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 55350}},
    "independent" {"id" 812464536}}},
  "timestamp" 1354804417464,
  "relativeTimestamp" 13505561071211}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36001, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36001}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812462040,
     "assured" nil}}},
  "timestamp" 1354804417513,
  "relativeTimestamp" 13505610240850}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36001, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36001}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812462040,
     "assured" nil}}},
  "timestamp" 1354804417540,
  "relativeTimestamp" 13505637093006}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36001, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36001}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812462040,
     "assured" nil}}},
  "timestamp" 1354804417557,
  "relativeTimestamp" 13505654256408}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36002, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36002}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838662240,
     "unreplied" nil}}},
  "timestamp" 1354804417576,
  "relativeTimestamp" 13505672717442}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36002, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36002}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838662240}}},
  "timestamp" 1354804417594,
  "relativeTimestamp" 13505690565009}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36002, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36002}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838662240,
     "assured" nil}}},
  "timestamp" 1354804417610,
  "relativeTimestamp" 13505707030140}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35995, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35995}},
    "independent" {"id" 838660368, "assured" nil}}},
  "timestamp" 1354804417630,
  "relativeTimestamp" 13505726541049}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36002, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36002}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838662240,
     "assured" nil}}},
  "timestamp" 1354804419307,
  "relativeTimestamp" 13507403298379}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36002, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36002}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838662240,
     "assured" nil}}},
  "timestamp" 1354804419329,
  "relativeTimestamp" 13507425899034}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36002, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36002}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838662240,
     "assured" nil}}},
  "timestamp" 1354804419353,
  "relativeTimestamp" 13507449653629}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36003, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36003}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838661928,
     "unreplied" nil}}},
  "timestamp" 1354804419375,
  "relativeTimestamp" 13507471875638}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36003, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36003}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838661928}}},
  "timestamp" 1354804419401,
  "relativeTimestamp" 13507497443708}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36003, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36003}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838661928,
     "assured" nil}}},
  "timestamp" 1354804419422,
  "relativeTimestamp" 13507518337170}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35996, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35996}},
    "independent" {"id" 812464224, "assured" nil}}},
  "timestamp" 1354804419992,
  "relativeTimestamp" 13508088440762}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35997, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35997}},
    "independent" {"id" 812465784, "assured" nil}}},
  "timestamp" 1354804422025,
  "relativeTimestamp" 13510122009034}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36003, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36003}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838661928,
     "assured" nil}}},
  "timestamp" 1354804422044,
  "relativeTimestamp" 13510140981246}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36003, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36003}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838661928,
     "assured" nil}}},
  "timestamp" 1354804422070,
  "relativeTimestamp" 13510166477838}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36003, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36003}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838661928,
     "assured" nil}}},
  "timestamp" 1354804422092,
  "relativeTimestamp" 13510188768340}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36004, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36004}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838662552,
     "unreplied" nil}}},
  "timestamp" 1354804422118,
  "relativeTimestamp" 13510214499024}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36004, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36004}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838662552}}},
  "timestamp" 1354804422140,
  "relativeTimestamp" 13510236660078}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36004, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36004}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838662552,
     "assured" nil}}},
  "timestamp" 1354804422163,
  "relativeTimestamp" 13510259749862}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36004, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36004}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838662552,
     "assured" nil}}},
  "timestamp" 1354804424056,
  "relativeTimestamp" 13512152756886}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36004, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36004}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838662552,
     "assured" nil}}},
  "timestamp" 1354804424076,
  "relativeTimestamp" 13512173134727}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36004, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36004}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838662552,
     "assured" nil}}},
  "timestamp" 1354804424095,
  "relativeTimestamp" 13512191741137}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36005, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36005}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134187768,
     "unreplied" nil}}},
  "timestamp" 1354804424114,
  "relativeTimestamp" 13512210935720}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36005, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36005}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134187768}}},
  "timestamp" 1354804424133,
  "relativeTimestamp" 13512229542572}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36005, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36005}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134187768,
     "assured" nil}}},
  "timestamp" 1354804424151,
  "relativeTimestamp" 13512248281955}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36005, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36005}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134187768,
     "assured" nil}}},
  "timestamp" 1354804425672,
  "relativeTimestamp" 13513769144214}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36005, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36005}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134187768,
     "assured" nil}}},
  "timestamp" 1354804425692,
  "relativeTimestamp" 13513789122569}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36005, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36005}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 134187768,
     "assured" nil}}},
  "timestamp" 1354804425711,
  "relativeTimestamp" 13513807716009}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36006, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36006}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586807704,
     "unreplied" nil}}},
  "timestamp" 1354804425729,
  "relativeTimestamp" 13513826151526}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36006, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36006}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586807704}}},
  "timestamp" 1354804425749,
  "relativeTimestamp" 13513845541117}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36006, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36006}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586807704,
     "assured" nil}}},
  "timestamp" 1354804425767,
  "relativeTimestamp" 13513863361017}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36006, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36006}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 586807704,
     "assured" nil}}},
  "timestamp" 1354804427564,
  "relativeTimestamp" 13515661103521}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36006, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36006}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 29,
     "id" 586807704,
     "assured" nil}}},
  "timestamp" 1354804427585,
  "relativeTimestamp" 13515681911852}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36006, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36006}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 586807704,
     "assured" nil}}},
  "timestamp" 1354804427602,
  "relativeTimestamp" 13515698988321}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36007, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36007}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586804584,
     "unreplied" nil}}},
  "timestamp" 1354804427621,
  "relativeTimestamp" 13515718034730}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36007, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36007}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586804584}}},
  "timestamp" 1354804427639,
  "relativeTimestamp" 13515735297827}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36007, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36007}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586804584,
     "assured" nil}}},
  "timestamp" 1354804427655,
  "relativeTimestamp" 13515751579699}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36007, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36007}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 586804584,
     "assured" nil}}},
  "timestamp" 1354804429399,
  "relativeTimestamp" 13517495840464}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36007, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36007}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 586804584,
     "assured" nil}}},
  "timestamp" 1354804429418,
  "relativeTimestamp" 13517515204519}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36007, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36007}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 586804584,
     "assured" nil}}},
  "timestamp" 1354804429437,
  "relativeTimestamp" 13517533297790}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36008, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36008}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838656000,
     "unreplied" nil}}},
  "timestamp" 1354804429453,
  "relativeTimestamp" 13517550210749}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36008, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36008}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838656000}}},
  "timestamp" 1354804429471,
  "relativeTimestamp" 13517567462762}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36008, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36008}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838656000,
     "assured" nil}}},
  "timestamp" 1354804429487,
  "relativeTimestamp" 13517583818172}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36008, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36008}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838656000,
     "assured" nil}}},
  "timestamp" 1354804431170,
  "relativeTimestamp" 13519266967905}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36008, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36008}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838656000,
     "assured" nil}}},
  "timestamp" 1354804431190,
  "relativeTimestamp" 13519286987061}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36008, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36008}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838656000,
     "assured" nil}}},
  "timestamp" 1354804431207,
  "relativeTimestamp" 13519304077868}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36009, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36009}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838663176,
     "unreplied" nil}}},
  "timestamp" 1354804431224,
  "relativeTimestamp" 13519320999262}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36009, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36009}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838663176}}},
  "timestamp" 1354804431241,
  "relativeTimestamp" 13519338289058}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36009, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36009}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838663176,
     "assured" nil}}},
  "timestamp" 1354804431258,
  "relativeTimestamp" 13519354776790}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35948, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35948}},
    "independent" {"id" 812460480, "assured" nil}}},
  "timestamp" 1354804432204,
  "relativeTimestamp" 13520300923884}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36009, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36009}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838663176,
     "assured" nil}}},
  "timestamp" 1354804433885,
  "relativeTimestamp" 13521981467034}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36009, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36009}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838663176,
     "assured" nil}}},
  "timestamp" 1354804433906,
  "relativeTimestamp" 13522003032736}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36009, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36009}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838663176,
     "assured" nil}}},
  "timestamp" 1354804433929,
  "relativeTimestamp" 13522025778376}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36010, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36010}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134186208,
     "unreplied" nil}}},
  "timestamp" 1354804433952,
  "relativeTimestamp" 13522049201595}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36010, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36010}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134186208}}},
  "timestamp" 1354804433974,
  "relativeTimestamp" 13522070607319}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36010, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36010}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134186208,
     "assured" nil}}},
  "timestamp" 1354804433990,
  "relativeTimestamp" 13522087183342}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35949, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35949}},
    "independent" {"id" 812465160, "assured" nil}}},
  "timestamp" 1354804434584,
  "relativeTimestamp" 13522680955823}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36010, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36010}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134186208,
     "assured" nil}}},
  "timestamp" 1354804435541,
  "relativeTimestamp" 13523638265318}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36010, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36010}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134186208,
     "assured" nil}}},
  "timestamp" 1354804435561,
  "relativeTimestamp" 13523658092620}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36010, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36010}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 134186208,
     "assured" nil}}},
  "timestamp" 1354804435578,
  "relativeTimestamp" 13523675145014}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36011, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36011}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812464848,
     "unreplied" nil}}},
  "timestamp" 1354804435595,
  "relativeTimestamp" 13523692171416}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36011, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36011}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812464848}}},
  "timestamp" 1354804435613,
  "relativeTimestamp" 13523709705837}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36011, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36011}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812464848,
     "assured" nil}}},
  "timestamp" 1354804435635,
  "relativeTimestamp" 13523732058049}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35950, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35950}},
    "independent" {"id" 586802712, "assured" nil}}},
  "timestamp" 1354804436572,
  "relativeTimestamp" 13524668929279}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36011, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36011}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812464848,
     "assured" nil}}},
  "timestamp" 1354804437477,
  "relativeTimestamp" 13525573414154}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36011, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36011}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812464848,
     "assured" nil}}},
  "timestamp" 1354804437500,
  "relativeTimestamp" 13525596537383}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36011, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36011}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812464848,
     "assured" nil}}},
  "timestamp" 1354804437518,
  "relativeTimestamp" 13525614762547}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36012, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36012}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838662864,
     "unreplied" nil}}},
  "timestamp" 1354804437541,
  "relativeTimestamp" 13525638232771}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36012, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36012}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838662864}}},
  "timestamp" 1354804437566,
  "relativeTimestamp" 13525662433220}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36012, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36012}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838662864,
     "assured" nil}}},
  "timestamp" 1354804437584,
  "relativeTimestamp" 13525681228881}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35951, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35951}},
    "independent" {"id" 586805520, "assured" nil}}},
  "timestamp" 1354804439169,
  "relativeTimestamp" 13527266026552}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36012, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36012}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838662864,
     "assured" nil}}},
  "timestamp" 1354804439352,
  "relativeTimestamp" 13527448442719}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36012, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36012}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838662864,
     "assured" nil}}},
  "timestamp" 1354804439372,
  "relativeTimestamp" 13527468930788}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36012, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36012}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838662864,
     "assured" nil}}},
  "timestamp" 1354804439391,
  "relativeTimestamp" 13527487336329}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36013, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36013}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812459856,
     "unreplied" nil}}},
  "timestamp" 1354804439410,
  "relativeTimestamp" 13527506962444}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36013, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36013}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812459856}}},
  "timestamp" 1354804439432,
  "relativeTimestamp" 13527528487506}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36013, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36013}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812459856,
     "assured" nil}}},
  "timestamp" 1354804439453,
  "relativeTimestamp" 13527550059632}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36013, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36013}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812459856,
     "assured" nil}}},
  "timestamp" 1354804441166,
  "relativeTimestamp" 13529262640387}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36013, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36013}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812459856,
     "assured" nil}}},
  "timestamp" 1354804441186,
  "relativeTimestamp" 13529283162381}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36013, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36013}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812459856,
     "assured" nil}}},
  "timestamp" 1354804441205,
  "relativeTimestamp" 13529301466897}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36014, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36014}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134192760,
     "unreplied" nil}}},
  "timestamp" 1354804441222,
  "relativeTimestamp" 13529318474966}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36014, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36014}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134192760}}},
  "timestamp" 1354804441239,
  "relativeTimestamp" 13529336058470}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36014, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36014}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134192760,
     "assured" nil}}},
  "timestamp" 1354804441261,
  "relativeTimestamp" 13529357904071}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35952, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35952}},
    "independent" {"id" 134188080, "assured" nil}}},
  "timestamp" 1354804441515,
  "relativeTimestamp" 13529611717219}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36014, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36014}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134192760,
     "assured" nil}}},
  "timestamp" 1354804442590,
  "relativeTimestamp" 13530686894869}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36014, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36014}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134192760,
     "assured" nil}}},
  "timestamp" 1354804442613,
  "relativeTimestamp" 13530709523716}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36014, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36014}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 134192760,
     "assured" nil}}},
  "timestamp" 1354804442633,
  "relativeTimestamp" 13530729645349}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36015, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36015}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134189640,
     "unreplied" nil}}},
  "timestamp" 1354804442656,
  "relativeTimestamp" 13530752867116}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36015, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36015}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134189640}}},
  "timestamp" 1354804442679,
  "relativeTimestamp" 13530776073751}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36015, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36015}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134189640,
     "assured" nil}}},
  "timestamp" 1354804442701,
  "relativeTimestamp" 13530798208718}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.227.17.170"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35666, "dport" 993}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.227.17.170",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 993, "dport" 35666}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 433462,
     "id" 134188080,
     "unreplied" nil}}},
  "timestamp" 1354804442901,
  "relativeTimestamp" 13530997853677}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.227.17.170"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35666, "dport" 993}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.227.17.170",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 993, "dport" 35666}},
    "independent" {"timeout" 432000, "id" 134188080}}},
  "timestamp" 1354804442949,
  "relativeTimestamp" 13531045646660}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35953, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35953}},
    "independent" {"id" 838659744, "assured" nil}}},
  "timestamp" 1354804443464,
  "relativeTimestamp" 13531561134841}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36015, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36015}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134189640,
     "assured" nil}}},
  "timestamp" 1354804444815,
  "relativeTimestamp" 13532911583960}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36015, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36015}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134189640,
     "assured" nil}}},
  "timestamp" 1354804444836,
  "relativeTimestamp" 13532932504405}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36015, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36015}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 134189640,
     "assured" nil}}},
  "timestamp" 1354804444854,
  "relativeTimestamp" 13532951044581}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36016, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36016}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838659744,
     "unreplied" nil}}},
  "timestamp" 1354804444873,
  "relativeTimestamp" 13532969429448}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36016, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36016}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838659744}}},
  "timestamp" 1354804444893,
  "relativeTimestamp" 13532989522434}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36016, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36016}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838659744,
     "assured" nil}}},
  "timestamp" 1354804444911,
  "relativeTimestamp" 13533007339910}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35954, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35954}},
    "independent" {"id" 838657560, "assured" nil}}},
  "timestamp" 1354804445692,
  "relativeTimestamp" 13533788575690}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36016, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36016}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838659744,
     "assured" nil}}},
  "timestamp" 1354804446982,
  "relativeTimestamp" 13535079141637}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36017, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36017}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812460792,
     "unreplied" nil}}},
  "timestamp" 1354804447003,
  "relativeTimestamp" 13535099889916}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36017, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36017}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812460792}}},
  "timestamp" 1354804447028,
  "relativeTimestamp" 13535124977768}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36017, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36017}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812460792,
     "assured" nil}}},
  "timestamp" 1354804447051,
  "relativeTimestamp" 13535148233822}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36016, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36016}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 838659744,
     "assured" nil}}},
  "timestamp" 1354804447075,
  "relativeTimestamp" 13535172268742}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35955, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35955}},
    "independent" {"id" 838658184, "assured" nil}}},
  "timestamp" 1354804447857,
  "relativeTimestamp" 13535953888811}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36016, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36016}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 838659744, "assured" nil}}},
  "timestamp" 1354804449017,
  "relativeTimestamp" 13537113389193}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36017, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36017}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812460792,
     "assured" nil}}},
  "timestamp" 1354804449108,
  "relativeTimestamp" 13537204455385}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36017, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36017}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812460792,
     "assured" nil}}},
  "timestamp" 1354804449131,
  "relativeTimestamp" 13537228062494}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36017, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36017}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812460792,
     "assured" nil}}},
  "timestamp" 1354804449152,
  "relativeTimestamp" 13537249073003}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36018, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36018}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812459544,
     "unreplied" nil}}},
  "timestamp" 1354804449175,
  "relativeTimestamp" 13537271354189}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36018, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36018}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812459544}}},
  "timestamp" 1354804449195,
  "relativeTimestamp" 13537291985483}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36018, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36018}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812459544,
     "assured" nil}}},
  "timestamp" 1354804449214,
  "relativeTimestamp" 13537310601289}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35956, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35956}},
    "independent" {"id" 586801776, "assured" nil}}},
  "timestamp" 1354804450297,
  "relativeTimestamp" 13538393879169}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 59196, "dport" 631}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 631, "dport" 59196}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812459232,
     "unreplied" nil}}},
  "timestamp" 1354804450994,
  "relativeTimestamp" 13539090377179}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36018, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36018}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812459544,
     "assured" nil}}},
  "timestamp" 1354804451153,
  "relativeTimestamp" 13539249991097}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36018, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36018}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812459544,
     "assured" nil}}},
  "timestamp" 1354804451178,
  "relativeTimestamp" 13539274694098}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36018, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36018}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812459544,
     "assured" nil}}},
  "timestamp" 1354804451197,
  "relativeTimestamp" 13539293942103}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36020, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36020}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838660368,
     "unreplied" nil}}},
  "timestamp" 1354804451217,
  "relativeTimestamp" 13539313311843}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36020, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36020}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838660368}}},
  "timestamp" 1354804451237,
  "relativeTimestamp" 13539333576620}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36020, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36020}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838660368,
     "assured" nil}}},
  "timestamp" 1354804451258,
  "relativeTimestamp" 13539354766279}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36020, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36020}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838660368,
     "assured" nil}}},
  "timestamp" 1354804452631,
  "relativeTimestamp" 13540727368394}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36021, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36021}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812458608,
     "unreplied" nil}}},
  "timestamp" 1354804452649,
  "relativeTimestamp" 13540746180361}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36021, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36021}},
    "independent" {"state" "SYN_RECV", "timeout" 59, "id" 812458608}}},
  "timestamp" 1354804452667,
  "relativeTimestamp" 13540763686659}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36021, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36021}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812458608,
     "assured" nil}}},
  "timestamp" 1354804452684,
  "relativeTimestamp" 13540780904526}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36020, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36020}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 838660368,
     "assured" nil}}},
  "timestamp" 1354804452704,
  "relativeTimestamp" 13540800343478}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35957, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35957}},
    "independent" {"id" 586803024, "assured" nil}}},
  "timestamp" 1354804453151,
  "relativeTimestamp" 13541247364500}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36020, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36020}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 838660368, "assured" nil}}},
  "timestamp" 1354804454151,
  "relativeTimestamp" 13542247903261}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36021, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36021}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812458608,
     "assured" nil}}},
  "timestamp" 1354804454226,
  "relativeTimestamp" 13542322930932}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36021, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36021}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812458608,
     "assured" nil}}},
  "timestamp" 1354804454246,
  "relativeTimestamp" 13542342974838}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36021, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36021}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812458608,
     "assured" nil}}},
  "timestamp" 1354804454267,
  "relativeTimestamp" 13542363636815}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36022, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36022}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838658184,
     "unreplied" nil}}},
  "timestamp" 1354804454289,
  "relativeTimestamp" 13542385592310}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36022, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36022}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838658184}}},
  "timestamp" 1354804454314,
  "relativeTimestamp" 13542410500249}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36022, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36022}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838658184,
     "assured" nil}}},
  "timestamp" 1354804454331,
  "relativeTimestamp" 13542427565413}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35958, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35958}},
    "independent" {"id" 812461416, "assured" nil}}},
  "timestamp" 1354804454750,
  "relativeTimestamp" 13542846800601}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36022, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36022}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838658184,
     "assured" nil}}},
  "timestamp" 1354804456767,
  "relativeTimestamp" 13544863453894}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36022, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36022}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838658184,
     "assured" nil}}},
  "timestamp" 1354804456789,
  "relativeTimestamp" 13544886097788}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36022, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36022}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838658184,
     "assured" nil}}},
  "timestamp" 1354804456809,
  "relativeTimestamp" 13544905647114}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36023, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36023}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586803024,
     "unreplied" nil}}},
  "timestamp" 1354804456826,
  "relativeTimestamp" 13544922674275}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36023, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36023}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586803024}}},
  "timestamp" 1354804456844,
  "relativeTimestamp" 13544940945685}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36023, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36023}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586803024,
     "assured" nil}}},
  "timestamp" 1354804456862,
  "relativeTimestamp" 13544958418923}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35960, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35960}},
    "independent" {"id" 838656936, "assured" nil}}},
  "timestamp" 1354804458493,
  "relativeTimestamp" 13546589737348}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36023, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36023}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 586803024,
     "assured" nil}}},
  "timestamp" 1354804458916,
  "relativeTimestamp" 13547013178762}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36023, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36023}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 586803024,
     "assured" nil}}},
  "timestamp" 1354804458939,
  "relativeTimestamp" 13547035415018}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36023, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36023}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 586803024,
     "assured" nil}}},
  "timestamp" 1354804458955,
  "relativeTimestamp" 13547052216292}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36024, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36024}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838657560,
     "unreplied" nil}}},
  "timestamp" 1354804458974,
  "relativeTimestamp" 13547070476895}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36024, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36024}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838657560}}},
  "timestamp" 1354804458991,
  "relativeTimestamp" 13547087572828}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36024, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36024}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838657560,
     "assured" nil}}},
  "timestamp" 1354804459008,
  "relativeTimestamp" 13547104656269}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36016, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36016}},
    "independent" {"id" 838659744, "assured" nil}}},
  "timestamp" 1354804459025,
  "relativeTimestamp" 13547121809409}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36024, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36024}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838657560,
     "assured" nil}}},
  "timestamp" 1354804461005,
  "relativeTimestamp" 13549101806824}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36024, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36024}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838657560,
     "assured" nil}}},
  "timestamp" 1354804461023,
  "relativeTimestamp" 13549120169485}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36024, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36024}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838657560,
     "assured" nil}}},
  "timestamp" 1354804461041,
  "relativeTimestamp" 13549138018295}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36025, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36025}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586801776,
     "unreplied" nil}}},
  "timestamp" 1354804461066,
  "relativeTimestamp" 13549162374431}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36025, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36025}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586801776}}},
  "timestamp" 1354804461087,
  "relativeTimestamp" 13549183560472}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36025, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36025}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586801776,
     "assured" nil}}},
  "timestamp" 1354804461107,
  "relativeTimestamp" 13549203342521}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36025, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36025}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 586801776,
     "assured" nil}}},
  "timestamp" 1354804462703,
  "relativeTimestamp" 13550799406495}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36026, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36026}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812457984,
     "unreplied" nil}}},
  "timestamp" 1354804462725,
  "relativeTimestamp" 13550821589470}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36026, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36026}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812457984}}},
  "timestamp" 1354804462745,
  "relativeTimestamp" 13550841470772}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36026, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36026}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812457984,
     "assured" nil}}},
  "timestamp" 1354804462772,
  "relativeTimestamp" 13550868545269}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36025, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36025}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 586801776,
     "assured" nil}}},
  "timestamp" 1354804462792,
  "relativeTimestamp" 13550888357033}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36020, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36020}},
    "independent" {"id" 838660368, "assured" nil}}},
  "timestamp" 1354804464150,
  "relativeTimestamp" 13552246752014}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36025, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36025}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 586801776, "assured" nil}}},
  "timestamp" 1354804464932,
  "relativeTimestamp" 13553029190128}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36026, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36026}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812457984,
     "assured" nil}}},
  "timestamp" 1354804465008,
  "relativeTimestamp" 13553104769525}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36026, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36026}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812457984,
     "assured" nil}}},
  "timestamp" 1354804465029,
  "relativeTimestamp" 13553125538998}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36026, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36026}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812457984,
     "assured" nil}}},
  "timestamp" 1354804465050,
  "relativeTimestamp" 13553147249683}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36027, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36027}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812458296,
     "unreplied" nil}}},
  "timestamp" 1354804465069,
  "relativeTimestamp" 13553165366362}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36027, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36027}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812458296}}},
  "timestamp" 1354804465089,
  "relativeTimestamp" 13553185475625}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36027, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36027}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812458296,
     "assured" nil}}},
  "timestamp" 1354804465107,
  "relativeTimestamp" 13553203806193}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35963, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35963}},
    "independent" {"id" 838657248, "assured" nil}}},
  "timestamp" 1354804465503,
  "relativeTimestamp" 13553599501836}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36027, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36027}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812458296,
     "assured" nil}}},
  "timestamp" 1354804466585,
  "relativeTimestamp" 13554681728472}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36027, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36027}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812458296,
     "assured" nil}}},
  "timestamp" 1354804466609,
  "relativeTimestamp" 13554705649939}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36027, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36027}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812458296,
     "assured" nil}}},
  "timestamp" 1354804466628,
  "relativeTimestamp" 13554725116615}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36028, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36028}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134188704,
     "unreplied" nil}}},
  "timestamp" 1354804466646,
  "relativeTimestamp" 13554742705450}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36028, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36028}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134188704}}},
  "timestamp" 1354804466665,
  "relativeTimestamp" 13554761947154}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36028, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36028}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134188704,
     "assured" nil}}},
  "timestamp" 1354804466682,
  "relativeTimestamp" 13554778429617}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35964, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35964}},
    "independent" {"id" 838658496, "assured" nil}}},
  "timestamp" 1354804467079,
  "relativeTimestamp" 13555175768424}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36028, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36028}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134188704,
     "assured" nil}}},
  "timestamp" 1354804468775,
  "relativeTimestamp" 13556871772810}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36028, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36028}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134188704,
     "assured" nil}}},
  "timestamp" 1354804468796,
  "relativeTimestamp" 13556892509424}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36028, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36028}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 134188704,
     "assured" nil}}},
  "timestamp" 1354804468814,
  "relativeTimestamp" 13556910623589}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36029, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36029}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586805520,
     "unreplied" nil}}},
  "timestamp" 1354804468833,
  "relativeTimestamp" 13556930221299}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36029, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36029}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586805520}}},
  "timestamp" 1354804468852,
  "relativeTimestamp" 13556948350547}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36029, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36029}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586805520,
     "assured" nil}}},
  "timestamp" 1354804468869,
  "relativeTimestamp" 13556965806025}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35965, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35965}},
    "independent" {"id" 134187456, "assured" nil}}},
  "timestamp" 1354804469130,
  "relativeTimestamp" 13557226883944}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36029, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36029}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 586805520,
     "assured" nil}}},
  "timestamp" 1354804470909,
  "relativeTimestamp" 13559005521299}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36029, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36029}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 586805520,
     "assured" nil}}},
  "timestamp" 1354804470930,
  "relativeTimestamp" 13559026395448}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36029, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36029}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 586805520,
     "assured" nil}}},
  "timestamp" 1354804470951,
  "relativeTimestamp" 13559047627566}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36030, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36030}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586802712,
     "unreplied" nil}}},
  "timestamp" 1354804470968,
  "relativeTimestamp" 13559064427199}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36030, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36030}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586802712}}},
  "timestamp" 1354804470987,
  "relativeTimestamp" 13559083800372}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36030, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36030}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586802712,
     "assured" nil}}},
  "timestamp" 1354804471003,
  "relativeTimestamp" 13559099899896}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35966, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35966}},
    "independent" {"id" 134192448, "assured" nil}}},
  "timestamp" 1354804471118,
  "relativeTimestamp" 13559214667697}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36030, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36030}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 586802712,
     "assured" nil}}},
  "timestamp" 1354804472643,
  "relativeTimestamp" 13560740075283}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36030, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36030}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 586802712,
     "assured" nil}}},
  "timestamp" 1354804472666,
  "relativeTimestamp" 13560762743152}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36030, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36030}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 586802712,
     "assured" nil}}},
  "timestamp" 1354804472689,
  "relativeTimestamp" 13560785448508}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36031, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36031}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134188392,
     "unreplied" nil}}},
  "timestamp" 1354804472708,
  "relativeTimestamp" 13560804722745}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36031, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36031}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134188392}}},
  "timestamp" 1354804472729,
  "relativeTimestamp" 13560825914064}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36031, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36031}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134188392,
     "assured" nil}}},
  "timestamp" 1354804472750,
  "relativeTimestamp" 13560846772371}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35967, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35967}},
    "independent" {"id" 838656312, "assured" nil}}},
  "timestamp" 1354804473049,
  "relativeTimestamp" 13561145792034}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36031, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36031}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134188392,
     "assured" nil}}},
  "timestamp" 1354804474322,
  "relativeTimestamp" 13562419044362}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36031, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36031}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134188392,
     "assured" nil}}},
  "timestamp" 1354804474342,
  "relativeTimestamp" 13562438538196}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36031, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36031}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 134188392,
     "assured" nil}}},
  "timestamp" 1354804474359,
  "relativeTimestamp" 13562456247869}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36032, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36032}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812461416,
     "unreplied" nil}}},
  "timestamp" 1354804474376,
  "relativeTimestamp" 13562472754754}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36032, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36032}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812461416}}},
  "timestamp" 1354804474397,
  "relativeTimestamp" 13562493849326}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36032, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36032}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812461416,
     "assured" nil}}},
  "timestamp" 1354804474416,
  "relativeTimestamp" 13562512940037}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36025, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36025}},
    "independent" {"id" 586801776, "assured" nil}}},
  "timestamp" 1354804474932,
  "relativeTimestamp" 13563028727308}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.227.17.170"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35666, "dport" 993}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.227.17.170",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 993, "dport" 35666}},
    "independent" {"timeout" 432000, "id" 134188080, "assured" nil}}},
  "timestamp" 1354804474963,
  "relativeTimestamp" 13563059380767}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35968, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35968}},
    "independent" {"id" 812461728, "assured" nil}}},
  "timestamp" 1354804475256,
  "relativeTimestamp" 13563352777393}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36032, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36032}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812461416,
     "assured" nil}}},
  "timestamp" 1354804476612,
  "relativeTimestamp" 13564708433270}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36033, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36033}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812465160,
     "unreplied" nil}}},
  "timestamp" 1354804476633,
  "relativeTimestamp" 13564729604045}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36033, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36033}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812465160}}},
  "timestamp" 1354804476653,
  "relativeTimestamp" 13564749378674}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36033, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36033}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812465160,
     "assured" nil}}},
  "timestamp" 1354804476671,
  "relativeTimestamp" 13564768204574}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36032, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36032}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 812461416,
     "assured" nil}}},
  "timestamp" 1354804476694,
  "relativeTimestamp" 13564791073608}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35969, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35969}},
    "independent" {"id" 586801464, "assured" nil}}},
  "timestamp" 1354804476877,
  "relativeTimestamp" 13564973793217}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36032, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36032}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 812461416, "assured" nil}}},
  "timestamp" 1354804478430,
  "relativeTimestamp" 13566526623502}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36033, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36033}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812465160,
     "assured" nil}}},
  "timestamp" 1354804478506,
  "relativeTimestamp" 13566602534215}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36033, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36033}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812465160,
     "assured" nil}}},
  "timestamp" 1354804478529,
  "relativeTimestamp" 13566626033945}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36033, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36033}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812465160,
     "assured" nil}}},
  "timestamp" 1354804478547,
  "relativeTimestamp" 13566644100747}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36034, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36034}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838656312,
     "unreplied" nil}}},
  "timestamp" 1354804478566,
  "relativeTimestamp" 13566662385529}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36034, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36034}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838656312}}},
  "timestamp" 1354804478584,
  "relativeTimestamp" 13566680377464}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36034, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36034}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838656312,
     "assured" nil}}},
  "timestamp" 1354804478601,
  "relativeTimestamp" 13566697564201}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35970, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35970}},
    "independent" {"id" 838656624, "assured" nil}}},
  "timestamp" 1354804478631,
  "relativeTimestamp" 13566727884993}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35972, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35972}},
    "independent" {"id" 812462664, "assured" nil}}},
  "timestamp" 1354804480659,
  "relativeTimestamp" 13568755939770}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36034, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36034}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838656312,
     "assured" nil}}},
  "timestamp" 1354804480680,
  "relativeTimestamp" 13568776806989}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36034, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36034}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838656312,
     "assured" nil}}},
  "timestamp" 1354804480697,
  "relativeTimestamp" 13568793841723}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36034, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36034}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838656312,
     "assured" nil}}},
  "timestamp" 1354804480714,
  "relativeTimestamp" 13568810998397}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36035, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36035}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586801464,
     "unreplied" nil}}},
  "timestamp" 1354804480732,
  "relativeTimestamp" 13568829039282}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36035, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36035}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586801464}}},
  "timestamp" 1354804480749,
  "relativeTimestamp" 13568846016881}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36035, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36035}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586801464,
     "assured" nil}}},
  "timestamp" 1354804480766,
  "relativeTimestamp" 13568862332103}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36035, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36035}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 586801464,
     "assured" nil}}},
  "timestamp" 1354804482786,
  "relativeTimestamp" 13570882864478}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36035, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36035}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 586801464,
     "assured" nil}}},
  "timestamp" 1354804482809,
  "relativeTimestamp" 13570906159278}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36035, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36035}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 586801464,
     "assured" nil}}},
  "timestamp" 1354804482826,
  "relativeTimestamp" 13570922817193}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36036, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36036}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134186832,
     "unreplied" nil}}},
  "timestamp" 1354804482843,
  "relativeTimestamp" 13570939414417}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36036, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36036}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134186832}}},
  "timestamp" 1354804482860,
  "relativeTimestamp" 13570956427294}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36036, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36036}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134186832,
     "assured" nil}}},
  "timestamp" 1354804482876,
  "relativeTimestamp" 13570973283636}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36036, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36036}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134186832,
     "assured" nil}}},
  "timestamp" 1354804484504,
  "relativeTimestamp" 13572600400345}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36036, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36036}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134186832,
     "assured" nil}}},
  "timestamp" 1354804484522,
  "relativeTimestamp" 13572618382711}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36036, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36036}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 134186832,
     "assured" nil}}},
  "timestamp" 1354804484538,
  "relativeTimestamp" 13572634867482}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36037, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36037}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838658496,
     "unreplied" nil}}},
  "timestamp" 1354804484555,
  "relativeTimestamp" 13572651367564}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36037, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36037}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838658496}}},
  "timestamp" 1354804484572,
  "relativeTimestamp" 13572668745846}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36037, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36037}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838658496,
     "assured" nil}}},
  "timestamp" 1354804484588,
  "relativeTimestamp" 13572684706340}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35974, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35974}},
    "independent" {"id" 586806768, "assured" nil}}},
  "timestamp" 1354804484872,
  "relativeTimestamp" 13572968789930}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36037, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36037}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838658496,
     "assured" nil}}},
  "timestamp" 1354804486162,
  "relativeTimestamp" 13574259251969}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36037, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36037}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838658496,
     "assured" nil}}},
  "timestamp" 1354804486184,
  "relativeTimestamp" 13574280546262}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36037, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36037}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838658496,
     "assured" nil}}},
  "timestamp" 1354804486205,
  "relativeTimestamp" 13574302284259}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36038, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36038}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586806768,
     "unreplied" nil}}},
  "timestamp" 1354804486224,
  "relativeTimestamp" 13574320348352}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36038, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36038}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586806768}}},
  "timestamp" 1354804486243,
  "relativeTimestamp" 13574339661671}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36038, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36038}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586806768,
     "assured" nil}}},
  "timestamp" 1354804486264,
  "relativeTimestamp" 13574360764278}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35975, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35975}},
    "independent" {"id" 838661616, "assured" nil}}},
  "timestamp" 1354804487056,
  "relativeTimestamp" 13575152791879}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36038, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36038}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 586806768,
     "assured" nil}}},
  "timestamp" 1354804488096,
  "relativeTimestamp" 13576193056345}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36038, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36038}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 586806768,
     "assured" nil}}},
  "timestamp" 1354804488117,
  "relativeTimestamp" 13576213589927}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36038, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36038}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 586806768,
     "assured" nil}}},
  "timestamp" 1354804488135,
  "relativeTimestamp" 13576232184323}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36039, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36039}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838657248,
     "unreplied" nil}}},
  "timestamp" 1354804488155,
  "relativeTimestamp" 13576251880620}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36039, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36039}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838657248}}},
  "timestamp" 1354804488175,
  "relativeTimestamp" 13576271840244}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36039, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36039}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838657248,
     "assured" nil}}},
  "timestamp" 1354804488194,
  "relativeTimestamp" 13576290733367}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36032, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36032}},
    "independent" {"id" 812461416, "assured" nil}}},
  "timestamp" 1354804488429,
  "relativeTimestamp" 13576525836643}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36039, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36039}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838657248,
     "assured" nil}}},
  "timestamp" 1354804489506,
  "relativeTimestamp" 13577602611120}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36040, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36040}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586801776,
     "unreplied" nil}}},
  "timestamp" 1354804489524,
  "relativeTimestamp" 13577620810657}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36040, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36040}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586801776}}},
  "timestamp" 1354804489542,
  "relativeTimestamp" 13577638497268}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36040, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36040}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586801776,
     "assured" nil}}},
  "timestamp" 1354804489562,
  "relativeTimestamp" 13577659120846}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35976, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35976}},
    "independent" {"id" 838659120, "assured" nil}}},
  "timestamp" 1354804489582,
  "relativeTimestamp" 13577678874307}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36039, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36039}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 838657248,
     "assured" nil}}},
  "timestamp" 1354804489602,
  "relativeTimestamp" 13577698489946}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35977, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35977}},
    "independent" {"id" 586804272, "assured" nil}}},
  "timestamp" 1354804491055,
  "relativeTimestamp" 13579151793588}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36039, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36039}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 838657248, "assured" nil}}},
  "timestamp" 1354804491445,
  "relativeTimestamp" 13579541703058}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36040, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36040}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 586801776,
     "assured" nil}}},
  "timestamp" 1354804491523,
  "relativeTimestamp" 13579619955985}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36041, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36041}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838660368,
     "unreplied" nil}}},
  "timestamp" 1354804491545,
  "relativeTimestamp" 13579641844990}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36041, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36041}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838660368}}},
  "timestamp" 1354804491564,
  "relativeTimestamp" 13579661144631}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36041, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36041}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838660368,
     "assured" nil}}},
  "timestamp" 1354804491581,
  "relativeTimestamp" 13579678084467}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36040, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36040}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 586801776,
     "assured" nil}}},
  "timestamp" 1354804491601,
  "relativeTimestamp" 13579697534037}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35978, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35978}},
    "independent" {"id" 812465472, "assured" nil}}},
  "timestamp" 1354804493069,
  "relativeTimestamp" 13581166051942}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36040, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36040}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 586801776, "assured" nil}}},
  "timestamp" 1354804493401,
  "relativeTimestamp" 13581497693633}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36041, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36041}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838660368,
     "assured" nil}}},
  "timestamp" 1354804493478,
  "relativeTimestamp" 13581574890239}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36041, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36041}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838660368,
     "assured" nil}}},
  "timestamp" 1354804493500,
  "relativeTimestamp" 13581597136294}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36041, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36041}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838660368,
     "assured" nil}}},
  "timestamp" 1354804493519,
  "relativeTimestamp" 13581615973290}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36042, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36042}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838659744,
     "unreplied" nil}}},
  "timestamp" 1354804493538,
  "relativeTimestamp" 13581634754105}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36042, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36042}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838659744}}},
  "timestamp" 1354804493557,
  "relativeTimestamp" 13581653941217}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36042, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36042}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838659744,
     "assured" nil}}},
  "timestamp" 1354804493574,
  "relativeTimestamp" 13581670969339}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36042, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36042}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838659744,
     "assured" nil}}},
  "timestamp" 1354804495370,
  "relativeTimestamp" 13583466925095}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36042, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36042}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838659744,
     "assured" nil}}},
  "timestamp" 1354804495392,
  "relativeTimestamp" 13583489114860}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36042, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36042}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838659744,
     "assured" nil}}},
  "timestamp" 1354804495410,
  "relativeTimestamp" 13583507084264}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36043, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36043}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812460480,
     "unreplied" nil}}},
  "timestamp" 1354804495428,
  "relativeTimestamp" 13583525035115}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36043, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36043}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812460480}}},
  "timestamp" 1354804495447,
  "relativeTimestamp" 13583543680215}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36043, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36043}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812460480,
     "assured" nil}}},
  "timestamp" 1354804495464,
  "relativeTimestamp" 13583560569600}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35979, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35979}},
    "independent" {"id" 838660680, "assured" nil}}},
  "timestamp" 1354804495686,
  "relativeTimestamp" 13583782748548}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36043, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36043}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812460480,
     "assured" nil}}},
  "timestamp" 1354804497540,
  "relativeTimestamp" 13585636300963}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36043, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36043}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812460480,
     "assured" nil}}},
  "timestamp" 1354804497562,
  "relativeTimestamp" 13585658631570}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36043, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36043}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812460480,
     "assured" nil}}},
  "timestamp" 1354804497579,
  "relativeTimestamp" 13585675980014}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36044, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36044}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838656936,
     "unreplied" nil}}},
  "timestamp" 1354804497598,
  "relativeTimestamp" 13585694859272}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36044, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36044}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838656936}}},
  "timestamp" 1354804497615,
  "relativeTimestamp" 13585712035165}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36044, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36044}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838656936,
     "assured" nil}}},
  "timestamp" 1354804497631,
  "relativeTimestamp" 13585728274683}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35980, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35980}},
    "independent" {"id" 812463912, "assured" nil}}},
  "timestamp" 1354804497714,
  "relativeTimestamp" 13585810784980}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36044, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36044}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838656936,
     "assured" nil}}},
  "timestamp" 1354804499649,
  "relativeTimestamp" 13587745811382}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36044, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36044}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838656936,
     "assured" nil}}},
  "timestamp" 1354804499669,
  "relativeTimestamp" 13587766091664}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36044, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36044}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838656936,
     "assured" nil}}},
  "timestamp" 1354804499687,
  "relativeTimestamp" 13587783647090}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36045, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36045}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838660680,
     "unreplied" nil}}},
  "timestamp" 1354804499704,
  "relativeTimestamp" 13587801085043}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36045, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36045}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838660680}}},
  "timestamp" 1354804499725,
  "relativeTimestamp" 13587821750207}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36045, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36045}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838660680,
     "assured" nil}}},
  "timestamp" 1354804499746,
  "relativeTimestamp" 13587843188040}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35982, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35982}},
    "independent" {"id" 838658808, "assured" nil}}},
  "timestamp" 1354804500018,
  "relativeTimestamp" 13588114885157}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36045, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36045}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838660680,
     "assured" nil}}},
  "timestamp" 1354804501369,
  "relativeTimestamp" 13589466160387}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36046, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36046}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838659120,
     "unreplied" nil}}},
  "timestamp" 1354804501393,
  "relativeTimestamp" 13589489658139}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36046, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36046}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838659120}}},
  "timestamp" 1354804501414,
  "relativeTimestamp" 13589510981498}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36046, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36046}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838659120,
     "assured" nil}}},
  "timestamp" 1354804501434,
  "relativeTimestamp" 13589531061867}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36045, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36045}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 838660680,
     "assured" nil}}},
  "timestamp" 1354804501455,
  "relativeTimestamp" 13589551333095}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36039, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36039}},
    "independent" {"id" 838657248, "assured" nil}}},
  "timestamp" 1354804501477,
  "relativeTimestamp" 13589573697980}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35983, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35983}},
    "independent" {"id" 812462352, "assured" nil}}},
  "timestamp" 1354804501596,
  "relativeTimestamp" 13589693201563}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36045, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36045}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 838660680, "assured" nil}}},
  "timestamp" 1354804503286,
  "relativeTimestamp" 13591383185268}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36046, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36046}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838659120,
     "assured" nil}}},
  "timestamp" 1354804503366,
  "relativeTimestamp" 13591462878470}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36046, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36046}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838659120,
     "assured" nil}}},
  "timestamp" 1354804503386,
  "relativeTimestamp" 13591482307282}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36046, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36046}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838659120,
     "assured" nil}}},
  "timestamp" 1354804503402,
  "relativeTimestamp" 13591498832962}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36047, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36047}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812465784,
     "unreplied" nil}}},
  "timestamp" 1354804503418,
  "relativeTimestamp" 13591515259809}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36047, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36047}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812465784}}},
  "timestamp" 1354804503435,
  "relativeTimestamp" 13591531755981}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36047, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36047}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812465784,
     "assured" nil}}},
  "timestamp" 1354804503452,
  "relativeTimestamp" 13591548630932}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36040, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36040}},
    "independent" {"id" 586801776, "assured" nil}}},
  "timestamp" 1354804503468,
  "relativeTimestamp" 13591565240199}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35984, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35984}},
    "independent" {"id" 134191200, "assured" nil}}},
  "timestamp" 1354804503484,
  "relativeTimestamp" 13591580983276}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35985, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35985}},
    "independent" {"id" 812460168, "assured" nil}}},
  "timestamp" 1354804505245,
  "relativeTimestamp" 13593341757470}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36047, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36047}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812465784,
     "assured" nil}}},
  "timestamp" 1354804505300,
  "relativeTimestamp" 13593397263305}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36047, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36047}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812465784,
     "assured" nil}}},
  "timestamp" 1354804505322,
  "relativeTimestamp" 13593418719338}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36047, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36047}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812465784,
     "assured" nil}}},
  "timestamp" 1354804505340,
  "relativeTimestamp" 13593436428112}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36048, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36048}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586801776,
     "unreplied" nil}}},
  "timestamp" 1354804505358,
  "relativeTimestamp" 13593455047904}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36048, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36048}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586801776}}},
  "timestamp" 1354804505376,
  "relativeTimestamp" 13593472650512}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36048, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36048}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586801776,
     "assured" nil}}},
  "timestamp" 1354804505393,
  "relativeTimestamp" 13593489538555}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36048, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36048}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 586801776,
     "assured" nil}}},
  "timestamp" 1354804506848,
  "relativeTimestamp" 13594944827204}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36048, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36048}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 586801776,
     "assured" nil}}},
  "timestamp" 1354804506871,
  "relativeTimestamp" 13594967443344}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36048, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36048}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 586801776,
     "assured" nil}}},
  "timestamp" 1354804506888,
  "relativeTimestamp" 13594984322859}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36049, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36049}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838661616,
     "unreplied" nil}}},
  "timestamp" 1354804506905,
  "relativeTimestamp" 13595001719628}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36049, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36049}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838661616}}},
  "timestamp" 1354804506922,
  "relativeTimestamp" 13595019147977}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36049, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36049}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838661616,
     "assured" nil}}},
  "timestamp" 1354804506938,
  "relativeTimestamp" 13595035078192}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35986, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35986}},
    "independent" {"id" 838660056, "assured" nil}}},
  "timestamp" 1354804507644,
  "relativeTimestamp" 13595740618419}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36049, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36049}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838661616,
     "assured" nil}}},
  "timestamp" 1354804508526,
  "relativeTimestamp" 13596623024934}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36049, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36049}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838661616,
     "assured" nil}}},
  "timestamp" 1354804508547,
  "relativeTimestamp" 13596643345131}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36049, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36049}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838661616,
     "assured" nil}}},
  "timestamp" 1354804508564,
  "relativeTimestamp" 13596661167793}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36050, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36050}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838656624,
     "unreplied" nil}}},
  "timestamp" 1354804508584,
  "relativeTimestamp" 13596680674722}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36050, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36050}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838656624}}},
  "timestamp" 1354804508600,
  "relativeTimestamp" 13596697217308}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36050, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36050}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838656624,
     "assured" nil}}},
  "timestamp" 1354804508616,
  "relativeTimestamp" 13596713044774}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.0.251"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 59148, "dport" 631}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 631, "dport" 59148}},
    "independent" {"id" 838657872, "unreplied" nil}}},
  "timestamp" 1354804508929,
  "relativeTimestamp" 13597025644328}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35987, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 35987}},
    "independent" {"id" 838659432, "assured" nil}}},
  "timestamp" 1354804509665,
  "relativeTimestamp" 13597761470953}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36050, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36050}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838656624,
     "assured" nil}}},
  "timestamp" 1354804510479,
  "relativeTimestamp" 13598576143102}}
])

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
    :raw-file "ssh_brute_force_sshpass_em1_2_2012-12-06.out"
    :date "2012-12-06"}
   cljEsperRunner.test.data.conntrack.ssh-brute-force-sshpass-em1-2-2012-12-06)

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
     "timeout" 433394,
     "id" 584152872,
     "unreplied" nil}}},
  "timestamp" 1354812899147,
  "relativeTimestamp" 21987243449379}}
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
     "timeout" 433394,
     "id" 584154744,
     "unreplied" nil}}},
  "timestamp" 1354812899412,
  "relativeTimestamp" 21987508369734}}
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
    "independent" {"timeout" 432000, "id" 584152872}}},
  "timestamp" 1354812899631,
  "relativeTimestamp" 21987727778057}}
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
    "independent" {"timeout" 432000, "id" 584154744}}},
  "timestamp" 1354812899790,
  "relativeTimestamp" 21987886306578}}
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
    {"state" "ESTABLISHED",
     "timeout" 433384,
     "id" 838660992,
     "unreplied" nil}}},
  "timestamp" 1354812909090,
  "relativeTimestamp" 21997186660546}}
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
    "independent" {"timeout" 432000, "id" 838660992}}},
  "timestamp" 1354812909203,
  "relativeTimestamp" 21997299421305}}
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
    "independent" {"timeout" 432000, "id" 838660992, "assured" nil}}},
  "timestamp" 1354812909302,
  "relativeTimestamp" 21997399012606}}
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
     "timeout" 433376,
     "id" 838663800,
     "unreplied" nil}}},
  "timestamp" 1354812917158,
  "relativeTimestamp" 22005254508456}}
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
    "independent" {"timeout" 432000, "id" 838663800}}},
  "timestamp" 1354812917315,
  "relativeTimestamp" 22005411462256}}
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
    "independent" {"timeout" 432000, "id" 838663800, "assured" nil}}},
  "timestamp" 1354812917381,
  "relativeTimestamp" 22005477698220}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 59413, "dport" 631}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 631, "dport" 59413}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812459544,
     "unreplied" nil}}},
  "timestamp" 1354812924920,
  "relativeTimestamp" 22013017136162}}
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
    "independent" {"timeout" 300, "id" 584152872, "assured" nil}}},
  "timestamp" 1354812929086,
  "relativeTimestamp" 22017182636551}}
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
    "independent" {"timeout" 300, "id" 584154744, "assured" nil}}},
  "timestamp" 1354812929145,
  "relativeTimestamp" 22017241552419}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36237, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36237}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812459856,
     "unreplied" nil}}},
  "timestamp" 1354812929754,
  "relativeTimestamp" 22017850294676}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36237, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36237}},
    "independent" {"state" "SYN_RECV", "timeout" 59, "id" 812459856}}},
  "timestamp" 1354812929824,
  "relativeTimestamp" 22017920907218}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36237, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36237}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812459856,
     "assured" nil}}},
  "timestamp" 1354812929882,
  "relativeTimestamp" 22017979229662}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36237, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36237}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812459856,
     "assured" nil}}},
  "timestamp" 1354812932692,
  "relativeTimestamp" 22020789208525}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36237, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36237}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812459856,
     "assured" nil}}},
  "timestamp" 1354812932776,
  "relativeTimestamp" 22020872759558}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36237, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36237}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812459856,
     "assured" nil}}},
  "timestamp" 1354812932835,
  "relativeTimestamp" 22020932071549}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36238, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36238}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812464848,
     "unreplied" nil}}},
  "timestamp" 1354812944792,
  "relativeTimestamp" 22032888993574}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36238, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36238}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812464848}}},
  "timestamp" 1354812944856,
  "relativeTimestamp" 22032952766557}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36238, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36238}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812464848,
     "assured" nil}}},
  "timestamp" 1354812944902,
  "relativeTimestamp" 22032998602898}}
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
     "timeout" 433347,
     "id" 584154432,
     "unreplied" nil}}},
  "timestamp" 1354812946056,
  "relativeTimestamp" 22034152432389}}
{"conntrack.parsed"
 {"data"
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
    "independent" {"timeout" 432000, "id" 584154432}}},
  "timestamp" 1354812946112,
  "relativeTimestamp" 22034208440403}}
{"conntrack.parsed"
 {"data"
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
    "independent" {"timeout" 432000, "id" 584154432, "assured" nil}}},
  "timestamp" 1354812946151,
  "relativeTimestamp" 22034247720361}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36238, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36238}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812464848,
     "assured" nil}}},
  "timestamp" 1354812947523,
  "relativeTimestamp" 22035619863961}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36238, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36238}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812464848,
     "assured" nil}}},
  "timestamp" 1354812947556,
  "relativeTimestamp" 22035652442734}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36238, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36238}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812464848,
     "assured" nil}}},
  "timestamp" 1354812947591,
  "relativeTimestamp" 22035687688127}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36239, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36239}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134188080,
     "unreplied" nil}}},
  "timestamp" 1354812947631,
  "relativeTimestamp" 22035727511372}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36239, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36239}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134188080}}},
  "timestamp" 1354812947670,
  "relativeTimestamp" 22035766838264}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36239, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36239}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134188080,
     "assured" nil}}},
  "timestamp" 1354812947709,
  "relativeTimestamp" 22035806085326}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36239, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36239}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134188080,
     "assured" nil}}},
  "timestamp" 1354812949337,
  "relativeTimestamp" 22037433840240}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36239, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36239}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134188080,
     "assured" nil}}},
  "timestamp" 1354812949365,
  "relativeTimestamp" 22037461939063}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36239, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36239}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 134188080,
     "assured" nil}}},
  "timestamp" 1354812949394,
  "relativeTimestamp" 22037490729344}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36240, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36240}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134187456,
     "unreplied" nil}}},
  "timestamp" 1354812949425,
  "relativeTimestamp" 22037521958298}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36240, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36240}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134187456}}},
  "timestamp" 1354812949453,
  "relativeTimestamp" 22037550120049}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36240, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36240}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134187456,
     "assured" nil}}},
  "timestamp" 1354812949490,
  "relativeTimestamp" 22037586653919}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36240, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36240}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134187456,
     "assured" nil}}},
  "timestamp" 1354812951762,
  "relativeTimestamp" 22039858504270}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36240, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36240}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134187456,
     "assured" nil}}},
  "timestamp" 1354812951802,
  "relativeTimestamp" 22039899100412}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36240, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36240}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 134187456,
     "assured" nil}}},
  "timestamp" 1354812951844,
  "relativeTimestamp" 22039940399485}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36241, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36241}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584147880,
     "unreplied" nil}}},
  "timestamp" 1354812951878,
  "relativeTimestamp" 22039975209547}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36241, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36241}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584147880}}},
  "timestamp" 1354812951914,
  "relativeTimestamp" 22040010818276}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36241, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36241}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584147880,
     "assured" nil}}},
  "timestamp" 1354812951944,
  "relativeTimestamp" 22040040501318}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36241, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36241}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 584147880,
     "assured" nil}}},
  "timestamp" 1354812953796,
  "relativeTimestamp" 22041892424958}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36241, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36241}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 584147880,
     "assured" nil}}},
  "timestamp" 1354812953823,
  "relativeTimestamp" 22041919934846}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36241, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36241}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 584147880,
     "assured" nil}}},
  "timestamp" 1354812953852,
  "relativeTimestamp" 22041948750200}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36242, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36242}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838660680,
     "unreplied" nil}}},
  "timestamp" 1354812953884,
  "relativeTimestamp" 22041980618798}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36242, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36242}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838660680}}},
  "timestamp" 1354812953912,
  "relativeTimestamp" 22042008983144}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36242, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36242}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838660680,
     "assured" nil}}},
  "timestamp" 1354812953943,
  "relativeTimestamp" 22042039755452}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36242, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36242}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838660680,
     "assured" nil}}},
  "timestamp" 1354812955767,
  "relativeTimestamp" 22043863936324}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36242, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36242}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838660680,
     "assured" nil}}},
  "timestamp" 1354812955796,
  "relativeTimestamp" 22043892431170}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36242, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36242}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838660680,
     "assured" nil}}},
  "timestamp" 1354812955824,
  "relativeTimestamp" 22043920587567}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36243, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36243}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838659432,
     "unreplied" nil}}},
  "timestamp" 1354812955853,
  "relativeTimestamp" 22043949914246}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36243, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36243}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838659432}}},
  "timestamp" 1354812955881,
  "relativeTimestamp" 22043978200073}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36243, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36243}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838659432,
     "assured" nil}}},
  "timestamp" 1354812955908,
  "relativeTimestamp" 22044005205755}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36243, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36243}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838659432,
     "assured" nil}}},
  "timestamp" 1354812958015,
  "relativeTimestamp" 22046112231238}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36243, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36243}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838659432,
     "assured" nil}}},
  "timestamp" 1354812958044,
  "relativeTimestamp" 22046140721822}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36243, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36243}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838659432,
     "assured" nil}}},
  "timestamp" 1354812958072,
  "relativeTimestamp" 22046168952628}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36244, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36244}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134186208,
     "unreplied" nil}}},
  "timestamp" 1354812958103,
  "relativeTimestamp" 22046200075707}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36244, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36244}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134186208}}},
  "timestamp" 1354812958133,
  "relativeTimestamp" 22046229919928}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36244, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36244}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134186208,
     "assured" nil}}},
  "timestamp" 1354812958159,
  "relativeTimestamp" 22046255978487}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36244, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36244}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134186208,
     "assured" nil}}},
  "timestamp" 1354812960542,
  "relativeTimestamp" 22048638731158}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36244, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36244}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134186208,
     "assured" nil}}},
  "timestamp" 1354812960571,
  "relativeTimestamp" 22048667622551}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36244, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36244}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 134186208,
     "assured" nil}}},
  "timestamp" 1354812960597,
  "relativeTimestamp" 22048694273121}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36245, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36245}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812458920,
     "unreplied" nil}}},
  "timestamp" 1354812960626,
  "relativeTimestamp" 22048722524845}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36245, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36245}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812458920}}},
  "timestamp" 1354812960652,
  "relativeTimestamp" 22048748887341}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36245, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36245}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812458920,
     "assured" nil}}},
  "timestamp" 1354812960677,
  "relativeTimestamp" 22048774144023}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36245, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36245}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812458920,
     "assured" nil}}},
  "timestamp" 1354812962811,
  "relativeTimestamp" 22050907348530}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36245, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36245}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812458920,
     "assured" nil}}},
  "timestamp" 1354812962841,
  "relativeTimestamp" 22050937978751}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36245, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36245}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812458920,
     "assured" nil}}},
  "timestamp" 1354812962868,
  "relativeTimestamp" 22050964852639}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36246, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36246}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584153808,
     "unreplied" nil}}},
  "timestamp" 1354812962899,
  "relativeTimestamp" 22050995516401}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36246, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36246}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584153808}}},
  "timestamp" 1354812962930,
  "relativeTimestamp" 22051026626890}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36246, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36246}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584153808,
     "assured" nil}}},
  "timestamp" 1354812962969,
  "relativeTimestamp" 22051065724490}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36246, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36246}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 584153808,
     "assured" nil}}},
  "timestamp" 1354812965020,
  "relativeTimestamp" 22053116530071}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36247, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36247}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812462040,
     "unreplied" nil}}},
  "timestamp" 1354812965046,
  "relativeTimestamp" 22053142881704}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36247, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36247}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812462040}}},
  "timestamp" 1354812965085,
  "relativeTimestamp" 22053181878803}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36247, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36247}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812462040,
     "assured" nil}}},
  "timestamp" 1354812965115,
  "relativeTimestamp" 22053212240482}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36246, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36246}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 584153808,
     "assured" nil}}},
  "timestamp" 1354812965148,
  "relativeTimestamp" 22053244460357}}
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
     {"protonum" 17, "protoname" "udp", "sport" 33012, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 33012}},
    "independent" {"timeout" 30, "id" 134187768, "unreplied" nil}}},
  "timestamp" 1354812966308,
  "relativeTimestamp" 22054405057685}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 33012, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 33012}},
    "independent" {"timeout" 30, "id" 134187768}}},
  "timestamp" 1354812966332,
  "relativeTimestamp" 22054428802382}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 33012, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 33012}},
    "independent" {"timeout" 180, "id" 134187768, "assured" nil}}},
  "timestamp" 1354812966362,
  "relativeTimestamp" 22054459055995}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36248, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36248}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134185272,
     "unreplied" nil}}},
  "timestamp" 1354812966386,
  "relativeTimestamp" 22054483129605}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36248, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36248}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134185272}}},
  "timestamp" 1354812966411,
  "relativeTimestamp" 22054508052333}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36248, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36248}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134185272,
     "assured" nil}}},
  "timestamp" 1354812966435,
  "relativeTimestamp" 22054532146372}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36246, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36246}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 584153808, "assured" nil}}},
  "timestamp" 1354812966461,
  "relativeTimestamp" 22054557646656}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36247, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36247}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812462040,
     "assured" nil}}},
  "timestamp" 1354812966501,
  "relativeTimestamp" 22054598219370}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36247, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36247}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812462040,
     "assured" nil}}},
  "timestamp" 1354812966527,
  "relativeTimestamp" 22054624057602}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36247, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36247}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812462040,
     "assured" nil}}},
  "timestamp" 1354812966555,
  "relativeTimestamp" 22054651840759}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36249, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36249}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812463600,
     "unreplied" nil}}},
  "timestamp" 1354812966582,
  "relativeTimestamp" 22054679151558}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36249, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36249}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812463600}}},
  "timestamp" 1354812966614,
  "relativeTimestamp" 22054711040202}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36249, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36249}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812463600,
     "assured" nil}}},
  "timestamp" 1354812966642,
  "relativeTimestamp" 22054738931635}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36249, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36249}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812463600,
     "assured" nil}}},
  "timestamp" 1354812968596,
  "relativeTimestamp" 22056692395598}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36249, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36249}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812463600,
     "assured" nil}}},
  "timestamp" 1354812968623,
  "relativeTimestamp" 22056719840908}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36249, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36249}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812463600,
     "assured" nil}}},
  "timestamp" 1354812968648,
  "relativeTimestamp" 22056744604942}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36250, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36250}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838660056,
     "unreplied" nil}}},
  "timestamp" 1354812968671,
  "relativeTimestamp" 22056767633606}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36250, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36250}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838660056}}},
  "timestamp" 1354812968692,
  "relativeTimestamp" 22056789163944}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36250, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36250}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838660056,
     "assured" nil}}},
  "timestamp" 1354812968745,
  "relativeTimestamp" 22056841707489}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36250, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36250}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838660056,
     "assured" nil}}},
  "timestamp" 1354812971297,
  "relativeTimestamp" 22059393356762}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36250, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36250}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838660056,
     "assured" nil}}},
  "timestamp" 1354812971332,
  "relativeTimestamp" 22059428782518}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36250, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36250}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838660056,
     "assured" nil}}},
  "timestamp" 1354812971357,
  "relativeTimestamp" 22059453470834}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36251, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36251}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812463288,
     "unreplied" nil}}},
  "timestamp" 1354812971385,
  "relativeTimestamp" 22059481801108}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36251, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36251}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812463288}}},
  "timestamp" 1354812971409,
  "relativeTimestamp" 22059505869202}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36251, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36251}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812463288,
     "assured" nil}}},
  "timestamp" 1354812971430,
  "relativeTimestamp" 22059526717288}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36251, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36251}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812463288,
     "assured" nil}}},
  "timestamp" 1354812973073,
  "relativeTimestamp" 22061169628576}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36251, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36251}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812463288,
     "assured" nil}}},
  "timestamp" 1354812973107,
  "relativeTimestamp" 22061203416696}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36251, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36251}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812463288,
     "assured" nil}}},
  "timestamp" 1354812973136,
  "relativeTimestamp" 22061232361281}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36252, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36252}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812460168,
     "unreplied" nil}}},
  "timestamp" 1354812973167,
  "relativeTimestamp" 22061264281125}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36252, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36252}},
    "independent" {"state" "SYN_RECV", "timeout" 59, "id" 812460168}}},
  "timestamp" 1354812973197,
  "relativeTimestamp" 22061294283779}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36252, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36252}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812460168,
     "assured" nil}}},
  "timestamp" 1354812973225,
  "relativeTimestamp" 22061321716263}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36252, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36252}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812460168,
     "assured" nil}}},
  "timestamp" 1354812975325,
  "relativeTimestamp" 22063421889808}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36252, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36252}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812460168,
     "assured" nil}}},
  "timestamp" 1354812975353,
  "relativeTimestamp" 22063449541905}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36252, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36252}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812460168,
     "assured" nil}}},
  "timestamp" 1354812975376,
  "relativeTimestamp" 22063472926461}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36253, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36253}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838657248,
     "unreplied" nil}}},
  "timestamp" 1354812975405,
  "relativeTimestamp" 22063501775002}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36253, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36253}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838657248}}},
  "timestamp" 1354812975433,
  "relativeTimestamp" 22063530267853}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36253, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36253}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838657248,
     "assured" nil}}},
  "timestamp" 1354812975463,
  "relativeTimestamp" 22063559313312}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36246, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36246}},
    "independent" {"id" 584153808, "assured" nil}}},
  "timestamp" 1354812976425,
  "relativeTimestamp" 22064521472990}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36253, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36253}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838657248,
     "assured" nil}}},
  "timestamp" 1354812977319,
  "relativeTimestamp" 22065415579294}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36253, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36253}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838657248,
     "assured" nil}}},
  "timestamp" 1354812977342,
  "relativeTimestamp" 22065438385323}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36253, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36253}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838657248,
     "assured" nil}}},
  "timestamp" 1354812977364,
  "relativeTimestamp" 22065461021586}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36254, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36254}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838658808,
     "unreplied" nil}}},
  "timestamp" 1354812977393,
  "relativeTimestamp" 22065489299752}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36254, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36254}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838658808}}},
  "timestamp" 1354812977422,
  "relativeTimestamp" 22065519059918}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36254, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36254}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838658808,
     "assured" nil}}},
  "timestamp" 1354812977452,
  "relativeTimestamp" 22065549251121}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36254, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36254}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838658808,
     "assured" nil}}},
  "timestamp" 1354812979590,
  "relativeTimestamp" 22067686411364}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36254, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36254}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838658808,
     "assured" nil}}},
  "timestamp" 1354812979613,
  "relativeTimestamp" 22067709492650}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36254, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36254}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838658808,
     "assured" nil}}},
  "timestamp" 1354812979634,
  "relativeTimestamp" 22067731270224}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36255, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36255}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812462352,
     "unreplied" nil}}},
  "timestamp" 1354812979655,
  "relativeTimestamp" 22067752140875}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36255, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36255}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812462352}}},
  "timestamp" 1354812979676,
  "relativeTimestamp" 22067773048128}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36255, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36255}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812462352,
     "assured" nil}}},
  "timestamp" 1354812979697,
  "relativeTimestamp" 22067793597508}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36255, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36255}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812462352,
     "assured" nil}}},
  "timestamp" 1354812982132,
  "relativeTimestamp" 22070229039583}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36255, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36255}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812462352,
     "assured" nil}}},
  "timestamp" 1354812982158,
  "relativeTimestamp" 22070255246947}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36255, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36255}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812462352,
     "assured" nil}}},
  "timestamp" 1354812982186,
  "relativeTimestamp" 22070283162541}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36256, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36256}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812463912,
     "unreplied" nil}}},
  "timestamp" 1354812982215,
  "relativeTimestamp" 22070312103608}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36256, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36256}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812463912}}},
  "timestamp" 1354812982243,
  "relativeTimestamp" 22070339495099}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36256, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36256}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812463912,
     "assured" nil}}},
  "timestamp" 1354812982269,
  "relativeTimestamp" 22070366229144}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36256, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36256}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812463912,
     "assured" nil}}},
  "timestamp" 1354812983753,
  "relativeTimestamp" 22071849467345}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36256, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36256}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812463912,
     "assured" nil}}},
  "timestamp" 1354812983780,
  "relativeTimestamp" 22071876750488}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36256, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36256}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812463912,
     "assured" nil}}},
  "timestamp" 1354812983802,
  "relativeTimestamp" 22071899033525}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36257, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36257}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812465472,
     "unreplied" nil}}},
  "timestamp" 1354812983830,
  "relativeTimestamp" 22071926353418}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36257, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36257}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812465472}}},
  "timestamp" 1354812983851,
  "relativeTimestamp" 22071947450147}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36257, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36257}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812465472,
     "assured" nil}}},
  "timestamp" 1354812983876,
  "relativeTimestamp" 22071972806998}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36257, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36257}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812465472,
     "assured" nil}}},
  "timestamp" 1354812985515,
  "relativeTimestamp" 22073612081138}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36257, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36257}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812465472,
     "assured" nil}}},
  "timestamp" 1354812985539,
  "relativeTimestamp" 22073635960736}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36257, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36257}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812465472,
     "assured" nil}}},
  "timestamp" 1354812985562,
  "relativeTimestamp" 22073658840181}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36258, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36258}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134192760,
     "unreplied" nil}}},
  "timestamp" 1354812985585,
  "relativeTimestamp" 22073681890424}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36258, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36258}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134192760}}},
  "timestamp" 1354812985610,
  "relativeTimestamp" 22073707022603}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36258, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36258}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134192760,
     "assured" nil}}},
  "timestamp" 1354812985632,
  "relativeTimestamp" 22073729135349}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36258, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36258}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134192760,
     "assured" nil}}},
  "timestamp" 1354812987549,
  "relativeTimestamp" 22075646263175}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36258, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36258}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134192760,
     "assured" nil}}},
  "timestamp" 1354812987573,
  "relativeTimestamp" 22075669347589}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36258, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36258}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 134192760,
     "assured" nil}}},
  "timestamp" 1354812987595,
  "relativeTimestamp" 22075692116252}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36259, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36259}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584153808,
     "unreplied" nil}}},
  "timestamp" 1354812987618,
  "relativeTimestamp" 22075714768292}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36259, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36259}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584153808}}},
  "timestamp" 1354812987641,
  "relativeTimestamp" 22075737442502}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36259, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36259}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584153808,
     "assured" nil}}},
  "timestamp" 1354812987664,
  "relativeTimestamp" 22075760855188}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36259, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36259}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 584153808,
     "assured" nil}}},
  "timestamp" 1354812989521,
  "relativeTimestamp" 22077618268910}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36260, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36260}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838661928,
     "unreplied" nil}}},
  "timestamp" 1354812989547,
  "relativeTimestamp" 22077644091022}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36260, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36260}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838661928}}},
  "timestamp" 1354812989576,
  "relativeTimestamp" 22077672303329}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36260, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36260}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838661928,
     "assured" nil}}},
  "timestamp" 1354812989598,
  "relativeTimestamp" 22077695226528}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36259, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36259}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 584153808,
     "assured" nil}}},
  "timestamp" 1354812989625,
  "relativeTimestamp" 22077722038862}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36259, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36259}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 584153808, "assured" nil}}},
  "timestamp" 1354812991364,
  "relativeTimestamp" 22079460321537}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36260, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36260}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838661928,
     "assured" nil}}},
  "timestamp" 1354812991439,
  "relativeTimestamp" 22079535388190}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36260, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36260}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838661928,
     "assured" nil}}},
  "timestamp" 1354812991464,
  "relativeTimestamp" 22079560332906}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36260, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36260}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838661928,
     "assured" nil}}},
  "timestamp" 1354812991491,
  "relativeTimestamp" 22079587306154}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36261, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36261}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134190264,
     "unreplied" nil}}},
  "timestamp" 1354812991515,
  "relativeTimestamp" 22079612248828}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36261, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36261}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134190264}}},
  "timestamp" 1354812991538,
  "relativeTimestamp" 22079634614619}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36261, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36261}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134190264,
     "assured" nil}}},
  "timestamp" 1354812991561,
  "relativeTimestamp" 22079657726231}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36261, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36261}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134190264,
     "assured" nil}}},
  "timestamp" 1354812993962,
  "relativeTimestamp" 22082058544943}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36261, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36261}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134190264,
     "assured" nil}}},
  "timestamp" 1354812993984,
  "relativeTimestamp" 22082080901959}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36261, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36261}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 134190264,
     "assured" nil}}},
  "timestamp" 1354812994005,
  "relativeTimestamp" 22082102078514}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36262, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36262}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838663488,
     "unreplied" nil}}},
  "timestamp" 1354812994025,
  "relativeTimestamp" 22082121898078}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36262, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36262}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838663488}}},
  "timestamp" 1354812994046,
  "relativeTimestamp" 22082143088385}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36262, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36262}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838663488,
     "assured" nil}}},
  "timestamp" 1354812994068,
  "relativeTimestamp" 22082165196341}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36262, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36262}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838663488,
     "assured" nil}}},
  "timestamp" 1354812996427,
  "relativeTimestamp" 22084523695928}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36262, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36262}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838663488,
     "assured" nil}}},
  "timestamp" 1354812996455,
  "relativeTimestamp" 22084552127821}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36262, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36262}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838663488,
     "assured" nil}}},
  "timestamp" 1354812996481,
  "relativeTimestamp" 22084577923954}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36263, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36263}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838661304,
     "unreplied" nil}}},
  "timestamp" 1354812996511,
  "relativeTimestamp" 22084608068567}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36263, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36263}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838661304}}},
  "timestamp" 1354812996535,
  "relativeTimestamp" 22084632271920}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36263, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36263}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838661304,
     "assured" nil}}},
  "timestamp" 1354812996560,
  "relativeTimestamp" 22084657239776}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36263, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36263}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838661304,
     "assured" nil}}},
  "timestamp" 1354812998637,
  "relativeTimestamp" 22086734109115}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36263, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36263}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838661304,
     "assured" nil}}},
  "timestamp" 1354812998660,
  "relativeTimestamp" 22086756341200}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36263, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36263}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838661304,
     "assured" nil}}},
  "timestamp" 1354812998679,
  "relativeTimestamp" 22086775785529}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36264, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36264}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812461416,
     "unreplied" nil}}},
  "timestamp" 1354812998699,
  "relativeTimestamp" 22086795593634}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36264, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36264}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812461416}}},
  "timestamp" 1354812998725,
  "relativeTimestamp" 22086822279950}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36264, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36264}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812461416,
     "assured" nil}}},
  "timestamp" 1354812998750,
  "relativeTimestamp" 22086846698398}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36264, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36264}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812461416,
     "assured" nil}}},
  "timestamp" 1354813001121,
  "relativeTimestamp" 22089217970330}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36264, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36264}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812461416,
     "assured" nil}}},
  "timestamp" 1354813001146,
  "relativeTimestamp" 22089242935650}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36264, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36264}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812461416,
     "assured" nil}}},
  "timestamp" 1354813001177,
  "relativeTimestamp" 22089273987542}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36265, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36265}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812462664,
     "unreplied" nil}}},
  "timestamp" 1354813001203,
  "relativeTimestamp" 22089300054548}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36265, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36265}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812462664}}},
  "timestamp" 1354813001235,
  "relativeTimestamp" 22089331471960}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36265, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36265}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812462664,
     "assured" nil}}},
  "timestamp" 1354813001259,
  "relativeTimestamp" 22089355978759}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36259, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36259}},
    "independent" {"id" 584153808, "assured" nil}}},
  "timestamp" 1354813001363,
  "relativeTimestamp" 22089459847516}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36265, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36265}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812462664,
     "assured" nil}}},
  "timestamp" 1354813003019,
  "relativeTimestamp" 22091115996714}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36265, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36265}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812462664,
     "assured" nil}}},
  "timestamp" 1354813003040,
  "relativeTimestamp" 22091136316448}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36265, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36265}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812462664,
     "assured" nil}}},
  "timestamp" 1354813003059,
  "relativeTimestamp" 22091155511016}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36266, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36266}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812461728,
     "unreplied" nil}}},
  "timestamp" 1354813003079,
  "relativeTimestamp" 22091175604353}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36266, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36266}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812461728}}},
  "timestamp" 1354813003099,
  "relativeTimestamp" 22091196217074}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36266, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36266}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812461728,
     "assured" nil}}},
  "timestamp" 1354813003118,
  "relativeTimestamp" 22091214664547}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36266, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36266}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812461728,
     "assured" nil}}},
  "timestamp" 1354813005052,
  "relativeTimestamp" 22093149281421}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36266, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36266}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812461728,
     "assured" nil}}},
  "timestamp" 1354813005075,
  "relativeTimestamp" 22093171457348}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36266, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36266}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812461728,
     "assured" nil}}},
  "timestamp" 1354813005095,
  "relativeTimestamp" 22093192089103}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36267, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36267}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812465160,
     "unreplied" nil}}},
  "timestamp" 1354813005116,
  "relativeTimestamp" 22093212514422}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36267, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36267}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812465160}}},
  "timestamp" 1354813005137,
  "relativeTimestamp" 22093233504313}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36267, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36267}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812465160,
     "assured" nil}}},
  "timestamp" 1354813005160,
  "relativeTimestamp" 22093257220209}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36267, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36267}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812465160,
     "assured" nil}}},
  "timestamp" 1354813007361,
  "relativeTimestamp" 22095457470471}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36267, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36267}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812465160,
     "assured" nil}}},
  "timestamp" 1354813007382,
  "relativeTimestamp" 22095478793721}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36267, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36267}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812465160,
     "assured" nil}}},
  "timestamp" 1354813007405,
  "relativeTimestamp" 22095502119948}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36268, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36268}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838662240,
     "unreplied" nil}}},
  "timestamp" 1354813007433,
  "relativeTimestamp" 22095530085401}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36268, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36268}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838662240}}},
  "timestamp" 1354813007458,
  "relativeTimestamp" 22095554789347}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36268, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36268}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838662240,
     "assured" nil}}},
  "timestamp" 1354813007481,
  "relativeTimestamp" 22095578226034}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36268, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36268}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838662240,
     "assured" nil}}},
  "timestamp" 1354813009412,
  "relativeTimestamp" 22097508635683}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36268, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36268}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838662240,
     "assured" nil}}},
  "timestamp" 1354813009433,
  "relativeTimestamp" 22097529616250}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36268, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36268}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838662240,
     "assured" nil}}},
  "timestamp" 1354813009452,
  "relativeTimestamp" 22097548765501}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36269, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36269}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812461104,
     "unreplied" nil}}},
  "timestamp" 1354813009474,
  "relativeTimestamp" 22097570969226}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36269, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36269}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812461104}}},
  "timestamp" 1354813009499,
  "relativeTimestamp" 22097596094940}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36269, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36269}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812461104,
     "assured" nil}}},
  "timestamp" 1354813009523,
  "relativeTimestamp" 22097620171693}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36269, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36269}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812461104,
     "assured" nil}}},
  "timestamp" 1354813011405,
  "relativeTimestamp" 22099501897532}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36269, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36269}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812461104,
     "assured" nil}}},
  "timestamp" 1354813011427,
  "relativeTimestamp" 22099524240121}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36269, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36269}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812461104,
     "assured" nil}}},
  "timestamp" 1354813011447,
  "relativeTimestamp" 22099543941045}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36270, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36270}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838657872,
     "unreplied" nil}}},
  "timestamp" 1354813011466,
  "relativeTimestamp" 22099562934999}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36270, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36270}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838657872}}},
  "timestamp" 1354813011487,
  "relativeTimestamp" 22099584134227}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36270, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36270}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838657872,
     "assured" nil}}},
  "timestamp" 1354813011516,
  "relativeTimestamp" 22099612570113}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36270, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36270}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838657872,
     "assured" nil}}},
  "timestamp" 1354813014009,
  "relativeTimestamp" 22102105720734}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36270, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36270}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838657872,
     "assured" nil}}},
  "timestamp" 1354813014034,
  "relativeTimestamp" 22102130681789}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36270, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36270}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838657872,
     "assured" nil}}},
  "timestamp" 1354813014060,
  "relativeTimestamp" 22102156385650}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36271, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36271}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838662552,
     "unreplied" nil}}},
  "timestamp" 1354813014084,
  "relativeTimestamp" 22102181290388}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36271, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36271}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838662552}}},
  "timestamp" 1354813014109,
  "relativeTimestamp" 22102205656522}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36271, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36271}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838662552,
     "assured" nil}}},
  "timestamp" 1354813014132,
  "relativeTimestamp" 22102228731338}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36271, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36271}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838662552,
     "assured" nil}}},
  "timestamp" 1354813015888,
  "relativeTimestamp" 22103984612858}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36271, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36271}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 838662552,
     "assured" nil}}},
  "timestamp" 1354813015913,
  "relativeTimestamp" 22104009775828}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36271, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36271}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 838662552,
     "assured" nil}}},
  "timestamp" 1354813015938,
  "relativeTimestamp" 22104034842102}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36272, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36272}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584153808,
     "unreplied" nil}}},
  "timestamp" 1354813015965,
  "relativeTimestamp" 22104061306548}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36272, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36272}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584153808}}},
  "timestamp" 1354813015992,
  "relativeTimestamp" 22104088888007}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36272, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36272}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584153808,
     "assured" nil}}},
  "timestamp" 1354813016016,
  "relativeTimestamp" 22104113023545}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 59450, "dport" 631}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 631, "dport" 59450}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838663176,
     "unreplied" nil}}},
  "timestamp" 1354813018034,
  "relativeTimestamp" 22106131057533}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36272, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36272}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 584153808,
     "assured" nil}}},
  "timestamp" 1354813018376,
  "relativeTimestamp" 22106472355954}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36272, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36272}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 584153808,
     "assured" nil}}},
  "timestamp" 1354813018396,
  "relativeTimestamp" 22106493049429}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36272, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36272}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 584153808,
     "assured" nil}}},
  "timestamp" 1354813018416,
  "relativeTimestamp" 22106513288319}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36274, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36274}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812460792,
     "unreplied" nil}}},
  "timestamp" 1354813018435,
  "relativeTimestamp" 22106531918686}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36274, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36274}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812460792}}},
  "timestamp" 1354813018456,
  "relativeTimestamp" 22106553014392}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36274, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36274}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812460792,
     "assured" nil}}},
  "timestamp" 1354813018474,
  "relativeTimestamp" 22106571126038}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36274, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36274}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812460792,
     "assured" nil}}},
  "timestamp" 1354813019939,
  "relativeTimestamp" 22108035486003}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36274, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36274}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812460792,
     "assured" nil}}},
  "timestamp" 1354813019960,
  "relativeTimestamp" 22108056984962}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36274, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36274}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812460792,
     "assured" nil}}},
  "timestamp" 1354813019979,
  "relativeTimestamp" 22108075741556}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36275, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36275}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584151936,
     "unreplied" nil}}},
  "timestamp" 1354813020002,
  "relativeTimestamp" 22108099283693}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36275, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36275}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584151936}}},
  "timestamp" 1354813020023,
  "relativeTimestamp" 22108120051519}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36275, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36275}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584151936,
     "assured" nil}}},
  "timestamp" 1354813020048,
  "relativeTimestamp" 22108144389579}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36275, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36275}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 584151936,
     "assured" nil}}},
  "timestamp" 1354813021975,
  "relativeTimestamp" 22110071507075}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36275, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36275}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 584151936,
     "assured" nil}}},
  "timestamp" 1354813021998,
  "relativeTimestamp" 22110095105360}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36275, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36275}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 584151936,
     "assured" nil}}},
  "timestamp" 1354813022019,
  "relativeTimestamp" 22110115617120}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36276, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36276}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812462976,
     "unreplied" nil}}},
  "timestamp" 1354813022038,
  "relativeTimestamp" 22110134669027}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36276, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36276}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812462976}}},
  "timestamp" 1354813022056,
  "relativeTimestamp" 22110152969742}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36276, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36276}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812462976,
     "assured" nil}}},
  "timestamp" 1354813022074,
  "relativeTimestamp" 22110170681843}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36276, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36276}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812462976,
     "assured" nil}}},
  "timestamp" 1354813024282,
  "relativeTimestamp" 22112378688505}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36276, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36276}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812462976,
     "assured" nil}}},
  "timestamp" 1354813024304,
  "relativeTimestamp" 22112400948737}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36276, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36276}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812462976,
     "assured" nil}}},
  "timestamp" 1354813024323,
  "relativeTimestamp" 22112419352211}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36277, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36277}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134185584,
     "unreplied" nil}}},
  "timestamp" 1354813024341,
  "relativeTimestamp" 22112437795520}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36277, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36277}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134185584}}},
  "timestamp" 1354813024360,
  "relativeTimestamp" 22112456983829}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36277, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36277}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134185584,
     "assured" nil}}},
  "timestamp" 1354813024379,
  "relativeTimestamp" 22112476110971}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36277, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36277}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134185584,
     "assured" nil}}},
  "timestamp" 1354813026003,
  "relativeTimestamp" 22114099911958}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36278, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36278}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134189016,
     "unreplied" nil}}},
  "timestamp" 1354813026026,
  "relativeTimestamp" 22114123258650}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36278, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36278}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134189016}}},
  "timestamp" 1354813026048,
  "relativeTimestamp" 22114144494672}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36278, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36278}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134189016,
     "assured" nil}}},
  "timestamp" 1354813026070,
  "relativeTimestamp" 22114166691063}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36277, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36277}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 134185584,
     "assured" nil}}},
  "timestamp" 1354813026096,
  "relativeTimestamp" 22114192734555}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36277, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36277}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 134185584, "assured" nil}}},
  "timestamp" 1354813027784,
  "relativeTimestamp" 22115880528454}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36278, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36278}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134189016,
     "assured" nil}}},
  "timestamp" 1354813027866,
  "relativeTimestamp" 22115963242718}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36278, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36278}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 134189016,
     "assured" nil}}},
  "timestamp" 1354813027889,
  "relativeTimestamp" 22115985807565}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36278, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36278}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 134189016,
     "assured" nil}}},
  "timestamp" 1354813027913,
  "relativeTimestamp" 22116009455558}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36279, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36279}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812457984,
     "unreplied" nil}}},
  "timestamp" 1354813027936,
  "relativeTimestamp" 22116032944864}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36279, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36279}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812457984}}},
  "timestamp" 1354813027960,
  "relativeTimestamp" 22116056646572}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36279, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36279}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812457984,
     "assured" nil}}},
  "timestamp" 1354813027984,
  "relativeTimestamp" 22116080430466}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36279, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36279}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812457984,
     "assured" nil}}},
  "timestamp" 1354813029998,
  "relativeTimestamp" 22118094591781}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36279, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36279}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812457984,
     "assured" nil}}},
  "timestamp" 1354813030020,
  "relativeTimestamp" 22118116694413}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36279, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36279}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812457984,
     "assured" nil}}},
  "timestamp" 1354813030040,
  "relativeTimestamp" 22118136670267}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36280, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36280}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584148816,
     "unreplied" nil}}},
  "timestamp" 1354813030064,
  "relativeTimestamp" 22118160951876}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36280, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36280}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584148816}}},
  "timestamp" 1354813030084,
  "relativeTimestamp" 22118180951737}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36280, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36280}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584148816,
     "assured" nil}}},
  "timestamp" 1354813030103,
  "relativeTimestamp" 22118199826940}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36280, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36280}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 584148816,
     "assured" nil}}},
  "timestamp" 1354813032740,
  "relativeTimestamp" 22120837235137}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36280, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36280}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 584148816,
     "assured" nil}}},
  "timestamp" 1354813032761,
  "relativeTimestamp" 22120857567181}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36280, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36280}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 584148816,
     "assured" nil}}},
  "timestamp" 1354813032779,
  "relativeTimestamp" 22120875619388}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36281, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36281}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134185896,
     "unreplied" nil}}},
  "timestamp" 1354813032797,
  "relativeTimestamp" 22120893483415}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36281, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36281}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134185896}}},
  "timestamp" 1354813032815,
  "relativeTimestamp" 22120911372090}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36281, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36281}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134185896,
     "assured" nil}}},
  "timestamp" 1354813032833,
  "relativeTimestamp" 22120929472556}}
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
     "timeout" 433259,
     "id" 584153184,
     "unreplied" nil}}},
  "timestamp" 1354813034552,
  "relativeTimestamp" 22122648331558}}
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
    "independent" {"timeout" 432000, "id" 584153184}}},
  "timestamp" 1354813034595,
  "relativeTimestamp" 22122691410348}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36281, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36281}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134185896,
     "assured" nil}}},
  "timestamp" 1354813034895,
  "relativeTimestamp" 22122991458402}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36282, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36282}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812458608,
     "unreplied" nil}}},
  "timestamp" 1354813034928,
  "relativeTimestamp" 22123024797841}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36282, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36282}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812458608}}},
  "timestamp" 1354813034949,
  "relativeTimestamp" 22123045938676}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36282, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36282}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812458608,
     "assured" nil}}},
  "timestamp" 1354813034970,
  "relativeTimestamp" 22123066341739}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36281, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36281}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 134185896,
     "assured" nil}}},
  "timestamp" 1354813034989,
  "relativeTimestamp" 22123086110775}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36281, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36281}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 134185896, "assured" nil}}},
  "timestamp" 1354813037578,
  "relativeTimestamp" 22125675219133}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36282, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36282}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812458608,
     "assured" nil}}},
  "timestamp" 1354813037651,
  "relativeTimestamp" 22125747431179}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36282, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36282}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812458608,
     "assured" nil}}},
  "timestamp" 1354813037671,
  "relativeTimestamp" 22125768031522}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36282, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36282}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812458608,
     "assured" nil}}},
  "timestamp" 1354813037689,
  "relativeTimestamp" 22125785882689}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36283, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36283}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584154120,
     "unreplied" nil}}},
  "timestamp" 1354813037708,
  "relativeTimestamp" 22125804828058}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36283, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36283}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584154120}}},
  "timestamp" 1354813037726,
  "relativeTimestamp" 22125822807217}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36283, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36283}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584154120,
     "assured" nil}}},
  "timestamp" 1354813037743,
  "relativeTimestamp" 22125839955071}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36277, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36277}},
    "independent" {"id" 134185584, "assured" nil}}},
  "timestamp" 1354813037783,
  "relativeTimestamp" 22125879787395}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "205.188.17.193"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 49299, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "205.188.17.193",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 49299}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134192136,
     "unreplied" nil}}},
  "timestamp" 1354813038256,
  "relativeTimestamp" 22126353037453}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "205.188.17.193"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 49299, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "205.188.17.193",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 49299}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134192136}}},
  "timestamp" 1354813038362,
  "relativeTimestamp" 22126458460880}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "205.188.17.193"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 49299, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "205.188.17.193",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 49299}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134192136,
     "assured" nil}}},
  "timestamp" 1354813038384,
  "relativeTimestamp" 22126480712929}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36283, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36283}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 584154120,
     "assured" nil}}},
  "timestamp" 1354813039490,
  "relativeTimestamp" 22127586316271}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36285, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36285}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812458296,
     "unreplied" nil}}},
  "timestamp" 1354813039516,
  "relativeTimestamp" 22127612980351}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36285, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36285}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812458296}}},
  "timestamp" 1354813039543,
  "relativeTimestamp" 22127639861104}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36285, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36285}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812458296,
     "assured" nil}}},
  "timestamp" 1354813039571,
  "relativeTimestamp" 22127668203150}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36283, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36283}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 584154120,
     "assured" nil}}},
  "timestamp" 1354813039595,
  "relativeTimestamp" 22127691736277}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36283, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36283}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 584154120, "assured" nil}}},
  "timestamp" 1354813041527,
  "relativeTimestamp" 22129624023136}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36285, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36285}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812458296,
     "assured" nil}}},
  "timestamp" 1354813041603,
  "relativeTimestamp" 22129699912507}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36285, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36285}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812458296,
     "assured" nil}}},
  "timestamp" 1354813041624,
  "relativeTimestamp" 22129720801923}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36285, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36285}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812458296,
     "assured" nil}}},
  "timestamp" 1354813041646,
  "relativeTimestamp" 22129743257453}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36286, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36286}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812460480,
     "unreplied" nil}}},
  "timestamp" 1354813041664,
  "relativeTimestamp" 22129760733711}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36286, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36286}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812460480}}},
  "timestamp" 1354813041682,
  "relativeTimestamp" 22129778299617}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36286, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36286}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812460480,
     "assured" nil}}},
  "timestamp" 1354813041699,
  "relativeTimestamp" 22129795575006}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36286, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36286}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812460480,
     "assured" nil}}},
  "timestamp" 1354813044326,
  "relativeTimestamp" 22132422618018}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36286, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36286}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812460480,
     "assured" nil}}},
  "timestamp" 1354813044353,
  "relativeTimestamp" 22132449834267}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36286, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36286}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812460480,
     "assured" nil}}},
  "timestamp" 1354813044380,
  "relativeTimestamp" 22132477037668}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36287, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36287}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584149440,
     "unreplied" nil}}},
  "timestamp" 1354813044402,
  "relativeTimestamp" 22132498782265}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36287, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36287}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584149440}}},
  "timestamp" 1354813044423,
  "relativeTimestamp" 22132519491399}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36287, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36287}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584149440,
     "assured" nil}}},
  "timestamp" 1354813044455,
  "relativeTimestamp" 22132551510534}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36287, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36287}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 584149440,
     "assured" nil}}},
  "timestamp" 1354813046459,
  "relativeTimestamp" 22134555933770}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36288, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36288}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812464536,
     "unreplied" nil}}},
  "timestamp" 1354813046481,
  "relativeTimestamp" 22134577462897}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36288, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36288}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812464536}}},
  "timestamp" 1354813046502,
  "relativeTimestamp" 22134598962689}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36288, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36288}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812464536,
     "assured" nil}}},
  "timestamp" 1354813046525,
  "relativeTimestamp" 22134621665495}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36287, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36287}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 584149440,
     "assured" nil}}},
  "timestamp" 1354813046548,
  "relativeTimestamp" 22134645270870}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36281, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36281}},
    "independent" {"id" 134185896, "assured" nil}}},
  "timestamp" 1354813047578,
  "relativeTimestamp" 22135674293035}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36287, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36287}},
    "independent"
    {"state" "CLOSE", "timeout" 9, "id" 584149440, "assured" nil}}},
  "timestamp" 1354813048793,
  "relativeTimestamp" 22136889532194}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36288, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36288}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812464536,
     "assured" nil}}},
  "timestamp" 1354813048868,
  "relativeTimestamp" 22136964640385}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36288, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36288}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812464536,
     "assured" nil}}},
  "timestamp" 1354813048889,
  "relativeTimestamp" 22136985293051}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36288, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36288}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812464536,
     "assured" nil}}},
  "timestamp" 1354813048909,
  "relativeTimestamp" 22137005541615}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36289, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36289}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838656000,
     "unreplied" nil}}},
  "timestamp" 1354813048928,
  "relativeTimestamp" 22137024564309}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36289, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36289}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838656000}}},
  "timestamp" 1354813048951,
  "relativeTimestamp" 22137047962247}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36289, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36289}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838656000,
     "assured" nil}}},
  "timestamp" 1354813048970,
  "relativeTimestamp" 22137066769447}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36289, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36289}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 838656000,
     "assured" nil}}},
  "timestamp" 1354813049028,
  "relativeTimestamp" 22137124821263}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36289, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36289}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 838656000,
     "assured" nil}}},
  "timestamp" 1354813049068,
  "relativeTimestamp" 22137164370772}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36289, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36289}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 838656000, "assured" nil}}},
  "timestamp" 1354813050547,
  "relativeTimestamp" 22138643567924}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36283, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36283}},
    "independent" {"id" 584154120, "assured" nil}}},
  "timestamp" 1354813051526,
  "relativeTimestamp" 22139623134009}}
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
    "independent" {"timeout" 432000, "id" 584153184, "assured" nil}}},
  "timestamp" 1354813051689,
  "relativeTimestamp" 22139786283810}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36237, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36237}},
    "independent" {"id" 812459856, "assured" nil}}},
  "timestamp" 1354813052682,
  "relativeTimestamp" 22140779145203}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36287, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36287}},
    "independent" {"id" 584149440, "assured" nil}}},
  "timestamp" 1354813058791,
  "relativeTimestamp" 22146888236834}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36289, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36289}},
    "independent" {"id" 838656000, "assured" nil}}},
  "timestamp" 1354813060546,
  "relativeTimestamp" 22148643210750}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36238, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36238}},
    "independent" {"id" 812464848, "assured" nil}}},
  "timestamp" 1354813067518,
  "relativeTimestamp" 22155615204422}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36239, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36239}},
    "independent" {"id" 134188080, "assured" nil}}},
  "timestamp" 1354813069333,
  "relativeTimestamp" 22157430165560}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36240, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36240}},
    "independent" {"id" 134187456, "assured" nil}}},
  "timestamp" 1354813071759,
  "relativeTimestamp" 22159856118994}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36241, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36241}},
    "independent" {"id" 584147880, "assured" nil}}},
  "timestamp" 1354813073793,
  "relativeTimestamp" 22161890218214}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36242, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36242}},
    "independent" {"id" 838660680, "assured" nil}}},
  "timestamp" 1354813075766,
  "relativeTimestamp" 22163862311654}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 59413, "dport" 631}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 631, "dport" 59413}},
    "independent" {"id" 812459544, "unreplied" nil}}},
  "timestamp" 1354813075970,
  "relativeTimestamp" 22164067149681}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36243, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36243}},
    "independent" {"id" 838659432, "assured" nil}}},
  "timestamp" 1354813078013,
  "relativeTimestamp" 22166110147096}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36244, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36244}},
    "independent" {"id" 134186208, "assured" nil}}},
  "timestamp" 1354813080540,
  "relativeTimestamp" 22168636959169}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36245, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36245}},
    "independent" {"id" 812458920, "assured" nil}}},
  "timestamp" 1354813082809,
  "relativeTimestamp" 22170906100018}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36247, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36247}},
    "independent" {"id" 812462040, "assured" nil}}},
  "timestamp" 1354813086500,
  "relativeTimestamp" 22174597106549}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36249, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36249}},
    "independent" {"id" 812463600, "assured" nil}}},
  "timestamp" 1354813088593,
  "relativeTimestamp" 22176690140568}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36250, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36250}},
    "independent" {"id" 838660056, "assured" nil}}},
  "timestamp" 1354813091293,
  "relativeTimestamp" 22179390092780}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36251, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36251}},
    "independent" {"id" 812463288, "assured" nil}}},
  "timestamp" 1354813093071,
  "relativeTimestamp" 22181168100544}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36252, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36252}},
    "independent" {"id" 812460168, "assured" nil}}},
  "timestamp" 1354813095321,
  "relativeTimestamp" 22183418127976}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36253, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36253}},
    "independent" {"id" 838657248, "assured" nil}}},
  "timestamp" 1354813097318,
  "relativeTimestamp" 22185415121248}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36254, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36254}},
    "independent" {"id" 838658808, "assured" nil}}},
  "timestamp" 1354813099589,
  "relativeTimestamp" 22187686106023}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36255, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36255}},
    "independent" {"id" 812462352, "assured" nil}}},
  "timestamp" 1354813102131,
  "relativeTimestamp" 22190228183501}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36256, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36256}},
    "independent" {"id" 812463912, "assured" nil}}},
  "timestamp" 1354813103752,
  "relativeTimestamp" 22191849170253}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36257, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36257}},
    "independent" {"id" 812465472, "assured" nil}}},
  "timestamp" 1354813105514,
  "relativeTimestamp" 22193611035927}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36258, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36258}},
    "independent" {"id" 134192760, "assured" nil}}},
  "timestamp" 1354813107550,
  "relativeTimestamp" 22195646661880}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 59467, "dport" 631}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 631, "dport" 59467}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838662864,
     "unreplied" nil}}},
  "timestamp" 1354813111154,
  "relativeTimestamp" 22199250529504}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36260, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36260}},
    "independent" {"id" 838661928, "assured" nil}}},
  "timestamp" 1354813111439,
  "relativeTimestamp" 22199535987134}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36261, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36261}},
    "independent" {"id" 134190264, "assured" nil}}},
  "timestamp" 1354813113961,
  "relativeTimestamp" 22202058036905}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36262, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36262}},
    "independent" {"id" 838663488, "assured" nil}}},
  "timestamp" 1354813116425,
  "relativeTimestamp" 22204522028217}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36263, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36263}},
    "independent" {"id" 838661304, "assured" nil}}},
  "timestamp" 1354813118637,
  "relativeTimestamp" 22206734090508}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36264, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36264}},
    "independent" {"id" 812461416, "assured" nil}}},
  "timestamp" 1354813121121,
  "relativeTimestamp" 22209218035486}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36265, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36265}},
    "independent" {"id" 812462664, "assured" nil}}},
  "timestamp" 1354813123019,
  "relativeTimestamp" 22211116115201}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36266, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36266}},
    "independent" {"id" 812461728, "assured" nil}}},
  "timestamp" 1354813125052,
  "relativeTimestamp" 22213149162066}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36267, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36267}},
    "independent" {"id" 812465160, "assured" nil}}},
  "timestamp" 1354813127360,
  "relativeTimestamp" 22215457026852}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36268, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36268}},
    "independent" {"id" 838662240, "assured" nil}}},
  "timestamp" 1354813129411,
  "relativeTimestamp" 22217508014133}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36269, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36269}},
    "independent" {"id" 812461104, "assured" nil}}},
  "timestamp" 1354813131405,
  "relativeTimestamp" 22219502079856}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36270, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36270}},
    "independent" {"id" 838657872, "assured" nil}}},
  "timestamp" 1354813134008,
  "relativeTimestamp" 22222105032127}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36271, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36271}},
    "independent" {"id" 838662552, "assured" nil}}},
  "timestamp" 1354813135887,
  "relativeTimestamp" 22223984098876}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36272, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36272}},
    "independent" {"id" 584153808, "assured" nil}}},
  "timestamp" 1354813138375,
  "relativeTimestamp" 22226472039679}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36274, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36274}},
    "independent" {"id" 812460792, "assured" nil}}},
  "timestamp" 1354813139938,
  "relativeTimestamp" 22228035050110}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36275, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36275}},
    "independent" {"id" 584151936, "assured" nil}}},
  "timestamp" 1354813141974,
  "relativeTimestamp" 22230070630577}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36276, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36276}},
    "independent" {"id" 812462976, "assured" nil}}},
  "timestamp" 1354813144282,
  "relativeTimestamp" 22232379083428}}
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
     {"protonum" 17, "protoname" "udp", "sport" 33012, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 33012}},
    "independent" {"id" 134187768, "assured" nil}}},
  "timestamp" 1354813146359,
  "relativeTimestamp" 22234456040838}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36278, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36278}},
    "independent" {"id" 134189016, "assured" nil}}},
  "timestamp" 1354813147866,
  "relativeTimestamp" 22235963014335}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36279, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36279}},
    "independent" {"id" 812457984, "assured" nil}}},
  "timestamp" 1354813149998,
  "relativeTimestamp" 22238094840516}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36280, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36280}},
    "independent" {"id" 584148816, "assured" nil}}},
  "timestamp" 1354813152740,
  "relativeTimestamp" 22240837022593}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36282, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36282}},
    "independent" {"id" 812458608, "assured" nil}}},
  "timestamp" 1354813157651,
  "relativeTimestamp" 22245748015499}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36285, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36285}},
    "independent" {"id" 812458296, "assured" nil}}},
  "timestamp" 1354813161603,
  "relativeTimestamp" 22249700037388}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36286, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36286}},
    "independent" {"id" 812460480, "assured" nil}}},
  "timestamp" 1354813164325,
  "relativeTimestamp" 22252422273554}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36288, "dport" 22}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 22, "dport" 36288}},
    "independent" {"id" 812464536, "assured" nil}}},
  "timestamp" 1354813168868,
  "relativeTimestamp" 22256965102845}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 59450, "dport" 631}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 631, "dport" 59450}},
    "independent" {"id" 838663176, "unreplied" nil}}},
  "timestamp" 1354813169089,
  "relativeTimestamp" 22257186157184}}
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
     {"protonum" 17, "protoname" "udp", "sport" 55247, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 55247}},
    "independent" {"timeout" 30, "id" 812459544, "unreplied" nil}}},
  "timestamp" 1354813200494,
  "relativeTimestamp" 22288590827475}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 55247, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 55247}},
    "independent" {"timeout" 30, "id" 812459544}}},
  "timestamp" 1354813200513,
  "relativeTimestamp" 22288609797928}}
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
     {"protonum" 17, "protoname" "udp", "sport" 35058, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 35058}},
    "independent" {"timeout" 30, "id" 812465784, "unreplied" nil}}},
  "timestamp" 1354813200533,
  "relativeTimestamp" 22288630148592}}
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
     {"protonum" 17, "protoname" "udp", "sport" 45098, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 45098}},
    "independent" {"timeout" 30, "id" 584148816, "unreplied" nil}}},
  "timestamp" 1354813200553,
  "relativeTimestamp" 22288650273097}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 45098, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 45098}},
    "independent" {"timeout" 29, "id" 584148816}}},
  "timestamp" 1354813200571,
  "relativeTimestamp" 22288667661195}}
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
     {"protonum" 17, "protoname" "udp", "sport" 54408, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 54408}},
    "independent" {"timeout" 30, "id" 584151936, "unreplied" nil}}},
  "timestamp" 1354813200592,
  "relativeTimestamp" 22288688398316}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 54408, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 54408}},
    "independent" {"timeout" 30, "id" 584151936}}},
  "timestamp" 1354813200613,
  "relativeTimestamp" 22288709866072}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 35058, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 35058}},
    "independent" {"timeout" 29, "id" 812465784}}},
  "timestamp" 1354813200635,
  "relativeTimestamp" 22288732224438}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 35058, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 35058}},
    "independent" {"timeout" 180, "id" 812465784, "assured" nil}}},
  "timestamp" 1354813200653,
  "relativeTimestamp" 22288749615898}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35341, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35341}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584153808,
     "unreplied" nil}}},
  "timestamp" 1354813200673,
  "relativeTimestamp" 22288769422169}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35342, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35342}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584147880,
     "unreplied" nil}}},
  "timestamp" 1354813200696,
  "relativeTimestamp" 22288792982716}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35343, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35343}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584149440,
     "unreplied" nil}}},
  "timestamp" 1354813200719,
  "relativeTimestamp" 22288815408206}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35344, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35344}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584154120,
     "unreplied" nil}}},
  "timestamp" 1354813200741,
  "relativeTimestamp" 22288837766886}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35345, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35345}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584151000,
     "unreplied" nil}}},
  "timestamp" 1354813200763,
  "relativeTimestamp" 22288860172899}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35346, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35346}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584147568,
     "unreplied" nil}}},
  "timestamp" 1354813200787,
  "relativeTimestamp" 22288883795625}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35342, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35342}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584147880}}},
  "timestamp" 1354813200809,
  "relativeTimestamp" 22288906010893}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35342, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35342}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584147880,
     "assured" nil}}},
  "timestamp" 1354813200831,
  "relativeTimestamp" 22288927478426}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35346, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35346}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584147568}}},
  "timestamp" 1354813200853,
  "relativeTimestamp" 22288950024557}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35346, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35346}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584147568,
     "assured" nil}}},
  "timestamp" 1354813200877,
  "relativeTimestamp" 22288973462372}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35341, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35341}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584153808}}},
  "timestamp" 1354813200899,
  "relativeTimestamp" 22288995813681}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35341, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35341}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584153808,
     "assured" nil}}},
  "timestamp" 1354813200919,
  "relativeTimestamp" 22289015919345}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35343, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35343}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584149440}}},
  "timestamp" 1354813200941,
  "relativeTimestamp" 22289038136327}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35343, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35343}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584149440,
     "assured" nil}}},
  "timestamp" 1354813200959,
  "relativeTimestamp" 22289055853124}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35345, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35345}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584151000}}},
  "timestamp" 1354813200978,
  "relativeTimestamp" 22289074988666}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35345, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35345}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584151000,
     "assured" nil}}},
  "timestamp" 1354813200998,
  "relativeTimestamp" 22289094908340}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35344, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35344}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584154120}}},
  "timestamp" 1354813201020,
  "relativeTimestamp" 22289117231210}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35344, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35344}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584154120,
     "assured" nil}}},
  "timestamp" 1354813201041,
  "relativeTimestamp" 22289137776875}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 45098, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 45098}},
    "independent" {"timeout" 180, "id" 584148816, "assured" nil}}},
  "timestamp" 1354813201063,
  "relativeTimestamp" 22289159815473}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 54408, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 54408}},
    "independent" {"timeout" 180, "id" 584151936, "assured" nil}}},
  "timestamp" 1354813201084,
  "relativeTimestamp" 22289180910472}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47812, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47812}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812464224,
     "unreplied" nil}}},
  "timestamp" 1354813201110,
  "relativeTimestamp" 22289206305412}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47813, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47813}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812459232,
     "unreplied" nil}}},
  "timestamp" 1354813201133,
  "relativeTimestamp" 22289230079335}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47814, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47814}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812464536,
     "unreplied" nil}}},
  "timestamp" 1354813201153,
  "relativeTimestamp" 22289249305458}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47815, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47815}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812460480,
     "unreplied" nil}}},
  "timestamp" 1354813201172,
  "relativeTimestamp" 22289268759242}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47816, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47816}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812458296,
     "unreplied" nil}}},
  "timestamp" 1354813201191,
  "relativeTimestamp" 22289287498181}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47817, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47817}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812458608,
     "unreplied" nil}}},
  "timestamp" 1354813201212,
  "relativeTimestamp" 22289308514385}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37564, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37564}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812457984,
     "unreplied" nil}}},
  "timestamp" 1354813201236,
  "relativeTimestamp" 22289332470912}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37565, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37565}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812462976,
     "unreplied" nil}}},
  "timestamp" 1354813201263,
  "relativeTimestamp" 22289360060439}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37566, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37566}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812460792,
     "unreplied" nil}}},
  "timestamp" 1354813201282,
  "relativeTimestamp" 22289379271678}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37567, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37567}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812461104,
     "unreplied" nil}}},
  "timestamp" 1354813201302,
  "relativeTimestamp" 22289399049330}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37568, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37568}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812465160,
     "unreplied" nil}}},
  "timestamp" 1354813201321,
  "relativeTimestamp" 22289417985028}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37569, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37569}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812461728,
     "unreplied" nil}}},
  "timestamp" 1354813201339,
  "relativeTimestamp" 22289435871257}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47812, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47812}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812464224}}},
  "timestamp" 1354813201357,
  "relativeTimestamp" 22289453622201}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47812, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47812}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812464224,
     "assured" nil}}},
  "timestamp" 1354813201374,
  "relativeTimestamp" 22289470679644}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47813, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47813}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812459232}}},
  "timestamp" 1354813201398,
  "relativeTimestamp" 22289494731606}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47813, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47813}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812459232,
     "assured" nil}}},
  "timestamp" 1354813201419,
  "relativeTimestamp" 22289515385855}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47814, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47814}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812464536}}},
  "timestamp" 1354813201448,
  "relativeTimestamp" 22289544750191}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47814, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47814}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812464536,
     "assured" nil}}},
  "timestamp" 1354813201468,
  "relativeTimestamp" 22289565068888}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47815, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47815}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812460480}}},
  "timestamp" 1354813201492,
  "relativeTimestamp" 22289588311796}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47815, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47815}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812460480,
     "assured" nil}}},
  "timestamp" 1354813201512,
  "relativeTimestamp" 22289608570110}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47816, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47816}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812458296}}},
  "timestamp" 1354813201534,
  "relativeTimestamp" 22289631120979}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47816, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47816}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812458296,
     "assured" nil}}},
  "timestamp" 1354813201554,
  "relativeTimestamp" 22289650989340}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47817, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47817}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812458608}}},
  "timestamp" 1354813201575,
  "relativeTimestamp" 22289671426255}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47817, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47817}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812458608,
     "assured" nil}}},
  "timestamp" 1354813201599,
  "relativeTimestamp" 22289695801348}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37564, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37564}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812457984}}},
  "timestamp" 1354813201617,
  "relativeTimestamp" 22289714174702}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37564, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37564}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812457984,
     "assured" nil}}},
  "timestamp" 1354813201636,
  "relativeTimestamp" 22289732436882}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37566, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37566}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812460792}}},
  "timestamp" 1354813201658,
  "relativeTimestamp" 22289755117363}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37566, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37566}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812460792,
     "assured" nil}}},
  "timestamp" 1354813201677,
  "relativeTimestamp" 22289774248270}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37565, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37565}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812462976}}},
  "timestamp" 1354813201696,
  "relativeTimestamp" 22289793188865}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37565, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37565}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812462976,
     "assured" nil}}},
  "timestamp" 1354813201714,
  "relativeTimestamp" 22289810931450}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37567, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37567}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812461104}}},
  "timestamp" 1354813201732,
  "relativeTimestamp" 22289828920876}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37567, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37567}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812461104,
     "assured" nil}}},
  "timestamp" 1354813201750,
  "relativeTimestamp" 22289846847654}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37568, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37568}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812465160}}},
  "timestamp" 1354813201771,
  "relativeTimestamp" 22289867378919}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37568, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37568}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812465160,
     "assured" nil}}},
  "timestamp" 1354813201792,
  "relativeTimestamp" 22289889110497}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37569, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37569}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812461728}}},
  "timestamp" 1354813201811,
  "relativeTimestamp" 22289907485873}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37569, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37569}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812461728,
     "assured" nil}}},
  "timestamp" 1354813201829,
  "relativeTimestamp" 22289925683940}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 55247, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 55247}},
    "independent" {"timeout" 180, "id" 812459544, "assured" nil}}},
  "timestamp" 1354813201848,
  "relativeTimestamp" 22289944776332}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "178.236.6.250"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 53582, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "178.236.6.250",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 53582}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584150376,
     "unreplied" nil}}},
  "timestamp" 1354813201869,
  "relativeTimestamp" 22289965432617}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 34360, "dport" 143}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "194.95.81.200",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 143, "dport" 34360}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 433093,
     "id" 584150688,
     "unreplied" nil}}},
  "timestamp" 1354813201887,
  "relativeTimestamp" 22289983669526}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 34360, "dport" 143}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "194.95.81.200",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 143, "dport" 34360}},
    "independent" {"timeout" 432000, "id" 584150688}}},
  "timestamp" 1354813201912,
  "relativeTimestamp" 22290008426581}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 34360, "dport" 143}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "194.95.81.200",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 143, "dport" 34360}},
    "independent" {"timeout" 432000, "id" 584150688, "assured" nil}}},
  "timestamp" 1354813201934,
  "relativeTimestamp" 22290030684879}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "178.236.6.250"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 53582, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "178.236.6.250",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 53582}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584150376}}},
  "timestamp" 1354813201955,
  "relativeTimestamp" 22290051800971}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "178.236.6.250"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 53582, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "178.236.6.250",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 53582}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584150376,
     "assured" nil}}},
  "timestamp" 1354813201980,
  "relativeTimestamp" 22290077176053}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 35677, "dport" 993}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.227.17.170",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 993, "dport" 35677}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 433092,
     "id" 134189328,
     "unreplied" nil}}},
  "timestamp" 1354813202003,
  "relativeTimestamp" 22290099661032}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 35677, "dport" 993}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.227.17.170",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 993, "dport" 35677}},
    "independent" {"timeout" 432000, "id" 134189328}}},
  "timestamp" 1354813202024,
  "relativeTimestamp" 22290121161477}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 35677, "dport" 993}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.227.17.170",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 993, "dport" 35677}},
    "independent" {"timeout" 432000, "id" 134189328, "assured" nil}}},
  "timestamp" 1354813202050,
  "relativeTimestamp" 22290146648699}}
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
     {"protonum" 17, "protoname" "udp", "sport" 36081, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 36081}},
    "independent" {"timeout" 30, "id" 584150064, "unreplied" nil}}},
  "timestamp" 1354813202070,
  "relativeTimestamp" 22290166402540}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 36081, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 36081}},
    "independent" {"timeout" 29, "id" 584150064}}},
  "timestamp" 1354813202090,
  "relativeTimestamp" 22290186670542}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 36081, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 36081}},
    "independent" {"timeout" 180, "id" 584150064, "assured" nil}}},
  "timestamp" 1354813202123,
  "relativeTimestamp" 22290219845682}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "173.194.70.148"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 52399, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.194.70.148",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 52399}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584152560,
     "unreplied" nil}}},
  "timestamp" 1354813202149,
  "relativeTimestamp" 22290245901916}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "173.194.70.148"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 52400, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.194.70.148",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 52400}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584149128,
     "unreplied" nil}}},
  "timestamp" 1354813202189,
  "relativeTimestamp" 22290286173795}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "173.194.70.148"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 52399, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.194.70.148",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 52399}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584152560}}},
  "timestamp" 1354813202209,
  "relativeTimestamp" 22290305609642}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "173.194.70.148"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 52399, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.194.70.148",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 52399}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584152560,
     "assured" nil}}},
  "timestamp" 1354813202233,
  "relativeTimestamp" 22290329304768}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "173.194.70.148"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 52400, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.194.70.148",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 52400}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584149128}}},
  "timestamp" 1354813202254,
  "relativeTimestamp" 22290351248098}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "173.194.70.148"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 52400, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.194.70.148",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 52400}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584149128,
     "assured" nil}}},
  "timestamp" 1354813202273,
  "relativeTimestamp" 22290369998246}}
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
     {"protonum" 17, "protoname" "udp", "sport" 48591, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 48591}},
    "independent" {"timeout" 30, "id" 838663176, "unreplied" nil}}},
  "timestamp" 1354813202292,
  "relativeTimestamp" 22290389025398}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36372, "dport" 993}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.227.17.170",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 993, "dport" 36372}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 433092,
     "id" 838657560,
     "unreplied" nil}}},
  "timestamp" 1354813202312,
  "relativeTimestamp" 22290408683280}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.227.17.170"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36372, "dport" 993}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.227.17.170",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 993, "dport" 36372}},
    "independent" {"id" 838657560, "unreplied" nil}}},
  "timestamp" 1354813202330,
  "relativeTimestamp" 22290426602662}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.227.17.186"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 33636, "dport" 993}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.227.17.186",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 993, "dport" 33636}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 433092,
     "id" 838658184,
     "unreplied" nil}}},
  "timestamp" 1354813202349,
  "relativeTimestamp" 22290445523897}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.227.17.186"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 33636, "dport" 993}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.227.17.186",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 993, "dport" 33636}},
    "independent" {"id" 838658184, "unreplied" nil}}},
  "timestamp" 1354813202369,
  "relativeTimestamp" 22290465471906}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 48591, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 48591}},
    "independent" {"timeout" 29, "id" 838663176}}},
  "timestamp" 1354813202387,
  "relativeTimestamp" 22290483811316}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 48591, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 48591}},
    "independent" {"timeout" 180, "id" 838663176, "assured" nil}}},
  "timestamp" 1354813202408,
  "relativeTimestamp" 22290504663044}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.165"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47397, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.165",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47397}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838656624,
     "unreplied" nil}}},
  "timestamp" 1354813202429,
  "relativeTimestamp" 22290525622353}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.165"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47397, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.165",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47397}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838656624}}},
  "timestamp" 1354813202451,
  "relativeTimestamp" 22290547574885}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.165"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47397, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.165",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47397}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 838656624,
     "assured" nil}}},
  "timestamp" 1354813202473,
  "relativeTimestamp" 22290569829184}}
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
     {"protonum" 17, "protoname" "udp", "sport" 40262, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 40262}},
    "independent" {"timeout" 30, "id" 584152248, "unreplied" nil}}},
  "timestamp" 1354813202490,
  "relativeTimestamp" 22290586630480}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 40262, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 40262}},
    "independent" {"timeout" 29, "id" 584152248}}},
  "timestamp" 1354813202508,
  "relativeTimestamp" 22290604881811}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 40262, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 40262}},
    "independent" {"timeout" 180, "id" 584152248, "assured" nil}}},
  "timestamp" 1354813202525,
  "relativeTimestamp" 22290621626467}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "82.199.80.141"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 49187, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "82.199.80.141",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 49187}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584153496,
     "unreplied" nil}}},
  "timestamp" 1354813202548,
  "relativeTimestamp" 22290644487415}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "82.199.80.141"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 49187, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "82.199.80.141",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 49187}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584153496}}},
  "timestamp" 1354813202568,
  "relativeTimestamp" 22290664744432}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "82.199.80.141"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 49187, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "82.199.80.141",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 49187}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584153496,
     "assured" nil}}},
  "timestamp" 1354813202591,
  "relativeTimestamp" 22290687484418}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "82.199.80.141"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 49187, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "82.199.80.141",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 49187}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 584153496,
     "assured" nil}}},
  "timestamp" 1354813202613,
  "relativeTimestamp" 22290710173402}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "82.199.80.141"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 49187, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "82.199.80.141",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 49187}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 584153496,
     "assured" nil}}},
  "timestamp" 1354813202636,
  "relativeTimestamp" 22290732346553}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "82.199.80.141"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 49187, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "82.199.80.141",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 49187}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 584153496,
     "assured" nil}}},
  "timestamp" 1354813202658,
  "relativeTimestamp" 22290754426652}}
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
     {"protonum" 17, "protoname" "udp", "sport" 53760, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 53760}},
    "independent" {"timeout" 30, "id" 812462664, "unreplied" nil}}},
  "timestamp" 1354813202680,
  "relativeTimestamp" 22290776577230}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53760, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 53760}},
    "independent" {"timeout" 29, "id" 812462664}}},
  "timestamp" 1354813202700,
  "relativeTimestamp" 22290796543087}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "82.199.80.141"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 49187, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "82.199.80.141",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 49187}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 584153496,
     "assured" nil}}},
  "timestamp" 1354813202720,
  "relativeTimestamp" 22290817098067}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53760, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 53760}},
    "independent" {"timeout" 180, "id" 812462664, "assured" nil}}},
  "timestamp" 1354813202746,
  "relativeTimestamp" 22290842760496}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "173.194.70.148"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 52403, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.194.70.148",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 52403}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584147256,
     "unreplied" nil}}},
  "timestamp" 1354813202767,
  "relativeTimestamp" 22290863505013}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "173.194.70.148"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 52403, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.194.70.148",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 52403}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584147256}}},
  "timestamp" 1354813202785,
  "relativeTimestamp" 22290881676319}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "173.194.70.148"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 52403, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "173.194.70.148",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 52403}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584147256,
     "assured" nil}}},
  "timestamp" 1354813202803,
  "relativeTimestamp" 22290899895425}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "178.236.6.250"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 53588, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "178.236.6.250",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 53588}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812461416,
     "unreplied" nil}}},
  "timestamp" 1354813202822,
  "relativeTimestamp" 22290918815351}}
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
     {"protonum" 17, "protoname" "udp", "sport" 48255, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 48255}},
    "independent" {"timeout" 30, "id" 584148504, "unreplied" nil}}},
  "timestamp" 1354813202841,
  "relativeTimestamp" 22290937794975}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 48255, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 48255}},
    "independent" {"timeout" 29, "id" 584148504}}},
  "timestamp" 1354813202860,
  "relativeTimestamp" 22290956951994}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "178.236.6.250"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 53588, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "178.236.6.250",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 53588}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812461416}}},
  "timestamp" 1354813202878,
  "relativeTimestamp" 22290974414751}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "178.236.6.250"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 53588, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "178.236.6.250",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 53588}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812461416,
     "assured" nil}}},
  "timestamp" 1354813202896,
  "relativeTimestamp" 22290993155187}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 48255, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 48255}},
    "independent" {"timeout" 180, "id" 584148504, "assured" nil}}},
  "timestamp" 1354813202914,
  "relativeTimestamp" 22291010767800}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "176.32.110.64"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 59328, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "176.32.110.64",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 59328}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812465472,
     "unreplied" nil}}},
  "timestamp" 1354813202934,
  "relativeTimestamp" 22291030531879}}
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
     {"protonum" 17, "protoname" "udp", "sport" 38543, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 38543}},
    "independent" {"timeout" 30, "id" 838661616, "unreplied" nil}}},
  "timestamp" 1354813202951,
  "relativeTimestamp" 22291048055922}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 38543, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 38543}},
    "independent" {"timeout" 29, "id" 838661616}}},
  "timestamp" 1354813202968,
  "relativeTimestamp" 22291064767914}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "176.32.110.64"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 59328, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "176.32.110.64",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 59328}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 812465472}}},
  "timestamp" 1354813202984,
  "relativeTimestamp" 22291081199471}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "176.32.110.64"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 59328, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "176.32.110.64",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 59328}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 812465472,
     "assured" nil}}},
  "timestamp" 1354813203002,
  "relativeTimestamp" 22291098439900}}
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
     {"protonum" 17, "protoname" "udp", "sport" 56234, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 56234}},
    "independent" {"timeout" 30, "id" 584151624, "unreplied" nil}}},
  "timestamp" 1354813203021,
  "relativeTimestamp" 22291117962313}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 56234, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 56234}},
    "independent" {"timeout" 29, "id" 584151624}}},
  "timestamp" 1354813203038,
  "relativeTimestamp" 22291134819394}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 56234, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 56234}},
    "independent" {"timeout" 180, "id" 584151624, "assured" nil}}},
  "timestamp" 1354813203056,
  "relativeTimestamp" 22291152485011}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.192"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 54729, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.192",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 54729}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 584148192,
     "unreplied" nil}}},
  "timestamp" 1354813203076,
  "relativeTimestamp" 22291172763747}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.192"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 54729, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.192",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 54729}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 584148192}}},
  "timestamp" 1354813203097,
  "relativeTimestamp" 22291194153804}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.192"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 54729, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.192",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 54729}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 584148192,
     "assured" nil}}},
  "timestamp" 1354813203118,
  "relativeTimestamp" 22291214834497}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 38543, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 38543}},
    "independent" {"timeout" 180, "id" 838661616, "assured" nil}}},
  "timestamp" 1354813203140,
  "relativeTimestamp" 22291237256930}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "178.236.7.137"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 56409, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "178.236.7.137",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 56409}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838659120,
     "unreplied" nil}}},
  "timestamp" 1354813203160,
  "relativeTimestamp" 22291257260696}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "178.236.7.137"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 56409, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "178.236.7.137",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 56409}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838659120}}},
  "timestamp" 1354813203181,
  "relativeTimestamp" 22291278053844}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "178.236.7.137"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 56409, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "178.236.7.137",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 56409}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 431999,
     "id" 838659120,
     "assured" nil}}},
  "timestamp" 1354813203204,
  "relativeTimestamp" 22291300317738}}
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
     {"protonum" 17, "protoname" "udp", "sport" 51064, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 51064}},
    "independent" {"timeout" 30, "id" 134187144, "unreplied" nil}}},
  "timestamp" 1354813203245,
  "relativeTimestamp" 22291341470306}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 51064, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 51064}},
    "independent" {"timeout" 29, "id" 134187144}}},
  "timestamp" 1354813203419,
  "relativeTimestamp" 22291515924495}}
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
     {"protonum" 17, "protoname" "udp", "sport" 54831, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 54831}},
    "independent" {"timeout" 30, "id" 584151312, "unreplied" nil}}},
  "timestamp" 1354813203439,
  "relativeTimestamp" 22291535489109}}
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
     {"protonum" 17, "protoname" "udp", "sport" 56138, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 56138}},
    "independent" {"timeout" 30, "id" 584146944, "unreplied" nil}}},
  "timestamp" 1354813203457,
  "relativeTimestamp" 22291554244858}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 54831, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 54831}},
    "independent" {"timeout" 29, "id" 584151312}}},
  "timestamp" 1354813203480,
  "relativeTimestamp" 22291576601007}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 56138, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 56138}},
    "independent" {"timeout" 30, "id" 584146944}}},
  "timestamp" 1354813203499,
  "relativeTimestamp" 22291595849492}}
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
     {"protonum" 17, "protoname" "udp", "sport" 48968, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 48968}},
    "independent" {"timeout" 30, "id" 838656936, "unreplied" nil}}},
  "timestamp" 1354813203516,
  "relativeTimestamp" 22291613143054}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 48968, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 48968}},
    "independent" {"timeout" 29, "id" 838656936}}},
  "timestamp" 1354813203536,
  "relativeTimestamp" 22291632790017}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 51064, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 51064}},
    "independent" {"timeout" 180, "id" 134187144, "assured" nil}}},
  "timestamp" 1354813203554,
  "relativeTimestamp" 22291650492364}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40754, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40754}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134186520,
     "unreplied" nil}}},
  "timestamp" 1354813203572,
  "relativeTimestamp" 22291668340390}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40755, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40755}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134191200,
     "unreplied" nil}}},
  "timestamp" 1354813203591,
  "relativeTimestamp" 22291687312201}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40756, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40756}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 134190576,
     "unreplied" nil}}},
  "timestamp" 1354813203610,
  "relativeTimestamp" 22291706337392}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40754, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40754}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134186520}}},
  "timestamp" 1354813203628,
  "relativeTimestamp" 22291725170042}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40754, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40754}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 431999,
     "id" 134186520,
     "assured" nil}}},
  "timestamp" 1354813203647,
  "relativeTimestamp" 22291743863574}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40755, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40755}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134191200}}},
  "timestamp" 1354813203668,
  "relativeTimestamp" 22291764525776}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40755, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40755}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134191200,
     "assured" nil}}},
  "timestamp" 1354813203688,
  "relativeTimestamp" 22291784411783}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40756, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40756}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 134190576}}},
  "timestamp" 1354813203715,
  "relativeTimestamp" 22291812273658}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40756, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40756}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 134190576,
     "assured" nil}}},
  "timestamp" 1354813203738,
  "relativeTimestamp" 22291834491419}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 48968, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 48968}},
    "independent" {"timeout" 180, "id" 838656936, "assured" nil}}},
  "timestamp" 1354813203758,
  "relativeTimestamp" 22291854718481}}
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
     {"protonum" 17, "protoname" "udp", "sport" 33956, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 33956}},
    "independent" {"timeout" 30, "id" 134184960, "unreplied" nil}}},
  "timestamp" 1354813203778,
  "relativeTimestamp" 22291874692641}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 33956, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 33956}},
    "independent" {"timeout" 29, "id" 134184960}}},
  "timestamp" 1354813203797,
  "relativeTimestamp" 22291893459520}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 54831, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 54831}},
    "independent" {"timeout" 180, "id" 584151312, "assured" nil}}},
  "timestamp" 1354813203816,
  "relativeTimestamp" 22291912785223}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 56138, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 56138}},
    "independent" {"timeout" 180, "id" 584146944, "assured" nil}}},
  "timestamp" 1354813203838,
  "relativeTimestamp" 22291935187432}}
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
     {"protonum" 17, "protoname" "udp", "sport" 51136, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 51136}},
    "independent" {"timeout" 30, "id" 134191512, "unreplied" nil}}},
  "timestamp" 1354813203858,
  "relativeTimestamp" 22291955199948}}
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
     {"protonum" 17, "protoname" "udp", "sport" 39234, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 39234}},
    "independent" {"timeout" 30, "id" 584149752, "unreplied" nil}}},
  "timestamp" 1354813203880,
  "relativeTimestamp" 22291976783426}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 51136, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 51136}},
    "independent" {"timeout" 30, "id" 134191512}}},
  "timestamp" 1354813203899,
  "relativeTimestamp" 22291996121289}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 39234, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 39234}},
    "independent" {"timeout" 29, "id" 584149752}}},
  "timestamp" 1354813203920,
  "relativeTimestamp" 22292017168669}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40757, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40757}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586802400,
     "unreplied" nil}}},
  "timestamp" 1354813203940,
  "relativeTimestamp" 22292036485885}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40757, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40757}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586802400}}},
  "timestamp" 1354813203961,
  "relativeTimestamp" 22292057364011}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40757, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40757}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586802400,
     "assured" nil}}},
  "timestamp" 1354813203981,
  "relativeTimestamp" 22292077959932}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 33956, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 33956}},
    "independent" {"timeout" 180, "id" 134184960, "assured" nil}}},
  "timestamp" 1354813204001,
  "relativeTimestamp" 22292098021786}}
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
     {"protonum" 17, "protoname" "udp", "sport" 33670, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 33670}},
    "independent" {"timeout" 30, "id" 134189952, "unreplied" nil}}},
  "timestamp" 1354813204020,
  "relativeTimestamp" 22292116434447}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 33670, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 33670}},
    "independent" {"timeout" 30, "id" 134189952}}},
  "timestamp" 1354813204036,
  "relativeTimestamp" 22292132487438}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 51136, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 51136}},
    "independent" {"timeout" 180, "id" 134191512, "assured" nil}}},
  "timestamp" 1354813204051,
  "relativeTimestamp" 22292148248256}}
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
     {"protonum" 17, "protoname" "udp", "sport" 55462, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 55462}},
    "independent" {"timeout" 30, "id" 586801776, "unreplied" nil}}},
  "timestamp" 1354813204072,
  "relativeTimestamp" 22292168319172}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 55462, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 55462}},
    "independent" {"timeout" 30, "id" 586801776}}},
  "timestamp" 1354813204092,
  "relativeTimestamp" 22292188895572}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 39234, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 39234}},
    "independent" {"timeout" 180, "id" 584149752, "assured" nil}}},
  "timestamp" 1354813204112,
  "relativeTimestamp" 22292208973199}}
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
     {"protonum" 17, "protoname" "udp", "sport" 58023, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 58023}},
    "independent" {"timeout" 30, "id" 586802088, "unreplied" nil}}},
  "timestamp" 1354813204133,
  "relativeTimestamp" 22292229710271}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 58023, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 58023}},
    "independent" {"timeout" 29, "id" 586802088}}},
  "timestamp" 1354813204151,
  "relativeTimestamp" 22292247764175}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 55462, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 55462}},
    "independent" {"timeout" 180, "id" 586801776, "assured" nil}}},
  "timestamp" 1354813204169,
  "relativeTimestamp" 22292266233864}}
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
     {"protonum" 17, "protoname" "udp", "sport" 36848, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 36848}},
    "independent" {"timeout" 30, "id" 586804896, "unreplied" nil}}},
  "timestamp" 1354813204188,
  "relativeTimestamp" 22292284686714}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 36848, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 36848}},
    "independent" {"timeout" 30, "id" 586804896}}},
  "timestamp" 1354813204207,
  "relativeTimestamp" 22292303656757}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 58023, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 58023}},
    "independent" {"timeout" 180, "id" 586802088, "assured" nil}}},
  "timestamp" 1354813204223,
  "relativeTimestamp" 22292320129662}}
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
     {"protonum" 17, "protoname" "udp", "sport" 46586, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 46586}},
    "independent" {"timeout" 30, "id" 586808328, "unreplied" nil}}},
  "timestamp" 1354813204242,
  "relativeTimestamp" 22292339117048}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 46586, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 46586}},
    "independent" {"timeout" 29, "id" 586808328}}},
  "timestamp" 1354813204264,
  "relativeTimestamp" 22292360623480}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 36848, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 36848}},
    "independent" {"timeout" 180, "id" 586804896, "assured" nil}}},
  "timestamp" 1354813204282,
  "relativeTimestamp" 22292378784883}}
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
     {"protonum" 17, "protoname" "udp", "sport" 47235, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 47235}},
    "independent" {"timeout" 30, "id" 586806768, "unreplied" nil}}},
  "timestamp" 1354813204302,
  "relativeTimestamp" 22292398990423}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 47235, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 47235}},
    "independent" {"timeout" 29, "id" 586806768}}},
  "timestamp" 1354813204321,
  "relativeTimestamp" 22292417945081}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 46586, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 46586}},
    "independent" {"timeout" 180, "id" 586808328, "assured" nil}}},
  "timestamp" 1354813204340,
  "relativeTimestamp" 22292436963572}}
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
     {"protonum" 17, "protoname" "udp", "sport" 52566, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 52566}},
    "independent" {"timeout" 30, "id" 586803336, "unreplied" nil}}},
  "timestamp" 1354813204361,
  "relativeTimestamp" 22292457525248}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 52566, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 52566}},
    "independent" {"timeout" 29, "id" 586803336}}},
  "timestamp" 1354813204381,
  "relativeTimestamp" 22292477531895}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 52566, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 52566}},
    "independent" {"timeout" 180, "id" 586803336, "assured" nil}}},
  "timestamp" 1354813204418,
  "relativeTimestamp" 22292515167708}}
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
     {"protonum" 17, "protoname" "udp", "sport" 55919, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 55919}},
    "independent" {"timeout" 30, "id" 586806144, "unreplied" nil}}},
  "timestamp" 1354813204448,
  "relativeTimestamp" 22292544881845}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 55919, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 55919}},
    "independent" {"timeout" 29, "id" 586806144}}},
  "timestamp" 1354813204468,
  "relativeTimestamp" 22292564705730}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 47235, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 47235}},
    "independent" {"timeout" 180, "id" 586806768, "assured" nil}}},
  "timestamp" 1354813204490,
  "relativeTimestamp" 22292587107225}}
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
     {"protonum" 17, "protoname" "udp", "sport" 47292, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 47292}},
    "independent" {"timeout" 30, "id" 586802712, "unreplied" nil}}},
  "timestamp" 1354813204510,
  "relativeTimestamp" 22292606741573}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 55919, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 55919}},
    "independent" {"timeout" 180, "id" 586806144, "assured" nil}}},
  "timestamp" 1354813204526,
  "relativeTimestamp" 22292622665842}}
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
     {"protonum" 17, "protoname" "udp", "sport" 40979, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 40979}},
    "independent" {"timeout" 30, "id" 586808640, "unreplied" nil}}},
  "timestamp" 1354813204542,
  "relativeTimestamp" 22292638813404}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 40979, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 40979}},
    "independent" {"timeout" 29, "id" 586808640}}},
  "timestamp" 1354813204562,
  "relativeTimestamp" 22292658752273}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 47292, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 47292}},
    "independent" {"timeout" 29, "id" 586802712}}},
  "timestamp" 1354813204582,
  "relativeTimestamp" 22292678895851}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 40979, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 40979}},
    "independent" {"timeout" 180, "id" 586808640, "assured" nil}}},
  "timestamp" 1354813204602,
  "relativeTimestamp" 22292699083717}}
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
     {"protonum" 17, "protoname" "udp", "sport" 54549, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 54549}},
    "independent" {"timeout" 30, "id" 586804272, "unreplied" nil}}},
  "timestamp" 1354813204624,
  "relativeTimestamp" 22292720819094}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 54549, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 54549}},
    "independent" {"timeout" 30, "id" 586804272}}},
  "timestamp" 1354813204645,
  "relativeTimestamp" 22292742120697}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 33670, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 33670}},
    "independent" {"timeout" 180, "id" 134189952, "assured" nil}}},
  "timestamp" 1354813204666,
  "relativeTimestamp" 22292762355572}}
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
     {"protonum" 17, "protoname" "udp", "sport" 49736, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 49736}},
    "independent" {"timeout" 30, "id" 134191824, "unreplied" nil}}},
  "timestamp" 1354813204686,
  "relativeTimestamp" 22292782390996}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 49736, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 49736}},
    "independent" {"timeout" 30, "id" 134191824}}},
  "timestamp" 1354813204706,
  "relativeTimestamp" 22292802731702}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 47292, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 47292}},
    "independent" {"timeout" 180, "id" 586802712, "assured" nil}}},
  "timestamp" 1354813204725,
  "relativeTimestamp" 22292822072646}}
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
     {"protonum" 17, "protoname" "udp", "sport" 49884, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 49884}},
    "independent" {"timeout" 30, "id" 586803960, "unreplied" nil}}},
  "timestamp" 1354813204748,
  "relativeTimestamp" 22292844359654}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 49884, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 49884}},
    "independent" {"timeout" 29, "id" 586803960}}},
  "timestamp" 1354813204767,
  "relativeTimestamp" 22292864095471}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 54549, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 54549}},
    "independent" {"timeout" 180, "id" 586804272, "assured" nil}}},
  "timestamp" 1354813204789,
  "relativeTimestamp" 22292885940150}}
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
     {"protonum" 17, "protoname" "udp", "sport" 53346, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 53346}},
    "independent" {"timeout" 30, "id" 586803648, "unreplied" nil}}},
  "timestamp" 1354813204808,
  "relativeTimestamp" 22292904406988}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53346, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 53346}},
    "independent" {"timeout" 29, "id" 586803648}}},
  "timestamp" 1354813204825,
  "relativeTimestamp" 22292921662215}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 49884, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 49884}},
    "independent" {"timeout" 180, "id" 586803960, "assured" nil}}},
  "timestamp" 1354813204842,
  "relativeTimestamp" 22292939067002}}
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
     {"protonum" 17, "protoname" "udp", "sport" 59873, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 59873}},
    "independent" {"timeout" 30, "id" 586807392, "unreplied" nil}}},
  "timestamp" 1354813204860,
  "relativeTimestamp" 22292957104283}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 59873, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 59873}},
    "independent" {"timeout" 29, "id" 586807392}}},
  "timestamp" 1354813204879,
  "relativeTimestamp" 22292976237303}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 59873, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 59873}},
    "independent" {"timeout" 180, "id" 586807392, "assured" nil}}},
  "timestamp" 1354813204896,
  "relativeTimestamp" 22292992632417}}
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
     {"protonum" 17, "protoname" "udp", "sport" 41251, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 41251}},
    "independent" {"timeout" 30, "id" 586807080, "unreplied" nil}}},
  "timestamp" 1354813204912,
  "relativeTimestamp" 22293008342979}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 41251, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 41251}},
    "independent" {"timeout" 29, "id" 586807080}}},
  "timestamp" 1354813204927,
  "relativeTimestamp" 22293023861195}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 49736, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 49736}},
    "independent" {"timeout" 180, "id" 134191824, "assured" nil}}},
  "timestamp" 1354813204942,
  "relativeTimestamp" 22293039033927}}
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
     {"protonum" 17, "protoname" "udp", "sport" 60052, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 60052}},
    "independent" {"timeout" 30, "id" 134190888, "unreplied" nil}}},
  "timestamp" 1354813204958,
  "relativeTimestamp" 22293054498335}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 60052, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 60052}},
    "independent" {"timeout" 29, "id" 134190888}}},
  "timestamp" 1354813204975,
  "relativeTimestamp" 22293071501101}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53346, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 53346}},
    "independent" {"timeout" 180, "id" 586803648, "assured" nil}}},
  "timestamp" 1354813204990,
  "relativeTimestamp" 22293086580244}}
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
     {"protonum" 17, "protoname" "udp", "sport" 34400, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 34400}},
    "independent" {"timeout" 30, "id" 586801152, "unreplied" nil}}},
  "timestamp" 1354813205005,
  "relativeTimestamp" 22293102133206}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 34400, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 34400}},
    "independent" {"timeout" 30, "id" 586801152}}},
  "timestamp" 1354813205024,
  "relativeTimestamp" 22293120547835}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 41251, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 41251}},
    "independent" {"timeout" 180, "id" 586807080, "assured" nil}}},
  "timestamp" 1354813205039,
  "relativeTimestamp" 22293135716438}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 34400, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 34400}},
    "independent" {"timeout" 180, "id" 586801152, "assured" nil}}},
  "timestamp" 1354813205055,
  "relativeTimestamp" 22293151298442}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 60052, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 60052}},
    "independent" {"timeout" 180, "id" 134190888, "assured" nil}}},
  "timestamp" 1354813205077,
  "relativeTimestamp" 22293173450737}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 59500, "dport" 631}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.0.251",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 631, "dport" 59500}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 812463912,
     "unreplied" nil}}},
  "timestamp" 1354813205095,
  "relativeTimestamp" 22293191538017}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37569, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37569}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812461728,
     "assured" nil}}},
  "timestamp" 1354813206552,
  "relativeTimestamp" 22294648720981}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37568, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37568}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812465160,
     "assured" nil}}},
  "timestamp" 1354813206574,
  "relativeTimestamp" 22294670782832}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37567, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37567}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812461104,
     "assured" nil}}},
  "timestamp" 1354813206595,
  "relativeTimestamp" 22294691699917}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37566, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37566}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812460792,
     "assured" nil}}},
  "timestamp" 1354813206616,
  "relativeTimestamp" 22294712296184}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37565, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37565}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812462976,
     "assured" nil}}},
  "timestamp" 1354813206637,
  "relativeTimestamp" 22294733316876}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37564, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37564}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812457984,
     "assured" nil}}},
  "timestamp" 1354813206660,
  "relativeTimestamp" 22294756699557}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47817, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47817}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812458608,
     "assured" nil}}},
  "timestamp" 1354813206681,
  "relativeTimestamp" 22294777305992}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47816, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47816}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812458296,
     "assured" nil}}},
  "timestamp" 1354813206699,
  "relativeTimestamp" 22294796165992}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47815, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47815}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812460480,
     "assured" nil}}},
  "timestamp" 1354813206720,
  "relativeTimestamp" 22294816298062}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47814, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47814}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812464536,
     "assured" nil}}},
  "timestamp" 1354813206741,
  "relativeTimestamp" 22294838156743}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47813, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47813}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812459232,
     "assured" nil}}},
  "timestamp" 1354813206763,
  "relativeTimestamp" 22294860100036}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47812, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47812}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 812464224,
     "assured" nil}}},
  "timestamp" 1354813206785,
  "relativeTimestamp" 22294882012549}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35346, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35346}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 584147568,
     "assured" nil}}},
  "timestamp" 1354813206806,
  "relativeTimestamp" 22294902728041}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35345, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35345}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 584151000,
     "assured" nil}}},
  "timestamp" 1354813206822,
  "relativeTimestamp" 22294919191371}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35344, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35344}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 584154120,
     "assured" nil}}},
  "timestamp" 1354813206841,
  "relativeTimestamp" 22294937648652}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35343, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35343}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 584149440,
     "assured" nil}}},
  "timestamp" 1354813206862,
  "relativeTimestamp" 22294958960699}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35342, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35342}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 584147880,
     "assured" nil}}},
  "timestamp" 1354813206884,
  "relativeTimestamp" 22294980368986}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35341, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35341}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 584153808,
     "assured" nil}}},
  "timestamp" 1354813206905,
  "relativeTimestamp" 22295001765231}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37566, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37566}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812460792,
     "assured" nil}}},
  "timestamp" 1354813206928,
  "relativeTimestamp" 22295025284409}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37566, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37566}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812460792,
     "assured" nil}}},
  "timestamp" 1354813206949,
  "relativeTimestamp" 22295046213454}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37567, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37567}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812461104,
     "assured" nil}}},
  "timestamp" 1354813206967,
  "relativeTimestamp" 22295064096707}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37567, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37567}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812461104,
     "assured" nil}}},
  "timestamp" 1354813206984,
  "relativeTimestamp" 22295080548833}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37568, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37568}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812465160,
     "assured" nil}}},
  "timestamp" 1354813207000,
  "relativeTimestamp" 22295096858090}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37568, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37568}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812465160,
     "assured" nil}}},
  "timestamp" 1354813207016,
  "relativeTimestamp" 22295113033228}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37564, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37564}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812457984,
     "assured" nil}}},
  "timestamp" 1354813207032,
  "relativeTimestamp" 22295129196288}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37564, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37564}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812457984,
     "assured" nil}}},
  "timestamp" 1354813207050,
  "relativeTimestamp" 22295146406775}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47815, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47815}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812460480,
     "assured" nil}}},
  "timestamp" 1354813207069,
  "relativeTimestamp" 22295165936555}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47815, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47815}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812460480,
     "assured" nil}}},
  "timestamp" 1354813207085,
  "relativeTimestamp" 22295182106872}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47812, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47812}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812464224,
     "assured" nil}}},
  "timestamp" 1354813207102,
  "relativeTimestamp" 22295198300243}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47812, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47812}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812464224,
     "assured" nil}}},
  "timestamp" 1354813207118,
  "relativeTimestamp" 22295214594825}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47814, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47814}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812464536,
     "assured" nil}}},
  "timestamp" 1354813207135,
  "relativeTimestamp" 22295231464417}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47814, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47814}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812464536,
     "assured" nil}}},
  "timestamp" 1354813207157,
  "relativeTimestamp" 22295253341201}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47816, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47816}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812458296,
     "assured" nil}}},
  "timestamp" 1354813207178,
  "relativeTimestamp" 22295275257992}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47816, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47816}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812458296,
     "assured" nil}}},
  "timestamp" 1354813207200,
  "relativeTimestamp" 22295297208382}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47813, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47813}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 812459232,
     "assured" nil}}},
  "timestamp" 1354813207223,
  "relativeTimestamp" 22295319907510}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47817, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47817}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812458608,
     "assured" nil}}},
  "timestamp" 1354813207246,
  "relativeTimestamp" 22295342467007}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47817, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47817}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812458608,
     "assured" nil}}},
  "timestamp" 1354813207266,
  "relativeTimestamp" 22295362499854}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47813, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47813}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812459232,
     "assured" nil}}},
  "timestamp" 1354813207286,
  "relativeTimestamp" 22295382607166}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.89"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 47813, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.89",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 47813}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812459232,
     "assured" nil}}},
  "timestamp" 1354813207304,
  "relativeTimestamp" 22295401285079}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37565, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37565}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812462976,
     "assured" nil}}},
  "timestamp" 1354813207324,
  "relativeTimestamp" 22295420915344}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37565, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37565}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812462976,
     "assured" nil}}},
  "timestamp" 1354813207346,
  "relativeTimestamp" 22295442344168}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37569, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37569}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 812461728,
     "assured" nil}}},
  "timestamp" 1354813207367,
  "relativeTimestamp" 22295463540795}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "54.240.162.104"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 37569, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "54.240.162.104",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 37569}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 812461728,
     "assured" nil}}},
  "timestamp" 1354813207388,
  "relativeTimestamp" 22295484714819}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35346, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35346}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 584147568,
     "assured" nil}}},
  "timestamp" 1354813207409,
  "relativeTimestamp" 22295506087654}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35346, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35346}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 584147568,
     "assured" nil}}},
  "timestamp" 1354813207429,
  "relativeTimestamp" 22295526054640}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35343, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35343}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 584149440,
     "assured" nil}}},
  "timestamp" 1354813207448,
  "relativeTimestamp" 22295544345358}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35343, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35343}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 584149440,
     "assured" nil}}},
  "timestamp" 1354813207464,
  "relativeTimestamp" 22295560548288}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35342, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35342}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 584147880,
     "assured" nil}}},
  "timestamp" 1354813207480,
  "relativeTimestamp" 22295576847598}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35342, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35342}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 584147880,
     "assured" nil}}},
  "timestamp" 1354813207496,
  "relativeTimestamp" 22295593145132}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35345, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35345}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 584151000,
     "assured" nil}}},
  "timestamp" 1354813207514,
  "relativeTimestamp" 22295610479280}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35345, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35345}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 584151000,
     "assured" nil}}},
  "timestamp" 1354813207530,
  "relativeTimestamp" 22295626804427}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35344, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35344}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 584154120,
     "assured" nil}}},
  "timestamp" 1354813207546,
  "relativeTimestamp" 22295643020721}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35344, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35344}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 584154120,
     "assured" nil}}},
  "timestamp" 1354813207565,
  "relativeTimestamp" 22295662046358}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35341, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35341}},
    "independent"
    {"state" "LAST_ACK",
     "timeout" 30,
     "id" 584153808,
     "assured" nil}}},
  "timestamp" 1354813207587,
  "relativeTimestamp" 22295683330162}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.201.100.169"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 35341, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.201.100.169",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 35341}},
    "independent"
    {"state" "TIME_WAIT",
     "timeout" 120,
     "id" 584153808,
     "assured" nil}}},
  "timestamp" 1354813207608,
  "relativeTimestamp" 22295704603355}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40756, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40756}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134190576,
     "assured" nil}}},
  "timestamp" 1354813208552,
  "relativeTimestamp" 22296648727136}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40755, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40755}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134191200,
     "assured" nil}}},
  "timestamp" 1354813208570,
  "relativeTimestamp" 22296666388279}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40754, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40754}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 134186520,
     "assured" nil}}},
  "timestamp" 1354813208586,
  "relativeTimestamp" 22296682479507}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40756, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40756}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 134190576,
     "assured" nil}}},
  "timestamp" 1354813208602,
  "relativeTimestamp" 22296698579472}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40756, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40756}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 134190576, "assured" nil}}},
  "timestamp" 1354813208618,
  "relativeTimestamp" 22296714754334}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40755, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40755}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 134191200,
     "assured" nil}}},
  "timestamp" 1354813208638,
  "relativeTimestamp" 22296734799125}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40755, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40755}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 134191200, "assured" nil}}},
  "timestamp" 1354813208654,
  "relativeTimestamp" 22296751009908}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40754, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40754}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 134186520,
     "assured" nil}}},
  "timestamp" 1354813208670,
  "relativeTimestamp" 22296766966558}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40754, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40754}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 134186520, "assured" nil}}},
  "timestamp" 1354813208686,
  "relativeTimestamp" 22296783207080}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40757, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40757}},
    "independent"
    {"state" "FIN_WAIT",
     "timeout" 120,
     "id" 586802400,
     "assured" nil}}},
  "timestamp" 1354813209555,
  "relativeTimestamp" 22297651688322}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40757, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40757}},
    "independent"
    {"state" "CLOSE_WAIT",
     "timeout" 60,
     "id" 586802400,
     "assured" nil}}},
  "timestamp" 1354813209575,
  "relativeTimestamp" 22297671311892}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "23.63.113.51"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 40757, "dport" 443}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "23.63.113.51",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 443, "dport" 40757}},
    "independent"
    {"state" "CLOSE", "timeout" 10, "id" 586802400, "assured" nil}}},
  "timestamp" 1354813209592,
  "relativeTimestamp" 22297688955961}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36364, "dport" 993}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.227.17.170",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 993, "dport" 36364}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 433082,
     "id" 586805832,
     "unreplied" nil}}},
  "timestamp" 1354813211583,
  "relativeTimestamp" 22299679612495}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "destroy",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "212.227.17.170"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 36364, "dport" 993}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.227.17.170",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 993, "dport" 36364}},
    "independent" {"id" 586805832, "unreplied" nil}}},
  "timestamp" 1354813211602,
  "relativeTimestamp" 22299698623998}}
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
     {"protonum" 17, "protoname" "udp", "sport" 55836, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 55836}},
    "independent" {"timeout" 30, "id" 586805832, "unreplied" nil}}},
  "timestamp" 1354813211621,
  "relativeTimestamp" 22299718207390}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 55836, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 55836}},
    "independent" {"timeout" 29, "id" 586805832}}},
  "timestamp" 1354813211638,
  "relativeTimestamp" 22299734989732}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 55836, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 55836}},
    "independent" {"timeout" 180, "id" 586805832, "assured" nil}}},
  "timestamp" 1354813211655,
  "relativeTimestamp" 22299751952941}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36558, "dport" 993}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.227.17.170",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 993, "dport" 36558}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 586806456,
     "unreplied" nil}}},
  "timestamp" 1354813211672,
  "relativeTimestamp" 22299768708520}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36558, "dport" 993}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.227.17.170",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 993, "dport" 36558}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 586806456}}},
  "timestamp" 1354813211689,
  "relativeTimestamp" 22299786226046}}
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
     {"protonum" 6, "protoname" "tcp", "sport" 36558, "dport" 993}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "212.227.17.170",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 993, "dport" 36558}},
    "independent"
    {"state" "ESTABLISHED",
     "timeout" 432000,
     "id" 586806456,
     "assured" nil}}},
  "timestamp" 1354813211707,
  "relativeTimestamp" 22299803372641}}
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
     {"protonum" 17, "protoname" "udp", "sport" 60055, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 60055}},
    "independent" {"timeout" 30, "id" 586805208, "unreplied" nil}}},
  "timestamp" 1354813211724,
  "relativeTimestamp" 22299821021160}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 60055, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 60055}},
    "independent" {"timeout" 29, "id" 586805208}}},
  "timestamp" 1354813211741,
  "relativeTimestamp" 22299837643982}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "192.168.20.1"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 60055, "dport" 53}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.1",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 17, "protoname" "udp", "sport" 53, "dport" 60055}},
    "independent" {"timeout" 180, "id" 586805208, "assured" nil}}},
  "timestamp" 1354813211758,
  "relativeTimestamp" 22299854950190}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "new",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "199.7.52.72"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 60862, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "199.7.52.72",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 60862}},
    "independent"
    {"state" "SYN_SENT",
     "timeout" 120,
     "id" 838659744,
     "unreplied" nil}}},
  "timestamp" 1354813211775,
  "relativeTimestamp" 22299871578951}}
{"conntrack.parsed"
 {"data"
  {"flow"
   {"type" "update",
    "original"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "192.168.20.126",
      "dst" "199.7.52.72"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 60862, "dport" 80}},
    "reply"
    {"layer3"
     {"protonum" 2,
      "protoname" "ipv4",
      "src" "199.7.52.72",
      "dst" "192.168.20.126"},
     "layer4"
     {"protonum" 6, "protoname" "tcp", "sport" 80, "dport" 60862}},
    "independent" {"state" "SYN_RECV", "timeout" 60, "id" 838659744}}},
  "timestamp" 1354813211799,
  "relativeTimestamp" 22299895640435}}
])

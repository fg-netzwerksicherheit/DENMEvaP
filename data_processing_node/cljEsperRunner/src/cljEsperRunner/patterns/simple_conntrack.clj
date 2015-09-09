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
    :doc "Simple event patterns for events derived via connection tracking"}
  cljEsperRunner.patterns.simple-conntrack
  (:use cljEsperRunner.esper))

(def-epl-pattern tcp-connection-duration-conntrack
  "
INSERT INTO
  cep.tcp.connection.duration.conntrack
  (startTimestamp, endTimestamp, duration, 
   source, destination, sourcePort, destinationPort)
SELECT
  a.relativeTimestamp, b.relativeTimestamp, b.relativeTimestamp - a.relativeTimestamp,
  a.data.flow.original.layer3.src, a.data.flow.original.layer3.dst, 
  a.data.flow.original.layer4.sport, a.data.flow.original.layer4.dport
FROM PATTERN [
  EVERY
    a = conntrack.parsed(
      (a.data.flow.independent.state = \"ESTABLISHED\")
    )
  ->
    b = conntrack.parsed(
      (b.data.flow.independent.state = \"TIME_WAIT\") AND
      (a.data.flow.original.layer3.src = b.data.flow.original.layer3.src) AND
      (a.data.flow.original.layer3.dst = b.data.flow.original.layer3.dst) AND
      (a.data.flow.original.layer4.sport = b.data.flow.original.layer4.sport) AND
      (a.data.flow.original.layer4.dport = b.data.flow.original.layer4.dport)
    )
]
  ")

(def-epl-pattern tcp-syn-sent-conntrack
  "
INSERT INTO
  cep.tcp.syn.sent.conntrack
  (timestamp, relativeTimestamp,
   source, destination, 
   sourcePort, destinationPort, id)
SELECT
  c.timestamp, c.relativeTimestamp,
  c.data.flow.original.layer3.src, c.data.flow.original.layer3.dst,
  c.data.flow.original.layer4.sport, c.data.flow.original.layer4.dport,
  c.data.flow.independent.id
FROM 
  conntrack.parsed as c
WHERE
  c.data.flow.type = \"new\" AND c.data.flow.independent.state = \"SYN_SENT\"
  ")

(def-epl-pattern tcp-connection-established-conntrack
  "
INSERT INTO
  cep.tcp.connection.established.conntrack
  (timestamp, relativeTimestamp,
   source, destination, 
   sourcePort, destinationPort, id)
SELECT
  c.timestamp, c.relativeTimestamp,
  c.data.flow.original.layer3.src, c.data.flow.original.layer3.dst,
  c.data.flow.original.layer4.sport, c.data.flow.original.layer4.dport,
  c.data.flow.independent.id
FROM 
  conntrack.parsed as c
WHERE
  c.data.flow.type = \"update\" AND c.data.flow.independent.state = \"ESTABLISHED\"
  ")

(def-epl-pattern tcp-connection-finished-conntrack
  "
INSERT INTO
  cep.tcp.connection.finished.conntrack
  (timestamp, relativeTimestamp,
   source, destination, 
   sourcePort, destinationPort, id)
SELECT
  c.timestamp, c.relativeTimestamp,
  c.data.flow.original.layer3.src, c.data.flow.original.layer3.dst,
  c.data.flow.original.layer4.sport, c.data.flow.original.layer4.dport,
  c.data.flow.independent.id
FROM 
  conntrack.parsed as c
WHERE
  c.data.flow.type = \"update\" AND c.data.flow.independent.state = \"FIN_WAIT\"
  ")

(def-epl-pattern tcp-connection-duration-conntrack-2
  "
INSERT INTO
  cep.tcp.connection.duration.conntrack
  (startTimestamp, endTimestamp, duration, 
   source, destination, sourcePort, destinationPort)
SELECT
  a.relativeTimestamp, b.relativeTimestamp, b.relativeTimestamp - a.relativeTimestamp,
  a.source, a.destination, 
  a.sourcePort, a.destinationPort
FROM PATTERN [
  EVERY
    a = cep.tcp.connection.established.conntrack
  ->
    b = cep.tcp.connection.finished.conntrack(
      id = a.id
    )
]
  ")


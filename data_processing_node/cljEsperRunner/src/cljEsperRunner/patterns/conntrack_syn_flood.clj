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
    :doc "Event patterns for deriving patterns related to TCP SYN flood from connection tracking events."}
  cljEsperRunner.patterns.conntrack-syn-flood
  (:use cljEsperRunner.esper))

(def-epl-pattern tcp-syn-without-connection-conntrack
"
INSERT INTO 
  cep.tcp.syn.without.connection.conntrack
  (timestamp, source, destination,
   sourcePort, destinationPort, id)
SELECT 
  a.timestamp, a.source, a.destination, 
  a.sourcePort, a.destinationPort, a.id
FROM PATTERN [
  EVERY
    a = cep.tcp.syn.sent.conntrack
  ->
    (timer:interval(1000 msec) 
     AND NOT 
     cep.tcp.connection.established.conntrack
     (id = a.id))
]")

(def-epl-pattern tcp-syn-flood-without-connection-conntrack
"
INSERT INTO 
  cep.tcp.syn.flood.without.connection.conntrack
  (timestamp, destination, destinationPort)
SELECT 
  timestamp, destination, destinationPort
FROM cep.tcp.syn.without.connection.conntrack.win:time(300 msec)
GROUP BY destination, destinationPort
HAVING count(*) >= 10
OUTPUT FIRST EVERY 300 msec
")

(def-epl-pattern tcp-syn-dos-without-connection-conntrack
"
INSERT INTO 
cep.tcp.syn.dos.without.connection.conntrack
(timestamp, destination, destinationPort)
SELECT 
timestamp, destination, destinationPort
FROM cep.tcp.syn.flood.without.connection.conntrack.win:time(1000 msec)
GROUP BY destination, destinationPort
HAVING count(*) >= 3
OUTPUT FIRST EVERY 1000 msec
")

(def-epl-pattern tcp-syn-flood-conntrack
"
INSERT INTO 
  cep.tcp.syn.flood.conntrack
  (timestamp, destination, destinationPort)
SELECT 
  timestamp, destination, destinationPort
FROM cep.tcp.syn.sent.conntrack.win:time(300 msec)
GROUP BY destination, destinationPort
HAVING count(*) >= 10
OUTPUT FIRST EVERY 300 msec
")

(def-epl-pattern tcp-syn-dos-conntrack
"
INSERT INTO 
cep.tcp.syn.dos.conntrack
(timestamp, destination, destinationPort)
SELECT 
timestamp, destination, destinationPort
FROM cep.tcp.syn.flood.conntrack.win:time(1000 msec)
GROUP BY destination, destinationPort
HAVING count(*) >= 3
OUTPUT FIRST EVERY 1000 msec
")


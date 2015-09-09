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
;;;

(ns
  ^{:author "Ruediger Gad",
    :doc "Event patterns for detecting brute-force attacks based on sniffer data"}
  cljEsperRunner.patterns.brute-force-conntrack
  (:use cljEsperRunner.esper))

;;; For now we just look at the port number...
(def-epl-pattern ssh-connection-duration-conntrack
  "
INSERT INTO
  cep.ssh.connection.duration.conntrack
  (startTimestamp, endTimestamp, duration, 
   source, destination, sourcePort, destinationPort)
SELECT
  startTimestamp, endTimestamp, duration, 
  source, destination, sourcePort, destinationPort
FROM
  cep.tcp.connection.duration.conntrack
WHERE
  destinationPort = 22
")

;;; For now we regard all SSH connections with a duration below 5 second as "short".
(def short-ssh-connection-threshold 163693998115)
(def-epl-pattern ssh-connection-short-conntrack
  (str "
INSERT INTO
  cep.ssh.connection.short.conntrack
  (startTimestamp, endTimestamp, duration, 
   source, destination, sourcePort, destinationPort)
SELECT
  startTimestamp, endTimestamp, duration, 
  source, destination, sourcePort, destinationPort
FROM
  cep.ssh.connection.duration.conntrack
WHERE
  duration < " short-ssh-connection-threshold))

;;; If we find n subsequent short connections we consider this a brute force attack.
;;; Note, this pattern only matches when the attack is performed from the same source
;;; to the same destination.
(def ssh-simple-bruteforce-count-threshold 10)
(def-epl-pattern ssh-simple-bruteforce-conntrack
  (str "
INSERT INTO
  cep.ssh.simple.bruteforce.conntrack
  (firstStartTimestamp, lastStartTimestamp, avgDuration,
   source, destination, sourcePort, destinationPort)
SELECT
  min(startTimestamp), max(startTimestamp), avg(duration),
  source, destination, sourcePort, destinationPort
FROM
  cep.ssh.connection.short.conntrack
GROUP BY source, destination
HAVING 
  count(*) > " ssh-simple-bruteforce-count-threshold))


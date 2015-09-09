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
    :doc "Event patterns for detecting services"}
  cljEsperRunner.patterns.service-detected
  (:use cljEsperRunner.esper))

(def-epl-pattern sniffer-tcp-service-detected
   "
INSERT INTO
   cep.sniffer.service.detected
   (timestamp, networkLayerAddress, port, protocol)
SELECT
   tcpConnection.timestamp, tcpConnection.destination, tcpConnection.destinationPort, 6L
FROM
   cep.tcp.connection.established as tcpConnection,
   method:cljEsperRunner.EsperHibernateAdapter.getServiceByIpFoo(tcpConnection.destination, tcpConnection.destinationPort, 6L) as serviceSeenBefore
WHERE
   serviceSeenBefore.getId() = -1
   ")

(def-epl-pattern conntrack-tcp-service-detected
   "
INSERT INTO
   cep.conntrack.service.detected
   (timestamp, networkLayerAddress, port, protocol)
SELECT
   tcpConnection.timestamp, tcpConnection.destination, tcpConnection.destinationPort, 6L
FROM
   cep.tcp.connection.established.conntrack as tcpConnection,
   method:cljEsperRunner.EsperHibernateAdapter.getServiceByIpFoo(tcpConnection.destination, tcpConnection.destinationPort, 6L) as serviceSeenBefore
WHERE
   serviceSeenBefore.getId() = -1
   ")


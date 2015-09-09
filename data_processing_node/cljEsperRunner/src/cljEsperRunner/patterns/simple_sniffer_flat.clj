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
    :doc "Simple event patterns"}
  cljEsperRunner.patterns.simple-sniffer-flat
  (:use cljEsperRunner.esper))

(def-epl-pattern icmp-echo-request
   "
INSERT INTO
   cep.icmp.echo.request
   (timestamp, source, destination, sequence)
SELECT
   ts, ipSrc, ipDst, icmpEchoSeq
FROM
   sniffer.header.parsed.flat
WHERE
   icmpType = \"echo request\"
   ")

(def-epl-pattern icmp-echo-reply
   "
INSERT INTO
   cep.icmp.echo.reply
   (timestamp, source, destination, sequence)
SELECT
   ts, ipSrc, ipDst, icmpEchoSeq
FROM
   sniffer.header.parsed.flat
WHERE
   icmpType = \"echo reply\"
   ")

(def-epl-pattern icmp-ping-response-time
  "
INSERT INTO
  cep.icmp.ping.response.time
  (requestTimestamp, responseTimestamp, time, source, destination)
SELECT
  a.timestamp, b.timestamp,
  b.timestamp - a.timestamp,
  a.source, a.destination
FROM PATTERN [
  EVERY
    a = cep.icmp.echo.request
  ->
    b = cep.icmp.echo.reply(
      source = a.destination AND
      destination = a.source AND
      sequence = a.sequence
    )
]
")

(def-epl-pattern icmp-ping-response-time-single
  "
INSERT INTO
  cep.icmp.ping.response.time
  (requestTimestamp, responseTimestamp, time, source, destination)
SELECT
  a.ts, b.ts,
  b.ts - a.ts,
  a.ipSrc, a.ipDst
FROM PATTERN [
  EVERY
    a = sniffer.header.parsed.flat( icmpType = \"echo request\" )
  ->
    b = sniffer.header.parsed.flat(
      icmpType = \"echo reply\" AND
      ipSrc = a.ipDst AND
      ipDst = a.ipSrc AND
      icmpEchoSeq = a.icmpEchoSeq
    )
]
")

(def-epl-pattern tcp-connection-established
  "
INSERT INTO
  cep.tcp.connection.established
  (timestamp, source, destination, sourcePort, destinationPort)
SELECT
  c.ts,
  a.ipSrc, a.ipDst,
  a.tcpSrc, a.tcpDst
FROM PATTERN [
  EVERY
    a = sniffer.header.parsed.flat( tcpFlags =  2)
  ->
    b = sniffer.header.parsed.flat(
      tcpFlags = 18 AND
      ipSrc = a.ipDst AND ipDst = a.ipSrc AND
      tcpSrc = a.tcpDst AND tcpDst = a.tcpSrc
    )
  ->
    c = sniffer.header.parsed.flat(
      tcpFlags = 16 AND
      ipSrc = a.ipSrc AND ipDst = a.ipDst AND
      tcpSrc = a.tcpSrc AND tcpDst = a.tcpDst
    )
]
")

(def-epl-pattern tcp-connection-finished
  "
INSERT INTO
  cep.tcp.connection.finished
  (timestamp, source, destination, sourcePort, destinationPort)
SELECT
  c.ts,
  a.ipSrc, a.ipDst,
  a.tcpSrc, a.tcpDst
FROM PATTERN [
  EVERY
    a = sniffer.header.parsed(
      tcpFlags = FIXME:
    )
  ->
    b = sniffer.header.parsed(
      Tcp.flags.contains(\"FIN\") AND Tcp.flags.contains(\"ACK\") AND
      Tcp.flags.size() = 2 AND
      NetworkLayer.source = a.NetworkLayer.destination AND
      NetworkLayer.destination = a.NetworkLayer.source AND
      Tcp.source = a.Tcp.destination AND Tcp.destination = a.Tcp.source
    )
  ->
    c = sniffer.header.parsed(
      Tcp.flags.contains(\"ACK\") AND Tcp.flags.size() = 1 AND
      NetworkLayer.source = a.NetworkLayer.source AND
      NetworkLayer.destination = a.NetworkLayer.destination AND
      Tcp.source = a.Tcp.source AND Tcp.destination = a.Tcp.destination
    )
]
")

(def-epl-pattern tcp-connection-duration
  "
INSERT INTO
  cep.tcp.connection.duration
  (startTimestamp, endTimestamp, duration,
   source, destination, sourcePort, destinationPort)
SELECT
  a.timestamp, b.timestamp, b.timestamp - a.timestamp,
  a.source, a.destination, a.sourcePort, a.destinationPort
FROM PATTERN [
  EVERY
    a = cep.tcp.connection.established
  ->
    b = cep.tcp.connection.finished(
      (source = a.source AND destination = a.destination AND
       sourcePort = a.sourcePort AND destinationPort = a.destinationPort)
      OR
      (source = a.destination AND destination = a.source AND
       sourcePort = a.destinationPort AND destinationPort = a.sourcePort)
    )
]
")

(def-epl-pattern arp-request
   "
INSERT INTO
   cep.arp.request
   (timestamp, source, destination,
    sourceMac, sourceIp, targetMac, targetIp)
SELECT
   PcapHeader.timestampInNanos, DataLinkLayer.source, DataLinkLayer.destination,
   Arp.sourceMac, Arp.sourceIp, Arp.targetMac, Arp.targetIp
FROM
   sniffer.header.parsed
WHERE
   Arp.operationDescription = \"REQUEST\"
  ")

(def-epl-pattern arp-reply
   "
INSERT INTO
   cep.arp.reply
   (timestamp, source, destination,
    sourceMac, sourceIp, targetMac, targetIp)
SELECT
   PcapHeader.timestampInNanos, DataLinkLayer.source, DataLinkLayer.destination,
   Arp.sourceMac, Arp.sourceIp, Arp.targetMac, Arp.targetIp
FROM
   sniffer.header.parsed
WHERE
   Arp.operationDescription = \"REPLY\"
  ")

(def-epl-pattern tcp-syn-sent
   "
INSERT INTO
   cep.tcp.syn.sent
   (timestamp, source, destination,
    sourcePort, destinationPort)
SELECT
   PcapHeader.timestampInNanos, NetworkLayer.source, NetworkLayer.destination,
   Tcp.source, Tcp.destination
FROM
   sniffer.header.parsed
WHERE
   Tcp.flags.contains(\"SYN\") AND Tcp.flags.size() = 1
   ")

(def-epl-pattern dns-detect
   "
INSERT INTO
   cep.dns
   (timestamp, source, destination)
SELECT
   ts, ipSrc, ipDst
FROM
   sniffer.header.parsed.flat
WHERE
   udpSrc = 53 OR udpDst = 53
   ")

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
    :doc "Event patterns for feature extraction"}
  cljEsperRunner.patterns.feature-extraction
  (:use cljEsperRunner.esper))

(def-epl-pattern icmp-ping-reply-time
  "
INSERT INTO
  feature.icmp.ping.reply.time
  (requestTimestamp, replyTimestamp, time, source, destination, requestTtl, replyTtl)
SELECT
  a.PcapHeader.timestampInNanos, b.PcapHeader.timestampInNanos,
  b.PcapHeader.timestampInNanos - a.PcapHeader.timestampInNanos,
  a.NetworkLayer.source, a.NetworkLayer.destination,
  a.NetworkLayer.ttl, b.NetworkLayer.ttl
FROM PATTERN [
  EVERY
    a = sniffer.header.parsed(
          Icmp.typeDescription = \"echo request\"
        )
  ->
    b = sniffer.header.parsed(
          Icmp.typeDescription = \"echo reply\" AND
          NetworkLayer.source = a.NetworkLayer.destination AND 
          NetworkLayer.destination = a.NetworkLayer.source
        )
]
")

(def-epl-pattern udp-reply-time
  "
INSERT INTO
  feature.dns.reply.time
  (requestTimestamp, replyTimestamp, time, source, destination, sourcePort, destinationPort, requestTtl, replyTtl)
SELECT
  a.PcapHeader.timestampInNanos, b.PcapHeader.timestampInNanos,
  b.PcapHeader.timestampInNanos - a.PcapHeader.timestampInNanos,
  a.NetworkLayer.source, a.NetworkLayer.destination,
  a.Udp.source, a.Udp.destination,
  a.NetworkLayer.ttl, b.NetworkLayer.ttl
FROM PATTERN [
  EVERY
    a = sniffer.header.parsed(
          Udp is not null
        )
  ->
    b = sniffer.header.parsed(
          NetworkLayer.source = a.NetworkLayer.destination AND 
          NetworkLayer.destination = a.NetworkLayer.source AND
          Udp.destination = a.Udp.source AND
          Udp.source = a.Udp.destination
        )
]
")

(def-epl-pattern tcp-three-way-handshake-time
  "
INSERT INTO
  feature.tcp.three.way.handshake.time
  (synTimestamp, ackTimestamp, time, source, destination, sourcePort, destinationPort, requestTtl, replyTtl)
SELECT
  a.PcapHeader.timestampInNanos, c.PcapHeader.timestampInNanos,
  c.PcapHeader.timestampInNanos - a.PcapHeader.timestampInNanos,
  a.NetworkLayer.source, a.NetworkLayer.destination,
  a.Tcp.source, a.Tcp.destination,
  a.NetworkLayer.ttl, b.NetworkLayer.ttl
FROM PATTERN [
  EVERY
    a = sniffer.header.parsed(
      Tcp.flags.contains(\"SYN\") AND
      Tcp.flags.size() = 1)
  ->
    b = sniffer.header.parsed(
      Tcp.flags.contains(\"ACK\") AND Tcp.flags.contains(\"SYN\") AND
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

(def-epl-pattern tcp-connection-time
  "
INSERT INTO
  feature.tcp.connection.time
  (startTimestamp, endTimestamp, time, source, destination, sourcePort, destinationPort, requestTtl, replyTtl)
SELECT
  a.PcapHeader.timestampInNanos, f.PcapHeader.timestampInNanos,
  f.PcapHeader.timestampInNanos - a.PcapHeader.timestampInNanos,
  a.NetworkLayer.source, a.NetworkLayer.destination,
  a.Tcp.source, a.Tcp.destination,
  a.NetworkLayer.ttl, b.NetworkLayer.ttl
FROM PATTERN [
  EVERY
    a = sniffer.header.parsed(
      Tcp.flags.contains(\"SYN\") AND
      Tcp.flags.size() = 1)
  ->
    b = sniffer.header.parsed(
      Tcp.flags.contains(\"ACK\") AND Tcp.flags.contains(\"SYN\") AND
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
  ->
    d = sniffer.header.parsed(
      Tcp.flags.contains(\"FIN\") AND Tcp.flags.contains(\"ACK\") AND
      Tcp.flags.size() = 2 AND
      ( ( NetworkLayer.source = a.NetworkLayer.source AND
          NetworkLayer.destination = a.NetworkLayer.destination AND 
          Tcp.source = a.Tcp.source AND Tcp.destination = a.Tcp.destination ) OR
        ( NetworkLayer.destination = a.NetworkLayer.source AND
          NetworkLayer.source = a.NetworkLayer.destination AND 
          Tcp.destination = a.Tcp.source AND Tcp.source = a.Tcp.destination ) )
    )
  ->
    e = sniffer.header.parsed(
      Tcp.flags.contains(\"FIN\") AND Tcp.flags.contains(\"ACK\") AND
      Tcp.flags.size() = 2 AND
      ( ( NetworkLayer.source = a.NetworkLayer.source AND
          NetworkLayer.destination = a.NetworkLayer.destination AND 
          Tcp.source = a.Tcp.source AND Tcp.destination = a.Tcp.destination ) OR
        ( NetworkLayer.destination = a.NetworkLayer.source AND
          NetworkLayer.source = a.NetworkLayer.destination AND 
          Tcp.destination = a.Tcp.source AND Tcp.source = a.Tcp.destination ) )
    )
  ->
    f = sniffer.header.parsed(
      Tcp.flags.contains(\"ACK\") AND Tcp.flags.size() = 1 AND
      ( ( NetworkLayer.source = a.NetworkLayer.source AND
          NetworkLayer.destination = a.NetworkLayer.destination AND 
          Tcp.source = a.Tcp.source AND Tcp.destination = a.Tcp.destination ) OR
        ( NetworkLayer.destination = a.NetworkLayer.source AND
          NetworkLayer.source = a.NetworkLayer.destination AND 
          Tcp.destination = a.Tcp.source AND Tcp.source = a.Tcp.destination ) )
    )
]
")


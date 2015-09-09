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
    :doc "Tests for \"simple event simple-sniffer-patterns\""}
   cljEsperRunner.test.simple-sniffer-flat-event-tests
  (:use clojure.test
        clj-assorted-utils.util
        cljEsperRunner.esper
        clj-net-pcap.core)
  (:import (clj_net_pcap PacketHeaderDataBean))
  (:require (clojure [string :as str])
            (cljEsperRunner.patterns [simple-sniffer-flat :as patterns])
            (cljEsperRunner.sample-data [sniffer-flat :as sample])))

(def test-delay 200)
(def test-data-file "test/cljEsperRunner/test/data/sniffer/dns-http-icmp_wlan_2013-11-30.pcap")

(deftest test-load-data-maps
  (let [data (extract-maps-from-pcap-file test-data-file)]
    (is (= 133 (count data)))))

(deftest test-load-data-beans
  (let [data (extract-beans-from-pcap-file test-data-file)]
    (is (= 133 (count data)))))

(deftest test-send-all-map-events
  (let [events (extract-maps-from-pcap-file test-data-file)
        cntr (counter)
        sp (service-provider sample/packet-with-all-fields)
        st (statement sp "SELECT * FROM sniffer.header.parsed.flat")
        listener-fn (fn [_ _] (cntr inc))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp "sniffer.header.parsed.flat")]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (= 133 (cntr)))
    (destroy sp)))

(deftest test-send-all-bean-events
  (let [events (extract-beans-from-pcap-file test-data-file)
        cntr (counter)
        sp (service-provider {"sniffer.header.parsed.flat" PacketHeaderDataBean})
        st (statement sp "SELECT * FROM sniffer.header.parsed.flat")
        listener-fn (fn [_ _] (cntr inc))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (= 133 (cntr)))
    (destroy sp)))

(deftest test-map-events-dns-detect
  (let [events (extract-maps-from-pcap-file test-data-file)
        cntr (counter)
        sp (service-provider sample/packet-with-all-fields)
        st (statement sp patterns/dns-detect)
        listener-fn (fn [_ _] (cntr inc))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp "sniffer.header.parsed.flat")]
    (println events)
    (send-fn events)
    (Thread/sleep test-delay)
    (is (= 12 (cntr)))
    (destroy sp)))

(deftest test-bean-events-dns-detect
  (let [events (extract-beans-from-pcap-file test-data-file)
        cntr (counter)
        sp (service-provider {"sniffer.header.parsed.flat" PacketHeaderDataBean})
        st (statement sp patterns/dns-detect)
        listener-fn (fn [_ _] (cntr inc))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (= 12 (cntr)))
    (destroy sp)))

(deftest test-map-events-icmp-count
  (let [events (extract-maps-from-pcap-file test-data-file)
        cntr (counter)
        sp (service-provider sample/packet-with-all-fields)
        _ (statement sp patterns/icmp-echo-request)
        _ (statement sp patterns/icmp-echo-reply)
        st (statement sp patterns/icmp-ping-response-time)
        listener-fn (fn [_ _] (cntr inc))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp "sniffer.header.parsed.flat")]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (= 4 (cntr)))
    (destroy sp)))

(deftest test-bean-events-icmp-count
  (let [events (extract-beans-from-pcap-file test-data-file)
        cntr (counter)
        sp (service-provider {"sniffer.header.parsed.flat" PacketHeaderDataBean})
        _ (statement sp patterns/icmp-echo-request)
        _ (statement sp patterns/icmp-echo-reply)
        st (statement sp patterns/icmp-ping-response-time)
        listener-fn (fn [_ _] (cntr inc))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (= 4 (cntr)))
    (destroy sp)))

(deftest test-map-events-icmp-count-single
  (let [events (extract-maps-from-pcap-file test-data-file)
        cntr (counter)
        sp (service-provider sample/packet-with-all-fields)
        st (statement sp patterns/icmp-ping-response-time-single)
        listener-fn (fn [_ _] (cntr inc))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp "sniffer.header.parsed.flat")]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (= 4 (cntr)))
    (destroy sp)))

(deftest test-bean-events-icmp-count-single
  (let [events (extract-beans-from-pcap-file test-data-file)
        cntr (counter)
        sp (service-provider {"sniffer.header.parsed.flat" PacketHeaderDataBean})
        st (statement sp patterns/icmp-ping-response-time-single)
        listener-fn (fn [_ _] (cntr inc))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (= 4 (cntr)))
    (destroy sp)))

(deftest test-map-events-tcp-est-count
  (let [events (extract-maps-from-pcap-file test-data-file)
        cntr (counter)
        sp (service-provider sample/packet-with-all-fields)
        st (statement sp patterns/tcp-connection-established)
        listener-fn (fn [_ _] (cntr inc))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp "sniffer.header.parsed.flat")]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (= 6 (cntr)))
    (destroy sp)))

(deftest test-bean-events-tcp-est-count
  (let [events (extract-beans-from-pcap-file test-data-file)
        cntr (counter)
        sp (service-provider {"sniffer.header.parsed.flat" PacketHeaderDataBean})
        st (statement sp patterns/tcp-connection-established)
        listener-fn (fn [_ _] (cntr inc))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (= 6 (cntr)))
    (destroy sp)))

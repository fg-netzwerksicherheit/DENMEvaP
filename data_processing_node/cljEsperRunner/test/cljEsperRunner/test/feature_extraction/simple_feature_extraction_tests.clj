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
    :doc "Tests for feature extraction via CEP.
          Extracted features are intended to be used in Machine Learning."}
   cljEsperRunner.test.feature-extraction.simple-feature-extraction-tests
  (:use clojure.test
        clj-assorted-utils.util
        cljEsperRunner.esper
        clj-net-pcap.core
        clj-net-pcap.pcap
        clj-net-pcap.pcap-data
        cljEsperRunner.sample-data.sniffer)
  (:require (clojure [string :as str])
            (cljEsperRunner.patterns [feature-extraction :as patterns])))

(defn stdout-formatter-fixture [f]
  (println "\n########## START ##########")
  (f)
  (println "########### END ###########\n\n"))
(use-fixtures :each stdout-formatter-fixture)


(deftest extract-icmp-ping-time
  (let [file "test/cljEsperRunner/test/feature_extraction/raw_data/icmp_echo.pcap"
        flag (prepare-flag)
        events (extract-data-from-pcap-file file #({"sniffer.header.parsed" (pcap-packet-to-map %)}))
        result-event (ref {})
        sp (service-provider @events)
        st (statement sp patterns/icmp-ping-reply-time)
        _ (add-listener st (fn [new-events _] 
                             (set-flag flag)
                             (let [result (-> new-events (aget 0) (.getProperties))]
                               (println result)
                               (dosync (ref-set result-event result)))))
        send-fn (create-send-fn sp)]
    (is (not (flag-set? flag)))
    (send-fn @events)
    (is (flag-set? flag))
    (is (= {"requestTimestamp" 1365516583196346000, "time" 18647000, "source" "192.168.20.126",
            "requestTtl" 64, "replyTtl" 48, "replyTimestamp" 1365516583214993000, "destination" "173.194.69.94"}
           @result-event))
    (destroy sp)))

(deftest extract-udp-reply-time-test
  (let [file "test/cljEsperRunner/test/feature_extraction/raw_data/dns_req_reply.pcap"
        flag (prepare-flag)
        events (extract-data-from-pcap-file file #({"sniffer.header.parsed" (pcap-packet-to-map %)}))
        result-event (ref {})
        _ (println @events)
        sp (service-provider packet-with-all-fields)
        st (statement sp patterns/udp-reply-time)
        _ (add-listener st (fn [new-events _] 
                             (set-flag flag)
                             (let [result (-> new-events (aget 0) (.getProperties))]
                               (println result)
                               (dosync (ref-set result-event result)))))
        send-fn (create-send-fn sp)]
    (is (not (flag-set? flag)))
    (send-fn @events)
    (is (flag-set? flag))
    (is (= {"replyTimestamp" 1365517476032058000, "requestTimestamp" 1365517476031035000, "requestTtl" 64, "time" 1023000, "replyTtl" 64, "source" "192.168.20.126", "destinationPort" 53, "sourcePort" 37691, "destination" "192.168.20.1"}
           @result-event))
    (destroy sp)))

(deftest extract-tcp-three-way-handshake-time
  (let [file "test/cljEsperRunner/test/feature_extraction/raw_data/http_301_moved_permanently.pcap"
        flag (prepare-flag)
        events (extract-data-from-pcap-file file #({"sniffer.header.parsed" (pcap-packet-to-map %)}))
        result-event (ref {})
        _ (println @events)
        sp (service-provider @events)
        st (statement sp patterns/tcp-three-way-handshake-time)
        _ (add-listener st (fn [new-events _] 
                             (set-flag flag)
                             (let [result (-> new-events (aget 0) (.getProperties))]
                               (println result)
                               (dosync (ref-set result-event result)))))
        send-fn (create-send-fn sp)]
    (is (not (flag-set? flag)))
    (send-fn @events)
    (is (flag-set? flag))
    (is (= {"requestTtl" 64, "time" 51702000, "replyTtl" 240, "source" "192.168.20.126", "destinationPort" 80, "sourcePort" 52251, "synTimestamp" 1365517900615136000, "ackTimestamp" 1365517900666838000, "destination" "178.236.6.251"}
           @result-event))
    (destroy sp)))

(deftest extract-tcp-connection-time
  (let [file "test/cljEsperRunner/test/feature_extraction/raw_data/http_301_moved_permanently.pcap"
        flag (prepare-flag)
        events (extract-data-from-pcap-file file #({"sniffer.header.parsed" (pcap-packet-to-map %)}))
        result-event (ref {})
        _ (println @events)
        sp (service-provider @events)
        st (statement sp patterns/tcp-connection-time)
        _ (add-listener st (fn [new-events _] 
                             (set-flag flag)
                             (let [result (-> new-events (aget 0) (.getProperties))]
                               (println result)
                               (dosync (ref-set result-event result)))))
        send-fn (create-send-fn sp)]
    (is (not (flag-set? flag)))
    (send-fn @events)
    (is (flag-set? flag))
    (is (= {"requestTtl" 64, "time" 345295000, "replyTtl" 240, "source" "192.168.20.126", "destinationPort" 80, "sourcePort" 52251, "startTimestamp" 1365517900615136000, "endTimestamp" 1365517900960431000, "destination" "178.236.6.251"}
           @result-event))
    (destroy sp)))


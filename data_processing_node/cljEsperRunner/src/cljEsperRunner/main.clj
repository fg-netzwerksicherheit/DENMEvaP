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
    :doc "Main class to start the whole shebang off."}
  cljEsperRunner.main
  (:use clojure.pprint
        clojure.tools.cli
        clj-net-pcap.core
        clj-net-pcap.sniffer
        clj-net-pcap.pcap-data
        cljActiveMqRunner.jms
        cljEsperRunner.esper
        cljEsperRunner.feature-extract)
  (:import (cljSnifferEventGenerator SimpleDerivedEvent)
           (clj_net_pcap Counter PacketHeaderDataBean ProcessingLoop)
           (java.util List Map)
           (java.util.concurrent ArrayBlockingQueue LinkedBlockingQueue)
           (com.espertech.esper.event.bean BeanEventBean))
  (:require (clojure [string :as str])
            (cljEsperRunner.patterns [simple-sniffer :as simple-sniffer-patterns]
                                     [simple-conntrack :as simple-conntrack-patterns]
                                     [combined-conntrack-and-sniffer :as combined-patterns]
                                     [feature-extraction :as feature-patterns])
            (cljEsperRunner.sample-data [sniffer :as sniffer-samples]
                                        [conntrack :as conntrack-samples]))
  (:gen-class))

(defn -main [& args]
  (let [cli-args (cli args
                      ["-u" "--url" 
                       "URL to connect to the broker." 
                       :default "tcp://localhost:61616"]
                      ["-d" "--debug" 
                       "Enable debug output." 
                       :default true
                       :flag true]
                      ["-e" "--extract-features" :flag true]
                      ["-l" "--label"]
                      ["-h" "--help" "Print this help." :flag true])
        arg-map (cli-args 0)
        extra-args (cli-args 1)
        help-string (cli-args 2)
        label (arg-map :label)]
    (cond 
      (arg-map :help) (println help-string)
      (arg-map :extract-features)
                      (do
                        (println "Extracting features...")
                        (if (empty? extra-args)
                          (println "Please pass the filenames of pcap files from which the features shall be extracted.")
                          (doseq [filename extra-args]
                            (println "Processing:" filename "Using label:" label)
                            (extract-features filename ".feature.icmp-ping-time" feature-patterns/icmp-ping-reply-time label)
                            (extract-features filename ".feature.udp-reply-time" feature-patterns/udp-reply-time label)
                            (extract-features filename ".feature.tcp-three-way-handshake-time" feature-patterns/tcp-three-way-handshake-time label)
                            (extract-features filename ".feature.tcp-connection-time" feature-patterns/tcp-connection-time label))))
      :default        (do
                        (println "Starting Esper with the following options:")
                        (pprint arg-map)
                        (pprint extra-args)
                        (let [; Esper Setup
                              event-samples [sniffer-samples/packet-with-all-fields
                                             conntrack-samples/tcp-event-with-all-fields-set]
                              ;sp (service-provider event-samples)
                              sp (service-provider)
                              _ (add-event-type sp "sniffer.header.parsed" PacketHeaderDataBean)
                              _ (add-event-type sp "simple.derived.event" SimpleDerivedEvent)
                              send-fn (create-send-fn sp)
                              ; JMS Connectivity Setup
                              jms-broker-url (arg-map :url)
                              packet-queue (ArrayBlockingQueue. *queue-size*)
                              packet-drop-counter (Counter.) packet-queued-counter (Counter.)
                              out-queue (ArrayBlockingQueue. *queue-size*)
                              out-drop-counter (Counter.) out-queued-counter (Counter.)
                              jms-consume-fn (fn [events] 
;                                               (println "Consume consume...") 
                                               (doseq [e ^List events]
;                                                 (println (.get e "sniffer.header.parsed"))
                                                 (enqueue-data packet-queue e
                                                   true packet-drop-counter packet-queued-counter)
;                                                 (send-fn (.get e "sniffer.header.parsed"))
                                                 ))
                              cep-send-fn #(try (let [pkt (.take packet-queue)]
                                             (send-fn pkt))
                                             (catch Exception e))
                              cep-send-thread (doto (ProcessingLoop. cep-send-fn)
                                                (.setName "CEP Send Thread") (.setDaemon true) (.start))
                              jms-consumers [(create-consumer 
                                               jms-broker-url 
                                               "topic:sniffer.header.parsed" 
                                               jms-consume-fn)
;                                             (create-consumer 
;                                               jms-broker-url 
;                                               "topic:conntrack.parsed" 
;                                               jms-consume-fn)
                                             ]
                              ; EPL Statements
                              simpleSt (create-simple-statement sp "INSERT INTO simple.derived.event
                                                                                (ts, ipSrc, ipDst, udpSrc, udpDst)
                                                                    SELECT ts, ipSrc, ipDst, udpSrc, udpDst
                                                                    FROM sniffer.header.parsed
                                                                    WHERE (udpSrc = 25996) OR (udpDst = 25996)")
                              producer (create-pooled-arraylist-producer jms-broker-url "topic:simple.derived.event" 2000)
                              _ (add-listener simpleSt (fn [#^"[Lcom.espertech.esper.client.EventBean;" new-events old-events] 
                                                         (let [data (.getUnderlying ^BeanEventBean (aget new-events 0))]
;                                                           (println data)
							    (enqueue-data out-queue data
							       	          true out-drop-counter out-queued-counter))))
;                                                           (producer data))))
				forwarder (create-and-start-forwarder
							      out-queue
							      #(try 
								 (producer %)
								 (catch Exception e)))
                              patterns [
                                        simple-sniffer-patterns/tcp-connection-established
                                        simple-sniffer-patterns/tcp-connection-finished
                                        simple-sniffer-patterns/tcp-connection-duration
                                        simple-sniffer-patterns/icmp-ping-response-time
                                        simple-conntrack-patterns/tcp-connection-duration-conntrack
                                        combined-patterns/tcp-connection-duration-delta
                                        ]




                              jms-forwarder-producers (ref [])
                              create-fwd-listener-fn (fn [producer]
                                                       (fn [e _]
                                                         (let [event (aget e 0)
                                                               event-type (-> (.getEventType event) (.getName))
                                                               event-map (into {} (.getProperties event))
                                                               output-event {event-type event-map}]
                                                           (println "Sending event" output-event)
                                                           (producer output-event))))
                              add-pattern-fn (fn [pattern]
                                               (let [pattern-name (:name pattern)
                                                     st (statement sp pattern)
                                                     new-event-name (str/trim 
                                                                      ((str/split-lines (:expression pattern)) 2))
                ;                                     fwd-st (statement sp {:name (str "forwarder." pattern-name)
                ;                                                           :expression (str "SELECT * FROM " new-event-name)})
                                                     fwd-prod (create-producer 
                                                                jms-broker-url
                                                                (str "topic:" new-event-name))
                                                     _ (add-listener st (create-fwd-listener-fn fwd-prod))]
                                                 (dosync (alter jms-forwarder-producers conj fwd-prod))))
;                              _ (doseq [p patterns] (add-pattern-fn p))
                ;              st-tcp-connection-established (statement sp simple-sniffer-patterns/tcp-connection-established)
                              ;;; When we get derived events we gonna send em back to JMS so we
                              ;;; need a statement that catches all events of the new type,
                ;              st-evt-tcp-conn-est (statement sp "select * from cep.tcp.connection.established")
                              ;;; a JMS producer to send the new events,
                ;              prod-evt-tcp-conn-est (create-producer 
                ;                                      jms-broker-url 
                ;                                      "topic:cep.tcp.connection.established")
                              ;;; and a listener to process the whole shebang.
                ;              listener-fn (fn [e _]
                ;                            (let [event (aget e 0)
                ;                                  event-type (-> (.getEventType event) (.getName))
                ;                                  event-map (into {} (.getProperties event))
                ;                                  output-event {event-type event-map}]
                ;                            (println "Sending event" output-event)
                ;                            (prod-evt-tcp-conn-est output-event)))
                ;              _ (add-listener st-evt-tcp-conn-est listener-fn)
                              ; Shutdown stuff
                              shutdown-fn (fn []
                                            (doseq [c jms-consumers]
                                              (close c))
                                            (doseq [p @jms-forwarder-producers]
                                              (close p))
                                            (destroy sp))]
                          (println "Esper started.\nType \"q\" followed by <Return> to quit: ")
                          ;;; Running the main from, e.g., leiningen results in stdout not being properly accessible.
                          ;;; Hence, this will not work when run this way but works when run from a jar via "java -jar ...".
                          (while (not= "q" (read-line))
                            (println "Type \"q\" followed by <Return> to quit: "))
                          (shutdown-fn))))))


;;;
;;;   Copyright 2015, Frankfurt University of Applied Sciences
;;;
;;;   This software is released under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;

(ns
  ^{:author "Ruediger Gad",
    :doc "Main class to start the whole shebang off."}
  cljPacketHeaderParser.main
  (:use clojure.pprint
        clojure.tools.cli
        cljActiveMqRunner.jms
        clj-net-pcap.core
        clj-net-pcap.sniffer
        clj-net-pcap.pcap-data
        cljSnifferEventGenerator.packet)
  (:require
            (cljActiveMqRunner [jms :as activemq])
            (clj-activemq-apollo-utils [jms :as apollo]))
  (:import (clj_net_pcap Counter PacketHeaderDataBean ProcessingLoop)
           (clj_net_pcap.core BufferRecord)
           (cljSnifferEventGenerator ByteArrayHelper)
           (java.util.concurrent ArrayBlockingQueue LinkedBlockingQueue)
           (java.util ArrayList HashMap)
           (java.nio ByteBuffer)
;           (org.xerial.snappy Snappy)
;           (com.ning.compress.lzf LZFDecoder LZFEncoder)
           )
  (:gen-class))

(defn -main [& args]
  (let [cli-args (cli args
                      ["-u" "--url" 
                       "URL used to connect to the broker." 
                       :default "tcp://localhost:61616"]
                      ["-q" "--queue-size" 
                       (str "Size of packet queue." 
                            "Determines how many packets are captured before a "
                            "message is sent.") 
                       :default 30
                       :parse-fn #(Integer. %)]
                      ["-h" "--help" "Print this help." :flag true])
        arg-map (cli-args 0)
        extra-args (cli-args 1)
        help-string (cli-args 2)]
    (if (arg-map :help)
      (println help-string)
      (do
        (println "Starting cljPacketHeaderParser using the following options:")
        (pprint arg-map)
        (pprint extra-args)
        (let [running (ref true)
              force-put true
              buffer-queue (ArrayBlockingQueue. *queue-size*)
              buffer-drop-counter (Counter.) buffer-queued-counter (Counter.)
              packet-queue (ArrayBlockingQueue. *queue-size*)
              packet-drop-counter (Counter.) packet-queued-counter (Counter.)
              parsed-queue (ArrayBlockingQueue. *queue-size*)
              parsed-drop-counter (Counter.) parsed-queued-counter (Counter.)]
          (with-packet-scanning-pipeline buffer-queue packet-queue packet-drop-counter packet-queued-counter force-put running
            (let [broker-url (arg-map :url)
                  queue (ref [])
    ;              forwarder-fn (fn [raw-data]
    ;                             (try
    ;                               (let [pcap-packet (restore-packet raw-data)
    ;                                     parsed-packet (parse-pcap-packet pcap-packet)
    ;                                     event {"sniffer.header.parsed" parsed-packet}]
    ;                                 (producer event))
    ;                               (catch Exception e
    ;                                 (println "Error processing data!")
    ;                                 (.printStackTrace e)
    ;                                 (println "Raw data was:" raw-data))))
                  consume-fn (fn [^bytes raw-pool]
;                               (println "Consuming raw data...") 
;                               (println (ByteArrayHelper/getInt raw-pool 0))
                               (loop [idx 4]
                                 (do
                                   (let [caplen (ByteArrayHelper/getInt raw-pool (+ idx 8))
                                         len (+ caplen 16)
                                         next-idx (+ idx len)]
                                     (when (and (> caplen 0) (< next-idx (alength raw-pool)))
                                       (enqueue-data buffer-queue
                                                     (BufferRecord.
                                                       (ByteArrayHelper/getInt ^bytes raw-pool idx)
                                                       (ByteArrayHelper/getInt ^bytes raw-pool (+ idx 4))
                                                       (ByteArrayHelper/getInt ^bytes raw-pool (+ idx 8))
                                                       (ByteArrayHelper/getInt ^bytes raw-pool (+ idx 12))
                                                       (doto (ByteBuffer/allocateDirect caplen) (.put raw-pool (+ idx 16) caplen) (.flip)))
                                                     force-put
                                                     buffer-drop-counter buffer-queued-counter)

    ;                                    (.write fifo-out ^bytes b-array (- idx 8) len)
;                                       (print ".")
                                       (recur next-idx))))))
;                               (println "_"))
                  ;consumer (apollo/create-consumer broker-url "/topic/sniffer.header.raw" consume-fn)
                  consumer (activemq/create-consumer broker-url "topic:sniffer.header.raw" consume-fn)
                  ;producer (apollo/create-pooled-arraylist-producer broker-url "/topic/sniffer.header.parsed" (arg-map :queue-size))
                  producer (activemq/create-pooled-arraylist-producer broker-url "topic:sniffer.header.parsed" (arg-map :queue-size))
                  parser-fn #(try (let [pkt (.take packet-queue)]
                                      (enqueue-data
                                        parsed-queue (pcap-packet-to-bean pkt) force-put
                                        parsed-queued-counter parsed-drop-counter))
                                      (catch Exception e))
                  parser-thread (doto (ProcessingLoop. parser-fn)
                                  (.setName "Parser") (.setDaemon true) (.start))
                  forwarder (create-and-start-forwarder
                              parsed-queue
                              #(try 
                                 (producer %)
                                 (catch Exception e)))
                  ; Shutdown stuff
                  shutdown-fn (fn []
                                (close consumer)
                                (close producer))]
              (println "cljPacketHeaderParser started.\nType \"q\" followed by <Return> to quit: ")
              ;;; Running the main from, e.g., leiningen results in stdout not being properly accessible.
              ;;; Hence, this will not work when run this way but works when run from a jar via "java -jar ...".
              (while (not= "q" (read-line))
                (println "Type \"q\" followed by <Return> to quit: "))
              (shutdown-fn))))))))


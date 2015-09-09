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
  cljDebugConsumer.main
  (:use clojure.pprint
        clojure.tools.cli
        clj-assorted-utils.util)
  (:require (cljActiveMqRunner [jms :as activemq])
          (clj-activemq-apollo-utils [jms :as apollo]))
  (:import (clj_net_pcap Counter PacketHeaderDataBean)
           (org.apache.commons.lang3 Conversion)
           (cljSnifferEventGenerator ByteArrayHelper)
           (java.util ArrayList HashMap)
           (java.nio ByteBuffer)
           (java.io FileOutputStream)
           (org.xerial.snappy Snappy)
           (com.ning.compress.lzf LZFDecoder LZFEncoder))
  (:gen-class))

(defn -main [& args]
  (let [cli-args (cli args
                      ["-b" "--broker"
                       "Broker to use. Available are: activemq, apollo-stomp, kryonet-tcp, kryonet-udp, no-op"
                       :default "activemq"]
                      ["-t" "--topic" 
                       "Topic from which events are received." 
                       ; When changing between raw and parsed data remember to change the
                       ; destination as well.
                       :default "default"]
                      ["-d" "--duration"
                       "The duration in seconds how long cljSnifferGenerator is run."
                       :default -1
                       :parse-fn #(Integer. %)]
                      ["-u" "--url" 
                       "URL to connect to the broker." 
                       :default "default"]
                      ["-h" "--help" "Print this help." :flag true])
        arg-map (cli-args 0)
        extra-args (cli-args 1)
        help-string (cli-args 2)]
    (if (arg-map :help)
      (println help-string)
      (do
        (println "Starting Debug Output Consumer using the following options:")
        (pprint arg-map)
        (pprint extra-args)
        (let [broker (arg-map :broker)
              url (if (= (arg-map :url) "default")
                    (cond
                      (= broker "activemq") "tcp://localhost:61616"
                      (= broker "apollo-stomp") "tcp://localhost:61613"
                      (.startsWith broker "kryonet") "127.0.0.1"
                      :default "tcp://localhost:61616")
                    (arg-map :url))
              run-duration (arg-map :duration)
              cntr (Counter.)
              delta-cntr (delta-counter)
              time-tmp (ref (System/currentTimeMillis))
;              fifo-out (FileOutputStream. "fifo-foo")
;              fifo-header (doto (ByteBuffer/allocate 28) (.putLong 0xa1b2c3d4) (.putInt 0x00020004) (.putInt 0) (.putInt 0) (.putInt 0xffff) (.putInt 1))
;              _ (.write fifo-out (.array fifo-header) 4, 24)
              byte-array-type (type (byte-array 1 (byte 0)))
              cntr-fn (fn [obj]
                        (cond
                          (= ArrayList (type obj))
                            (.add cntr (.size ^ArrayList obj))
                          (= byte-array-type (type obj))
;                            (do
;                               (println "length:" (ByteArrayHelper/getInt ^bytes obj 0))
;                               (.write fifo-out ^bytes obj 4 (+ 4 (ByteArrayHelper/getInt ^bytes obj 0))))))
;                            (let [b-array ^bytes obj]
;                            (let [b-array (Snappy/uncompress ^bytes obj)]
                            (let [b-array (LZFDecoder/decode ^bytes obj)]
                              (loop [idx 12]
                                (do
  ;                                (if (> (.value cntr) 30)
  ;                                  (.write fifo-out ^bytes b-array))
                                  (let [caplen (ByteArrayHelper/getInt ^bytes b-array idx)
                                        len (+ caplen 16)
                                        next-idx (+ idx len)]
                                    (when (and (> caplen 0) (< next-idx (alength ^bytes b-array)))
                                      (.inc cntr)
  ;                                    (.write fifo-out ^bytes b-array (- idx 8) len)
                                      (recur next-idx))))))
                          :default (println "Unknown object:" obj)))
              stat-fn #(let [time-delta (- (System/currentTimeMillis) @time-tmp )]
                         (println "eps" (float (/ (delta-cntr :cnt (.value cntr)) (/ time-delta 1000))) "total" (.value cntr))
                         (dosync
                           (ref-set time-tmp (System/currentTimeMillis))))
              stat-out-executor (executor)
              _ (run-repeat stat-out-executor stat-fn 1000)
              create-debug-fn (fn [description]
                                (fn [obj]
                                  (println description)
                                  (if (seq? obj)
                                    (doseq [o obj] 
                                      (pprint o))
                                    (pprint obj))
                                  (println)))
;              topic-suffix (if (= output-format "raw-headers")
;                             "raw"
;                             "parsed")
              topic-suffix "parsed"
              topic (if (= (arg-map :topic) "default")
                      (cond
                        (= broker "activemq") (str "topic:sniffer.header." topic-suffix)
                        (= broker "apollo-stomp") (str "/topic/sniffer.header." topic-suffix)
                        :default (str "topic:sniffer.header." topic-suffix))
                      (arg-map :topic))
              _ (println "Using" broker "at" url "with topic" topic ".")
              create-consumer-fn (fn [url topic f]
                                   (cond
;                                     (= broker "activemq") (activemq/create-consumer url topic f)
                                     (= broker "activemq") (activemq/create-kryo-consumer url topic f)
                                     (= broker "apollo-stomp") (apollo/create-consumer url topic f)
                                     :default (activemq/create-consumer url topic f)))
              debug-consumers (do
                                (println "Turning debug output on."
                                         "Creating debug consumers...")
                                (if (empty? extra-args)
                                  (let [sniffer-header-raw-topic "topic:sniffer.header.raw"
                                        sniffer-header-parsed-topic "topic:sniffer.header.parsed"
                                        tcp-conn-est "topic:cep.tcp.connection.established"
                                        tcp-conn-fin "topic:cep.tcp.connection.finished"
                                        tcp-conn-duration "topic:cep.tcp.connection.duration"
                                        icmp-ping-time "topic:cep.icmp.ping.response.time"] 
                                    (println "Using default debug consumers...")
                                    [
                                     ;(create-consumer 
                                     ;  url 
                                     ;  sniffer-topic 
                                     ;  (create-debug-fn sniffer-topic))
                                     ;(create-consumer 
                                     ;  url 
                                     ;  tcp-conn-est 
                                     ;  (create-debug-fn tcp-conn-est))
                                     (create-consumer-fn
                                       url 
                                       topic
                                       cntr-fn)])
                                  (do
                                    (println "Creating debug consumers from command line args...")
                                    (doall 
                                      (map 
                                        (fn [t] (create-consumer-fn
                                                  url 
                                                  t 
                                                  cntr-fn)) 
                                        extra-args)))))
              running-flag (prepare-flag)
              shutdown-fn (fn []
                            (set-flag running-flag)
                            (println "Events:" (.value cntr))
                            (doseq [c debug-consumers]
                              (c :close)))]
          (if (> run-duration 0)
            (do
              (println "Will automatically shut down in" run-duration "seconds.")
              (run-once (executor) shutdown-fn (* 1000 run-duration))
              (await-flag running-flag))
            (do
              (println "Debug Output Consumer started.\nType \"q\" followed by <Return> to quit: ")
              ;;; Running the main from, e.g., leiningen results in stdout not being properly accessible.
              ;;; Hence, this will not work when run this way but works when run from a jar via "java -jar ...".
              (while (not= "q" (read-line))
                (println "Type \"q\" followed by <Return> to quit: "))
              (shutdown-fn))))))))


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
  cljSnifferEventGenerator.main
  (:use clojure.pprint
        clojure.tools.cli
        clj-net-pcap.core
        clj-net-pcap.pcap-data
        clj-assorted-utils.util
        cljSnifferEventGenerator.packet)
  (:require (cljActiveMqRunner [jms :as activemq])
            (clj-activemq-apollo-utils [jms :as apollo])
            (clj-kryonet-utils [core :as kryonet]))
  (:import
;           (cljSnifferEventGenerator Counter)
           (clj_net_pcap Counter InfiniteLoop PacketHeaderDataBean)
           (cljSnifferEventGenerator ByteArrayHelper)
           (java.nio ByteBuffer)
           (java.util ArrayList HashMap)
           (java.util.concurrent ArrayBlockingQueue LinkedBlockingQueue)
           (org.jnetpcap.packet PcapPacket)
           (org.xerial.snappy Snappy)
           (com.ning.compress.lzf LZFDecoder LZFEncoder))
  (:gen-class))

(def capture-size 64)

(defn -main [& args]
  (kryonet/prefer-ipv4)
  (let [cli-args (cli args
                      ["-u" "--url" 
                       "URL used to connect to the broker." 
                       :default "default"]
                      ["-b" "--broker"
                       "Broker to use. Available are: activemq, apollo-stomp, kryonet-tcp, kryonet-udp, no-op"
                       :default "activemq"]
                      ["-o" "--output"
                       "Output format to which the packets are transformed. Available: flat-maps, nested-maps, beans, raw-headers, raw, no-op"
                       :default "beans"]
                      ["-t" "--topic" 
                       "Enable debug output." 
                       ; When changing between raw and parsed data remember to change the
                       ; destination as well.
                       :default "default"]
                      ["-d" "--duration"
                       "The duration in seconds how long cljSnifferGenerator is run."
                       :default -1
                       :parse-fn #(Integer. %)]
                      ["-O" "--offset"
                       "Offset in microseconds that is added to the timestamp."
                       :default 0
                       :parse-fn #(Integer. %)]
                      ["-i" "--interface" 
                       "Interface on which the packets are captured" 
                       :default "eth0"]
                      ["-f" "--filter" 
                       (str "Pcap filter to be used.") 
                       :default "tcp[tcpflags] & (tcp-syn|tcp-ack|tcp-fin) != 0"]
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
        (println "Starting cljSnifferEventGenerator using the following options:")
        (pprint arg-map)
        (pprint extra-args)
        (let [broker (arg-map :broker)
              output-format (arg-map :output)
              offset (arg-map :offset)
              emit-raw-data (= output-format "raw")
              url (if (= (arg-map :url) "default")
                    (cond
                      (= broker "activemq") "tcp://localhost:61616"
                      (= broker "apollo-stomp") "tcp://localhost:61613"
                      (.startsWith broker "kryonet") "127.0.0.1"
                      :default "tcp://localhost:61616")
                    (arg-map :url))
              topic-suffix (cond
                             (= output-format "raw-headers") "raw-headers"
                             (= output-format "raw") "raw"
                             :default "parsed")
              topic (if (= (arg-map :topic) "default")
                      (cond
                        (= broker "activemq") (str "topic:sniffer.header." topic-suffix)
                        (= broker "apollo-stomp") (str "/topic/sniffer.header." topic-suffix)
                        (= broker "kryonet-tcp") kryonet/send-tcp
                        (= broker "kryonet-udp") kryonet/send-udp
                        :default (str "topic:sniffer.header." topic-suffix))
                      (arg-map :topic))
              run-duration (arg-map :duration)
              queue-size (arg-map :queue-size)
              _ (println "Using" broker "at" url "with topic" topic "and queue size" queue-size)
              cntr (Counter.)
              cntr-dropped (Counter.)
              cntr-queued (Counter.)
              cntr-failed (Counter.)
              delta-cntr (delta-counter)
              send-queue-size 100000
              send-queue (ArrayBlockingQueue. send-queue-size)
              send-queue-queued (Counter.)
              send-queue-dropped (Counter.)
              send-queue-sent (Counter.)
              time-tmp (ref (System/currentTimeMillis))
              stat-fn (fn []
                        (let [time-delta (/ (- (System/currentTimeMillis) @time-tmp) 1000)
                              cntr-val (.value cntr)
                              cntr-dropped-val (.value cntr-dropped)
                              cntr-queued-val (.value cntr-queued)
                              cntr-failed-val (.value cntr-failed)
;                              sq-queued-val (.value send-queue-queued)
;                              sq-dropped-val (.value send-queue-dropped)
;                              sq-sent-val (.value send-queue-sent)
                              ]
                          (println "eps" (float (/ (delta-cntr :total cntr-val) time-delta))
                                   "fps" (float (/ (delta-cntr :failed cntr-failed-val) time-delta))
                                   "dps" (float (/ (delta-cntr :dropped cntr-dropped-val) time-delta))
                                   "qps" (float (/ (delta-cntr :queued cntr-queued-val) time-delta))
                                   "total" cntr-val "failed" cntr-failed-val
                                   "dropped" cntr-dropped-val "queued" cntr-queued-val)
;                          (println "sq-qps" (float (/ (delta-cntr :sq-qps sq-queued-val) time-delta))
;                                   "sq-dps" (float (/ (delta-cntr :sq-dps sq-dropped-val) time-delta))
;                                   "sq-sps" (float (/ (delta-cntr :sq-sps sq-sent-val) time-delta)))
                          (dosync
                            (ref-set time-tmp (System/currentTimeMillis)))))
              packet-process-fn (cond
                                  (= output-format "beans") pcap-packet-to-bean
                                  (= output-format "flat-maps") pcap-packet-to-map
                                  (= output-format "nested-maps") pcap-packet-to-nested-maps
                                  (= output-format "raw-headers") extract-headers
                                  (= output-format "raw") (fn [^ByteBuffer buf] (if (.hasArray buf) (.array buf)))
                                  (= output-format "no-op") (fn [_] -1)
                                  :default pcap-packet-to-bean)
              event-name (str "sniffer.header." topic-suffix)
              data-queue (ArrayBlockingQueue. *queue-size*) scanner-drop-counter (Counter.) scanner-queued-counter (Counter.)
              forwarder-fn (fn [obj]
                             (try
                               (if (and (not (nil? obj))
                                        (< (.size data-queue) *queue-size*))
                                 (let [parsed-data (packet-process-fn obj)
                                       data (if emit-raw-data
                                              parsed-data
                                              (doto (HashMap.) (.put event-name parsed-data)))]
                                   (if (.offer data-queue data)
                                     (.inc cntr-queued)
                                     (.inc cntr-dropped)))
                                 (.inc cntr-dropped))
                               (catch Exception e
                                 (.inc cntr-failed))))
              cljnetpcap (binding [clj-net-pcap.pcap/*snap-len* capture-size
                                   clj-net-pcap.core/*emit-raw-data* emit-raw-data]
                           (create-and-start-online-cljnetpcap forwarder-fn (arg-map :interface) (arg-map :filter)))
              producer (if emit-raw-data
                         (cond
                           (= broker "activemq") (activemq/create-producer url topic)
                           (= broker "apollo-stomp") (apollo/create-producer url topic)
                           (= broker "no-op") (fn [_])
                           :default (activemq/create-producer url topic))
                         (cond
                           (= broker "activemq") (activemq/create-pooled-arraylist-producer url topic queue-size)
;                           (= broker "activemq") (activemq/create-kryo-lzf-pooled-arraylist-producer url topic queue-size)
                           (= broker "apollo-stomp") (apollo/create-pooled-arraylist-producer url topic queue-size)
;                           (= broker "apollo-stomp") (apollo/create-kryo-lzf-pooled-arraylist-producer url topic queue-size)
                           (.startsWith broker "kryonet") (let [client (kryonet/start-client url (int 12345))
                                                                _ (kryonet/register client (ArrayList.) (HashMap.) (PacketHeaderDataBean.))
                                                                producer (kryonet/create-pooled-arraylist-producer client queue-size topic)]
                                                            producer)
                           (= broker "no-op") (fn [_])
                           :default (activemq/create-pooled-producer url topic queue-size)))
              queue (ref [])
              raw-queue-size (+ (* queue-size (+ capture-size 16)) 20)
              raw-queue (ByteBuffer/allocate raw-queue-size)
              _ (.putInt raw-queue 0)
              obj-cntr (Counter.)
              compressor #(try (let [obj (.take data-queue)
                                 ]
                             (if emit-raw-data
                               (do
                                 (if (>= (+ (+ (.position raw-queue) (alength ^bytes obj)) 17) raw-queue-size)
                                   (do
                                     (.putInt raw-queue (int -1))
                                     (.putInt raw-queue (int -1))
                                     (.putInt raw-queue (int -1))
                                     (.putInt raw-queue (int -1))
                                     (.putInt raw-queue 0 (.value obj-cntr))
                                     (.reset obj-cntr)
;                                     (if (< (.size send-queue) send-queue-size)
;                                       (do
;                                         (.put send-queue (Snappy/compress ^bytes (.array raw-queue)))
;                                         (.put send-queue (LZFEncoder/encode ^bytes (.array raw-queue)))
;                                         (.inc send-queue-queued))
;                                       (.inc send-queue-dropped))
                                     (producer (.array raw-queue))
;                                     (producer (Snappy/compress ^bytes (.array raw-queue)))
;                                     (producer (LZFEncoder/encode ^bytes (.array raw-queue)))
;                                     (println "raw-queue:" (vec ^bytes (.array raw-queue)))
;                                     (let [fooba (LZFEncoder/encode ^bytes (.array raw-queue))]
;                                       (println "fooba" (alength ^bytes (.array raw-queue)) (alength fooba))
;                                       (println "fooba:" (vec fooba))
;                                       (producer fooba))
                                     (.clear raw-queue)
                                     (.putInt raw-queue 0)))
;                                 (println (type obj))
;                                 (println (alength ^bytes obj))
;                                 (println "obj:" (vec ^bytes obj))

                                 (if (not= offset 0)
                                   (ByteArrayHelper/addToInt ^bytes obj 4 offset))
                                 (.put raw-queue ^bytes obj)
                                 (.add obj-cntr (alength ^bytes obj))
                                 (.inc cntr))
                               (do
                                 (producer obj)
                                 (.inc cntr))))
                        (catch Exception e
                          (doseq [_ (repeat 0 queue-size)]
                            (.inc cntr-failed))
                          (.clear raw-queue)
                          (.printStackTrace e)))
              compressor-thread (doto (InfiniteLoop. compressor)
                              (.setName "CompressorThread") (.setDaemon true) (.start))
              sender #(try (let [obj (.take send-queue)
                                 ]
                             (producer ^bytes obj)
                             (.inc send-queue-sent))
                        (catch Exception e
                          (.inc cntr-failed)
                          (.printStackTrace e)))
;              sender-thread (doto (InfiniteLoop. sender)
;                              (.setName "SenderThread") (.setDaemon true) (.start))
              stat-out-executor (executor)
              stat-out-executor-2 (executor)
              _ (run-repeat stat-out-executor #(print-stat-cljnetpcap cljnetpcap) 1000)
              _ (run-repeat stat-out-executor-2 stat-fn 1000)
              shutdown-fn (fn [] 
                            (println "Shutting down...")
                            (println "Events:" (.value cntr) "Failed:" (.value cntr-failed))
                            (print-stat-cljnetpcap cljnetpcap)
                            (stop-cljnetpcap cljnetpcap)
                            (.stop compressor-thread)
;                            (.stop sender-thread)
                            (producer :close))]
                            ; TODO: Right now this is very much hard coded.
                            ; This should be automated such that the native libs are automatically
                            ; removed when clj-net-pcap is shut down.
          (if (> run-duration 0)
            (do
              (println "Will automatically shut down in" run-duration "seconds.")
              (run-once (executor) shutdown-fn (* 1000 run-duration)))
            (do
              (println "cljSnifferEventGenerator started.\nType \"q\" followed by <Return> to quit: ")
              ;;; Running the main from, e.g., leiningen results in stdout not being properly accessible.
              ;;; Hence, this will not work when run this way but works when run from a jar via "java -jar ...".
              (while (not= "q" (read-line))
                (println "Type \"q\" followed by <Return> to quit: "))
              (shutdown-fn))))))))


;;;
;;;   Copyright 2015, Frankfurt University of Applied Sciences
;;;
;;;   This software is released under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;

(ns clj-kryonet-utils.main
  (:use clj-assorted-utils.util
        clj-kryonet-utils.core
        clojure.pprint
        clojure.tools.cli)
  (:import (com.esotericsoftware.kryonet Connection Client EndPoint Listener Server)
           (clj_net_pcap PacketHeaderDataBean)
           (java.util ArrayList Collection HashMap Iterator))
  (:gen-class))

(defn -main [& args]
  (let [cli-args (cli args
                      ["-p" "--port" 
                       "Port to bind the server to." 
                       :default "12345"]
                      ["-d" "--daemon" "Run as daemon." :flag true :default false]
                      ["-h" "--help" "Print this help." :flag true])
        arg-map (cli-args 0)
        extra-args (cli-args 1)
        help-string (cli-args 2)]
    (if (arg-map :help)
      (println help-string)
      (do
        (prefer-ipv4)
        (println "Starting kryonet server with the following options:")
        (pprint arg-map)
        (pprint extra-args)
        (let [port (int (read-string (arg-map :port)))
              cntr-events (counter)
              cntr-packets (counter)
              cntr-events-total (counter)
              cntr-packets-total (counter)
              time-tmp (ref (System/currentTimeMillis))
              server (start-server port)
              _ (register server (ArrayList.) (HashMap.) (PacketHeaderDataBean.))
              _ (add-listener server (fn [_ obj]
                                       (when (= ArrayList (type obj))
                                         (cntr-packets inc)
                                         (cntr-events #(+ % (.size ^ArrayList obj)))
                                         (let [time-delta (- (System/currentTimeMillis) @time-tmp)]
                                           (when (> time-delta 1000)
                                             (println "eps" (float (/ (cntr-events) (/ time-delta 1000))))
                                             (println "pps" (float (/ (cntr-packets) (/ time-delta 1000))))
                                             (cntr-events-total #(+ % (cntr-events)))
                                             (cntr-packets-total #(+ % (cntr-packets)))
                                             (cntr-events (fn [_] 0))
                                             (cntr-packets (fn [_] 0))
                                             (dosync
                                              (ref-set time-tmp (System/currentTimeMillis))))))))
              shutdown-fn (fn [] 
                            (.stop server)
                            (println "Packets:" (cntr-packets-total))
                            (println "Events:" (cntr-events-total)))]
          ;;; Running the main from, e.g., leiningen results in stdout not being properly accessible.
          ;;; Hence, this will not work when run this way but works when run from a jar via "java -jar ...".
          (if (:daemon arg-map)
            (-> (agent 0) (await))
            (do
              (println "Server started... Type \"q\" followed by <Return> to quit: ")
              (while (not= "q" (read-line))
                (println "Type \"q\" followed by <Return> to quit: "))
              (shutdown-fn))))))))


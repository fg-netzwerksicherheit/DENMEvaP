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
  cljActiveMqRunner.main
  (:use clojure.pprint
        clojure.tools.cli
        cljActiveMqRunner.jms)
  (:gen-class))

(defn -main [& args]
  (let [cli-args (cli args
                      ["-u" "--url" 
                       "URL to bind the broker to." 
                       :default "tcp://localhost:61616"]
                      ["-d" "--daemon" "Run as daemon." :flag true :default false]
                      ["-D" "--debug" 
                       "Enable debug output." 
                       :default false
                       :flag true]
                      ["-h" "--help" "Print this help." :flag true])
        arg-map (cli-args 0)
        extra-args (cli-args 1)
        help-string (cli-args 2)]
    (if (arg-map :help)
      (println help-string)
      (do
        (println "Starting ActiveMQ Broker using the following options:")
        (pprint arg-map)
        (pprint extra-args)
        (let [url (arg-map :url)
              broker (start-broker url)
              create-debug-fn (fn [description]
                                (fn [obj]
                                  (println description)
                                  (if (seq? obj)
                                    (doseq [o obj] 
                                      (println o))
                                    (println obj))))
              debug-consumers (when (arg-map :debug)
                                (println "Turning debug output on."
                                         "Creating debug consumers...")
                                (Thread/sleep 2000)
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
                                     (create-consumer 
                                       url 
                                       icmp-ping-time
                                       (create-debug-fn icmp-ping-time))])
                                  (do
                                    (println "Creating debug consumers from command line args...")
                                    (doall 
                                      (map 
                                        (fn [t] (create-consumer 
                                                  url 
                                                  t 
                                                  (create-debug-fn t))) 
                                        extra-args)))))
              shutdown-fn (fn []
                            (doseq [c debug-consumers]
                              (close c))
                            (.stop broker))]
          ;;; Running the main from, e.g., leiningen results in stdout not being properly accessible.
          ;;; Hence, this will not work when run this way but works when run from a jar via "java -jar ...".
          (if (:daemon arg-map)
            (-> (agent 0) (await))
            (do
              (println "Broker started... Type \"q\" followed by <Return> to quit: ")
              (while (not= "q" (read-line))
                (println "Type \"q\" followed by <Return> to quit: "))
              (shutdown-fn))))))))


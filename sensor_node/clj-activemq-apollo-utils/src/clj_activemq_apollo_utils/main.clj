;;;
;;;   Copyright 2015, Frankfurt University of Applied Sciences
;;;
;;;   This software is released under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;

(ns
  ^{:author "Ruediger Gad",
    :doc "Main class for starting a simple broker."}
  clj-activemq-apollo-utils.main
  (:use clojure.pprint
        clojure.tools.cli
        clj-activemq-apollo-utils.runner)
  (:gen-class))

(defn -main [& args]
  (let [cli-args (cli args
                      ["-u" "--uri" 
                       "URI to bind the broker to. NOT USED!!! This has no effect, right now!" 
                       :default "tcp://localhost:61613"]
                      ["-d" "--daemon" "Run as daemon." :flag true :default false]
                      ["-h" "--help" "Print this help." :flag true])
        arg-map (cli-args 0)
        extra-args (cli-args 1)
        help-string (cli-args 2)]
    (if (arg-map :help)
      (println help-string)
      (do
        (println "Starting Broker using the following options:")
        (pprint arg-map)
        (pprint extra-args)
        (let [url (arg-map :url)
              broker (create-and-start-broker)
              shutdown-fn (fn []
                            (stop-broker broker))]
          (if (:daemon arg-map)
            (-> (agent 0) (await))
            (do
              (println "Broker started... Type \"q\" followed by <Return> to quit: ")
              (while (not= "q" (read-line))
                (println "Type \"q\" followed by <Return> to quit: "))
              (shutdown-fn))))))))


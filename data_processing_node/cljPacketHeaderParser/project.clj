;(defproject cljPacketHeaderParser "1.2.2"
(defproject cljPacketHeaderParser "1.3.0-SNAPSHOT"
  :description "Reads header events in raw format, parses the raw data, 
                and sends the parsed data back as events."
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.cli "0.2.1"]
                 [cljActiveMqRunner "1.5.6"]
                 [clj-activemq-apollo-utils "0.1.4"]
                 [cljSnifferEventGenerator "1.7.8-SNAPSHOT"]]
  :main cljPacketHeaderParser.main)

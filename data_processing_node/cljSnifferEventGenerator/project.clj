;(defproject cljSnifferEventGenerator "1.4.6"
(defproject cljSnifferEventGenerator "1.7.9-SNAPSHOT"
  :description "cljSnifferEventGenerator sniffs the network traffic and sends information
                about captured packets to a JMS topic. The information about the captured
                packets is intended as events that can be processed with CEP."
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.cli "0.2.1"]
                 [cljActiveMqRunner "1.5.6"]
                 [clj-net-pcap "1.6.994"]
                 [clj-kryonet-utils "0.1.0-SNAPSHOT"]
                 [com.ning/compress-lzf "1.0.0"]
                 [org.xerial.snappy/snappy-java "1.0.4.1"]
                 [clj-activemq-apollo-utils "0.1.4"]]
  :aot [#"^cljSnifferEventGenerator.*"]
  :global-vars {*warn-on-reflection* true}
  :main cljSnifferEventGenerator.main
  :java-source-paths ["src-java"]
;  :java-source-path "src"
;  :omit-source true
)

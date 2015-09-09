(defproject cljActiveMqRunner "1.5.6"
;(defproject cljActiveMqRunner "1.6.0-SNAPSHOT"
  :description "Command line application for starting and optionally 
                monitoring (rly?) ActiveMQ."
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.cli "0.2.1"]
;                 [org.slf4j/slf4j-api "1.5.11"]
;                 [org.slf4j/slf4j-simple "1.5.11"]
                 [com.ning/compress-lzf "1.0.0"]
                 [org.xerial.snappy/snappy-java "1.0.4.1"]
                 [com.esotericsoftware.kryo/kryo "2.22"]
                 [org.apache.activemq/activemq-broker "5.9.0"]
                 [org.apache.activemq/activemq-client "5.9.0"]
                 [org.apache.activemq/activemq-openwire-legacy "5.9.0"]
                 [clj-assorted-utils "1.4.4"]]
  :jvm-opts["-Djava.net.preferIPv4Stack=true"]
  :global-vars {*warn-on-reflection* true}
  :java-source-paths ["src-java"]
  :main cljActiveMqRunner.main)

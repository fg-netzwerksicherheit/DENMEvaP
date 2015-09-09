;(defproject cljDebugConsumer "1.0.0"
(defproject cljDebugConsumer "1.4.0-SNAPSHOT"
  :description "Command line application for monitoring ActiveMQ."
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.cli "0.2.1"]
                 [clj-assorted-utils "1.4.2"]
                 [clj-net-pcap "1.6.992"]
                 [clj-activemq-apollo-utils "0.1.4"]
                 [cljActiveMqRunner "1.5.6"]
                 [org.slf4j/slf4j-api "1.5.11"]
                 [org.apache.commons/commons-lang3 "3.2.1"]
                 [com.ning/compress-lzf "1.0.0"]
                 [org.xerial.snappy/snappy-java "1.0.4.1"]
                 [cljSnifferEventGenerator "1.7.9-SNAPSHOT"]
                 [org.slf4j/slf4j-simple "1.5.11"]]
  :global-vars {*warn-on-reflection* true}
  :jvm-opts ["-Djavax.net.debug=ssl,handshake" "-Djavax.net.ssl.trustStore=/home/rc/Downloads/apache-apollo-1.6/bin/foobar/etc/keystore" "-Djavax.net.ssl.trustStorePassword=password"]
  :main cljDebugConsumer.main)


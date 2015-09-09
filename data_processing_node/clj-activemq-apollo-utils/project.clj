(defproject clj-activemq-apollo-utils "0.1.4"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :global-vars {*warn-on-reflection* true}
  :dependencies [[org.clojure/clojure "1.5.1"]
;                 [org.apache.activemq/apache-apollo "1.5"]
                 [org.apache.activemq/apollo-stomp "1.6"]
                 [org.apache.activemq/apollo-leveldb "1.6"]
                 [org.apache.activemq/apollo-web "1.6"]
                 [org.slf4j/slf4j-log4j12 "1.6.1"]
                 [org.apache.geronimo.specs/geronimo-jms_1.1_spec "1.1"]
                 [org.fusesource.stompjms/stompjms-client "1.19"]
                 [org.clojure/tools.cli "0.2.4"]
                 [com.ning/compress-lzf "1.0.0"]
                 [org.xerial.snappy/snappy-java "1.0.4.1"]
                 [com.esotericsoftware.kryo/kryo "2.22"]
                 [clj-assorted-utils "1.5.1"]]
  :main clj-activemq-apollo-utils.main)

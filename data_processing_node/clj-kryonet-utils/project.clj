(defproject clj-kryonet-utils "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.cli "0.2.1"]
                 [clj-assorted-utils "1.4.2"]
                 [clj-net-pcap "1.6.3"]
                 [kryonet/kryonet "2.21-2"]]
  :global-vars {*warn-on-reflection* true}
  :main clj-kryonet-utils.main
;  :jvm-opts ["-Djava.net.preferIPv4Stack=true"]
)


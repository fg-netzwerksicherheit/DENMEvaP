(defproject cljEsperRunner "1.5.0"
;(defproject cljEsperRunner "1.6.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.cli "0.2.1"]
                 [clj-assorted-utils "1.0.0"]
                 [clj-net-pcap "1.6.994"]
                 [cljActiveMqRunner "1.5.6"]
                 [cljSnifferEventGenerator "1.7.9-SNAPSHOT"]
                 [com.espertech/esper "4.8.0"]]
  :aot [cljEsperRunner.main]
           ; cljEsperRunner.EsperHibernateAdapter]
  :global-vars {*warn-on-reflection* true}
  :main cljEsperRunner.main
  :test-selectors {:default (fn [t]
                              (not
                                (or
                                  (:benchmark t))))
                   :benchmark :benchmark
                   :all (fn [_] true)}
  :java-source-path "src"
  :omit-source true
  :test2junit-run-ant true)


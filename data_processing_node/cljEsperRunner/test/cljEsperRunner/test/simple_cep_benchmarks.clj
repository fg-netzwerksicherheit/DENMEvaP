;;;
;;;   
;;;   Copyright (C) 2015, Frankfurt University of Applied Sciences
;;;
;;;   This program is free software; you can redistribute it and/or modify it under the terms of the
;;;   GNU General Public License as published by the Free Software Foundation; either version 2 of the License,
;;;   or (at your option) any later version.
;;;
;;;   This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
;;;   without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
;;;   See the GNU General Public License for more details.
;;;
;;;   You should have received a copy of the GNU General Public License along with this program;
;;;   if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
;;;
;;;
;;;   Linking this library statically or dynamically with other modules is making a combined work based on this library.
;;;   Thus, the terms and conditions of the GNU General Public License cover the whole combination.
;;;
;;;   As a special exception, the copyright holders of this library give you permission to link this library with
;;;   independent modules to produce an executable, regardless of the license terms of these independent modules,
;;;   and to copy and distribute the resulting executable under terms of your choice, provided that you also meet,
;;;   for each linked independent module, the terms and conditions of the license of that module. An independent module
;;;   is a module which is not derived from or based on this library. If you modify this library, you may extend
;;;   this exception to your version of the library, but you are not obligated to do so. If you do not wish to do so,
;;;   delete this exception statement from your version.
;;;   
;;;
;;;
;;;   In addition, this software is also licensed under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;
;;;

(ns 
  ^{:author "Ruediger Gad",
    :doc "Simple CEP engine benchmarks."}
   cljEsperRunner.test.simple-cep-benchmarks
  (:use clojure.test
        clj-assorted-utils.util
        cljEsperRunner.esper)
  (:require (clojure [string :as str])
            (cljEsperRunner.patterns [simple-conntrack :as simple-conntrack-patterns])
            (cljEsperRunner.test.data.conntrack [simple :as conntrack-samples])))

(defn stdout-formatter-fixture [f]
  (println "\n########## START ##########")
  (f)
  (println "########### END ###########\n\n"))

(use-fixtures :each stdout-formatter-fixture)

(def test-delay 200)
(def metric-delay 1000)

(deftest ^:benchmark general-metric-test
  (let [events [{"test.event" 
                 {"a" 1
                  "b" 2
                  "c" 3}}]
        sp (service-provider events)

        st-was-run (prepare-flag)
        st-counter (prepare-counter)
        st (statement sp {:name "test-statement" :expression "SELECT * FROM test.event WHERE a = 1"})
        listener-fn (fn [e _] 
                      (inc-counter st-counter) 
                      (set-flag st-was-run) 
                      ;(println (.getProperties (aget e 0)))
                      )
        _ (add-listener st listener-fn)

        metric-collector (ref [])
        metric-was-run (prepare-flag)
        metric-counter (prepare-counter)

        _ (engine-metric-fn sp
                            (set-flag metric-was-run)
                            (inc-counter metric-counter)
                            (println data))
        _ (statement-metric-fn sp
                               (set-flag metric-was-run)
                               (inc-counter metric-counter)
                               (println data))

        send-fn (create-send-fn sp)]
    (is (not (flag-set? st-was-run)))
    (is (not (flag-set? metric-was-run)))

    (dotimes [_ 1000]
      (send-fn events))
    (Thread/sleep test-delay)
    (Thread/sleep metric-delay)

    (is (flag-set? st-was-run))
    (is (flag-set? metric-was-run))

    (destroy sp)
    (println @st-counter @metric-counter @metric-collector)))

(deftest ^:benchmark first-benchmark-test
  (let [test-count 10000
        events [{"test.event"
                 {"a" 1
                  "b" 2}}]
        sp (service-provider events)

        st-counter (prepare-counter)
        st (statement sp {:name "test-statement" :expression "SELECT * FROM test.event WHERE a = 1"})
        _ (add-listener st (fn [_ _] (inc-counter st-counter)))

        metric-aggregator (ref {})
        _ (statement-metric-fn 
            sp 
            (if (= "test-statement" (get-in data [:statement-metric :statement-name]))
              (dosync 
                (alter metric-aggregator 
                       (fn [m] 
                         (merge-with 
                           + 
                           m 
                           (-> 
                             (:statement-metric data) 
                             (select-keys [:num-input :num-output-istream :cpu-time :wall-time]))))))))

        send-fn (create-send-fn sp)]
    (is (= 0 @st-counter))

    (println (time (dotimes [_ test-count] (send-fn events))))

    (Thread/sleep test-delay)
    (Thread/sleep metric-delay)

    (println @metric-aggregator)
    (is (= test-count @st-counter))))



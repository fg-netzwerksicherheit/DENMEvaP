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
;;;   In addition, this software is also licensed under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;
;;;

(ns 
  ^{:author "Ruediger Gad",
    :doc "Tests for combined conntrack and sniffer event patterns"}
   cljEsperRunner.test.combined-conntrack-and-sniffer-tests
  (:use clojure.test
        clj-assorted-utils.util
        cljEsperRunner.esper)
  (:require (clojure [string :as str])
            (cljEsperRunner.patterns [simple-conntrack :as simple-conntrack-patterns]
                                     [simple-sniffer :as simple-sniffer-patterns]
                                     [combined-conntrack-and-sniffer :as combined-patterns])
            (cljEsperRunner.test.data.conntrack [simple :as conntrack-samples])
            (cljEsperRunner.test.data.sniffer [simple :as sniffer-samples])))

(defn stdout-formatter-fixture [f]
  (println "\n########## START ##########")
  (f)
  (println "########### END ###########\n\n"))

(use-fixtures :each stdout-formatter-fixture)

(def test-delay 200)

(deftest compare-tcp-connection-duration
  (let [events (reduce into [[]
                             [conntrack-samples/tcp-update-ESTABLISHED-2
                              conntrack-samples/tcp-update-TIME-WAIT-2]
                             sniffer-samples/tcp-connection-established
                             sniffer-samples/tcp-connection-finished
                ])
        was-run (prepare-flag)
        sp (service-provider events)
        _ (statement sp simple-conntrack-patterns/tcp-connection-duration-conntrack)
        _ (statement sp simple-sniffer-patterns/tcp-connection-established)
        _ (statement sp simple-sniffer-patterns/tcp-connection-finished)
        _ (statement sp simple-sniffer-patterns/tcp-connection-duration)
        st (statement sp combined-patterns/tcp-connection-duration-delta)
        listener-fn (fn [e _] (set-flag was-run) (println (.getProperties (aget e 0))))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (flag-set? was-run))
    (destroy sp)))


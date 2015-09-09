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
    :doc "Tests for \"simple conntrack event patterns\""}
   cljEsperRunner.test.simple-conntrack-event-tests
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


;(deftest detect-tcp-destination-port-80
;  (let [event sniffer-samples/tcp-destination-port-80-syn
;        value (ref 0)
;        sp (service-provider event)
;        st (statement sp 
;                      "
;SELECT Tcp.destination 
;FROM sniffer.header.parsed 
;"
;                      )
;        listener-fn (fn [new-events _] 
;                      (let [event (aget new-events 0)
;                            bar (.get event "Tcp.destination")]
;                        (dosync (ref-set value bar))))
;        _ (add-listener st listener-fn)
;        send-fn (create-send-fn sp)]
;    (send-fn event)
;    (Thread/sleep test-delay)
;    (is (= 80 @value))
;    (destroy sp)))

(deftest tcp-connection-duration
  (let [events [conntrack-samples/tcp-update-ESTABLISHED
                conntrack-samples/tcp-update-TIME-WAIT]
        was-run (prepare-flag)
        sp (service-provider events)
        st (statement sp simple-conntrack-patterns/tcp-connection-duration-conntrack)
        listener-fn (fn [e _] (set-flag was-run) (println (.getProperties (aget e 0))))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (flag-set? was-run))
    (destroy sp)))



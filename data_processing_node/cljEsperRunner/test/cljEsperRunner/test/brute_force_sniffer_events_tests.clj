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
    :doc "Tests for \"intermediate event simple-sniffer-patterns\""}
   cljEsperRunner.test.brute-force-sniffer-events-tests
  (:use clojure.test
        clj-assorted-utils.util
        cljEsperRunner.esper)
  (:require (clojure [string :as str])
            (cljEsperRunner.patterns [simple-sniffer :as simple-sniffer-patterns]
                                     [brute-force-sniffer :as brute-force-sniffer-patterns])
            (cljEsperRunner.sample-data [sniffer :as sniffer-sample])
            (cljEsperRunner.test.data.sniffer [ssh-failed-login :as ssh-failed]
                                              [simple-ssh-bruteforce :as simple-ssh-bruteforce])))

(defn stdout-formatter-fixture [f]
  (println "\n########## START ##########")
  (f)
  (println "########### END ###########\n\n"))
(use-fixtures :each stdout-formatter-fixture)



(def test-delay 200)

(deftest test-for-complete-tcp-connection
  "Test if we really recorded a single TCP connection."
  (let [events ssh-failed/data-set
        event-type-template sniffer-sample/packet-with-all-fields
        c (prepare-counter)
        sp (service-provider event-type-template)
        _ (statement sp simple-sniffer-patterns/tcp-connection-established)
        _ (statement sp simple-sniffer-patterns/tcp-connection-finished)
        st (statement sp simple-sniffer-patterns/tcp-connection-duration)
        listener-fn (fn [event _]
                      (do
                        (inc-counter c)
                        (println (-> event (aget 0) (.get "duration")))))
        _ (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (= 1 @c))
    (destroy sp)))

(deftest detect-ssh-connection-test
  "We want to have a pattern to 'detect' SSH connections once they are finished.
   For now we are going to simply look for the port number."
  (let [events ssh-failed/data-set
        event-type-template sniffer-sample/packet-with-all-fields
        f (prepare-flag)
        sp (service-provider event-type-template)
        _ (statement sp simple-sniffer-patterns/tcp-connection-established)
        _ (statement sp simple-sniffer-patterns/tcp-connection-finished)
        _ (statement sp simple-sniffer-patterns/tcp-connection-duration)
        st (statement sp brute-force-sniffer-patterns/ssh-connection-duration)
        listener-fn (fn [event _]
                      (do
                        (set-flag f)))
        _ (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (flag-set? f))
    (destroy sp)))

(deftest detect-short-ssh-connection-test
  "Detect 'short' SSH connections. 
   We will use this as indicator for a first, blunt brute-force detection pattern."
  (let [events ssh-failed/data-set
        event-type-template sniffer-sample/packet-with-all-fields
        f (prepare-flag)
        sp (service-provider event-type-template)
        _ (statement sp simple-sniffer-patterns/tcp-connection-established)
        _ (statement sp simple-sniffer-patterns/tcp-connection-finished)
        _ (statement sp simple-sniffer-patterns/tcp-connection-duration)
        _ (statement sp brute-force-sniffer-patterns/ssh-connection-duration)
        st (statement sp brute-force-sniffer-patterns/ssh-connection-short)
        listener-fn (fn [event _]
                      (do
                        (set-flag f)))
        _ (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (flag-set? f))
    (destroy sp)))

(deftest detect-ssh-bruteforce-test
  "Very simple way for detecting SSH brute-force attacks."
  (let [events simple-ssh-bruteforce/data-set
        event-type-template sniffer-sample/packet-with-all-fields
        f (prepare-flag)
        sp (service-provider event-type-template)
        _ (statement sp simple-sniffer-patterns/tcp-connection-established)
        _ (statement sp simple-sniffer-patterns/tcp-connection-finished)
        _ (statement sp simple-sniffer-patterns/tcp-connection-duration)
        _ (statement sp brute-force-sniffer-patterns/ssh-connection-duration)
        _ (statement sp brute-force-sniffer-patterns/ssh-connection-short)
        st (statement sp brute-force-sniffer-patterns/ssh-simple-bruteforce)
        listener-fn (fn [event _]
                      (do
                        (set-flag f)))
        _ (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (flag-set? f))
    (destroy sp)))


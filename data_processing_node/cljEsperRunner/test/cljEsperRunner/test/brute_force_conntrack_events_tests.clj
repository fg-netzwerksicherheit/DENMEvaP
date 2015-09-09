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
   cljEsperRunner.test.brute-force-conntrack-events-tests
  (:use clojure.test
        clj-assorted-utils.util
        cljEsperRunner.esper)
  (:require (clojure [string :as str])
            (cljEsperRunner.patterns [simple-conntrack :as simple-patterns]
                                     [brute-force-conntrack :as brute-force-patterns])
            (cljEsperRunner.sample-data [conntrack :as conntrack-sample])
            (cljEsperRunner.test.data.conntrack [simple-ssh-brute-force :as simple-ssh-brute-force]
                                                [ssh-brute-force-sshpass-wlan0-2012-11-26 :as sshbf])))

(defn stdout-formatter-fixture [f]
  (println "\n########## START ##########")
  (f)
  (println "########### END ###########\n\n"))
(use-fixtures :each stdout-formatter-fixture)



(def test-delay 200)

(deftest test-for-complete-tcp-connection
  "Test if we really recorded a single TCP connection."
  (let [events simple-ssh-brute-force/data-set
        event-type-template conntrack-sample/tcp-event-with-all-fields-set
        c (prepare-counter)
        sp (service-provider event-type-template)
        _ (statement sp simple-patterns/tcp-connection-established-conntrack)
        _ (statement sp simple-patterns/tcp-connection-finished-conntrack)
        st (statement sp simple-patterns/tcp-connection-duration-conntrack-2)
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
  (let [events simple-ssh-brute-force/data-set
        event-type-template conntrack-sample/tcp-event-with-all-fields-set
        f (prepare-flag)
        sp (service-provider event-type-template)
        _ (statement sp simple-patterns/tcp-connection-established-conntrack)
        _ (statement sp simple-patterns/tcp-connection-finished-conntrack)
        _ (statement sp simple-patterns/tcp-connection-duration-conntrack-2)
        st (statement sp brute-force-patterns/ssh-connection-duration-conntrack)
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
  (let [events simple-ssh-brute-force/data-set
        event-type-template conntrack-sample/tcp-event-with-all-fields-set
        f (prepare-flag)
        sp (service-provider event-type-template)
        _ (statement sp simple-patterns/tcp-connection-established-conntrack)
        _ (statement sp simple-patterns/tcp-connection-finished-conntrack)
        _ (statement sp simple-patterns/tcp-connection-duration-conntrack-2)
        _ (statement sp brute-force-patterns/ssh-connection-duration-conntrack)
        st (statement sp brute-force-patterns/ssh-connection-short-conntrack)
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
  (let [events sshbf/data-set
        event-type-template conntrack-sample/tcp-event-with-all-fields-set
        f (prepare-flag)
        sp (service-provider event-type-template)
        _ (statement sp simple-patterns/tcp-connection-established-conntrack)
        _ (statement sp simple-patterns/tcp-connection-finished-conntrack)
        _ (statement sp simple-patterns/tcp-connection-duration-conntrack-2)
        _ (statement sp brute-force-patterns/ssh-connection-duration-conntrack)
        _ (statement sp brute-force-patterns/ssh-connection-short-conntrack)
        st (statement sp brute-force-patterns/ssh-simple-bruteforce-conntrack)
        listener-fn (fn [event _]
                      (do
                        (set-flag f)))
        _ (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (flag-set? f))
    (destroy sp)))


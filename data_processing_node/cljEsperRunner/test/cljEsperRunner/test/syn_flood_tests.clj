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
    :doc "Tests for syn flood situations."}
   cljEsperRunner.test.syn-flood-tests
  (:use clojure.test
        clj-assorted-utils.util
        cljEsperRunner.esper)
  (:require (clojure [string :as str])
            (cljEsperRunner.patterns [sniffer-syn-flood :as syn-patterns]
                                     [simple-sniffer :as simple-patterns])
            (cljEsperRunner.sample-data [sniffer :as sniffer-sample])
            (cljEsperRunner.test.data.sniffer [simple :as simple-data]
                                              [syn-flood-short :as syn-short]
                                              [syn-flood-sender-rand-2012-11-07 :as flood-rand])))


(def ^:dynamic *delay* 2000)

(deftest test-tcp-syn-without-connection
  (let [event simple-data/tcp-destination-port-80-syn
        sp (service-provider event)
        _ (statement sp simple-patterns/tcp-connection-established)
        _ (statement sp simple-patterns/tcp-syn-sent)
        st (statement sp syn-patterns/tcp-syn-without-connection)
        flag (prepare-flag)
        _ (add-listener st (fn [_ _] (set-flag flag)))]
    (is (not (flag-set? flag)))
    ((create-send-fn sp) event)
    (sleep *delay*)
    (is (flag-set? flag))
    (destroy sp)))

(deftest test-tcp-syn-flood-without-connection
  (let [events syn-short/data-set
        sp (service-provider events)
        _ (statement sp simple-patterns/tcp-connection-established)
        _ (statement sp simple-patterns/tcp-syn-sent)
        _ (statement sp syn-patterns/tcp-syn-without-connection)
        st (statement sp syn-patterns/tcp-syn-flood-without-connection)
        counter (prepare-counter)
        _ (add-listener st (fn [_ _] (inc-counter counter)))]
    (is (= 0 @counter))
    ((create-send-fn sp) events)
    (sleep *delay*)
    (is (= 1 @counter))
    (destroy sp)))

(deftest test-tcp-syn-flood
  (let [events syn-short/data-set
        sp (service-provider events)
        _ (statement sp simple-patterns/tcp-connection-established)
        _ (statement sp simple-patterns/tcp-syn-sent)
        st (statement sp syn-patterns/tcp-syn-flood)
        counter (prepare-counter)
        _ (add-listener st (fn [_ _] (inc-counter counter)))]
    (is (= 0 @counter))
    ((create-send-fn sp) events)
    (sleep *delay*)
    (is (= 1 @counter))
    (destroy sp)))

(deftest test-syn-dos
  (let [events flood-rand/data-set
        sp (service-provider events)
        _ (statement sp simple-patterns/tcp-connection-established)
        _ (statement sp simple-patterns/tcp-syn-sent)
        _ (statement sp syn-patterns/tcp-syn-flood)
        st (statement sp syn-patterns/tcp-syn-dos)
        flag (prepare-flag)
        _ (add-listener st (fn [_ _] (set-flag flag)))]
    (is (not (flag-set? flag)))
    ((create-send-fn sp) events)
    (sleep *delay*)
    (is (flag-set? flag))
    (destroy sp)))

(deftest test-syn-dos-without-connection
  (let [events flood-rand/data-set
        sp (service-provider events)
        _ (statement sp simple-patterns/tcp-connection-established)
        _ (statement sp simple-patterns/tcp-syn-sent)
        _ (statement sp syn-patterns/tcp-syn-without-connection)
        _ (statement sp syn-patterns/tcp-syn-flood-without-connection)
        st (statement sp syn-patterns/tcp-syn-dos-without-connection)
        flag (prepare-flag)
        _ (add-listener st (fn [_ _] (set-flag flag)))]
    (is (not (flag-set? flag)))
    ((create-send-fn sp) events)
    (sleep *delay*)
    (is (flag-set? flag))
    (destroy sp)))


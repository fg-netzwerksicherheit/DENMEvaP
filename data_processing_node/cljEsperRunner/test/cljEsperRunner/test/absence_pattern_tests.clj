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
    :doc "Tests for implementing the absence pattern."}
   cljEsperRunner.test.absence-pattern-tests
  (:use clojure.test
        clj-assorted-utils.util
        cljEsperRunner.esper)
  (:require (clojure [string :as str])
            (cljEsperRunner.patterns [simple-sniffer :as simple-sniffer-patterns])
            (cljEsperRunner.test.data.sniffer [simple :as sniffer-samples])))

(defn stdout-formatter-fixture [f]
  (println "\n########## START ##########")
  (f)
  (println "########### END ###########\n\n"))
(use-fixtures :each stdout-formatter-fixture)


(def *delay* 400)
(def *threshold* 800)


(def events-a-followed-by-b
  [{"a" {"foo" 1}}
   {"b" {"bar" 2}}])
(def events-a-not-followed-by-b
  [{"a" {"foo" 1}}])
(def events-b-not-preceded-by-a
  [{"b" {"bar" 2}}])

(def pattern-a-followed-by-b
"
SELECT *
FROM PATTERN [
  EVERY
    a
  ->
    b
]")
    
(def pattern-a-not-followed-by-b
"
SELECT *
FROM PATTERN [
  EVERY
    a(foo = 1)
  ->
    (timer:interval(400 msec) AND NOT b(bar = 2))
]")

(def pattern-b-not-preceded-by-a
"
SELECT *
FROM 
  b.std:lastevent()
LEFT OUTER JOIN
  a.win:time(1 sec)
ON
  a.foo = b.bar
")



(deftest event-followed-by-event
  (let [events [{"a" {"foo" 1}}
                {"a" {"foo" 1}}]
        sp (service-provider events)
        st (statement sp 
"
SELECT *
FROM PATTERN [
  EVERY
    e1 = a
  ->
    e2 = a(foo = e1.foo)
]
")
        flag (prepare-flag)
        _ (add-listener st (fn [_ _] (set-flag flag)))]
    (is (not (flag-set? flag)))
    ((create-send-fn sp) events)
    (sleep *delay*)
    (is (flag-set? flag))
    (destroy sp)))

(deftest test-a-followed-by-b
  (let [sp (service-provider events-a-followed-by-b)
        st (statement sp pattern-a-followed-by-b)
        flag (prepare-flag)
        _ (add-listener st (fn [_ _] (set-flag flag)))]
    (is (not (flag-set? flag)))
    ((create-send-fn sp) events-a-followed-by-b)
    (sleep *delay*)
    (is (flag-set? flag))
    (destroy sp)))

(deftest test-a-not-followed-by-b
  (let [sp (service-provider events-a-followed-by-b)
        ;;; Above we supply an event sample with a and b as template
        ;;; for the service provider initialization such that it is 
        ;;; aware of. We, however, do not send a and b but just a below.
        st (statement sp pattern-a-not-followed-by-b)
        flag (prepare-flag)
        _ (add-listener st (fn [_ _] (set-flag flag)))]
    (is (not (flag-set? flag)))
    ((create-send-fn sp) events-a-not-followed-by-b)
    (sleep *threshold*)
    (is (flag-set? flag))
    (destroy sp)))

(deftest test-a-followed-by-b-cross-check
  (let [sp (service-provider events-a-followed-by-b)
        st1 (statement sp pattern-a-followed-by-b)
        flag1 (prepare-flag)
        _ (add-listener st1 (fn [_ _] (set-flag flag1)))
        st2 (statement sp pattern-a-not-followed-by-b)
        flag2 (prepare-flag)
        _ (add-listener st2 (fn [_ _] (set-flag flag2)))]
    (is (not (flag-set? flag1)))
    (is (not (flag-set? flag2)))
    ((create-send-fn sp) events-a-followed-by-b)
    (sleep *threshold*)
    (is (flag-set? flag1))
    (is (not (flag-set? flag2)))
    (destroy sp)))

(deftest test-a-not-preceded-by-b
  (let [sp (service-provider events-a-followed-by-b)
        ;;; Above we supply an event sample with a and b as template
        ;;; for the service provider initialization such that it is 
        ;;; aware of. We, however, do not send a and b but just b below.
        _ (statement sp "CREATE WINDOW aWind.win:time(3 sec) SELECT * FROM a")
        st (statement sp pattern-b-not-preceded-by-a)
        flag (prepare-flag)
        _ (add-listener st (fn [_ _] (set-flag flag)))]
    (is (not (flag-set? flag)))
    (sleep *threshold*)
;    ((create-send-fn sp) events-b-not-preceded-by-a)
    ((create-send-fn sp) events-a-followed-by-b)
    (sleep 2000)
    ((create-send-fn sp) events-b-not-preceded-by-a)
    (sleep *threshold*)
    (is (flag-set? flag))
    (destroy sp)))


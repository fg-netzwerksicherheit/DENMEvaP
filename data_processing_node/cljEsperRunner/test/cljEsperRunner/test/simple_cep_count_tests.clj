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
    :doc "Tests for counting events that are processed by a given pattern."}
   cljEsperRunner.test.simple-cep-count-tests
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

(def basic-delay 400)

(deftest count-events-test
  (let [events [{"foo" {"bar" 1}}
                {"foo" {"bar" 2}}
                {"abc" {"def" "xyz"}}
                {"foo" {"bar" 3}}]
        sp (service-provider events)
        st (statement sp "select bar from foo")
        counter (prepare-counter)
        listener-fn (fn [_ _]
                      (inc-counter counter))
        _ (add-listener st listener-fn)]
    ((create-send-fn sp) events)
    (Thread/sleep basic-delay)
    (destroy sp)
    (is (= 3 @counter))))

(deftest statement-hit-counter-test
  (let [events [{"foo" {"bar" 1}}
                {"foo" {"bar" 2}}
                {"abc" {"def" "xyz"}}
                {"foo" {"bar" 3}}]
        sp (service-provider events)
        st (statement sp "select bar from foo")
        counter (statement-hit-counter st)]
    ((create-send-fn sp) events)
    (Thread/sleep basic-delay)
    (destroy sp)
    (is (= 3 @counter))))

(deftest counted-statement-test
  (let [events [{"foo" {"bar" 1}}
                {"foo" {"bar" 2}}
                {"abc" {"def" "xyz"}}
                {"foo" {"bar" 3}}]
        sp (service-provider events)
        counter (counted-statement sp "select bar from foo")]
    ((create-send-fn sp) events)
    (Thread/sleep basic-delay)
    (destroy sp)
    (is (= 3 @counter))))

(deftest count-tcp-established-test
  (let [events sniffer-samples/tcp-connection-established 
        sp (service-provider events)
        counter-all (counted-statement sp "select * from sniffer.header.parsed")
        counter-tcp-est (counted-statement sp simple-sniffer-patterns/tcp-connection-established)
        ]
    ((create-send-fn sp) events)
    (Thread/sleep basic-delay)
    (destroy sp)
    (is (= 3 @counter-all))
    (is (= 1 @counter-tcp-est))))


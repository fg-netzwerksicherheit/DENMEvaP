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
   cljEsperRunner.test.count-syn-flood-conntrack-events
  (:use clojure.test
        clj-assorted-utils.util
        cljEsperRunner.esper)
  (:require (clojure [string :as str])
            (cljEsperRunner.patterns [simple-conntrack :as simple-patterns]
                                     [conntrack-syn-flood :as syn-patterns])
            (cljEsperRunner.test.data.conntrack [simple :as conntrack-samples]
                                                [syn-flood-sender-rand-2012-11-07 :as rand-01]
                                                [syn-flood-sender-rand-2012-11-26 :as rand-02])))

(defn stdout-formatter-fixture [f]
  (println "\n########## START ##########")
  (f)
  (println "########### END ###########\n\n"))
(use-fixtures :each stdout-formatter-fixture)

(deftest count-syn-dos-without-connection-rand-01
  (let [events rand-01/data-set
        sp (service-provider events)
        cnt-all (counted-statement sp "select * from conntrack.parsed")
        cnt-tcp-est (counted-statement sp simple-patterns/tcp-connection-established-conntrack)
        cnt-tcp-syn (counted-statement sp simple-patterns/tcp-syn-sent-conntrack)
        cnt-tcp-wo-syn (counted-statement sp syn-patterns/tcp-syn-without-connection-conntrack)
        cnt-tcp-syn-flood (counted-statement sp syn-patterns/tcp-syn-flood-without-connection-conntrack)
        cnt-dos (counted-statement sp syn-patterns/tcp-syn-dos-without-connection-conntrack)]
    ((create-send-fn sp) events)
    (sleep 1000)
    (println "data-set: rand-01 ; all:" @cnt-all "; tcp-est:" @cnt-tcp-est "; tcp-syn:" @cnt-tcp-syn "; tcp-wo-syn:" @cnt-tcp-wo-syn "; syn-flood:" @cnt-tcp-syn-flood "; dos:" @cnt-dos)
    (destroy sp)))

(deftest count-syn-dos-rand-01
  (let [events rand-01/data-set
        sp (service-provider events)
        cnt-all (counted-statement sp "select * from conntrack.parsed")
        cnt-tcp-syn (counted-statement sp simple-patterns/tcp-syn-sent-conntrack)
        cnt-syn-flood (counted-statement sp syn-patterns/tcp-syn-flood-conntrack)
        cnt-dos (counted-statement sp syn-patterns/tcp-syn-dos-conntrack)]
    ((create-send-fn sp) events)
    (sleep 1000)
    (println "data-set: rand-01 ; all:" @cnt-all "; tcp-syn:" @cnt-tcp-syn "; syn-flood:" @cnt-syn-flood "; dos:" @cnt-dos)
    (destroy sp)))

(deftest count-syn-dos-without-connection-rand-02
  (let [events rand-02/data-set
        sp (service-provider events)
        cnt-all (counted-statement sp "select * from conntrack.parsed")
        cnt-tcp-est (counted-statement sp simple-patterns/tcp-connection-established-conntrack)
        cnt-tcp-syn (counted-statement sp simple-patterns/tcp-syn-sent-conntrack)
        cnt-tcp-wo-syn (counted-statement sp syn-patterns/tcp-syn-without-connection-conntrack)
        cnt-tcp-syn-flood (counted-statement sp syn-patterns/tcp-syn-flood-without-connection-conntrack)
        cnt-dos (counted-statement sp syn-patterns/tcp-syn-dos-without-connection-conntrack)]
    ((create-send-fn sp) events)
    (sleep 1000)
    (println "data-set: rand-02 ; all:" @cnt-all "; tcp-est:" @cnt-tcp-est "; tcp-syn:" @cnt-tcp-syn "; tcp-wo-syn:" @cnt-tcp-wo-syn "; syn-flood:" @cnt-tcp-syn-flood "; dos:" @cnt-dos)
    (destroy sp)))

(deftest count-syn-dos-rand-02
  (let [events rand-02/data-set
        sp (service-provider events)
        cnt-all (counted-statement sp "select * from conntrack.parsed")
        cnt-tcp-syn (counted-statement sp simple-patterns/tcp-syn-sent-conntrack)
        cnt-syn-flood (counted-statement sp syn-patterns/tcp-syn-flood-conntrack)
        cnt-dos (counted-statement sp syn-patterns/tcp-syn-dos-conntrack)]
    ((create-send-fn sp) events)
    (sleep 1000)
    (println "data-set: rand-02 ; all:" @cnt-all "; tcp-syn:" @cnt-tcp-syn "; syn-flood:" @cnt-syn-flood "; dos:" @cnt-dos)
    (destroy sp)))


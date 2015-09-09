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
    :doc "Tests for counting events that are processed by a given pattern."}
   cljEsperRunner.test.count-congestion-sniffer-events
  (:use clojure.test
        clj-assorted-utils.util
        cljEsperRunner.esper)
  (:require (clojure [string :as str])
            (cljEsperRunner.patterns [simple-sniffer :as simple-patterns]
                                     [sniffer-congestion :as congestion-patterns])
            (cljEsperRunner.test.data.sniffer [congestion-situation-em1-2012-11-28 :as sample-01]
                                              [congestion-situation-wlan0-2012-12-07 :as sample-02]
                                              [simple :as sniffer-sample])))

(defn stdout-formatter-fixture [f]
  (println "\n########## START ##########")
  (f)
  (println "########### END ###########\n\n"))
(use-fixtures :each stdout-formatter-fixture)


(deftest count-congestion-situation-events
  (let [events sample-01/data-set
        sp (service-provider sniffer-sample/icmp-echo-request)
        cnt-all (counted-statement sp "select * from sniffer.header.parsed")
        cnt-echo-req (counted-statement sp simple-patterns/icmp-echo-request)
        cnt-echo-rep (counted-statement sp simple-patterns/icmp-echo-reply)
        cnt-ping-time (counted-statement sp simple-patterns/icmp-ping-response-time)
        cnt-congest-sit (counted-statement sp congestion-patterns/simple-congest)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep 1000)
    (println "sample-01: all:" @cnt-all "echo-req:" @cnt-echo-req "echo-rep:" @cnt-echo-rep "ping-time:" @cnt-ping-time "congest:" @cnt-congest-sit)
    (destroy sp)))

(deftest count-congestion-situation-events2
  (let [events sample-02/data-set
        sp (service-provider sniffer-sample/icmp-echo-request)
        cnt-all (counted-statement sp "select * from sniffer.header.parsed")
        cnt-echo-req (counted-statement sp simple-patterns/icmp-echo-request)
        cnt-echo-rep (counted-statement sp simple-patterns/icmp-echo-reply)
        cnt-ping-time (counted-statement sp simple-patterns/icmp-ping-response-time)
        cnt-congest-sit (counted-statement sp congestion-patterns/simple-congest)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep 1000)
    (println "sample-02: all:" @cnt-all "echo-req:" @cnt-echo-req "echo-rep:" @cnt-echo-rep "ping-time:" @cnt-ping-time "congest:" @cnt-congest-sit)
    (destroy sp)))


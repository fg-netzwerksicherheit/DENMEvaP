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
   cljEsperRunner.test.count-brute-force-flood-sniffer-events
  (:use clojure.test
        clj-assorted-utils.util
        cljEsperRunner.esper)
  (:require (clojure [string :as str])
            (cljEsperRunner.patterns [simple-sniffer :as simple-patterns]
                                     [brute-force-sniffer :as brute-force])
            (cljEsperRunner.test.data.sniffer [simple-ssh-bruteforce-wlan0-sshpass-2012-08-19 :as sample-01]
                                              [ssh-brute-force-sshpass-wlan0-2012-11-26 :as sample-02]
                                              [ssh-brute-force-sshpass-em1-2012-12-06 :as sample-03]
                                              [ssh-brute-force-sshpass-em1-2-2012-12-06 :as sample-04])))

(defn stdout-formatter-fixture [f]
  (println "\n########## START ##########")
  (f)
  (println "########### END ###########\n\n"))
(use-fixtures :each stdout-formatter-fixture)


(deftest detect-ssh-bruteforce-test
  "Very simple way for detecting SSH brute-force attacks."
  (let [events sample-01/data-set
        sp (service-provider events)
        cnt-all (counted-statement sp "select * from sniffer.header.parsed")
        cnt-est (counted-statement sp simple-patterns/tcp-connection-established)
        cnt-fin (counted-statement sp simple-patterns/tcp-connection-finished)
        cnt-dur (counted-statement sp simple-patterns/tcp-connection-duration)
        cnt-ssh-dur (counted-statement sp brute-force/ssh-connection-duration)
        cnt-ssh-short (counted-statement sp brute-force/ssh-connection-short)
        cnt-ssh-bf (counted-statement sp brute-force/ssh-simple-bruteforce)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep 1000)
    (println "sample-01: all:" @cnt-all "est:" @cnt-est "fin:" @cnt-fin "dur:" @cnt-dur "ssh-dur:" @cnt-ssh-dur "ssh-short:" @cnt-ssh-short "ssh-bf:" @cnt-ssh-bf)
    (destroy sp)))

(deftest detect-ssh-bruteforce-test2
  "Very simple way for detecting SSH brute-force attacks."
  (let [events sample-02/data-set
        sp (service-provider sample-01/data-set)
        cnt-all (counted-statement sp "select * from sniffer.header.parsed")
        cnt-est (counted-statement sp simple-patterns/tcp-connection-established)
        cnt-fin (counted-statement sp simple-patterns/tcp-connection-finished)
        cnt-dur (counted-statement sp simple-patterns/tcp-connection-duration)
        cnt-ssh-dur (counted-statement sp brute-force/ssh-connection-duration)
        cnt-ssh-short (counted-statement sp brute-force/ssh-connection-short)
        cnt-ssh-bf (counted-statement sp brute-force/ssh-simple-bruteforce)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep 1000)
    (println "sample-02: all:" @cnt-all "est:" @cnt-est "fin:" @cnt-fin "dur:" @cnt-dur "ssh-dur:" @cnt-ssh-dur "ssh-short:" @cnt-ssh-short "ssh-bf:" @cnt-ssh-bf)
    (destroy sp)))

(deftest detect-ssh-bruteforce-test3
  "Very simple way for detecting SSH brute-force attacks."
  (let [events sample-03/data-set
        sp (service-provider sample-01/data-set)
        cnt-all (counted-statement sp "select * from sniffer.header.parsed")
        cnt-est (counted-statement sp simple-patterns/tcp-connection-established)
        cnt-fin (counted-statement sp simple-patterns/tcp-connection-finished)
        cnt-dur (counted-statement sp simple-patterns/tcp-connection-duration)
        cnt-ssh-dur (counted-statement sp brute-force/ssh-connection-duration)
        cnt-ssh-short (counted-statement sp brute-force/ssh-connection-short)
        cnt-ssh-bf (counted-statement sp brute-force/ssh-simple-bruteforce)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep 1000)
    (println "sample-03: all:" @cnt-all "est:" @cnt-est "fin:" @cnt-fin "dur:" @cnt-dur "ssh-dur:" @cnt-ssh-dur "ssh-short:" @cnt-ssh-short "ssh-bf:" @cnt-ssh-bf)
    (destroy sp)))

(deftest detect-ssh-bruteforce-test4
  "Very simple way for detecting SSH brute-force attacks."
  (let [events sample-04/data-set
        sp (service-provider sample-01/data-set)
        cnt-all (counted-statement sp "select * from sniffer.header.parsed")
        cnt-est (counted-statement sp simple-patterns/tcp-connection-established)
        cnt-fin (counted-statement sp simple-patterns/tcp-connection-finished)
        cnt-dur (counted-statement sp simple-patterns/tcp-connection-duration)
        cnt-ssh-dur (counted-statement sp brute-force/ssh-connection-duration)
        cnt-ssh-short (counted-statement sp brute-force/ssh-connection-short)
        cnt-ssh-bf (counted-statement sp brute-force/ssh-simple-bruteforce)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep 1000)
    (println "sample-04: all:" @cnt-all "est:" @cnt-est "fin:" @cnt-fin "dur:" @cnt-dur "ssh-dur:" @cnt-ssh-dur "ssh-short:" @cnt-ssh-short "ssh-bf:" @cnt-ssh-bf)
    (destroy sp)))


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
    :doc "Tests for \"simple event simple-sniffer-patterns\""}
   cljEsperRunner.test.simple-sniffer-event-tests
  (:use clojure.test
        clj-assorted-utils.util
        cljEsperRunner.esper)
  (:require (clojure [string :as str])
            (cljEsperRunner.patterns [simple-sniffer :as simple-sniffer-patterns])
            (cljEsperRunner.sample-data [sniffer :as sniffer-sample])
            (cljEsperRunner.test.data.sniffer [simple :as test-data])))

(defn stdout-formatter-fixture [f]
  (println "\n########## START ##########")
  (f)
  (println "########### END ###########\n\n"))

(use-fixtures :each stdout-formatter-fixture)


(def test-delay 200)

(deftest value-from-event
  (let [event {"foo" {"bar" 42}}
        value (ref 0)
        sp (service-provider event)
        st (statement sp "select bar from foo")
                listener-fn (fn [new-events _] 
                              (let [event (aget new-events 0)
                                    bar (.get event "bar")]
                                (dosync (ref-set value bar))))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn event)
    (Thread/sleep test-delay)
    (is (= 42 @value))
    (destroy sp)))

(deftest time-batch-average
  (let [events (into [] 
                     (for [x (range 11)] 
                       {"foo" {"bar" x}}))
        value (ref 0)
        sp (service-provider events)
        st (statement sp (str "select avg(bar) from foo.win:time_batch(" (* test-delay 0.85) " msec)"))
        listener-fn (fn [new-events _] 
                      (let [event (aget new-events 0)
                            bar (.get event "avg(bar)")]
                        (dosync (ref-set value bar))))
                listener (add-listener st listener-fn)
                send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (= 5.0 @value))
    (destroy sp)))

(deftest test-followed-by
  (let [events (into [] 
                     (for [x (range 4)] 
                       {"foo" {"bar" x}}))
        was-run (prepare-flag)
        sp (service-provider events)
        st (statement sp "
select * from pattern 
[every foo(bar=1) -> foo(bar=2) -> foo(bar=3)]
")
        listener-fn (fn [_ _] (set-flag was-run))
                listener (add-listener st listener-fn)
                send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (flag-set? was-run))
    (destroy sp)))


(deftest send-event-with-missing-properties
  (let [event test-data/tcp-destination-port-80-syn
        event-type-template sniffer-sample/packet-with-all-fields
        value (ref 0)
        sp (service-provider event-type-template)
        st (statement sp 
                      "
SELECT Tcp.destination 
FROM sniffer.header.parsed 
"
                      )
        listener-fn (fn [new-events _] 
                      (let [event (aget new-events 0)
                            bar (.get event "Tcp.destination")]
                        (dosync (ref-set value bar))))
        _ (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn event)
    (Thread/sleep test-delay)
    (is (= 80 @value))
    (destroy sp)))

(deftest detect-tcp-destination-port-80
  (let [event test-data/tcp-destination-port-80-syn
        value (ref 0)
        sp (service-provider event)
        st (statement sp 
                      "
SELECT Tcp.destination 
FROM sniffer.header.parsed 
"
                      )
        listener-fn (fn [new-events _] 
                      (let [event (aget new-events 0)
                            bar (.get event "Tcp.destination")]
                        (dosync (ref-set value bar))))
        _ (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn event)
    (Thread/sleep test-delay)
    (is (= 80 @value))
    (destroy sp)))

(deftest test-tcp-flags
  (let [event test-data/tcp-destination-port-80-syn
        value-ack (ref false)
        value-syn (ref false)
        sp (service-provider event)
        st-ack (statement sp 
                          "
SELECT Tcp.flags.contains(\"ACK\")
FROM sniffer.header.parsed
"
                          )
        listener-fn-ack (fn [new-events _] 
                          (let [event (aget new-events 0)
                                ack (.get event "Tcp.flags.contains(\"ACK\")")]
                            (dosync (ref-set value-ack ack))))
        _ (add-listener st-ack listener-fn-ack)
        st-syn (statement sp 
                          "
SELECT Tcp.flags.contains(\"SYN\")
FROM sniffer.header.parsed
"
                          )
        listener-fn-syn (fn [new-events _] 
                          (let [event (aget new-events 0)
                                syn (.get event "Tcp.flags.contains(\"SYN\")")]
                            (dosync (ref-set value-syn syn))))
        _ (add-listener st-syn listener-fn-syn)
        send-fn (create-send-fn sp)]
    (send-fn event)
    (Thread/sleep test-delay)
    (is (= false @value-ack))
    (is (= true @value-syn))
    (destroy sp)))

(deftest icmp-ping-response-time
  (let [events [test-data/icmp-echo-request
                test-data/icmp-echo-reply]
        was-run (prepare-flag)
        sp (service-provider events)
        st (statement sp simple-sniffer-patterns/icmp-echo-request)
        st (statement sp simple-sniffer-patterns/icmp-echo-reply)
        st (statement sp simple-sniffer-patterns/icmp-ping-response-time)
        listener-fn (fn [e _] (set-flag was-run) (println (.getProperties (aget e 0))))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (flag-set? was-run))
    (destroy sp)))

(deftest detect-tcp-connection-established
  (let [events test-data/tcp-connection-established       
        was-run (prepare-flag)
        sp (service-provider events)
        st (statement sp simple-sniffer-patterns/tcp-connection-established)
        listener-fn (fn [e _] (set-flag was-run) (println (.getProperties (aget e 0))))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (flag-set? was-run))
    (destroy sp)))

(deftest detect-tcp-connection-finished
  (let [events test-data/tcp-connection-finished        
        was-run (prepare-flag)
        sp (service-provider events)
        st (statement sp simple-sniffer-patterns/tcp-connection-finished)
        listener-fn (fn [e _] (set-flag was-run))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (flag-set? was-run))
    (destroy sp)))

(deftest tcp-connection-duration
  (let [events (reduce into [[]
                             test-data/tcp-connection-established
                             test-data/tcp-connection-finished])
        was-run (prepare-flag)
        sp (service-provider events)
        _ (statement sp simple-sniffer-patterns/tcp-connection-established)
        _ (statement sp simple-sniffer-patterns/tcp-connection-finished)
        st (statement sp simple-sniffer-patterns/tcp-connection-duration)
        listener-fn (fn [e _] (set-flag was-run) (println (.getProperties (aget e 0))))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (flag-set? was-run))
    (destroy sp)))

(deftest detect-tcp-connection-established-localhost-ip6
  (let [events test-data/tcp-connection-established-localhost-ip6
        was-run (prepare-flag)
        sp (service-provider events)
        st (statement sp simple-sniffer-patterns/tcp-connection-established)
        listener-fn (fn [e _] (set-flag was-run) (println (.getProperties (aget e 0))))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (flag-set? was-run))
    (destroy sp)))

(deftest detect-tcp-connection-finished-localhost-ip6
  (let [events test-data/tcp-connection-finished-localhost-ip6
        was-run (prepare-flag)
        sp (service-provider events)
        st (statement sp simple-sniffer-patterns/tcp-connection-finished)
        listener-fn (fn [e _] (set-flag was-run))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (flag-set? was-run))
    (destroy sp)))

(deftest tcp-connection-duration-localhost-ip6
  (let [events (reduce into [[]
                             test-data/tcp-connection-established-localhost-ip6
                             test-data/tcp-connection-finished-localhost-ip6])
        was-run (prepare-flag)
        sp (service-provider events)
        _ (statement sp simple-sniffer-patterns/tcp-connection-established)
        _ (statement sp simple-sniffer-patterns/tcp-connection-finished)
        st (statement sp simple-sniffer-patterns/tcp-connection-duration)
        listener-fn (fn [e _] (set-flag was-run) (println (.getProperties (aget e 0))))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (flag-set? was-run))
    (destroy sp)))

(deftest arp-request
  (let [events [test-data/arp-request]
        was-run (prepare-flag)
        sp (service-provider events)
        st (statement sp simple-sniffer-patterns/arp-request)
        listener-fn (fn [e _] (set-flag was-run) (println (.getProperties (aget e 0))))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (flag-set? was-run))
    (destroy sp)))

(deftest arp-reply
  (let [events [test-data/arp-reply]
        was-run (prepare-flag)
        sp (service-provider events)
        st (statement sp simple-sniffer-patterns/arp-reply)
        listener-fn (fn [e _] (set-flag was-run) (println (.getProperties (aget e 0))))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (flag-set? was-run))
    (destroy sp)))

(deftest arp-request-cross-test
  (let [events [test-data/arp-request]
        was-run (prepare-flag)
        was-run2 (prepare-flag)
        sp (service-provider events)
        st (statement sp simple-sniffer-patterns/arp-request)
        st2 (statement sp simple-sniffer-patterns/arp-reply)
        listener-fn (fn [e _] (set-flag was-run) (println (.getProperties (aget e 0))))
        listener-fn2 (fn [e _] (set-flag was-run2) (println (.getProperties (aget e 0))))
        listener (add-listener st listener-fn)
        listener2 (add-listener st2 listener-fn2)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (flag-set? was-run))
    (is (not (flag-set? was-run2)))
    (destroy sp)))

(deftest arp-reply-cross-test
  (let [events [test-data/arp-reply]
        was-run (prepare-flag)
        was-run2 (prepare-flag)
        sp (service-provider events)
        st (statement sp simple-sniffer-patterns/arp-request)
        st2 (statement sp simple-sniffer-patterns/arp-reply)
        listener-fn (fn [e _] (set-flag was-run) (println (.getProperties (aget e 0))))
        listener-fn2 (fn [e _] (set-flag was-run2) (println (.getProperties (aget e 0))))
        listener (add-listener st listener-fn)
        listener2 (add-listener st2 listener-fn2)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (not (flag-set? was-run)))
    (is (flag-set? was-run2))
    (destroy sp)))

(deftest tcp-syn-sent-test
  (let [events [test-data/tcp-destination-port-80-syn]
        was-run (prepare-flag)
        sp (service-provider events)
        st (statement sp simple-sniffer-patterns/tcp-syn-sent)
        listener-fn (fn [e _] (set-flag was-run) (println (.getProperties (aget e 0))))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn events)
    (Thread/sleep test-delay)
    (is (flag-set? was-run))
    (destroy sp)))


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
    :doc "Tests for Esper integration"}
  cljEsperRunner.test.esper
  (:use clojure.test
        clj-assorted-utils.util
        cljEsperRunner.esper)
  (:import (com.espertech.esper.core.service EPServiceProviderImpl)
           (com.espertech.esper.client EPStatement)))

(def test-delay 200)

(deftest test-service-provider
  (let [sp (service-provider)]
    (is (not (nil? sp)))
    (is (= (type sp) com.espertech.esper.core.service.EPServiceProviderImpl))
    (destroy sp)))

(deftest service-provider-add-map-events
  (let [event-samples [{"foo" {"bar" 123
                               "baz" "some string"}}
                       {"snafu" {"tarfun" "another string"}}]
        sp (service-provider event-samples)]
    (is (not (nil? sp)))
    (is (= com.espertech.esper.core.service.EPServiceProviderImpl (type sp)))
    (destroy sp)))

(deftest test-statement
  (let [sp (service-provider [{"foo" {"bar" 0}}])
        st (statement sp "select bar from foo")]
    (is (not (nil? st)))
    (is (= com.espertech.esper.core.service.EPStatementImpl (type st)))
    (destroy sp)))

(deftest listener-and-send-event
  (let [events [{"foo" {"bar" 0}}
                {"foo" {"bar" 1}}]
        event {"foo" {"bar" 2}}
        sp (service-provider events)
        st (statement sp "select bar from foo")
        was-run (prepare-flag)
        listener-fn (fn [_ _] (set-flag was-run))
        listener (add-listener st listener-fn)
        send-fn (create-send-fn sp)]
    (send-fn event)
    (send-fn events)
    (Thread/sleep test-delay)
    (is (flag-set? was-run))
    (destroy sp)))

(deftest nested-maps-event
  (let [event-sample {"foo" {"bar" 0
                             "snafu" {"blah" "blub"
                                      "baz" {"abc" 0}}}}
        sp (service-provider event-sample)
        st (statement sp "select snafu.baz.abc from foo")]
    (is (not (nil? st)))
    (is (= com.espertech.esper.core.service.EPStatementImpl (type st)))
    (destroy sp)))

(deftest two-nested-maps-event
  (let [event-sample {"f.o.o" {"snafu" {"blah" "blub"}
                               "baz" {"abc" 0}}}
        sp (service-provider event-sample)
        st (statement sp "select baz.abc from f.o.o")]
    (is (not (nil? st)))
    (is (= com.espertech.esper.core.service.EPStatementImpl (type st)))
    (destroy sp)))


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
    :doc "Esper integration"}
  cljEsperRunner.esper
  (:import (com.espertech.esper.client Configuration
                                       EPServiceProviderManager
                                       EventBean
                                       UpdateListener)
           (com.espertech.esper.core.service EPRuntimeImpl)
           (java.util Map))
  (:use clj-assorted-utils.util))

(declare add-event-type)

(defn event-attribute-description [provider attribute]
  (let [attribute-name (key attribute)
        attribute-val (val attribute)
        tmp-type (type attribute-val)
        ; Hack to treat integers specially.
        ; This is quite ugly and brute-force but should circumvent this issue for now.
        attribute-type (if (and (= tmp-type (type 123)) (< attribute-val 1000))
                         (type (int attribute-val))
                         tmp-type)]
    (cond
      (map? attribute-val) (let [type-name (str attribute-name "Type")]
                             (do
                               (println "We found a map:" attribute-val ": " attribute)
                               (add-event-type provider {type-name attribute-val})
                               {attribute-name type-name}))
      :default {attribute-name attribute-type})))

(defn add-event-type 
  ([provider event-sample]
    (let [event-name (first (keys event-sample))
          event-attributes (event-sample event-name)
          config (-> provider (.getEPAdministrator) (.getConfiguration))]
      (if (not (.isEventTypeExists config event-name))
        (if (map? event-attributes)
          (let [event-description (into {}
                                        (map
                                          (fn [attr] (event-attribute-description provider attr))
                                          event-attributes))]
            (.addEventType config event-name event-description)
            (println "Added event type:" event-name "with description:" event-description))
          (.addEventType config event-name event-attributes)))))
  ([provider event-name event-class]
    (let [config (-> provider (.getEPAdministrator) (.getConfiguration))]
      (.addEventType config event-name event-class))))

(defn service-provider
  ([]
    (let [config (Configuration.)
;          _ (doto (-> (.getEngineDefaults config) (.getMetricsReporting))
;              (.setEnableMetricsReporting true)
;              (.setEngineInterval 1000)
;              (.setStatementInterval 1000)
;              (.setThreading true))
      ]
      (EPServiceProviderManager/getDefaultProvider config)))
  ([event-sample]
    ;;; Create the provider first and then add event types to it.
    ;;; If we do it the other way around: create a Configuration instance first,
    ;;; add event types to this and then pass the Configuration instance to the
    ;;; EPServiceProviderManager/getDefaultProvider method we get pretty strange
    ;;; errors when using nested maps that seem to be related to the way the
    ;;; nested event types are named; e.g., already a too long length of the
    ;;; nested "types" type names was sufficient to trigger that error.
    ;;; For the record, the following was the exception thrown:
    ;;; com.espertech.esper.client.EPException:
    ;;; Nestable map type configuration encountered an unexpected property type
    ;;; name 'PcapHeadertttttt' for property 'PcapHeader',
    ;;; expected java.lang.Class or java.util.Map or the name of a
    ;;; previously-declared Map type
    (let [provider (service-provider)]
      (if (vector? event-sample)
        (doseq [es event-sample]
          (add-event-type provider es))
        (add-event-type provider event-sample))
      provider)))

(defn destroy [provider]
  (.destroy provider))

(defn statement [provider statement-definition]
  (let [admin (.getEPAdministrator provider)
        expression (if (map? statement-definition)
                     (:expression statement-definition)
                     (str statement-definition))
        st (if (map? statement-definition)
             (.createEPL admin expression (:name statement-definition))
             (.createEPL admin expression))
        st-name (.getName st)
        config (.getConfiguration admin)]
;    (.setMetricsReportingStmtEnabled config st-name)
    (println "Added statement:" st-name)
    st))

(defn create-simple-statement [provider expression]
  (let [admin (.getEPAdministrator provider)
        st (.createEPL admin expression)
        st-name (.getName st)]
    (println "Added statement:" st-name)
    st))

(defmulti send-event (fn [e _] (vector? e)))
(defmethod send-event false [event ^EPRuntimeImpl rt]
  (if (map? event)
    (let [^String event-name (first (keys event))]
      (.sendEvent rt ^Map (event event-name) event-name))
    (.sendEvent rt event)))
(defmethod send-event true [events rt]
  (doseq [e events]
    (send-event e rt)))

(defmulti send-named-event (fn [e _ _] (vector? e)))
(defmethod send-named-event false [^Object event ^String event-name ^EPRuntimeImpl rt]
    (.sendEvent rt event event-name))
(defmethod send-named-event true [events event-name rt]
  (doseq [e events]
    (send-named-event e event-name rt)))

(defn create-send-fn
  ([provider]
    (let [runtime (.getEPRuntime provider)]
      (fn [event]
        (send-event event runtime))))
  ([provider event-name]
    (let [runtime (.getEPRuntime provider)]
      (fn [event]
        (send-named-event event event-name runtime)))))

(defn add-listener [statement listener-fn]
  (let [listener (proxy [UpdateListener] []
                   (update [#^EventBean new-events #^EventBean old-events]
                           (listener-fn new-events old-events)))]
    (.addListener statement listener)))

(defmacro engine-metric-fn [sp & body]
  `(let [engine-metric-st# (statement ~sp "SELECT * FROM com.espertech.esper.client.metric.EngineMetric")
         callback-fn# (fn [~'event ~'object]
                        (let [engine-metric# (.getUnderlying (aget ~'event 0))
                              ~'data {:engine-metric
                                      {:input-count (.getInputCount engine-metric#)
                                       :input-count-delta (.getInputCountDelta engine-metric#)
                                       :schedule-depth (.getScheduleDepth engine-metric#)}}]
                          ~@body))]
     (add-listener engine-metric-st# callback-fn#)))

(defmacro statement-metric-fn [sp & body]
  `(let [statement-metric-st# (statement ~sp "SELECT * FROM com.espertech.esper.client.metric.StatementMetric")
         callback-fn# (fn [~'event ~'object]
                        (let [statement-metric# (.getUnderlying (aget ~'event 0))
                              ~'data {:statement-metric
                                      {:cpu-time (.getCpuTime statement-metric#)
                                       :num-input (.getNumInput statement-metric#)
                                       :num-output-istream (.getNumOutputIStream statement-metric#)
                                       :num-output-rstream (.getNumOutputRStream statement-metric#)
                                       :statement-name (.getStatementName statement-metric#)
                                       :timestamp (.getTimestamp statement-metric#)
                                       :wall-time (.getWallTime statement-metric#)}}]
                          ~@body))]
     (add-listener statement-metric-st# callback-fn#)))

(defn statement-hit-counter [st]
  (let [counter (prepare-counter)
        listener-fn (fn [_ _]
                      (inc-counter counter))
        _ (add-listener st listener-fn)]
    counter))

(defn counted-statement [sp expr]
  (let [st (statement sp expr)]
    (statement-hit-counter st)))

(defmacro def-epl-pattern [name expression]
  `(def ~name
     {:name ~(str name)
      :expression ~expression}))

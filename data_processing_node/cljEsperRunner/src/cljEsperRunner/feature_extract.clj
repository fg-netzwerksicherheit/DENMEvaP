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
    :doc "Feature extraction"}
  cljEsperRunner.feature-extract
  (:use clj-assorted-utils.util
        clj-net-pcap.core
        cljEsperRunner.esper
        cljEsperRunner.sample-data.sniffer
        clojure.pprint))

(defn extract-features
  [pcap-file output-suffix event-pattern label]
  (let [events (ref [])
        result-events (ref [])
;        _ (process-pcap-file-to-map
;            pcap-file
;            (fn [m]
;              (dosync (alter events conj {"sniffer.header.parsed" m}))))
        sp (service-provider packet-with-all-fields)
        st (statement sp event-pattern)
        _ (add-listener st (fn [new-events _] 
                             (let [result (-> new-events (aget 0) (.getProperties))]
                               (println result)
                               (dosync (alter result-events conj result)))))
        send-fn (create-send-fn sp)]
    (send-fn @events)
    (sleep 1000)
    (if (not (empty? @result-events))
      (with-open [wrtr# (clojure.java.io/writer (str pcap-file output-suffix))]
        (binding [*out* wrtr#]
          (cl-format true "~{~d~^,~}" (.keySet (into (sorted-map) (first @result-events))))
          (if (and (not (nil? label)) (not= "" label))
            (print (str "," label)))
          (println)
          (doseq [ev @result-events]
            (cl-format true "~{~d~^,~}" (.values (into (sorted-map) ev)))
            (if (and (not (nil? label)) (not= "" label))
              (print (str "," label)))
            (println)))))
    (destroy sp)))


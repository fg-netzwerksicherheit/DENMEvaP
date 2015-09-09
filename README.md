# DENMEvaP

Distributed Event-driven Network Monitoring Evaluation Prototype (DENMEvaP)



A minimal prototype consists of at least two computers:

- The sensor node acts as event producer and acquires raw data in the monitored computer network.
- The data processing node hosts, e.g., the communication infrastructure, the CEP engine, and the event consumer that is used for measuring the end-to-end throughput.



This repository contains for each of these nodes a snapshot of the latest source code versions as used for the evaluation of distributed event-driven network monitoring.
In addition, build dependencies that are not otherwise available, e.g., via maven or clojars projects, are also included as snapshots of the latest version.
In the following, an overview of the content is given:

- Sensor Node
  - clj-activemq-apollo-utils
  - cljActiveMqRunner
  - clj-kryonet-utils
  - cljSnifferEventGenerator
- Data Processing Node
  - clj-activemq-apollo-utils
  - cljActiveMqRunner
  - cljDebugConsumer
  - cljEsperRunner
  - clj-kryonet-utils
  - cljPacketHeaderParser
  - cljSnifferEventGenerator
  - jEsperToolkit

Please note that some projects were uploaded for the sensor and the data processing node.
The reason is that there may be specific changes in these projects such that the versions from the sensor and data processing nodes may differ.







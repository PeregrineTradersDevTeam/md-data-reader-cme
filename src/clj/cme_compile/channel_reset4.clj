
(ns cme-compile.channel-reset4
  (:use [pcap-common.macros]
        [pcap-common.parquet-util])
  (:import [mktdata ChannelReset4Decoder   ChannelReset4Decoder$NoMDEntriesDecoder]
           [java.util Map]
           [org.apache.parquet.io.api Binary RecordConsumer]
           [org.apache.parquet.hadoop ParquetRecordWriter]
           ))

(def message-schema
  "
  optional int64 transact_time;
  optional int32 match_event_indicator;
  repeated group md_entries {
    optional int32 md_update_action;
    optional int32 md_entry_type;
    optional int32 appl_id;
  }
  ")
(defn- message-write [^RecordConsumer rconsumer #^long start-at ^ChannelReset4Decoder top-level]
  
  (with-field-new rconsumer "transact_time"  (+ start-at 0) (.addLong (.transactTime top-level)))

  (with-field-new rconsumer "match_event_indicator"  (+ start-at 1) (.addInteger (let [field (.matchEventIndicator top-level)] (.getByte (.buffer field) (.offset field)))))

  (let [repetition-decoder (.noMDEntries top-level)]
    (when (> (.count repetition-decoder) 0)
      (.startField rconsumer "md_entries" (+ start-at 2))
      (while (.hasNext ^java.util.Iterator repetition-decoder)
        (let [^ChannelReset4Decoder$NoMDEntriesDecoder repetition (.next ^java.util.Iterator repetition-decoder)]

          (.startGroup rconsumer)
          (with-field-new rconsumer "md_update_action" 0 (.addInteger 0))

          (with-field-new rconsumer "md_entry_type" 1 (.addInteger (Integer/parseInt \J)))

          (with-field-new rconsumer "appl_id" 2 (.addInteger (.applID repetition)))

          (.endGroup rconsumer)
          ))
      (.endField rconsumer "md_entries" (+ start-at 2)))))

(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer (str prefix "-channel-reset4.parquet")
                                  (make-loopless-proxy message-write (compile-schema message-schema) {})))
(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new ChannelReset4Decoder) buffer subOffset actingBlockLength actingVersion))  

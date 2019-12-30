
  (ns cme-compile.md-incremental-refresh-volume37
  (:use [pcap-common.macros]
        [pcap-common.parquet-util])
  (:import [mktdata MDIncrementalRefreshVolume37Decoder   MDIncrementalRefreshVolume37Decoder$NoMDEntriesDecoder]
           [java.util Map]
           [org.apache.parquet.io.api Binary RecordConsumer]
           [org.apache.parquet.hadoop ParquetRecordWriter]
           ))

  (def message-schema
   "
  optional int64 transact_time;
  optional int32 match_event_indicator;
  repeated group md_entries {
    optional int32 md_entry_size;
    optional int32 security_id;
    optional int32 rpt_seq;
    optional int32 md_update_action;
    optional int32 md_entry_type;
  }
  ")
  (defn- message-write [^RecordConsumer rconsumer #^long start-at ^MDIncrementalRefreshVolume37Decoder top-level]
                    
(with-field-new rconsumer "transact_time"  (+ start-at 0) (.addLong (.transactTime top-level)))

(with-field-new rconsumer "match_event_indicator"  (+ start-at 1) (.addInteger (let [field (.matchEventIndicator top-level)] (.getByte (.buffer field) (.offset field)))))

 (let [repetition-decoder (.noMDEntries top-level)]
(when (> (.count repetition-decoder) 0)
(.startField rconsumer "md_entries" (+ start-at 2))
(while (.hasNext ^java.util.Iterator repetition-decoder)
(let [^MDIncrementalRefreshVolume37Decoder$NoMDEntriesDecoder repetition (.next ^java.util.Iterator repetition-decoder)]

(.startGroup rconsumer)
(with-field-new rconsumer "md_entry_size" 0 (.addInteger (.mDEntrySize repetition)))

(with-field-new rconsumer "security_id" 1 (.addInteger (.securityID repetition)))

(with-field-new rconsumer "rpt_seq" 2 (.addInteger (.rptSeq repetition)))

(with-field-new rconsumer "md_update_action" 3 (.addInteger (.value (.mDUpdateAction repetition))))

(with-field-new rconsumer "md_entry_type" 4 (.addInteger (int \e)))

(.endGroup rconsumer)
)) (.endField rconsumer "md_entries" (+ start-at 2))))

)  
  (defn ^ParquetRecordWriter make-record-writer [prefix]
   (make-parquet-integrated-writer (str prefix "-md-incremental-refresh-volume37.parquet")
    (make-loopless-proxy message-write (compile-schema message-schema) {})))
  (defn decode [subOffset actingBlockLength actingVersion buffer]
    (.wrap (new MDIncrementalRefreshVolume37Decoder) buffer subOffset actingBlockLength actingVersion))  
  

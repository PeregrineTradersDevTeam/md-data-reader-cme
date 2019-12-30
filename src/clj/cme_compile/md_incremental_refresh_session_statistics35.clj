
  (ns cme-compile.md-incremental-refresh-session-statistics35
  (:use [pcap-common.macros]
        [pcap-common.parquet-util]
        [cme-compile.md-incremental-refresh-session-statistics])
  (:import [mktdata MDIncrementalRefreshSessionStatistics35Decoder MDIncrementalRefreshSessionStatistics51Decoder   MDIncrementalRefreshSessionStatistics35Decoder$NoMDEntriesDecoder MDIncrementalRefreshSessionStatistics51Decoder$NoMDEntriesDecoder]
           [java.util Map]
           [org.apache.parquet.io.api Binary RecordConsumer]
           [org.apache.parquet.hadoop ParquetRecordWriter]
           ))

  (defn- message-write [^RecordConsumer rconsumer #^long start-at ^MDIncrementalRefreshSessionStatistics35Decoder top-level]
                    
 (let [repetition-decoder (.noMDEntries top-level)]
(when (> (.count repetition-decoder) 0)
(.startField rconsumer "md_entries" (+ start-at 0))
(while (.hasNext ^java.util.Iterator repetition-decoder)
(let [^MDIncrementalRefreshSessionStatistics35Decoder$NoMDEntriesDecoder repetition (.next ^java.util.Iterator repetition-decoder)]

(.startGroup rconsumer)
(with-field-new rconsumer "md_entry_px_mantissa" 0 (.addLong (.mantissa (.mDEntryPx repetition))))

		(with-field-new rconsumer "md_entry_px_exponent" 1 (.addInteger -7))

(with-field-new rconsumer "security_id" 2 (.addInteger (.securityID repetition)))

(with-field-new rconsumer "rpt_seq" 3 (.addInteger (.rptSeq repetition)))

(let [src-value (.openCloseSettlFlag repetition)]
 (when (not= src-value mktdata.OpenCloseSettlFlag/NULL_VAL)
(with-field-new rconsumer "open_close_settl_flag" 4 (.addInteger (.value src-value)))))

(with-field-new rconsumer "md_update_action" 5 (.addInteger (.value (.mDUpdateAction repetition))))

(with-field-new rconsumer "md_entry_type" 6 (.addInteger (.value (.mDEntryType repetition))))

(let [src-value (.mDEntrySize repetition)]
 (when (not= src-value (. MDIncrementalRefreshSessionStatistics35Decoder$NoMDEntriesDecoder mDEntrySizeNullValue))
(with-field-new rconsumer "md_entry_size" 7 (.addInteger src-value))))

(.endGroup rconsumer)
)) (.endField rconsumer "md_entries" (+ start-at 0))))


(adapt-common (+ start-at 1) MDIncrementalRefreshSessionStatistics35Decoder)
)  
  (defn ^ParquetRecordWriter make-record-writer [prefix]
   (make-parquet-integrated-writer (str prefix "-md-incremental-refresh-session-statistics35.parquet")
    (make-loopless-proxy message-write (compile-schema message-schema) {})))
  (defn decode [subOffset actingBlockLength actingVersion buffer]
    (.wrap (new MDIncrementalRefreshSessionStatistics35Decoder) buffer subOffset actingBlockLength actingVersion))  
  
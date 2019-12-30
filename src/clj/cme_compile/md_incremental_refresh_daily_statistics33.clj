
  (ns cme-compile.md-incremental-refresh-daily-statistics33
  (:use [pcap-common.macros]
        [pcap-common.parquet-util]
        [cme-compile.md-incremental-refresh-daily-statistics])
  (:import [mktdata MDIncrementalRefreshDailyStatistics33Decoder MDIncrementalRefreshDailyStatistics49Decoder   MDIncrementalRefreshDailyStatistics33Decoder$NoMDEntriesDecoder MDIncrementalRefreshDailyStatistics49Decoder$NoMDEntriesDecoder]
           [java.util Map]
           [org.apache.parquet.io.api Binary RecordConsumer]
           [org.apache.parquet.hadoop ParquetRecordWriter]
           ))

  (defn- message-write [^RecordConsumer rconsumer #^long start-at ^MDIncrementalRefreshDailyStatistics33Decoder top-level]
                    
 (let [repetition-decoder (.noMDEntries top-level)]
(when (> (.count repetition-decoder) 0)
(.startField rconsumer "md_entries" (+ start-at 0))
(while (.hasNext ^java.util.Iterator repetition-decoder)
(let [^MDIncrementalRefreshDailyStatistics33Decoder$NoMDEntriesDecoder repetition (.next ^java.util.Iterator repetition-decoder)]

(.startGroup rconsumer)
(let [src-value (.mantissa (.mDEntryPx repetition))]
 (when (not= src-value (. mktdata.PRICENULLDecoder mantissaNullValue))
(with-field-new rconsumer "md_entry_px_mantissa" 0 (.addLong src-value))))

		(with-field-new rconsumer "md_entry_px_exponent" 1 (.addInteger -7))

(let [src-value (.mDEntrySize repetition)]
 (when (not= src-value (. MDIncrementalRefreshDailyStatistics33Decoder$NoMDEntriesDecoder mDEntrySizeNullValue))
(with-field-new rconsumer "md_entry_size" 2 (.addInteger src-value))))

(with-field-new rconsumer "security_id" 3 (.addInteger (.securityID repetition)))

(with-field-new rconsumer "rpt_seq" 4 (.addInteger (.rptSeq repetition)))

(let [src-value (.tradingReferenceDate repetition)]
 (when (not= src-value (. MDIncrementalRefreshDailyStatistics33Decoder$NoMDEntriesDecoder tradingReferenceDateNullValue))
(with-field-new rconsumer "trading_reference_date" 5 (.addInteger src-value))))

(with-field-new rconsumer "settl_price_type" 6 (.addInteger (let [field (.settlPriceType repetition)] (.getByte (.buffer field) (.offset field)))))

(with-field-new rconsumer "md_update_action" 7 (.addInteger (.value (.mDUpdateAction repetition))))

(with-field-new rconsumer "md_entry_type" 8 (.addInteger (.value (.mDEntryType repetition))))

(.endGroup rconsumer)
)) (.endField rconsumer "md_entries" (+ start-at 0))))


(adapt-common (+ start-at 1) MDIncrementalRefreshDailyStatistics33Decoder)
)  
  (defn ^ParquetRecordWriter make-record-writer [prefix]
   (make-parquet-integrated-writer (str prefix "-md-incremental-refresh-daily-statistics33.parquet")
    (make-loopless-proxy message-write (compile-schema message-schema) {})))
  (defn decode [subOffset actingBlockLength actingVersion buffer]
    (.wrap (new MDIncrementalRefreshDailyStatistics33Decoder) buffer subOffset actingBlockLength actingVersion))  
  
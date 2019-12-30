
  (ns cme-compile.md-incremental-refresh-limits-banding50
  (:use [pcap-common.macros]
        [pcap-common.parquet-util]
        [cme-compile.md-incremental-refresh-limits-banding])
  (:import [mktdata MDIncrementalRefreshLimitsBanding34Decoder MDIncrementalRefreshLimitsBanding50Decoder   MDIncrementalRefreshLimitsBanding34Decoder$NoMDEntriesDecoder MDIncrementalRefreshLimitsBanding50Decoder$NoMDEntriesDecoder]
           [java.util Map]
           [org.apache.parquet.io.api Binary RecordConsumer]
           [org.apache.parquet.hadoop ParquetRecordWriter]
           ))

  (defn- message-write [^RecordConsumer rconsumer #^long start-at ^MDIncrementalRefreshLimitsBanding50Decoder top-level]
                    
 (let [repetition-decoder (.noMDEntries top-level)]
(when (> (.count repetition-decoder) 0)
(.startField rconsumer "md_entries" (+ start-at 0))
(while (.hasNext ^java.util.Iterator repetition-decoder)
(let [^MDIncrementalRefreshLimitsBanding50Decoder$NoMDEntriesDecoder repetition (.next ^java.util.Iterator repetition-decoder)]

(.startGroup rconsumer)
(let [src-value (.mantissa (.highLimitPrice repetition))]
 (when (not= src-value (. mktdata.PRICENULL9Decoder mantissaNullValue))
(with-field-new rconsumer "high_limit_price_mantissa" 0 (.addLong src-value))))

		(with-field-new rconsumer "high_limit_price_exponent" 1 (.addInteger -9))

(let [src-value (.mantissa (.lowLimitPrice repetition))]
 (when (not= src-value (. mktdata.PRICENULL9Decoder mantissaNullValue))
(with-field-new rconsumer "low_limit_price_mantissa" 2 (.addLong src-value))))

		(with-field-new rconsumer "low_limit_price_exponent" 3 (.addInteger -9))

(let [src-value (.mantissa (.maxPriceVariation repetition))]
 (when (not= src-value (. mktdata.PRICENULL9Decoder mantissaNullValue))
(with-field-new rconsumer "max_price_variation_mantissa" 4 (.addLong src-value))))

		(with-field-new rconsumer "max_price_variation_exponent" 5 (.addInteger -9))

(with-field-new rconsumer "security_id" 6 (.addInteger (.securityID repetition)))

(with-field-new rconsumer "rpt_seq" 7 (.addInteger (.rptSeq repetition)))

(with-field-new rconsumer "md_update_action" 8 (.addInteger 0))

(with-field-new rconsumer "md_entry_type" 9 (.addInteger (Integer/parseInt \g)))

(.endGroup rconsumer)
)) (.endField rconsumer "md_entries" (+ start-at 0))))


(adapt-common (+ start-at 1) MDIncrementalRefreshLimitsBanding50Decoder)
)  
  (defn ^ParquetRecordWriter make-record-writer [prefix]
   (make-parquet-integrated-writer (str prefix "-md-incremental-refresh-limits-banding50.parquet")
    (make-loopless-proxy message-write (compile-schema message-schema) {})))
  (defn decode [subOffset actingBlockLength actingVersion buffer]
    (.wrap (new MDIncrementalRefreshLimitsBanding50Decoder) buffer subOffset actingBlockLength actingVersion))  
  
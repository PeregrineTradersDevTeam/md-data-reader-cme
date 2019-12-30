
  (ns cme-compile.snapshot-full-refresh52
  (:use [pcap-common.macros]
        [pcap-common.parquet-util]
        [cme-compile.snapshot-full-refresh])
  (:import [mktdata SnapshotFullRefresh38Decoder SnapshotFullRefresh52Decoder            SnapshotFullRefresh38Decoder$NoMDEntriesDecoder SnapshotFullRefresh52Decoder$NoMDEntriesDecoder]
           [java.util Map]
           [org.apache.parquet.io.api Binary RecordConsumer]
           [org.apache.parquet.hadoop ParquetRecordWriter]
           ))

  (defn- message-write [^RecordConsumer rconsumer #^long start-at ^SnapshotFullRefresh52Decoder top-level]
                    
(let [src-value (.mantissa (.highLimitPrice top-level))]
 (when (not= src-value (. mktdata.PRICENULL9Decoder mantissaNullValue))
(with-field-new rconsumer "high_limit_price_mantissa"  (+ start-at 0) (.addLong src-value))))

		(with-field-new rconsumer "high_limit_price_exponent"  (+ start-at 1) (.addInteger -9))

(let [src-value (.mantissa (.lowLimitPrice top-level))]
 (when (not= src-value (. mktdata.PRICENULL9Decoder mantissaNullValue))
(with-field-new rconsumer "low_limit_price_mantissa"  (+ start-at 2) (.addLong src-value))))

		(with-field-new rconsumer "low_limit_price_exponent"  (+ start-at 3) (.addInteger -9))

(let [src-value (.mantissa (.maxPriceVariation top-level))]
 (when (not= src-value (. mktdata.PRICENULL9Decoder mantissaNullValue))
(with-field-new rconsumer "max_price_variation_mantissa"  (+ start-at 4) (.addLong src-value))))

		(with-field-new rconsumer "max_price_variation_exponent"  (+ start-at 5) (.addInteger -9))

 (let [repetition-decoder (.noMDEntries top-level)]
(when (> (.count repetition-decoder) 0)
(.startField rconsumer "md_entries" (+ start-at 6))
(while (.hasNext ^java.util.Iterator repetition-decoder)
(let [^SnapshotFullRefresh52Decoder$NoMDEntriesDecoder repetition (.next ^java.util.Iterator repetition-decoder)]

(.startGroup rconsumer)
(let [src-value (.mantissa (.mDEntryPx repetition))]
 (when (not= src-value (. mktdata.PRICENULL9Decoder mantissaNullValue))
(with-field-new rconsumer "md_entry_px_mantissa" 0 (.addLong src-value))))

		(with-field-new rconsumer "md_entry_px_exponent" 1 (.addInteger -9))

(let [src-value (.mDEntrySize repetition)]
 (when (not= src-value (. SnapshotFullRefresh52Decoder$NoMDEntriesDecoder mDEntrySizeNullValue))
(with-field-new rconsumer "md_entry_size" 2 (.addInteger src-value))))

(let [src-value (.numberOfOrders repetition)]
 (when (not= src-value (. SnapshotFullRefresh52Decoder$NoMDEntriesDecoder numberOfOrdersNullValue))
(with-field-new rconsumer "number_of_orders" 3 (.addInteger src-value))))

(let [src-value (.mDPriceLevel repetition)]
 (when (not= src-value (. SnapshotFullRefresh52Decoder$NoMDEntriesDecoder mDPriceLevelNullValue))
(with-field-new rconsumer "md_price_level" 4 (.addInteger src-value))))

(let [src-value (.tradingReferenceDate repetition)]
 (when (not= src-value (. SnapshotFullRefresh52Decoder$NoMDEntriesDecoder tradingReferenceDateNullValue))
(with-field-new rconsumer "trading_reference_date" 5 (.addInteger src-value))))

(let [src-value (.openCloseSettlFlag repetition)]
 (when (not= src-value mktdata.OpenCloseSettlFlag/NULL_VAL)
(with-field-new rconsumer "open_close_settl_flag" 6 (.addInteger (.value src-value)))))

(with-field-new rconsumer "settl_price_type" 7 (.addInteger (let [field (.settlPriceType repetition)] (.getByte (.buffer field) (.offset field)))))

(with-field-new rconsumer "md_entry_type" 8 (.addInteger (.value (.mDEntryType repetition))))

(.endGroup rconsumer)
)) (.endField rconsumer "md_entries" (+ start-at 6))))


(adapt-common (+ start-at 7) SnapshotFullRefresh52Decoder)
)  
  (defn ^ParquetRecordWriter make-record-writer [prefix]
   (make-parquet-integrated-writer (str prefix "-snapshot-full-refresh52.parquet")
    (make-loopless-proxy message-write (compile-schema message-schema) {})))
  (defn decode [subOffset actingBlockLength actingVersion buffer]
    (.wrap (new SnapshotFullRefresh52Decoder) buffer subOffset actingBlockLength actingVersion))  
  
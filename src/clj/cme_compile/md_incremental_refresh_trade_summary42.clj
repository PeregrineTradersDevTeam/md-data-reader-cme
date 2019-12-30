(ns cme-compile.md-incremental-refresh-trade-summary42
    (:use [pcap-common.macros]
          [pcap-common.parquet-util]
          [cme-compile.md-incremental-refresh-trade-summary])
    (:import [mktdata MDIncrementalRefreshTradeSummary42Decoder MDIncrementalRefreshTradeSummary48Decoder   MDIncrementalRefreshTradeSummary42Decoder$NoMDEntriesDecoder MDIncrementalRefreshTradeSummary48Decoder$NoMDEntriesDecoder MDIncrementalRefreshTradeSummary42Decoder$NoOrderIDEntriesDecoder MDIncrementalRefreshTradeSummary48Decoder$NoOrderIDEntriesDecoder]
             [java.util Map]
             [org.apache.parquet.io.api Binary RecordConsumer]
             [org.apache.parquet.hadoop ParquetRecordWriter]))

(defn- message-write [^RecordConsumer rconsumer #^long start-at ^MDIncrementalRefreshTradeSummary42Decoder top-level]

  (let [repetition-decoder (.noMDEntries top-level)]
    (when (> (.count repetition-decoder) 0)
      (.startField rconsumer "md_entries" (+ start-at 0))
      (while (.hasNext ^java.util.Iterator repetition-decoder)
        (let [^MDIncrementalRefreshTradeSummary42Decoder$NoMDEntriesDecoder repetition (.next ^java.util.Iterator repetition-decoder)]

          (.startGroup rconsumer)
          (with-field-new rconsumer "md_entry_px_mantissa" 0 (.addLong (.mantissa (.mDEntryPx repetition))))

          (with-field-new rconsumer "md_entry_px_exponent" 1 (.addInteger -7))

          (with-field-new rconsumer "md_entry_size" 2 (.addInteger (.mDEntrySize repetition)))

          (with-field-new rconsumer "security_id" 3 (.addInteger (.securityID repetition)))

          (with-field-new rconsumer "rpt_seq" 4 (.addInteger (.rptSeq repetition)))

          (let [src-value (.numberOfOrders repetition)]
            (when (not= src-value (. MDIncrementalRefreshTradeSummary42Decoder$NoMDEntriesDecoder numberOfOrdersNullValue))
              (with-field-new rconsumer "number_of_orders" 5 (.addInteger src-value))))

          (let [src-value (.aggressorSide repetition)]
            (when (not= src-value mktdata.AggressorSide/NULL_VAL)
              (with-field-new rconsumer "aggressor_side" 6 (.addInteger (.value src-value)))))

          (with-field-new rconsumer "md_update_action" 7 (.addInteger (.value (.mDUpdateAction repetition))))

          (with-field-new rconsumer "md_entry_type" 8 (.addInteger (Integer/parseInt \2)))

          (let [src-value (.mDTradeEntryID repetition)]
            (when (not= src-value (. MDIncrementalRefreshTradeSummary42Decoder$NoMDEntriesDecoder mDTradeEntryIDNullValue))
              (with-field-new rconsumer "md_trade_entry_id" 9 (.addInteger src-value))))

          (.endGroup rconsumer))) (.endField rconsumer "md_entries" (+ start-at 0))))

  (do (adapt-order-id-entries MDIncrementalRefreshTradeSummary42Decoder$NoOrderIDEntriesDecoder (+ start-at 1))) (adapt-common (+ start-at 2) MDIncrementalRefreshTradeSummary42Decoder))
(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer (str prefix "-md-incremental-refresh-trade-summary42.parquet")
                                  (make-loopless-proxy message-write (compile-schema message-schema) {})))
(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new MDIncrementalRefreshTradeSummary42Decoder) buffer subOffset actingBlockLength actingVersion))

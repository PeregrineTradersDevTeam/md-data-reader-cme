(ns cme-compile.md-incremental-refresh-order-book43
  (:use [pcap-common.macros]
        [pcap-common.parquet-util]
        [cme-compile.md-incremental-refresh-order-book])
  (:import [mktdata MDIncrementalRefreshOrderBook43Decoder MDIncrementalRefreshOrderBook47Decoder   MDIncrementalRefreshOrderBook43Decoder$NoMDEntriesDecoder MDIncrementalRefreshOrderBook47Decoder$NoMDEntriesDecoder]
           [java.util Map]
           [org.apache.parquet.io.api Binary RecordConsumer]
           [org.apache.parquet.hadoop ParquetRecordWriter]))

(defn- message-write [^RecordConsumer rconsumer #^long start-at ^MDIncrementalRefreshOrderBook43Decoder top-level]

  (let [repetition-decoder (.noMDEntries top-level)]
    (when (> (.count repetition-decoder) 0)
      (.startField rconsumer "md_entries" (+ start-at 0))
      (while (.hasNext ^java.util.Iterator repetition-decoder)
        (let [^MDIncrementalRefreshOrderBook43Decoder$NoMDEntriesDecoder repetition (.next ^java.util.Iterator repetition-decoder)]

          (.startGroup rconsumer)
          (let [src-value (.orderID repetition)]
            (when (not= src-value (. MDIncrementalRefreshOrderBook43Decoder$NoMDEntriesDecoder orderIDNullValue))
              (with-field-new rconsumer "order_id" 0 (.addLong src-value))))

          (let [src-value (.mDOrderPriority repetition)]
            (when (not= src-value (. MDIncrementalRefreshOrderBook43Decoder$NoMDEntriesDecoder mDOrderPriorityNullValue))
              (with-field-new rconsumer "md_order_priority" 1 (.addLong src-value))))

          (let [src-value (.mantissa (.mDEntryPx repetition))]
            (when (not= src-value (. mktdata.PRICENULLDecoder mantissaNullValue))
              (with-field-new rconsumer "md_entry_px_mantissa" 2 (.addLong src-value))))

          (with-field-new rconsumer "md_entry_px_exponent" 3 (.addInteger -7))

          (let [src-value (.mDDisplayQty repetition)]
            (when (not= src-value (. MDIncrementalRefreshOrderBook43Decoder$NoMDEntriesDecoder mDDisplayQtyNullValue))
              (with-field-new rconsumer "md_display_qty" 4 (.addInteger src-value))))

          (with-field-new rconsumer "security_id" 5 (.addInteger (.securityID repetition)))

          (with-field-new rconsumer "md_update_action" 6 (.addInteger (.value (.mDUpdateAction repetition))))

          (with-field-new rconsumer "md_entry_type" 7 (.addInteger (.value (.mDEntryType repetition))))

          (.endGroup rconsumer))) (.endField rconsumer "md_entries" (+ start-at 0))))

  (adapt-common (+ start-at 1) MDIncrementalRefreshOrderBook43Decoder))
(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer (str prefix "-md-incremental-refresh-order-book43.parquet")
                                  (make-loopless-proxy message-write (compile-schema message-schema) {})))
(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new MDIncrementalRefreshOrderBook43Decoder) buffer subOffset actingBlockLength actingVersion))


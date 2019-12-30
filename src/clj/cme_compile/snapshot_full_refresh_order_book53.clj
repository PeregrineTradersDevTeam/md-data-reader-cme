
  (ns cme-compile.snapshot-full-refresh-order-book53
  (:use [pcap-common.macros]
        [pcap-common.parquet-util]
        [cme-compile.snapshot-full-refresh-order-book])
  (:import [mktdata SnapshotFullRefreshOrderBook44Decoder SnapshotFullRefreshOrderBook53Decoder       SnapshotFullRefreshOrderBook44Decoder$NoMDEntriesDecoder SnapshotFullRefreshOrderBook53Decoder$NoMDEntriesDecoder]
           [java.util Map]
           [org.apache.parquet.io.api Binary RecordConsumer]
           [org.apache.parquet.hadoop ParquetRecordWriter]
           ))

  (defn- message-write [^RecordConsumer rconsumer #^long start-at ^SnapshotFullRefreshOrderBook53Decoder top-level]
                    
 (let [repetition-decoder (.noMDEntries top-level)]
(when (> (.count repetition-decoder) 0)
(.startField rconsumer "md_entries" (+ start-at 0))
(while (.hasNext ^java.util.Iterator repetition-decoder)
(let [^SnapshotFullRefreshOrderBook53Decoder$NoMDEntriesDecoder repetition (.next ^java.util.Iterator repetition-decoder)]

(.startGroup rconsumer)
(with-field-new rconsumer "order_id" 0 (.addLong (.orderID repetition)))

(let [src-value (.mDOrderPriority repetition)]
 (when (not= src-value (. SnapshotFullRefreshOrderBook53Decoder$NoMDEntriesDecoder mDOrderPriorityNullValue))
(with-field-new rconsumer "md_order_priority" 1 (.addLong src-value))))

(with-field-new rconsumer "md_entry_px_mantissa" 2 (.addLong (.mantissa (.mDEntryPx repetition))))

		(with-field-new rconsumer "md_entry_px_exponent" 3 (.addInteger -9))

(with-field-new rconsumer "md_display_qty" 4 (.addInteger (.mDDisplayQty repetition)))

(with-field-new rconsumer "md_entry_type" 5 (.addInteger (.value (.mDEntryType repetition))))

(.endGroup rconsumer)
)) (.endField rconsumer "md_entries" (+ start-at 0))))


(adapt-common (+ start-at 1) SnapshotFullRefreshOrderBook53Decoder)
)  
  (defn ^ParquetRecordWriter make-record-writer [prefix]
   (make-parquet-integrated-writer (str prefix "-snapshot-full-refresh-order-book53.parquet")
    (make-loopless-proxy message-write (compile-schema message-schema) {})))
  (defn decode [subOffset actingBlockLength actingVersion buffer]
    (.wrap (new SnapshotFullRefreshOrderBook53Decoder) buffer subOffset actingBlockLength actingVersion))  
  
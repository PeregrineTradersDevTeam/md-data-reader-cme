(ns cme-compile.quote-request39
  (:use [pcap-common.macros]
        [pcap-common.parquet-util])
  (:import [mktdata QuoteRequest39Decoder QuoteRequest39Decoder$NoRelatedSymDecoder]
           [java.util Map]
           [org.apache.parquet.io.api Binary RecordConsumer]
           [org.apache.parquet.hadoop ParquetRecordWriter]
           ))

(def message-schema
  "
  optional int64 transact_time;
  optional binary quote_req_id;
  optional int32 match_event_indicator;
  repeated group related_sym {
    optional binary symbol;
    optional int32 security_id;
    optional int32 order_qty;
    optional int32 quote_type;
    optional int32 side;
  }
  ")
(defn- message-write [^RecordConsumer rconsumer #^long start-at ^QuoteRequest39Decoder top-level]
  
  (with-field-new rconsumer "transact_time"  (+ start-at 0) (.addLong (.transactTime top-level)))

  (with-field-new rconsumer "quote_req_id"  (+ start-at 1) (.addBinary (Binary/fromCharSequence (.quoteReqID top-level))))

  (with-field-new rconsumer "match_event_indicator"  (+ start-at 2) (.addInteger (let [field (.matchEventIndicator top-level)] (.getByte (.buffer field) (.offset field)))))

  (let [repetition-decoder (.noRelatedSym top-level)]
    (when (> (.count repetition-decoder) 0)
      (.startField rconsumer "related_sym" (+ start-at 3))
      (while (.hasNext ^java.util.Iterator repetition-decoder)
        (let [^QuoteRequest39Decoder$NoRelatedSymDecoder repetition (.next ^java.util.Iterator repetition-decoder)]

          (.startGroup rconsumer)
          (with-field-new rconsumer "symbol" 0 (.addBinary (Binary/fromCharSequence (.symbol repetition))))

          (with-field-new rconsumer "security_id" 1 (.addInteger (.securityID repetition)))

          (let [src-value (.orderQty repetition)]
            (when (not= src-value (. QuoteRequest39Decoder$NoRelatedSymDecoder orderQtyNullValue))
              (with-field-new rconsumer "order_qty" 2 (.addInteger src-value))))

          (with-field-new rconsumer "quote_type" 3 (.addInteger (.quoteType repetition)))

          (let [src-value (.side repetition)]
            (when (not= src-value (. QuoteRequest39Decoder$NoRelatedSymDecoder sideNullValue))
              (with-field-new rconsumer "side" 4 (.addInteger src-value))))

          (.endGroup rconsumer)
          )) (.endField rconsumer "related_sym" (+ start-at 3)))))

(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer (str prefix "-quote-request39.parquet")
                                  (make-loopless-proxy message-write (compile-schema message-schema) {})))
(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new QuoteRequest39Decoder) buffer subOffset actingBlockLength actingVersion))  

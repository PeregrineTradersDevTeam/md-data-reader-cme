(ns cme-compile.security-status30
    (:use [pcap-common.macros]
          [pcap-common.parquet-util])
    (:import [mktdata SecurityStatus30Decoder]
             [java.util Map]
             [org.apache.parquet.io.api Binary RecordConsumer]
             [org.apache.parquet.hadoop ParquetRecordWriter]))

(def message-schema
  "
  optional int64 transact_time;
  optional binary security_group;
  optional binary asset;
  optional int32 security_id;
  optional int32 trade_date;
  optional int32 match_event_indicator;
  optional int32 security_trading_status;
  optional int32 halt_reason;
  optional int32 security_trading_event;
  ")
(defn- message-write [^RecordConsumer rconsumer #^long start-at ^SecurityStatus30Decoder top-level]

  (with-field-new rconsumer "transact_time"  (+ start-at 0) (.addLong (.transactTime top-level)))

  (with-field-new rconsumer "security_group"  (+ start-at 1) (.addBinary (Binary/fromCharSequence (.securityGroup top-level))))

  (with-field-new rconsumer "asset"  (+ start-at 2) (.addBinary (Binary/fromCharSequence (.asset top-level))))

  (let [src-value (.securityID top-level)]
    (when (not= src-value (. SecurityStatus30Decoder securityIDNullValue))
      (with-field-new rconsumer "security_id"  (+ start-at 3) (.addInteger src-value))))

  (let [src-value (.tradeDate top-level)]
    (when (not= src-value (. SecurityStatus30Decoder tradeDateNullValue))
      (with-field-new rconsumer "trade_date"  (+ start-at 4) (.addInteger src-value))))

  (with-field-new rconsumer "match_event_indicator"  (+ start-at 5) (.addInteger (let [field (.matchEventIndicator top-level)] (.getByte (.buffer field) (.offset field)))))

  (let [src-value (.securityTradingStatus top-level)]
    (when (not= src-value mktdata.SecurityTradingStatus/NULL_VAL)
      (with-field-new rconsumer "security_trading_status"  (+ start-at 6) (.addInteger (.value src-value)))))

  (with-field-new rconsumer "halt_reason"  (+ start-at 7) (.addInteger (.value (.haltReason top-level))))

  (with-field-new rconsumer "security_trading_event"  (+ start-at 8) (.addInteger (.value (.securityTradingEvent top-level)))))
(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer (str prefix "-security-status30.parquet")
                                  (make-loopless-proxy message-write (compile-schema message-schema) {})))
(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new SecurityStatus30Decoder) buffer subOffset actingBlockLength actingVersion))

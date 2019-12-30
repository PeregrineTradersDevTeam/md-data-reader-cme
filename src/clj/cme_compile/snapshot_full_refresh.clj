(ns cme-compile.snapshot-full-refresh
(:use [pcap-common.macros]
 [pcap-common.parquet-util]))


(defmacro adapt-common [start-at decoder-type] `(do
(with-field-new ~'rconsumer "last_msg_seq_num_processed"  (+ ~start-at 0) (.addInteger (.lastMsgSeqNumProcessed ~'top-level)))

(with-field-new ~'rconsumer "tot_num_reports"  (+ ~start-at 1) (.addInteger (.totNumReports ~'top-level)))

(with-field-new ~'rconsumer "security_id"  (+ ~start-at 2) (.addInteger (.securityID ~'top-level)))

(with-field-new ~'rconsumer "rpt_seq"  (+ ~start-at 3) (.addInteger (.rptSeq ~'top-level)))

(with-field-new ~'rconsumer "transact_time"  (+ ~start-at 4) (.addLong (.transactTime ~'top-level)))

(with-field-new ~'rconsumer "last_update_time"  (+ ~start-at 5) (.addLong (.lastUpdateTime ~'top-level)))

(let [src-value# (.tradeDate ~'top-level)]
 (when (not= src-value# (. ~decoder-type tradeDateNullValue))
(with-field-new ~'rconsumer "trade_date"  (+ ~start-at 6) (.addInteger src-value#))))

(let [src-value# (.mDSecurityTradingStatus ~'top-level)]
 (when (not= src-value# mktdata.SecurityTradingStatus/NULL_VAL)
(with-field-new ~'rconsumer "md_security_trading_status"  (+ ~start-at 7) (.addInteger (.value src-value#)))))

))




(def message-schema "  optional int64 high_limit_price_mantissa;
  optional int32 high_limit_price_exponent;
  optional int64 low_limit_price_mantissa;
  optional int32 low_limit_price_exponent;
  optional int64 max_price_variation_mantissa;
  optional int32 max_price_variation_exponent;
  repeated group md_entries {
    optional int64 md_entry_px_mantissa;
    optional int32 md_entry_px_exponent;
    optional int32 md_entry_size;
    optional int32 number_of_orders;
    optional int32 md_price_level;
    optional int32 trading_reference_date;
    optional int32 open_close_settl_flag;
    optional int32 settl_price_type;
    optional int32 md_entry_type;
  }
  optional int32 last_msg_seq_num_processed;
  optional int32 tot_num_reports;
  optional int32 security_id;
  optional int32 rpt_seq;
  optional int64 transact_time;
  optional int64 last_update_time;
  optional int32 trade_date;
  optional int32 md_security_trading_status;")
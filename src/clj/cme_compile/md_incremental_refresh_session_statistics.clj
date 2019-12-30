(ns cme-compile.md-incremental-refresh-session-statistics
(:use [pcap-common.macros]
 [pcap-common.parquet-util]))


(defmacro adapt-common [start-at decoder-type] `(do
(with-field-new ~'rconsumer "transact_time"  (+ ~start-at 0) (.addLong (.transactTime ~'top-level)))

(with-field-new ~'rconsumer "match_event_indicator"  (+ ~start-at 1) (.addInteger (let [field# (.matchEventIndicator ~'top-level)] (.getByte (.buffer field#) (.offset field#)))))

))




(def message-schema "  repeated group md_entries {
    optional int64 md_entry_px_mantissa;
    optional int32 md_entry_px_exponent;
    optional int32 security_id;
    optional int32 rpt_seq;
    optional int32 open_close_settl_flag;
    optional int32 md_update_action;
    optional int32 md_entry_type;
    optional int32 md_entry_size;
  }
  optional int64 transact_time;
  optional int32 match_event_indicator;")
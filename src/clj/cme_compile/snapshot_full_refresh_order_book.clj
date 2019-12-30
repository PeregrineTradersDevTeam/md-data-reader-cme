(ns cme-compile.snapshot-full-refresh-order-book
(:use [pcap-common.macros]
 [pcap-common.parquet-util]))


(defmacro adapt-common [start-at decoder-type] `(do
(with-field-new ~'rconsumer "last_msg_seq_num_processed"  (+ ~start-at 0) (.addInteger (.lastMsgSeqNumProcessed ~'top-level)))

(with-field-new ~'rconsumer "tot_num_reports"  (+ ~start-at 1) (.addInteger (.totNumReports ~'top-level)))

(with-field-new ~'rconsumer "security_id"  (+ ~start-at 2) (.addInteger (.securityID ~'top-level)))

(with-field-new ~'rconsumer "no_chunks"  (+ ~start-at 3) (.addInteger (.noChunks ~'top-level)))

(with-field-new ~'rconsumer "current_chunk"  (+ ~start-at 4) (.addInteger (.currentChunk ~'top-level)))

(with-field-new ~'rconsumer "transact_time"  (+ ~start-at 5) (.addLong (.transactTime ~'top-level)))

))




(def message-schema "  repeated group md_entries {
    optional int64 order_id;
    optional int64 md_order_priority;
    optional int64 md_entry_px_mantissa;
    optional int32 md_entry_px_exponent;
    optional int32 md_display_qty;
    optional int32 md_entry_type;
  }
  optional int32 last_msg_seq_num_processed;
  optional int32 tot_num_reports;
  optional int32 security_id;
  optional int32 no_chunks;
  optional int32 current_chunk;
  optional int64 transact_time;")
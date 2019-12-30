(ns cme-compile.md-incremental-refresh-trade-summary
  (:use [pcap-common.macros]
        [pcap-common.parquet-util]))


(defmacro adapt-common [start-at decoder-type]
  `(do
     (with-field-new ~'rconsumer "transact_time"  (+ ~start-at 0) (.addLong (.transactTime ~'top-level)))

     (with-field-new ~'rconsumer "match_event_indicator"  (+ ~start-at 1) (.addInteger (let [field# (.matchEventIndicator ~'top-level)] (.getByte (.buffer field#) (.offset field#)))))

     ))


(defmacro adapt-order-id-entries [decoder-type start-at] 
  (let [next-group (gensym)]
    `(do
       (let [repetition-decoder# (.noOrderIDEntries ~'top-level)]
         (when (> (.count repetition-decoder#) 0)
           (.startField ~'rconsumer "order_id_entries" (+ ~start-at 0))
           (while (.hasNext ^java.util.Iterator repetition-decoder#)
             (let [~next-group (.next ^java.util.Iterator repetition-decoder#)
                   repetition# ~(with-meta next-group {:tag decoder-type})]

               (.startGroup ~'rconsumer)
               (with-field-new ~'rconsumer "order_id" 0 (.addLong (.orderID repetition#)))

               (with-field-new ~'rconsumer "last_qty" 1 (.addInteger (.lastQty repetition#)))

               (.endGroup ~'rconsumer)
               )) (.endField ~'rconsumer "order_id_entries" (+ ~start-at 0))))

       )))


(def message-schema "  repeated group md_entries {
    optional int64 md_entry_px_mantissa;
    optional int32 md_entry_px_exponent;
    optional int32 md_entry_size;
    optional int32 security_id;
    optional int32 rpt_seq;
    optional int32 number_of_orders;
    optional int32 aggressor_side;
    optional int32 md_update_action;
    optional int32 md_entry_type;
    optional int32 md_trade_entry_id;
  }
  repeated group order_id_entries {
    optional int64 order_id;
    optional int32 last_qty;
  }
  optional int64 transact_time;
  optional int32 match_event_indicator;")

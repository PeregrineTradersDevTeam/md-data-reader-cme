(ns cme-compile.md-instrument-definition-future
(:use [pcap-common.macros]
 [pcap-common.parquet-util]))


(defmacro adapt-common [start-at decoder-type] `(do
(with-field-new ~'rconsumer "match_event_indicator"  (+ ~start-at 0) (.addInteger (let [field# (.matchEventIndicator ~'top-level)] (.getByte (.buffer field#) (.offset field#)))))

(let [src-value# (.totNumReports ~'top-level)]
 (when (not= src-value# (. ~decoder-type totNumReportsNullValue))
(with-field-new ~'rconsumer "tot_num_reports"  (+ ~start-at 1) (.addInteger src-value#))))

(with-field-new ~'rconsumer "security_update_action"  (+ ~start-at 2) (.addInteger (.value (.securityUpdateAction ~'top-level))))

(with-field-new ~'rconsumer "last_update_time"  (+ ~start-at 3) (.addLong (.lastUpdateTime ~'top-level)))

(let [src-value# (.mDSecurityTradingStatus ~'top-level)]
 (when (not= src-value# mktdata.SecurityTradingStatus/NULL_VAL)
(with-field-new ~'rconsumer "md_security_trading_status"  (+ ~start-at 4) (.addInteger (.value src-value#)))))

(with-field-new ~'rconsumer "appl_id"  (+ ~start-at 5) (.addInteger (.applID ~'top-level)))

(with-field-new ~'rconsumer "market_segment_id"  (+ ~start-at 6) (.addInteger (.marketSegmentID ~'top-level)))

(with-field-new ~'rconsumer "underlying_product"  (+ ~start-at 7) (.addInteger (.underlyingProduct ~'top-level)))

(with-field-new ~'rconsumer "security_exchange"  (+ ~start-at 8) (.addBinary (Binary/fromCharSequence (.securityExchange ~'top-level))))

(with-field-new ~'rconsumer "security_group"  (+ ~start-at 9) (.addBinary (Binary/fromCharSequence (.securityGroup ~'top-level))))

(with-field-new ~'rconsumer "asset"  (+ ~start-at 10) (.addBinary (Binary/fromCharSequence (.asset ~'top-level))))

(with-field-new ~'rconsumer "symbol"  (+ ~start-at 11) (.addBinary (Binary/fromCharSequence (.symbol ~'top-level))))

(with-field-new ~'rconsumer "security_id"  (+ ~start-at 12) (.addInteger (.securityID ~'top-level)))

(with-field-new ~'rconsumer "security_id_source"  (+ ~start-at 13) (.addInteger (Integer/parseInt \8)))

(with-field-new ~'rconsumer "security_type"  (+ ~start-at 14) (.addBinary (Binary/fromCharSequence (.securityType ~'top-level))))

(with-field-new ~'rconsumer "cfi_code"  (+ ~start-at 15) (.addBinary (Binary/fromCharSequence (.cFICode ~'top-level))))

(let [src-value# (.year (.maturityMonthYear ~'top-level))]
 (when (not= src-value# (. ~mktdata.MaturityMonthYearDecoder yearNullValue))
(with-field-new ~'rconsumer "maturity_month_year_year"  (+ ~start-at 16) (.addInteger src-value#))))

		(let [src-value# (.month (.maturityMonthYear ~'top-level))]
 (when (not= src-value# (. ~mktdata.MaturityMonthYearDecoder monthNullValue))
(with-field-new ~'rconsumer "maturity_month_year_month"  (+ ~start-at 17) (.addInteger src-value#))))

		(let [src-value# (.day (.maturityMonthYear ~'top-level))]
 (when (not= src-value# (. ~mktdata.MaturityMonthYearDecoder dayNullValue))
(with-field-new ~'rconsumer "maturity_month_year_day"  (+ ~start-at 18) (.addInteger src-value#))))

		(let [src-value# (.week (.maturityMonthYear ~'top-level))]
 (when (not= src-value# (. ~mktdata.MaturityMonthYearDecoder weekNullValue))
(with-field-new ~'rconsumer "maturity_month_year_week"  (+ ~start-at 19) (.addInteger src-value#))))

(with-field-new ~'rconsumer "currency"  (+ ~start-at 20) (.addBinary (Binary/fromCharSequence (.currency ~'top-level))))

(with-field-new ~'rconsumer "settl_currency"  (+ ~start-at 21) (.addBinary (Binary/fromCharSequence (.settlCurrency ~'top-level))))

(with-field-new ~'rconsumer "match_algorithm"  (+ ~start-at 22) (.addInteger (.matchAlgorithm ~'top-level)))

(with-field-new ~'rconsumer "min_trade_vol"  (+ ~start-at 23) (.addInteger (.minTradeVol ~'top-level)))

(with-field-new ~'rconsumer "max_trade_vol"  (+ ~start-at 24) (.addInteger (.maxTradeVol ~'top-level)))

(let [src-value# (.mainFraction ~'top-level)]
 (when (not= src-value# (. ~decoder-type mainFractionNullValue))
(with-field-new ~'rconsumer "main_fraction"  (+ ~start-at 25) (.addInteger src-value#))))

(let [src-value# (.subFraction ~'top-level)]
 (when (not= src-value# (. ~decoder-type subFractionNullValue))
(with-field-new ~'rconsumer "sub_fraction"  (+ ~start-at 26) (.addInteger src-value#))))

(let [src-value# (.priceDisplayFormat ~'top-level)]
 (when (not= src-value# (. ~decoder-type priceDisplayFormatNullValue))
(with-field-new ~'rconsumer "price_display_format"  (+ ~start-at 27) (.addInteger src-value#))))

(with-field-new ~'rconsumer "unit_of_measure"  (+ ~start-at 28) (.addBinary (Binary/fromCharSequence (.unitOfMeasure ~'top-level))))

(with-field-new ~'rconsumer "settl_price_type"  (+ ~start-at 29) (.addInteger (let [field# (.settlPriceType ~'top-level)] (.getByte (.buffer field#) (.offset field#)))))

(let [src-value# (.openInterestQty ~'top-level)]
 (when (not= src-value# (. ~decoder-type openInterestQtyNullValue))
(with-field-new ~'rconsumer "open_interest_qty"  (+ ~start-at 30) (.addInteger src-value#))))

(let [src-value# (.clearedVolume ~'top-level)]
 (when (not= src-value# (. ~decoder-type clearedVolumeNullValue))
(with-field-new ~'rconsumer "cleared_volume"  (+ ~start-at 31) (.addInteger src-value#))))

(let [src-value# (.decayQuantity ~'top-level)]
 (when (not= src-value# (. ~decoder-type decayQuantityNullValue))
(with-field-new ~'rconsumer "decay_quantity"  (+ ~start-at 32) (.addInteger src-value#))))

(let [src-value# (.decayStartDate ~'top-level)]
 (when (not= src-value# (. ~decoder-type decayStartDateNullValue))
(with-field-new ~'rconsumer "decay_start_date"  (+ ~start-at 33) (.addInteger src-value#))))

(let [src-value# (.originalContractSize ~'top-level)]
 (when (not= src-value# (. ~decoder-type originalContractSizeNullValue))
(with-field-new ~'rconsumer "original_contract_size"  (+ ~start-at 34) (.addInteger src-value#))))

(let [src-value# (.contractMultiplier ~'top-level)]
 (when (not= src-value# (. ~decoder-type contractMultiplierNullValue))
(with-field-new ~'rconsumer "contract_multiplier"  (+ ~start-at 35) (.addInteger src-value#))))

(let [src-value# (.contractMultiplierUnit ~'top-level)]
 (when (not= src-value# (. ~decoder-type contractMultiplierUnitNullValue))
(with-field-new ~'rconsumer "contract_multiplier_unit"  (+ ~start-at 36) (.addInteger src-value#))))

(let [src-value# (.flowScheduleType ~'top-level)]
 (when (not= src-value# (. ~decoder-type flowScheduleTypeNullValue))
(with-field-new ~'rconsumer "flow_schedule_type"  (+ ~start-at 37) (.addInteger src-value#))))

(with-field-new ~'rconsumer "user_defined_instrument"  (+ ~start-at 38) (.addInteger (Binary/fromCharSequence (.userDefinedInstrument ~'top-level))))

(let [src-value# (.tradingReferenceDate ~'top-level)]
 (when (not= src-value# (. ~decoder-type tradingReferenceDateNullValue))
(with-field-new ~'rconsumer "trading_reference_date"  (+ ~start-at 39) (.addInteger src-value#))))

))


(defmacro adapt-events [decoder-type start-at] 
 (let [next-group (gensym)]
 `(do
(let [repetition-decoder# (.noEvents ~'top-level)]
(when (> (.count repetition-decoder#) 0)
(.startField ~'rconsumer "events" (+ ~start-at 0))
(while (.hasNext ^java.util.Iterator repetition-decoder#)
(let [~next-group (.next ^java.util.Iterator repetition-decoder#)
repetition# ~(with-meta next-group {:tag decoder-type})]

(.startGroup ~'rconsumer)
(with-field-new ~'rconsumer "event_type" 0 (.addInteger (.value (.eventType repetition#))))

(with-field-new ~'rconsumer "event_time" 1 (.addLong (.eventTime repetition#)))

(.endGroup ~'rconsumer)
)) (.endField ~'rconsumer "events" (+ ~start-at 0))))

)))

(defmacro adapt-md-feed-types [decoder-type start-at] 
 (let [next-group (gensym)]
 `(do
(let [repetition-decoder# (.noMDFeedTypes ~'top-level)]
(when (> (.count repetition-decoder#) 0)
(.startField ~'rconsumer "md_feed_types" (+ ~start-at 0))
(while (.hasNext ^java.util.Iterator repetition-decoder#)
(let [~next-group (.next ^java.util.Iterator repetition-decoder#)
repetition# ~(with-meta next-group {:tag decoder-type})]

(.startGroup ~'rconsumer)
(with-field-new ~'rconsumer "md_feed_type" 0 (.addBinary (Binary/fromCharSequence (.mDFeedType repetition#))))

(with-field-new ~'rconsumer "market_depth" 1 (.addInteger (.marketDepth repetition#)))

(.endGroup ~'rconsumer)
)) (.endField ~'rconsumer "md_feed_types" (+ ~start-at 0))))

)))

(defmacro adapt-inst-attrib [decoder-type start-at] 
 (let [next-group (gensym)]
 `(do
(let [repetition-decoder# (.noInstAttrib ~'top-level)]
(when (> (.count repetition-decoder#) 0)
(.startField ~'rconsumer "inst_attrib" (+ ~start-at 0))
(while (.hasNext ^java.util.Iterator repetition-decoder#)
(let [~next-group (.next ^java.util.Iterator repetition-decoder#)
repetition# ~(with-meta next-group {:tag decoder-type})]

(.startGroup ~'rconsumer)
(with-field-new ~'rconsumer "inst_attrib_type" 0 (.addInteger 24))

(with-field-new ~'rconsumer "inst_attrib_value" 1 (.addInteger (let [field# (.instAttribValue repetition#)] (.getInt (.buffer field#) (.offset field#)))))

(.endGroup ~'rconsumer)
)) (.endField ~'rconsumer "inst_attrib" (+ ~start-at 0))))

)))

(defmacro adapt-lot-type-rules [decoder-type start-at] 
 (let [next-group (gensym)]
 `(do
(let [repetition-decoder# (.noLotTypeRules ~'top-level)]
(when (> (.count repetition-decoder#) 0)
(.startField ~'rconsumer "lot_type_rules" (+ ~start-at 0))
(while (.hasNext ^java.util.Iterator repetition-decoder#)
(let [~next-group (.next ^java.util.Iterator repetition-decoder#)
repetition# ~(with-meta next-group {:tag decoder-type})]

(.startGroup ~'rconsumer)
(with-field-new ~'rconsumer "lot_type" 0 (.addInteger (.lotType repetition#)))

(let [src-value# (.mantissa (.minLotSize repetition#))]
 (when (not= src-value# (. ~mktdata.DecimalQtyDecoder mantissaNullValue))
(with-field-new ~'rconsumer "min_lot_size_mantissa" 1 (.addInteger src-value#))))

		(with-field-new ~'rconsumer "min_lot_size_exponent" 2 (.addInteger -4))

(.endGroup ~'rconsumer)
)) (.endField ~'rconsumer "lot_type_rules" (+ ~start-at 0))))

)))


(def message-schema "  optional int64 min_price_increment_mantissa;
  optional int32 min_price_increment_exponent;
  optional int64 display_factor_mantissa;
  optional int32 display_factor_exponent;
  optional int64 unit_of_measure_qty_mantissa;
  optional int32 unit_of_measure_qty_exponent;
  optional int64 trading_reference_price_mantissa;
  optional int32 trading_reference_price_exponent;
  optional int64 high_limit_price_mantissa;
  optional int32 high_limit_price_exponent;
  optional int64 low_limit_price_mantissa;
  optional int32 low_limit_price_exponent;
  optional int64 max_price_variation_mantissa;
  optional int32 max_price_variation_exponent;
  optional int64 min_price_increment_amount_mantissa;
  optional int32 min_price_increment_amount_exponent;
  repeated group events {
    optional int32 event_type;
    optional int64 event_time;
  }
  repeated group md_feed_types {
    optional binary md_feed_type;
    optional int32 market_depth;
  }
  repeated group inst_attrib {
    optional int32 inst_attrib_type;
    optional int32 inst_attrib_value;
  }
  repeated group lot_type_rules {
    optional int32 lot_type;
    optional int32 min_lot_size_mantissa;
    optional int32 min_lot_size_exponent;
  }
  optional int32 match_event_indicator;
  optional int32 tot_num_reports;
  optional int32 security_update_action;
  optional int64 last_update_time;
  optional int32 md_security_trading_status;
  optional int32 appl_id;
  optional int32 market_segment_id;
  optional int32 underlying_product;
  optional binary security_exchange;
  optional binary security_group;
  optional binary asset;
  optional binary symbol;
  optional int32 security_id;
  optional int32 security_id_source;
  optional binary security_type;
  optional binary cfi_code;
  optional int32 maturity_month_year_year;
  optional int32 maturity_month_year_month;
  optional int32 maturity_month_year_day;
  optional int32 maturity_month_year_week;
  optional binary currency;
  optional binary settl_currency;
  optional int32 match_algorithm;
  optional int32 min_trade_vol;
  optional int32 max_trade_vol;
  optional int32 main_fraction;
  optional int32 sub_fraction;
  optional int32 price_display_format;
  optional binary unit_of_measure;
  optional int32 settl_price_type;
  optional int32 open_interest_qty;
  optional int32 cleared_volume;
  optional int32 decay_quantity;
  optional int32 decay_start_date;
  optional int32 original_contract_size;
  optional int32 contract_multiplier;
  optional int32 contract_multiplier_unit;
  optional int32 flow_schedule_type;
  optional int32 user_defined_instrument;
  optional int32 trading_reference_date;")
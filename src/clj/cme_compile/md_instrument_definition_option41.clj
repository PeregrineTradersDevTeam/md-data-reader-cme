(ns cme-compile.md-instrument-definition-option41
    (:use [pcap-common.macros]
          [pcap-common.parquet-util]
          [cme-compile.md-instrument-definition-option])
    (:import [mktdata MDInstrumentDefinitionOption41Decoder MDInstrumentDefinitionOption55Decoder                                            MDInstrumentDefinitionOption41Decoder$NoEventsDecoder MDInstrumentDefinitionOption55Decoder$NoEventsDecoder MDInstrumentDefinitionOption41Decoder$NoMDFeedTypesDecoder MDInstrumentDefinitionOption55Decoder$NoMDFeedTypesDecoder MDInstrumentDefinitionOption41Decoder$NoInstAttribDecoder MDInstrumentDefinitionOption55Decoder$NoInstAttribDecoder MDInstrumentDefinitionOption41Decoder$NoLotTypeRulesDecoder MDInstrumentDefinitionOption55Decoder$NoLotTypeRulesDecoder MDInstrumentDefinitionOption41Decoder$NoUnderlyingsDecoder MDInstrumentDefinitionOption55Decoder$NoUnderlyingsDecoder MDInstrumentDefinitionOption41Decoder$NoRelatedInstrumentsDecoder MDInstrumentDefinitionOption55Decoder$NoRelatedInstrumentsDecoder]
             [java.util Map]
             [org.apache.parquet.io.api Binary RecordConsumer]
             [org.apache.parquet.hadoop ParquetRecordWriter]))

(defn- message-write [^RecordConsumer rconsumer #^long start-at ^MDInstrumentDefinitionOption41Decoder top-level]

  (let [src-value (.mantissa (.strikePrice top-level))]
    (when (not= src-value (. mktdata.PRICENULLDecoder mantissaNullValue))
      (with-field-new rconsumer "strike_price_mantissa"  (+ start-at 0) (.addLong src-value))))

  (with-field-new rconsumer "strike_price_exponent"  (+ start-at 1) (.addInteger -7))

  (let [src-value (.mantissa (.minCabPrice top-level))]
    (when (not= src-value (. mktdata.PRICENULLDecoder mantissaNullValue))
      (with-field-new rconsumer "min_cab_price_mantissa"  (+ start-at 2) (.addLong src-value))))

  (with-field-new rconsumer "min_cab_price_exponent"  (+ start-at 3) (.addInteger -7))

  (let [src-value (.mantissa (.minPriceIncrement top-level))]
    (when (not= src-value (. mktdata.PRICENULLDecoder mantissaNullValue))
      (with-field-new rconsumer "min_price_increment_mantissa"  (+ start-at 4) (.addLong src-value))))

  (with-field-new rconsumer "min_price_increment_exponent"  (+ start-at 5) (.addInteger -7))

  (let [src-value (.mantissa (.minPriceIncrementAmount top-level))]
    (when (not= src-value (. mktdata.PRICENULLDecoder mantissaNullValue))
      (with-field-new rconsumer "min_price_increment_amount_mantissa"  (+ start-at 6) (.addLong src-value))))

  (with-field-new rconsumer "min_price_increment_amount_exponent"  (+ start-at 7) (.addInteger -7))

  (with-field-new rconsumer "display_factor_mantissa"  (+ start-at 8) (.addLong (.mantissa (.displayFactor top-level))))

  (with-field-new rconsumer "display_factor_exponent"  (+ start-at 9) (.addInteger -7))

  (let [src-value (.mantissa (.unitOfMeasureQty top-level))]
    (when (not= src-value (. mktdata.PRICENULLDecoder mantissaNullValue))
      (with-field-new rconsumer "unit_of_measure_qty_mantissa"  (+ start-at 10) (.addLong src-value))))

  (with-field-new rconsumer "unit_of_measure_qty_exponent"  (+ start-at 11) (.addInteger -7))

  (let [src-value (.mantissa (.tradingReferencePrice top-level))]
    (when (not= src-value (. mktdata.PRICENULLDecoder mantissaNullValue))
      (with-field-new rconsumer "trading_reference_price_mantissa"  (+ start-at 12) (.addLong src-value))))

  (with-field-new rconsumer "trading_reference_price_exponent"  (+ start-at 13) (.addInteger -7))

  (let [src-value (.mantissa (.lowLimitPrice top-level))]
    (when (not= src-value (. mktdata.PRICENULLDecoder mantissaNullValue))
      (with-field-new rconsumer "low_limit_price_mantissa"  (+ start-at 14) (.addLong src-value))))

  (with-field-new rconsumer "low_limit_price_exponent"  (+ start-at 15) (.addInteger -7))

  (let [src-value (.mantissa (.highLimitPrice top-level))]
    (when (not= src-value (. mktdata.PRICENULLDecoder mantissaNullValue))
      (with-field-new rconsumer "high_limit_price_mantissa"  (+ start-at 16) (.addLong src-value))))

  (with-field-new rconsumer "high_limit_price_exponent"  (+ start-at 17) (.addInteger -7))

  (do (adapt-events MDInstrumentDefinitionOption41Decoder$NoEventsDecoder (+ start-at 18))

      (adapt-md-feed-types MDInstrumentDefinitionOption41Decoder$NoMDFeedTypesDecoder (+ start-at 19))

      (adapt-inst-attrib MDInstrumentDefinitionOption41Decoder$NoInstAttribDecoder (+ start-at 20))

      (adapt-lot-type-rules MDInstrumentDefinitionOption41Decoder$NoLotTypeRulesDecoder (+ start-at 21))

      (adapt-underlyings MDInstrumentDefinitionOption41Decoder$NoUnderlyingsDecoder (+ start-at 22))

      (adapt-related-instruments MDInstrumentDefinitionOption41Decoder$NoRelatedInstrumentsDecoder (+ start-at 23))) (adapt-common (+ start-at 24) MDInstrumentDefinitionOption41Decoder))
(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer (str prefix "-md-instrument-definition-option41.parquet")
                                  (make-loopless-proxy message-write (compile-schema message-schema) {})))
(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new MDInstrumentDefinitionOption41Decoder) buffer subOffset actingBlockLength actingVersion))

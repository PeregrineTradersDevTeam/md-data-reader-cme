
(ns cme-compile.md-instrument-definition-future27
  (:use [pcap-common.macros]
        [pcap-common.parquet-util]
        [cme-compile.md-instrument-definition-future])
  (:import [mktdata MDInstrumentDefinitionFuture27Decoder MDInstrumentDefinitionFuture54Decoder                                              MDInstrumentDefinitionFuture27Decoder$NoEventsDecoder MDInstrumentDefinitionFuture54Decoder$NoEventsDecoder MDInstrumentDefinitionFuture27Decoder$NoMDFeedTypesDecoder MDInstrumentDefinitionFuture54Decoder$NoMDFeedTypesDecoder MDInstrumentDefinitionFuture27Decoder$NoInstAttribDecoder MDInstrumentDefinitionFuture54Decoder$NoInstAttribDecoder MDInstrumentDefinitionFuture27Decoder$NoLotTypeRulesDecoder MDInstrumentDefinitionFuture54Decoder$NoLotTypeRulesDecoder]
           [java.util Map]
           [org.apache.parquet.io.api Binary RecordConsumer]
           [org.apache.parquet.hadoop ParquetRecordWriter]
           ))

(defn- message-write [^RecordConsumer rconsumer #^long start-at ^MDInstrumentDefinitionFuture27Decoder top-level]
  
  (with-field-new rconsumer "min_price_increment_mantissa"  (+ start-at 0) (.addLong (.mantissa (.minPriceIncrement top-level))))

  (with-field-new rconsumer "min_price_increment_exponent"  (+ start-at 1) (.addInteger -7))

  (with-field-new rconsumer "display_factor_mantissa"  (+ start-at 2) (.addLong (.mantissa (.displayFactor top-level))))

  (with-field-new rconsumer "display_factor_exponent"  (+ start-at 3) (.addInteger -7))

  (let [src-value (.mantissa (.unitOfMeasureQty top-level))]
    (when (not= src-value (. mktdata.PRICENULLDecoder mantissaNullValue))
      (with-field-new rconsumer "unit_of_measure_qty_mantissa"  (+ start-at 4) (.addLong src-value))))

  (with-field-new rconsumer "unit_of_measure_qty_exponent"  (+ start-at 5) (.addInteger -7))

  (let [src-value (.mantissa (.tradingReferencePrice top-level))]
    (when (not= src-value (. mktdata.PRICENULLDecoder mantissaNullValue))
      (with-field-new rconsumer "trading_reference_price_mantissa"  (+ start-at 6) (.addLong src-value))))

  (with-field-new rconsumer "trading_reference_price_exponent"  (+ start-at 7) (.addInteger -7))

  (let [src-value (.mantissa (.highLimitPrice top-level))]
    (when (not= src-value (. mktdata.PRICENULLDecoder mantissaNullValue))
      (with-field-new rconsumer "high_limit_price_mantissa"  (+ start-at 8) (.addLong src-value))))

  (with-field-new rconsumer "high_limit_price_exponent"  (+ start-at 9) (.addInteger -7))

  (let [src-value (.mantissa (.lowLimitPrice top-level))]
    (when (not= src-value (. mktdata.PRICENULLDecoder mantissaNullValue))
      (with-field-new rconsumer "low_limit_price_mantissa"  (+ start-at 10) (.addLong src-value))))

  (with-field-new rconsumer "low_limit_price_exponent"  (+ start-at 11) (.addInteger -7))

  (let [src-value (.mantissa (.maxPriceVariation top-level))]
    (when (not= src-value (. mktdata.PRICENULLDecoder mantissaNullValue))
      (with-field-new rconsumer "max_price_variation_mantissa"  (+ start-at 12) (.addLong src-value))))

  (with-field-new rconsumer "max_price_variation_exponent"  (+ start-at 13) (.addInteger -7))

  (let [src-value (.mantissa (.minPriceIncrementAmount top-level))]
    (when (not= src-value (. mktdata.PRICENULLDecoder mantissaNullValue))
      (with-field-new rconsumer "min_price_increment_amount_mantissa"  (+ start-at 14) (.addLong src-value))))

  (with-field-new rconsumer "min_price_increment_amount_exponent"  (+ start-at 15) (.addInteger -7))


  (do (adapt-events MDInstrumentDefinitionFuture27Decoder$NoEventsDecoder (+ start-at 16))

      (adapt-md-feed-types MDInstrumentDefinitionFuture27Decoder$NoMDFeedTypesDecoder (+ start-at 17))

      (adapt-inst-attrib MDInstrumentDefinitionFuture27Decoder$NoInstAttribDecoder (+ start-at 18))

      (adapt-lot-type-rules MDInstrumentDefinitionFuture27Decoder$NoLotTypeRulesDecoder (+ start-at 19))
      )
  (adapt-common (+ start-at 20) MDInstrumentDefinitionFuture27Decoder)
  )  
(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer (str prefix "-md-instrument-definition-future27.parquet")
                                  (make-loopless-proxy message-write (compile-schema message-schema) {})))
(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new MDInstrumentDefinitionFuture27Decoder) buffer subOffset actingBlockLength actingVersion))  

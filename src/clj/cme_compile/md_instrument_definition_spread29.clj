
(ns cme-compile.md-instrument-definition-spread29
  (:use [pcap-common.macros]
        [pcap-common.parquet-util]
        [cme-compile.md-instrument-definition-spread])
  (:import [mktdata MDInstrumentDefinitionSpread29Decoder MDInstrumentDefinitionSpread56Decoder                                        MDInstrumentDefinitionSpread29Decoder$NoEventsDecoder MDInstrumentDefinitionSpread56Decoder$NoEventsDecoder MDInstrumentDefinitionSpread29Decoder$NoMDFeedTypesDecoder MDInstrumentDefinitionSpread56Decoder$NoMDFeedTypesDecoder MDInstrumentDefinitionSpread29Decoder$NoInstAttribDecoder MDInstrumentDefinitionSpread56Decoder$NoInstAttribDecoder MDInstrumentDefinitionSpread29Decoder$NoLotTypeRulesDecoder MDInstrumentDefinitionSpread56Decoder$NoLotTypeRulesDecoder MDInstrumentDefinitionSpread29Decoder$NoLegsDecoder MDInstrumentDefinitionSpread56Decoder$NoLegsDecoder]
           [java.util Map]
           [org.apache.parquet.io.api Binary RecordConsumer]
           [org.apache.parquet.hadoop ParquetRecordWriter]
           ))

(defn- message-write [^RecordConsumer rconsumer #^long start-at ^MDInstrumentDefinitionSpread29Decoder top-level]
  
  (with-field-new rconsumer "min_price_increment_mantissa"  (+ start-at 0) (.addLong (.mantissa (.minPriceIncrement top-level))))

  (with-field-new rconsumer "min_price_increment_exponent"  (+ start-at 1) (.addInteger -7))

  (with-field-new rconsumer "display_factor_mantissa"  (+ start-at 2) (.addLong (.mantissa (.displayFactor top-level))))

  (with-field-new rconsumer "display_factor_exponent"  (+ start-at 3) (.addInteger -7))

  (let [src-value (.mantissa (.priceRatio top-level))]
    (when (not= src-value (. mktdata.PRICENULLDecoder mantissaNullValue))
      (with-field-new rconsumer "price_ratio_mantissa"  (+ start-at 4) (.addLong src-value))))

  (with-field-new rconsumer "price_ratio_exponent"  (+ start-at 5) (.addInteger -7))

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

  (do (adapt-events MDInstrumentDefinitionSpread29Decoder$NoEventsDecoder (+ start-at 15))

      (adapt-md-feed-types MDInstrumentDefinitionSpread29Decoder$NoMDFeedTypesDecoder (+ start-at 16))

      (adapt-inst-attrib MDInstrumentDefinitionSpread29Decoder$NoInstAttribDecoder (+ start-at 17))

      (adapt-lot-type-rules MDInstrumentDefinitionSpread29Decoder$NoLotTypeRulesDecoder (+ start-at 18))
      )
  (let [repetition-decoder (.noLegs top-level)]
    (when (> (.count repetition-decoder) 0)
      (.startField rconsumer "legs" (+ start-at 14))
      (while (.hasNext ^java.util.Iterator repetition-decoder)
        (let [^MDInstrumentDefinitionSpread29Decoder$NoLegsDecoder repetition (.next ^java.util.Iterator repetition-decoder)]

          (.startGroup rconsumer)
          (with-field-new rconsumer "leg_security_id" 0 (.addInteger (.legSecurityID repetition)))

          (with-field-new rconsumer "leg_security_id_source" 1 (.addInteger (Integer/parseInt \8)))

          (with-field-new rconsumer "leg_side" 2 (.addInteger (.value (.legSide repetition))))

          (with-field-new rconsumer "leg_ratio_qty" 3 (.addInteger (.legRatioQty repetition)))

          (let [src-value (.mantissa (.legPrice repetition))]
            (when (not= src-value (. mktdata.PRICENULLDecoder mantissaNullValue))
              (with-field-new rconsumer "leg_price_mantissa" 4 (.addLong src-value))))

	  (with-field-new rconsumer "leg_price_exponent" 5 (.addInteger -7))

          (let [src-value (.mantissa (.legOptionDelta repetition))]
            (when (not= src-value (. mktdata.DecimalQtyDecoder mantissaNullValue))
              (with-field-new rconsumer "leg_option_delta_mantissa" 6 (.addInteger src-value))))

	  (with-field-new rconsumer "leg_option_delta_exponent" 7 (.addInteger -4))

          (.endGroup rconsumer)
          )) (.endField rconsumer "legs" (+ start-at 14))))
  (adapt-common (+ start-at 19) MDInstrumentDefinitionSpread29Decoder)
  )  
(defn ^ParquetRecordWriter make-record-writer [prefix]
  (make-parquet-integrated-writer (str prefix "-md-instrument-definition-spread29.parquet")
                                  (make-loopless-proxy message-write (compile-schema message-schema) {})))
(defn decode [subOffset actingBlockLength actingVersion buffer]
  (.wrap (new MDInstrumentDefinitionSpread29Decoder) buffer subOffset actingBlockLength actingVersion))  


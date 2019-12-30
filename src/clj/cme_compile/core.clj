(ns cme-compile.core
  (:use
   [byte-streams :only [transfer conversion-path]]
   [clojure.java.io :only [file]]
   [clojure.data.int-map :as i :only [int-set]]
   [clojure.stacktrace :only [print-stack-trace]]
   [pcap-common.macros])
  (:require
   [clojure.test :refer :all]
   [cme-compile.md-incremental-refresh-order-book43 :as md-incremental-refresh-order-book43]
   [cme-compile.md-incremental-refresh-order-book47 :as md-incremental-refresh-order-book47]
   [cme-compile.snapshot-full-refresh38 :as snapshot-full-refresh38]
   [cme-compile.snapshot-full-refresh52 :as snapshot-full-refresh52]
   [cme-compile.quote-request39 :as quote-request39]
   [cme-compile.md-incremental-refresh-daily-statistics33 :as md-incremental-refresh-daily-statistics33]
   [cme-compile.md-incremental-refresh-daily-statistics49 :as md-incremental-refresh-daily-statistics49]
   [cme-compile.md-incremental-refresh-book32 :as md-incremental-refresh-book32]
   [cme-compile.md-incremental-refresh-book46 :as md-incremental-refresh-book46]
   [cme-compile.md-incremental-refresh-session-statistics35 :as md-incremental-refresh-session-statistics35]
   [cme-compile.md-incremental-refresh-session-statistics51 :as md-incremental-refresh-session-statistics51]
   [cme-compile.md-incremental-refresh-trade-summary42 :as md-incremental-refresh-trade-summary42]
   [cme-compile.md-incremental-refresh-trade-summary48 :as md-incremental-refresh-trade-summary48]
   [cme-compile.snapshot-full-refresh-order-book44 :as snapshot-full-refresh-order-book44]
   [cme-compile.snapshot-full-refresh-order-book53 :as snapshot-full-refresh-order-book53]
   [cme-compile.md-instrument-definition-spread29 :as md-instrument-definition-spread29]
   [cme-compile.md-instrument-definition-spread56 :as md-instrument-definition-spread56]
   [cme-compile.md-instrument-definition-option41 :as md-instrument-definition-option41]
   [cme-compile.md-instrument-definition-option55 :as md-instrument-definition-option55]
   [cme-compile.md-incremental-refresh-limits-banding34 :as md-incremental-refresh-limits-banding34]
   [cme-compile.md-incremental-refresh-limits-banding50 :as md-incremental-refresh-limits-banding50]
   [cme-compile.channel-reset4 :as channel-reset4]
   [cme-compile.md-incremental-refresh-volume37 :as md-incremental-refresh-volume37]
   [cme-compile.security-status30 :as security-status30]
   [cme-compile.md-instrument-definition-future27 :as md-instrument-definition-future27]
   [cme-compile.md-instrument-definition-future54 :as md-instrument-definition-future54]
   )
  (:import
   [java.io FileInputStream]
   [org.agrona.concurrent UnsafeBuffer]
   [java.util.zip GZIPInputStream]
   [com.peregrinetraders.beans OutputRecord BufferAndOffset PacketBuffer]
   [com.peregrinetraders.streams PcapGenerator MasterDriver]
   [com.peregrinetraders.configuration ETLConfiguration ETLConfigurationParameters ETLConfigurationException]
   [com.peregrinetraders.decoders CMEFrameDecoder]
   [com.struct.kaitai Pcap Pcap$Packet Pcap$PacketEntries EthernetFrame Ipv4Packet UdpDatagram]
   [io.kaitai.struct ByteBufferKaitaiStream]
   [org.apache.parquet.hadoop ParquetRecordWriter]
   [mktdata MessageHeaderDecoder MDIncrementalRefreshOrderBook43Decoder MDIncrementalRefreshOrderBook47Decoder  SnapshotFullRefresh38Decoder SnapshotFullRefresh52Decoder  QuoteRequest39Decoder  MDIncrementalRefreshDailyStatistics33Decoder MDIncrementalRefreshDailyStatistics49Decoder  MDIncrementalRefreshBook32Decoder MDIncrementalRefreshBook46Decoder  MDIncrementalRefreshSessionStatistics35Decoder MDIncrementalRefreshSessionStatistics51Decoder  AdminLogin15Decoder  MDIncrementalRefreshTradeSummary42Decoder MDIncrementalRefreshTradeSummary48Decoder  SnapshotFullRefreshOrderBook44Decoder SnapshotFullRefreshOrderBook53Decoder  MDInstrumentDefinitionSpread29Decoder MDInstrumentDefinitionSpread56Decoder  MDInstrumentDefinitionOption41Decoder MDInstrumentDefinitionOption55Decoder  MDIncrementalRefreshLimitsBanding34Decoder MDIncrementalRefreshLimitsBanding50Decoder  AdminHeartbeat12Decoder  ChannelReset4Decoder  MDIncrementalRefreshVolume37Decoder  AdminLogout16Decoder  SecurityStatus30Decoder  MDInstrumentDefinitionFuture27Decoder MDInstrumentDefinitionFuture54Decoder]
   [java.nio ByteBuffer])

  (:gen-class))

(def general-exclusion (into (i/int-set) [12]))

(def supported-message-ids
  (java.util.HashSet. [MDIncrementalRefreshOrderBook43Decoder/TEMPLATE_ID
                       MDIncrementalRefreshOrderBook47Decoder/TEMPLATE_ID
                       SnapshotFullRefresh38Decoder/TEMPLATE_ID
                       SnapshotFullRefresh52Decoder/TEMPLATE_ID
                       QuoteRequest39Decoder/TEMPLATE_ID
                       MDIncrementalRefreshDailyStatistics33Decoder/TEMPLATE_ID
                       MDIncrementalRefreshDailyStatistics49Decoder/TEMPLATE_ID
                       MDIncrementalRefreshBook32Decoder/TEMPLATE_ID
                       MDIncrementalRefreshBook46Decoder/TEMPLATE_ID
                       MDIncrementalRefreshSessionStatistics35Decoder/TEMPLATE_ID
                       MDIncrementalRefreshSessionStatistics51Decoder/TEMPLATE_ID
                       MDIncrementalRefreshTradeSummary42Decoder/TEMPLATE_ID
                       MDIncrementalRefreshTradeSummary48Decoder/TEMPLATE_ID
                       SnapshotFullRefreshOrderBook44Decoder/TEMPLATE_ID
                       SnapshotFullRefreshOrderBook53Decoder/TEMPLATE_ID
                       MDInstrumentDefinitionSpread29Decoder/TEMPLATE_ID
                       MDInstrumentDefinitionSpread56Decoder/TEMPLATE_ID
                       MDInstrumentDefinitionOption41Decoder/TEMPLATE_ID
                       MDInstrumentDefinitionOption55Decoder/TEMPLATE_ID
                       MDIncrementalRefreshLimitsBanding34Decoder/TEMPLATE_ID
                       MDIncrementalRefreshLimitsBanding50Decoder/TEMPLATE_ID
                       ChannelReset4Decoder/TEMPLATE_ID
                       MDIncrementalRefreshVolume37Decoder/TEMPLATE_ID
                       SecurityStatus30Decoder/TEMPLATE_ID
                       MDInstrumentDefinitionFuture27Decoder/TEMPLATE_ID
                       MDInstrumentDefinitionFuture54Decoder/TEMPLATE_ID
                       ]))


(defn java-stream-process-bulk-with-parquet-out [master-stream pcap_files prefix message-type-exclusions]
  (let [^ParquetRecordWriter md-incremental-refresh-order-book43         (build-optional MDIncrementalRefreshOrderBook43Decoder/TEMPLATE_ID (md-incremental-refresh-order-book43/make-record-writer prefix))
        ^ParquetRecordWriter md-incremental-refresh-order-book47         (build-optional MDIncrementalRefreshOrderBook47Decoder/TEMPLATE_ID (md-incremental-refresh-order-book47/make-record-writer prefix))
        ^ParquetRecordWriter snapshot-full-refresh38                     (build-optional SnapshotFullRefresh38Decoder/TEMPLATE_ID (snapshot-full-refresh38/make-record-writer prefix))
        ^ParquetRecordWriter snapshot-full-refresh52                     (build-optional SnapshotFullRefresh52Decoder/TEMPLATE_ID (snapshot-full-refresh52/make-record-writer prefix))
        ^ParquetRecordWriter quote-request39                             (build-optional QuoteRequest39Decoder/TEMPLATE_ID (quote-request39/make-record-writer prefix))
        ^ParquetRecordWriter md-incremental-refresh-daily-statistics33   (build-optional MDIncrementalRefreshDailyStatistics33Decoder/TEMPLATE_ID (md-incremental-refresh-daily-statistics33/make-record-writer prefix))
        ^ParquetRecordWriter md-incremental-refresh-daily-statistics49   (build-optional MDIncrementalRefreshDailyStatistics49Decoder/TEMPLATE_ID (md-incremental-refresh-daily-statistics49/make-record-writer prefix))
        ^ParquetRecordWriter md-incremental-refresh-book32               (build-optional MDIncrementalRefreshBook32Decoder/TEMPLATE_ID (md-incremental-refresh-book32/make-record-writer prefix))
        ^ParquetRecordWriter md-incremental-refresh-book46               (build-optional MDIncrementalRefreshBook46Decoder/TEMPLATE_ID (md-incremental-refresh-book46/make-record-writer prefix))
        ^ParquetRecordWriter md-incremental-refresh-session-statistics35 (build-optional MDIncrementalRefreshSessionStatistics35Decoder/TEMPLATE_ID (md-incremental-refresh-session-statistics35/make-record-writer prefix))
        ^ParquetRecordWriter md-incremental-refresh-session-statistics51 (build-optional MDIncrementalRefreshSessionStatistics51Decoder/TEMPLATE_ID (md-incremental-refresh-session-statistics51/make-record-writer prefix))
        ^ParquetRecordWriter md-incremental-refresh-trade-summary42      (build-optional MDIncrementalRefreshTradeSummary42Decoder/TEMPLATE_ID (md-incremental-refresh-trade-summary42/make-record-writer prefix))
        ^ParquetRecordWriter md-incremental-refresh-trade-summary48      (build-optional MDIncrementalRefreshTradeSummary48Decoder/TEMPLATE_ID (md-incremental-refresh-trade-summary48/make-record-writer prefix))
        ^ParquetRecordWriter snapshot-full-refresh-order-book44          (build-optional SnapshotFullRefreshOrderBook44Decoder/TEMPLATE_ID (snapshot-full-refresh-order-book44/make-record-writer prefix))
        ^ParquetRecordWriter snapshot-full-refresh-order-book53          (build-optional SnapshotFullRefreshOrderBook53Decoder/TEMPLATE_ID (snapshot-full-refresh-order-book53/make-record-writer prefix))
        ^ParquetRecordWriter md-instrument-definition-spread29           (build-optional MDInstrumentDefinitionSpread29Decoder/TEMPLATE_ID (md-instrument-definition-spread29/make-record-writer prefix))
        ^ParquetRecordWriter md-instrument-definition-spread56           (build-optional MDInstrumentDefinitionSpread56Decoder/TEMPLATE_ID (md-instrument-definition-spread56/make-record-writer prefix))
        ^ParquetRecordWriter md-instrument-definition-option41           (build-optional MDInstrumentDefinitionOption41Decoder/TEMPLATE_ID (md-instrument-definition-option41/make-record-writer prefix))
        ^ParquetRecordWriter md-instrument-definition-option55           (build-optional MDInstrumentDefinitionOption55Decoder/TEMPLATE_ID (md-instrument-definition-option55/make-record-writer prefix))
        ^ParquetRecordWriter md-incremental-refresh-limits-banding34     (build-optional MDIncrementalRefreshLimitsBanding34Decoder/TEMPLATE_ID (md-incremental-refresh-limits-banding34/make-record-writer prefix))
        ^ParquetRecordWriter md-incremental-refresh-limits-banding50     (build-optional MDIncrementalRefreshLimitsBanding50Decoder/TEMPLATE_ID (md-incremental-refresh-limits-banding50/make-record-writer prefix))
        ^ParquetRecordWriter channel-reset4                              (build-optional ChannelReset4Decoder/TEMPLATE_ID (channel-reset4/make-record-writer prefix))
        ^ParquetRecordWriter md-incremental-refresh-volume37             (build-optional MDIncrementalRefreshVolume37Decoder/TEMPLATE_ID (md-incremental-refresh-volume37/make-record-writer prefix))
        ^ParquetRecordWriter security-status30                           (build-optional SecurityStatus30Decoder/TEMPLATE_ID (security-status30/make-record-writer prefix))
        ^ParquetRecordWriter md-instrument-definition-future27           (build-optional MDInstrumentDefinitionFuture27Decoder/TEMPLATE_ID (md-instrument-definition-future27/make-record-writer prefix))
        ^ParquetRecordWriter md-instrument-definition-future54           (build-optional MDInstrumentDefinitionFuture54Decoder/TEMPLATE_ID (md-instrument-definition-future54/make-record-writer prefix))

        decode-sbe-message-to-parquet (fn [packet-usec market-usec templateId subOffset actingBlockLength actingVersion buffer]
                                        (condp = templateId
                                          MDIncrementalRefreshOrderBook43Decoder/TEMPLATE_ID (writeout md-incremental-refresh-order-book43 md-incremental-refresh-order-book43/decode)
                                          MDIncrementalRefreshOrderBook47Decoder/TEMPLATE_ID (writeout md-incremental-refresh-order-book47 md-incremental-refresh-order-book47/decode)
                                          SnapshotFullRefresh38Decoder/TEMPLATE_ID (writeout snapshot-full-refresh38 snapshot-full-refresh38/decode)
                                          SnapshotFullRefresh52Decoder/TEMPLATE_ID (writeout snapshot-full-refresh52 snapshot-full-refresh52/decode)
                                          QuoteRequest39Decoder/TEMPLATE_ID (writeout quote-request39 quote-request39/decode)
                                          MDIncrementalRefreshDailyStatistics33Decoder/TEMPLATE_ID (writeout md-incremental-refresh-daily-statistics33 md-incremental-refresh-daily-statistics33/decode)
                                          MDIncrementalRefreshDailyStatistics49Decoder/TEMPLATE_ID (writeout md-incremental-refresh-daily-statistics49 md-incremental-refresh-daily-statistics49/decode)
                                          MDIncrementalRefreshBook32Decoder/TEMPLATE_ID (writeout md-incremental-refresh-book32 md-incremental-refresh-book32/decode)
                                          MDIncrementalRefreshBook46Decoder/TEMPLATE_ID (writeout md-incremental-refresh-book46 md-incremental-refresh-book46/decode)
                                          MDIncrementalRefreshSessionStatistics35Decoder/TEMPLATE_ID (writeout md-incremental-refresh-session-statistics35 md-incremental-refresh-session-statistics35/decode)
                                          MDIncrementalRefreshSessionStatistics51Decoder/TEMPLATE_ID (writeout md-incremental-refresh-session-statistics51 md-incremental-refresh-session-statistics51/decode)
                                          MDIncrementalRefreshTradeSummary42Decoder/TEMPLATE_ID (writeout md-incremental-refresh-trade-summary42 md-incremental-refresh-trade-summary42/decode)
                                          MDIncrementalRefreshTradeSummary48Decoder/TEMPLATE_ID (writeout md-incremental-refresh-trade-summary48 md-incremental-refresh-trade-summary48/decode)
                                          SnapshotFullRefreshOrderBook44Decoder/TEMPLATE_ID (writeout snapshot-full-refresh-order-book44 snapshot-full-refresh-order-book44/decode)
                                          SnapshotFullRefreshOrderBook53Decoder/TEMPLATE_ID (writeout snapshot-full-refresh-order-book53 snapshot-full-refresh-order-book53/decode)
                                          MDInstrumentDefinitionSpread29Decoder/TEMPLATE_ID (writeout md-instrument-definition-spread29 md-instrument-definition-spread29/decode)
                                          MDInstrumentDefinitionSpread56Decoder/TEMPLATE_ID (do
                                                                                              #_(println (.toString (.wrap (new MDInstrumentDefinitionSpread56Decoder) buffer subOffset actingBlockLength actingVersion)))
                                                                                              (writeout md-instrument-definition-spread56 md-instrument-definition-spread56/decode))
                                          MDInstrumentDefinitionOption41Decoder/TEMPLATE_ID (writeout md-instrument-definition-option41 md-instrument-definition-option41/decode)
                                          MDInstrumentDefinitionOption55Decoder/TEMPLATE_ID (writeout md-instrument-definition-option55 md-instrument-definition-option55/decode)
                                          MDIncrementalRefreshLimitsBanding34Decoder/TEMPLATE_ID (writeout md-incremental-refresh-limits-banding34 md-incremental-refresh-limits-banding34/decode)
                                          MDIncrementalRefreshLimitsBanding50Decoder/TEMPLATE_ID (writeout md-incremental-refresh-limits-banding50 md-incremental-refresh-limits-banding50/decode)
                                          ChannelReset4Decoder/TEMPLATE_ID (writeout channel-reset4 channel-reset4/decode)
                                          MDIncrementalRefreshVolume37Decoder/TEMPLATE_ID (writeout md-incremental-refresh-volume37 md-incremental-refresh-volume37/decode)
                                          SecurityStatus30Decoder/TEMPLATE_ID (writeout security-status30 security-status30/decode)
                                          MDInstrumentDefinitionFuture27Decoder/TEMPLATE_ID (writeout md-instrument-definition-future27 md-instrument-definition-future27/decode)
                                          MDInstrumentDefinitionFuture54Decoder/TEMPLATE_ID (writeout md-instrument-definition-future54 md-instrument-definition-future54/decode))
                                        templateId)
        just-decode                   (fn [packet-usec market-usec templateId subOffset actingBlockLength actingVersion buffer]
                                        (print (count (.toString (condp = templateId
                                                                   MDIncrementalRefreshOrderBook43Decoder/TEMPLATE_ID (md-incremental-refresh-order-book43/decode subOffset actingBlockLength actingVersion buffer)
                                                                   MDIncrementalRefreshOrderBook47Decoder/TEMPLATE_ID (md-incremental-refresh-order-book47/decode  subOffset actingBlockLength actingVersion buffer)
                                                                   SnapshotFullRefresh38Decoder/TEMPLATE_ID (snapshot-full-refresh38/decode subOffset actingBlockLength actingVersion buffer)
                                                                   SnapshotFullRefresh52Decoder/TEMPLATE_ID (snapshot-full-refresh52/decode subOffset actingBlockLength actingVersion buffer)
                                                                   QuoteRequest39Decoder/TEMPLATE_ID (quote-request39/decode subOffset actingBlockLength actingVersion buffer)
                                                                   MDIncrementalRefreshDailyStatistics33Decoder/TEMPLATE_ID (md-incremental-refresh-daily-statistics33/decode subOffset actingBlockLength actingVersion buffer)
                                                                   MDIncrementalRefreshDailyStatistics49Decoder/TEMPLATE_ID (md-incremental-refresh-daily-statistics49/decode subOffset actingBlockLength actingVersion buffer)
                                                                   MDIncrementalRefreshBook32Decoder/TEMPLATE_ID (md-incremental-refresh-book32/decode subOffset actingBlockLength actingVersion buffer)
                                                                   MDIncrementalRefreshBook46Decoder/TEMPLATE_ID (md-incremental-refresh-book46/decode subOffset actingBlockLength actingVersion buffer)
                                                                   MDIncrementalRefreshSessionStatistics35Decoder/TEMPLATE_ID (md-incremental-refresh-session-statistics35/decode subOffset actingBlockLength actingVersion buffer)
                                                                   MDIncrementalRefreshSessionStatistics51Decoder/TEMPLATE_ID (md-incremental-refresh-session-statistics51/decode subOffset actingBlockLength actingVersion buffer)
                                                                   MDIncrementalRefreshTradeSummary42Decoder/TEMPLATE_ID (md-incremental-refresh-trade-summary42/decode subOffset actingBlockLength actingVersion buffer)
                                                                   MDIncrementalRefreshTradeSummary48Decoder/TEMPLATE_ID (md-incremental-refresh-trade-summary48/decode subOffset actingBlockLength actingVersion buffer)
                                                                   SnapshotFullRefreshOrderBook44Decoder/TEMPLATE_ID (snapshot-full-refresh-order-book44/decode subOffset actingBlockLength actingVersion buffer)
                                                                   SnapshotFullRefreshOrderBook53Decoder/TEMPLATE_ID (snapshot-full-refresh-order-book53/decode subOffset actingBlockLength actingVersion buffer)
                                                                   MDInstrumentDefinitionSpread29Decoder/TEMPLATE_ID (md-instrument-definition-spread29/decode subOffset actingBlockLength actingVersion buffer)
                                                                   MDInstrumentDefinitionSpread56Decoder/TEMPLATE_ID (md-instrument-definition-spread56/decode subOffset actingBlockLength actingVersion buffer)
                                                                   MDInstrumentDefinitionOption41Decoder/TEMPLATE_ID (md-instrument-definition-option41/decode subOffset actingBlockLength actingVersion buffer)
                                                                   MDInstrumentDefinitionOption55Decoder/TEMPLATE_ID (md-instrument-definition-option55/decode subOffset actingBlockLength actingVersion buffer)
                                                                   MDIncrementalRefreshLimitsBanding34Decoder/TEMPLATE_ID (md-incremental-refresh-limits-banding34/decode subOffset actingBlockLength actingVersion buffer)
                                                                   MDIncrementalRefreshLimitsBanding50Decoder/TEMPLATE_ID (md-incremental-refresh-limits-banding50/decode subOffset actingBlockLength actingVersion buffer)
                                                                   ChannelReset4Decoder/TEMPLATE_ID (channel-reset4/decode subOffset actingBlockLength actingVersion buffer)
                                                                   MDIncrementalRefreshVolume37Decoder/TEMPLATE_ID (md-incremental-refresh-volume37/decode subOffset actingBlockLength actingVersion buffer)
                                                                   SecurityStatus30Decoder/TEMPLATE_ID (security-status30/decode subOffset actingBlockLength actingVersion buffer)
                                                                   MDInstrumentDefinitionFuture27Decoder/TEMPLATE_ID (md-instrument-definition-future27/decode subOffset actingBlockLength actingVersion buffer)
                                                                   MDInstrumentDefinitionFuture54Decoder/TEMPLATE_ID (md-instrument-definition-future54/decode subOffset actingBlockLength actingVersion buffer))))))
        master-decode                 (jconsumer [^BufferAndOffset info]
                                                 (let [buffer        (.getBuffer info)
                                                       offset        (.getOffset info)
                                                       header        (.wrap (MessageHeaderDecoder.) buffer offset)
                                                       templateId    (.templateId header)
                                                       encodedLength (.encodedLength header)
                                                       blockLength   (.blockLength header)
                                                       version       (.version header)]
                                                   (if (or (contains? general-exclusion templateId)
                                                           (contains? message-type-exclusions templateId))
                                                     nil
                                                     (decode-sbe-message-to-parquet
                                                      (.getPacketTime info)
                                                      (.getMarketTime info)
                                                      templateId
                                                      (+ offset encodedLength)
                                                      blockLength
                                                      version
                                                      (.getBuffer info)))))
        ]
    (try
      (master-stream pcap_files (CMEFrameDecoder.) master-decode)
      (finally
        (let [close-optional #(when (not (contains? message-type-exclusions %1)) (.close %2 nil))]
          (close-optional MDIncrementalRefreshOrderBook43Decoder/TEMPLATE_ID md-incremental-refresh-order-book43)
          (close-optional MDIncrementalRefreshOrderBook47Decoder/TEMPLATE_ID md-incremental-refresh-order-book47)
          (close-optional SnapshotFullRefresh38Decoder/TEMPLATE_ID snapshot-full-refresh38)
          (close-optional SnapshotFullRefresh52Decoder/TEMPLATE_ID snapshot-full-refresh52)
          (close-optional QuoteRequest39Decoder/TEMPLATE_ID quote-request39)
          (close-optional MDIncrementalRefreshDailyStatistics33Decoder/TEMPLATE_ID md-incremental-refresh-daily-statistics33)
          (close-optional MDIncrementalRefreshDailyStatistics49Decoder/TEMPLATE_ID md-incremental-refresh-daily-statistics49)
          (close-optional MDIncrementalRefreshBook32Decoder/TEMPLATE_ID md-incremental-refresh-book32)
          (close-optional MDIncrementalRefreshBook46Decoder/TEMPLATE_ID md-incremental-refresh-book46)
          (close-optional MDIncrementalRefreshSessionStatistics35Decoder/TEMPLATE_ID md-incremental-refresh-session-statistics35)
          (close-optional MDIncrementalRefreshSessionStatistics51Decoder/TEMPLATE_ID md-incremental-refresh-session-statistics51)
          (close-optional MDIncrementalRefreshTradeSummary42Decoder/TEMPLATE_ID md-incremental-refresh-trade-summary42)
          (close-optional MDIncrementalRefreshTradeSummary48Decoder/TEMPLATE_ID md-incremental-refresh-trade-summary48)
          (close-optional SnapshotFullRefreshOrderBook44Decoder/TEMPLATE_ID snapshot-full-refresh-order-book44)
          (close-optional SnapshotFullRefreshOrderBook53Decoder/TEMPLATE_ID snapshot-full-refresh-order-book53)
          (close-optional MDInstrumentDefinitionSpread29Decoder/TEMPLATE_ID md-instrument-definition-spread29)
          (close-optional MDInstrumentDefinitionSpread56Decoder/TEMPLATE_ID md-instrument-definition-spread56)
          (close-optional MDInstrumentDefinitionOption41Decoder/TEMPLATE_ID md-instrument-definition-option41)
          (close-optional MDInstrumentDefinitionOption55Decoder/TEMPLATE_ID md-instrument-definition-option55)
          (close-optional MDIncrementalRefreshLimitsBanding34Decoder/TEMPLATE_ID md-incremental-refresh-limits-banding34)
          (close-optional MDIncrementalRefreshLimitsBanding50Decoder/TEMPLATE_ID md-incremental-refresh-limits-banding50)
          (close-optional ChannelReset4Decoder/TEMPLATE_ID channel-reset4)
          (close-optional MDIncrementalRefreshVolume37Decoder/TEMPLATE_ID md-incremental-refresh-volume37)
          (close-optional SecurityStatus30Decoder/TEMPLATE_ID security-status30)
          (close-optional MDInstrumentDefinitionFuture27Decoder/TEMPLATE_ID md-instrument-definition-future27)
          (close-optional MDInstrumentDefinitionFuture54Decoder/TEMPLATE_ID md-instrument-definition-future54)
          )))))

(defn read-exactly [^GZIPInputStream input-s #^bytes payload #^long payload-offset #^long extr-length]
  (loop [offset payload-offset
         len extr-length]
          (when (> len 0)
            (let [actually-read (.read input-s payload offset len)]
              (when (and (> actually-read 0) (< actually-read len)) 
               (recur (+ offset actually-read) (- len actually-read)))
              ))))

(defn test-master-stream [pcap_files frame-decoder sink]
  (doseq [pfile pcap_files]
    (println pfile)
    (let [input-s  (GZIPInputStream. (FileInputStream. pfile) (* 1024 1024 8))
          channel  (byte-array 2)
          length   (byte-array 2)
          to-short #(let [bb (ByteBuffer/wrap %)] (.order bb java.nio.ByteOrder/LITTLE_ENDIAN) (.getShort bb))]
      (while (> (.available input-s) 0)
        (read-exactly input-s channel 0 2)
        (read-exactly input-s length 0 2)
        (let [extr-length (to-short length)
              payload     (byte-array extr-length)]
          (when (> extr-length 0)
            (read-exactly input-s payload 0 extr-length)
            (try (let [^java.util.stream.Stream frame-stream (.apply ^java.util.function.Function frame-decoder (PacketBuffer. (UnsafeBuffer. payload) 0))
                       ]
                   (.forEachOrdered frame-stream sink))
                 (catch Exception e (println (str e))))
            ))))))


#_(defn test-master-driver [pcap_files make-message-header-decoder extract-message-header-decoder general-exclusion message-type-exclusions decode-middle-frame-with decode-sbe-message-to-parquet]
  (let [decode-buffer-to-parquet
        (fn [packet-usec market-usec buffer offset]
          (let [message-header (make-message-header-decoder buffer offset)
                [templateId encodedLength blockLength version] (extract-message-header-decoder message-header)]
            (if (or (contains? general-exclusion templateId)
                    (contains? message-type-exclusions templateId))
              nil
              (decode-sbe-message-to-parquet
               packet-usec
               market-usec
               templateId
               (+ offset encodedLength)
               blockLength
               version
               buffer))))]
    (doseq [pfile pcap_files]
      (println pfile)
      (let [input-s  (GZIPInputStream. (FileInputStream. pfile) (* 1024 1024 8))
            channel  (byte-array 2)
            length   (byte-array 2)
            to-short #(let [bb (ByteBuffer/wrap %)] (.order bb java.nio.ByteOrder/LITTLE_ENDIAN) (.getShort bb))
            results  (volatile! 0)]
        (while (> (.available input-s) 0)
          (read-exactly input-s channel 2)
          (read-exactly input-s length 2)
          (let [extr-length (to-short length)
                payload     (byte-array extr-length)]
            (when (> extr-length 0)
              (read-exactly input-s payload extr-length)
              (let  [msg-count      (count (:messages (decode-middle-frame-with decode-buffer-to-parquet [payload 666])))]
                (vswap! results #(+ % msg-count)))
              )
            )
          (when (= 0 (mod @results 1000000)) (println @results)))
        @results)
      )))

(defn enabled-test-mode []
  (if-let [testProperty (System/getProperty "CME_READ_TEST_FILE_FORMAT")]
    (= testProperty "1")
    false))

(defn -main
  "I don't do a whole lot."
  [& args]
  (if (< (count args) 1)
    (do (println "
CME transformation exchange tool.
The utility allows extraction of Messages embedded in gzipped Pcap files.
Usage: java -jar <jarfile> [options] folder1 folder2 ...
Options are:
")
        (ETLConfiguration/printSummary " -jar <jarfile> [options] folder1 folder2 ...")
        (println "
The configuration file is a JSON containing the same command line options, as well as the extra
\"folders\" key, the list of folders.
NOTE: Options provided on the command-line override those in the configuration file.
"))
    (try
      (let [configuration-parameters (ETLConfiguration/initializeAppConfiguration (into-array String args)
                                                                                  (java.util.HashSet. supported-message-ids))

            pcap-files        (java.util.ArrayList.
                               (->> (.getFolders configuration-parameters)
                                    (map #(into [] (ETLConfiguration/filesFromDir %)))
                                    flatten
                                    sort
                                    (filter #(not (.startsWith (.getName %) ".")))))
            prefix            (.getPrefix configuration-parameters)
            excluded-messages (ETLConfiguration/excludedMessages configuration-parameters
                                                                 supported-message-ids)
            master-stream (if (not (enabled-test-mode))
                            #(MasterDriver/masterStream %1 %2 %3)
                            test-master-stream)]
        (java-stream-process-bulk-with-parquet-out master-stream
                                                   pcap-files
                                                   prefix
                                                   excluded-messages)
        )
      (catch ETLConfigurationException e
        (println (str "Process cannot start\n" (.getMessage e)))))
    ))

(comment (-main "-p" (str "wtf" (Math/random)) "/Users/sorin/projects/prospect_lead_1/224.0.31.1_14310.pcap.gz"))
(comment (-main "-p" (str "wtf" (Math/random)) "/Volumes/Samsung_T5/prospect_lead_1/cme_test_data/pcap/20190802"))

(comment (set! *warn-on-reflection* true))

;; [46 48 51 47 37]

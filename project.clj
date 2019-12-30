(defproject cme_compile "0.3.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :java-source-paths ["src/java"]
  :source-paths ["src/clj"]
  :plugins [[s3-wagon-private "1.3.2"]
            [lein-project-version "0.1.0"]]
  :main cme-compile.core
  ;;:repositories {"local" ~(str (.toURI (java.io.File. "/Users/sorin/.m2")))}
  :repositories [["private" {:url "s3p://md-data-reader-artifacts/snapshots/" :no-auth true}]
                 ["releases" {:url "s3p://md-data-reader-artifacts/releases/" :no-auth true}]
                 ["snapshots" {:url "s3p://md-data-reader-artifacts/snapshots" :no-auth true}]]
  :dependencies [[org.clojure/clojure "1.10.0"]
 		 [io.kaitai/kaitai-struct-runtime "0.8"]
                 [org.agrona/agrona "0.9.35"]
                 [net.jpountz.lz4/lz4 "1.3"]
                 [byte-streams "0.2.4"]
                 [org.clojure/tools.cli "0.4.2"]
                 [cheshire "5.8.1"]
                 [org.apache.parquet/parquet-common "1.10.1"]
                 [org.apache.parquet/parquet-column "1.10.1"]
                 [org.apache.parquet/parquet-encoding "1.10.1"]
                 [org.apache.parquet/parquet-hadoop "1.10.1"]
                 [org.apache.hadoop/hadoop-core "1.2.1"]
                 [org.slf4j/slf4j-simple "1.7.26"]
                 [org.clojure/data.int-map "0.2.4"]
		 [pcap_common/pcap_common "0.1.0-SNAPSHOT"]
                 [nrepl "0.6.0"]
                 [lambdaisland/kaocha "0.0-529"]])

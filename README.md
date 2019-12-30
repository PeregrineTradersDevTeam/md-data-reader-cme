[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

## Synopsis
This software is provided by [Peregrine Traders B.V.](https://www.peregrinetraders.com) under MIT license.

The Java Market Data Decoder for CME MDP 3.0 was designed as a software application to process end-of-day raw market data captured in the form of PCAP files. The application fully supports the CME MDP 3.0 market data platform (https://www.cmegroup.com/confluence/display/EPICSANDBOX/CME+MDP+3.0+Market+Data), and helps decoding the raw market data messages in a human readable format according to the message schema provided by the exchange, and to store the decoded data in a research and analytics friendly format. 

The application consists of two modules: a reader/decoder module and a writer module. The reader/decoder module reads the raw Simple Binary Encoding (SBE) encoded messages contained in the PCAP files and decodes the messages according to the XML schema provided by the exchange. The writer module generates, given the schema of the single message types defined in the documentation provided by Euronext, a tabular representation of the messages that are then saved in a dedicated Apache Parquet file for each message type, such that each message type receives a dedicated file to be saved on.



## Motivation

While the raw SBE encoded messages coming from the CME MDP 3.0 platform constitute the fundamental unit for the delivery of market data information coming from the Euronext exchange, the SBE encoding used for the market data is designed to minimize the latency over a real time feed, but is not a format that is optimized for research and analytics applications. 

Due to the need of having this raw data stored in a research and analytics friendly format, the Java Market Data Decoder for CME MDP 3.0 has been developed. In particular, the application first decodes the raw SBE encoded data using the SBE schema provided by CME, thus converting the data from a binary format to the format characteristic to each data field contained in a specific message. Once a raw message is decoded, the application writes this normalized data to a dedicated Apache Parquet file, which can then be used as a source for analytical queries, or for further processing. 

The Apache Parquet format has been chosen as final storage format due to its columnar nature, the high compressibility, the support for partition pruning, column projection and predicate push-downs.



## Features 

* Transforms PCAP files into Parquet datasets
* Aggregates data per SBE message type
* Can exclude multiple message types or can process only single one

## Requirements 

### Software Requirements 

In order for this software to successfully run, a version of Java must be installed on the machine. 

### Data Requirements 

This software is designed to process CME MDP 3.0 SBE-encoded historical data, delivered in the form of PCAP files. This data is not provided by this software and can be obtained via market dat aproviders of your choice.



## Usage

Quickstart:

```
java -jar <path_to_jarfile> -p <prefix> [OPTIONS] <paths...>
```
The prefix is mandatory, and will be prepended to the name of each message type to form a name for the extracted dataset.

Paths represent gzipped pcap sources. Can either be a single file, or a folder which will be recursively search for files.

A detailed specification of inputs, outputs, and options can be found in the [documentation](doc/intro.md).


## Building from source
The project is a mixture of Clojure and Java. It uses [Leiningen](https://leiningen.org) as the main build tool.
The easiest way to obtain a build is to run:
```
lein uberjar
```
and check in ```target/<project-name>-standalone.jar```.

## License
This software is provided under MIT license.

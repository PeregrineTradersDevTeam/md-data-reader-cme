# Introduction to cme_compile

The application is packaged as a standalone Java JAR file. It contains all required dependencies, in the form of an “uber” jar. There was no specific concern regarding output file size, or de-duplicating the classpath for Euronext & CME.

It is intended to be executed as a CLI tool.

When invoked without arguments (java -jar <path to application>) it outputs some documentation.

The minimal required arguments are:

- A prefix (```-p <prefix>```) for all of the resulting parquet files
- One or more *source pcap* locations.

A source pcap location can be either a pcap file or a folder path.

The folder will be recursively searched for pcap files. When compiling the final list of sources, all of the file paths will be sorted.


When executed, the software analyses the pcap sources, processing each in turn.

The output is a set of parquet files.

Each file starts with the provided prefix, and continues with the name of the message type whose data it collects.

The output files are written in the current directory.

By default, the tool begins to output all programmed message types. There are 2 flags controlling this behavior:

* ```-X <message_id>```: excludes this particular message type from processing. No output file is generated. If the message is encountered in any source pcap file, it is ignored. This option can be provided multiple times, the effect being to multiple message types. 

* ```-O <message_id>```: only output this particular message type. Only one parquet dataset is created, and populated if there are messages found in the source pcap files of this particular type. May be passed only once.

In both cases, <message_id> represents an internal SBE message identifier. The software will verify the identifier is correct as part of its initialisation.
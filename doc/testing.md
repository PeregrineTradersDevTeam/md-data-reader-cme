# Testing
CME was not very nice in assisting with the testing process… As such, only a limited number of message types could be tested. 

There are 2 main chapters relating to testing:

1. CME provided some test data, containing several message types
2. Pico provided 1 day of sample data, with CME providing alternative FIX files for the instrument definitions.

The test data is very large, thus not delivered as part of the repo, but in S3. The test files are in integration_tests/

### CME-provided test data

The test data is not in the same Pico format. As such, the CME application itself includes a secondary decoder, implementing https://www.cmegroup.com/confluence/display/EPICSANDBOX/Packet+Capture+Dataset - Packet format section.

The CLI is the same, however there is a Java Environment Variable which, when set to “1”, switches to the above decoder: CME_READ_TEST_FILE_FORMAT


The secondary data source for this is of a different structure, so only a small sample of each message types was manually selected, manually compared, and determined to indeed represent the same, correct, message.

The result is, for each message type, a python script which manually asserts the test structure. The simplest example is test_security_status.py

### Pico-provided sample data
Like Euronext, a sample set of file is there to be adapted into the message type. Since, yet again, the provided FIX data is not the same structure, the test reverts to manual inspection & building a set of assertions.


### Executing the test suite:
The steps are:

1. Decode the special CME test files
2. Decode the Pico files
3. Run the python PySpark test runner job, submitting it to a docker instance (see Jenkins job configuration)

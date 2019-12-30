docker run --rm -it -p 4040:4040 -v $(pwd)/../test_decoded_data:/test_decoded_data/ -v $(pwd)/:/cme_integration_tests gettyimages/spark bin/spark-submit /cme_integration_tests/run_cme_tests.py

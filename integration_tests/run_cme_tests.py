import pyspark
from pyspark.sql import SparkSession
import test_quote_request
import test_security_status
import test_md_incremental_refresh_session_statistics
import test_md_incremental_refresh_daily_statistics
import test_md_incremental_refresh_order_book
import test_md_incremental_refresh_book
import test_md_instrument_definition_spread

spark = SparkSession \
    .builder \
    .appName("Test CME decoding") \
    .getOrCreate()

test_quote_request.run_test(spark) # GOOD
test_security_status.run_test(spark) # GOOD
test_md_incremental_refresh_session_statistics.run_test(spark) # GOOD
test_md_incremental_refresh_daily_statistics.run_test(spark) # GOOD
test_md_incremental_refresh_order_book.run_test(spark) # GOOD
test_md_incremental_refresh_book.run_test(spark) # GOOD
#test_md_instrument_definition_spread.run_test(spark)

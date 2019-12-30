from test_utils import sample_collection_from_test_files

def assert_row_0(row):
    assert(row['security_group'].decode() == "")
    assert(row['asset'].decode() == "")
    assert(row['security_id'] == 19020)
    assert(row['trade_date'] == 18110)
    assert(row['security_trading_status'] == 103)
    assert(row['halt_reason'] == 1)
    assert(row['security_trading_event'] == 5)
def assert_row_1(row):
    assert(row['security_group'].decode() == "")
    assert(row['asset'].decode() == "")
    assert(row['security_id'] == 4021)
    assert(row['trade_date'] == 18110)
    assert(row['security_trading_status'] == 103)
    assert(row['halt_reason'] == 1)
    assert(row['security_trading_event'] == 5)
def assert_row_2(row):
    assert(row['security_group'].decode() == "SS")
    assert(row['asset'].decode() == "SR1")
    assert(row['security_id'] == None)
    assert(row['trade_date'] == 18109)
    assert(row['security_trading_status'] == 103)
    assert(row['halt_reason'] == 0)
    assert(row['security_trading_event'] == 5)
def assert_row_3(row):
    assert(row['security_group'].decode() == "")
    assert(row['asset'].decode() == "")
    assert(row['security_id'] == 36158)
    assert(row['trade_date'] == 18109)
    assert(row['security_trading_status'] == 103)
    assert(row['halt_reason'] == 1)
    assert(row['security_trading_event'] == 5)

def assert_row_4(row):
    assert(row['security_group'].decode() == "GE")
    assert(row['asset'].decode() == "GE")
    assert(row['security_id'] == None)
    assert(row['trade_date'] == 18109)
    assert(row['security_trading_status'] == 103)
    assert(row['halt_reason'] == 0)
    assert(row['security_trading_event'] == 6)

def run_test(sparkSession):
    data_for_test = sample_collection_from_test_files(sparkSession, [ \
            ['/test_decoded_data/test-1-security-status30.parquet',[36,44]], 
            ['/test_decoded_data/test-2-security-status30.parquet', [28,57,68]]])
    assert_row_0(data_for_test[0])
    assert_row_1(data_for_test[1])
    assert_row_2(data_for_test[2])
    assert_row_3(data_for_test[3])
    assert_row_4(data_for_test[4])

from test_utils import sample_collection_from_test_files

def assert_row_0(row):
    assert(row['quote_req_id'].decode() == 'CME0086378378219049')
    assert(len(row['related_sym']) == 1)
    related_sym = row['related_sym'][0]
    assert(related_sym['symbol'].decode() == 'GE:BF U9-Z9-H0')
    assert(related_sym['security_id'] == 863783)
    assert(related_sym['quote_type'] == 1)

def assert_row_1(row):
    assert(row['quote_req_id'].decode() == 'CME0016588898219046')
    assert(len(row['related_sym']) == 1)
    related_sym = row['related_sym'][0]
    assert(related_sym['symbol'].decode() == 'GE:BF M0-H1-Z1')
    assert(related_sym['security_id'] == 165888)
    assert(related_sym['quote_type'] == 1)

def assert_row_2(row):
    assert(row['quote_req_id'].decode() == 'CME0016588898219047')
    assert(len(row['related_sym']) == 1)
    related_sym = row['related_sym'][0]
    assert(related_sym['symbol'].decode() == 'GE:BF M0-H1-Z1')
    assert(related_sym['security_id'] == 165888)
    assert(related_sym['quote_type'] == 1)


def run_test(sparkSession):
    data_for_test = sample_collection_from_test_files(sparkSession, [ \
            ['/test_decoded_data/test-1-quote-request39.parquet',[0]], 
            ['/test_decoded_data/test-2-quote-request39.parquet', [0,1]]])
    assert_row_0(data_for_test[0])
    assert_row_1(data_for_test[1])
    assert_row_2(data_for_test[2])

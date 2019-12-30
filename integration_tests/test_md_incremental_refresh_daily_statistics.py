from test_utils import sample_collection_from_test_files

def assert_row_0(row):
    assert(row['transact_time'] == 1564701546210365585)
    assert(row['match_event_indicator'] == 0) # 00001000
    assert(len(row['md_entries']) == 3)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == 0)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['security_id'] == 36471)
    assert(md_entries_0['rpt_seq'] == 144110)
    assert(md_entries_0['trading_reference_date'] == 18109)
    assert(md_entries_0['settl_price_type'] == 3) # 00000011
    assert(md_entries_0['md_entry_type'] == 54) # '6'
    assert(md_entries_0['md_update_action'] == 0)
    md_entries_1 = row['md_entries'][1]
    assert(md_entries_1['md_entry_px_mantissa'] == 0)
    assert(md_entries_1['md_entry_px_exponent'] == -9)
    assert(md_entries_1['security_id'] == 36472)
    assert(md_entries_1['rpt_seq'] == 25)
    assert(md_entries_1['trading_reference_date'] == 18109)
    assert(md_entries_1['settl_price_type'] == 3) # 00000011
    assert(md_entries_1['md_entry_type'] == 54) # '6'
    assert(md_entries_1['md_update_action'] == 0)
    md_entries_2 = row['md_entries'][2]
    assert(md_entries_2['md_entry_px_mantissa'] == 0)
    assert(md_entries_2['md_entry_px_exponent'] == -9)
    assert(md_entries_2['security_id'] == 36476)
    assert(md_entries_2['rpt_seq'] == 25)
    assert(md_entries_2['trading_reference_date'] == 18109)
    assert(md_entries_2['settl_price_type'] == 3) # 00000011
    assert(md_entries_2['md_entry_type'] == 54) # '6'
    assert(md_entries_2['md_update_action'] == 0)
def assert_row_1(row):
    assert(row['transact_time'] == 1564701566685717039)
    assert(row['match_event_indicator'] == 0) # 00001000
    assert(len(row['md_entries']) == 1)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == 0)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['security_id'] == 12980)
    assert(md_entries_0['rpt_seq'] == 25)
    assert(md_entries_0['trading_reference_date'] == 18109)
    assert(md_entries_0['settl_price_type'] == 3) # 00000011
    assert(md_entries_0['md_entry_type'] == 54) # '6'
    assert(md_entries_0['md_update_action'] == 0)

def assert_row_2(row):
    assert(row['transact_time'] == 1564701604549439103)
    assert(row['match_event_indicator'] == 0) # 00001000
    assert(len(row['md_entries']) == 3)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == 15500000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['security_id'] == 6286)
    assert(md_entries_0['rpt_seq'] == 25)
    assert(md_entries_0['trading_reference_date'] == 18109)
    assert(md_entries_0['settl_price_type'] == 3) # 00000011
    assert(md_entries_0['md_entry_type'] == 54) # '6'
    assert(md_entries_0['md_update_action'] == 0)
    md_entries_1 = row['md_entries'][1]
    assert(md_entries_1['md_entry_px_mantissa'] == 0)
    assert(md_entries_1['md_entry_px_exponent'] == -9)
    assert(md_entries_1['security_id'] == 6279)
    assert(md_entries_1['rpt_seq'] == 25)
    assert(md_entries_1['trading_reference_date'] == 18109)
    assert(md_entries_1['settl_price_type'] == 3) # 00000011
    assert(md_entries_1['md_entry_type'] == 54) # '6'
    assert(md_entries_1['md_update_action'] == 0)
    md_entries_2 = row['md_entries'][2]
    assert(md_entries_2['md_entry_px_mantissa'] == -1500000000)
    assert(md_entries_2['md_entry_px_exponent'] == -9)
    assert(md_entries_2['security_id'] == 6299)
    assert(md_entries_2['rpt_seq'] == 25)
    assert(md_entries_2['trading_reference_date'] == 18109)
    assert(md_entries_2['settl_price_type'] == 3) # 00000011
    assert(md_entries_2['md_entry_type'] == 54) # '6'
    assert(md_entries_2['md_update_action'] == 0)

def assert_row_3(row):
    assert(row['transact_time'] == 1564613588224487259)
    assert(row['match_event_indicator'] == 0) # 00001000
    assert(len(row['md_entries']) == 2)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == -4000000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['security_id'] == 10089)
    assert(md_entries_0['rpt_seq'] == 5487)
    assert(md_entries_0['trading_reference_date'] == 18108)
    assert(md_entries_0['settl_price_type'] == 3) # 00000011
    assert(md_entries_0['md_entry_type'] == 54) # '6'
    assert(md_entries_0['md_update_action'] == 0)
    md_entries_1 = row['md_entries'][1]
    assert(md_entries_1['md_entry_px_mantissa'] == 6500000000)
    assert(md_entries_1['md_entry_px_exponent'] == -9)
    assert(md_entries_1['security_id'] == 10077)
    assert(md_entries_1['rpt_seq'] == 86141)
    assert(md_entries_1['trading_reference_date'] == 18108)
    assert(md_entries_1['settl_price_type'] == 3) # 00000011
    assert(md_entries_1['md_entry_type'] == 54) # '6'
    assert(md_entries_1['md_update_action'] == 0)

def assert_row_4(row):
    assert(row['transact_time'] == 1564613728027576201)
    assert(row['match_event_indicator'] == 0) # 00001000
    assert(len(row['md_entries']) == 4)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == 5000000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['security_id'] == 164227)
    assert(md_entries_0['rpt_seq'] == 5146127)
    assert(md_entries_0['trading_reference_date'] == 18108)
    assert(md_entries_0['settl_price_type'] == 3) # 00000011
    assert(md_entries_0['md_entry_type'] == 54) # '6'
    assert(md_entries_0['md_update_action'] == 0)
    md_entries_1 = row['md_entries'][1]
    assert(md_entries_1['md_entry_px_mantissa'] == 5000000000)
    assert(md_entries_1['md_entry_px_exponent'] == -9)
    assert(md_entries_1['security_id'] == 164226)
    assert(md_entries_1['rpt_seq'] == 5748899)
    assert(md_entries_1['trading_reference_date'] == 18108)
    assert(md_entries_1['settl_price_type'] == 3) # 00000011
    assert(md_entries_1['md_entry_type'] == 54) # '6'
    assert(md_entries_1['md_update_action'] == 0)
    md_entries_2 = row['md_entries'][2]
    assert(md_entries_2['md_entry_px_mantissa'] == 3500000000)
    assert(md_entries_2['md_entry_px_exponent'] == -9)
    assert(md_entries_2['security_id'] == 164221)
    assert(md_entries_2['rpt_seq'] == 4878449)
    assert(md_entries_2['trading_reference_date'] == 18108)
    assert(md_entries_2['settl_price_type'] == 3) # 00000011
    assert(md_entries_2['md_entry_type'] == 54) # '6'
    assert(md_entries_2['md_update_action'] == 0)
    md_entries_3 = row['md_entries'][3]
    assert(md_entries_3['md_entry_px_mantissa'] == 3000000000)
    assert(md_entries_3['md_entry_px_exponent'] == -9)
    assert(md_entries_3['security_id'] == 164222)
    assert(md_entries_3['rpt_seq'] == 5042724)
    assert(md_entries_3['trading_reference_date'] == 18108)
    assert(md_entries_3['settl_price_type'] == 3) # 00000011
    assert(md_entries_3['md_entry_type'] == 54) # '6'
    assert(md_entries_3['md_update_action'] == 0)


def assert_row_5(row):
    assert(row['transact_time'] == 1564695793743908375)
    assert(row['match_event_indicator'] == 0) # 00001000
    assert(len(row['md_entries']) == 2)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == 0)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['security_id'] == 15126)
    assert(md_entries_0['rpt_seq'] == 22)
    assert(md_entries_0['trading_reference_date'] == 18109)
    assert(md_entries_0['settl_price_type'] == 2) # 00000010
    assert(md_entries_0['md_entry_type'] == 54) # '6'
    assert(md_entries_0['md_update_action'] == 0)
    md_entries_1 = row['md_entries'][1]
    assert(md_entries_1['md_entry_px_mantissa'] == 0)
    assert(md_entries_1['md_entry_px_exponent'] == -9)
    assert(md_entries_1['security_id'] == 15119)
    assert(md_entries_1['rpt_seq'] == 22)
    assert(md_entries_1['trading_reference_date'] == 18109)
    assert(md_entries_1['settl_price_type'] == 2) # 00000010
    assert(md_entries_1['md_entry_type'] == 54) # '6'
    assert(md_entries_1['md_update_action'] == 0)

def run_test(sparkSession):
    data_for_test = sample_collection_from_test_files(sparkSession, [ \
            ['/test_decoded_data/test-1-md-incremental-refresh-daily-statistics49.parquet',[79, 202, 424]], 
            ['/test_decoded_data/test-2-md-incremental-refresh-daily-statistics49.parquet', [106, 1308, 803]]])
    assert_row_0(data_for_test[0])
    assert_row_1(data_for_test[1])
    assert_row_2(data_for_test[2])
    assert_row_3(data_for_test[3])
    assert_row_4(data_for_test[4])
    assert_row_5(data_for_test[5])

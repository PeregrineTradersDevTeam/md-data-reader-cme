from test_utils import sample_collection_from_test_files

def assert_row_0(row):
    assert(row['transact_time'] == 1564704050837536827)
    assert(row['match_event_indicator'] == 8) # 00001000
    assert(len(row['md_entries']) == 2)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == 17500000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['security_id'] == 225577)
    assert(md_entries_0['rpt_seq'] == 6064109)
    assert(md_entries_0['md_entry_type'] == 78) # 'N'
    assert(md_entries_0['md_update_action'] == 0)
    md_entries_1 = row['md_entries'][1]
    assert(md_entries_1['md_entry_px_mantissa'] == 55000000000)
    assert(md_entries_1['md_entry_px_exponent'] == -9)
    assert(md_entries_1['security_id'] == 225577)
    assert(md_entries_1['rpt_seq'] == 6064110)
    assert(md_entries_1['md_entry_type'] == 79) # 'O'
    assert(md_entries_1['md_update_action'] == 0)

def assert_row_1(row):
    assert(row['transact_time'] == 1564696800038895383)
    assert(row['match_event_indicator'] == -120) # 10001000
    assert(len(row['md_entries']) == 2)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == -7500000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['security_id'] == 36164)
    assert(md_entries_0['rpt_seq'] == 4890442)
    assert(md_entries_0['md_entry_type'] == 78) # 'N'
    assert(md_entries_0['md_update_action'] == 0)
    md_entries_1 = row['md_entries'][1]
    assert(md_entries_1['md_entry_px_mantissa'] == -7000000000)
    assert(md_entries_1['md_entry_px_exponent'] == -9)
    assert(md_entries_1['security_id'] == 36164)
    assert(md_entries_1['rpt_seq'] == 4890443)
    assert(md_entries_1['md_entry_type'] == 79) # 'O'
    assert(md_entries_1['md_update_action'] == 0)

def assert_row_2(row):
    assert(row['transact_time'] == 1564696800039581955)
    assert(row['match_event_indicator'] == 8) # 00001000
    assert(len(row['md_entries']) == 2)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == -49500000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['security_id'] == 829456)
    assert(md_entries_0['rpt_seq'] == 6429559)
    assert(md_entries_0['md_entry_type'] == 78) # 'N'
    assert(md_entries_0['md_update_action'] == 0)
    md_entries_1 = row['md_entries'][1]
    assert(md_entries_1['md_entry_px_mantissa'] == -47000000000)
    assert(md_entries_1['md_entry_px_exponent'] == -9)
    assert(md_entries_1['security_id'] == 829456)
    assert(md_entries_1['rpt_seq'] == 6429560)
    assert(md_entries_1['md_entry_type'] == 79) # 'O'
    assert(md_entries_1['md_update_action'] == 0)

def assert_row_3(row):
    assert(row['transact_time'] == 1564740525932556249)
    assert(row['match_event_indicator'] == 8) # 00001000
    assert(len(row['md_entries']) == 7)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == 9852500000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['security_id'] == 870833)
    assert(md_entries_0['rpt_seq'] == 54443402)
    assert(md_entries_0['md_entry_type'] == 55) # '7'
    assert(md_entries_0['md_update_action'] == 0)
    md_entries_1 = row['md_entries'][1]
    assert(md_entries_1['md_entry_px_mantissa'] == 9851500000000)
    assert(md_entries_1['md_entry_px_exponent'] == -9)
    assert(md_entries_1['security_id'] == 843520)
    assert(md_entries_1['rpt_seq'] == 50142533)
    assert(md_entries_1['md_entry_type'] == 55) # '7'
    assert(md_entries_1['md_update_action'] == 0)
    md_entries_2 = row['md_entries'][2]
    assert(md_entries_2['md_entry_px_mantissa'] == 0)
    assert(md_entries_2['md_entry_px_exponent'] == -9)
    assert(md_entries_2['security_id'] == 10520)
    assert(md_entries_2['rpt_seq'] == 8090034)
    assert(md_entries_2['md_entry_type'] == 55) # '7'
    assert(md_entries_2['md_update_action'] == 0)
    md_entries_3 = row['md_entries'][3]
    assert(md_entries_3['md_entry_px_mantissa'] == 9831500000000)
    assert(md_entries_3['md_entry_px_exponent'] == -9)
    assert(md_entries_3['security_id'] == 841143)
    assert(md_entries_3['rpt_seq'] == 32274142)
    assert(md_entries_3['md_entry_type'] == 55) # '7'
    assert(md_entries_3['md_update_action'] == 0)
    md_entries_4 = row['md_entries'][4]
    assert(md_entries_4['md_entry_px_mantissa'] == 9806500000000)
    assert(md_entries_4['md_entry_px_exponent'] == -9)
    assert(md_entries_4['security_id'] == 894923)
    assert(md_entries_4['rpt_seq'] == 23008000)
    assert(md_entries_4['md_entry_type'] == 55) # '7'
    assert(md_entries_4['md_update_action'] == 0)
    md_entries_5 = row['md_entries'][5]
    assert(md_entries_5['md_entry_px_mantissa'] == 5500000000)
    assert(md_entries_5['md_entry_px_exponent'] == -9)
    assert(md_entries_5['security_id'] == 29960)
    assert(md_entries_5['rpt_seq'] == 7529250)
    assert(md_entries_5['md_entry_type'] == 55) # '7'
    assert(md_entries_5['md_update_action'] == 0)
    md_entries_6 = row['md_entries'][6]
    assert(md_entries_6['md_entry_px_mantissa'] == -3500000000)
    assert(md_entries_6['md_entry_px_exponent'] == -9)
    assert(md_entries_6['security_id'] == 821151)
    assert(md_entries_6['rpt_seq'] == 7703275)
    assert(md_entries_6['md_entry_type'] == 55) # '7'
    assert(md_entries_6['md_update_action'] == 0)

def assert_row_4(row):
    assert(row['transact_time'] == 1564610400771062933)
    assert(row['match_event_indicator'] == 8) # 00001000
    assert(len(row['md_entries']) == 2)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == 18500000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['security_id'] == 30412)
    assert(md_entries_0['rpt_seq'] == 214922)
    assert(md_entries_0['md_entry_type'] == 78) # 'N'
    assert(md_entries_0['md_update_action'] == 0)
    md_entries_1 = row['md_entries'][1]
    assert(md_entries_1['md_entry_px_mantissa'] == 21000000000)
    assert(md_entries_1['md_entry_px_exponent'] == -9)
    assert(md_entries_1['security_id'] == 30412)
    assert(md_entries_1['rpt_seq'] == 214923)
    assert(md_entries_1['md_entry_type'] == 79) # 'O'
    assert(md_entries_1['md_update_action'] == 0)


def assert_row_5(row):
    assert(row['transact_time'] == 1564616239068115451)
    assert(row['match_event_indicator'] == 8) # 00001000
    assert(len(row['md_entries']) == 1)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == 1500000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['security_id'] == 870247)
    assert(md_entries_0['rpt_seq'] == 1104592)
    assert(md_entries_0['md_entry_type'] == 56) # '8'
    assert(md_entries_0['md_update_action'] == 0)

def assert_row_6(row):
    assert(row['transact_time'] == 1564671395984373591)
    assert(row['match_event_indicator'] == 8) # 00001000
    assert(len(row['md_entries']) == 3)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == -2000000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['security_id'] == 4422)
    assert(md_entries_0['rpt_seq'] == 3296606)
    assert(md_entries_0['md_entry_type'] == 55) # '7'
    assert(md_entries_0['md_update_action'] == 0)
    md_entries_1 = row['md_entries'][1]
    assert(md_entries_1['md_entry_px_mantissa'] == -2000000000)
    assert(md_entries_1['md_entry_px_exponent'] == -9)
    assert(md_entries_1['security_id'] == 4422)
    assert(md_entries_1['rpt_seq'] == 3296607)
    assert(md_entries_1['md_entry_type'] == 56) # '8'
    assert(md_entries_1['md_update_action'] == 0)
    md_entries_2 = row['md_entries'][2]
    assert(md_entries_2['md_entry_px_mantissa'] == -2000000000)
    assert(md_entries_2['md_entry_px_exponent'] == -9)
    assert(md_entries_2['security_id'] == 4422)
    assert(md_entries_2['rpt_seq'] == 3296608)
    assert(md_entries_2['md_entry_type'] == 52) # '4'
    assert(md_entries_2['md_update_action'] == 0)


def run_test(sparkSession):
    data_for_test = sample_collection_from_test_files(sparkSession, [ \
            ['/test_decoded_data/test-1-md-incremental-refresh-session-statistics51.parquet',[3, 1126, 1127, 4644]], 
            ['/test_decoded_data/test-2-md-incremental-refresh-session-statistics51.parquet', [252, 1113, 5189]]])
    assert_row_0(data_for_test[0])
    assert_row_1(data_for_test[1])
    assert_row_2(data_for_test[2])
    assert_row_3(data_for_test[3])
    assert_row_4(data_for_test[4])
    assert_row_5(data_for_test[5])
    assert_row_6(data_for_test[6])

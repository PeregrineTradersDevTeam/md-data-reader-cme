def assert_row_0(row):
    assert(row['match_event_indicator'] == 4) # 00000100
    assert(row['transact_time'] == 1564704045568515145)
    assert(len(row['md_entries']) == 1)
    assert(len(row['order_id_entries']) == 1)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == 750000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['md_entry_size'] == 20)
    assert(md_entries_0['security_id'] == 896851)
    assert(md_entries_0['rpt_seq']  == 1169218)
    assert(md_entries_0['number_of_orders'] == 5)
    assert(md_entries_0['md_price_level'] == 2)
    assert(md_entries_0['md_update_action'] == 1)
    assert(md_entries_0['md_entry_type'] == 48)
    order_id_entries_0 = row['order_id_entries'][0]
    assert(order_id_entries_0['order_id'] == 826957745673)
    assert(order_id_entries_0['md_order_priority'] == 27579355482)
    assert(order_id_entries_0['md_display_qty'] == 1)
    assert(order_id_entries_0['reference_id'] == 1)
    assert(order_id_entries_0['order_update_action'] == 2)

def assert_row_1(row):
    assert(row['match_event_indicator'] == -128) # 10000000
    assert(row['transact_time'] == 1564704056576311565)
    assert(len(row['md_entries']) == 0)
    assert(len(row['order_id_entries']) == 0)
def assert_row_2(row):
    assert(row['match_event_indicator'] == 4) # 00000100
    assert(row['transact_time'] == 1564704057713180937)
    assert(len(row['md_entries']) == 1)
    assert(len(row['order_id_entries']) == 1)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == 9822000000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['md_entry_size'] == 22)
    assert(md_entries_0['security_id'] == 21436)
    assert(md_entries_0['rpt_seq']  == 5603353)
    assert(md_entries_0['number_of_orders'] == 2)
    assert(md_entries_0['md_price_level'] == 1)
    assert(md_entries_0['md_update_action'] == 1)
    assert(md_entries_0['md_entry_type'] == 49)
    order_id_entries_0 = row['order_id_entries'][0]
    assert(order_id_entries_0['order_id'] == 826957750228)
    assert(order_id_entries_0['md_order_priority'] == 27579379610)
    assert(order_id_entries_0['md_display_qty'] == 12)
    assert(order_id_entries_0['reference_id'] == 1)
    assert(order_id_entries_0['order_update_action'] == 0)

def assert_row_3(row):
    assert(row['match_event_indicator'] == -112) # 10010000
    assert(row['transact_time'] == 1564704060192125693)
    assert(len(row['md_entries']) == 2)
    assert(len(row['order_id_entries']) == 0)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == -19000000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['md_entry_size'] == 4092)
    assert(md_entries_0['security_id'] == 165888)
    assert(md_entries_0['rpt_seq']  == 5016582)
    assert(md_entries_0['number_of_orders'] == None)
    assert(md_entries_0['md_price_level'] == 1)
    assert(md_entries_0['md_update_action'] == 1)
    assert(md_entries_0['md_entry_type'] == 69)
    md_entries_1 = row['md_entries'][1]
    assert(md_entries_1['md_entry_px_mantissa'] == -19500000000)
    assert(md_entries_1['md_entry_px_exponent'] == -9)
    assert(md_entries_1['md_entry_size'] == 779)
    assert(md_entries_1['security_id'] == 165888)
    assert(md_entries_1['rpt_seq']  == 5016583)
    assert(md_entries_1['number_of_orders'] == None)
    assert(md_entries_1['md_price_level'] == 2)
    assert(md_entries_1['md_update_action'] == 1)
    assert(md_entries_1['md_entry_type'] == 69)

def assert_row_4(row):
    assert(row['match_event_indicator'] == -112) # 10010000
    assert(row['transact_time'] == 1564610433070678577)
    assert(len(row['md_entries']) == 1)
    assert(len(row['order_id_entries']) == 0)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == 11000000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['md_entry_size'] == 387)
    assert(md_entries_0['security_id'] == 22497)
    assert(md_entries_0['rpt_seq']  == 3391886)
    assert(md_entries_0['number_of_orders'] == None)
    assert(md_entries_0['md_price_level'] == 2)
    assert(md_entries_0['md_update_action'] == 1)
    assert(md_entries_0['md_entry_type'] == 69)

def assert_row_5(row):
    assert(row['match_event_indicator'] == -112) # 10010000
    assert(row['transact_time'] == 1564610597337395147)
    assert(len(row['md_entries']) == 6)
    assert(len(row['order_id_entries']) == 0)

    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == -14500000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['md_entry_size'] == 256)
    assert(md_entries_0['security_id'] == 225528)
    assert(md_entries_0['rpt_seq'] == 4995087)
    assert(md_entries_0['number_of_orders'] == None)
    assert(md_entries_0['md_price_level'] == 2)
    assert(md_entries_0['md_update_action'] == 1)
    assert(md_entries_0['md_entry_type'] == 70)

    md_entries_1 = row['md_entries'][1]
    assert(md_entries_1['md_entry_px_mantissa'] == 9000000000)
    assert(md_entries_1['md_entry_px_exponent'] == -9)
    assert(md_entries_1['md_entry_size'] == 256)
    assert(md_entries_1['security_id'] == 503405)
    assert(md_entries_1['rpt_seq'] == 5280046)
    assert(md_entries_1['number_of_orders'] == None)
    assert(md_entries_1['md_price_level'] == 2)
    assert(md_entries_1['md_update_action'] == 1)
    assert(md_entries_1['md_entry_type'] == 70)

    md_entries_2 = row['md_entries'][2]
    assert(md_entries_2['md_entry_px_mantissa'] == 9818500000000)
    assert(md_entries_2['md_entry_px_exponent'] == -9)
    assert(md_entries_2['md_entry_size'] == 1655)
    assert(md_entries_2['security_id'] == 17606)
    assert(md_entries_2['rpt_seq'] == 31128823)
    assert(md_entries_2['number_of_orders'] == None)
    assert(md_entries_2['md_price_level'] == 2)
    assert(md_entries_2['md_update_action'] == 1)
    assert(md_entries_2['md_entry_type'] == 69)

    md_entries_3 = row['md_entries'][3]
    assert(md_entries_3['md_entry_px_mantissa'] == -46000000000)
    assert(md_entries_3['md_entry_px_exponent'] == -9)
    assert(md_entries_3['md_entry_size'] == 256)
    assert(md_entries_3['security_id'] == 17707)
    assert(md_entries_3['rpt_seq'] == 4903272)
    assert(md_entries_3['number_of_orders'] == None)
    assert(md_entries_3['md_price_level'] == 2)
    assert(md_entries_3['md_update_action'] == 1)
    assert(md_entries_3['md_entry_type'] == 70)

    md_entries_4 = row['md_entries'][4]
    assert(md_entries_4['md_entry_px_mantissa'] == 3500000000)
    assert(md_entries_4['md_entry_px_exponent'] == -9)
    assert(md_entries_4['md_entry_size'] == 256)
    assert(md_entries_4['security_id'] == 11069)
    assert(md_entries_4['rpt_seq'] == 5243780)
    assert(md_entries_4['number_of_orders'] == None)
    assert(md_entries_4['md_price_level'] == 2)
    assert(md_entries_4['md_update_action'] == 1)
    assert(md_entries_4['md_entry_type'] == 70)

    md_entries_5 = row['md_entries'][5]
    assert(md_entries_5['md_entry_px_mantissa'] == 3000000000)
    assert(md_entries_5['md_entry_px_exponent'] == -9)
    assert(md_entries_5['md_entry_size'] == 1511)
    assert(md_entries_5['security_id'] == 64887)
    assert(md_entries_5['rpt_seq'] == 4080419)
    assert(md_entries_5['number_of_orders'] == None)
    assert(md_entries_5['md_price_level'] == 2)
    assert(md_entries_5['md_update_action'] == 1)
    assert(md_entries_5['md_entry_type'] == 69)


def assert_row_6(row):
    assert(row['match_event_indicator'] == -112) # 10010000
    assert(row['transact_time'] == 1564610599557911449)
    assert(len(row['md_entries']) == 4)
    assert(len(row['order_id_entries']) == 0)

    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == 9814500000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['md_entry_size'] == 1459)
    assert(md_entries_0['security_id'] == 427)
    assert(md_entries_0['rpt_seq'] == 22584194)
    assert(md_entries_0['number_of_orders'] == None)
    assert(md_entries_0['md_price_level'] == 2)
    assert(md_entries_0['md_update_action'] == 1)
    assert(md_entries_0['md_entry_type'] == 70)

    md_entries_1 = row['md_entries'][1]
    assert(md_entries_1['md_entry_px_mantissa'] == 23000000000)
    assert(md_entries_1['md_entry_px_exponent'] == -9)
    assert(md_entries_1['md_entry_size'] == 208)
    assert(md_entries_1['security_id'] == 225582)
    assert(md_entries_1['rpt_seq'] == 3575681)
    assert(md_entries_1['number_of_orders'] == None)
    assert(md_entries_1['md_price_level'] == 2)
    assert(md_entries_1['md_update_action'] == 1)
    assert(md_entries_1['md_entry_type'] == 69)

    md_entries_2 = row['md_entries'][2]
    assert(md_entries_2['md_entry_px_mantissa'] == 9808500000000)
    assert(md_entries_2['md_entry_px_exponent'] == -9)
    assert(md_entries_2['md_entry_size'] == 551)
    assert(md_entries_2['security_id'] == 21436)
    assert(md_entries_2['rpt_seq'] == 4277776)
    assert(md_entries_2['number_of_orders'] == None)
    assert(md_entries_2['md_price_level'] == 2)
    assert(md_entries_2['md_update_action'] == 1)
    assert(md_entries_2['md_entry_type'] == 70)

    md_entries_3 = row['md_entries'][3]
    assert(md_entries_3['md_entry_px_mantissa'] == 9817500000000)
    assert(md_entries_3['md_entry_px_exponent'] == -9)
    assert(md_entries_3['md_entry_size'] == 1967)
    assert(md_entries_3['security_id'] == 193097)
    assert(md_entries_3['rpt_seq'] == 26314001)
    assert(md_entries_3['number_of_orders'] == None)
    assert(md_entries_3['md_price_level'] == 2)
    assert(md_entries_3['md_update_action'] == 1)
    assert(md_entries_3['md_entry_type'] == 70)

def assert_row_7(row):
    assert(row['match_event_indicator'] == -112) # 10010000
    assert(row['transact_time'] == 1564610616921365887)
    assert(len(row['md_entries']) == 4)
    assert(len(row['order_id_entries']) == 0)

    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['md_entry_px_mantissa'] == 2000000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['md_entry_size'] == 1)
    assert(md_entries_0['security_id'] == 887801)
    assert(md_entries_0['rpt_seq'] == 2897354)
    assert(md_entries_0['number_of_orders'] == None)
    assert(md_entries_0['md_price_level'] == 1)
    assert(md_entries_0['md_update_action'] == 2)
    assert(md_entries_0['md_entry_type'] == 69)

    md_entries_1 = row['md_entries'][1]
    assert(md_entries_1['md_entry_px_mantissa'] == 1750000000)
    assert(md_entries_1['md_entry_px_exponent'] == -9)
    assert(md_entries_1['md_entry_size'] == 2)
    assert(md_entries_1['security_id'] == 887801)
    assert(md_entries_1['rpt_seq'] == 2897355)
    assert(md_entries_1['number_of_orders'] == None)
    assert(md_entries_1['md_price_level'] == 1)
    assert(md_entries_1['md_update_action'] == 1)
    assert(md_entries_1['md_entry_type'] == 69)

    md_entries_2 = row['md_entries'][2]
    assert(md_entries_2['md_entry_px_mantissa'] == 1500000000)
    assert(md_entries_2['md_entry_px_exponent'] == -9)
    assert(md_entries_2['md_entry_size'] == 80)
    assert(md_entries_2['security_id'] == 887801)
    assert(md_entries_2['rpt_seq'] == 2897356)
    assert(md_entries_2['number_of_orders'] == None)
    assert(md_entries_2['md_price_level'] == 2)
    assert(md_entries_2['md_update_action'] == 0)
    assert(md_entries_2['md_entry_type'] == 69)

    md_entries_3 = row['md_entries'][3]
    assert(md_entries_3['md_entry_px_mantissa'] == 1500000000)
    assert(md_entries_3['md_entry_px_exponent'] == -9)
    assert(md_entries_3['md_entry_size'] == 18)
    assert(md_entries_3['security_id'] == 31147)
    assert(md_entries_3['rpt_seq'] == 2801939)
    assert(md_entries_3['number_of_orders'] == None)
    assert(md_entries_3['md_price_level'] == 2)
    assert(md_entries_3['md_update_action'] == 1)
    assert(md_entries_3['md_entry_type'] == 70)

def run_test(sparkSession):
    dataset1 = sparkSession.read.parquet('/test_decoded_data/test-1-md-incremental-refresh-book46.parquet').head(100000)
    dataset2 = sparkSession.read.parquet('/test_decoded_data/test-2-md-incremental-refresh-book46.parquet').head(100000)
    data_for_test_1 = [dataset1[i] for i in [44081, 65929, 67993, 73268]]
    data_for_test_2 = [dataset2[i] for i in [49236, 87140, 87804, 98363]]

    data_for_test = data_for_test_1 + data_for_test_2

    assert_row_1(data_for_test[1])
    assert_row_2(data_for_test[2])
    assert_row_3(data_for_test[3])
    assert_row_4(data_for_test[4])
    assert_row_5(data_for_test[5])
    assert_row_6(data_for_test[6])
    assert_row_7(data_for_test[7])

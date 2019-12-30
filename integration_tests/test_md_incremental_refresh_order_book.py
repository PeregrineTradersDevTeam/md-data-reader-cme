from test_utils import sample_collection_from_test_files

def assert_row_0(row):
    assert(row['match_event_indicator'] == -124) # 10000100
    assert(row['transact_time'] == 1564756221104346483)
    assert(len(row['md_entries']) == 1)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['order_id'] == 826964552740)
    assert(md_entries_0['md_order_priority'] == 27608537280)
    assert(md_entries_0['md_entry_px_mantissa'] == 13000000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['md_display_qty'] == 121)
    assert(md_entries_0['security_id'] == 15509)
    assert(md_entries_0['md_update_action'] == 2)
    assert(md_entries_0['md_entry_type'] == 49) # '1'

def assert_row_1(row):
    assert(row['match_event_indicator'] == -124) # 10000100
    assert(row['transact_time'] == 1564760416405843779)
    assert(len(row['md_entries']) == 1)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['order_id'] == 826966027612)
    assert(md_entries_0['md_order_priority'] == 27614840752)
    assert(md_entries_0['md_entry_px_mantissa'] == 3500000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['md_display_qty'] == 30)
    assert(md_entries_0['security_id'] == 2270)
    assert(md_entries_0['md_update_action'] == 0)
    assert(md_entries_0['md_entry_type'] == 49) # '1'
def assert_row_2(row):
    assert(row['match_event_indicator'] == 4) # 00000100
    assert(row['transact_time'] == 1564778118481077843)
    assert(len(row['md_entries']) == 1)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['order_id'] == 826970103496)
    assert(md_entries_0['md_order_priority'] == 27634098337)
    assert(md_entries_0['md_entry_px_mantissa'] == 9834500000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['md_display_qty'] == 40)
    assert(md_entries_0['security_id'] == 841143)
    assert(md_entries_0['md_update_action'] == 1)
    assert(md_entries_0['md_entry_type'] == 49) # '1'
def assert_row_3(row):
    assert(row['match_event_indicator'] == 0) # 00000000
    assert(row['transact_time'] == 1564779600084651989)
    assert(len(row['md_entries']) == 34)

    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['order_id'] == 826969865970)
    assert(md_entries_0['md_order_priority'] == 27632268795)
    assert(md_entries_0['md_entry_px_mantissa'] == 9845500000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['md_display_qty'] == 12)
    assert(md_entries_0['security_id'] == 863055)
    assert(md_entries_0['md_update_action'] == 2)
    assert(md_entries_0['md_entry_type'] == 49) # '1'

    md_entries_1 = row['md_entries'][1]
    assert(md_entries_1['order_id'] == 826969911822)
    assert(md_entries_1['md_order_priority'] == 27632444966)
    assert(md_entries_1['md_entry_px_mantissa'] == 9844500000000)
    assert(md_entries_1['md_entry_px_exponent'] == -9)
    assert(md_entries_1['md_display_qty'] == 10)
    assert(md_entries_1['security_id'] == 863055)
    assert(md_entries_1['md_update_action'] == 2)
    assert(md_entries_1['md_entry_type'] == 49) # '1'

    md_entries_2 = row['md_entries'][2]
    assert(md_entries_2['order_id'] == 826969915135)
    assert(md_entries_2['md_order_priority'] == 27634965294)
    assert(md_entries_2['md_entry_px_mantissa'] == 9841500000000)
    assert(md_entries_2['md_entry_px_exponent'] == -9)
    assert(md_entries_2['md_display_qty'] == 10)
    assert(md_entries_2['security_id'] == 863055)
    assert(md_entries_2['md_update_action'] == 2)
    assert(md_entries_2['md_entry_type'] == 49) # '1'

    md_entries_3 = row['md_entries'][3]
    assert(md_entries_3['order_id'] == 826969920523)
    assert(md_entries_3['md_order_priority'] == 27634326156)
    assert(md_entries_3['md_entry_px_mantissa'] == 9847000000000)
    assert(md_entries_3['md_entry_px_exponent'] == -9)
    assert(md_entries_3['md_display_qty'] == 40)
    assert(md_entries_3['security_id'] == 863055)
    assert(md_entries_3['md_update_action'] == 2)
    assert(md_entries_3['md_entry_type'] == 49) # '1'

    md_entries_4 = row['md_entries'][4]
    assert(md_entries_4['order_id'] == 826969920532)
    assert(md_entries_4['md_order_priority'] == 27634326160)
    assert(md_entries_4['md_entry_px_mantissa'] == 9846000000000)
    assert(md_entries_4['md_entry_px_exponent'] == -9)
    assert(md_entries_4['md_display_qty'] == 10)
    assert(md_entries_4['security_id'] == 863055)
    assert(md_entries_4['md_update_action'] == 2)
    assert(md_entries_4['md_entry_type'] == 49) # '1'

    md_entries_5 = row['md_entries'][5]
    assert(md_entries_5['order_id'] == 826969962160)
    assert(md_entries_5['md_order_priority'] == 27632616869)
    assert(md_entries_5['md_entry_px_mantissa'] == 9845500000000)
    assert(md_entries_5['md_entry_px_exponent'] == -9)
    assert(md_entries_5['md_display_qty'] == 20)
    assert(md_entries_5['security_id'] == 863055)
    assert(md_entries_5['md_update_action'] == 2)
    assert(md_entries_5['md_entry_type'] == 49) # '1'

    md_entries_6 = row['md_entries'][6]
    assert(md_entries_6['order_id'] == 826969962836)
    assert(md_entries_6['md_order_priority'] == 27632619218)
    assert(md_entries_6['md_entry_px_mantissa'] == 9844500000000)
    assert(md_entries_6['md_entry_px_exponent'] == -9)
    assert(md_entries_6['md_display_qty'] == 20)
    assert(md_entries_6['security_id'] == 863055)
    assert(md_entries_6['md_update_action'] == 2)
    assert(md_entries_6['md_entry_type'] == 49) # '1'

    md_entries_7 = row['md_entries'][7]
    assert(md_entries_7['order_id'] == 826970344581)
    assert(md_entries_7['md_order_priority'] == 27634337652)
    assert(md_entries_7['md_entry_px_mantissa'] == 9845500000000)
    assert(md_entries_7['md_entry_px_exponent'] == -9)
    assert(md_entries_7['md_display_qty'] == 12)
    assert(md_entries_7['security_id'] == 863055)
    assert(md_entries_7['md_update_action'] == 2)
    assert(md_entries_7['md_entry_type'] == 49) # '1'

    md_entries_8 = row['md_entries'][8]
    assert(md_entries_8['order_id'] == 826970371868)
    assert(md_entries_8['md_order_priority'] == 27634443432)
    assert(md_entries_8['md_entry_px_mantissa'] == 9845000000000)
    assert(md_entries_8['md_entry_px_exponent'] == -9)
    assert(md_entries_8['md_display_qty'] == 10)
    assert(md_entries_8['security_id'] == 863055)
    assert(md_entries_8['md_update_action'] == 2)
    assert(md_entries_8['md_entry_type'] == 49) # '1'

    md_entries_9 = row['md_entries'][9]
    assert(md_entries_9['order_id'] == 826970410345)
    assert(md_entries_9['md_order_priority'] == 27634592609)
    assert(md_entries_9['md_entry_px_mantissa'] == 9846000000000)
    assert(md_entries_9['md_entry_px_exponent'] == -9)
    assert(md_entries_9['md_display_qty'] == 20)
    assert(md_entries_9['security_id'] == 863055)
    assert(md_entries_9['md_update_action'] == 2)
    assert(md_entries_9['md_entry_type'] == 49) # '1'

    md_entries_10 = row['md_entries'][10]
    assert(md_entries_10['order_id'] == 826970428258)
    assert(md_entries_10['md_order_priority'] == 27634965363)
    assert(md_entries_10['md_entry_px_mantissa'] == 9841500000000)
    assert(md_entries_10['md_entry_px_exponent'] == -9)
    assert(md_entries_10['md_display_qty'] == 20)
    assert(md_entries_10['security_id'] == 863055)
    assert(md_entries_10['md_update_action'] == 2)
    assert(md_entries_10['md_entry_type'] == 49) # '1'

    md_entries_11 = row['md_entries'][11]
    assert(md_entries_11['order_id'] == 826970445099)
    assert(md_entries_11['md_order_priority'] == 27634970675)
    assert(md_entries_11['md_entry_px_mantissa'] == 9841500000000)
    assert(md_entries_11['md_entry_px_exponent'] == -9)
    assert(md_entries_11['md_display_qty'] == 10)
    assert(md_entries_11['security_id'] == 863055)
    assert(md_entries_11['md_update_action'] == 2)
    assert(md_entries_11['md_entry_type'] == 49) # '1'

    md_entries_12 = row['md_entries'][12]
    assert(md_entries_12['order_id'] == 826970445142)
    assert(md_entries_12['md_order_priority'] == 27634952236)
    assert(md_entries_12['md_entry_px_mantissa'] == 9841500000000)
    assert(md_entries_12['md_entry_px_exponent'] == -9)
    assert(md_entries_12['md_display_qty'] == 12)
    assert(md_entries_12['security_id'] == 863055)
    assert(md_entries_12['md_update_action'] == 2)
    assert(md_entries_12['md_entry_type'] == 49) # '1'

    md_entries_13 = row['md_entries'][13]
    assert(md_entries_13['order_id'] == 826970445146)
    assert(md_entries_13['md_order_priority'] == 27634756051)
    assert(md_entries_13['md_entry_px_mantissa'] == 9841500000000)
    assert(md_entries_13['md_entry_px_exponent'] == -9)
    assert(md_entries_13['md_display_qty'] == 12)
    assert(md_entries_13['security_id'] == 863055)
    assert(md_entries_13['md_update_action'] == 2)
    assert(md_entries_13['md_entry_type'] == 49) # '1'

    md_entries_14 = row['md_entries'][14]
    assert(md_entries_14['order_id'] == 826970445148)
    assert(md_entries_14['md_order_priority'] == 27634751439)
    assert(md_entries_14['md_entry_px_mantissa'] == 9841500000000)
    assert(md_entries_14['md_entry_px_exponent'] == -9)
    assert(md_entries_14['md_display_qty'] == 8)
    assert(md_entries_14['security_id'] == 863055)
    assert(md_entries_14['md_update_action'] == 2)
    assert(md_entries_14['md_entry_type'] == 49) # '1'

    md_entries_15 = row['md_entries'][15]
    assert(md_entries_15['order_id'] == 826970445154)
    assert(md_entries_15['md_order_priority'] == 27635072955)
    assert(md_entries_15['md_entry_px_mantissa'] == 9842000000000)
    assert(md_entries_15['md_entry_px_exponent'] == -9)
    assert(md_entries_15['md_display_qty'] == 93)
    assert(md_entries_15['security_id'] == 863055)
    assert(md_entries_15['md_update_action'] == 2)
    assert(md_entries_15['md_entry_type'] == 49) # '1'

    md_entries_16 = row['md_entries'][16]
    assert(md_entries_16['order_id'] == 826970445419)
    assert(md_entries_16['md_order_priority'] == 27634965295)
    assert(md_entries_16['md_entry_px_mantissa'] == 9841500000000)
    assert(md_entries_16['md_entry_px_exponent'] == -9)
    assert(md_entries_16['md_display_qty'] == 20)
    assert(md_entries_16['security_id'] == 863055)
    assert(md_entries_16['md_update_action'] == 2)
    assert(md_entries_16['md_entry_type'] == 49) # '1'

    md_entries_17 = row['md_entries'][17]
    assert(md_entries_17['order_id'] == 826970459042)
    assert(md_entries_17['md_order_priority'] == 27634787110)
    assert(md_entries_17['md_entry_px_mantissa'] == 9841500000000)
    assert(md_entries_17['md_entry_px_exponent'] == -9)
    assert(md_entries_17['md_display_qty'] == 11)
    assert(md_entries_17['security_id'] == 863055)
    assert(md_entries_17['md_update_action'] == 2)
    assert(md_entries_17['md_entry_type'] == 49) # '1'

    md_entries_18 = row['md_entries'][18]
    assert(md_entries_18['order_id'] == 826970500751)
    assert(md_entries_18['md_order_priority'] == 27635056001)
    assert(md_entries_18['md_entry_px_mantissa'] == 9841500000000)
    assert(md_entries_18['md_entry_px_exponent'] == -9)
    assert(md_entries_18['md_display_qty'] == 23)
    assert(md_entries_18['security_id'] == 863055)
    assert(md_entries_18['md_update_action'] == 2)
    assert(md_entries_18['md_entry_type'] == 49) # '1'

    md_entries_19 = row['md_entries'][19]
    assert(md_entries_19['order_id'] == 826970530458)
    assert(md_entries_19['md_order_priority'] == 27635057454)
    assert(md_entries_19['md_entry_px_mantissa'] == 9841500000000)
    assert(md_entries_19['md_entry_px_exponent'] == -9)
    assert(md_entries_19['md_display_qty'] == 1)
    assert(md_entries_19['security_id'] == 863055)
    assert(md_entries_19['md_update_action'] == 2)
    assert(md_entries_19['md_entry_type'] == 49) # '1'

    md_entries_20 = row['md_entries'][20]
    assert(md_entries_20['order_id'] == 826970530501)
    assert(md_entries_20['md_order_priority'] == 27635057631)
    assert(md_entries_20['md_entry_px_mantissa'] == 9846000000000)
    assert(md_entries_20['md_entry_px_exponent'] == -9)
    assert(md_entries_20['md_display_qty'] == 12)
    assert(md_entries_20['security_id'] == 863055)
    assert(md_entries_20['md_update_action'] == 2)
    assert(md_entries_20['md_entry_type'] == 49) # '1'

    md_entries_21 = row['md_entries'][21]
    assert(md_entries_21['order_id'] == 826970530814)
    assert(md_entries_21['md_order_priority'] == 27635059541)
    assert(md_entries_21['md_entry_px_mantissa'] == 9841500000000)
    assert(md_entries_21['md_entry_px_exponent'] == -9)
    assert(md_entries_21['md_display_qty'] == 95)
    assert(md_entries_21['security_id'] == 863055)
    assert(md_entries_21['md_update_action'] == 2)
    assert(md_entries_21['md_entry_type'] == 49) # '1'

    md_entries_22 = row['md_entries'][22]
    assert(md_entries_22['order_id'] == 826970531151)
    assert(md_entries_22['md_order_priority'] == 27635073294)
    assert(md_entries_22['md_entry_px_mantissa'] == 9841500000000)
    assert(md_entries_22['md_entry_px_exponent'] == -9)
    assert(md_entries_22['md_display_qty'] == 240)
    assert(md_entries_22['security_id'] == 863055)
    assert(md_entries_22['md_update_action'] == 2)
    assert(md_entries_22['md_entry_type'] == 49) # '1'

    md_entries_23 = row['md_entries'][23]
    assert(md_entries_23['order_id'] == 826970531275)
    assert(md_entries_23['md_order_priority'] == 27635061180)
    assert(md_entries_23['md_entry_px_mantissa'] == 9841500000000)
    assert(md_entries_23['md_entry_px_exponent'] == -9)
    assert(md_entries_23['md_display_qty'] == 4)
    assert(md_entries_23['security_id'] == 863055)
    assert(md_entries_23['md_update_action'] == 2)
    assert(md_entries_23['md_entry_type'] == 49) # '1'

    md_entries_24 = row['md_entries'][24]
    assert(md_entries_24['order_id'] == 826970531291)
    assert(md_entries_24['md_order_priority'] == 27635061224)
    assert(md_entries_24['md_entry_px_mantissa'] == 9845000000000)
    assert(md_entries_24['md_entry_px_exponent'] == -9)
    assert(md_entries_24['md_display_qty'] == 20)
    assert(md_entries_24['security_id'] == 863055)
    assert(md_entries_24['md_update_action'] == 2)
    assert(md_entries_24['md_entry_type'] == 49) # '1'

    md_entries_25 = row['md_entries'][25]
    assert(md_entries_25['order_id'] == 826970531292)
    assert(md_entries_25['md_order_priority'] == 27635061225)
    assert(md_entries_25['md_entry_px_mantissa'] == 9846000000000)
    assert(md_entries_25['md_entry_px_exponent'] == -9)
    assert(md_entries_25['md_display_qty'] == 12)
    assert(md_entries_25['security_id'] == 863055)
    assert(md_entries_25['md_update_action'] == 2)
    assert(md_entries_25['md_entry_type'] == 49) # '1'

    md_entries_26 = row['md_entries'][26]
    assert(md_entries_26['order_id'] == 826970531297)
    assert(md_entries_26['md_order_priority'] == 27635061230)
    assert(md_entries_26['md_entry_px_mantissa'] == 9846000000000)
    assert(md_entries_26['md_entry_px_exponent'] == -9)
    assert(md_entries_26['md_display_qty'] == 12)
    assert(md_entries_26['security_id'] == 863055)
    assert(md_entries_26['md_update_action'] == 2)
    assert(md_entries_26['md_entry_type'] == 49) # '1'

    md_entries_27 = row['md_entries'][27]
    assert(md_entries_27['order_id'] == 826970531910)
    assert(md_entries_27['md_order_priority'] == 27635063960)
    assert(md_entries_27['md_entry_px_mantissa'] == 9846000000000)
    assert(md_entries_27['md_entry_px_exponent'] == -9)
    assert(md_entries_27['md_display_qty'] == 12)
    assert(md_entries_27['security_id'] == 863055)
    assert(md_entries_27['md_update_action'] == 2)
    assert(md_entries_27['md_entry_type'] == 49) # '1'

    md_entries_28 = row['md_entries'][28]
    assert(md_entries_28['order_id'] == 826970532022)
    assert(md_entries_28['md_order_priority'] == 27635073218)
    assert(md_entries_28['md_entry_px_mantissa'] == 9847500000000)
    assert(md_entries_28['md_entry_px_exponent'] == -9)
    assert(md_entries_28['md_display_qty'] == 40)
    assert(md_entries_28['security_id'] == 863055)
    assert(md_entries_28['md_update_action'] == 2)
    assert(md_entries_28['md_entry_type'] == 49) # '1'

    md_entries_29 = row['md_entries'][29]
    assert(md_entries_29['order_id'] == 826970533461)
    assert(md_entries_29['md_order_priority'] == 27635073261)
    assert(md_entries_29['md_entry_px_mantissa'] == 9841500000000)
    assert(md_entries_29['md_entry_px_exponent'] == -9)
    assert(md_entries_29['md_display_qty'] == 233)
    assert(md_entries_29['security_id'] == 863055)
    assert(md_entries_29['md_update_action'] == 2)
    assert(md_entries_29['md_entry_type'] == 49) # '1'

    md_entries_30 = row['md_entries'][30]
    assert(md_entries_30['order_id'] == 826970226611)
    assert(md_entries_30['md_order_priority'] == 27635058338)
    assert(md_entries_30['md_entry_px_mantissa'] == -14500000000)
    assert(md_entries_30['md_entry_px_exponent'] == -9)
    assert(md_entries_30['md_display_qty'] == 225)
    assert(md_entries_30['security_id'] == 845093)
    assert(md_entries_30['md_update_action'] == 2)
    assert(md_entries_30['md_entry_type'] == 48) # '0'

    md_entries_31 = row['md_entries'][31]
    assert(md_entries_31['order_id'] == 826970382584)
    assert(md_entries_31['md_order_priority'] == 27635072357)
    assert(md_entries_31['md_entry_px_mantissa'] == -14000000000)
    assert(md_entries_31['md_entry_px_exponent'] == -9)
    assert(md_entries_31['md_display_qty'] == 74)
    assert(md_entries_31['security_id'] == 845093)
    assert(md_entries_31['md_update_action'] == 2)
    assert(md_entries_31['md_entry_type'] == 48) # '1'

    md_entries_32 = row['md_entries'][32]
    assert(md_entries_32['order_id'] == 826970533245)
    assert(md_entries_32['md_order_priority'] == 27635072286)
    assert(md_entries_32['md_entry_px_mantissa'] == -14000000000)
    assert(md_entries_32['md_entry_px_exponent'] == -9)
    assert(md_entries_32['md_display_qty'] == 100)
    assert(md_entries_32['security_id'] == 845093)
    assert(md_entries_32['md_update_action'] == 2)
    assert(md_entries_32['md_entry_type'] == 48) # '0'

    md_entries_33 = row['md_entries'][33]
    assert(md_entries_33['order_id'] == 826970226610)
    assert(md_entries_33['md_order_priority'] == 27635042683)
    assert(md_entries_33['md_entry_px_mantissa'] == -13000000000)
    assert(md_entries_33['md_entry_px_exponent'] == -9)
    assert(md_entries_33['md_display_qty'] == 225)
    assert(md_entries_33['security_id'] == 845093)
    assert(md_entries_33['md_update_action'] == 2)
    assert(md_entries_33['md_entry_type'] == 49) # '1'

def assert_row_4(row):
    assert(row['match_event_indicator'] == 4) # 00000100
    assert(row['transact_time'] == 1564662230945964269)
    assert(len(row['md_entries']) == 1)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['order_id'] == 826945127614)
    assert(md_entries_0['md_order_priority'] == 27536613717)
    assert(md_entries_0['md_entry_px_mantissa'] == 9824500000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['md_display_qty'] == 11)
    assert(md_entries_0['security_id'] == 39199)
    assert(md_entries_0['md_update_action'] == 1)
    assert(md_entries_0['md_entry_type'] == 48) # '0'
def assert_row_5(row):
    assert(row['match_event_indicator'] == 4) # 00000100
    assert(row['transact_time'] == 1564668192005143173)
    assert(len(row['md_entries']) == 1)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['order_id'] == 826948805973)
    assert(md_entries_0['md_order_priority'] == 27543416859)
    assert(md_entries_0['md_entry_px_mantissa'] == 500000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['md_display_qty'] == 100)
    assert(md_entries_0['security_id'] == 870432)
    assert(md_entries_0['md_update_action'] == 1)
    assert(md_entries_0['md_entry_type'] == 49) # '1'
def assert_row_6(row):
    assert(row['match_event_indicator'] == -124) # 10000100
    assert(row['transact_time'] == 1564682365939037129)
    assert(len(row['md_entries']) == 1)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['order_id'] == 826953823407)
    assert(md_entries_0['md_order_priority'] == 27564288659)
    assert(md_entries_0['md_entry_px_mantissa'] == 0)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['md_display_qty'] == 307)
    assert(md_entries_0['security_id'] == 503401)
    assert(md_entries_0['md_update_action'] == 0)
    assert(md_entries_0['md_entry_type'] == 48) # '0'
def assert_row_7(row):
    assert(row['match_event_indicator'] == 0) # 00000000
    assert(row['transact_time'] == 1564693200084114043)
    assert(len(row['md_entries']) == 34)
    md_entries_0 = row['md_entries'][0]
    assert(md_entries_0['order_id'] == 826956586312)
    assert(md_entries_0['md_order_priority'] == 27578354285)
    assert(md_entries_0['md_entry_px_mantissa'] == 9855000000000)
    assert(md_entries_0['md_entry_px_exponent'] == -9)
    assert(md_entries_0['md_display_qty'] == 9)
    assert(md_entries_0['security_id'] == 43448)
    assert(md_entries_0['md_update_action'] == 2)
    assert(md_entries_0['md_entry_type'] == 49) # '1'

    md_entries_1 = row['md_entries'][1]
    assert(md_entries_1['order_id'] == 826956640983)
    assert(md_entries_1['md_order_priority'] == 27577423202)
    assert(md_entries_1['md_entry_px_mantissa'] == 9854500000000)
    assert(md_entries_1['md_entry_px_exponent'] == -9)
    assert(md_entries_1['md_display_qty'] == 11)
    assert(md_entries_1['security_id'] == 43448)
    assert(md_entries_1['md_update_action'] == 2)
    assert(md_entries_1['md_entry_type'] == 49) # '1'

    md_entries_2 = row['md_entries'][2]
    assert(md_entries_2['order_id'] == 826956655164)
    assert(md_entries_2['md_order_priority'] == 27576789819)
    assert(md_entries_2['md_entry_px_mantissa'] == 9853000000000)
    assert(md_entries_2['md_entry_px_exponent'] == -9)
    assert(md_entries_2['md_display_qty'] == 20)
    assert(md_entries_2['security_id'] == 43448)
    assert(md_entries_2['md_update_action'] == 2)
    assert(md_entries_2['md_entry_type'] == 49) # '1'

    md_entries_3 = row['md_entries'][3]
    assert(md_entries_3['order_id'] == 826956721637)
    assert(md_entries_3['md_order_priority'] == 27578173981)
    assert(md_entries_3['md_entry_px_mantissa'] == 9855500000000)
    assert(md_entries_3['md_entry_px_exponent'] == -9)
    assert(md_entries_3['md_display_qty'] == 10)
    assert(md_entries_3['security_id'] == 43448)
    assert(md_entries_3['md_update_action'] == 2)
    assert(md_entries_3['md_entry_type'] == 49) # '1'

    md_entries_4 = row['md_entries'][4]
    assert(md_entries_4['order_id'] == 826956777902)
    assert(md_entries_4['md_order_priority'] == 27578309721)
    assert(md_entries_4['md_entry_px_mantissa'] == 9855000000000)
    assert(md_entries_4['md_entry_px_exponent'] == -9)
    assert(md_entries_4['md_display_qty'] == 12)
    assert(md_entries_4['security_id'] == 43448)
    assert(md_entries_4['md_update_action'] == 2)
    assert(md_entries_4['md_entry_type'] == 49) # '1'

    md_entries_5 = row['md_entries'][5]
    assert(md_entries_5['order_id'] == 826956830136)
    assert(md_entries_5['md_order_priority'] == 27578112232)
    assert(md_entries_5['md_entry_px_mantissa'] == 9854500000000)
    assert(md_entries_5['md_entry_px_exponent'] == -9)
    assert(md_entries_5['md_display_qty'] == 9)
    assert(md_entries_5['security_id'] == 43448)
    assert(md_entries_5['md_update_action'] == 2)
    assert(md_entries_5['md_entry_type'] == 49) # '1'

    md_entries_6 = row['md_entries'][6]
    assert(md_entries_6['order_id'] == 826956931749)
    assert(md_entries_6['md_order_priority'] == 27576880531)
    assert(md_entries_6['md_entry_px_mantissa'] == 9854000000000)
    assert(md_entries_6['md_entry_px_exponent'] == -9)
    assert(md_entries_6['md_display_qty'] == 10)
    assert(md_entries_6['security_id'] == 43448)
    assert(md_entries_6['md_update_action'] == 2)
    assert(md_entries_6['md_entry_type'] == 49) # '1'

    md_entries_7 = row['md_entries'][7]
    assert(md_entries_7['order_id'] == 826956931754)
    assert(md_entries_7['md_order_priority'] == 27576835612)
    assert(md_entries_7['md_entry_px_mantissa'] == 9854000000000)
    assert(md_entries_7['md_entry_px_exponent'] == -9)
    assert(md_entries_7['md_display_qty'] == 11)
    assert(md_entries_7['security_id'] == 43448)
    assert(md_entries_7['md_update_action'] == 2)
    assert(md_entries_7['md_entry_type'] == 49) # '1'

    md_entries_8 = row['md_entries'][8]
    assert(md_entries_8['order_id'] == 826956931755)
    assert(md_entries_8['md_order_priority'] == 27576835611)
    assert(md_entries_8['md_entry_px_mantissa'] == 9853000000000)
    assert(md_entries_8['md_entry_px_exponent'] == -9)
    assert(md_entries_8['md_display_qty'] == 11)
    assert(md_entries_8['security_id'] == 43448)
    assert(md_entries_8['md_update_action'] == 2)
    assert(md_entries_8['md_entry_type'] == 49) # '1'

    md_entries_9 = row['md_entries'][9]
    assert(md_entries_9['order_id'] == 826956938002)
    assert(md_entries_9['md_order_priority'] == 27576910306)
    assert(md_entries_9['md_entry_px_mantissa'] == 9853500000000)
    assert(md_entries_9['md_entry_px_exponent'] == -9)
    assert(md_entries_9['md_display_qty'] == 12)
    assert(md_entries_9['security_id'] == 43448)
    assert(md_entries_9['md_update_action'] == 2)
    assert(md_entries_9['md_entry_type'] == 49) # '1'

    md_entries_10 = row['md_entries'][10]
    assert(md_entries_10['order_id'] == 826956955802)
    assert(md_entries_10['md_order_priority'] == 27576789818)
    assert(md_entries_10['md_entry_px_mantissa'] == 9853000000000)
    assert(md_entries_10['md_entry_px_exponent'] == -9)
    assert(md_entries_10['md_display_qty'] == 20)
    assert(md_entries_10['security_id'] == 43448)
    assert(md_entries_10['md_update_action'] == 2)
    assert(md_entries_10['md_entry_type'] == 49) # '1'

    md_entries_11 = row['md_entries'][11]
    assert(md_entries_11['order_id'] == 826956956202)
    assert(md_entries_11['md_order_priority'] == 27576696237)
    assert(md_entries_11['md_entry_px_mantissa'] == 9852500000000)
    assert(md_entries_11['md_entry_px_exponent'] == -9)
    assert(md_entries_11['md_display_qty'] == 20)
    assert(md_entries_11['security_id'] == 43448)
    assert(md_entries_11['md_update_action'] == 2)
    assert(md_entries_11['md_entry_type'] == 49) # '1'

    md_entries_12 = row['md_entries'][12]
    assert(md_entries_12['order_id'] == 826956992495)
    assert(md_entries_12['md_order_priority'] == 27577537295)
    assert(md_entries_12['md_entry_px_mantissa'] == 9854000000000)
    assert(md_entries_12['md_entry_px_exponent'] == -9)
    assert(md_entries_12['md_display_qty'] == 9)
    assert(md_entries_12['security_id'] == 43448)
    assert(md_entries_12['md_update_action'] == 2)
    assert(md_entries_12['md_entry_type'] == 49) # '1'

    md_entries_13 = row['md_entries'][13]
    assert(md_entries_13['order_id'] == 826957081351)
    assert(md_entries_13['md_order_priority'] == 27576698462)
    assert(md_entries_13['md_entry_px_mantissa'] == 9853500000000)
    assert(md_entries_13['md_entry_px_exponent'] == -9)
    assert(md_entries_13['md_display_qty'] == 11)
    assert(md_entries_13['security_id'] == 43448)
    assert(md_entries_13['md_update_action'] == 2)
    assert(md_entries_13['md_entry_type'] == 49) # '1'

    md_entries_14 = row['md_entries'][14]
    assert(md_entries_14['order_id'] == 826957121878)
    assert(md_entries_14['md_order_priority'] == 27576717517)
    assert(md_entries_14['md_entry_px_mantissa'] == 9853500000000)
    assert(md_entries_14['md_entry_px_exponent'] == -9)
    assert(md_entries_14['md_display_qty'] == 11)
    assert(md_entries_14['security_id'] == 43448)
    assert(md_entries_14['md_update_action'] == 2)
    assert(md_entries_14['md_entry_type'] == 49) # '1'

    md_entries_15 = row['md_entries'][15]
    assert(md_entries_15['order_id'] == 826957130397)
    assert(md_entries_15['md_order_priority'] == 27578335078)
    assert(md_entries_15['md_entry_px_mantissa'] == 9852500000000)
    assert(md_entries_15['md_entry_px_exponent'] == -9)
    assert(md_entries_15['md_display_qty'] == 46)
    assert(md_entries_15['security_id'] == 43448)
    assert(md_entries_15['md_update_action'] == 2)
    assert(md_entries_15['md_entry_type'] == 49) # '1'

    md_entries_16 = row['md_entries'][16]
    assert(md_entries_16['order_id'] == 826957179315)
    assert(md_entries_16['md_order_priority'] == 27576691169)
    assert(md_entries_16['md_entry_px_mantissa'] == 9853000000000)
    assert(md_entries_16['md_entry_px_exponent'] == -9)
    assert(md_entries_16['md_display_qty'] == 11)
    assert(md_entries_16['security_id'] == 43448)
    assert(md_entries_16['md_update_action'] == 2)
    assert(md_entries_16['md_entry_type'] == 49) # '1'

    md_entries_17 = row['md_entries'][17]
    assert(md_entries_17['order_id'] == 826957189406)
    assert(md_entries_17['md_order_priority'] == 27576720694)
    assert(md_entries_17['md_entry_px_mantissa'] == 9852500000000)
    assert(md_entries_17['md_entry_px_exponent'] == -9)
    assert(md_entries_17['md_display_qty'] == 9)
    assert(md_entries_17['security_id'] == 43448)
    assert(md_entries_17['md_update_action'] == 2)
    assert(md_entries_17['md_entry_type'] == 49) # '1'

    md_entries_18 = row['md_entries'][18]
    assert(md_entries_18['order_id'] == 826957192757)
    assert(md_entries_18['md_order_priority'] == 27576794515)
    assert(md_entries_18['md_entry_px_mantissa'] == 9854000000000)
    assert(md_entries_18['md_entry_px_exponent'] == -9)
    assert(md_entries_18['md_display_qty'] == 11)
    assert(md_entries_18['security_id'] == 43448)
    assert(md_entries_18['md_update_action'] == 2)
    assert(md_entries_18['md_entry_type'] == 49) # '1'

    md_entries_19 = row['md_entries'][19]
    assert(md_entries_19['order_id'] == 826957210712)
    assert(md_entries_19['md_order_priority'] == 27576829351)
    assert(md_entries_19['md_entry_px_mantissa'] == 9853000000000)
    assert(md_entries_19['md_entry_px_exponent'] == -9)
    assert(md_entries_19['md_display_qty'] == 12)
    assert(md_entries_19['security_id'] == 43448)
    assert(md_entries_19['md_update_action'] == 2)
    assert(md_entries_19['md_entry_type'] == 49) # '1'

    md_entries_20 = row['md_entries'][20]
    assert(md_entries_20['order_id'] == 826957259793)
    assert(md_entries_20['md_order_priority'] == 27577091618)
    assert(md_entries_20['md_entry_px_mantissa'] == 9851000000000)
    assert(md_entries_20['md_entry_px_exponent'] == -9)
    assert(md_entries_20['md_display_qty'] == 25)
    assert(md_entries_20['security_id'] == 43448)
    assert(md_entries_20['md_update_action'] == 2)
    assert(md_entries_20['md_entry_type'] == 49) # '1'

    md_entries_21 = row['md_entries'][21]
    assert(md_entries_21['order_id'] == 826957298070)
    assert(md_entries_21['md_order_priority'] == 27577535388)
    assert(md_entries_21['md_entry_px_mantissa'] == 9854000000000)
    assert(md_entries_21['md_entry_px_exponent'] == -9)
    assert(md_entries_21['md_display_qty'] == 11)
    assert(md_entries_21['security_id'] == 43448)
    assert(md_entries_21['md_update_action'] == 2)
    assert(md_entries_21['md_entry_type'] == 49) # '1'

    md_entries_22 = row['md_entries'][22]
    assert(md_entries_22['order_id'] == 826957317659)
    assert(md_entries_22['md_order_priority'] == 27577385292)
    assert(md_entries_22['md_entry_px_mantissa'] == 9853500000000)
    assert(md_entries_22['md_entry_px_exponent'] == -9)
    assert(md_entries_22['md_display_qty'] == 11)
    assert(md_entries_22['security_id'] == 43448)
    assert(md_entries_22['md_update_action'] == 2)
    assert(md_entries_22['md_entry_type'] == 49) # '1'

    md_entries_23 = row['md_entries'][23]
    assert(md_entries_23['order_id'] == 826957321153)
    assert(md_entries_23['md_order_priority'] == 27577462961)
    assert(md_entries_23['md_entry_px_mantissa'] == 9854000000000)
    assert(md_entries_23['md_entry_px_exponent'] == -9)
    assert(md_entries_23['md_display_qty'] == 12)
    assert(md_entries_23['security_id'] == 43448)
    assert(md_entries_23['md_update_action'] == 2)
    assert(md_entries_23['md_entry_type'] == 49) # '1'

    md_entries_24 = row['md_entries'][24]
    assert(md_entries_24['order_id'] == 826957324576)
    assert(md_entries_24['md_order_priority'] == 27577426689)
    assert(md_entries_24['md_entry_px_mantissa'] == 9853500000000)
    assert(md_entries_24['md_entry_px_exponent'] == -9)
    assert(md_entries_24['md_display_qty'] == 20)
    assert(md_entries_24['security_id'] == 43448)
    assert(md_entries_24['md_update_action'] == 2)
    assert(md_entries_24['md_entry_type'] == 49) # '1'

    md_entries_25 = row['md_entries'][25]
    assert(md_entries_25['order_id'] == 826957327582)
    assert(md_entries_25['md_order_priority'] == 27577444871)
    assert(md_entries_25['md_entry_px_mantissa'] == 9853500000000)
    assert(md_entries_25['md_entry_px_exponent'] == -9)
    assert(md_entries_25['md_display_qty'] == 20)
    assert(md_entries_25['security_id'] == 43448)
    assert(md_entries_25['md_update_action'] == 2)
    assert(md_entries_25['md_entry_type'] == 49) # '1'

    md_entries_26 = row['md_entries'][26]
    assert(md_entries_26['order_id'] == 826957328904)
    assert(md_entries_26['md_order_priority'] == 27577452037)
    assert(md_entries_26['md_entry_px_mantissa'] == 9853500000000)
    assert(md_entries_26['md_entry_px_exponent'] == -9)
    assert(md_entries_26['md_display_qty'] == 9)
    assert(md_entries_26['security_id'] == 43448)
    assert(md_entries_26['md_update_action'] == 2)
    assert(md_entries_26['md_entry_type'] == 49) # '1'

    md_entries_27 = row['md_entries'][27]
    assert(md_entries_27['order_id'] == 826957329006)
    assert(md_entries_27['md_order_priority'] == 27577452473)
    assert(md_entries_27['md_entry_px_mantissa'] == 9854500000000)
    assert(md_entries_27['md_entry_px_exponent'] == -9)
    assert(md_entries_27['md_display_qty'] == 11)
    assert(md_entries_27['security_id'] == 43448)
    assert(md_entries_27['md_update_action'] == 2)
    assert(md_entries_27['md_entry_type'] == 49) # '1'

    md_entries_28 = row['md_entries'][28]
    assert(md_entries_28['order_id'] == 826957345199)
    assert(md_entries_28['md_order_priority'] == 27577534462)
    assert(md_entries_28['md_entry_px_mantissa'] == 9854500000000)
    assert(md_entries_28['md_entry_px_exponent'] == -9)
    assert(md_entries_28['md_display_qty'] == 10)
    assert(md_entries_28['security_id'] == 43448)
    assert(md_entries_28['md_update_action'] == 2)
    assert(md_entries_28['md_entry_type'] == 49) # '1'

    md_entries_29 = row['md_entries'][29]
    assert(md_entries_29['order_id'] == 826957359928)
    assert(md_entries_29['md_order_priority'] == 27577609834)
    assert(md_entries_29['md_entry_px_mantissa'] == 9854000000000)
    assert(md_entries_29['md_entry_px_exponent'] == -9)
    assert(md_entries_29['md_display_qty'] == 20)
    assert(md_entries_29['security_id'] == 43448)
    assert(md_entries_29['md_update_action'] == 2)
    assert(md_entries_29['md_entry_type'] == 49) # '1'

    md_entries_30 = row['md_entries'][30]
    assert(md_entries_30['order_id'] == 826957365151)
    assert(md_entries_30['md_order_priority'] == 27578310491)
    assert(md_entries_30['md_entry_px_mantissa'] == 9855000000000)
    assert(md_entries_30['md_entry_px_exponent'] == -9)
    assert(md_entries_30['md_display_qty'] == 20)
    assert(md_entries_30['security_id'] == 43448)
    assert(md_entries_30['md_update_action'] == 2)
    assert(md_entries_30['md_entry_type'] == 49) # '1'

    md_entries_31 = row['md_entries'][31]
    assert(md_entries_31['order_id'] == 826957428441)
    assert(md_entries_31['md_order_priority'] == 27578111241)
    assert(md_entries_31['md_entry_px_mantissa'] == 9855500000000)
    assert(md_entries_31['md_entry_px_exponent'] == -9)
    assert(md_entries_31['md_display_qty'] == 11)
    assert(md_entries_31['security_id'] == 43448)
    assert(md_entries_31['md_update_action'] == 2)
    assert(md_entries_31['md_entry_type'] == 49) # '1'

    md_entries_32 = row['md_entries'][32]
    assert(md_entries_32['order_id'] == 826957429550)
    assert(md_entries_32['md_order_priority'] == 27577940855)
    assert(md_entries_32['md_entry_px_mantissa'] == 9855000000000)
    assert(md_entries_32['md_entry_px_exponent'] == -9)
    assert(md_entries_32['md_display_qty'] == 11)
    assert(md_entries_32['security_id'] == 43448)
    assert(md_entries_32['md_update_action'] == 2)
    assert(md_entries_32['md_entry_type'] == 49) # '1'

    md_entries_33 = row['md_entries'][33]
    assert(md_entries_33['order_id'] == 826957453046)
    assert(md_entries_33['md_order_priority'] == 27578209380)
    assert(md_entries_33['md_entry_px_mantissa'] == 9854500000000)
    assert(md_entries_33['md_entry_px_exponent'] == -9)
    assert(md_entries_33['md_display_qty'] == 20)
    assert(md_entries_33['security_id'] == 43448)
    assert(md_entries_33['md_update_action'] == 2)
    assert(md_entries_33['md_entry_type'] == 49) # '1'

def run_test(sparkSession):
    data_for_test = sample_collection_from_test_files(sparkSession, [ \
            ['/test_decoded_data/test-1-md-incremental-refresh-order-book47.parquet',[1957100, 2377251, 3651930, 3729399]], 
            ['/test_decoded_data/test-2-md-incremental-refresh-order-book47.parquet', [377276, 873019, 2425452, 3505819]]])
    assert_row_0(data_for_test[0])
    assert_row_1(data_for_test[1])
    assert_row_2(data_for_test[2])
    assert_row_3(data_for_test[3])
    assert_row_4(data_for_test[4])
    assert_row_5(data_for_test[5])
    assert_row_6(data_for_test[6])
    assert_row_7(data_for_test[7])

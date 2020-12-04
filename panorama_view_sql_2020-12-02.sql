create view panorama_view
AS
select CustomInfo.acctdt as acctdt,
       cusname,
       cus_id,
       idtype,
       CustomInfo.idno,
       phone,
       org_id,
       org_name,
       cus_mgr_id,
       cus_mgr_name,
       gender,
       age,
       province,
       marrige,
       education,
       work_company,
       curraccnum,
       regaccnum,
       vip_cust_gradex,
       vip_time,
       total_aum,
       total_loan,
       hqye,
       dqye,
       aum_lc,
       aum_jj,
       aum_gz,
       aum_bx,
       is_hyyh,
       is_wyyh,
       is_sjyhyh,
       is_dfgz,
       is_etcyh,
       is_dfsb,
       is_dkdj,
       is_dqyh,
       is_jjyh,
       is_lcyh,
       is_bxyh,
       is_gzyh,
       is_grdkyh,
       is_xykyh,
       open_mindate,
       dq_open_mindate,
       webbank_open_date,
       mobilebank_open_date,
       credit_c_open_date,
       lc_open_date,
       jj_open_date,
       gz_open_date,
       bx_open_date,
       dfgz_date_recent,
       dfgz_amt_recent,
       dfsb_date_recent,
       dfsb_amt_recent,
       gdhk_date_recent,
       etc_open_date,
       webbank_active_date,
       mobilebank_active_date,
       credit_c_activiate_date,
       debit_c_close_date,
       dq_close_date,
       wy_close_date,
       mobilebank_close_date,
       credit_c_close_date,
       dq_due_date_recent,
       dq_due_amt_recent,
       dq_channel_recent,
       lc_due_date_recent,
       lc_due_amt_recent,
       lc_channel_recent,
       jj_due_date_recent,
       jj_due_amt_recent,
       jj_channel_recent,
       gz_due_date_recent,
       gz_due_amt_recent,
       gz_channel_recent,
       bx_due_date_recent,
       bx_due_amt_recent,
       bx_channel_recent,
       hq_1m_amt,
       hq_2m_amt,
       hq_3m_amt,
       hq_4m_amt,
       hq_5m_amt,
       hq_6m_amt,
       dq_1m_amt,
       dq_2m_amt,
       dq_3m_amt,
       dq_4m_amt,
       dq_5m_amt,
       dq_6m_amt,
       jj_1m_amt,
       jj_2m_amt,
       jj_3m_amt,
       jj_4m_amt,
       jj_5m_amt,
       jj_6m_amt,
       gz_1m_amt,
       gz_2m_amt,
       gz_3m_amt,
       gz_4m_amt,
       gz_5m_amt,
       gz_6m_amt,
       lc_1m_amt,
       lc_2m_amt,
       lc_3m_amt,
       lc_4m_amt,
       lc_5m_amt,
       lc_6m_amt,
       bx_1m_amt,
       bx_2m_amt,
       bx_3m_amt,
       bx_4m_amt,
       bx_5m_amt,
       bx_6m_amt,
       bx_7m_amt,

       monthoutamt01,
       monthoutamt02,
       monthoutamt03,
       monthoutamt06,
       monthoutamt12,
       monthinamt01,
       monthinamt02,
       monthinamt03,
       monthinamt06,
       monthinamt12,
       monthdrawnum01,
       monthdrawnum02,
       monthdrawnum03,
       monthdrawnum06,
       monthdrawnum12,
       monthdrawamt01,
       monthdrawamt02,
       monthdrawamt03,
       monthdrawamt06,
       monthdrawamt12,
       monthdepositnum01,
       monthdepositnum02,
       monthdepositnum03,
       monthdepositnum06,
       monthdepositnum12,
       monthdepositamt01,
       monthdepositamt02,
       monthdepositamt03,
       monthdepositamt06,
       monthdepositamt12,
       monthconsumenum01,
       monthconsumenum02,
       monthconsumenum03,
       monthconsumenum06,
       monthconsumenum12,
       monthconsumeamt01,
       monthconsumeamt02,
       monthconsumeamt03,
       monthconsumeamt06,
       monthconsumeamt12,
       monthkuaijienum01,
       monthkuaijienum02,
       monthkuaijienum03,
       monthkuaijienum06,
       monthkuaijienum12,
       monthkuaijieamt01,
       monthkuaijieamt02,
       monthkuaijieamt03,
       monthkuaijieamt06,
       monthkuaijieamt12,
       monthatmoutnum01,
       monthatmoutnum02,
       monthatmoutnum03,
       monthatmoutnum06,
       monthatmoutnum12,
       monthatmoutamt01,
       monthatmoutamt02,
       monthatmoutamt03,
       monthatmoutamt06,
       monthatmoutamt12,
       monthatminnum01,
       monthatminnum02,
       monthatminnum03,
       monthatminnum06,
       monthatminnum12,
       monthatminamt01,
       monthatminamt02,
       monthatminamt03,
       monthatminamt06,
       monthatminamt12,
       monthcntoutnum01,
       monthcntoutnum02,
       monthcntoutnum03,
       monthcntoutnum06,
       monthcntoutnum12,
       monthcntoutamt01,
       monthcntoutamt02,
       monthcntoutamt03,
       monthcntoutamt06,
       monthcntoutamt12,
       monthcntinnum01,
       monthcntinnum02,
       monthcntinnum03,
       monthcntinnum06,
       monthcntinnum12,
       monthcntinamt01,
       monthcntinamt02,
       monthcntinamt03,
       monthcntinamt06,
       monthcntinamt12,
       monthweboutnum01,
       monthweboutnum02,
       monthweboutnum03,
       monthweboutnum06,
       monthweboutnum12,
       monthweboutamt01,
       monthweboutamt02,
       monthweboutamt03,
       monthweboutamt06,
       monthweboutamt12,
       monthwebinnum01,
       monthwebinnum02,
       monthwebinnum03,
       monthwebinnum06,
       monthwebinnum12,
       monthwebinamt01,
       monthwebinamt02,
       monthwebinamt03,
       monthwebinamt06,
       monthwebinamt12,
       monthcelloutnum01,
       monthcelloutnum02,
       monthcelloutnum03,
       monthcelloutnum06,
       monthcelloutnum12,
       monthcelloutamt01,
       monthcelloutamt02,
       monthcelloutamt03,
       monthcelloutamt06,
       monthcelloutamt12,
       monthcellinnum01,
       monthcellinnum02,
       monthcellinnum03,
       monthcellinnum06,
       monthcellinnum12,
       monthcellinamt01,
       monthcellinamt02,
       monthcellinamt03,
       monthcellinamt06,
       monthcellinamt12,
       monthwagesamt01,
       monthwagesamt02,
       monthwagesamt03,
       monthwagesamt06,
       monthwagesamt12,


       dq_month_num,
       dq_zz_1ynum,
       dq_zz_2ynum,
       dq_zz_3ynum,
       dq_zz_5ynum,
       dq_other_num,
       dq_month_amt,
       dq_zz_1yamt,
       dq_zz_2yamt,
       dq_zz_3yamt,
       dq_zz_5yamt,
       dq_other_amt,
       dq_duedate,
       dq_dueamt,
       dq_monthdepositamt01,
       dq_monthdepositamt02,
       dq_monthdepositamt03,
       dq_monthdepositamt06,
       dq_monthdepositamt12,
       dq_monthdepositnum01,
       dq_monthdepositnum02,
       dq_monthdepositnum03,
       dq_monthdepositnum06,
       dq_monthdepositnum12,
       dq_monthdrawamt01,
       dq_monthdrawamt02,
       dq_monthdrawamt03,
       dq_monthdrawamt06,
       dq_monthdrawamt12,
       dq_monthdrawnum01,
       dq_monthdrawnum02,
       dq_monthdrawnum03,
       dq_monthdrawnum06,
       dq_monthdrawnum12,
       gf_balance,
       gf_preference,
       gf_open_balance,
       gf_closed_balance,
       gf_short_balance,
       gf_mid_balance,
       gf_long_balance,
       gf_close_time,
       gf_close_name,
       gf_close_amt,
       gf_opendate,
       gf_openorg,
       gf_closedate,
       gf_ftime,
       gf_ltime,
       gf_num,
       gf_rengou_amt,
       gf_open_amt,
       gf_closed_amt,
       gf_short_amt,
       gf_mid_amt,
       gf_long_amt,
       gf_dzyh_amt,
       gf_gm_amt,
       gf_other_amt,
       gf_buy_1mnum,
       gf_buy_1mamt,
       gf_redeem_1mamt,
       gf_buy_3mnum,
       gf_buy_3mamt,
       gf_redeem_3mamt,
       gf_buy_hynum,
       gf_buy_hyamt,
       gf_redeem_hyamt,
       gf_buy_1ynum,
       gf_buy_1yamt,
       gf_redeem_1yamt,
       gf_buy_2ynum,
       gf_buy_2yamt,
       gf_redeem_2yamt,

       cc_no,
       cc_cardclass,
       cc_org,
       cc_open_date,
       cc_active_date,
       cc_card_num,
       cc_stament_day,
       cc_stament_amt,
       cc_point,
       cc_bal_amt,
       cc_amort_amt,
       cc_amort_num,
       cc_risk_class,
       cc_overdue_amt,
       cc_overdue_date,
       cc_creditmax_amt,
       cc_cashmax_amt,
       cc_auto_repay,
       cc_m3_active_acct_flag,
       cc_sleep_flag,
       cc_avg_bal_amt_1m,
       cc_avg_bal_amt_3m,
       cc_avg_bal_amt_6m,
       cc_avg_bal_amt_9m,
       cc_avg_bal_amt_12m,
       cc_overdue_fre_1m,
       cc_overdue_fre_3m,
       cc_overdue_fre_6m,
       cc_overdue_fre_12m,
       cc_int_12m,
       cc_late_fee_12m,
       cc_annual_fee_12m,
       cc_service_fee_12m,
       cc_consume_1m,
       cc_repay_1m,
       cc_cash_1m,
       cc_bystage_1m,
       cc_consume_num_1m,
       cc_repay_num_1m,
       cc_cash_num_1m,
       cc_bystage_num_1m,
       cc_consume_2m,
       cc_repay_2m,
       cc_cash_2m,
       cc_bystage_2m,
       cc_consume_num_2m,
       cc_repay_num_2m,
       cc_cash_num_2m,
       cc_bystage_num_2m,
       cc_consume_3m,
       cc_repay_3m,
       cc_cash_3m,
       cc_bystage_3m,
       cc_consume_num_3m,
       cc_repay_num_3m,
       cc_cash_num_3m,
       cc_bystage_num_3m,
       cc_consume_6m,
       cc_repay_6m,
       cc_cash_6m,
       cc_bystage_6m,
       cc_consume_num_6m,
       cc_repay_num_6m,
       cc_cash_num_6m,
       cc_bystage_num_6m,
       cc_consume_12m,
       cc_repay_12m,
       cc_cash_12m,
       cc_bystage_12m,
       cc_consume_num_12m,
       cc_repay_num_12m,
       cc_cash_num_12m,
       cc_bystage_num_12m,


       mcc_prefer1_flg,
       mcc_prefer2_flg,
       mcc_prefer3_flg,
       mcc_biz_yn,
       mcc_canyin_level,
       mcc_canyin_time_flg,
       mcc_catering_date_last,
       mcc_catering_amt_1m_sum,
       mcc_catering_cnt_1m_sum,
       mcc_canyin_amt_2m_avg,
       mcc_canyin_cnt_2m_avg,
       mcc_canyin_amt_3m_avg,
       mcc_canyin_cnt_3m_avg,
       mcc_canyin_amt_6m_avg,
       mcc_canyin_cnt_6m_avg,
       mcc_canyin_amt_12m_avg,
       mcc_canyin_cnt_12m_avg,
       mcc_shopping_level,
       mcc_shopping_time_flg,
       mcc_shopping_date_last,
       mcc_shopping_amt_1m_sum,
       mcc_shopping_cnt_1m_sum,
       mcc_shopping_amt_2m_avg,
       mcc_shopping_cnt_2m_avg,
       mcc_shopping_amt_3m_avg,
       mcc_shopping_cnt_3m_avg,
       mcc_shopping_amt_6m_avg,
       mcc_shopping_cnt_6m_avg,
       mcc_shopping_amt_12m_avg,
       mcc_shopping_cnt_12m_avg,
       mcc_leisure_level,
       mcc_leisure_time_flg,
       mcc_leisure_date_last,
       mcc_leisure_amt_1m_sum,
       mcc_leisure_cnt_1m_sum,
       mcc_leisure_amt_2m_avg,
       mcc_leisure_cnt_2m_avg,
       mcc_leisure_amt_3m_avg,
       mcc_leisure_cnt_3m_avg,
       mcc_leisure_amt_6m_avg,
       mcc_leisure_cnt_6m_avg,
       mcc_leisure_amt_12m_avg,
       mcc_leisure_cnt_12m_avg,
       mcc_bigdeals_date_last,
       mcc_bigdeals_time_flg,
       mcc_bigdeals_amt_1m_sum,
       mcc_bigdeals_cnt_1m_sum,
       mcc_bigdeals_amt_3m_sum,
       mcc_bigdeals_cnt3m_sum,
       mcc_bigdeals_amt_6m_sum,
       mcc_bigdeals_cnt_6m_sum,
       mcc_bigdeals_amt_12m_sum,
       mcc_bigdeals_cnt_12m_sum,
       mcc_abroad_date_last,
       mcc_abroad_place_last,
       mcc_abroad_time_flg,
       mcc_abroad_1m_amt,
       mcc_abroad_1m_cnt,
       mcc_abroad_6m_amt_avg,
       mcc_abroad_6m_cnt_avg,
       mcc_abroad_12m_amt_avg,
       mcc_abroad_12m_cnt_avg,
       mcc_service_date_last,
       mcc_service_time_flg,
       mcc_service_amt_1m_sum,
       mcc_service_cnt_1m_sum,
       mcc_service_amt_3m_avg,
       mcc_service_cnt_3m_avg,
       mcc_service_amt_6m_avg,
       mcc_service_cnt_6m_avg,
       mcc_service_amt_12m_avg,
       mcc_service_cnt_12m_avg,
       mcc_carrelative_date_last,
       mcc_carrelative_time_flg,
       mcc_carrelative_amt_1m_sum,
       mcc_carrelative_cnt_1m_sum,
       mcc_carrelative_amt_6m_avg,
       mcc_carrelative_cnt_6m_avg,
       mcc_carrelative_amt_12m_avg,
       mcc_carrelative_cnt_12m_avg,
       mcc_costume_date_last,
       mcc_costume_time_flg,
       mcc_costume_amt_1m_sum,
       mcc_costume_cnt_1m_sum,
       mcc_costume_amt_6m_avg,
       mcc_costume_cnt_6m_avg,
       mcc_costume_amt_12m_avg,
       mcc_costume_cnt_12m_avg,
       mcc_buycar_last_date,
       mcc_buycar_last_amt,
       mcc_secondhandcar_last_yn,
       mcc_buycar_total_cnt,
       mcc_buycar_total_amt,
       mcc_fin_date_last,
       mcc_fin_amt_1m_sum,
       mcc_fin_cnt_1m_sum,
       mcc_fin_amt_3m_avg,
       mcc_fin_cnt_3m_avg,
       mcc_fin_amt_6m_avg,
       mcc_fin_cnt_6m_avg,
       mcc_fin_amt_12m_avg,
       mcc_fin_cnt_12m_avg,
       mcc_insurance_date_last,
       mcc_insurance_1m_avg,
       mcc_insurance_cnt_1m_avg,
       mcc_insurance_6m_avg,
       mcc_insurance_cnt_6m_avg,
       mcc_insurance_amt_12m_avg,
       mcc_insurance_cnt_12m_avg,
       mcc_airplane_last_date,
       mcc_airplane_6m_amt_avg,
       mcc_airplane_6m_cnt_avg,
       mcc_airplane_1y_amt_avg,
       mcc_airplane_1y_cnt_avg,
       mcc_alcohol_last_date,
       mcc_alcohol_1m_amt,
       mcc_alcohol_1m_cnt,
       mcc_alcohol_6m_amt_avg,
       mcc_alcohol_6m_cnt_avg,
       mcc_alcohol_12m_amt_avg,
       mcc_alcohol_12m_cnt_avg,
       mcc_drinkplace_last_date,
       mcc_drinkplace_6m_amt_avg,
       mcc_drinkplace_6m_cnt_avg,
       mcc_drinkplace_12m_amt_avg,
       mcc_drinkplace_12m_cnt_avg,
       mcc_mombaby_last_date,
       mcc_mombaby_6m_amt_avg,
       mcc_mombaby_6m_cnt_avg,
       mcc_mombaby_12m_amt_avg,
       mcc_mombaby_12m_cnt_avg,
       mcc_pets_last_date,
       mcc_pets_6m_amt_avg,
       mcc_pets_6m_cnt_avg,
       mcc_pets_12m_amt_avg,
       mcc_pets_12m_cnt_avg,
       mcc_edu_last_date,
       mcc_edu_6m_amt_avg,
       mcc_edu_6m_cnt_avg,
       mcc_edu_1y_amt,
       mcc_edu_1y_cnt,
       mcc_medical_last_date,
       mcc_medical_6m_amt_avg,
       mcc_medical_6m_cnt_avg,
       mcc_medical_12m_amt_avg,
       mcc_medical_12m_cnt_avg,
       mcc_travel_last_date,
       mcc_travel_6m_amt_avg,
       mcc_travel_6m_cnt_avg,
       mcc_travel_1y_amt_avg,
       mcc_travel_1y_cnt_avg,
       mcc_clubs_last_date,
       mcc_clubs_6m_amt_avg,
       mcc_clubs_6m_cnt_avg,
       mcc_clubs_1y_amt_avg,
       mcc_clubs_1y_cnt_avg,
       mcc_sports_last_date,
       mcc_sports_6m_amt_avg,
       mcc_sports_6m_cnt_avg,
       mcc_sports_12m_amt_avg,
       mcc_sports_12m_cnt_avg,
       mcc_cosmetic_last_date,
       mcc_cosmetic_6m_amt_avg,
       mcc_cosmetic_6m_cnt_avg,
       mcc_cosmetic_12m_amt_avg,
       mcc_cosmetic_12m_cnt_avg,
       mcc_luxury_last_date,
       mcc_luxury_1m_amt,
       mcc_luxury_1m_cnt,
       mcc_luxury_6m_amt_avg,
       mcc_luxury_6m_cnt_avg,
       mcc_luxury_1y_amt_avg,
       mcc_luxury_1y_cnt_avg,


       loan_level_five_class,
       pay_loan_num,
       pay_loan_amt,
       unpay_loan_num,
       unpay_loan_amt,
       unpay_loan_bal,
       unpay_loan_max_month,
       loan_overdue_amt,
       loan_overdue_max_day,
       loan_overdue_pastmax_day,
       loan_overdue_num,
       loan_1m_num,
       loan_halfy_num,
       loan_halfy_amt,
       loan_1y_num,
       loan_1y_amt,
       loan_2y_num,
       loan_2y_amt,
       loan_3y_num,
       loan_3y_amt,
       unpay_consumer_loan_num,
       unpay__consumer_loan_amt,
       unpay_consumer_loan_bal,
       unpay_consumer_loan_max_month,
       pay_consumer_loan_num,
       pay_consumer_loan_amt,
       unpay_house_loan_num,
       unpay__house_loan_amt,
       unpay_house_loan_bal,
       unpay_house_loan_max_month,
       pay_house_loan_num,
       pay_house_loan_amt,
       unpay_car_loan_num,
       unpay__car_loan_amt,
       unpay_car_loan_bal,
       unpay_car_loan_max_month,
       pay_car_loan_num,
       pay_car_loan_amt,
       unpay_cc_loan_num,
       unpay__cc_loan_amt,
       unpay_cc_loan_bal,
       unpay_cc_loan_max_month,
       pay_ccloan_num,
       pay_cc_loan_amt
from CustomInfo
         left join CreditCard on CustomInfo.acctdt = CreditCard.acctdt and CustomInfo.idno = CreditCard.cc_idno
         left join Credit on CustomInfo.acctdt = Credit.acctdt and CustomInfo.idno = Credit.idno
         left join CardMCC on CustomInfo.acctdt = CardMCC.acctdt and CustomInfo.idno = CardMCC.idno
         left join Trans on CustomInfo.acctdt = Trans.acctdt and CustomInfo.idno = Trans.idno
         left join Financial on CustomInfo.acctdt = Financial.acctdt and CustomInfo.idno = Financial.idno
package com.dingshudata.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Application {

    // 基本数据表 DSP_CUSTINFO 117

    private Date acctdt;
    private String cusname;
    private String cus_id;
    private String idtype;
    private String idno;
    private String phone;
    private String org_id;
    private String org_name;
    private String cus_mgr_id;
    private String cus_mgr_name;
    private String gender;
    private double age;
    private String province;
    private String marrige;
    private String education;
    private String work_company;
    private double curraccnum;
    private double regaccnum;
    private String vip_cust_gradex;
    private Date vip_time;
    private double total_aum;
    private double total_loan;
    private double hqye;
    private double dqye;
    private double aum_lc;
    private double aum_jj;
    private double aum_gz;
    private double aum_bx;
    private double is_hyyh;
    private double is_wyyh;
    private double is_sjyhyh;
    private double is_dfgz;
    private double is_etcyh;
    private double is_dfsb;
    private double is_dkdj;
    private double is_dqyh;
    private double is_jjyh;
    private double is_lcyh;
    private double is_bxyh;
    private double is_gzyh;
    private double is_grdkyh;
    private double is_xykyh;
    private Date open_mindate;
    private Date dq_open_mindate;
    private Date webbank_open_date;
    private Date mobilebank_open_date;
    private Date credit_c_open_date;
    private Date lc_open_date;
    private Date jj_open_date;
    private Date gz_open_date;
    private Date bx_open_date;
    private Date dfgz_date_recent;
    private double dfgz_amt_recent;
    private Date dfsb_date_recent;
    private double dfsb_amt_recent;
    private Date gdhk_date_recent;
    private Date etc_open_date;
    private Date webbank_active_date;
    private Date mobilebank_active_date;
    private Date credit_c_activiate_date;
    private Date debit_c_close_date;
    private Date dq_close_date;
    private Date wy_close_date;
    private Date mobilebank_close_date;
    private Date credit_c_close_date;
    private Date dq_due_date_recent;
    private double dq_due_amt_recent;
    private String dq_channel_recent;
    private Date lc_due_date_recent;
    private double lc_due_amt_recent;
    private String lc_channel_recent;
    private Date jj_due_date_recent;
    private double jj_due_amt_recent;
    private String jj_channel_recent;
    private Date gz_due_date_recent;
    private double gz_due_amt_recent;
    private String gz_channel_recent;
    private Date bx_due_date_recent;
    private double bx_due_amt_recent;
    private String bx_channel_recent;
    private double hq_1m_amt;
    private double hq_2m_amt;
    private double hq_3m_amt;
    private double hq_4m_amt;
    private double hq_5m_amt;
    private double hq_6m_amt;
    private double dq_1m_amt;
    private double dq_2m_amt;
    private double dq_3m_amt;
    private double dq_4m_amt;
    private double dq_5m_amt;
    private double dq_6m_amt;
    private double jj_1m_amt;
    private double jj_2m_amt;
    private double jj_3m_amt;
    private double jj_4m_amt;
    private double jj_5m_amt;
    private double jj_6m_amt;
    private double gz_1m_amt;
    private double gz_2m_amt;
    private double gz_3m_amt;
    private double gz_4m_amt;
    private double gz_5m_amt;
    private double gz_6m_amt;
    private double lc_1m_amt;
    private double lc_2m_amt;
    private double lc_3m_amt;
    private double lc_4m_amt;
    private double lc_5m_amt;
    private double lc_6m_amt;
    private double bx_1m_amt;
    private double bx_2m_amt;
    private double bx_3m_amt;
    private double bx_4m_amt;
    private double bx_5m_amt;
    private double bx_6m_amt;
    private double bx_7m_amt;


    // 活期交易表 DSP_TRANS 137-2

    //    private double acctdt;
    //    private double idno;
    private double monthoutamt01;
    private double monthoutamt02;
    private double monthoutamt03;
    private double monthoutamt06;
    private double monthoutamt12;
    private double monthinamt01;
    private double monthinamt02;
    private double monthinamt03;
    private double monthinamt06;
    private double monthinamt12;
    private double monthdrawnum01;
    private double monthdrawnum02;
    private double monthdrawnum03;
    private double monthdrawnum06;
    private double monthdrawnum12;
    private double monthdrawamt01;
    private double monthdrawamt02;
    private double monthdrawamt03;
    private double monthdrawamt06;
    private double monthdrawamt12;
    private double monthdepositnum01;
    private double monthdepositnum02;
    private double monthdepositnum03;
    private double monthdepositnum06;
    private double monthdepositnum12;
    private double monthdepositamt01;
    private double monthdepositamt02;
    private double monthdepositamt03;
    private double monthdepositamt06;
    private double monthdepositamt12;
    private double monthconsumenum01;
    private double monthconsumenum02;
    private double monthconsumenum03;
    private double monthconsumenum06;
    private double monthconsumenum12;
    private double monthconsumeamt01;
    private double monthconsumeamt02;
    private double monthconsumeamt03;
    private double monthconsumeamt06;
    private double monthconsumeamt12;
    private double monthkuaijienum01;
    private double monthkuaijienum02;
    private double monthkuaijienum03;
    private double monthkuaijienum06;
    private double monthkuaijienum12;
    private double monthkuaijieamt01;
    private double monthkuaijieamt02;
    private double monthkuaijieamt03;
    private double monthkuaijieamt06;
    private double monthkuaijieamt12;
    private double monthatmoutnum01;
    private double monthatmoutnum02;
    private double monthatmoutnum03;
    private double monthatmoutnum06;
    private double monthatmoutnum12;
    private double monthatmoutamt01;
    private double monthatmoutamt02;
    private double monthatmoutamt03;
    private double monthatmoutamt06;
    private double monthatmoutamt12;
    private double monthatminnum01;
    private double monthatminnum02;
    private double monthatminnum03;
    private double monthatminnum06;
    private double monthatminnum12;
    private double monthatminamt01;
    private double monthatminamt02;
    private double monthatminamt03;
    private double monthatminamt06;
    private double monthatminamt12;
    private double monthcntoutnum01;
    private double monthcntoutnum02;
    private double monthcntoutnum03;
    private double monthcntoutnum06;
    private double monthcntoutnum12;
    private double monthcntoutamt01;
    private double monthcntoutamt02;
    private double monthcntoutamt03;
    private double monthcntoutamt06;
    private double monthcntoutamt12;
    private double monthcntinnum01;
    private double monthcntinnum02;
    private double monthcntinnum03;
    private double monthcntinnum06;
    private double monthcntinnum12;
    private double monthcntinamt01;
    private double monthcntinamt02;
    private double monthcntinamt03;
    private double monthcntinamt06;
    private double monthcntinamt12;
    private double monthweboutnum01;
    private double monthweboutnum02;
    private double monthweboutnum03;
    private double monthweboutnum06;
    private double monthweboutnum12;
    private double monthweboutamt01;
    private double monthweboutamt02;
    private double monthweboutamt03;
    private double monthweboutamt06;
    private double monthweboutamt12;
    private double monthwebinnum01;
    private double monthwebinnum02;
    private double monthwebinnum03;
    private double monthwebinnum06;
    private double monthwebinnum12;
    private double monthwebinamt01;
    private double monthwebinamt02;
    private double monthwebinamt03;
    private double monthwebinamt06;
    private double monthwebinamt12;
    private double monthcelloutnum01;
    private double monthcelloutnum02;
    private double monthcelloutnum03;
    private double monthcelloutnum06;
    private double monthcelloutnum12;
    private double monthcelloutamt01;
    private double monthcelloutamt02;
    private double monthcelloutamt03;
    private double monthcelloutamt06;
    private double monthcelloutamt12;
    private double monthcellinnum01;
    private double monthcellinnum02;
    private double monthcellinnum03;
    private double monthcellinnum06;
    private double monthcellinnum12;
    private double monthcellinamt01;
    private double monthcellinamt02;
    private double monthcellinamt03;
    private double monthcellinamt06;
    private double monthcellinamt12;
    private double monthwagesamt01;
    private double monthwagesamt02;
    private double monthwagesamt03;
    private double monthwagesamt06;
    private double monthwagesamt12;


    // 理财信息表 DSP_financial  76-2

    //    private double acctdt;
    //    private double idno;
    private double dq_month_num;
    private double dq_zz_1ynum;
    private double dq_zz_2ynum;
    private double dq_zz_3ynum;
    private double dq_zz_5ynum;
    private double dq_other_num;
    private double dq_month_amt;
    private double dq_zz_1yamt;
    private double dq_zz_2yamt;
    private double dq_zz_3yamt;
    private double dq_zz_5yamt;
    private double dq_other_amt;
    private double dq_duedate;
    private double dq_dueamt;
    private double dq_monthdepositamt01;
    private double dq_monthdepositamt02;
    private double dq_monthdepositamt03;
    private double dq_monthdepositamt06;
    private double dq_monthdepositamt12;
    private double dq_monthdepositnum01;
    private double dq_monthdepositnum02;
    private double dq_monthdepositnum03;
    private double dq_monthdepositnum06;
    private double dq_monthdepositnum12;
    private double dq_monthdrawamt01;
    private double dq_monthdrawamt02;
    private double dq_monthdrawamt03;
    private double dq_monthdrawamt06;
    private double dq_monthdrawamt12;
    private double dq_monthdrawnum01;
    private double dq_monthdrawnum02;
    private double dq_monthdrawnum03;
    private double dq_monthdrawnum06;
    private double dq_monthdrawnum12;
    private double gf_balance;
    private double gf_preference;
    private double gf_open_balance;
    private double gf_closed_balance;
    private double gf_short_balance;
    private double gf_mid_balance;
    private double gf_long_balance;
    private double gf_close_time;
    private double gf_close_name;
    private double gf_close_amt;
    private double gf_opendate;
    private double gf_openorg;
    private double gf_closedate;
    private double gf_ftime;
    private double gf_ltime;
    private double gf_num;
    private double gf_rengou_amt;
    private double gf_open_amt;
    private double gf_closed_amt;
    private double gf_short_amt;
    private double gf_mid_amt;
    private double gf_long_amt;
    private double gf_dzyh_amt;
    private double gf_gm_amt;
    private double gf_other_amt;
    private double gf_buy_1mnum;
    private double gf_buy_1mamt;
    private double gf_redeem_1mamt;
    private double gf_buy_3mnum;
    private double gf_buy_3mamt;
    private double gf_redeem_3mamt;
    private double gf_buy_hynum;
    private double gf_buy_hyamt;
    private double gf_redeem_hyamt;
    private double gf_buy_1ynum;
    private double gf_buy_1yamt;
    private double gf_redeem_1yamt;
    private double gf_buy_2ynum;
    private double gf_buy_2yamt;
    private double gf_redeem_2yamt;


    // 信用卡表 DSP_CRCARD 75-2

    //    private double acctdt;
    //    private double cc_idno;
    private String cc_no;
    private String cc_cardclass;
    private String cc_org;
    private String cc_open_date;
    private String cc_active_date;
    private double cc_card_num;
    private double cc_stament_day;
    private double cc_stament_amt;
    private double cc_podouble;
    private double cc_bal_amt;
    private double cc_amort_amt;
    private double cc_amort_num;
    private double cc_risk_class;
    private double cc_overdue_amt;
    private double cc_overdue_date;
    private double cc_creditmax_amt;
    private double cc_cashmax_amt;
    private String cc_auto_repay;
    private double cc_m3_active_acct_flag;
    private double cc_sleep_flag;
    private double cc_avg_bal_amt_1m;
    private double cc_avg_bal_amt_3m;
    private double cc_avg_bal_amt_6m;
    private double cc_avg_bal_amt_9m;
    private double cc_avg_bal_amt_12m;
    private double cc_overdue_fre_1m;
    private double cc_overdue_fre_3m;
    private double cc_overdue_fre_6m;
    private double cc_overdue_fre_12m;
    private double cc_double_12m;
    private double cc_late_fee_12m;
    private double cc_annual_fee_12m;
    private double cc_service_fee_12m;
    private double cc_consume_1m;
    private double cc_repay_1m;
    private double cc_cash_1m;
    private double cc_bystage_1m;
    private double cc_consume_num_1m;
    private double cc_repay_num_1m;
    private double cc_cash_num_1m;
    private double cc_bystage_num_1m;
    private double cc_consume_2m;
    private double cc_repay_2m;
    private double cc_cash_2m;
    private double cc_bystage_2m;
    private double cc_consume_num_2m;
    private double cc_repay_num_2m;
    private double cc_cash_num_2m;
    private double cc_bystage_num_2m;
    private double cc_consume_3m;
    private double cc_repay_3m;
    private double cc_cash_3m;
    private double cc_bystage_3m;
    private double cc_consume_num_3m;
    private double cc_repay_num_3m;
    private double cc_cash_num_3m;
    private double cc_bystage_num_3m;
    private double cc_consume_6m;
    private double cc_repay_6m;
    private double cc_cash_6m;
    private double cc_bystage_6m;
    private double cc_consume_num_6m;
    private double cc_repay_num_6m;
    private double cc_cash_num_6m;
    private double cc_bystage_num_6m;
    private double cc_consume_12m;
    private double cc_repay_12m;
    private double cc_cash_12m;
    private double cc_bystage_12m;
    private double cc_consume_num_12m;
    private double cc_repay_num_12m;
    private double cc_cash_num_12m;
    private double cc_bystage_num_12m;


    // 信用卡MCC表 DSP_CARDMCC 174-1

    //    private double acctdt;
    private double mcc_prefer1_flg;
    private double mcc_prefer2_flg;
    private double mcc_prefer3_flg;
    private double mcc_biz_yn;
    private double mcc_canyin_level;
    private double mcc_canyin_time_flg;
    private double mcc_catering_date_last;
    private double mcc_catering_amt_1m_sum;
    private double mcc_catering_cnt_1m_sum;
    private double mcc_canyin_amt_2m_avg;
    private double mcc_canyin_cnt_2m_avg;
    private double mcc_canyin_amt_3m_avg;
    private double mcc_canyin_cnt_3m_avg;
    private double mcc_canyin_amt_6m_avg;
    private double mcc_canyin_cnt_6m_avg;
    private double mcc_canyin_amt_12m_avg;
    private double mcc_canyin_cnt_12m_avg;
    private double mcc_shopping_level;
    private double mcc_shopping_time_flg;
    private double mcc_shopping_date_last;
    private double mcc_shopping_amt_1m_sum;
    private double mcc_shopping_cnt_1m_sum;
    private double mcc_shopping_amt_2m_avg;
    private double mcc_shopping_cnt_2m_avg;
    private double mcc_shopping_amt_3m_avg;
    private double mcc_shopping_cnt_3m_avg;
    private double mcc_shopping_amt_6m_avg;
    private double mcc_shopping_cnt_6m_avg;
    private double mcc_shopping_amt_12m_avg;
    private double mcc_shopping_cnt_12m_avg;
    private double mcc_leisure_level;
    private double mcc_leisure_time_flg;
    private double mcc_leisure_date_last;
    private double mcc_leisure_amt_1m_sum;
    private double mcc_leisure_cnt_1m_sum;
    private double mcc_leisure_amt_2m_avg;
    private double mcc_leisure_cnt_2m_avg;
    private double mcc_leisure_amt_3m_avg;
    private double mcc_leisure_cnt_3m_avg;
    private double mcc_leisure_amt_6m_avg;
    private double mcc_leisure_cnt_6m_avg;
    private double mcc_leisure_amt_12m_avg;
    private double mcc_leisure_cnt_12m_avg;
    private double mcc_bigdeals_date_last;
    private double mcc_bigdeals_time_flg;
    private double mcc_bigdeals_amt_1m_sum;
    private double mcc_bigdeals_cnt_1m_sum;
    private double mcc_bigdeals_amt_3m_sum;
    private double mcc_bigdeals_cnt3m_sum;
    private double mcc_bigdeals_amt_6m_sum;
    private double mcc_bigdeals_cnt_6m_sum;
    private double mcc_bigdeals_amt_12m_sum;
    private double mcc_bigdeals_cnt_12m_sum;
    private double mcc_abroad_date_last;
    private double mcc_abroad_place_last;
    private double mcc_abroad_time_flg;
    private double mcc_abroad_1m_amt;
    private double mcc_abroad_1m_cnt;
    private double mcc_abroad_6m_amt_avg;
    private double mcc_abroad_6m_cnt_avg;
    private double mcc_abroad_12m_amt_avg;
    private double mcc_abroad_12m_cnt_avg;
    private double mcc_service_date_last;
    private double mcc_service_time_flg;
    private double mcc_service_amt_1m_sum;
    private double mcc_service_cnt_1m_sum;
    private double mcc_service_amt_3m_avg;
    private double mcc_service_cnt_3m_avg;
    private double mcc_service_amt_6m_avg;
    private double mcc_service_cnt_6m_avg;
    private double mcc_service_amt_12m_avg;
    private double mcc_service_cnt_12m_avg;
    private double mcc_carrelative_date_last;
    private double mcc_carrelative_time_flg;
    private double mcc_carrelative_amt_1m_sum;
    private double mcc_carrelative_cnt_1m_sum;
    private double mcc_carrelative_amt_6m_avg;
    private double mcc_carrelative_cnt_6m_avg;
    private double mcc_carrelative_amt_12m_avg;
    private double mcc_carrelative_cnt_12m_avg;
    private double mcc_costume_date_last;
    private double mcc_costume_time_flg;
    private double mcc_costume_amt_1m_sum;
    private double mcc_costume_cnt_1m_sum;
    private double mcc_costume_amt_6m_avg;
    private double mcc_costume_cnt_6m_avg;
    private double mcc_costume_amt_12m_avg;
    private double mcc_costume_cnt_12m_avg;
    private double mcc_buycar_last_date;
    private double mcc_buycar_last_amt;
    private double mcc_secondhandcar_last_yn;
    private double mcc_buycar_total_cnt;
    private double mcc_buycar_total_amt;
    private double mcc_fin_date_last;
    private double mcc_fin_amt_1m_sum;
    private double mcc_fin_cnt_1m_sum;
    private double mcc_fin_amt_3m_avg;
    private double mcc_fin_cnt_3m_avg;
    private double mcc_fin_amt_6m_avg;
    private double mcc_fin_cnt_6m_avg;
    private double mcc_fin_amt_12m_avg;
    private double mcc_fin_cnt_12m_avg;
    private double mcc_insurance_date_last;
    private double mcc_insurance_1m_avg;
    private double mcc_insurance_cnt_1m_avg;
    private double mcc_insurance_6m_avg;
    private double mcc_insurance_cnt_6m_avg;
    private double mcc_insurance_amt_12m_avg;
    private double mcc_insurance_cnt_12m_avg;
    private double mcc_airplane_last_date;
    private double mcc_airplane_6m_amt_avg;
    private double mcc_airplane_6m_cnt_avg;
    private double mcc_airplane_1y_amt_avg;
    private double mcc_airplane_1y_cnt_avg;
    private double mcc_alcohol_last_date;
    private double mcc_alcohol_1m_amt;
    private double mcc_alcohol_1m_cnt;
    private double mcc_alcohol_6m_amt_avg;
    private double mcc_alcohol_6m_cnt_avg;
    private double mcc_alcohol_12m_amt_avg;
    private double mcc_alcohol_12m_cnt_avg;
    private double mcc_drinkplace_last_date;
    private double mcc_drinkplace_6m_amt_avg;
    private double mcc_drinkplace_6m_cnt_avg;
    private double mcc_drinkplace_12m_amt_avg;
    private double mcc_drinkplace_12m_cnt_avg;
    private double mcc_mombaby_last_date;
    private double mcc_mombaby_6m_amt_avg;
    private double mcc_mombaby_6m_cnt_avg;
    private double mcc_mombaby_12m_amt_avg;
    private double mcc_mombaby_12m_cnt_avg;
    private double mcc_pets_last_date;
    private double mcc_pets_6m_amt_avg;
    private double mcc_pets_6m_cnt_avg;
    private double mcc_pets_12m_amt_avg;
    private double mcc_pets_12m_cnt_avg;
    private double mcc_edu_last_date;
    private double mcc_edu_6m_amt_avg;
    private double mcc_edu_6m_cnt_avg;
    private double mcc_edu_1y_amt;
    private double mcc_edu_1y_cnt;
    private double mcc_medical_last_date;
    private double mcc_medical_6m_amt_avg;
    private double mcc_medical_6m_cnt_avg;
    private double mcc_medical_12m_amt_avg;
    private double mcc_medical_12m_cnt_avg;
    private double mcc_travel_last_date;
    private double mcc_travel_6m_amt_avg;
    private double mcc_travel_6m_cnt_avg;
    private double mcc_travel_1y_amt_avg;
    private double mcc_travel_1y_cnt_avg;
    private double mcc_clubs_last_date;
    private double mcc_clubs_6m_amt_avg;
    private double mcc_clubs_6m_cnt_avg;
    private double mcc_clubs_1y_amt_avg;
    private double mcc_clubs_1y_cnt_avg;
    private double mcc_sports_last_date;
    private double mcc_sports_6m_amt_avg;
    private double mcc_sports_6m_cnt_avg;
    private double mcc_sports_12m_amt_avg;
    private double mcc_sports_12m_cnt_avg;
    private double mcc_cosmetic_last_date;
    private double mcc_cosmetic_6m_amt_avg;
    private double mcc_cosmetic_6m_cnt_avg;
    private double mcc_cosmetic_12m_amt_avg;
    private double mcc_cosmetic_12m_cnt_avg;
    private double mcc_luxury_last_date;
    private double mcc_luxury_1m_amt;
    private double mcc_luxury_1m_cnt;
    private double mcc_luxury_6m_amt_avg;
    private double mcc_luxury_6m_cnt_avg;
    private double mcc_luxury_1y_amt_avg;
    private double mcc_luxury_1y_cnt_avg;


    // 个人贷款表 DSP_CREDIT 46-2

    //    private double acctdt;
    //    private double idno;
    private String loan_level_five_class;
    private double pay_loan_num;
    private double pay_loan_amt;
    private double unpay_loan_num;
    private double unpay_loan_amt;
    private double unpay_loan_bal;
    private double unpay_loan_max_month;
    private double loan_overdue_amt;
    private double loan_overdue_max_day;
    private double loan_overdue_pastmax_day;
    private double loan_overdue_num;
    private double loan_1m_num;
    private double loan_halfy_num;
    private double loan_halfy_amt;
    private double loan_1y_num;
    private double loan_1y_amt;
    private double loan_2y_num;
    private double loan_2y_amt;
    private double loan_3y_num;
    private double loan_3y_amt;
    private double unpay_consumer_loan_num;
    private double unpay__consumer_loan_amt;
    private double unpay_consumer_loan_bal;
    private double unpay_consumer_loan_max_month;
    private double pay_consumer_loan_num;
    private double pay_consumer_loan_amt;
    private double unpay_house_loan_num;
    private double unpay__house_loan_amt;
    private double unpay_house_loan_bal;
    private double unpay_house_loan_max_month;
    private double pay_house_loan_num;
    private double pay_house_loan_amt;
    private double unpay_car_loan_num;
    private double unpay__car_loan_amt;
    private double unpay_car_loan_bal;
    private double unpay_car_loan_max_month;
    private double pay_car_loan_num;
    private double pay_car_loan_amt;
    private double unpay_cc_loan_num;
    private double unpay__cc_loan_amt;
    private double unpay_cc_loan_bal;
    private double unpay_cc_loan_max_month;
    private double pay_ccloan_num;
    private double pay_cc_loan_amt;
}

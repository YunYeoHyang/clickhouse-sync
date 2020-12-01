package com.dingshudata.entity.tables;

import lombok.Data;

import java.util.Date;

/**
 * 信用卡表
 */
@Data
public class CreditCard {
    private Date acctdt;
    private String cc_idno;
    private String cc_no;
    private String cc_cardclass;
    private String cc_org;
    private String cc_open_date;
    private String cc_active_date;
    private int cc_card_num;
    private int cc_stament_day;
    private double cc_stament_amt;
    private int cc_point;
    private double cc_bal_amt;
    private double cc_amort_amt;
    private int cc_amort_num;
    private int cc_risk_class;
    private double cc_overdue_amt;
    private int cc_overdue_date;
    private double cc_creditmax_amt;
    private double cc_cashmax_amt;
    private String cc_auto_repay;
    private int cc_m3_active_acct_flag;
    private int cc_sleep_flag;
    private double cc_avg_bal_amt_1m;
    private double cc_avg_bal_amt_3m;
    private double cc_avg_bal_amt_6m;
    private double cc_avg_bal_amt_9m;
    private double cc_avg_bal_amt_12m;
    private int cc_overdue_fre_1m;
    private int cc_overdue_fre_3m;
    private int cc_overdue_fre_6m;
    private int cc_overdue_fre_12m;
    private double cc_int_12m;
    private double cc_late_fee_12m;
    private double cc_annual_fee_12m;
    private double cc_service_fee_12m;
    private double cc_consume_1m;
    private double cc_repay_1m;
    private double cc_cash_1m;
    private double cc_bystage_1m;
    private int cc_consume_num_1m;
    private int cc_repay_num_1m;
    private int cc_cash_num_1m;
    private int cc_bystage_num_1m;
    private double cc_consume_2m;
    private double cc_repay_2m;
    private double cc_cash_2m;
    private double cc_bystage_2m;
    private int cc_consume_num_2m;
    private int cc_repay_num_2m;
    private int cc_cash_num_2m;
    private int cc_bystage_num_2m;
    private double cc_consume_3m;
    private double cc_repay_3m;
    private double cc_cash_3m;
    private double cc_bystage_3m;
    private int cc_consume_num_3m;
    private int cc_repay_num_3m;
    private int cc_cash_num_3m;
    private int cc_bystage_num_3m;
    private double cc_consume_6m;
    private double cc_repay_6m;
    private double cc_cash_6m;
    private double cc_bystage_6m;
    private int cc_consume_num_6m;
    private int cc_repay_num_6m;
    private int cc_cash_num_6m;
    private int cc_bystage_num_6m;
    private double cc_consume_12m;
    private double cc_repay_12m;
    private double cc_cash_12m;
    private double cc_bystage_12m;
    private int cc_consume_num_12m;
    private int cc_repay_num_12m;
    private int cc_cash_num_12m;
    private int cc_bystage_num_12m;
}

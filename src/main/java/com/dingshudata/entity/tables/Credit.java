package com.dingshudata.entity.tables;

import lombok.Data;

import java.util.Date;

/**
 * 个人贷款表
 */
@Data
public class Credit {
    private Date acctdt;
    private String idno;
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

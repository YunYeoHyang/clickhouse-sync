package com.dingshudata.entity.tables;

import lombok.Data;

import java.util.Date;

/**
 * 理财信息表
 */
@Data
public class Financial {
    private Date acctdt;
    private String idno;
    private int dq_month_num;
    private int dq_zz_1ynum;
    private int dq_zz_2ynum;
    private int dq_zz_3ynum;
    private int dq_zz_5ynum;
    private int dq_other_num;
    private int dq_month_amt;
    private double dq_zz_1yamt;
    private double dq_zz_2yamt;
    private double dq_zz_3yamt;
    private double dq_zz_5yamt;
    private double dq_other_amt;
    private int dq_duedate;
    private double dq_dueamt;
    private double dq_monthdepositamt01;
    private double dq_monthdepositamt02;
    private double dq_monthdepositamt03;
    private double dq_monthdepositamt06;
    private double dq_monthdepositamt12;
    private int dq_monthdepositnum01;
    private int dq_monthdepositnum02;
    private int dq_monthdepositnum03;
    private int dq_monthdepositnum06;
    private int dq_monthdepositnum12;
    private double dq_monthdrawamt01;
    private double dq_monthdrawamt02;
    private double dq_monthdrawamt03;
    private double dq_monthdrawamt06;
    private double dq_monthdrawamt12;
    private int dq_monthdrawnum01;
    private int dq_monthdrawnum02;
    private int dq_monthdrawnum03;
    private int dq_monthdrawnum06;
    private int dq_monthdrawnum12;
    private double gf_balance;
    private double gf_preference;
    private double gf_open_balance;
    private double gf_closed_balance;
    private double gf_short_balance;
    private double gf_mid_balance;
    private double gf_long_balance;
    private int gf_close_time;
    private int gf_close_name;
    private double gf_close_amt;
    private Date gf_opendate;
    private String gf_openorg;
    private Date gf_closedate;
    private int gf_ftime;
    private int gf_ltime;
    private int gf_num;
    private double gf_rengou_amt;
    private double gf_open_amt;
    private double gf_closed_amt;
    private double gf_short_amt;
    private double gf_mid_amt;
    private double gf_long_amt;
    private double gf_dzyh_amt;
    private double gf_gm_amt;
    private double gf_other_amt;
    private int gf_buy_1mnum;
    private double gf_buy_1mamt;
    private double gf_redeem_1mamt;
    private int gf_buy_3mnum;
    private double gf_buy_3mamt;
    private double gf_redeem_3mamt;
    private int gf_buy_hynum;
    private double gf_buy_hyamt;
    private double gf_redeem_hyamt;
    private int gf_buy_1ynum;
    private double gf_buy_1yamt;
    private double gf_redeem_1yamt;
    private int gf_buy_2ynum;
    private double gf_buy_2yamt;
    private double gf_redeem_2yamt;
}

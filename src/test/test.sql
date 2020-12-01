create table cmcc_test on cluster cmcc_cluster_replicas
(
    phone_no                String comment '基本信息:手机号',
    imei                    String comment '基本信息:当前IMEI',
    age                     UInt8 comment '基础特征:年龄',
    gender                  UInt8 comment '基础特征:性别',
    innet_month             UInt16 comment '基础特征:手机号入网时长',
    grp_mbr_flag            UInt8 comment '基础特征:集团客户标识',
    innet_area              String comment '基础特征:手机号归属地',
    vip                     UInt8 comment '基础特征:客户星级',
    factory_desc            String comment '基础特征:当前终端品牌',
    device_month            UInt16 comment '基础特征:当前终端使用时长',
    mon_fee                 Float64 comment '基础特征:当月总费用',
    inter_toll_fee          Float64 comment '基础特征:当月国际长途费用',
    inter_roam_fee          Float64 comment '基础特征:当月国际漫游费用',
    out_num                 UInt16 comment '基础特征:当月主叫次数',
    in_num                  UInt16 comment '基础特征:当月被叫次数',
    out_dura                UInt16 comment '基础特征:当月主叫时长',
    in_dura                 UInt16 comment '基础特征:当月被叫时长',
    coun_roam_num           UInt16 comment '基础特征:当月国内漫游通话次数',
    coun_toll_num           UInt16 comment '基础特征:当月国内长途通话次数',
    total_flux              Float64 comment '基础特征:当月使用总流量',
    resident_area           String comment '基础特征:手机常驻地',
    home_work_distance      Float64 comment '基础特征:日夜常驻地距离',
    gat_visit_days_m6       UInt16 comment '基础特征:近6个月去港澳台的天数',
    asia_visit_days_m6      UInt16 comment '基础特征:近6个月去亚洲国家的天数',
    us_euro_visit_days_m6   UInt16 comment '基础特征:近6个月去欧美国家的天数',
    bank_sms_num            UInt16 comment '基础特征:通话、短信特征:银行短信次数',
    bank_sms_cnt            UInt16 comment '基础特征:通话、短信特征:银行短信家数',
    creditcash              UInt16 comment '客户风险画像:套现标签',
    gamrisk                 UInt16 comment '客户风险画像:赌博标签',
    unusualnumber           UInt16 comment '客户风险画像:小号标签',
    maintenancenumber       UInt16 comment '客户风险画像:养卡标签',
    weichat_days            UInt16 comment 'app类特征:微信使用天数',
    weichat_flux            Float64 comment 'app类特征:微信使用流量',
    flightapp_cnt           UInt16 comment 'app类特征:航空类app使用个数',
    flightapp_days          UInt16 comment 'app类特征:航空类app使用天数',
    flightapp_flux          Float64 comment 'app类特征:航空类app使用流量',
    videoapp_cnt            UInt16 comment 'app类特征:视频类app使用个数',
    videoapp_days           UInt16 comment 'app类特征:视频类app使用天数',
    videoapp_flux           Float64 comment 'app类特征:视频类app使用流量',
    oversea_edu_cnt         UInt16 comment 'app类特征:留学教育类app使用个数',
    oversea_edu_days        UInt16 comment 'app类特征:留学教育类app使用天数',
    oversea_edu_flux        Float64 comment 'app类特征:留学教育类app使用流量',
    vocational_edu_cnt      UInt16 comment 'app类特征:职业教育类app使用个数',
    vocational_edu_days     UInt16 comment 'app类特征:职业教育类app使用天数',
    vocational_edu_flux     Float64 comment 'app类特征:职业教育类app使用流量',
    school_edu_cnt          UInt16 comment 'app类特征:中小学教育类app使用个数',
    school_edu_days         UInt16 comment 'app类特征:中小学教育类app使用天数',
    school_edu_flux         Float64 comment 'app类特征:中小学教育类app使用流量',
    jobapp_cnt              UInt16 comment 'app类特征:职场类app使用个数',
    jobapp_days             UInt16 comment 'app类特征:职场类app使用天数',
    jobapp_flux             Float64 comment 'app类特征:职场类app使用流量',
    babyapp_cnt             UInt16 comment 'app类特征:母婴类app使用个数',
    babyapp_days            UInt16 comment 'app类特征:母婴类app使用天数',
    babyapp_flux            Float64 comment 'app类特征:母婴类app使用流量',
    taobao_days             UInt16 comment 'app类特征:淘宝使用天数',
    taobao_flux             Float64 comment 'app类特征:淘宝使用流量',
    jd_days                 UInt16 comment 'app类特征:京东使用天数',
    jd_flux                 Float64 comment 'app类特征:京东使用流量',
    shopapp_cnt             UInt16 comment 'app类特征:购物类app使用个数',
    shopapp_days            UInt16 comment 'app类特征:购物类app使用天数',
    shopapp_flux            Float64 comment 'app类特征:购物类app使用流量',
    car_trade_cnt           UInt16 comment 'app类特征:汽车交易类app使用个数',
    car_trade_days          UInt16 comment 'app类特征:汽车交易类app使用天数',
    car_trade_flux          Float64 comment 'app类特征:汽车交易类app使用流量',
    car_maintenance_cnt     UInt16 comment 'app类特征:汽车保养类app使用个数',
    car_maintenance_days    UInt16 comment 'app类特征:汽车保养类app使用天数',
    car_maintenance_flux    Float64 comment 'app类特征:汽车保养类app使用流量',
    house_trade_cnt         UInt16 comment 'app类特征:房屋交易类app使用个数',
    house_trade_days        UInt16 comment 'app类特征:房屋交易类app使用天数',
    house_trade_flux        Float64 comment 'app类特征:房屋交易类app使用流量',
    house_decoration_cnt    UInt16 comment 'app类特征:房屋装修类app使用个数',
    house_decoration_days   UInt16 comment 'app类特征:房屋装修类app使用天数',
    house_decoration_flux   Float64 comment 'app类特征:房屋装修类app使用流量',
    alipay_days             UInt16 comment 'app类特征:支付宝使用天数',
    alipay_flux             Float64 comment 'app类特征:支付宝使用流量',
    bondapp_cnt             UInt16 comment 'app类特征:股票类app使用个数',
    bondapp_days            UInt16 comment 'app类特征:股票类app使用天数',
    bondapp_flux            Float64 comment 'app类特征:股票类app使用流量',
    econapp_cnt             UInt16 comment 'app类特征:理财类app使用个数',
    econapp_days            UInt16 comment 'app类特征:理财类app使用天数',
    econapp_flux            Float64 comment 'app类特征:理财类app使用流量',
    loanapp_cnt             UInt16 comment 'app类特征:贷款类app使用个数',
    loanapp_days            UInt16 comment 'app类特征:贷款类app使用天数',
    loanapp_flux            Float64 comment 'app类特征:贷款类app使用流量',
    insapp_cnt              UInt16 comment 'app类特征:保险类app使用个数',
    insapp_days             UInt16 comment 'app类特征:保险类app使用天数',
    insapp_flux             Float64 comment 'app类特征:保险类app使用流量',
    cfapp_cnt               UInt16 comment 'app类特征:消金类app使用个数',
    cfapp_days              UInt16 comment 'app类特征:消金类app使用天数',
    cfapp_flux              Float64 comment 'app类特征:消金类app使用流量',
    microcredit_cnt         UInt16 comment 'app类特征:网络小贷类app使用个数',
    microcredit_days        UInt16 comment 'app类特征:网络小贷类app使用天数',
    microcredit_flux        Float64 comment 'app类特征:网络小贷类app使用流量',
    creditapp_cnt           UInt16 comment 'app类特征:信用卡类app使用个数',
    creditapp_days          UInt16 comment 'app类特征:信用卡类app使用天数',
    creditapp_flux          Float64 comment 'app类特征:信用卡类app使用流量',
    futures_cnt             UInt16 comment 'app类特征:期货贵金属类app使用个数',
    futures_days            UInt16 comment 'app类特征:期货贵金属类app使用天数',
    futures_flux            Float64 comment 'app类特征:期货贵金属类app使用流量',
    bankapp_cnt             UInt16 comment 'app类特征:银行类app使用个数',
    bankapp_days            UInt16 comment 'app类特征:银行类app使用天数',
    bankapp_flux            Float64 comment 'app类特征:银行类app使用流量',
    fundapp_cnt             UInt16 comment 'app类特征:基金类app使用个数',
    fundapp_days            UInt16 comment 'app类特征:基金类app使用天数',
    fundapp_flux            Float64 comment 'app类特征:基金类app使用流量',
    flightapp_cnt_m3        UInt16 comment '基础特征:最近3个月航空类app使用个数',
    videoapp_cnt_m3         UInt16 comment '基础特征:最近3个月视频类app使用个数',
    oversea_edu_cnt_m3      UInt16 comment '基础特征:最近3个月留学教育类app使用个数',
    vocational_edu_cnt_m3   UInt16 comment '基础特征:最近3个月职业教育类app使用个数',
    school_edu_cnt_m3       UInt16 comment '基础特征:最近3个月中小学教育类app使用个数',
    jobapp_cnt_m3           UInt16 comment '基础特征:最近3个月职场类app使用个数',
    babyapp_cnt_m3          UInt16 comment '基础特征:最近3个月母婴类app使用个数',
    shopapp_cnt_m3          UInt16 comment '基础特征:最近3个月购物类app使用个数',
    car_trade_cnt_m3        UInt16 comment '基础特征:最近3个月汽车交易类app使用个数',
    car_maintenance_cnt_m3  UInt16 comment '基础特征:最近3个月汽车保养类app使用个数',
    house_trade_cnt_m3      UInt16 comment '基础特征:最近3个月房屋交易类app使用个数',
    house_decoration_cnt_m3 UInt16 comment '基础特征:最近3个月房屋装修类app使用个数',
    bondapp_cnt_m3          UInt16 comment '基础特征:最近3个月股票类app使用个数',
    econapp_cnt_m3          UInt16 comment '基础特征:最近3个月理财类app使用个数',
    loanapp_cnt_m3          UInt16 comment '基础特征:最近3个月贷款类app使用个数',
    insapp_cnt_m3           UInt16 comment '基础特征:最近3个月保险类app使用个数',
    cfapp_cnt_m3            UInt16 comment '基础特征:最近3个月消金类app使用个数',
    microcredit_cnt_m3      UInt16 comment '基础特征:最近3个月网络小贷类app使用个数',
    creditapp_cnt_m3        UInt16 comment '基础特征:最近3个月信用卡类app使用个数',
    futures_cnt_m3          UInt16 comment '基础特征:最近3个月期货贵金属类app使用个数',
    bankapp_cnt_m3          UInt16 comment '基础特征:最近3个月银行类app使用个数',
    fundapp_cnt_m3          UInt16 comment '基础特征:最近3个月基金类app使用个数',
    month_id                Date
) engine = ReplicatedReplacingMergeTree('/clickhouse/tables/01/cmcc_panorama', '{replica}')
      partition by toYYYYMM(month_id)
      order by (phone_no, month_id)
      primary key phone_no
      ttl month_id + interval 3 month

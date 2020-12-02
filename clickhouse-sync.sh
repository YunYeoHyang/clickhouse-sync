#!/bin/bash
ftp -n<<!
open 21.4.53.11
user etl lpx123!@#
binary
cd /etl/data/outerdata/DSP
lcd /home/panorama/data
prompt
mget *
close
bye
!
#####从数据中心服务器上的/etl/data/outerdata/DSP 的6个文件下载到 clickhouse服务器的/home/panorama/data ####


nohup clickhouse-client --database="panorama" --query="alter table panorama.Credit where 1=1" &
nohup clickhouse-client --database="panorama" --query="alter table panorama.CardMCC where 1=1" &
nohup clickhouse-client --database="panorama" --query="alter table panorama.CreditCard where 1=1" &
nohup clickhouse-client --database="panorama" --query="alter table panorama.CustomInfo where 1=1" &
nohup clickhouse-client --database="panorama" --query="alter table panorama.Financial where 1=1" &
nohup clickhouse-client --database="panorama" --query="alter table panorama.Trans where 1=1" &

##### 清空原始表数据 ####




nohup sed -i "s/~@~/,/g" `grep "~@~" -rl ./` &

##### 替换分隔符 ####




nohup cat DSP_CREDIT.txt | clickhouse-client --database="panorama" --query="insert into panorama.Credit FORMAT CSV" &
#nohup cat DSP_CARDMCC.txt | clickhouse-client --database="panorama" --query="insert into panorama.CardMCC FORMAT CSV" &
#nohup cat DSP_CRCCARD.txt | clickhouse-client --database="panorama" --query="insert into panorama.CreditCard FORMAT CSV" &
nohup cat DSP_CUSTOMINFO.txt | clickhouse-client --database="panorama" --query="insert into panorama.CustomInfo FORMAT CSV" &
#nohup cat DSP_FINANCIAL.txt | clickhouse-client --database="panorama" --query="insert into panorama.Financial FORMAT CSV" &
nohup cat DSP_TRANS.txt | clickhouse-client --database="panorama" --query="insert into panorama.Trans FORMAT CSV"

#nohup cat DSP_TRANS.txt | clickhouse-client --database="panorama" --query="insert into panorama.Trans FORMAT CustomSeparated SETTINGS format_custom_escaping_rule = 'CSV' , format_custom_field_delimiter = '~@~'"

##### 导入数据 ####
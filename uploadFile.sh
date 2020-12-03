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
echo "files upload end"
# !/bin/bash
#获取当前时间，例：2016-01-27 12:33:41       
datetime=`date "+%Y%m%d%H%M%S"`
# mysqldump -h10.1.1.92 -P3306 -utmsdev -ptmsdev --databases tmsdb_dev > /opt/backup/database/tmsdb_dev_$datetime.sql
mysqldump --opt --lock-tables=false -h10.1.1.92  -P3306 -utmsdev -ptmsdev --databases tmsdb_dev > /opt/backup/database/tmsdb_dev_$datetime.sql

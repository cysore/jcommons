grant all privileges on *.* to 'tmsdb_dev'@'%' identified by "tmsdb_dev" with grant option;

grant all privileges on *.* to 'tmsdev'@'%' identified by "tmsdev" with grant option;

flush privileges;

MySQL 5.6 警告信息 command line interface can be insecure 修复

/etc/my.cnf /etc/mysql/my.cnf /usr/etc/my.cnf ~/.my.cnf

[mysqldump]
user=tmsdev
password=tmsdev


mysqldump -h10.1.20.155  -P3306 -utmsdev -ptmsdev --databases tmsdb_dev > /opt/dbbackup/tmsdb_dev.sql

# 定时任务
*/10 * * * * /opt/task/clearCache.sh

0 30 12,18 * * ? /opt/task/backup-db-mysql-tms.sh

30 12,18 * * * /opt/task/backup-db-mysql-tms.sh

30 12,18 * * * /usr/local/etc/rc.d/lighttpd restart

# !/bin/bash
# 注意，我们这里使用了 "echo 3"，但是不推荐使用在产品环境中，应该使用 "echo 1"
sync && echo 3 > /proc/sys/vm/drop_caches
	
# !/bin/bash
#获取当前时间，例：2016-01-27 12:33:41       
datetime=`date "+%Y%m%d%H%M%S"`
mysqldump --opt --lock-tables=false -h10.1.1.92  -P3306 -utmsdev -ptmsdev --databases tmsdb_dev > /opt/backup/database/tmsdb_dev_$datetime.sql

# !/bin/bash
#获取当前时间，例：2015-03-11 12:33:41       
datetime=`date "+%Y-%m-%d %H:%M:%S"`
#将current转换为时间戳，精确到秒
timestamp=`date -d "$datetime" +%s`
#将current转换为时间戳，精确到毫秒
msTimestamp=$((timestamp*1000+`date "+%N"`/1000000)) 
echo $msTimestamp
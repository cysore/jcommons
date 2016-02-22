#!/bin/sh

v_pid=`ps -ef | grep /opt/apache-tomcat-7.0.65 | grep -v grep | awk '{print $2}'`

if [ ${v_pid} ] 
then
    echo "kill pid: ${v_pid}"
    kill -9 ${v_pid}
    /bin/sh /opt/apache-tomcat-7.0.65/bin/startup.sh
else    
    echo -e "start server"
    /bin/sh /opt/apache-tomcat-7.0.65/bin/startup.sh
fi


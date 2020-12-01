#!/usr/bin/env bash

export JAVA_HOME=/usr/java/jdk-11.0.7
JAVA_OPTS="-server -Xms2g -Xmx2g -Dfile.encoding=UTF-8"
BIN_DIR=$(dirname "$PWD")
JAR_NAME=clickhouse-sync-1.0.0.jar
JAR_PATH=${BIN_DIR}/jars/${JAR_NAME}
ARGS="--spring.config.location=file:${BIN_DIR}/config/application.yaml"
#PID  代表是PID文件
PID=${JAR_NAME}\.pid

#使用说明，用来提示输入参数
usage() {
    echo "Usage: sh start-application.sh [start|stop|restart|status]"
    exit 1
}

#检查程序是否在运行
is_exist(){
  pid=`ps -ef|grep ${JAR_NAME}|grep -v grep|awk '{print $2}' `
  #如果不存在返回1，存在返回0
  if [[ -z "${pid}" ]]; then
   return 1
  else
    return 0
  fi
}

#启动方法
start(){
  is_exist
  if [[ $? -eq "0" ]]; then
    echo ">>> ${JAR_NAME} is already running PID=${pid} <<<"
  else
    nohup ${JAVA_HOME}/bin/java ${JAVA_OPTS} -jar ${JAR_PATH} \
    --logging.file.path=${BIN_DIR}/logs \
    ${ARGS} > /dev/null 2>&1 &
    echo $! > ${PID}
    echo ">>> start $JAR_NAME successed PID=$! <<<"
   fi
  }

#停止方法
stop(){
  #is_exist
  pidf=$(cat ${PID})
  #echo "$pidf"
  echo ">>> api PID = $pidf begin kill $pidf <<<"
  kill ${pidf}
  rm -rf ${PID}
  sleep 2
  is_exist
  if [[ $? -eq "0" ]]; then
    echo ">>> api 2 PID = $pid begin kill -9 $pid  <<<"
    kill -9  ${pid}
    sleep 2
    echo ">>> $JAR_NAME process stopped <<<"
  else
    echo ">>> ${JAR_NAME} is not running <<<"
  fi
}

#输出运行状态
status(){
  is_exist
  if [[ $? -eq "0" ]]; then
    echo ">>> ${JAR_NAME} is running PID is ${pid} <<<"
  else
    echo ">>> ${JAR_NAME} is not running <<<"
  fi
}

#重启
restart(){
  stop
  start
}

#根据输入参数，选择执行对应方法，不输入则执行使用说明
case "$1" in
  "start")
    start
    ;;
  "stop")
    stop
    ;;
  "status")
    status
    ;;
  "restart")
    restart
    ;;
  *)
    usage
    ;;
esac
exit 0
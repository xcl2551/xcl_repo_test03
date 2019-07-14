#!/bin/bash
export SCDA_PATH=/home/wangguan/scda/scda-jar
export PURCHASECONTROL=scda-service-purchasecontrol.jar
export PURCHASEEXECUTE=scda-service-purchaseexecute.jar
export PURCHASETIME=scda-service-purchasetime.jar




export PURCHASECONTROL_port=32001
export PURCHASEEXECUTE_port=32101
export PURCHASETIME_port=32201





case "$1" in

start)
        ## start purchasecontrol
        echo "--------purchasecontrol start--------------"
                cd $SCDA_PATH
        nohup java  -jar $PURCHASECONTROL >/dev/null 2>&1 &
        PURCHASECONTROL_pid=`lsof -i:$PURCHASECONTROL_port|grep "LISTEN"|awk '{print $2}'`
        until [ -n "$PURCHASECONTROL_pid" ]
            do
              PURCHASECONTROL_pid=`lsof -i:$PURCHASECONTROL_port|grep "LISTEN"|awk '{print $2}'`
            done
        echo "purchasecontrol pid is $PURCHASECONTROL_pid"
        echo "--------purchasecontrol start successed--------------"
        ## start purchaseexecute
        echo "--------purchaseexecute start--------------"
                cd $SCDA_PATH
        nohup java  -jar $PURCHASEEXECUTE >/dev/null 2>&1 &
        PURCHASEEXECUTE_pid=`lsof -i:$PURCHASEEXECUTE_port|grep "LISTEN"|awk '{print $2}'`
        until [ -n "$PURCHASEEXECUTE_pid" ]
            do
              PURCHASEEXECUTE_pid=`lsof -i:$PURCHASEEXECUTE_port|grep "LISTEN"|awk '{print $2}'`
            done
        echo "purchaseexecute pid is $PURCHASEEXECUTE_pid"
        echo "--------purchaseexecute start successed--------------"
		 ## start purchasetime
        echo "--------purchasetime start--------------"
                cd $SCDA_PATH
        nohup java  -jar $PURCHASETIME >/dev/null 2>&1 &
        PURCHASETIME_pid=`lsof -i:$PURCHASETIME_port|grep "LISTEN"|awk '{print $2}'`
        until [ -n "$PURCHASETIME_pid" ]
            do
              PURCHASETIME_pid=`lsof -i:$PURCHASETIME_port|grep "LISTEN"|awk '{print $2}'`
            done
        echo "purchasetime pid is $PURCHASETIME_pid"
        echo "--------purchasetime start successed--------------"


        ;;

 stop)
        P_ID=`ps -ef | grep -w $PURCHASECONTROL | grep -v "grep" | awk '{print $2}'`
        if [ "$P_ID" == "" ]; then
            echo "===PURCHASECONTROL process not exists or stop success"
        else
            kill -9 $P_ID
            echo "PURCHASECONTROL killed success"
        fi
        P_ID=`ps -ef | grep -w $PURCHASEEXECUTE | grep -v "grep" | awk '{print $2}'`
        if [ "$P_ID" == "" ]; then
            echo "===PURCHASEEXECUTE process not exists or stop success"
        else
            kill -9 $P_ID
            echo "PURCHASEEXECUTE killed success"
        fi
		P_ID=`ps -ef | grep -w $PURCHASETIME | grep -v "grep" | awk '{print $2}'`
        if [ "$P_ID" == "" ]; then
            echo "===PURCHASETIME process not exists or stop success"
        else
            kill -9 $P_ID
            echo "PURCHASETIME killed success"
        fi

        ;;

restart)
        $0 stop
        sleep 2
        $0 start
        echo "===restart success==="
        ;;
esac
exit 0

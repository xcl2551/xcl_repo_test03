package com.pccw.task.dbtask;

import com.pccw.framework.utils.ScdaDateFormartUtil;
import com.pccw.task.service.PurchasecontrolService;
import com.pccw.task.service.PurchaseexecuteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/**
 * @Author: xcl
 * @Date: 2019-4-8 16:57
 * @Version 1.0
 */

@Component
public class PurchaseexecuteTask {

    @Autowired
    private PurchaseexecuteService  purchaseexecuteService;

    //每天凌晨1点执行定时任务
   // @Scheduled(cron = "0 0 1 * * ? ")
    public void taskPurchaseexecute() {


    }


}

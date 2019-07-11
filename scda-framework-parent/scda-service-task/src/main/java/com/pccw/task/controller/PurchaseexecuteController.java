package com.pccw.task.controller;

import com.pccw.framework.model.response.CommonCode;
import com.pccw.framework.model.response.ResultCode;
import com.pccw.task.dbtask.PurchaseexecuteTask;
import com.pccw.task.service.PurchaseexecuteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: xcl
 * @Date: 2019-4-15 9:30
 * @Version 1.0
 */
@RestController
@RequestMapping("purchaseexecute")
public class PurchaseexecuteController {

    @Autowired
    private PurchaseexecuteService purchaseexecuteService;


    @GetMapping("/synPurchaseexecute")
    public  Map<String, String> synPurchaseexecute(){
        Map<String, String> stringStringMap = purchaseexecuteService.synPurchaseexecute();
        return stringStringMap;
    }
}

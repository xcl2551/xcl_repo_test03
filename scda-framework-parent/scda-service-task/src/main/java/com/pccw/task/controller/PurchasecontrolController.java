package com.pccw.task.controller;

import com.pccw.framework.model.response.CommonCode;
import com.pccw.framework.model.response.ResultCode;
import com.pccw.task.dbtask.PurchasecontrolTask;
import com.pccw.task.service.PurchasecontrolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: xcl
 * @Date: 2019-4-3 15:26
 * @Version 1.0
 */
@RestController
@RequestMapping("/purchasecontrol")
public class PurchasecontrolController {

    @Autowired
    private PurchasecontrolService purchasecontrolService;

    @GetMapping("/synPurchasecontrol")
    public Map<String, String> synPurchasecontrol(){
        Map<String, String> stringStringMap = purchasecontrolService.synPurchasecontrol();
        return stringStringMap;
    }

}

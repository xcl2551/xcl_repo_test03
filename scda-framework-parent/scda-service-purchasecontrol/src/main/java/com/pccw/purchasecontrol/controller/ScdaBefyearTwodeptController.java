package com.pccw.purchasecontrol.controller;

import com.pccw.api.purchasecontrol.ScdaBefyearTwodeptControllerApi;
import com.pccw.framework.domain.purchasecontrol.ScdaBefyearTwodept;
import com.pccw.framework.domain.purchasecontrol.ScdaPdrAndPpr;
import com.pccw.framework.domain.purchasecontrol.request.PurchaseControlRequest;
import com.pccw.framework.domain.purchasecontrol.response.ScdaBefyearTwodeptResult;
import com.pccw.framework.domain.purchasecontrol.response.ScdaPdrAndPprResult;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.purchasecontrol.service.ScdaBefyearTwodeptService;
import com.pccw.purchasecontrol.service.ScdaPdrAndPprService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: xcl
 * @Date: 2019-3-29 13:39
 * @Version 1.0
 */
@RestController
@RequestMapping("/scdaBefyearTwodept")
public class ScdaBefyearTwodeptController implements ScdaBefyearTwodeptControllerApi{


    @Autowired
    private ScdaBefyearTwodeptService befyearTwodeptService;

    /**
     * 按编号查询一条记录
     * @param purchaseControlRequest
     * @return
     */
    @PostMapping("/findOne")
    public ScdaBefyearTwodeptResult findOne(@RequestBody PurchaseControlRequest purchaseControlRequest){
        return befyearTwodeptService.findOne(purchaseControlRequest);
    }



    @PostMapping("/findPage")
    public QueryResponseResult<ScdaBefyearTwodept> findPage(@RequestBody PurchaseControlRequest purchaseControlRequest){
        return befyearTwodeptService.findPage(purchaseControlRequest);
    }



}

package com.pccw.purchasecontrol.controller;

import com.pccw.api.purchasecontrol.ScdaDeptPurDemandandpreControllerApi;
import com.pccw.framework.domain.purchasecontrol.ScdaDeptPurDemandandpre;
import com.pccw.framework.domain.purchasecontrol.request.PurchaseControlRequest;
import com.pccw.framework.domain.purchasecontrol.response.ScdaDeptPurDemandandpreResult;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.purchasecontrol.service.ScdaDeptPurDemandandpreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: xcl
 * @Date: 2019-4-1 15:37
 * @Version 1.0
 */
@RestController
@RequestMapping("/scdaDeptPurDemandandpre")
public class ScdaDeptPurDemandandpreController implements ScdaDeptPurDemandandpreControllerApi{

    @Autowired
    private ScdaDeptPurDemandandpreService deptPurDemandandpreService;



    /**
     * 按编号查询一条记录
     * @param purchaseControlRequest
     * @return
     */
    @PostMapping("/findOne")
    public ScdaDeptPurDemandandpreResult findOne(@RequestBody PurchaseControlRequest purchaseControlRequest){
        return deptPurDemandandpreService.findOne(purchaseControlRequest);
    }






    /**
     * 分页查询
     * @param purchaseControlRequest
     * @return
     */
    @PostMapping("/findPage")
    public QueryResponseResult<ScdaDeptPurDemandandpre> findPage(@RequestBody PurchaseControlRequest purchaseControlRequest){
        return deptPurDemandandpreService.findPage(purchaseControlRequest);
    }







}

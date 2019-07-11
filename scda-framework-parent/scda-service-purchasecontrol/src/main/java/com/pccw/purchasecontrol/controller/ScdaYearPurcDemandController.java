package com.pccw.purchasecontrol.controller;

import com.pccw.api.purchasecontrol.ScdaYearPurcDemandControllerApi;
import com.pccw.framework.domain.purchasecontrol.ScdaYearPurcDemand;
import com.pccw.framework.domain.purchasecontrol.request.PurchaseControlRequest;
import com.pccw.framework.domain.purchasecontrol.response.ScdaYearPurcDemandResult;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.purchasecontrol.service.ScdaYearPurcDemandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: xcl
 * @Date: 2019-3-29 17:28
 * @Version 1.0
 */
@RestController
@RequestMapping("/scdaYearPurcDemand")
public class ScdaYearPurcDemandController  implements ScdaYearPurcDemandControllerApi{

    @Autowired
    private ScdaYearPurcDemandService scdaYearPurcDemandService;


    /**
     * 按编号查询一条记录
     * @param purchaseControlRequest
     * @return
     */
    @PostMapping("/findOne")
    public ScdaYearPurcDemandResult findOne(@RequestBody PurchaseControlRequest purchaseControlRequest){
        return scdaYearPurcDemandService.findOne(purchaseControlRequest);
    }


    /**
     * 分页查询
     * @param purchaseControlRequest
     * @return
     */
    @GetMapping("/findPage")
    public QueryResponseResult<ScdaYearPurcDemand> findPage(@RequestBody PurchaseControlRequest purchaseControlRequest){

        return scdaYearPurcDemandService.findPage(purchaseControlRequest);
    }
}

package com.pccw.purchasecontrol.controller;

import com.pccw.api.purchasecontrol.ScdaYearTwodeptControllerApi;
import com.pccw.framework.domain.purchasecontrol.ScdaYearPurcDemand;
import com.pccw.framework.domain.purchasecontrol.ScdaYearTwodept;
import com.pccw.framework.domain.purchasecontrol.request.PurchaseControlRequest;
import com.pccw.framework.domain.purchasecontrol.response.ScdaYearPurcDemandResult;
import com.pccw.framework.domain.purchasecontrol.response.ScdaYearTwodeptResult;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.purchasecontrol.service.ScdaYearPurcDemandService;
import com.pccw.purchasecontrol.service.ScdaYearTwodeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: xcl
 * @Date: 2019-3-29 17:28
 * @Version 1.0
 */
@RestController
@RequestMapping("/ScdaYearTwodept")
public class ScdaYearTwodeptController implements ScdaYearTwodeptControllerApi{

    @Autowired
    private ScdaYearTwodeptService yearTwodept;


    /**
     * 按编号查询一条记录
     *
     * @param purchaseControlRequest
     * @return
     */
    @PostMapping("/findOne")
    public ScdaYearTwodeptResult findOne(@RequestBody PurchaseControlRequest purchaseControlRequest) {
        return yearTwodept.findOne(purchaseControlRequest);
    }


    /**
     * 分页查询
     * @param purchaseControlRequest
     * @return
     */
    @PostMapping("/findPage")
    public QueryResponseResult<ScdaYearTwodept> findPage(@RequestBody PurchaseControlRequest purchaseControlRequest) {
        QueryResponseResult<ScdaYearTwodept> page = yearTwodept.findPage(purchaseControlRequest);
        return page;
    }
}

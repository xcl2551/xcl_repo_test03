package com.pccw.purchaseexecute.controller;

import com.pccw.api.purchaseexecute.ScdaAoGsGroupbyControllerApi;
import com.pccw.framework.domain.purchaseexecute.ScdaAoGsGroupby;
import com.pccw.framework.domain.purchaseexecute.request.PurchaseExecuteRequest;
import com.pccw.framework.domain.purchaseexecute.response.ScdaAoGsGroupbyResult;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.purchaseexecute.service.ScdaAoGsGroupbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xcl
 * @Date: 2019-4-9 14:06
 * @Version 1.0
 */
@RestController
@RequestMapping("/scdaAoGsGroupby")
public class ScdaAoGsGroupbyController  implements ScdaAoGsGroupbyControllerApi{

    @Autowired
    private ScdaAoGsGroupbyService scdaAoGsGroupbyService;


    @Override
    @PostMapping("/findOneType")
    public QueryResponseResult<ScdaAoGsGroupby> findOneType(@RequestBody PurchaseExecuteRequest purchaseExecuteRequest) {
        return scdaAoGsGroupbyService.findOneType(purchaseExecuteRequest);
    }

    @Override
    @PostMapping("/findPage")
    public QueryResponseResult<ScdaAoGsGroupby> findPage(@RequestBody PurchaseExecuteRequest purchaseExecuteRequest) {
        return scdaAoGsGroupbyService.findPage(purchaseExecuteRequest);
    }
}

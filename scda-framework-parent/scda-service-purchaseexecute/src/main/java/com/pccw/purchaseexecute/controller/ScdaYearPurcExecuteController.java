package com.pccw.purchaseexecute.controller;

import com.pccw.api.purchaseexecute.ScdaYearPurcExecuteControllerApi;
import com.pccw.framework.domain.purchaseexecute.ScdaYearPurcExecute;
import com.pccw.framework.domain.purchaseexecute.request.PurchaseExecuteRequest;
import com.pccw.framework.domain.purchaseexecute.response.ScdaYearPurcExecuteResult;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.purchaseexecute.service.ScdaYearPurcExecuteService;
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
@RequestMapping("/scdaYearPurcExecute")
public class ScdaYearPurcExecuteController implements ScdaYearPurcExecuteControllerApi{
    @Autowired
    private ScdaYearPurcExecuteService scdaYearPurcExecuteService;

    @Override
    @PostMapping("/findOne")
    public ScdaYearPurcExecuteResult findOne(@RequestBody PurchaseExecuteRequest purchaseExecuteRequest) {
        return scdaYearPurcExecuteService.findOneByDeadlineDate(purchaseExecuteRequest);
    }

    @Override
    @PostMapping("/findPage")
    public QueryResponseResult<ScdaYearPurcExecute> findPage(@RequestBody PurchaseExecuteRequest purchaseExecuteRequest) {
        return scdaYearPurcExecuteService.findPage(purchaseExecuteRequest);
    }
}

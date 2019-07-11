package com.pccw.purchaseexecute;

import com.pccw.api.purchaseexecute.ScdaActuallyOccurredBaseControllerApi;
import com.pccw.framework.domain.purchaseexecute.ScdaActuallyOccurredBase;
import com.pccw.framework.domain.purchaseexecute.request.PurchaseExecuteRequest;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.purchaseexecute.service.ScdaActuallyOccurredBaseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: xcl
 * @Date: 2019-4-9 14:27
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MVCTest {
    @Autowired
    private ScdaActuallyOccurredBaseService scdaActuallyOccurredBaseService;


    @Autowired
    private ScdaActuallyOccurredBaseControllerApi scdaActuallyOccurredBaseControllerApi;


    @Test
    public void testFindPage(){
        PurchaseExecuteRequest pu = new PurchaseExecuteRequest();
        pu.setPageNum("1");
        pu.setPageSize("2");
        pu.setStartCreateDate("2018-01-01");
        pu.setEndCreateDate("2019-01-01");
        QueryResponseResult<ScdaActuallyOccurredBase> page = scdaActuallyOccurredBaseControllerApi.findPage(pu);
        System.out.println("page = " + page);
    }


}

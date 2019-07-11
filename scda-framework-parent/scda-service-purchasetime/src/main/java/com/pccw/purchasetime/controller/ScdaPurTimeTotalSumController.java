package com.pccw.purchasetime.controller;

import com.pccw.api.purchasetime.ScdaPurTimeTotalSumControllerApi;
import com.pccw.framework.domain.purchasetime.ScdaPurTimeTotalSum;
import com.pccw.framework.domain.purchasetime.request.ScdaPurTimeTotalSumRequest;
import com.pccw.framework.domain.purchasetime.response.ScdaPurTimeTotalSumResult;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.purchasetime.service.ScdaPurTimeTotalSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xcl
 * @Date: 2019-05-05 10:50:24
 * @Version 1.0
 */
@RestController
@RequestMapping("/scdaPurTimeTotalSum")
public class ScdaPurTimeTotalSumController implements ScdaPurTimeTotalSumControllerApi {

    @Autowired
    private ScdaPurTimeTotalSumService scdaPurTimeTotalSumService;

    /**
     * 发现一种类型
     *
     * @param scdaPurTimeTotalSumRequest
     * @return
     */
    @Override
    @PostMapping("/findOneType")
    public ScdaPurTimeTotalSumResult findOneType(@RequestBody ScdaPurTimeTotalSumRequest scdaPurTimeTotalSumRequest) {

        return scdaPurTimeTotalSumService.findOneType(scdaPurTimeTotalSumRequest);
    }

    /**
     * 发现一条页面显示数据
     *
     * @param scdaPurTimeTotalSumRequest
     * @return
     */
    @Override
    @PostMapping("/findOne")
    public QueryResponseResult<ScdaPurTimeTotalSum> findOne(@RequestBody ScdaPurTimeTotalSumRequest scdaPurTimeTotalSumRequest) {
        return null;
    }

    /**
     * 分页查询
     *
     * @param scdaPurTimeTotalSumRequest
     * @return
     */
    @Override
    @PostMapping("/findPage")
    public QueryResponseResult<ScdaPurTimeTotalSum> findPage(@RequestBody ScdaPurTimeTotalSumRequest scdaPurTimeTotalSumRequest) {
        return scdaPurTimeTotalSumService.findPage(scdaPurTimeTotalSumRequest);
    }
}

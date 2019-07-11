package com.pccw.purchasetime.controller;

import com.pccw.api.purchasetime.ScdaPurTimeSummaryControllerApi;
import com.pccw.framework.domain.purchasetime.ScdaPurTimeSummary;
import com.pccw.framework.domain.purchasetime.request.ScdaPurTimeSummaryRequest;
import com.pccw.framework.domain.purchasetime.response.ScdaPurTimeSummaryResult;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.purchasetime.service.ScdaPurTimeSummaryService;
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
@RequestMapping("/scdaPurTimeSummary")
public class ScdaPurTimeSummaryController implements ScdaPurTimeSummaryControllerApi {

    @Autowired
    private ScdaPurTimeSummaryService scdaPurTimeSummaryService;

    /**
     * 发现一种类型
     *
     * @param scdaPurTimeSummaryRequest
     * @return
     */
    @Override
    @PostMapping("/findOneType")
    public ScdaPurTimeSummaryResult findOneType(@RequestBody ScdaPurTimeSummaryRequest scdaPurTimeSummaryRequest) {

        return scdaPurTimeSummaryService.findOneType(scdaPurTimeSummaryRequest);
    }

    /**
     * 发现一条页面显示数据
     *
     * @param scdaPurTimeSummaryRequest
     * @return
     */
    @Override
    @PostMapping("/findOne")
    public QueryResponseResult<ScdaPurTimeSummary> findOne(@RequestBody ScdaPurTimeSummaryRequest scdaPurTimeSummaryRequest) {
        return null;
    }

    /**
     * 分页查询
     *
     * @param scdaPurTimeSummaryRequest
     * @return
     */
    @Override
    @PostMapping("/findPage")
    public QueryResponseResult<ScdaPurTimeSummary> findPage(@RequestBody ScdaPurTimeSummaryRequest scdaPurTimeSummaryRequest) {
        return scdaPurTimeSummaryService.findPage(scdaPurTimeSummaryRequest);
    }
}

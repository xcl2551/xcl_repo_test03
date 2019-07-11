package com.pccw.purchasetime.controller;

import com.pccw.api.purchasetime.ScdaPurDemandDetailControllerApi;
import com.pccw.framework.domain.purchasetime.ScdaPurDemandDetail;
import com.pccw.framework.domain.purchasetime.request.ScdaPurDemandDetailRequest;
import com.pccw.framework.domain.purchasetime.response.ScdaPurDemandDetailResult;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.purchasetime.service.ScdaPurDemandDetailService;
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
@RequestMapping("/scdaPurDemandDetail")
public class ScdaPurDemandDetailController implements ScdaPurDemandDetailControllerApi {

    @Autowired
    private ScdaPurDemandDetailService scdaPurDemandDetailService;

    /**
     * 发现一种类型
     *
     * @param scdaPurDemandDetailRequest
     * @return
     */
    @Override
    @PostMapping("/findOneType")
    public ScdaPurDemandDetailResult findOneType(@RequestBody ScdaPurDemandDetailRequest scdaPurDemandDetailRequest) {

        return scdaPurDemandDetailService.findOneType(scdaPurDemandDetailRequest);
    }

    /**
     * 发现一条页面显示数据
     *
     * @param scdaPurDemandDetailRequest
     * @return
     */
    @Override
    @PostMapping("/findOne")
    public QueryResponseResult<ScdaPurDemandDetail> findOne(@RequestBody ScdaPurDemandDetailRequest scdaPurDemandDetailRequest) {
        return null;
    }

    /**
     * 分页查询
     *
     * @param scdaPurDemandDetailRequest
     * @return
     */
    @Override
    @PostMapping("/findPage")
    public QueryResponseResult<ScdaPurDemandDetail> findPage(@RequestBody ScdaPurDemandDetailRequest scdaPurDemandDetailRequest) {
        return scdaPurDemandDetailService.findPage(scdaPurDemandDetailRequest);
    }
}

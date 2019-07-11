package com.pccw.purchasetime.controller;

import com.pccw.api.purchasetime.ScdaSchResAppTimeSumControllerApi;
import com.pccw.framework.domain.purchasetime.ScdaSchResAppTimeSum;
import com.pccw.framework.domain.purchasetime.request.ScdaSchResAppTimeSumRequest;
import com.pccw.framework.domain.purchasetime.response.ScdaSchResAppTimeSumResult;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.purchasetime.service.ScdaSchResAppTimeSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xcl
 * @Date: 2019-05-05 10:50:23
 * @Version 1.0
 */
@RestController
@RequestMapping("/scdaSchResAppTimeSum")
public class ScdaSchResAppTimeSumController implements ScdaSchResAppTimeSumControllerApi {

    @Autowired
    private ScdaSchResAppTimeSumService scdaSchResAppTimeSumService;

    /**
     * 发现一种类型
     *
     * @param scdaSchResAppTimeSumRequest
     * @return
     */
    @Override
    @PostMapping("/findOneType")
    public ScdaSchResAppTimeSumResult findOneType(@RequestBody ScdaSchResAppTimeSumRequest scdaSchResAppTimeSumRequest) {

        return scdaSchResAppTimeSumService.findOneType(scdaSchResAppTimeSumRequest);
    }

    /**
     * 发现一条页面显示数据
     *
     * @param scdaSchResAppTimeSumRequest
     * @return
     */
    @Override
    @PostMapping("/findOne")
    public QueryResponseResult<ScdaSchResAppTimeSum> findOne(@RequestBody ScdaSchResAppTimeSumRequest scdaSchResAppTimeSumRequest) {
        return null;
    }

    /**
     * 分页查询
     *
     * @param scdaSchResAppTimeSumRequest
     * @return
     */
    @Override
    @PostMapping("/findPage")
    public QueryResponseResult<ScdaSchResAppTimeSum> findPage(@RequestBody ScdaSchResAppTimeSumRequest scdaSchResAppTimeSumRequest) {
        return scdaSchResAppTimeSumService.findPage(scdaSchResAppTimeSumRequest);
    }
}

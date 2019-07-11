package com.pccw.ucenter.auth.client;

import com.pccw.framework.client.ScdaServiceList;
import com.pccw.framework.domain.ucenter.ext.ScdaUserAuthExt;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: xcl
 * @Date: 2019-3-7 19:28
 * @Version 1.0
 */
@FeignClient(value = ScdaServiceList.SCDA_SERVICE_UCENTER)
public interface UserAuthClient {
    //根据账号查询用户信息
    @GetMapping("/ucenter/getuserext")
    public ScdaUserAuthExt getUserAuthext(@RequestParam("username") String username);
}

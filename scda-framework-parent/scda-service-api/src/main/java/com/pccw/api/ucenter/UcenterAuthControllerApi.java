package com.pccw.api.ucenter;

import com.pccw.framework.domain.purchasecontrol.ScdaYearTwodept;
import com.pccw.framework.domain.purchasecontrol.request.PurchaseControlRequest;
import com.pccw.framework.domain.ucenter.ext.ScdaUserAuthExt;
import com.pccw.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by Administrator.
 */
@Api(value = "用户中心",description = "用户中心管理")
public interface UcenterAuthControllerApi {
    @ApiOperation("根据用户账号查询用户信息")
    public ScdaUserAuthExt getUserAuthext(String username);


}

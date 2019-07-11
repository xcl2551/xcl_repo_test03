package com.pccw.framework.domain.purchasecontrol.response;

import com.pccw.framework.domain.purchasecontrol.ScdaYearPurcDemand;
import com.pccw.framework.model.response.ResponseResult;
import com.pccw.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: xcl
 * @Date: 2019-3-29 17:35
 * @Version 1.0
 */
@Data
@ToString
@NoArgsConstructor
public class ScdaYearPurcDemandResult extends ResponseResult {

    //查询的一条返回结果记录
    private ScdaYearPurcDemand scdaYearPurcDemand;

    public ScdaYearPurcDemandResult(ResultCode resultCode, ScdaYearPurcDemand scdaYearPurcDemand) {
        super(resultCode);
        this.scdaYearPurcDemand = scdaYearPurcDemand;
    }
}

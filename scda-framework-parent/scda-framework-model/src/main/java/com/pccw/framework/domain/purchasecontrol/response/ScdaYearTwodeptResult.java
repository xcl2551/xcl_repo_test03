package com.pccw.framework.domain.purchasecontrol.response;

import com.pccw.framework.domain.purchasecontrol.ScdaYearPurcDemand;
import com.pccw.framework.domain.purchasecontrol.ScdaYearTwodept;
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
public class ScdaYearTwodeptResult extends ResponseResult {

    //查询的一条返回结果记录
    private ScdaYearTwodept scdaYearTwodept;

    public ScdaYearTwodeptResult(ResultCode resultCode, ScdaYearTwodept scdaYearTwodept) {
        super(resultCode);
        this.scdaYearTwodept = scdaYearTwodept;
    }
}

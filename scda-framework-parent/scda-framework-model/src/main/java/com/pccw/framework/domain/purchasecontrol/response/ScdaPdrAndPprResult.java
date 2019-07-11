package com.pccw.framework.domain.purchasecontrol.response;

import com.pccw.framework.domain.purchasecontrol.ScdaPdrAndPpr;
import com.pccw.framework.model.response.ResponseResult;
import com.pccw.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: xcl
 * @Date: 2019-3-29 14:47
 * @Version 1.0
 */
@Data
@ToString
@NoArgsConstructor
public class ScdaPdrAndPprResult extends ResponseResult {
    //查询的一条返回结果记录
    private ScdaPdrAndPpr scdaPdrAndPpr;
    public ScdaPdrAndPprResult(ResultCode resultCode, ScdaPdrAndPpr scdaPdrAndPpr) {
        super(resultCode);
        this.scdaPdrAndPpr = scdaPdrAndPpr;
    }
}

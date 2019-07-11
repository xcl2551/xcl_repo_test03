package com.pccw.framework.domain.purchasetime.response;

import com.pccw.framework.domain.purchasetime.ScdaPurTimeBase;
import com.pccw.framework.model.response.ResponseResult;
import com.pccw.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 * @Author: xcl
 * @Date: 2019-05-06 14:14:16
 * @Version 1.0
 */
@Data
@ToString
@NoArgsConstructor
public class ScdaPurTimeBaseResult extends ResponseResult {
    //查询的一条返回结果记录
    private ScdaPurTimeBase scdaPurTimeBase;

    public ScdaPurTimeBaseResult(ResultCode resultCode, ScdaPurTimeBase scdaPurTimeBase) {
        super(resultCode);
        this.scdaPurTimeBase = scdaPurTimeBase;
    }
}

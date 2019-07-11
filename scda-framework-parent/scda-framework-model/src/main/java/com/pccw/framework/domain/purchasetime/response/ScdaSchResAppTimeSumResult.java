package com.pccw.framework.domain.purchasetime.response;

import com.pccw.framework.domain.purchasetime.ScdaSchResAppTimeSum;
import com.pccw.framework.model.response.ResponseResult;
import com.pccw.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 * @Author: xcl
 * @Date: 2019-05-05 10:50:23
 * @Version 1.0
 */
@Data
@ToString
@NoArgsConstructor
public class ScdaSchResAppTimeSumResult extends ResponseResult {
    //查询的一条返回结果记录
    private ScdaSchResAppTimeSum scdaSchResAppTimeSum;

    public ScdaSchResAppTimeSumResult(ResultCode resultCode, ScdaSchResAppTimeSum scdaSchResAppTimeSum) {
        super(resultCode);
        this.scdaSchResAppTimeSum = scdaSchResAppTimeSum;
    }
}

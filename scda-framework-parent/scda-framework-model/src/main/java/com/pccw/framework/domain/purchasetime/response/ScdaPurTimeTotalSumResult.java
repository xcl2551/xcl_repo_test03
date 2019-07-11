package com.pccw.framework.domain.purchasetime.response;

import com.pccw.framework.domain.purchasetime.ScdaPurTimeTotalSum;
import com.pccw.framework.model.response.ResponseResult;
import com.pccw.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 * @Author: xcl
 * @Date: 2019-05-05 10:50:24
 * @Version 1.0
 */
@Data
@ToString
@NoArgsConstructor
public class ScdaPurTimeTotalSumResult extends ResponseResult {
    //查询的一条返回结果记录
    private ScdaPurTimeTotalSum scdaPurTimeTotalSum;

    public ScdaPurTimeTotalSumResult(ResultCode resultCode, ScdaPurTimeTotalSum scdaPurTimeTotalSum) {
        super(resultCode);
        this.scdaPurTimeTotalSum = scdaPurTimeTotalSum;
    }
}

package com.pccw.framework.domain.purchasetime.response;

import com.pccw.framework.domain.purchasetime.ScdaPurTimeSummary;
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
public class ScdaPurTimeSummaryResult extends ResponseResult {
    //查询的一条返回结果记录
    private ScdaPurTimeSummary scdaPurTimeSummary;

    public ScdaPurTimeSummaryResult(ResultCode resultCode, ScdaPurTimeSummary scdaPurTimeSummary) {
        super(resultCode);
        this.scdaPurTimeSummary = scdaPurTimeSummary;
    }
}

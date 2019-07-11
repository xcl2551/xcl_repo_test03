package com.pccw.framework.domain.purchasetime.response;

import com.pccw.framework.domain.purchasetime.ScdaPurDemandDetail;
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
public class ScdaPurDemandDetailResult extends ResponseResult {
    //查询的一条返回结果记录
    private ScdaPurDemandDetail scdaPurDemandDetail;

    public ScdaPurDemandDetailResult(ResultCode resultCode, ScdaPurDemandDetail scdaPurDemandDetail) {
        super(resultCode);
        this.scdaPurDemandDetail = scdaPurDemandDetail;
    }
}

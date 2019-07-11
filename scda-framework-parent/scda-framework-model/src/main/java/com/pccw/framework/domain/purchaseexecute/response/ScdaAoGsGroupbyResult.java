package com.pccw.framework.domain.purchaseexecute.response;

import com.pccw.framework.domain.purchasecontrol.ScdaPdrAndPpr;
import com.pccw.framework.domain.purchaseexecute.ScdaAoGsGroupby;
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
public class ScdaAoGsGroupbyResult extends ResponseResult {

    //查询的一条返回结果记录
    private ScdaAoGsGroupby scdaAoGsGroupby;

    public ScdaAoGsGroupbyResult(ResultCode resultCode, ScdaAoGsGroupby scdaAoGsGroupby) {
        super(resultCode);
        this.scdaAoGsGroupby = scdaAoGsGroupby;
    }

}

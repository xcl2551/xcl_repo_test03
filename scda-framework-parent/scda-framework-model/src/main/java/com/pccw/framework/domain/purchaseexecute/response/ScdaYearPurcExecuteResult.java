package com.pccw.framework.domain.purchaseexecute.response;

import com.pccw.framework.domain.purchaseexecute.ScdaYearPurcExecute;
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
public class ScdaYearPurcExecuteResult extends ResponseResult {

    //查询的一条返回结果记录
    private ScdaYearPurcExecute scdaYearPurcExecute;

    public ScdaYearPurcExecuteResult(ResultCode resultCode, ScdaYearPurcExecute scdaYearPurcExecute) {
        super(resultCode);
        this.scdaYearPurcExecute = scdaYearPurcExecute;
    }

}

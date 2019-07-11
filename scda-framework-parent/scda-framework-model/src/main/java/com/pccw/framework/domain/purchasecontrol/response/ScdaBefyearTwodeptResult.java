package com.pccw.framework.domain.purchasecontrol.response;

import com.pccw.framework.domain.purchasecontrol.ScdaBefyearTwodept;
import com.pccw.framework.model.response.ResponseResult;
import com.pccw.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: xcl
 * @Date: 2019-4-2 10:26
 * @Version 1.0
 */

@Data
@ToString
@NoArgsConstructor
public class ScdaBefyearTwodeptResult extends ResponseResult {

    //查询的一条返回结果记录
    private  ScdaBefyearTwodept befyearTwodept;

    public ScdaBefyearTwodeptResult(ResultCode resultCode, ScdaBefyearTwodept befyearTwodept) {
        super(resultCode);
        this.befyearTwodept = befyearTwodept;
    }
}

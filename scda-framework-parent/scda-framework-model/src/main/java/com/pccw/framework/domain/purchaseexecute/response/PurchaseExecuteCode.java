package com.pccw.framework.domain.purchaseexecute.response;

import com.pccw.framework.model.response.ResultCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;

/**
 * @Author: xcl
 * @Date: 2019-3-29 14:51
 * @Version 1.0
 */
@ApiModel
@ToString
public enum PurchaseExecuteCode implements ResultCode{
    PURCHASEEXECUTE_PARAM_NONE(false,22101,"参数不齐,aggType或aggPurchaseType缺失")

    ;


    //操作代码
    @ApiModelProperty(value = "操作是否成功", example = "true", required = true)
    boolean success;

    //操作代码
    @ApiModelProperty(value = "操作代码", example = "22001", required = true)
    int code;
    //提示信息
    @ApiModelProperty(value = "操作提示", example = "操作过于频繁！", required = true)
    String message;



    PurchaseExecuteCode(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public boolean success() {
        return success;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}

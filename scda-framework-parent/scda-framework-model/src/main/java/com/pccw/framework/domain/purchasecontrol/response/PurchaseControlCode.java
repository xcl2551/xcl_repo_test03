package com.pccw.framework.domain.purchasecontrol.response;

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
public enum PurchaseControlCode  implements ResultCode{
    PURCHASECONTROL_PDRPPRNUMBER_NONE(false,22001,"查询的编号不存在"),
    PURCHASECONTROL_ENABLEFLAGE_N(false,22002,"查询的编号不可用"),
    PURCHASECONTROL_STRDEADLINEDATE_NONE(false,22003,"日期不允许为空"),
    PURCHASECONTROL_STRDEADLINEDATE_LENGTH(false,22004,"截止日期字符串长度不满足要求,规范值为:yyyy-mm-dd"),
    PURCHASECONTROL_STRDEADLINEDATE_ILLEGALITY(false,22005,"日期字符串格式非法,规范值为:yyyy-mm-dd")
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



    PurchaseControlCode(boolean success, int code, String message) {
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

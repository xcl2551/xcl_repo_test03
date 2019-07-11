package com.pccw.framework.domain.purchaseexecute.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @Author: xcl
 * @Date: 2019-4-2 10:41
 * @Version 1.0
 */
@ApiModel
@Data
@ToString
public class PurchaseExecuteRequest {

    @ApiModelProperty(value = "当前页",dataType = "String" ,required = false)
    private String pageNum;

    @ApiModelProperty(value = "每页显示条数",dataType = "String" ,required = false)
    private String pageSize;

    @ApiModelProperty(value = "截止日期字符串格式:yyyy-mm-dd",dataType = "String" ,required = false)
    private String strDeadlineDate;


    @ApiModelProperty(value = "截止日期字符串格式:yyyy-mm-dd",dataType = "String" ,required = false)
    private String startCreateDate;

    @ApiModelProperty(value = "截止日期字符串格式:yyyy-mm-dd",dataType = "String" ,required = false)
    private String endCreateDate;

    @ApiModelProperty(value = "类型,值为实际发生--Actually_occurred/集团口径--group_size",dataType = "String" ,required = false)
    private String aggType;

    @ApiModelProperty(value = "采购类型,值为,一采one_purchase,二采two_purchase,非集采ungroup_puechase",dataType = "String" ,required = false)
    private String aggPurchaseType;

}

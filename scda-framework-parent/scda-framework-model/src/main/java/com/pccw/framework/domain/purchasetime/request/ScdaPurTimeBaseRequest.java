package com.pccw.framework.domain.purchasetime.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @Author: xcl
 * @Date: 2019-05-06 14:14:16
 * @Version 1.0
 */
@ApiModel
@Data
@ToString
public class ScdaPurTimeBaseRequest {

    @ApiModelProperty(value = "当前页",dataType = "String" ,required = false)
    private String pageNum;
    @ApiModelProperty(value = "每页显示条数",dataType = "String" ,required = false)
    private String pageSize;
    @ApiModelProperty(value = "截止日期字符串格式:yyyy-mm-dd",dataType = "String" ,required = false)
    private String startCreateDate;
    @ApiModelProperty(value = "截止日期字符串格式:yyyy-mm-dd",dataType = "String" ,required = false)
    private String endCreateDate;
    @ApiModelProperty(value = "项目预警状态",dataType = "String" ,required = false)
    private String proWarnStatus;


}

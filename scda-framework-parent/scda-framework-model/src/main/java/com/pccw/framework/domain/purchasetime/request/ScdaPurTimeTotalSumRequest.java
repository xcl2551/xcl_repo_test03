package com.pccw.framework.domain.purchasetime.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @Author: xcl
 * @Date: 2019-05-05 10:50:24
 * @Version 1.0
 */
@ApiModel
@Data
@ToString
public class ScdaPurTimeTotalSumRequest {

    @ApiModelProperty(value = "当前页",dataType = "String" ,required = false)
    private String pageNum;
    @ApiModelProperty(value = "每页显示条数",dataType = "String" ,required = false)
    private String pageSize;
    @ApiModelProperty(value = "截止日期字符串格式:yyyy-mm-dd",dataType = "String" ,required = false)
    private String startCreateDate;
    @ApiModelProperty(value = "截止日期字符串格式:yyyy-mm-dd",dataType = "String" ,required = false)
    private String endCreateDate;

        @ApiModelProperty(value = "截止日期(筛选)",dataType = "String" ,required = false)
        private String deadlineDate;

}

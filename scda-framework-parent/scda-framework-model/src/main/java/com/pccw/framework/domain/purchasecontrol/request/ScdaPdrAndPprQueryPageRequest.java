package com.pccw.framework.domain.purchasecontrol.request;

import com.pccw.framework.domain.purchasecontrol.ScdaPdrAndPpr;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @Author: xcl
 * @Date: 2019-3-29 13:42
 * @Version 1.0
 */
@ApiModel
@Data
@ToString
public class ScdaPdrAndPprQueryPageRequest extends ScdaPdrAndPpr{

    @ApiModelProperty(value = "当前页",dataType = "String" ,required = false)
    private String pageNum;

    @ApiModelProperty(value = "每页显示条数",dataType = "String" ,required = false)
    private String pageSize;

    @ApiModelProperty(value = "截止日期字符串格式:yyyy-mm-dd",dataType = "String" ,required = true)
    private String strDeadlineDate;
}

package com.pccw.framework.domain.purchasecontrol.request;

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
public class PurchaseControlRequest {

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

    @ApiModelProperty(value = "1.采购物流部网络物资采购部\n" +
            "2.采购物流部通用物资采购部\n" +
            "3.单一来源金额及公开采购率百分比\n" +
            "4.采购物流部网络及通用物资采购部",dataType = "String" ,required = false)
    private String ytDept;

    @ApiModelProperty(value = "1.总单数\n" +
            "2.完成单数\n" +
            "3.完成率\n" +
            "4.单一来源百分比\n" +
            "5.公开采购率百分比",dataType = "String" ,required = false)
    private String ytType;

}

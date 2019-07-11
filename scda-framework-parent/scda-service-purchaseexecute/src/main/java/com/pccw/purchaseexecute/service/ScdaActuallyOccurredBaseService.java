package com.pccw.purchaseexecute.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pccw.framework.domain.purchaseexecute.ScdaActuallyOccurredBase;
import com.pccw.framework.domain.purchaseexecute.ScdaActuallyOccurredBaseExample;
import com.pccw.framework.domain.purchaseexecute.request.PurchaseExecuteRequest;
import com.pccw.framework.exception.ExceptionCast;
import com.pccw.framework.model.response.CommonCode;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.framework.model.response.QueryResult;
import com.pccw.framework.utils.ScdaDateFormartUtil;
import com.pccw.purchaseexecute.mapper.ScdaActuallyOccurredBaseMapper;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: xcl
 * @Date: 2019-4-16 16:30
 * @Version 1.0
 */
@Service
public class ScdaActuallyOccurredBaseService {
    @Autowired
    private ScdaActuallyOccurredBaseMapper scdaActuallyOccurredBaseMapper;

    /**
     * 分页查询
     *
     * @param purchaseExecuteRequest
     * @return
     */
    public QueryResponseResult<ScdaActuallyOccurredBase> findPage(PurchaseExecuteRequest purchaseExecuteRequest) {
        //1 获取当前页码
        String pageNum = purchaseExecuteRequest.getPageNum();
        if (pageNum == null) {
            pageNum = "1";
        }
        //2 获取每页显示条数
        String pageSize = purchaseExecuteRequest.getPageSize();
        if (pageSize == null) {
            pageSize = "10";
        }
        //获取开始时间,结束时间
        String startCreateDate = purchaseExecuteRequest.getStartCreateDate();
        String endCreateDate = purchaseExecuteRequest.getEndCreateDate();

        PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        ScdaActuallyOccurredBaseExample example = new ScdaActuallyOccurredBaseExample();
        ScdaActuallyOccurredBaseExample.Criteria criteria = example.createCriteria();
        if (startCreateDate != null && endCreateDate != null) {
            Map<String, Date> dateStartAndEnd = null;
            try {
                dateStartAndEnd = ScdaDateFormartUtil.getDateStartAndEnd(startCreateDate, endCreateDate);
            } catch (ParseException e) {
                ExceptionCast.cast(CommonCode.STRDEADLINEDATE_ILLEGALITY);
            }
            criteria.andLastUpdateDateBetween(dateStartAndEnd.get("startDate"), dateStartAndEnd.get("endDate"));
        }
        //添加条件可用状态为Y
        criteria.andSaobEnableFlagEqualTo("Y");
        //按时间倒序排序
        example.setOrderByClause("last_update_date desc,saob_id desc");
        Page<ScdaActuallyOccurredBase> scdaActuallyOccurredBases = (Page<ScdaActuallyOccurredBase>) scdaActuallyOccurredBaseMapper.selectByExample(example);
        QueryResult<ScdaActuallyOccurredBase> queryResult = new QueryResult<>();
        queryResult.setTotal(scdaActuallyOccurredBases.getTotal());
        queryResult.setList(scdaActuallyOccurredBases.getResult());
        return new QueryResponseResult<>(CommonCode.SUCCESS, queryResult);
    }

    //HSSFWorkbook downloadExcel
    public HSSFWorkbook downloadExcel(PurchaseExecuteRequest purchaseExecuteRequest) {
        //定义第一页显示全部
        purchaseExecuteRequest.setPageNum("1");
        purchaseExecuteRequest.setPageSize("0");

        QueryResponseResult<ScdaActuallyOccurredBase> page = this.findPage(purchaseExecuteRequest);
        QueryResult<ScdaActuallyOccurredBase> queryResult = page.getQueryResult();
        List<ScdaActuallyOccurredBase> list = queryResult.getList();

        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        HSSFSheet sheet = hssfWorkbook.createSheet("实际发生基础数据表");
        //设置表头
        HSSFRow headRow = sheet.createRow(0);
        headRow.createCell(0).setCellValue("(主键)");
        headRow.createCell(1).setCellValue("省公司代码");
        headRow.createCell(2).setCellValue("组织标识");
        headRow.createCell(3).setCellValue("采购订单类型");
        headRow.createCell(4).setCellValue("合同起草部门");
        headRow.createCell(5).setCellValue("订单总金额");
        headRow.createCell(6).setCellValue("省合同系统的合同编号");
        headRow.createCell(7).setCellValue("统一供应商编码");
        headRow.createCell(8).setCellValue("供应商编号");
        headRow.createCell(9).setCellValue("供应商名称");
        headRow.createCell(10).setCellValue("总部框架协议编码");
        headRow.createCell(11).setCellValue("订单头id");
        headRow.createCell(12).setCellValue("采购订单编号");
        headRow.createCell(13).setCellValue("采购项目编号");
        headRow.createCell(14).setCellValue("最后更新日期");
        headRow.createCell(15).setCellValue("集采类型");
        headRow.createCell(16).setCellValue("签约方式");
        headRow.createCell(17).setCellValue("订单状态");
        headRow.createCell(18).setCellValue("大类");
        headRow.createCell(19).setCellValue("中类");
        headRow.createCell(20).setCellValue("小类");
        headRow.createCell(21).setCellValue("产品");
        headRow.createCell(22).setCellValue("是否剔除");
        headRow.createCell(23).setCellValue("集团剔除");
        headRow.createCell(24).setCellValue("说明");
        headRow.createCell(25).setCellValue("saob表创建时间");
        headRow.createCell(26).setCellValue("saob表创建人");
        headRow.createCell(27).setCellValue("saob表最后修改时间");
        headRow.createCell(28).setCellValue("saob表最后修改人");
        headRow.createCell(29).setCellValue("saob表value- Y可用,N不可用");

        for (ScdaActuallyOccurredBase scdaActuallyOccurredBase : list) {
            HSSFRow dataRow = sheet.createRow(sheet.getLastRowNum() + 1);
            if (scdaActuallyOccurredBase.getSaobId() != null) {
                dataRow.createCell(0).setCellValue(scdaActuallyOccurredBase.getSaobId());
            }

            if (scdaActuallyOccurredBase.getProvincialCompanyCode() != null) {
                dataRow.createCell(1).setCellValue(scdaActuallyOccurredBase.getProvincialCompanyCode());
            }

            if (scdaActuallyOccurredBase.getOrgIdentify() != null) {
                dataRow.createCell(2).setCellValue(scdaActuallyOccurredBase.getOrgIdentify());
            }

            if (scdaActuallyOccurredBase.getPoType() != null) {
                dataRow.createCell(3).setCellValue(scdaActuallyOccurredBase.getPoType());
            }

            if (scdaActuallyOccurredBase.getContractDraftingDept() != null) {
                dataRow.createCell(4).setCellValue(scdaActuallyOccurredBase.getContractDraftingDept());
            }

            if (scdaActuallyOccurredBase.getOrderTotalAmount() != null) {
                dataRow.createCell(5).setCellValue(String.valueOf(scdaActuallyOccurredBase.getOrderTotalAmount()));
            }

            if (scdaActuallyOccurredBase.getContractNumber() != null) {
                dataRow.createCell(6).setCellValue(scdaActuallyOccurredBase.getContractNumber());
            }

            if (scdaActuallyOccurredBase.getUnifiedSupplierCode() != null) {
                dataRow.createCell(7).setCellValue(scdaActuallyOccurredBase.getUnifiedSupplierCode());
            }

            if (scdaActuallyOccurredBase.getSupplierNumber() != null) {
                dataRow.createCell(8).setCellValue(scdaActuallyOccurredBase.getSupplierNumber());
            }

            if (scdaActuallyOccurredBase.getSupplierName() != null) {
                dataRow.createCell(9).setCellValue(scdaActuallyOccurredBase.getSupplierName());
            }

            if (scdaActuallyOccurredBase.getHqFrameworkContract() != null) {
                dataRow.createCell(10).setCellValue(scdaActuallyOccurredBase.getHqFrameworkContract());
            }

            if (scdaActuallyOccurredBase.getPoHeaderId() != null) {
                dataRow.createCell(11).setCellValue(scdaActuallyOccurredBase.getPoHeaderId());
            }

            if (scdaActuallyOccurredBase.getSegment1() != null) {
                dataRow.createCell(12).setCellValue(scdaActuallyOccurredBase.getSegment1());
            }

            if (scdaActuallyOccurredBase.getEsProjectNumber() != null) {
                dataRow.createCell(13).setCellValue(scdaActuallyOccurredBase.getEsProjectNumber());
            }

            if (scdaActuallyOccurredBase.getLastUpdateDate() != null) {
                dataRow.createCell(14).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaActuallyOccurredBase.getLastUpdateDate()));
            }

            if (scdaActuallyOccurredBase.getAttributeCategory() != null) {
                dataRow.createCell(15).setCellValue(scdaActuallyOccurredBase.getAttributeCategory());
            }

            if (scdaActuallyOccurredBase.getContractWay() != null) {
                dataRow.createCell(16).setCellValue(scdaActuallyOccurredBase.getContractWay());
            }

            if (scdaActuallyOccurredBase.getStatusLookupCode() != null) {
                dataRow.createCell(17).setCellValue(scdaActuallyOccurredBase.getStatusLookupCode());
            }

            if (scdaActuallyOccurredBase.getBigKind() != null) {
                dataRow.createCell(18).setCellValue(scdaActuallyOccurredBase.getBigKind());
            }

            if (scdaActuallyOccurredBase.getCenterKind() != null) {
                dataRow.createCell(19).setCellValue(scdaActuallyOccurredBase.getCenterKind());
            }

            if (scdaActuallyOccurredBase.getSmallKind() != null) {
                dataRow.createCell(20).setCellValue(scdaActuallyOccurredBase.getSmallKind());
            }

            if (scdaActuallyOccurredBase.getProductName() != null) {
                dataRow.createCell(21).setCellValue(scdaActuallyOccurredBase.getProductName());
            }

            if (scdaActuallyOccurredBase.getIsElimination() != null) {
                dataRow.createCell(22).setCellValue(scdaActuallyOccurredBase.getIsElimination());
            }

            if (scdaActuallyOccurredBase.getIsBlocElimination() != null) {
                dataRow.createCell(23).setCellValue(scdaActuallyOccurredBase.getIsBlocElimination());
            }

            if (scdaActuallyOccurredBase.getExplain() != null) {
                dataRow.createCell(24).setCellValue(scdaActuallyOccurredBase.getExplain());
            }

            if (scdaActuallyOccurredBase.getSaobCreationDate() != null) {
                dataRow.createCell(25).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaActuallyOccurredBase.getSaobCreationDate()));
            }

            if (scdaActuallyOccurredBase.getSaobCreatedBy() != null) {
                dataRow.createCell(26).setCellValue(scdaActuallyOccurredBase.getSaobCreatedBy());
            }

            if (scdaActuallyOccurredBase.getSaobLastUpdateDate() != null) {
                dataRow.createCell(27).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaActuallyOccurredBase.getSaobLastUpdateDate()));
            }

            if (scdaActuallyOccurredBase.getSaobLastUpdatedBy() != null) {
                dataRow.createCell(28).setCellValue(scdaActuallyOccurredBase.getSaobLastUpdatedBy());
            }

            if (scdaActuallyOccurredBase.getSaobEnableFlag() != null) {
                dataRow.createCell(29).setCellValue(scdaActuallyOccurredBase.getSaobEnableFlag());
            }
        }
        return hssfWorkbook;
    }
}

package com.pccw.purchaseexecute.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pccw.framework.domain.purchaseexecute.ScdaGroupSizeBase;
import com.pccw.framework.domain.purchaseexecute.ScdaGroupSizeBaseExample;
import com.pccw.framework.domain.purchaseexecute.request.PurchaseExecuteRequest;
import com.pccw.framework.exception.ExceptionCast;
import com.pccw.framework.model.response.CommonCode;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.framework.model.response.QueryResult;
import com.pccw.framework.utils.ScdaDateFormartUtil;
import com.pccw.purchaseexecute.mapper.ScdaGroupSizeBaseMapper;
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
 * @Date: 2019-4-16 16:33
 * @Version 1.0
 */
@Service
public class ScdaGroupSizeBaseService {
    @Autowired
    private ScdaGroupSizeBaseMapper scdaGroupSizeBaseMapper;

    public QueryResponseResult<ScdaGroupSizeBase> findPage(PurchaseExecuteRequest purchaseExecuteRequest) {
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
        ScdaGroupSizeBaseExample example = new ScdaGroupSizeBaseExample();
        ScdaGroupSizeBaseExample.Criteria criteria = example.createCriteria();
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
        criteria.andSgsbEnableFlagEqualTo("Y");
        //按时间倒序排序
        example.setOrderByClause("last_update_date desc,sgsb_id desc");
        Page<ScdaGroupSizeBase> scdaActuallyOccurredBases = (Page<ScdaGroupSizeBase>) scdaGroupSizeBaseMapper.selectByExample(example);
        QueryResult<ScdaGroupSizeBase> queryResult = new QueryResult<>();
        queryResult.setTotal(scdaActuallyOccurredBases.getTotal());
        queryResult.setList(scdaActuallyOccurredBases.getResult());
        return new QueryResponseResult<>(CommonCode.SUCCESS, queryResult);
    }

    /**
     * 提供下载功能
     * @param purchaseExecuteRequest
     * @return
     */
    public HSSFWorkbook downloadExcel(PurchaseExecuteRequest purchaseExecuteRequest) {
        //定义第一页显示全部
        purchaseExecuteRequest.setPageNum("1");
        purchaseExecuteRequest.setPageSize("0");
        QueryResponseResult<ScdaGroupSizeBase> page = this.findPage(purchaseExecuteRequest);
        QueryResult<ScdaGroupSizeBase> queryResult = page.getQueryResult();
        List<ScdaGroupSizeBase> list = queryResult.getList();
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        HSSFSheet sheet = hssfWorkbook.createSheet("上报集团基础数据表");
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
        headRow.createCell(11).setCellValue("采购订单编号");
        headRow.createCell(12).setCellValue("采购项目编号");
        headRow.createCell(13).setCellValue("最后更新日期");
        headRow.createCell(14).setCellValue("集采类型");
        headRow.createCell(15).setCellValue("签约方式");
        headRow.createCell(16).setCellValue("订单状态");
        headRow.createCell(17).setCellValue("大类");
        headRow.createCell(18).setCellValue("中类");
        headRow.createCell(19).setCellValue("小类");
        headRow.createCell(20).setCellValue("产品");
        headRow.createCell(21).setCellValue("是否剔除");
        headRow.createCell(22).setCellValue("集团剔除");
        headRow.createCell(23).setCellValue("说明");
        headRow.createCell(24).setCellValue("sgsb表创建时间");
        headRow.createCell(25).setCellValue("sgsb表创建人");
        headRow.createCell(26).setCellValue("sgsb表最后修改时间");
        headRow.createCell(27).setCellValue("sgsb表最后修改人");
        headRow.createCell(28).setCellValue("sgsb表value- Y可用,N不可用");
        for (ScdaGroupSizeBase scdaGroupSizeBase : list) {
            HSSFRow dataRow = sheet.createRow(sheet.getLastRowNum() + 1);
            if(scdaGroupSizeBase.getSgsbId()!=null){
                dataRow.createCell(0).setCellValue(scdaGroupSizeBase.getSgsbId());
            }

            if(scdaGroupSizeBase.getProvincialCompanyCode()!=null){
                dataRow.createCell(1).setCellValue(scdaGroupSizeBase.getProvincialCompanyCode());
            }

            if(scdaGroupSizeBase.getOrgIdentify()!=null){
                dataRow.createCell(2).setCellValue(scdaGroupSizeBase.getOrgIdentify());
            }

            if(scdaGroupSizeBase.getPoType()!=null){
                dataRow.createCell(3).setCellValue(scdaGroupSizeBase.getPoType());
            }

            if(scdaGroupSizeBase.getContractDraftingDept()!=null){
                dataRow.createCell(4).setCellValue(scdaGroupSizeBase.getContractDraftingDept());
            }

            if(scdaGroupSizeBase.getOrderTotalAmount()!=null){
                dataRow.createCell(5).setCellValue(String.valueOf(scdaGroupSizeBase.getOrderTotalAmount()));
            }

            if(scdaGroupSizeBase.getContractNumber()!=null){
                dataRow.createCell(6).setCellValue(scdaGroupSizeBase.getContractNumber());
            }

            if(scdaGroupSizeBase.getUnifiedSupplierCode()!=null){
                dataRow.createCell(7).setCellValue(scdaGroupSizeBase.getUnifiedSupplierCode());
            }

            if(scdaGroupSizeBase.getSupplierNumber()!=null){
                dataRow.createCell(8).setCellValue(scdaGroupSizeBase.getSupplierNumber());
            }

            if(scdaGroupSizeBase.getSupplierName()!=null){
                dataRow.createCell(9).setCellValue(scdaGroupSizeBase.getSupplierName());
            }

            if(scdaGroupSizeBase.getHqFrameworkContract()!=null){
                dataRow.createCell(10).setCellValue(scdaGroupSizeBase.getHqFrameworkContract());
            }

            if(scdaGroupSizeBase.getSegment1()!=null){
                dataRow.createCell(11).setCellValue(scdaGroupSizeBase.getSegment1());
            }

            if(scdaGroupSizeBase.getEsProjectNumber()!=null){
                dataRow.createCell(12).setCellValue(scdaGroupSizeBase.getEsProjectNumber());
            }

            if(scdaGroupSizeBase.getLastUpdateDate()!=null){
                dataRow.createCell(13).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaGroupSizeBase.getLastUpdateDate()));
            }

            if(scdaGroupSizeBase.getAttributeCategory()!=null){
                dataRow.createCell(14).setCellValue(scdaGroupSizeBase.getAttributeCategory());
            }

            if(scdaGroupSizeBase.getContractWay()!=null){
                dataRow.createCell(15).setCellValue(scdaGroupSizeBase.getContractWay());
            }

            if(scdaGroupSizeBase.getStatusLookupCode()!=null){
                dataRow.createCell(16).setCellValue(scdaGroupSizeBase.getStatusLookupCode());
            }

            if(scdaGroupSizeBase.getBigKind()!=null){
                dataRow.createCell(17).setCellValue(scdaGroupSizeBase.getBigKind());
            }

            if(scdaGroupSizeBase.getCenterKind()!=null){
                dataRow.createCell(18).setCellValue(scdaGroupSizeBase.getCenterKind());
            }

            if(scdaGroupSizeBase.getSmallKind()!=null){
                dataRow.createCell(19).setCellValue(scdaGroupSizeBase.getSmallKind());
            }

            if(scdaGroupSizeBase.getProductName()!=null){
                dataRow.createCell(20).setCellValue(scdaGroupSizeBase.getProductName());
            }

            if(scdaGroupSizeBase.getIsElimination()!=null){
                dataRow.createCell(21).setCellValue(scdaGroupSizeBase.getIsElimination());
            }

            if(scdaGroupSizeBase.getIsBlocElimination()!=null){
                dataRow.createCell(22).setCellValue(scdaGroupSizeBase.getIsBlocElimination());
            }

            if(scdaGroupSizeBase.getExplain()!=null){
                dataRow.createCell(23).setCellValue(scdaGroupSizeBase.getExplain());
            }

            if(scdaGroupSizeBase.getSgsbCreationDate()!=null){
                dataRow.createCell(24).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaGroupSizeBase.getSgsbCreationDate()));
            }

            if(scdaGroupSizeBase.getSgsbCreatedBy()!=null){
                dataRow.createCell(25).setCellValue(scdaGroupSizeBase.getSgsbCreatedBy());
            }

            if(scdaGroupSizeBase.getSgsbLastUpdateDate()!=null){
                dataRow.createCell(26).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaGroupSizeBase.getSgsbLastUpdateDate()));
            }

            if(scdaGroupSizeBase.getSgsbLastUpdatedBy()!=null){
                dataRow.createCell(27).setCellValue(scdaGroupSizeBase.getSgsbLastUpdatedBy());
            }

            if(scdaGroupSizeBase.getSgsbEnableFlag()!=null){
                dataRow.createCell(28).setCellValue(scdaGroupSizeBase.getSgsbEnableFlag());
            }
        }


        return hssfWorkbook;
    }
}

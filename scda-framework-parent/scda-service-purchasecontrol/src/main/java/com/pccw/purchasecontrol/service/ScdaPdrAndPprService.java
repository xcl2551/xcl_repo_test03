package com.pccw.purchasecontrol.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pccw.framework.domain.purchasecontrol.ScdaPdrAndPpr;
import com.pccw.framework.domain.purchasecontrol.ScdaPdrAndPprExample;
import com.pccw.framework.domain.purchasecontrol.request.PurchaseControlRequest;
import com.pccw.framework.domain.purchasecontrol.response.PurchaseControlCode;
import com.pccw.framework.domain.purchasecontrol.response.ScdaPdrAndPprResult;
import com.pccw.framework.exception.ExceptionCast;
import com.pccw.framework.model.response.CommonCode;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.framework.model.response.QueryResult;
import com.pccw.framework.utils.CommonNullUtil;
import com.pccw.framework.utils.ScdaDateFormartUtil;
import com.pccw.purchasecontrol.mapper.ScdaPdrAndPprMapper;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: xcl
 * @Date: 2019-3-29 13:40
 * @Version 1.0
 */
@Service
public class ScdaPdrAndPprService {

    @Autowired
    private ScdaPdrAndPprMapper pdrAndPprMapper;


    /**
     * 通过pdrPprNumber 查询一条记录
     *
     * @param pdrPprNumber
     * @return
     */
    public ScdaPdrAndPprResult findoneByPdrPprNumber(String pdrPprNumber) {

        //2通过主键查询一条记录
        ScdaPdrAndPpr scdaPdrAndPpr = pdrAndPprMapper.selectByPrimaryKey(pdrPprNumber);
        //3逻辑合理性判断
        //3.1 空值判断
        if (CommonNullUtil.isEmpty(scdaPdrAndPpr)) {
            //PURCHASECONTROL_PDRPPRNUMBER_NONE(true,22001,"查询的编号不存在"),
            return new ScdaPdrAndPprResult(PurchaseControlCode.PURCHASECONTROL_PDRPPRNUMBER_NONE, null);
        }
        //3.2 可用状态判断
        if (!"Y".equals(scdaPdrAndPpr.getEnableFlag())) {
            //PURCHASECONTROL_ENABLEFLAGE_N(true,22002,"查询的编号不可用"),
            return new ScdaPdrAndPprResult(PurchaseControlCode.PURCHASECONTROL_ENABLEFLAGE_N, null);
        }
        //3.3 否则返回正确结果
        ScdaPdrAndPprResult scdaPdrAndPprResult = new ScdaPdrAndPprResult(CommonCode.SUCCESS, scdaPdrAndPpr);

        return scdaPdrAndPprResult;
    }


    /**
     * 分页查询
     *
     * @param purchaseControlRequest
     * @return
     */
    public QueryResponseResult<ScdaPdrAndPpr> findPage(PurchaseControlRequest purchaseControlRequest) {


        //1 获取当前页码
        String pageNum = purchaseControlRequest.getPageNum();
        if (pageNum == null) {
            pageNum = "1";
        }
        //2 获取每页显示条数
        String pageSize = purchaseControlRequest.getPageSize();
        if (pageSize == null) {
            pageSize = "10";
        }

        //获取开始时间,结束时间
        String startCreateDate = purchaseControlRequest.getStartCreateDate();
        String endCreateDate = purchaseControlRequest.getEndCreateDate();

        //列表查询
        PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        ScdaPdrAndPprExample example = new ScdaPdrAndPprExample();
        ScdaPdrAndPprExample.Criteria criteria = example.createCriteria();
        //添加条件可用状态为Y
        criteria.andEnableFlagEqualTo("Y");
        if (startCreateDate != null && endCreateDate != null) {
            Map<String, Date> dateStartAndEnd = null;
            try {
                dateStartAndEnd = ScdaDateFormartUtil.getDateStartAndEnd(startCreateDate, endCreateDate);
            } catch (ParseException e) {
                ExceptionCast.cast(CommonCode.STRDEADLINEDATE_ILLEGALITY);
            }
            criteria.andPdrPprCreationDateBetween(dateStartAndEnd.get("startDate"), dateStartAndEnd.get("endDate"));
        }
        example.setOrderByClause("pdr_ppr_number desc");
        Page<ScdaPdrAndPpr> scdaPdrAndPprs = (Page<ScdaPdrAndPpr>) pdrAndPprMapper.selectByExample(example);


        QueryResult<ScdaPdrAndPpr> queryResult = new QueryResult<>();
        queryResult.setTotal(scdaPdrAndPprs.getTotal());
        queryResult.setList(scdaPdrAndPprs.getResult());
        return new QueryResponseResult<ScdaPdrAndPpr>(CommonCode.SUCCESS, queryResult);
    }


    /**
     * 文件下载
     */
    public HSSFWorkbook downloadExcel(PurchaseControlRequest purchaseControlRequest) {
        //设置页面为第一页 ,设置每页显示0条
        purchaseControlRequest.setPageNum("1");
        purchaseControlRequest.setPageSize("0");
        QueryResponseResult<ScdaPdrAndPpr> page = this.findPage(purchaseControlRequest);
        List<ScdaPdrAndPpr> scdaPdrAndPprsList = page.getQueryResult().getList();
        //创建excel表
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        HSSFSheet sheet = hssfWorkbook.createSheet("采购需求基础数据");
        //设置表头
        HSSFRow headRow = sheet.createRow(0);
        headRow.createCell(0).setCellValue("需求单或项目编号");
        headRow.createCell(1).setCellValue("采购结果id");
        headRow.createCell(2).setCellValue("采购方案NUMBER");
        headRow.createCell(3).setCellValue("采购方部门");
        headRow.createCell(4).setCellValue("采购类型");
        headRow.createCell(5).setCellValue("采购结果确认时间");
        headRow.createCell(6).setCellValue("采购需求状态");
        headRow.createCell(7).setCellValue("采购完成时间");
        headRow.createCell(8).setCellValue("采购需求创建时间");
        headRow.createCell(9).setCellValue("合同金额");
        headRow.createCell(10).setCellValue("税率");
        headRow.createCell(11).setCellValue("税码");
        headRow.createCell(12).setCellValue("采购预算万元");
        headRow.createCell(13).setCellValue("估算金额含税万元");
        headRow.createCell(14).setCellValue("不含税金额");
        headRow.createCell(15).setCellValue("采购内容");
        headRow.createCell(16).setCellValue("ES编号");
        headRow.createCell(17).setCellValue("ES项目id");
        headRow.createCell(18).setCellValue("开支类型");
        headRow.createCell(19).setCellValue("采购方式编码");
        headRow.createCell(20).setCellValue("单一来源场景编码");
        headRow.createCell(21).setCellValue("特殊场景应用理由编码");
        headRow.createCell(22).setCellValue("特殊场景应用理由");
        headRow.createCell(23).setCellValue("创建时间");
        headRow.createCell(24).setCellValue("创建人");
        headRow.createCell(25).setCellValue("最后修改时间");
        headRow.createCell(26).setCellValue("最后修改人");
        headRow.createCell(27).setCellValue("value- Y可用,N不可用");

        for (ScdaPdrAndPpr scdaPdrAndPpr : scdaPdrAndPprsList) {
            HSSFRow dataRow = sheet.createRow(sheet.getLastRowNum() + 1);
            if (scdaPdrAndPpr.getPdrPprNumber() != null) {
                dataRow.createCell(0).setCellValue(scdaPdrAndPpr.getPdrPprNumber());
            }

            if (scdaPdrAndPpr.getPurchaseResultId() != null) {
                dataRow.createCell(1).setCellValue(String.valueOf(scdaPdrAndPpr.getPurchaseResultId()));
            }

            if (scdaPdrAndPpr.getPurchaseSchemeNumber() != null) {
                dataRow.createCell(2).setCellValue(scdaPdrAndPpr.getPurchaseSchemeNumber());
            }

            if (scdaPdrAndPpr.getDepartmentName() != null) {
                dataRow.createCell(3).setCellValue(scdaPdrAndPpr.getDepartmentName());
            }

            if (scdaPdrAndPpr.getPurchaseTypeCode() != null) {
                dataRow.createCell(4).setCellValue(scdaPdrAndPpr.getPurchaseTypeCode());
            }

            if (scdaPdrAndPpr.getPurchaseResultConfirmDate() != null) {
                //进行日期转换
                dataRow.createCell(5).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPdrAndPpr.getPurchaseResultConfirmDate()));
            }

            if (scdaPdrAndPpr.getStatusLookupCode() != null) {
                dataRow.createCell(6).setCellValue(scdaPdrAndPpr.getStatusLookupCode());
            }

            if (scdaPdrAndPpr.getDateCompleted() != null) {
                //进行日期转换
                dataRow.createCell(7).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPdrAndPpr.getDateCompleted()));
            }

            if (scdaPdrAndPpr.getPdrPprCreationDate() != null) {
                //进行日期转换
                dataRow.createCell(8).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPdrAndPpr.getPdrPprCreationDate()));
            }

            if (scdaPdrAndPpr.getContractAmount() != null) {
                dataRow.createCell(9).setCellValue(String.valueOf(scdaPdrAndPpr.getContractAmount()));
            }

            if (scdaPdrAndPpr.getTaxRate() != null) {
                dataRow.createCell(10).setCellValue(String.valueOf(scdaPdrAndPpr.getTaxRate()));
            }

            if (scdaPdrAndPpr.getTaxCode() != null) {
                dataRow.createCell(11).setCellValue(scdaPdrAndPpr.getTaxCode());
            }

            if (scdaPdrAndPpr.getPurchaseBudget() != null) {
                dataRow.createCell(12).setCellValue(String.valueOf(scdaPdrAndPpr.getPurchaseBudget()));
            }

            if (scdaPdrAndPpr.getPurchaseBudgetTax() != null) {
                dataRow.createCell(13).setCellValue(String.valueOf(scdaPdrAndPpr.getPurchaseBudgetTax()));
            }

            if (scdaPdrAndPpr.getEstimatedInvestment() != null) {
                dataRow.createCell(14).setCellValue(String.valueOf(scdaPdrAndPpr.getEstimatedInvestment()));
            }

            if (scdaPdrAndPpr.getPurchaseContent() != null) {
                dataRow.createCell(15).setCellValue(scdaPdrAndPpr.getPurchaseContent());
            }

            if (scdaPdrAndPpr.getEsNumber() != null) {
                dataRow.createCell(16).setCellValue(scdaPdrAndPpr.getEsNumber());
            }

            if (scdaPdrAndPpr.getEsProjectCode() != null) {
                dataRow.createCell(17).setCellValue(scdaPdrAndPpr.getEsProjectCode());
            }

            if (scdaPdrAndPpr.getExpenditureType() != null) {
                dataRow.createCell(18).setCellValue(scdaPdrAndPpr.getExpenditureType());
            }

            if (scdaPdrAndPpr.getPurchaseMethodCode() != null) {
                dataRow.createCell(19).setCellValue(scdaPdrAndPpr.getPurchaseMethodCode());
            }

            if (scdaPdrAndPpr.getUniqueSourceSceneCode() != null) {
                dataRow.createCell(20).setCellValue(scdaPdrAndPpr.getUniqueSourceSceneCode());
            }

            if (scdaPdrAndPpr.getApplicationReasonCode() != null) {
                dataRow.createCell(21).setCellValue(scdaPdrAndPpr.getApplicationReasonCode());
            }

            if (scdaPdrAndPpr.getApplicationReason() != null) {
                dataRow.createCell(22).setCellValue(scdaPdrAndPpr.getApplicationReason());
            }

            if (scdaPdrAndPpr.getCreationDate() != null) {
                dataRow.createCell(23).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPdrAndPpr.getCreationDate()));
            }

            if (scdaPdrAndPpr.getCreatedBy() != null) {
                dataRow.createCell(24).setCellValue(scdaPdrAndPpr.getCreatedBy());
            }

            if (scdaPdrAndPpr.getLastUpdateDate() != null) {

                dataRow.createCell(25).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPdrAndPpr.getLastUpdateDate()));
            }

            if (scdaPdrAndPpr.getLastUpdatedBy() != null) {
                dataRow.createCell(26).setCellValue(scdaPdrAndPpr.getLastUpdatedBy());
            }

            if (scdaPdrAndPpr.getEnableFlag() != null) {
                dataRow.createCell(27).setCellValue(scdaPdrAndPpr.getEnableFlag());
            }
        }
        return hssfWorkbook;
    }
}

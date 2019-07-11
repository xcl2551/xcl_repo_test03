package com.pccw.purchasetime.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pccw.framework.domain.purchasetime.ScdaPurTimeBase;
import com.pccw.framework.domain.purchasetime.ScdaPurTimeBaseExample;
import com.pccw.framework.domain.purchasetime.request.ScdaPurTimeBaseRequest;
import com.pccw.framework.domain.purchasetime.response.ScdaPurTimeBaseResult;
import com.pccw.framework.exception.ExceptionCast;
import com.pccw.framework.model.response.CommonCode;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.framework.model.response.QueryResult;
import com.pccw.framework.utils.ScdaDateFormartUtil;
import com.pccw.purchasetime.mapper.ScdaPurTimeBaseMapper;
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
 * @Date: 2019-05-06 14:14:16
 * @Version 1.0
 */
@Service
public class ScdaPurTimeBaseService {
    @Autowired
    private ScdaPurTimeBaseMapper scdaPurTimeBaseMapper;

    /**
     * 获取一个类型的一条数据
     *
     * @param scdaPurTimeBaseRequest
     * @return
     */
    public ScdaPurTimeBaseResult findOneType(ScdaPurTimeBaseRequest scdaPurTimeBaseRequest) {
        return null;
    }


    /**
     * 按条件分页查询
     *
     * @param scdaPurTimeBaseRequest
     * @return
     */
    public QueryResponseResult<ScdaPurTimeBase> findPage(ScdaPurTimeBaseRequest scdaPurTimeBaseRequest) {
        //1 获取当前页码
        String pageNum = scdaPurTimeBaseRequest.getPageNum();
        if (pageNum == null) {
            pageNum = "1";
        }
        //2 获取每页显示条数
        String pageSize = scdaPurTimeBaseRequest.getPageSize();
        if (pageSize == null) {
            pageSize = "10";
        }

        //获取开始时间,结束时间
        String startCreateDate = scdaPurTimeBaseRequest.getStartCreateDate();
        String endCreateDate = scdaPurTimeBaseRequest.getEndCreateDate();

        PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        ScdaPurTimeBaseExample example = new ScdaPurTimeBaseExample();
        ScdaPurTimeBaseExample.Criteria criteria = example.createCriteria();
        if (startCreateDate != null && endCreateDate != null) {
            Map<String, Date> dateStartAndEnd = null;
            try {
                dateStartAndEnd = ScdaDateFormartUtil.getDateStartAndEnd(startCreateDate, endCreateDate);
            } catch (ParseException e) {
                ExceptionCast.cast(CommonCode.STRDEADLINEDATE_ILLEGALITY);
            }
            criteria.andPurDemandCareatDateBetween(dateStartAndEnd.get("startDate"), dateStartAndEnd.get("endDate"));
        }
        //条件满足筛选
        if (scdaPurTimeBaseRequest.getProWarnStatus() !=null) {
            criteria.andProWarnStatusEqualTo(scdaPurTimeBaseRequest.getProWarnStatus());
        }
        //添加条件可用状态为Y
        criteria.andPtbEnableFlagEqualTo("Y");
        //按时间倒序排序
        example.setOrderByClause("pur_demand_careat_date desc,key_id desc");
        Page<ScdaPurTimeBase> scdaPurTimeBases = (Page<ScdaPurTimeBase>) scdaPurTimeBaseMapper.selectByExample(example);
        QueryResult<ScdaPurTimeBase> queryResult = new QueryResult<>();
        queryResult.setTotal(scdaPurTimeBases.getTotal());
        queryResult.setList(scdaPurTimeBases.getResult());
        return new QueryResponseResult<>(CommonCode.SUCCESS, queryResult);
    }

    /**
     * 提供下载功能
     * @param scdaPurTimeBaseRequest
     * @return
     */
    public HSSFWorkbook downloadExcel(ScdaPurTimeBaseRequest scdaPurTimeBaseRequest) {
        //定义第一页显示全部
        scdaPurTimeBaseRequest.setPageNum("1");
        scdaPurTimeBaseRequest.setPageSize("0");
        QueryResponseResult<ScdaPurTimeBase> page = this.findPage(scdaPurTimeBaseRequest);
        QueryResult<ScdaPurTimeBase> queryResult = page.getQueryResult();
        List<ScdaPurTimeBase> list = queryResult.getList();
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        HSSFSheet sheet = hssfWorkbook.createSheet("采购时效基础表");
        //设置表头
        HSSFRow headRow = sheet.createRow(0);
        headRow.createCell(0).setCellValue("主键");
        headRow.createCell(1).setCellValue("采购流程环节");
        headRow.createCell(2).setCellValue("项目预警状态");
        headRow.createCell(3).setCellValue("集采类型");
        headRow.createCell(4).setCellValue("采购需求项目名称");
        headRow.createCell(5).setCellValue("采购需求编号");
        headRow.createCell(6).setCellValue("ES项目编号");
        headRow.createCell(7).setCellValue("ES项目名称");
        headRow.createCell(8).setCellValue("需求部门");
        headRow.createCell(9).setCellValue("采购方案预算金额不含税万元");
        headRow.createCell(10).setCellValue("采购主管");
        headRow.createCell(11).setCellValue("采购部门");
        headRow.createCell(12).setCellValue("采购方案决策层级");
        headRow.createCell(13).setCellValue("采购方式");
        headRow.createCell(14).setCellValue("项目标准时长天数自然日");
        headRow.createCell(15).setCellValue("项目标准时长天数工作日");
        headRow.createCell(16).setCellValue("项目进展总耗时");
        headRow.createCell(17).setCellValue("项目整体提前延迟时长");
        headRow.createCell(18).setCellValue("需求挂起总耗时工作日");
        headRow.createCell(19).setCellValue("采购需求创建时间");
        headRow.createCell(20).setCellValue("采购需求单分配时间");
        headRow.createCell(21).setCellValue("需求挂起次数");
        headRow.createCell(22).setCellValue("需求第一次挂起开始日期");
        headRow.createCell(23).setCellValue("需求最后一次挂起结束日期");
        headRow.createCell(24).setCellValue("采购方案提交时间");
        headRow.createCell(25).setCellValue("采购方案审批完成时间");
        headRow.createCell(26).setCellValue("采购方案ES立项时间");
        headRow.createCell(27).setCellValue("公告发布时间");
        headRow.createCell(28).setCellValue("标书购买截止时间");
        headRow.createCell(29).setCellValue("投标应答截止时间");
        headRow.createCell(30).setCellValue("评标评审截止时间");
        headRow.createCell(31).setCellValue("定标采购结果确认时间");
        headRow.createCell(32).setCellValue("采购结果提交时间");
        headRow.createCell(33).setCellValue("采购结果审批完成时间");
        headRow.createCell(34).setCellValue("ES项目结束时间");
        headRow.createCell(35).setCellValue("是否签订框架合同");
        headRow.createCell(36).setCellValue("合同草稿导入时间");
        headRow.createCell(37).setCellValue("合同提交时间");
        headRow.createCell(38).setCellValue("合同审批通过时间");
        headRow.createCell(39).setCellValue("合同生效时间");
        headRow.createCell(40).setCellValue("合同履行开始日期");
        headRow.createCell(41).setCellValue("合同履行结束日期");
        headRow.createCell(42).setCellValue("需求单状态");
        headRow.createCell(43).setCellValue("整体标准时长");
        headRow.createCell(44).setCellValue("需求环节标准时长");
        headRow.createCell(45).setCellValue("方案环节标准时长");
        headRow.createCell(46).setCellValue("ES环节标准时长");
        headRow.createCell(47).setCellValue("结果环节标准时长");
        headRow.createCell(48).setCellValue("合同环节标准时长");
        headRow.createCell(49).setCellValue("创建时间");
        headRow.createCell(50).setCellValue("创建人");
        headRow.createCell(51).setCellValue("最后修改时间");
        headRow.createCell(52).setCellValue("最后修改人");
        headRow.createCell(53).setCellValue("value- Y可用,N不可用");
        for (ScdaPurTimeBase scdaPurTimeBase : list) {
            HSSFRow dataRow = sheet.createRow(sheet.getLastRowNum()+1);
            if(scdaPurTimeBase.getKeyId()!=null){
                dataRow.createCell(0).setCellValue(scdaPurTimeBase.getKeyId());
            }

            if(scdaPurTimeBase.getPurFlowLink()!=null){
                dataRow.createCell(1).setCellValue(scdaPurTimeBase.getPurFlowLink());
            }

            if(scdaPurTimeBase.getProWarnStatus()!=null){
                dataRow.createCell(2).setCellValue(scdaPurTimeBase.getProWarnStatus());
            }

            if(scdaPurTimeBase.getAttributeCategory()!=null){
                dataRow.createCell(3).setCellValue(scdaPurTimeBase.getAttributeCategory());
            }

            if(scdaPurTimeBase.getPurDemandProjectName()!=null){
                dataRow.createCell(4).setCellValue(scdaPurTimeBase.getPurDemandProjectName());
            }

            if(scdaPurTimeBase.getPurDemandNumber()!=null){
                dataRow.createCell(5).setCellValue(scdaPurTimeBase.getPurDemandNumber());
            }

            if(scdaPurTimeBase.getEsProjectNumber()!=null){
                dataRow.createCell(6).setCellValue(scdaPurTimeBase.getEsProjectNumber());
            }

            if(scdaPurTimeBase.getEsProjectName()!=null){
                dataRow.createCell(7).setCellValue(scdaPurTimeBase.getEsProjectName());
            }

            if(scdaPurTimeBase.getDemandDept()!=null){
                dataRow.createCell(8).setCellValue(scdaPurTimeBase.getDemandDept());
            }

            if(scdaPurTimeBase.getSchBudgetTaxNo()!=null){
                dataRow.createCell(9).setCellValue(scdaPurTimeBase.getSchBudgetTaxNo());
            }

            if(scdaPurTimeBase.getPurComp()!=null){
                dataRow.createCell(10).setCellValue(scdaPurTimeBase.getPurComp());
            }

            if(scdaPurTimeBase.getPurDept()!=null){
                dataRow.createCell(11).setCellValue(scdaPurTimeBase.getPurDept());
            }

            if(scdaPurTimeBase.getSchDecisionLevel()!=null){
                dataRow.createCell(12).setCellValue(scdaPurTimeBase.getSchDecisionLevel());
            }

            if(scdaPurTimeBase.getPurWay()!=null){
                dataRow.createCell(13).setCellValue(scdaPurTimeBase.getPurWay());
            }

            if(scdaPurTimeBase.getProTimeNatural()!=null){
                dataRow.createCell(14).setCellValue(scdaPurTimeBase.getProTimeNatural());
            }

            if(scdaPurTimeBase.getProTimeWorking()!=null){
                dataRow.createCell(15).setCellValue(scdaPurTimeBase.getProTimeWorking());
            }

            if(scdaPurTimeBase.getProTotalElapsedTime()!=null){
                dataRow.createCell(16).setCellValue(scdaPurTimeBase.getProTotalElapsedTime());
            }

            if(scdaPurTimeBase.getProBefAfterTime()!=null){
                dataRow.createCell(17).setCellValue(scdaPurTimeBase.getProBefAfterTime());
            }

            if(scdaPurTimeBase.getDemandHanguoTotalTime()!=null){
                dataRow.createCell(18).setCellValue(scdaPurTimeBase.getDemandHanguoTotalTime());
            }

            if(scdaPurTimeBase.getPurDemandCareatDate()!=null){
                dataRow.createCell(19).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getPurDemandCareatDate()));
            }

            if(scdaPurTimeBase.getPurDemandAllotDate()!=null){
                dataRow.createCell(20).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getPurDemandAllotDate()));
            }

            if(scdaPurTimeBase.getDemandHanguoNum()!=null){
                dataRow.createCell(21).setCellValue(scdaPurTimeBase.getDemandHanguoNum());
            }

            if(scdaPurTimeBase.getDemandFirstHanguoStartdate()!=null){
                dataRow.createCell(22).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getDemandFirstHanguoStartdate()));
            }

            if(scdaPurTimeBase.getDemandEndHanguoEnddate()!=null){
                dataRow.createCell(23).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getDemandEndHanguoEnddate()));
            }

            if(scdaPurTimeBase.getSchSubmitDate()!=null){
                dataRow.createCell(24).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getSchSubmitDate()));
            }

            if(scdaPurTimeBase.getSchApprovePassDate()!=null){
                dataRow.createCell(25).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getSchApprovePassDate()));
            }

            if(scdaPurTimeBase.getSchEsSetDate()!=null){
                dataRow.createCell(26).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getSchEsSetDate()));
            }

            if(scdaPurTimeBase.getAnnouncementDate()!=null){
                dataRow.createCell(27).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getAnnouncementDate()));
            }

            if(scdaPurTimeBase.getBidDocBuyEnddate()!=null){
                dataRow.createCell(28).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getBidDocBuyEnddate()));
            }

            if(scdaPurTimeBase.getBidReplyEndate()!=null){
                dataRow.createCell(29).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getBidReplyEndate()));
            }

            if(scdaPurTimeBase.getBidReviewEnddate()!=null){
                dataRow.createCell(30).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getBidReviewEnddate()));
            }

            if(scdaPurTimeBase.getBidConfirmResDate()!=null){
                dataRow.createCell(31).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getBidConfirmResDate()));
            }

            if(scdaPurTimeBase.getPurResSubmitDate()!=null){
                dataRow.createCell(32).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getPurResSubmitDate()));
            }

            if(scdaPurTimeBase.getPurResApproveDate()!=null){
                dataRow.createCell(33).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getPurResApproveDate()));
            }

            if(scdaPurTimeBase.getEsProjectEndDate()!=null){
                dataRow.createCell(34).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getEsProjectEndDate()));
            }

            if(scdaPurTimeBase.getIsSignFrameContract()!=null){
                dataRow.createCell(35).setCellValue(scdaPurTimeBase.getIsSignFrameContract());
            }

            if(scdaPurTimeBase.getCmDraftDate()!=null){
                dataRow.createCell(36).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getCmDraftDate()));
            }

            if(scdaPurTimeBase.getCmCreateDate()!=null){
                dataRow.createCell(37).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getCmCreateDate()));
            }

            if(scdaPurTimeBase.getCmApproveDate()!=null){
                dataRow.createCell(38).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getCmApproveDate()));
            }

            if(scdaPurTimeBase.getContractValidDate()!=null){
                dataRow.createCell(39).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getContractValidDate()));
            }

            if(scdaPurTimeBase.getCmStartDate()!=null){
                dataRow.createCell(40).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getCmStartDate()));
            }

            if(scdaPurTimeBase.getCmEndDate()!=null){
                dataRow.createCell(41).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getCmEndDate()));
            }

            if(scdaPurTimeBase.getPurDemandStatus()!=null){
                dataRow.createCell(42).setCellValue(scdaPurTimeBase.getPurDemandStatus());
            }

            if(scdaPurTimeBase.getTotalFlowLinkTime()!=null){
                dataRow.createCell(43).setCellValue(scdaPurTimeBase.getTotalFlowLinkTime());
            }

            if(scdaPurTimeBase.getDemandFlowLinkTime()!=null){
                dataRow.createCell(44).setCellValue(scdaPurTimeBase.getDemandFlowLinkTime());
            }

            if(scdaPurTimeBase.getSchFlowLinkTime()!=null){
                dataRow.createCell(45).setCellValue(scdaPurTimeBase.getSchFlowLinkTime());
            }

            if(scdaPurTimeBase.getEsFlowLinkTime()!=null){
                dataRow.createCell(46).setCellValue(scdaPurTimeBase.getEsFlowLinkTime());
            }

            if(scdaPurTimeBase.getResultFlowLinkTime()!=null){
                dataRow.createCell(47).setCellValue(scdaPurTimeBase.getResultFlowLinkTime());
            }

            if(scdaPurTimeBase.getContractFlowLinkTime()!=null){
                dataRow.createCell(48).setCellValue(scdaPurTimeBase.getContractFlowLinkTime());
            }

            if(scdaPurTimeBase.getPtbCreationDate()!=null){
                dataRow.createCell(49).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getPtbCreationDate()));
            }

            if(scdaPurTimeBase.getPtbCreatedBy()!=null){
                dataRow.createCell(50).setCellValue(scdaPurTimeBase.getPtbCreatedBy());
            }

            if(scdaPurTimeBase.getPtbLastUpdateDate()!=null){
                dataRow.createCell(51).setCellValue(ScdaDateFormartUtil.dateTo24HourStr(scdaPurTimeBase.getPtbLastUpdateDate()));
            }

            if(scdaPurTimeBase.getPtbLastUpdatedBy()!=null){
                dataRow.createCell(52).setCellValue(scdaPurTimeBase.getPtbLastUpdatedBy());
            }

            if(scdaPurTimeBase.getPtbEnableFlag()!=null){
                dataRow.createCell(53).setCellValue(scdaPurTimeBase.getPtbEnableFlag());
            }
        }
        return hssfWorkbook;
    }
}

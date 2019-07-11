package com.pccw.purchaseexecute.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pccw.framework.domain.purchasecontrol.response.PurchaseControlCode;
import com.pccw.framework.domain.purchaseexecute.ScdaYearPurcExecute;
import com.pccw.framework.domain.purchaseexecute.ScdaYearPurcExecuteExample;
import com.pccw.framework.domain.purchaseexecute.request.PurchaseExecuteRequest;
import com.pccw.framework.domain.purchaseexecute.response.ScdaYearPurcExecuteResult;
import com.pccw.framework.exception.ExceptionCast;
import com.pccw.framework.model.response.CommonCode;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.framework.model.response.QueryResult;
import com.pccw.framework.utils.CommonNullUtil;
import com.pccw.framework.utils.ScdaDateFormartUtil;
import com.pccw.purchaseexecute.mapper.ScdaYearPurcExecuteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: xcl
 * @Date: 2019-4-9 14:06
 * @Version 1.0
 */
@Service
public class ScdaYearPurcExecuteService {
    @Autowired
    private ScdaYearPurcExecuteMapper scdaYearPurcExecuteMapper;

    public ScdaYearPurcExecuteResult findOneByDeadlineDate(PurchaseExecuteRequest purchaseExecuteRequest) {

        //判断截止日期是否为空
        if (CommonNullUtil.isEmpty(purchaseExecuteRequest.getStrDeadlineDate())) {
            ExceptionCast.cast(PurchaseControlCode.PURCHASECONTROL_STRDEADLINEDATE_NONE);
        }
        //获取截止日期
        String strDeadlineDate = purchaseExecuteRequest.getStrDeadlineDate();

        //判断截止字符串格式是否正确
        if (!ScdaDateFormartUtil.checkSteDatePattern(strDeadlineDate, "yyyy-MM-dd")) {
            ExceptionCast.cast(PurchaseControlCode.PURCHASECONTROL_STRDEADLINEDATE_ILLEGALITY);
        }


        ScdaYearPurcExecuteExample example = new ScdaYearPurcExecuteExample();
        ScdaYearPurcExecuteExample.Criteria criteria = example.createCriteria();
        criteria.andDeadlineDateEqualTo(strDeadlineDate);
        List<ScdaYearPurcExecute> scdaYearPurcExecutes = scdaYearPurcExecuteMapper.selectByExample(example);
        //结果空值判断
        if (CommonNullUtil.isEmpty(scdaYearPurcExecutes)) {
            ExceptionCast.cast(PurchaseControlCode.PURCHASECONTROL_PDRPPRNUMBER_NONE);
        }


        //计数可用记录条数
        int enableNum = 0;
        //定义接收数据对象
        ScdaYearPurcExecute scdaYearPurcExecute = null;
        //获取创建时间(必有),然后获取最后更新时间,并取最后更新时间最大的
        for (ScdaYearPurcExecute YearPurcExecute : scdaYearPurcExecutes) {
            //判断是否可用
            if ("Y".equals(YearPurcExecute.getEnableFlag())) {
                enableNum++;
                //给对象复制
                scdaYearPurcExecute = YearPurcExecute;
            }
        }
        if (enableNum == 1) {
            //满足条件
            return new ScdaYearPurcExecuteResult(CommonCode.SUCCESS, scdaYearPurcExecute);
        }

        //对计数结果进行判断
        if (enableNum == 0) {
            ExceptionCast.cast(PurchaseControlCode.PURCHASECONTROL_ENABLEFLAGE_N);
        }

        //如果超过两条,需要联系管理员
        if (enableNum > 1) {
            ExceptionCast.cast(CommonCode.DATE_ERROR);
        }

        return null;
    }

    public QueryResponseResult<ScdaYearPurcExecute> findPage(PurchaseExecuteRequest purchaseExecuteRequest) {
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
        ScdaYearPurcExecuteExample example = new ScdaYearPurcExecuteExample();
        ScdaYearPurcExecuteExample.Criteria criteria = example.createCriteria();
        if (startCreateDate != null && endCreateDate != null) {
            Map<String, Date> dateStartAndEnd = null;
            try {
                dateStartAndEnd = ScdaDateFormartUtil.getDateStartAndEnd(startCreateDate, endCreateDate);
            } catch (ParseException e) {
                ExceptionCast.cast(CommonCode.STRDEADLINEDATE_ILLEGALITY);
            }
            criteria.andCreationDateBetween(dateStartAndEnd.get("startDate"), dateStartAndEnd.get("endDate"));
        }
        //添加条件可用状态为Y
        criteria.andEnableFlagEqualTo("Y");
        //按时间倒序排序
        example.setOrderByClause("creation_date desc,ype_id desc");
        Page<ScdaYearPurcExecute> scdaYearPurcExecutes = (Page<ScdaYearPurcExecute>) scdaYearPurcExecuteMapper.selectByExample(example);


        QueryResult<ScdaYearPurcExecute> queryResult = new QueryResult<>();
        queryResult.setTotal(scdaYearPurcExecutes.getTotal());
        queryResult.setList(scdaYearPurcExecutes.getResult());
        return new QueryResponseResult<>(CommonCode.SUCCESS, queryResult);
    }
}

package com.pccw.${modelName}.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pccw.framework.domain.${modelName}.${javaTableName};
import com.pccw.framework.domain.${modelName}.${javaTableName}Example;
import com.pccw.framework.domain.${modelName}.request.${javaTableName}Request;
import com.pccw.framework.domain.${modelName}.response.${javaTableName}Result;
import com.pccw.framework.exception.ExceptionCast;
import com.pccw.framework.model.response.CommonCode;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.framework.model.response.QueryResult;
import com.pccw.framework.utils.ScdaDateFormartUtil;
import com.pccw.${modelName}.mapper.${javaTableName}Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: xcl
 * @Date: ${currentTimeStr}
 * @Version 1.0
 */
@Service
public class ${javaTableName}Service {
    @Autowired
    private ${javaTableName}Mapper ${javaTableName?uncap_first}Mapper;

    /**
     * 获取一个类型的一条数据
     * @param ${javaTableName?uncap_first}Request
     * @return
     */
    public ${javaTableName}Result findOneType(${javaTableName}Request ${javaTableName?uncap_first}Request) {
        ${javaTableName}Example example = new ${javaTableName}Example();
        //对参数非空进行判断
        ${javaTableName}Example.Criteria criteria = example.createCriteria();
        if (<#list tableDetailConditions as tableDetailCondition>
    ${javaTableName?uncap_first}Request.get${tableDetailCondition.javaColumnName?cap_first}() == null  <#if tableDetailCondition_has_next>||</#if>
</#list>){
            ExceptionCast.cast(CommonCode.INVALID_PARAM);
        }
        <#list tableDetailConditions as tableDetailCondition>
        criteria.and${tableDetailCondition.javaColumnName?cap_first}EqualTo(${javaTableName?uncap_first}Request.get${tableDetailCondition.javaColumnName?cap_first}());
        </#list>
        criteria.andEnableFlagEqualTo("Y");
        List<${javaTableName}> ${javaTableName?uncap_first}s = ${javaTableName?uncap_first}Mapper.selectByExample(example);
    //对结果进行唯一判断
    if (${javaTableName?uncap_first}s.size() != 1){
    ExceptionCast.cast(CommonCode.DATE_ERROR);
    }
    return new ${javaTableName}Result(CommonCode.SUCCESS,${javaTableName?uncap_first}s.get(0));
    }


    /**
    * 按条件分页查询
    * @param ${javaTableName?uncap_first}Request
    * @return
    */
    public QueryResponseResult<${javaTableName}> findPage(${javaTableName}Request ${javaTableName?uncap_first}Request) {
        //1 获取当前页码
        String pageNum = ${javaTableName?uncap_first}Request.getPageNum();
        if (pageNum == null) {
        pageNum = "1";
        }
        //2 获取每页显示条数
        String pageSize = ${javaTableName?uncap_first}Request.getPageSize();
        if (pageSize == null) {
        pageSize = "10";
        }

        //获取开始时间,结束时间
        String startCreateDate = ${javaTableName?uncap_first}Request.getStartCreateDate();
        String endCreateDate = ${javaTableName?uncap_first}Request.getEndCreateDate();

        PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        ${javaTableName}Example example = new ${javaTableName}Example();
        ${javaTableName}Example.Criteria criteria = example.createCriteria();
        if (startCreateDate != null && endCreateDate != null) {
        Map<String, Date> dateStartAndEnd = this.getDateStartAndEnd(startCreateDate, endCreateDate);
        criteria.andCreationDateBetween(dateStartAndEnd.get("startDate"), dateStartAndEnd.get("endDate"));
        }
        //条件满足筛选
        if (<#list tableDetailConditions as tableDetailCondition>
    ${javaTableName?uncap_first}Request.get${tableDetailCondition.javaColumnName?cap_first}() != null  <#if tableDetailCondition_has_next>&&</#if>
        </#list>) {<#list tableDetailConditions as tableDetailCondition>criteria.and${tableDetailCondition.javaColumnName?cap_first}EqualTo(${javaTableName?uncap_first}Request.get${tableDetailCondition.javaColumnName?cap_first}());</#list>
        }
        //添加条件可用状态为Y
        criteria.andEnableFlagEqualTo("Y");
        //按时间倒序排序
        example.setOrderByClause("creation_date desc");
        Page<${javaTableName}> ${javaTableName?uncap_first}s = (Page<${javaTableName}>) ${javaTableName?uncap_first}Mapper.selectByExample(example);
            QueryResult<${javaTableName}> queryResult = new QueryResult<>();
                queryResult.setTotal(${javaTableName?uncap_first}s.getTotal());
                queryResult.setList(${javaTableName?uncap_first}s.getResult());
                return new QueryResponseResult<>(CommonCode.SUCCESS, queryResult);
                }

    /**
     * 获取开始及截止日期
     * @param startCreateDate
     * @param endCreateDate
     * @return
     */
    public Map<String,Date>  getDateStartAndEnd(String startCreateDate,String endCreateDate){
        //时间字符串是否符合规则
        if (!ScdaDateFormartUtil.checkSteDatePattern(startCreateDate, "yyyy-MM-dd") &&
                !ScdaDateFormartUtil.checkSteDatePattern(endCreateDate, "yyyy-MM-dd")) {
            ExceptionCast.cast(CommonCode.STRDEADLINEDATE_ILLEGALITY);
        }
        Date startDate = null;
        Date endDate = null;
        //转换为日期
        try {
            startDate = ScdaDateFormartUtil.stringToDate(startCreateDate, "yyyy-MM-dd");
            endDate = ScdaDateFormartUtil.stringToDate(endCreateDate, "yyyy-MM-dd");
        } catch (ParseException e) {
            ExceptionCast.cast(CommonCode.STRDEADLINEDATE_ILLEGALITY);
        }
        Map<String, Date> stringDateHashMap = new HashMap<>();
        stringDateHashMap.put("startDate",startDate);
        stringDateHashMap.put("endDate",endDate);
        return stringDateHashMap;
    }

}

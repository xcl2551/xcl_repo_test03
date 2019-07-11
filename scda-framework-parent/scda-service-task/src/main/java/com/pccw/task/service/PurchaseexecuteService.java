package com.pccw.task.service;

import com.alibaba.druid.sql.visitor.SQLASTOutputVisitor;
import com.pccw.framework.domain.purchaseexecute.ScdaGroupSizeBase;
import com.pccw.framework.exception.ExceptionCast;
import com.pccw.framework.model.response.CommonCode;
import com.pccw.framework.utils.ScdaDateFormartUtil;
import com.pccw.framework.utils.SnowflakeIdWorker;
import com.pccw.task.mapper.PurchaseexecuteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.*;

/**
 * @Author: xcl
 * @Date: 2019-4-15 9:29
 * @Version 1.0
 */
@Service
public class PurchaseexecuteService {

    @Autowired
    private PurchaseexecuteMapper purchaseexecuteMapper;


    /**
     * 同步数据库表scda_group_size_base(2_1_1上报集团基础数据表)
     */
    public Map<String, String> synPurchaseexecute() {
        Map<String, String> sql = new HashMap<>();
        purchaseexecuteMapper.synPurchaseexecute(sql);
        return sql;
    }




}

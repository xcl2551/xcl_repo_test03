package com.pccw.task.mapper;

import com.pccw.framework.domain.purchaseexecute.ScdaGroupSizeBase;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author: xcl
 * @Date: 2019-4-11 13:33
 * @Version 1.0
 */
public interface PurchaseexecuteMapper {

    /**
     * 同步数据库表scda_group_size_base(2_1_1上报集团基础数据表)
     *
     * @param sql
     */
    public void synPurchaseexecute(Map<String, String> sql);




}

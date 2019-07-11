package com.pccw.task.mapper;

import java.util.Map;

/**
 * @Author: xcl
 * @Date: 2019-4-3 15:27
 * @Version 1.0
 */
public interface PurchasecontrolMapper {



    /**
     * 同步第一个模块
     * @param sql
     * @return
     */
    public void synPurchasecontrol (Map<String,String> sql);

}

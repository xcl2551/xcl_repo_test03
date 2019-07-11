package com.pccw.task.service;

import com.pccw.framework.utils.ScdaDateFormartUtil;
import com.pccw.framework.utils.SnowflakeIdWorker;
import com.pccw.task.mapper.PurchasecontrolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xcl
 * @Date: 2019-4-3 15:26
 * @Version 1.0
 */
@Service
public class PurchasecontrolService {

    @Autowired
    private PurchasecontrolMapper purchasecontrolMapper;

    /**
     * 同步数据到(采购需求项目基础表  scda_pdr_and_ppr
     * @return
     */
    public Map<String, String> synPurchasecontrol() {
        Map<String, String> sql = new HashMap<>();
        purchasecontrolMapper.synPurchasecontrol(sql);
        return sql;
    }




}

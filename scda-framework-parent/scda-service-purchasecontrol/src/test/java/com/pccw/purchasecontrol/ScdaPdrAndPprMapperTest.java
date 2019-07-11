package com.pccw.purchasecontrol;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pccw.framework.domain.purchasecontrol.ScdaPdrAndPpr;
import com.pccw.framework.domain.purchasecontrol.ScdaPdrAndPprExample;
import com.pccw.framework.model.response.QueryResponseResult;
import com.pccw.purchasecontrol.controller.ScdaPdrAndPprController;
import com.pccw.purchasecontrol.mapper.ScdaPdrAndPprMapper;
import com.pccw.purchasecontrol.service.ScdaPdrAndPprService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: xcl
 * @Date: 2019-3-29 10:14
 * @Version 1.0
 */


@SpringBootTest
@RunWith(SpringRunner.class)
public class ScdaPdrAndPprMapperTest {
    @Autowired
    private ScdaPdrAndPprMapper pdrAndPprMapper;

    @Autowired
    private ScdaPdrAndPprController scdaPdrAndPprController;

    @Autowired
    private ScdaPdrAndPprService scdaPdrAndPprService;

    @Test
    public void testFindOne(){
        //PDR18020083

        ScdaPdrAndPpr pdr18020083 = pdrAndPprMapper.selectByPrimaryKey("PDR0083");
        System.out.println("pdr18020083 = " + pdr18020083);
    }






}

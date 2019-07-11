package com.pccw.purchaseexecute;

import com.pccw.framework.domain.purchaseexecute.ScdaAoGsGroupby;
import com.pccw.purchaseexecute.mapper.ScdaAoGsGroupbyMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: xcl
 * @Date: 2019-4-9 13:58
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisTest {
    @Autowired
    private ScdaAoGsGroupbyMapper scdaAoGsGroupbyMapper;


    @Test
    public void testGetOne(){
        ScdaAoGsGroupby scdaAoGsGroupby = scdaAoGsGroupbyMapper.selectByPrimaryKey("1");
        System.out.println("scdaAoGsGroupby = " + scdaAoGsGroupby);
    }



}

package com.pccw.createjavafile;

import com.pccw.createjavafile.domain.TableDetail;
import com.pccw.createjavafile.mapper.TableDetailMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: xcl
 * @Date: 2019-4-19 10:28
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TableDetailMapperTest {
    @Autowired
    private TableDetailMapper tableDetailMapper;

    @Test
    public void testGetDetailFromTableName(){
        List<TableDetail> scda_pur_time_total = tableDetailMapper.getDetailFromTableName("SCDA_PUR_TIME_TOTAL");
        System.out.println("scda_pur_time_total = " + scda_pur_time_total);
    }
}

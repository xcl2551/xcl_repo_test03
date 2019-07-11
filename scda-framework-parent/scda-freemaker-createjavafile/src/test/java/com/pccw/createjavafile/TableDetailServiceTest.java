package com.pccw.createjavafile;

import com.pccw.createjavafile.service.TableDetailService;
import freemarker.template.TemplateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * @Author: xcl
 * @Date: 2019-4-19 13:53
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TableDetailServiceTest {
    @Autowired
    private TableDetailService tableDetailService;

    /**
     * 测试生成  javaBean
     *
     * @throws IOException
     * @throws TemplateException
     */
    @Test
    public void testGetPojoClass() throws IOException, TemplateException {
        tableDetailService.getPojoClass("SCDA_PUR_TIME_TOTAL");
    }

    /**
     * 测试生成 mybatis  Mapper 接口
     *
     * @throws IOException
     * @throws TemplateException
     */
    @Test
    public void testGetMapperClass() throws IOException, TemplateException {
        tableDetailService.getMapperClass("SCDA_PUR_TIME_TOTAL");
    }

    /**
     * 测试生成 mybatis  xcl 映射文件
     *
     * @throws IOException
     * @throws TemplateException
     */
    @Test
    public void testGetMapperXmlClass() throws IOException, TemplateException {
        tableDetailService.getMapperXmlClass("SCDA_PUR_TIME_TOTAL");
    }

    /**
     * 测试生成其他文件
     * resquest  respsone controllerApi  controller service
     * @throws IOException
     * @throws TemplateException
     */
    @Test
    public void testGetAutoClassFromOracleTableName() throws IOException, TemplateException {
        tableDetailService.getAutoClassFromOracleTableName("SCDA_PUR_TIME_BASE","scda-service-purchasetime");    //3_5_0采购需求完成情况
//        tableDetailService.getAutoClassFromOracleTableName("SCDA_SCH_RES_APP_TIME_SUM","scda-service-purchasetime");    //3_2_0方案结果审批用时总结
//        tableDetailService.getAutoClassFromOracleTableName("SCDA_PUR_TIME_TOTAL_SUM", "scda-service-purchasetime");    //3_3_0整体采购时效性总结
//        tableDetailService.getAutoClassFromOracleTableName("SCDA_PUR_DEMAND_DETAIL","scda-service-purchasetime");    //3_4_0采购需求完成情况
//        tableDetailService.getAutoClassFromOracleTableName("SCDA_PUR_TIME_SUMMARY","scda-service-purchasetime");    //3_5_0采购需求完成情况
    }

    @Test
    public void testGetGet() throws IOException, TemplateException {
         //tableDetailService.getGet("SCDA_PDR_AND_PPR");
         //tableDetailService.getGet("SCDA_ACTUALLY_OCCURRED_BASE");
        // tableDetailService.getGet("SCDA_GROUP_SIZE_BASE");
         tableDetailService.getGet("SCDA_PUR_TIME_BASE");
    }


}

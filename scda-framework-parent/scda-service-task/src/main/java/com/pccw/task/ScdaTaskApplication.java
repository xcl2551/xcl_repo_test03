package com.pccw.task;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: xcl
 * @Date: 2019-3-29 9:44
 * @Version 1.0
 */

//@EnableDiscoveryClient
//@EnableFeignClients
@MapperScan("com.pccw.task.mapper")
@EntityScan("com.pccw.framework.domain.purchaseexecute")//扫描实体类
@ComponentScan(basePackages={"com.pccw.task"})//扫描接口
@ComponentScan(basePackages={"com.pccw.framework"})//扫描common下的所有类
@SpringBootApplication
public class ScdaTaskApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScdaTaskApplication.class,args);
    }

}

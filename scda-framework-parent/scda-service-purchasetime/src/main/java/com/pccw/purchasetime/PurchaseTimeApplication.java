package com.pccw.purchasetime;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: xcl
 * @Date: 2019-3-29 9:44
 * @Version 1.0
 */

@EnableDiscoveryClient
//@EnableFeignClients
@MapperScan("com.pccw.purchasetime.mapper")
@EntityScan("com.pccw.framework.domain.purchasetime")//扫描实体类
@ComponentScan(basePackages={"com.pccw.api.purchasetime"})//扫描接口
@ComponentScan(basePackages={"com.pccw.framework"})//扫描common下的所有类
@SpringBootApplication
@EnableSwagger2
public class PurchaseTimeApplication {
    public static void main(String[] args) {
        SpringApplication.run(PurchaseTimeApplication.class,args);
    }
}

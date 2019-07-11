package com.pccw.createjavafile;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: xcl
 * @Date: 2019-4-19 17:06
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.pccw.createjavafile.mapper")//扫描mybatis接口
@EntityScan("com.pccw.createjavafile.domain")//扫描实体类
@ComponentScan(basePackages={"com.pccw.createjavafile"})//扫描 crudmodel 下的所有类
public class CreateJavaFileApplication {
    public static void main(String[] args) {
        SpringApplication.run(CreateJavaFileApplication.class,args);
    }
}

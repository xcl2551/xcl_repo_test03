package com.pccw.ucenter;

import com.pccw.framework.domain.ucenter.pojo.MmsEmployees;
import com.pccw.framework.domain.ucenter.pojo.ScdaUserAuth;
import com.pccw.ucenter.mapper.MmsEmployeesMapper;
import com.pccw.ucenter.mapper.ScdaUserAuthMapper;
import lombok.ToString;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: xcl
 * @Date: 2019-3-5 21:33
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestSpringDataJpa {

    @Autowired
    ScdaUserAuthMapper userAuthRepository;

    @Autowired
    MmsEmployeesMapper  mmsEmployeesMapper;
    /**
     * 测试数据库的联通性
     */
    @Test
    public void testAdd(){
        String password = "xcl";
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        ScdaUserAuth xcl = userAuthRepository.findByUsername("xcl");
        boolean matches = passwordEncoder.matches(password, xcl.getPassword());
        System.out.println("matches = " + matches);
    }

    @Test
    public void testFindByscreenName(){
        MmsEmployees nijian = mmsEmployeesMapper.findByScreenname("nijian");
        System.out.println("nijian = " + nijian);

    }




}

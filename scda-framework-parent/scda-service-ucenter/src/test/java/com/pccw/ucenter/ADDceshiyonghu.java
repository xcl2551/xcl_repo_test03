package com.pccw.ucenter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Author: xcl
 * @Date: 2019-4-26 11:16
 * @Version 1.0
 */
public class ADDceshiyonghu {
    public static void main(String[] args) {

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode("123456");
        System.out.println("encode = " + encode);
    }
}

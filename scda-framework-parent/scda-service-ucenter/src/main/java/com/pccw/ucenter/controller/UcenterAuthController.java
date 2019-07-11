package com.pccw.ucenter.controller;

import com.pccw.api.ucenter.UcenterAuthControllerApi;
import com.pccw.framework.domain.ucenter.ext.ScdaUserAuthExt;
import com.pccw.ucenter.service.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @version 1.0
 **/
@RestController
@RequestMapping("/ucenter")
public class UcenterAuthController implements UcenterAuthControllerApi {
    @Autowired
    UserAuthService userService;

    @Override
    @GetMapping("/getuserext")
    public ScdaUserAuthExt getUserAuthext(@RequestParam("username") String username) {
        return userService.getUserAuthExt(username);
    }


}

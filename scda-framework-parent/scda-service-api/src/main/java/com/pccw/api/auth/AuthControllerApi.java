package com.pccw.api.auth;


import com.pccw.framework.domain.ucenter.request.LoginRequest;
import com.pccw.framework.domain.ucenter.response.JwtResult;
import com.pccw.framework.domain.ucenter.response.LoginResult;
import com.pccw.framework.model.response.ResponseResult;


/**
 * @Author: xcl
 * @Date: 2019-3-5 15:05
 * @Version 1.0
 */
public interface AuthControllerApi {

    /**
     * 登录
     * @param loginRequest
     * @return
     */
    public LoginResult login(LoginRequest loginRequest);


    /**
     * 登出
     * @return
     */
    public ResponseResult logout();


    /**
     * 获取JwT令牌
     * @return
     */
    public JwtResult userjwt();
}

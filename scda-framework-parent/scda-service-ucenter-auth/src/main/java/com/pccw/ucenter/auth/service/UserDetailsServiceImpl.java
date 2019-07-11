package com.pccw.ucenter.auth.service;




import com.pccw.framework.domain.ucenter.ext.ScdaUserAuthExt;
import com.pccw.framework.domain.ucenter.pojo.ScdaMenu;
import com.pccw.ucenter.auth.client.UserAuthClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserAuthClient userAuthClient;


    @Autowired
    ClientDetailsService clientDetailsService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //取出身份，如果身份为空说明没有认证
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        //没有认证统一采用httpbasic认证，httpbasic中存储了client_id和client_secret，开始认证client_id和client_secret
        if(authentication==null){
            ClientDetails clientDetails = clientDetailsService.loadClientByClientId(username);
            if(clientDetails!=null){
                //密码
                String clientSecret = clientDetails.getClientSecret();
                return new User(username,clientSecret,AuthorityUtils.commaSeparatedStringToAuthorityList(""));
            }
        }

        if (StringUtils.isEmpty(username)) {
            return null;
        }

        //查询数据库查询用户信息
        ScdaUserAuthExt userAuthext = userAuthClient.getUserAuthext(username);

        if (userAuthext == null){
            //返回null值表示用户不存在
            return null;
        }
        //数据库的查询密码
        String password = userAuthext.getPassword();

        ScdaUserAuthExt userext = new ScdaUserAuthExt();
        userext.setUsername("itcast");
        userext.setPassword(new BCryptPasswordEncoder().encode("123"));
        userext.setPermissions(new ArrayList<ScdaMenu>());
        if(userext == null){
            return null;
        }
        //权限字符串
        String userAuth_permission_string = "";

        //返回的  springsecurity 的  Userdetial 对象
        UserJwt userJwt = new UserJwt(username, password,
                AuthorityUtils.commaSeparatedStringToAuthorityList(userAuth_permission_string));

        userJwt.setId(userAuthext.getId()); //ID
        userJwt.setName(userAuthext.getName()); //用户名称


        return userJwt;
    }
}

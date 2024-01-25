package com.kob.backend.backend.service.impl.user.account;

import com.kob.backend.backend.pojo.User;
import com.kob.backend.backend.service.impl.utils.UserDetailsImpl;
import com.kob.backend.backend.service.user.account.LoginService;
import com.kob.backend.backend.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private AuthenticationManager authenticationManager;//

    @Override
    public Map<String,String> getToken(String username,String password){
        UsernamePasswordAuthenticationToken authenticationToken=
                new UsernamePasswordAuthenticationToken(username,password);

        //对用户进行身份验证。返回一个Authentication对象，表示验证成功。若验证失败则自动进入异常处理
        Authentication authentication = authenticationManager.authenticate(authenticationToken);

        //getPrincipal()方法用于获取验证成功的用户的主体对象（Principal）
        UserDetailsImpl loginUser= (UserDetailsImpl) authentication.getPrincipal();

        User user=loginUser.getUser();

        String jwt= JwtUtil.createJWT(user.getId().toString());

        Map<String,String> map=new HashMap<>();
        map.put("error_message","success");
        map.put("token",jwt);
        return map;
    }

}

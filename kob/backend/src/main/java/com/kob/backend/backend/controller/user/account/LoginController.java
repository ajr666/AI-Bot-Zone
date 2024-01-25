package com.kob.backend.backend.controller.user.account;

import com.kob.backend.backend.service.user.account.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/user/account/token/")
    public Map<String,String> getToken(@RequestBody Map<String,String>map){
        //例：请求url为/user/account/token?username=test&password=123456则map被注入{test,password}
        String username=map.get("username");
        String password=map.get("password");
        System.out.println(password+' '+username);
        return loginService.getToken(username,password);
    }
}

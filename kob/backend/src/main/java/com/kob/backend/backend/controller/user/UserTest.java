package com.kob.backend.backend.controller.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserTest {
    @PostMapping("/user/test/")
    public String test(){
        System.out.println("test");
        return "test";
    }
}

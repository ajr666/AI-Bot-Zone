package com.kob.backend.backend.controller.pk;

//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RequestMapping("/pk/")
@RestController //前后端不分离，返回数据，用RestController
public class BotInfoController {
    @RequestMapping("getbotinfo/")
    public List<Map<String,String>> getBotInfo() {
        List<Map<String,String>> list = new LinkedList<>();

        Map<String,String> bot1=new HashMap<>();
        bot1.put("name","tiger");
        bot1.put("rating","4500");

        Map<String,String> bot2=new HashMap<>();
        bot2.put("name","boss");
        bot2.put("rating","500");

        list.add(bot1);
        list.add(bot2);

        return list;
    }
}

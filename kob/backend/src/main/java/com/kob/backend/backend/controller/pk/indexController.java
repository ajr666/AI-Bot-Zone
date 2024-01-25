//pk页面主页面

package com.kob.backend.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller //标记为控制类，用于处理请求并返回响应。 访问链接，链接访问函数名，通过controller去看访问的哪个函数
public class indexController {
    @RequestMapping("/pk/index/")
    public String index(){
        return "pk/index.html"; //相对于templates
    }
}

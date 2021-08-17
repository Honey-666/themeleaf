package com.atguigu.thymeleaf.demo.controller;

import com.atguigu.thymeleaf.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello(Model model) {
        model.addAttribute("msg", "hello thymeleaf");
        model.addAttribute("user",new User("<font style='color:red;'>张三</font>",19000,new User("柳岩",18,null)));
        List<User> users = Arrays.asList(
                new User("柳岩", 21, null),
                new User("锋哥", 22, null),
                new User("杨紫", 23, null),
                new User("小鹿", 24, null)
        );
        model.addAttribute("users", users);

        model.addAttribute("brandId",1);
        model.addAttribute("pageSize",10);
        model.addAttribute("pageNum",1);
        model.addAttribute("date",new Date());
        return "hello";
    }
}

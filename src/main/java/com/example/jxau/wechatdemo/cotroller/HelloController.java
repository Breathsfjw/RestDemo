package com.example.jxau.wechatdemo.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


//@RestController
@Controller
public class HelloController {

    @RequestMapping("/test")
    public String hello(Model model){
        model.addAttribute("msg","hello springboot");
        model.addAttribute("msg1","<h1>hello springboot</h1>");
        model.addAttribute("msg2", Arrays.asList("hello","fanxiaodiu","2021-02-18"));
        return "test";
    }
}

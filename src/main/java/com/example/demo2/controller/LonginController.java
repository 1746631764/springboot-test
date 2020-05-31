package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import java.util.Map;

/**
 * @ClassName Longin
 * @Description
 * @Author linjunjin
 * @Date 2020/5/20 20:50
 **/
@Controller
public class LonginController {

    //@RequestMapping("/login")
    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password")String password, @RequestParam("vercode")String vercode, Map<String,Object> map){
        System.out.println(username+"=="+password+"=="+vercode);
        if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
            return "home";
        }else{
            map.put("msg","登录失败！");
            return "index";
        }

    }
}

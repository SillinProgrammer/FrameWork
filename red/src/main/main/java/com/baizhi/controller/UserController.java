package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/User")
public class UserController {
    @Autowired
    private  UserService userService;
    @RequestMapping("/register")
    public String register(User user){
        if(userService.register(user)){
            return "login";
        }
        return "error";
    }
    @RequestMapping("/login")
    public  String login(User user){
        userService.login(user);
        return "redirect:/Department/showAll.do";
    }
}

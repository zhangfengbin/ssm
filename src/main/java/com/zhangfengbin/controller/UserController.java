package com.zhangfengbin.controller;

import com.zhangfengbin.po.User;
import com.zhangfengbin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("getUser")
    public void getUser(){
        User user = userService.getUserById(1);
        System.err.println("user:"+user);

    }
}

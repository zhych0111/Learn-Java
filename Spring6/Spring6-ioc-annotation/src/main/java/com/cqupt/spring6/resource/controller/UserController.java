package com.cqupt.spring6.resource.controller;

import com.cqupt.spring6.autowired.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller(value = "myUserController")
public class UserController {
//    @Resource(name = "myUserService")
//    private UserService userService;
    // 根据类型匹配
    @Resource
    private UserService userService;

    public void add() {
        System.out.println("controller");
        userService.add();
    }
}

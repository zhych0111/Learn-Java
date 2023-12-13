package com.cqupt.spirng6.iocxml.auto.controller;

import com.cqupt.spirng6.iocxml.auto.service.UserService;
import com.cqupt.spirng6.iocxml.auto.service.UserServiceImpl;
import lombok.Data;

@Data
public class UserController {
    private UserService userService;
    public void addUser() {
        System.out.println("controller方法执行了......");
        userService.addUserService();
    }
}

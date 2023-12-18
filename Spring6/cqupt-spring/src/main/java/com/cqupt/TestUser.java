package com.cqupt;

import com.cqupt.bean.AnnotationApplicationContext;
import com.cqupt.bean.ApplicationContext;
import com.cqupt.service.UserService;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationApplicationContext("com.cqupt");
        UserService userService = (UserService) context.getBean(UserService.class);
        System.out.println(userService);
        userService.add();
    }
}

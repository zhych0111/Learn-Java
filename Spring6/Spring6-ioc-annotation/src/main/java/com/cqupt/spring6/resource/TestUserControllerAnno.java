package com.cqupt.spring6.resource;

import com.cqupt.spring6.config.SpringConfig;
import com.cqupt.spring6.resource.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserControllerAnno {
    public static void main(String[] args) {
        // 加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = context.getBean(UserController.class);
        userController.add();
    }
}

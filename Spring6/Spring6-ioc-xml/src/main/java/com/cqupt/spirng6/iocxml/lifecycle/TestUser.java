package com.cqupt.spirng6.iocxml.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contest = new ClassPathXmlApplicationContext("bean-lifecycle.xml");
        User user = contest.getBean(User.class);
        System.out.println("6 bean对象创建完成了，可以使用了");
        System.out.println(user);
        contest.close();
    }
}

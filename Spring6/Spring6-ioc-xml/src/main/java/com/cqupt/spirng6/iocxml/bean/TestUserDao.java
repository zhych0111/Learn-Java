package com.cqupt.spirng6.iocxml.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {
    private static Logger logger = LoggerFactory.getLogger(TestUserDao.class);
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 根据类型获取接口对应的bean
        UserDao userDao = context.getBean("personDaoImpl", UserDao.class);
        System.out.println(userDao);
        userDao.run();
    }
}

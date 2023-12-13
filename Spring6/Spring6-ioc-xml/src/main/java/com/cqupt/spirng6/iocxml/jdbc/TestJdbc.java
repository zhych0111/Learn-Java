package com.cqupt.spirng6.iocxml.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {
    @Test
    public void demo1() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://8.137.23.14:3306/spring?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("720106zhych");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        System.out.println(dataSource.getUrl());
    }

    @Test
    public void demo2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-jdbc.xml");
        DruidDataSource druidDataSource = context.getBean(DruidDataSource.class);
        System.out.println(druidDataSource.getUrl());
    }
}

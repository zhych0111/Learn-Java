package com.cqupt.dao.impl;

import com.cqupt.anno.Bean;
import com.cqupt.dao.UserDao;
import org.springframework.stereotype.Repository;

@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao add......");
    }
}

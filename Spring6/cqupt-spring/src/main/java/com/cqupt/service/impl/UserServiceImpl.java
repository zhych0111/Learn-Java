package com.cqupt.service.impl;

import com.cqupt.anno.Bean;
import com.cqupt.anno.Di;
import com.cqupt.dao.UserDao;
import com.cqupt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Bean
public class UserServiceImpl implements UserService {
//    @Autowired
    @Di
    private UserDao userDao;
    @Override
    public void add() {
        System.out.println("service add......");
        // 调用dao的方法
        userDao.add();
    }
}

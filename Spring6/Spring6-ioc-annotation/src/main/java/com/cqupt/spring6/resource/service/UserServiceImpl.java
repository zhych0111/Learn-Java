package com.cqupt.spring6.resource.service;

import com.cqupt.spring6.resource.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
//    @Autowired
//    private UserDao userDao;
//    private UserDao userDao;
//
//    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
//    private UserDao userDao;
//
//    @Autowired
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    private UserDao userDao;

    public UserServiceImpl(@Autowired @Qualifier(value = "userRedisDaoImpl") UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("service add...");
        userDao.add();
    }
}

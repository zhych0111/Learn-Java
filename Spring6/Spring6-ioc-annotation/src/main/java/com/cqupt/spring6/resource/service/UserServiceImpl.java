package com.cqupt.spring6.resource.service;

import com.cqupt.spring6.resource.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// 根据名称注入
@Service(value = "myUserService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao myUserDao;

    @Override
    public void add() {
        System.out.println("service add...");
        myUserDao.add();
    }
}

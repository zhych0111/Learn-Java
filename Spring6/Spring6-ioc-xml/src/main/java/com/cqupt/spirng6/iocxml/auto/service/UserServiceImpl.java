package com.cqupt.spirng6.iocxml.auto.service;

import com.cqupt.spirng6.iocxml.auto.dao.UserDao;
import com.cqupt.spirng6.iocxml.auto.dao.UserDaoImpl;
import lombok.Data;

@Data
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public void addUserService() {
        System.out.println("userService方法执行了......");
        userDao.addUserDao();
    }
}

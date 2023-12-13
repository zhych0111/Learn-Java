package com.cqupt.spirng6.iocxml.lifecycle;

import lombok.Data;

public class User {
    private String name;
    public User() {
        System.out.println("1 调用无参构造创建对象");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2 给bean对象设置属性值");
        this.name = name;
    }

    public void initMethod() {
        System.out.println("4 调用指定方法初始化bean对象");
    }

    public void destroyMethod() {
        System.out.println("7 调用指定方法销毁bean对象");
    }
}

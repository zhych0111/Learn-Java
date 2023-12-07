package com.cqupt.proxy;

public class Bus implements Car{
    String name;

    public Bus(String name) {
        this.name = name;
    }

    public String run(String name) {
        System.out.println("公交车" + name + "在跑！");
        return name;
    }
}

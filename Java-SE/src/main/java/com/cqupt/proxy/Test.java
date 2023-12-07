package com.cqupt.proxy;

public class Test {
    public static void main(String[] args) {
        Car car = ProxyUtil.createProxy(new Bus("BaoBaoBaShi"));
        String s = car.run("BaoBaoBaShi");
        System.out.println(s);
    }
}

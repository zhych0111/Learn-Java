package com.cqupt.spring6.aop.example;

public class TestCalculator {
    public static void main(String[] args) {
        //1 创建代理对象（动态）
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1, 4);
        proxy.mul(6, 7);
    }
}

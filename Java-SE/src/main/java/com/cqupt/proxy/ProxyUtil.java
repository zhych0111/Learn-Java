package com.cqupt.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Car createProxy(Car car) {
        Car carProxy = (Car) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),
                new Class[]{Car.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("run")) {
                            System.out.println("打火！！！");
                            String s = (String) method.invoke(car, args);
                            System.out.println("刹车！！！");
                            return s;
                        }
                        return "";
                    }
                }
        );
        return carProxy;
    }
}

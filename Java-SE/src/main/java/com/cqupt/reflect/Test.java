package com.cqupt.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        // 获取 Car 类的 Class 对象并且创建 Car 类实例
        Class<?> targetClass = Class.forName("com.cqupt.reflect.Car");
        Car car = (Car) targetClass.newInstance();

        // 获取所有方法
        Method[] methods = targetClass.getDeclaredMethods();
        for (Method method : methods) System.out.println(method.getName());

        // 获取指定方法并调用
        Method publicMethod = targetClass.getMethod("publicMethod", String.class);
        publicMethod.invoke(car, "hhx");

        // 获取指定参数并对参数进行修改
        Field field = targetClass.getDeclaredField("name");
        field.setAccessible(true);
        field.set(car, "Falali");

        // 调用private方法
        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(car);

    }
}

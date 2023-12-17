package com.cqupt.reflect;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCar {
    //1 获取Class对象多种方式
    @Test
    public void test01() throws Exception {
        //1 类名.class
        Class clazz1 = Car.class;

        //2 对象.getClass()
        Class clazz2 = new Car().getClass();

        //3 Class.forName("全路径")
        Class clazz3 = Class.forName("com.cqupt.reflect.Car");

        Car car = (Car) clazz3.getDeclaredConstructor().newInstance();
        System.out.println(car);
    }

    //2 获取构造方法
    @Test
    public void test02() throws Exception {
        Class clazz = Class.forName("com.cqupt.reflect.Car");
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor x : constructors) {
            System.out.println(x.getName() + " " + x.getParameterCount());
        }

//        Constructor c1 = clazz.getConstructor(String.class, Integer.class, String.class);
//        Car car1 = (Car) c1.newInstance("夏利", 10, "red");
//        System.out.println(car1);
        Constructor c2 = clazz.getDeclaredConstructor(String.class, Integer.class, String.class);
        c2.setAccessible(true);
        Car car2 = (Car) c2.newInstance("捷达", 15, "Blue");
        System.out.println(car2);
    }

    //3 获取属性
    @Test
    public void test03() throws Exception {
        Class clazz = Car.class;
        Car car = (Car) clazz.getDeclaredConstructor().newInstance();
        // 获取所有的public属性
//        Field[] fields = clazz.getFields();
//        for (Field f : fields) {
//            System.out.println(f);
//        }
        // 获取所有属性
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields) {
            if (f.getName().equals("name")) {
                f.setAccessible(true);
                f.set(car, "Wu-Ling");
            }
            System.out.println(f);
        }
        System.out.println(car);
//        Field name = clazz.getDeclaredField("name");
//        name.setAccessible(true);
//        name.set(car, "Haha");
//        System.out.println(car);
    }

    //4 获取方法
    @Test
    public void test04() throws Exception {
        Car car = new Car("Benzz", 10, "Black");
        Class clazz = car.getClass();
        //1 public方法
        Method[] methods = clazz.getMethods();
        for (Method m1 : methods) {
            if (m1.getName().equals("toString")) {
                String invoke = (String) m1.invoke(car);
                System.out.println("toString执行了：" + invoke);
            }
        }

        //2 private方法
        Method[] methodsAll = clazz.getDeclaredMethods();
        for (Method m : methodsAll) {
            if (m.getName().equals("run")) {
                m.setAccessible(true);
                m.invoke(car);
            }
        }
    }
}

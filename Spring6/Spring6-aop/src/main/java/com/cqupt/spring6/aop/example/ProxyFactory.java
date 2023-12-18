package com.cqupt.spring6.aop.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    // 目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 返回代理对象
    public Object getProxy() {
        /**
         * Proxy.newProxyInstance()有三个参数
         * 1 classLoader：加载动态生成的代理类的类加载器
         * 2 interfaces：目标对象实现的所有接口的class对象所组成的数组
         * 3 invocationHandler：设置代理对象实现目标对象方法的过程，即代理类中如何重写接口中的抽象方法
         */
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler() {
            /**
             * 第一个参数：代理对象
             * 第二个参数：需要重写目标对象的方法
             * 第三个参数：method方法里面的参数
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 方法调用之前输入
                System.out.println("before method...");
                Object result = method.invoke(target, args);
                // 方法调用之后输入
                System.out.println("after method...");
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}

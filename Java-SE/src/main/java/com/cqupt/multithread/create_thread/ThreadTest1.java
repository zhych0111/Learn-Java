package com.cqupt.multithread.create_thread;

/**
 * 目标：掌握线程的创建方式一:继承Thread类
 */
public class ThreadTest1 {
    // main方法是由一条默认的主线程负责执行。
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();  // main线程 t线程

        for (int i = 0; i < 5; i++) {
            System.out.println("main线程输出: " + i);
        }
    }
}

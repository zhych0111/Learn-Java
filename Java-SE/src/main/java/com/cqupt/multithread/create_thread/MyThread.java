package com.cqupt.multithread.create_thread;

/**
 * 1、让子类继承Thread线程类。
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        // 描述线程的执行任务
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程Mythread线程输出: " + i);
        }
    }
}

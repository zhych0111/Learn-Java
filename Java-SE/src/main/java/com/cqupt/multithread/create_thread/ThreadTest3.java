package com.cqupt.multithread.create_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 目标：掌握线程的创建方式三：实现Callable接口。
 */
public class ThreadTest3 {
    public static void main(String[] args) throws Exception {
        Callable<String> callable = new MyCallable(100);
        // 把callable对象封装成一个FutureTask对象（任务对象）
        FutureTask<String> f1 = new FutureTask<>(callable);
        new Thread(f1).start();
        String s = f1.get();
        System.out.println(s);
    }
}

package com.cqupt.multithread.thread_pool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        // 描述线程的任务，返回程序执行返回后的结果
        // 需求：返回1-n的和
        int sum =0;
        for (int i = 1; i <= n; i++) sum += i;
        return Thread.currentThread().getName() + "求出来了1-" + n + "的和是：" + sum;
    }
}

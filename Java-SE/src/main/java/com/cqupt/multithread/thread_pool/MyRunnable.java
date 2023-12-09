package com.cqupt.multithread.thread_pool;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        // 任务是干啥的
        System.out.println(Thread.currentThread().getName() + "===> 输出666");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

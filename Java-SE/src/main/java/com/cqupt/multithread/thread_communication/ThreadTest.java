package com.cqupt.multithread.thread_communication;

public class ThreadTest {
    public static void main(String[] args) {
        Desk desk = new Desk();

        // 创建三个生产者线程（三个厨师）
        new Thread(() -> {
            while (true) {
                desk.put();
            }
        }, "厨师1").start();

        new Thread(() -> {
            while (true) {
                desk.put();
            }
        }, "厨师2").start();

        new Thread(() -> {
            while (true) {
                desk.put();
            }
        }, "厨师3").start();

        // 创建两个消费者线程（两个吃货）
        new Thread(() -> {
            while (true) {
                desk.get();
            }
        }, "吃货1").start();

        new Thread(() -> {
            while (true) {
                desk.get();
            }
        }, "吃货2").start();
    }
}

package com.cqupt.multithread.thread_safety;

public class ThreadTest {
    public static void main(String[] args) {
        Account acc = new Account("ICBC-110", 100000.0);
        new DrawThread(acc, "小明").start();
        new DrawThread(acc, "小红").start();
    }
}

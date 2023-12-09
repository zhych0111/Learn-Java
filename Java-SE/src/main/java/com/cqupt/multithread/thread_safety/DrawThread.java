package com.cqupt.multithread.thread_safety;

public class DrawThread extends Thread {
    private Account acc;
    public DrawThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
        acc.drawMoney(100000.0);
    }
}

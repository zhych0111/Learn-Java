package com.cqupt.multithread.thread_communication;

import java.util.ArrayList;
import java.util.List;

public class Desk {
    private List<String> list = new ArrayList<>();

    public synchronized void put() {
        try {
            String name = Thread.currentThread().getName();
            // 判断是否有包子
            if (list.size() == 0) {
                list.add(name + "做的肉包子");
                System.out.println(name + "做了一个肉包子！！！");
                Thread.sleep(2000);

                // 等待自己，唤醒别人
                this.notifyAll();
                this.wait();
            } else {
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void get() {
        try {
            String name = Thread.currentThread().getName();
            if (list.size() == 1) {
                System.out.println(name + "吃了：" + list.get(0));
                list.clear();
                Thread.sleep(1000);
                this.notifyAll();
                this.wait();
            } else {
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.cqupt.multithread.thread_safety;

import lombok.Data;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
public class Account {
    private String cardId;
    private Double money;

    // 创建了一个锁对象
    private final Lock lk = new ReentrantLock();

    public Account() {
    }

    public Account(String cardId, Double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        lk.lock();
        try {
            if (this.money >= money) {
                System.out.println(name + "来取钱" + money + "元成功！");
                this.money -= money;
                System.out.println(name + "来取钱，剩余" + this.money + "元");
            } else {
                System.out.println(name + "来取钱，余额不足！");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lk.unlock();
        }

    }
}

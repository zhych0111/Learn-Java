package com.cqupt.nestedclass;

public class Test2 {
    public static void main(String[] args) {
//        Swimming s1 = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("狗游泳飞快！");
//            }
//        };
//        go(s1);
        go (new Swimming() {
            @Override
            public void swim() {
                System.out.println("狗游泳飞快！");
            }
        });
    }
    // 设计一个方法，可以接收swimming接口的一切实现类对象来参加游泳比赛。
    public static void go(Swimming s) {
        System.out.println("开始-----------------");
        s.swim();
    }
}

interface Swimming {
    void swim();
}
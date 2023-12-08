package com.cqupt.nestedclass;

public class Test {
    public static void main(String[] args) {
        //1 把这个匿名内部类编译成一个子类，然后立即创建一个子类对象出来
        Animal animal = new Animal() {
            @Override
            public void cry() {
                System.out.println("miaomiaomiao...");
            }
        };
        animal.cry();
    }
}

abstract class Animal {
    public abstract void cry();
}

//class Cat extends Animal {
//
//    @Override
//    public void cry() {
//        System.out.println("miaomiaomiao...");
//    }
//}

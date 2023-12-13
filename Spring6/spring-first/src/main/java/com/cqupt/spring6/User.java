package com.cqupt.spring6;

public class User {
    private String name;
    private Person person;

    public User() {
        System.out.println("无参构造执行了");
    }

    public void add() {
        System.out.println("add...");
    }

    public static void main(String[] args) {

    }
}

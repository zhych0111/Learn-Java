package com.cqupt.reflect;

import lombok.Data;

@Data
public class Car {
    private String name;
    private Integer age;
    private String color;

    public Car() {
    }

    public Car(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    private void run() {
        System.out.println("private-run...");
    }
}

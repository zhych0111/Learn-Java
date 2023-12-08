package com.cqupt.reflect;

import lombok.Data;

@Data
public class Car {
    private String name;
    public Car() {
        this.name = "Masha";
    }
    public void publicMethod(String s) {
        System.out.println("I love " + s);
    }
    private void privateMethod() {
        System.out.println("My name is " + this.name);
    }
}

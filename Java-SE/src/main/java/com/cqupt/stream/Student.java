package com.cqupt.stream;

import lombok.Data;

@Data
public class Student {
    private String name;
    private Integer age;
    private Double height;

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}

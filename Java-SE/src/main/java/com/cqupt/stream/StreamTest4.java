package com.cqupt.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest4 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("蜘蛛精", 26, 172.5);
        Student s2 = new Student("紫霞", 23, 167.6);
        Student s3 = new Student("白晶晶", 25, 169.0);
        Student s4 = new Student("牛魔王", 35, 183.3);
        Student s5 = new Student("牛夫人", 34, 168.5);
        Student s6 = new Student("蜘蛛精", 26, 172.5);
        Collections.addAll(students, s1, s2, s3, s4, s5, s6);
        // 需求1 请计算出身高超过168的学生有几人
        long size = students.stream().filter(o -> o.getHeight() > 168).count();
        System.out.println(size);
        // 需求2 请找出身高最高的学生对象，并输出
        Student student = students.stream().max((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight())).get();
        System.out.println(student);
        // 需求3 请找出身高最矮的学生对象，并输出
        student = students.stream().min((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight())).get();
        System.out.println(student);
        // 需求4 请找出身高超过170的学生对象，并放到一个新的集合中去返回
        List<Student> studentList = students.stream().filter(o -> o.getHeight() >= 170).collect(Collectors.toList());
        System.out.println(studentList);
        Set<Student> studentSet = students.stream().filter(o -> o.getHeight() >= 170).collect(Collectors.toSet());
        System.out.println(studentSet);
        // 需求5 请找出身高超过170的学生对象，并把学生对象的名字和身高存入一个Map集合返回
        Map<String, Double> map = students.stream().filter(o -> o.getHeight() > 170).distinct().collect(Collectors.toMap(a -> a.getName(), a -> a.getHeight()));
        System.out.println(map);

    }
}

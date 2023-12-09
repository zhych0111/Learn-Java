package com.cqupt.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamTest3 {
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores, 88.5, 100.0, 60.0, 99.0, 9.5, 99.6, 25.0);

        // 需求1 找出成绩大于等于60分的数据，并升序之后，再输出。
        scores.stream().filter(s -> s >= 60).sorted().forEach(System.out::println);


        List<Student> students = new ArrayList<>();
        Student s1 = new Student("蜘蛛精", 26, 172.5);
        Student s2 = new Student("紫霞", 23, 167.6);
        Student s3 = new Student("白晶晶", 25, 169.0);
        Student s4 = new Student("牛魔王", 35, 183.3);
        Student s5 = new Student("牛夫人", 34, 168.5);
        Student s6 = new Student("蜘蛛精", 26, 172.5);
        Collections.addAll(students, s1, s2, s3, s4, s5, s6);
        // 需求2 找出年龄大于等于23，且年龄小于等于30岁的学生，并按照年龄降序输出
        students.stream()
                .filter(s -> s.getAge() >= 23)
                .filter(s -> s.getAge() <= 30)
                .sorted((s11, s22) -> (s22.getAge().compareTo(s11.getAge())))
                .forEach(System.out::println);

        // 需求3 找出身高最高的前三名学生，并输出
        students.stream().sorted((o1, o2) -> (o2.getHeight().compareTo(o1.getHeight())))
                .limit(3).forEach(System.out::println);

        // 需求4 找出身高倒数的两名学生，并输出
        students.stream().sorted((Comparator.comparing(Student::getHeight))).limit(2).forEach(System.out::println);

        // 需求5 找出身高高于168的学生叫什么名字，要求去除重复的名字，再输出
//        students.stream().filter(o -> o.getHeight() > 168).distinct().forEach(System.out::println);
        students.stream().filter(s->s.getHeight() > 168).map(Student::getName).distinct().forEach(System.out::println);
    }
}

package com.cqupt.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // 这是一个好方法
        Collections.addAll(names, "张三丰", "张无忌", "周芷若", "赵敏", "张强");
        System.out.println(names);
        List<String> list1 = new ArrayList<>();
        names.forEach(name -> {
            if (name.startsWith("张") && name.length() == 3)
                list1.add(name);
        });
        System.out.println("list1: " + list1);
        // 开始使用Stream流来解决这个需求
        List<String> list2 = names.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).collect(Collectors.toList());
        System.out.println("list2: " + list2);
    }
}

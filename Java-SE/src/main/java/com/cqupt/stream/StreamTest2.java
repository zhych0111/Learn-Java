package com.cqupt.stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张无忌", "周芷若", "赵敏", "张强");
        Stream<String> stream = names.stream();
        Set<String> set = new HashSet<>();
        Collections.addAll(set, "张三丰", "张无忌", "周芷若", "赵敏", "张强");
        Stream<String> stream1 = set.stream();
        stream1.filter(s -> s.contains("张")).forEach(System.out::println);
        Map<String, Double> map = new HashMap<>();
        map.put("古力娜扎", 172.3);
        map.put("迪丽热巴", 168.3);
        map.put("马儿扎哈", 166.3);
        map.put("卡尔扎巴", 168.3);
        map.entrySet().stream().filter(e->e.getKey().contains("巴")).forEach(e-> System.out.println(e.getKey() + "--->" + e.getValue()));

        String[] names2 = {"张翠山", "东方不败", "唐大山", "独孤求败"};
        Arrays.stream(names2).forEach(System.out::println);
    }
}

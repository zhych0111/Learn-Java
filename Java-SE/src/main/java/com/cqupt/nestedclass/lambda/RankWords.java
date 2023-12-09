package com.cqupt.nestedclass.lambda;

import java.util.Arrays;

public class RankWords {
    public static void main(String[] args) {
        // 方法引用
        String[] names = {"body", "apple", "Andy", "Cici", "Delete", "zebra", "Oppo", "huawei"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}

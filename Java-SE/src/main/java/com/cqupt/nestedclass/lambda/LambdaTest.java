package com.cqupt.nestedclass.lambda;

import java.util.Arrays;

public class LambdaTest {
    public static void main(String[] args) {
        Swimming s = () -> {
            System.out.println("Hello");
        };
        s.swim();

        Integer[] a = new Integer[]{1, 2, 6, 5, 9, 6};
        Arrays.sort(a, (o1, o2)->(Integer.compare(o1, o2)));
        System.out.println(Arrays.toString(a));
    }
}

// 只能简化函数式接口的匿名内部类！！！
@FunctionalInterface
interface Swimming {
    void swim();
}

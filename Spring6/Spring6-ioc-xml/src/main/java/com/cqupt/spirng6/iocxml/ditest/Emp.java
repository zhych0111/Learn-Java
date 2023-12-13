package com.cqupt.spirng6.iocxml.ditest;

import lombok.Data;

@Data
public class Emp {
    private Dept dept;
    private String ename;
    private Integer age;
    private String[] loves;

    public void work() {
        System.out.println(ename + " emp work..." + age);
        dept.info();
    }
}

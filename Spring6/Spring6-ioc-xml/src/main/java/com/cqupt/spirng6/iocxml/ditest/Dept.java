package com.cqupt.spirng6.iocxml.ditest;

import lombok.Data;

import java.util.List;

@Data
public class Dept {
    private String dname;
    private List<Emp> empList;

    public void info() {
        System.out.println("部门名称: " + dname);
        empList.forEach(emp -> System.out.println(emp.getEname()));
    }
}

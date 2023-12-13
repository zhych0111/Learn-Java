package com.cqupt.spirng6.iocxml.dimap;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Student {
    private List<Lesson> lessonList;
    private Map<String, Teacher> teacherMap;
    private String sid;
    private String sname;

    public void run() {
        System.out.println("学生编号: " + sid + "\n学生名称: " + sname);
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "lessonList=" + lessonList +
                ", teacherMap=" + teacherMap +
                ", sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }
}

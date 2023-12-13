package com.cqupt.spirng6.iocxml.dimap;

import lombok.Data;

@Data
public class Teacher {
    private String teacherId;
    private String teacherName;

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}

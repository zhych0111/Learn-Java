package com.cqupt.spirng6.iocxml.dimap;

import lombok.Data;

@Data
public class Lesson {
    private String lessonName;

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                '}';
    }
}

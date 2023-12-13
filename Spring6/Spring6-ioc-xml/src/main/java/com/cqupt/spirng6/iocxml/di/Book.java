package com.cqupt.spirng6.iocxml.di;

import lombok.Data;

@Data
public class Book {
    private String bname;
    private String author;
    private String others;

//    public Book(String bname, String author) {
//        System.out.println("有参构造器执行了......");
//        this.bname = bname;
//        this.author = author;
//    }

    public Book() {
        System.out.println("无参构造执行了......");
    }

    public Book(String bname, String author, String others) {
        System.out.println("有参构造器执行了......");
        this.bname = bname;
        this.author = author;
        this.others = others;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }
}

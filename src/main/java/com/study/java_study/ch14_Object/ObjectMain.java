package com.study.java_study.ch14_Object;

/*
    Object 클래스(최상위 클래스)
 */

import java.util.Objects;

public class ObjectMain {
    public static void main(String[] args) {
        Object object = new Object();
        Student student = new Student("홍길동", 23);
        Student student2 = new Student("홍길동", 23);

        Object[] objects = new Object[3];
        objects[0] = new Object();
        objects[1] = "test";
        objects[2] = new Student("홍길동", 23);

        System.out.println(student);
        String str = "data";
        System.out.println(str.toString());

        String studentData = student.toString();

        System.out.println(student.equals(student2));

        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        System.out.println(student.hashCode() == student2.hashCode());
        System.out.println(Objects.hash("김준일"));
        System.out.println(Objects.hash("김준일"));
    }
}
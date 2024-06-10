package com.study.java_study.ch18_빌더;

public class StudentMain {
    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(20240101)
                .age(26)
                .name("이성희")
                .build();

        Student stu = Student.builder()
                .studentCode(20202020)
                .build();
    }
}

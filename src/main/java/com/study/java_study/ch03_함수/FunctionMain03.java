package com.study.java_study.ch03_함수;

public class FunctionMain03 {
    public static void main(String[] args) {
        Function03 fx = new Function03();

        fx.fx01(1234, "김준일", 31, "01099891916");

        Student student = new Student();
        student.studentCode = 4321;
        student.name = "이상해";
        student.age = 26;
        student.phone = "00011112222";
        fx.fx02(student);
    }
}

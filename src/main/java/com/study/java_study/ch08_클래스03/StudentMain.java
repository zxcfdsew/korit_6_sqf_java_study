package com.study.java_study.ch08_클래스03;

public class StudentMain {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        Student[] students = new Student[5];
        students[0] = new Student(20240501, "이름1", 20);
        students[1] = new Student(20240502, "이름2", 22);
        students[2] = new Student(20240503, "이름3", 21);

        String name = students[0].getName();
        System.out.println(students[0].getName());

        for(int i = 0; i < students.length; i++) {
            if(students[i] == null) {
                continue;
            }
            System.out.println("학번: " + students[i].getCode());
            System.out.println("이름: " + students[i].getName());
            System.out.println("나이: " + students[i].getAge());
            System.out.println();
        }
    }
}
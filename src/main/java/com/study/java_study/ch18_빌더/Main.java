package com.study.java_study.ch18_빌더;

public class Main {
    public static void main(String[] args) {
        // 내부 클래스
        A a = new A();
        A.B b = a.new B();

        a.test();
        b.print();

        // C 클래스가 static
        A.C c = new A.C();
        c.show();

        // C 클래스와 show2가 static
        A.C.show2();
    }
}
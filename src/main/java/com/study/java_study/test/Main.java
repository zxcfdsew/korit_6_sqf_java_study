package com.study.java_study.test;

public class Main {
    public static void main(String[] args) {
        B b = new B() {
            @Override
            public void testB() {

            }
        };
        A a = new A() {
            @Override
            public void testA(B b) {

            }
        };

        test(new B() {
            @Override
            public void testB() {
                System.out.println("test");
            }
        });

        ASDF asdf = new ASDF();
        asdf.test2();
        ASDF.test();
    }

    public static void test(B b) {

    }
}

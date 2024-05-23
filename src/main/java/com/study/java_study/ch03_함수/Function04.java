package com.study.java_study.ch03_함수;

public class Function04 {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, String b) {
        int c = Integer.parseInt(b);
        System.out.println(a + c);
    }

    void add(String a, int b) {
        int c = Integer.parseInt(a);
        System.out.println(b + c);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b  + c);
    }

}

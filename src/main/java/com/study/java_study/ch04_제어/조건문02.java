package com.study.java_study.ch04_제어;

public class 조건문02 {
    public static void main(String[] args) {
        String text = new String("");
        String name = "홍길동";  // 값의 자료형 String
        String phone = "01011112222";  // 값의 자료형 null

        StringUtils stringUtils = new StringUtils();

        System.out.println(text);
        System.out.println(name);

        if(stringUtils.isEmpty(name)) {
            System.out.println("name이 비어있습니다");
            return; // 함수의 리턴 자료형이 void일때만 사용가능
        }

        if(stringUtils. isEmpty(phone)) {
            System.out.println("phone이 비어있습니다");
            return;
        }

        if(stringUtils.isEmpty(text)) {
            System.out.println("text가 비어있습니다");
            return;
        }
    }
}
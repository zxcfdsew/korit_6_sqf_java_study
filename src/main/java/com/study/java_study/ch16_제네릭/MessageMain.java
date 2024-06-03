package com.study.java_study.ch16_제네릭;

public class MessageMain {
    public static void main(String[] args) {
        // 제네릭 와일드 카드 : 기호 -> ?
        // ?는 Object 자료형을 기호로 표현한 것

        Message<?> m1;
        Message<String> m2 = null;

        m1 = new Message<>("10");

        String s = (String) m1.getMessage();

        // 와일드 카드 제약
        // String이거나 String 클래스를 상속받은 클래스만 들어올 수 있음
        Message<? extends String> m3 = new Message<>("10");  // 하행(자식클래스만)

        // String이거나 String 클래스를 상속하고 있는 클래스만 들어올 수 있음
        Message<? super String> m4 = new Message<>(new Object());  // 상행(부모클래스만)

        String s2 = m3.getMessage();  // 최상위가 String이기 때문에 자동 업캐스팅이 안됨. 따라서 다운캐스팅 불필요
        String s3 = (String) m4.getMessage();  // 최상위가 String이기 때문에 자동 업캐스팅됨. 따라서 다운캐스팅 필요
    }
}
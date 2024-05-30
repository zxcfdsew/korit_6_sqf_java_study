package com.study.java_study.ch13_추상화04;

public class ClassA1 extends ClassA {
    @Override  // 외부에서 객체가 주입됨(주입된 객체에 따라서 실행 결과가 달라짐) => 의존성 주입 (DI : Dependency Injection)
    public void print(InterfaceA interfaceA) {  // test()는 interfaceA에 의존한다.
        System.out.println("A1 클래스에서 print 호출");
        interfaceA.test();
    }
}
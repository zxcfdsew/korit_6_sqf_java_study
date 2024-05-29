package com.study.java_study.ch10_추상화01;

public class Tiger extends Animal {
    private int power;

    public Tiger() {
        // super()은 제일 위에 위치해야함
        // 자식 클래스는 부모 클래스 없이 생성이 불가능하기 때문에
        super();  // Animal객체 생성자 호출(부모 생성자 호출, 기본적으로 생략되어 있음)
        System.out.println("호랑이 객체 생성");
    }

    public Tiger(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }

    // 재정의 -> 상속관계에서만 가능
    // Override 어노테이션은 기능이 없음(다른 어노테이션들은 기능이 있음)
    // 단순이 이 메서드는 재정의 된 메서드라는 것을 알리기 위함
    @Override  // @: 어노테이션
    public void move() {
        System.out.println("호랑이가 네발로 뛰어갑니다.");
        super.move();
    }

    public void hunt() {
        System.out.println("호랑이가 " + power + "의 힘으로 사냥을 합니다.");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "power=" + power +
                "} " + super.toString();
    }
}
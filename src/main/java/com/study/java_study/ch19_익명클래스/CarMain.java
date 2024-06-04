package com.study.java_study.ch19_익명클래스;

public class CarMain {
    public static void main(String[] args) {
        KiaCar kiaCar = new KiaCar("k8", "화이트");
        System.out.println(kiaCar);

        // 중괄호 안에 작성된 것들은 클래스를 구현
        AbstractCar abstractCar = new AbstractCar("내가 만든 자동차", "블랙") {
            @Override
            public void createCar() {

            }

            @Override
            public void showCar() {

            }
        };
    }
}
package com.study.java_study.ch09_클래스04_복습;

public class VehicleMain {
    public static void main(String[] args) {
        VehicleService vehicleService = new VehicleService();

        System.out.println("프로그램 시작");

        while (vehicleService.run()) {}

        System.out.println("프로그램 종료");
    }
}

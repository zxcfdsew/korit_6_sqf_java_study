package com.study.java_study.ch09_클래스04_복습;

import java.util.Scanner;

public class VehicleService {

    private Scanner scanner;

    public VehicleService() {
        scanner = new Scanner(System.in);
    }

    public boolean run() {
        boolean isRun = true;
        System.out.println("[ 탈것 관리 프로그램 ]");
        System.out.println("1. 탈것 등록");
        System.out.println("2. 탈것 검색");
        System.out.println("3. 탈것 수정");
        System.out.println("4. 탈것 삭제");
        System.out.println("q. 탈것 조회");
        String menu;
        String[] menuList = {"1", "2", "3", "4", "q"};
        while (true) {
            System.out.print("메뉴를 선택하세요: ");
            menu = scanner.nextLine();
            boolean isExist = false;
            for(String s : menuList) {
                if (s.equals(menu)) {
                    isExist = true;
                }
            }
            if (isExist) {
                break;
            }
            System.out.println("잘못된 입력입니다.");
        }

        switch (menu) {
            case "1":

                break;
            case "2":

                break;
            case "3":

                break;
            case "4":

                break;
            case "q":
                isRun = false;
                break;
        }
        return isRun;
    }

    private void registerVehicle() {
        System.out.println("탈것 등록");

    }

}

package com.study.java_study.ch09_클래스04.복습;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class ComputerService {

    private Scanner scanner;
    private ComputerRepository computerRepository;

    public ComputerService() {
        scanner = new Scanner(System.in);
        computerRepository = new ComputerRepository();
    }

    public boolean run() {
        System.out.println("[컴퓨터 관리 프로그램]");
        System.out.println("1. 컴퓨터 등록");
        System.out.println("2. 컴퓨터 검색");
        System.out.println("3. 컴퓨터 수정");
        System.out.println("4. 컴퓨터 삭제");
        System.out.println("q. 프로그램 종료");
        String menu;
        while (true) {
            System.out.println("메뉴 선택");
            menu = scanner.nextLine();
            if (isMenu(menu)) {
                break;
            }
            System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
        }

        switch (menu) {
            case "1":
                System.out.println("[컴퓨터 등록]");
                registerComputer();
                break;
            case "2":
                System.out.println("[컴퓨터 검색]");
                search();
                break;
            case "3":
                System.out.println("[컴퓨터 수정]");
                remove();
                break;
            case "4":
                System.out.println("[컴퓨터 삭제]");
                delete();
                break;
            case "q":
                return false;
        }
        return true;
    }

    private boolean isMenu(String menu) {
        String[] menus = new String[] {"1", "2", "3", "4", "q"};
        for (String m : menus) {
            if (m.equals(menu)) {
                return true;
            }
        }
        return false;
    }

    private String validationCheck(String s) {
        System.out.println(s + "를 입력하세요");
        String text;
        while (true) {
            text = scanner.nextLine();
            if (!text.isBlank()) {
                break;
            }
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
        }
        return text;
    }

    private void registerComputer() {
        int serialNumber = computerRepository.makeSerialNumber();
        String name;
        String cpu;
        String ram;
        String ssd;
        String gpu;
        ComputerEntity computer = new ComputerEntity();
    }

    private void search() {

    }

    private void remove() {

    }

    private void delete() {

    }
}

package com.study.java_study.ch09_클래스04.복습;

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
                modify();
                break;
            case "4":
                System.out.println("[컴퓨터 삭제]");
                remove();
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

    private String inputParts(String s) {
        String text;
        while (true) {
            System.out.println(s + "를 입력하세요");
            text = scanner.nextLine();
            if (!text.isBlank()) {
                break;
            }
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
        }
        return text;
    }

    private String inputName() {
        String text;
        while (true) {
            System.out.print("이름을 입력하세요: ");
            text = scanner.nextLine();
            if (!text.isBlank() || !isNameExist(text)) {
                break;
            }
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
        }
        return text;
    }

    private boolean isNameExist(String text) {
        String[] names = computerRepository.computerNames();
        for (String name : names) {
            if (name.equals(text)) {
                return true;
            }
        }
        return false;
    }

    private void registerComputer() {
        int serialNumber = computerRepository.makeSerialNumber();
        String name = inputName();
        String cpu = inputParts("cpu");
        String ram = inputParts("ram");
        String ssd = inputParts("ssd");
        String gpu = inputParts("gpu");
        ComputerEntity computer = new ComputerEntity(serialNumber, name, cpu, ram, ssd, gpu);
        computerRepository.addComputer(computer);
    }

    private void search() {
        System.out.println("1. 통합 검색");
        System.out.println("2. 이름으로 검색");
        System.out.println("3. cpu로 검색");
        System.out.println("4. ram으로 검색");
        System.out.println("5. ssd로 검색");
        System.out.println("6. gpu로 검색");
        System.out.print("옵션을 선택해주세요: ");
        String option = scanner.nextLine();
        ComputerEntity[] results = null;
        if (isOption(option)) {
            System.out.print("검색명을 입력하세요: ");
            String text = scanner.nextLine();
            results = computerRepository.searchComputers(option, text);
        }
        if (results == null) {
            System.out.println("해당 컴퓨터는 등록되지 않았습니다.");
            return;
        }
        for (ComputerEntity com : results) {
            System.out.println(com.toString());
        }
    }

    private boolean isOption(String option) {
        String[] options = {"1", "2", "3", "4", "5", "6"};
        for (String o : options) {
            if (o.equals(option)) {
                return true;
            }
        }
        return false;
    }

    private void modify() {

    }

    private void remove() {

    }
}

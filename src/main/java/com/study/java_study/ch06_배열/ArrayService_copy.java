package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayService_copy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRun = true;

        NamesManagement namesManagement = new NamesManagement();

        while (isRun) {
            System.out.println("[이름 관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 이름 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택: ");

            String selectMenu = scanner.nextLine();

            switch (selectMenu) {
                case "1":
                    System.out.println("[등록]");
                    System.out.print("등록할 이름을 입력하세요: ");
                    String addName = scanner.nextLine();
                    namesManagement.addName(addName);
                    System.out.println("추가되었습니다.");
                    break;
                case "2":
                    System.out.println("[수정]");
                    System.out.print("수정할 이름을 입력하세요: ");
                    String oldName = scanner.nextLine();
                    if (namesManagement.find(oldName) == -1) {
                        System.out.println("해당 이름이 존재하지 않습니다.");
                        break;
                    }
                    System.out.print("새로운 이름을 입력하세요: ");
                    String newName = scanner.nextLine();
                    namesManagement.modifyName(oldName, newName);
                    System.out.println("수정되었습니다.");
                    break;
                case "3":
                    System.out.println("[삭제]");
                    System.out.print("삭제할 이름을 입력해주세요: ");
                    String deleteName = scanner.nextLine();
                    if (namesManagement.find(deleteName) == -1) {
                        System.out.println("해당 이름이 존재하지 않습니다.");
                        break;
                    }
                    namesManagement.deleteName(deleteName);
                    System.out.println("삭제되었습니다.");
                    break;
                case "4":
                    System.out.println("[이름 조회]");
                    System.out.print("조회할 이름을 입력하세요: ");
                    String name = scanner.nextLine();
                    namesManagement.printNameIsExist(name);
                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    namesManagement.printAllNames();
                    break;
                case "q":
                    isRun = false;
                    break;
                default:
                    System.out.println("다시 입력하세요.");
            }
            System.out.println();
        }
    }
}

class NamesManagement {

    String[] names = new String[0];

    public void addName(String name) {
        String[] newString = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            newString[i] = names[i];
        }
        newString[newString.length - 1] = name;
        names = newString;
    }

    public boolean deleteName(String name) {
        if (find(name) == -1) {
            return false;
        }
        boolean isDeleted = false;
        int index = 0;
        String[] newNames = new String[names.length - 1];
        for (int i = 0; i < names.length; i++) {
            if (!isDeleted && names[i].equals(name)) {
                isDeleted = true;
                continue;
            }
            newNames[index] = names[i];
            index++;
        }
        names = newNames;
        return true;
    }

    public boolean modifyName(String oldName, String newName) {
        int changeIndex = find(oldName);
        if (changeIndex == -1) {
            return false;
        }
        names[changeIndex] = newName;
        return true;
    }

    public void printNameIsExist(String name) {
        int index = find(name);
        if (index == -1) {
            System.out.println("해당 이름이 존재하지 않습니다.");
        } else {
            System.out.println("해당 이름은 등록된 이름입니다.");
        }
    }

    public void printAllNames() {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public int find(String name) {
        for (int i = 0; i < names.length; i++) {
            if(names[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

}
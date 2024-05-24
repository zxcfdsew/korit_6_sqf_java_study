package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;

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
                    System.out.println("[이름 등록]");
                    String[] newNames = new String[names.length + 1];
                    for (int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("등록 할 이름: ");
                    names[names.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료");
                    break;
                case "2":
                    System.out.println("[이름 수정]");
                    int nameIndex = -1;
                    System.out.print("수정할 이름: ");
                    String oldName = scanner.nextLine();
                    for(int i = 0; i < names.length; i++) {
                        if (names[i].equals(oldName)) {
                            nameIndex = i;
                            break;
                        }
                    }
                    if(nameIndex == -1) {
                        System.out.println("해당 이름이 존재하지 않습니다");
                        break;
                    }
                    System.out.print("새로운 이름: ");
                    String changeName = scanner.nextLine();
                    names[nameIndex] = changeName;
                    System.out.println("이름 변경에 성공하였습니다.");
                    break;
                case "3":
                    System.out.println("[이름 삭제]");
                    System.out.print("삭제할 이름: ");
                    String removeName = scanner.nextLine();
                    boolean isExist = false;
                    boolean isRemoved = false;
                    for (String name : names) {
                        if (removeName.equals(name)) {
                            isExist = true;
                            break;
                        }
                    }
                    if (!isExist) {
                        System.out.println("해당 이름이 존재하지 않습니다.");
                        break;
                    }
                    String[] removedNames = new String[names.length - 1];
                    int newArrayindex = 0;
                    for (int i = 0; i < names.length; i++) {
                        if(removeName.equals(names[i]) && !isRemoved) {
                            isRemoved = true;
                            continue;
                        }
                        removedNames[newArrayindex] = names[i];
                        newArrayindex++;
                    }
                    names = removedNames;
                    System.out.println("삭제되었습니다.");
                    break;
                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.print("조회 할 이름: ");
                    String result = null;
                    String findName = scanner.nextLine();
                    for(String name : names) {
                        if (name.equals(findName)) {
                            result = name;
                            break;
                        }
                    }
                    if (result == null) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        break;
                    }
                    System.out.println("해당 이름은 등록된 이름입니다.");
                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    for (int i = 0; i < names.length; i++) {
                        System.out.println("index[" + i + "]: " + names[i]);
                    }
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
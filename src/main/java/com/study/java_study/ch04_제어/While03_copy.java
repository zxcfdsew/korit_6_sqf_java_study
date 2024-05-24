package com.study.java_study.ch04_제어;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class While03_test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserInfo userInfo = new UserInfo();

        boolean isRun = true;

        System.out.println("프로그램 시작");

        while(isRun) {
            System.out.println("[메인 메뉴]");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 조회");
            System.out.println("3. 회원 탈퇴");
            System.out.println("q. 프로그램 종료");

            System.out.print("메뉴 선택: ");
            String selectedMenu = scanner.nextLine();
            switch(selectedMenu) {
                case "1":
                    System.out.println("회원 아이디를 입력해주세요");
                    String id = scanner.nextLine();
                    System.out.println("이름을 입력해주세요");
                    String name = scanner.nextLine();
                    System.out.println("나이를 입력해주세요");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("전화번호를 입력해주세요");
                    String phone = scanner.nextLine();
                    User user = new User(id, name, age, phone);
                    userInfo.addUser(user);
                    System.out.println("회원이 추가되었습니다.");
                    break;
                case "2":
                    System.out.println("회원 조회로 들어오셨습니다.");
                    boolean isRunMenu2 = true;
                    while(isRunMenu2) {
                        System.out.println("[회원 조회]");
                        System.out.println("1. 회원 번호로 조회");
                        System.out.println("2. 회원 이름으로 조회");
                        System.out.println("b. 뒤로가기");
                        System.out.print("메뉴 선택: ");
                        selectedMenu = scanner.nextLine();
                        switch (selectedMenu) {
                            case "1":
                                System.out.println("회원번호를 입력해주세요");
                                String inId = scanner.nextLine();
                                User u1 = userInfo.getUserById(inId);
                                userInfo.showUserInfo(u1);
                                break;
                            case "2":
                                System.out.println("회원 이름으로 조회를 합니다.");
                                String inName = scanner.nextLine();
                                User u2 = userInfo.getUserByName(inName);
                                userInfo.showUserInfo(u2);
                                break;
                            case "b":
                                System.out.println("메인 메뉴로 돌아갑니다.");
                                isRunMenu2 = false;
                                break;
                            case "q":
                                System.out.println("프로그램을 종료합니다");
                                isRunMenu2 = false;
                                isRun = false;
                            default:
                                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                        }
                        System.out.println();
                    }
                    break;
                case "3":
                    System.out.println("회원 탈퇴로 들어오셨습니다.");
                    break;
                case "q":
                    System.out.println("프로그램을 종료합니다.");
                    isRun = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}

class User {
    private String id;
    private String name;
    private int age;
    private String phone;

    public User(String id, String name, int age, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

class UserInfo {

    List<User> userList = new ArrayList<>();

    public void addUser(User user) {
        userList.add(user);
    }

    public User getUserById(String id) {
        int index = 0;
        while (index < userList.size()) {
            if (userList.get(index).getId().equals(id)) {
                break;
            }
            index++;
        }
        return userList.get(index);
    }

    public User getUserByName(String name) {
        int index = 0;
        while (index < userList.size()) {
            if (userList.get(index).getName().equals(name)) {
                break;
            }
            index++;
        }
        return userList.get(index);
    }

    public void showUserInfo(User user) {
        System.out.println("회원 번호: " + user.getId());
        System.out.println("회원 이름: " + user.getName());
        System.out.println("회원 나이: " + user.getAge());
        System.out.println("회원 전화번호: " + user.getPhone());
    }
}
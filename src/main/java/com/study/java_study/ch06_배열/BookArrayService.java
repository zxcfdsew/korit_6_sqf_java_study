package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {
    public static void main(String[] args) {
        BookArrayUtils bookArrayUtils = new BookArrayUtils();
        Scanner scanner = new Scanner(System.in);
        String[] books = new String[0];

        boolean isRun = true;

        while(isRun) {
            System.out.println("[도서 관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 도서 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택: ");
            String selectMenu = scanner.nextLine();

            String[] newBooks = null;
            int bookIndex = -1;

            switch (selectMenu) {
                case "1":
                    System.out.println("[등록]");
                    System.out.print("등록할 도서를 입력해주세요: ");
                    String addBook = scanner.nextLine();
                    newBooks = new String[books.length + 1];
                    for(int i = 0; i < books.length; i++) {
                        newBooks[i] = books[i];
                    }
                    newBooks[newBooks.length - 1] = addBook;
                    books = newBooks;
                    System.out.println("도서가 등록되었습니다.");
                    break;
                case "2":
                    System.out.println("[수정]");
                    System.out.print("수정할 도서를 입력해주세요: ");
                    String modifyBook = scanner.nextLine();
                    bookIndex = bookArrayUtils.findIndexByName(books, modifyBook);
                    if (bookIndex == -1) {
                        System.out.println("해당 도서는 등록되지 않았습니다.");
                        break;
                    }
                    System.out.print("새 도서: ");
                    books[bookIndex] = scanner.nextLine();
                    System.out.println("도서가 변경되었습니다.");
                    break;
                case "3":
                    System.out.println("[삭제]");
                    System.out.print("삭제할 도서를 입력해주세요: ");
                    String deleteBook = scanner.nextLine();
                    bookIndex = bookArrayUtils.findIndexByName(books, deleteBook);
                    if (bookIndex == -1) {
                        System.out.println("해당 도서는 등록되지 않았습니다.");
                        break;
                    }
                    newBooks = new String[books.length - 1];
                    for (int i = 0; i < newBooks.length; i++) {
                        if (bookIndex > i) {
                            newBooks[i] = books[i];
                            continue;
                        }
                        newBooks[i] = books[i + 1];
                    }
                    books = newBooks;
                    System.out.println(deleteBook + "이(가) 삭제되었습니다.");
                    break;
                case "4":
                    System.out.println("[도서 찾기]");
                    System.out.print("찾을 책 이름을 입력하세요: ");
                    String findBook = scanner.nextLine();
                    bookIndex = bookArrayUtils.findIndexByName(books, findBook);
                    if (bookIndex == -1) {
                        System.out.println("해당 책은 등록되지 않았습니다.");
                        break;
                    }
                    System.out.println("해당 책은 등록된 책입니다.");
                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    for(int i = 0; i < books.length; i++) {
                        System.out.printf("인덱스[%d] : %s\n", i, books[i]);
                    }
                    break;
                case "q":
                    System.out.println("프로그램을 종료합니다.");
                    isRun = false;
                    break;
                default:
                    System.out.println("메뉴를 잘못 선택하셨습니다.");
            }
            System.out.println();
        }
    }
}

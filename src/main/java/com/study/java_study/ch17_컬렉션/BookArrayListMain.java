package com.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookArrayListMain {
    public static void main(String[] args) {
        /*
         프로그램 시작

         도서명: 도서1
         저자명: 저자1
         new Book("도서1", "저자1");
         BookList에 추가

         도서명: 도서2
         저자명: 저자2
         new Book("도서2", "저자2");
         BookList에 추가

         도서명: 도서3
         저자명: 저자3
         new Book("도서3", "저자3");
         BookList에 추가

         도서 전체 조회
         도서명 >> 도서1 ~ 3
         저자명 >> 저자1 ~ 3

         삭제 할 도서명 : 도서2
         도서 전체 조회
         도서명 >> 도서1, 3
         저자명 >> 저자1, 3
        */

        Scanner scanner = new Scanner(System.in);
        Book book;
        List<Book> bookList = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            System.out.print("도서명: ");
            String bookName = scanner.nextLine();
            System.out.print("저자명: ");
            String author = scanner.nextLine();
            book = new Book(bookName, author);
            bookList.add(book);
        }

        for(Book b : bookList) {
            System.out.println("도서명 >> " + b.getBookName());
            System.out.println("저자명 >> " + b.getAuthor());
        }

        System.out.print("삭제할 도서명: ");
        String removeTitle = scanner.nextLine();
//        for(int i = 0; i < bookList.size(); i++) {
//            if (bookList.get(i).getBookName().equals(removeTitle)) {
//                Book removeBook = bookList.remove(i);
//                break;
//            }
//        }

        for(Book b : bookList) {
            if (b.getBookName().equals(removeTitle)) {
                bookList.remove(b);
                break;
            }
        }

        for(Book b : bookList) {
            System.out.println("도서명 >> " + b.getBookName());
            System.out.println("저자명 >> " + b.getAuthor());
        }
    }
}
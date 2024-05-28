package com.study.java_study.ch09_클래스04;

public class BookEntity {
    private int bookCode;
    private String bookName;
    private String author;
    private String publisher;

    public BookEntity() {
    }

    public BookEntity(int bookCode, String bookName, String author, String publisher) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "bookCode=" + bookCode +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
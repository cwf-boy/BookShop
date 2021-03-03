package com.entity;

public class Book {
    private int bookID;
    private String bookName;
    private int bookNumber;
    private String bookDecire;

    public Book() {
    }

    public Book(String bookName, int bookNumber, String bookDecire) {
        this.bookName = bookName;
        this.bookNumber = bookNumber;
        this.bookDecire = bookDecire;
    }

    public Book(int bookID, String bookName, int bookNumber, String bookDecire) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookNumber = bookNumber;
        this.bookDecire = bookDecire;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getBookDecire() {
        return bookDecire;
    }

    public void setBookDecire(String bookDecire) {
        this.bookDecire = bookDecire;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                ", bookNumber=" + bookNumber +
                ", bookDecire='" + bookDecire + '\'' +
                '}';
    }
}

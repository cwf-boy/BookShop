package com.service;

import com.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    Book queryByID(int bookID);
    int addBook(Book book);
    int updBook(Book book);
    int delBook(int bookID);
    List<Book> queryAll();
    Book queryByName(String bookName);
}

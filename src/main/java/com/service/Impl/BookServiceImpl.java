package com.service.Impl;

import com.dao.BookMapper;
import com.entity.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("BookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public Book queryByID(int bookID) {
        return bookMapper.queryByID(bookID);
    }

    @Override
    public int addBook(Book book) {
        return 0;
    }

    @Override
    public int updBook(Book book) {
        return 0;
    }

    @Override
    public int delBook(int bookID) {
        return 0;
    }

    @Override
    public List<Book> queryAll() {
        return null;
    }

    @Override
    public Book queryByName(String bookName) {
        return null;
    }
}

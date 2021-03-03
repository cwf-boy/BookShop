package com.dao;

import com.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("BookDao")
@Mapper
public interface BookMapper {
    Book queryByID(@Param("bookID") int bookID);
    int addBook(Book book);
    int updBook(Book book);
    int delBook(@Param("bookID") int bookID);
    List<Book> queryAll();
    Book queryByName(@Param("bookName") String bookName);
}

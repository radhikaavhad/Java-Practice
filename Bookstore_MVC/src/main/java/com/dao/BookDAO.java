package com.dao;

import com.model.Book;

import java.util.List;

public interface BookDAO {
    int insert(Book book);
    List<Book> view();
    int update(Book book);
    int delete(int id);
    List<Book> view(int id);
    List<Book> view(String name);

}

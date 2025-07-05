package bookstore.dao;

import bookstore.model.Book;

import java.sql.SQLException;
import java.util.List;

public interface BookDAO {
    int insert(Book book);
    List<Book> view();
    int update(Book book);
    int delete(Book book);
    Book view(int id);
    Book view(String name);

}

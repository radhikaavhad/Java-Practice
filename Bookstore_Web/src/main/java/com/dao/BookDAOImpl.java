package com.dao;

import com.model.Book;
import com.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookDAOImpl implements BookDAO{


    @Override
    public int insert(Book book) {
        try {
            String sql = "insert into books(name, price) values(?,?)";
            PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sql);
            preparedStatement.setString(1,book.getName());
            preparedStatement.setDouble(2,book.getPrice());
            int res = 0 ;
            res = preparedStatement.executeUpdate();
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<Book> view() {
        List<Book> books = new ArrayList<>();
        try {
            Statement statement3 = DBUtil.getConnection().createStatement();
            String sql3 = "select * from books";
            ResultSet resultSet = statement3.executeQuery(sql3);

            while(resultSet.next()){
                books.add(new Book(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getDouble(3))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }


    @Override
    public Book view(int id) {
        Book book = null;
        try {
            String sql = "select * from books where id = ?";
            PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()) {
                book = new Book(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getDouble(3));
                return book;
            }
            else{
                System.out.println("Book with id "+id+" does not exist!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return book;
    }

    @Override
    public Book view(String name) {
        Book book = null;
        try {
            String sql = "select * from books where name = ?";
            PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, name);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                book = new Book(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getDouble(3));
            }
            else{
                System.out.println("Book with name "+name+" does not exist!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return book;
    }



    @Override
    public int update(Book book) {
        try {
            String sql2 = "update books set name = ?, price = ? where id = ?";
            PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sql2);
            preparedStatement.setString(1,book.getName());
            preparedStatement.setDouble(2,book.getPrice());
            preparedStatement.setInt(3,book.getId());
            int res2 = 0;
            res2 = preparedStatement.executeUpdate();
            return res2;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }



    @Override
    public int delete(Book book) {
        try {
            String sql = "delete from books where id = ?";
            PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1,book.getId());
            int res = 0;
            res = preparedStatement.executeUpdate();
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}

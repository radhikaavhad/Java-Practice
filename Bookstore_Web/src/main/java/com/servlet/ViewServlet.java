package com.servlet;

import com.dao.BookDAO;
import com.dao.BookDAOImpl;
import com.model.Book;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        BookDAO dao = new BookDAOImpl();
        List<Book> books = dao.view();

        out.println("<table border>");
        out.println("<tr>");
        out.println("<th>Book ID</th>");
        out.println("<th>Book Name</th>");
        out.println("<th>Book Price</th>");
        out.println("</tr>");

        for (Book book : books) {
            out.println("<tr>");
            out.println("<td>" + book.getId() + "</td>");
            out.println("<td>" + book.getName() + "</td>");
            out.println("<td>" + book.getPrice() + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");
    }
}

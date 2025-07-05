package com.servlet;

import com.dao.BookDAO;
import com.dao.BookDAOImpl;
import com.model.Book;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String bookName = req.getParameter("bookName");
        float bookPrice = Float.parseFloat(req.getParameter("bookPrice"));

        BookDAO dao = new BookDAOImpl();
        int res = dao.insert(new Book(0, bookName, bookPrice));
        out.println("<h3>" + res + " book/s was added!</h3>");
    }

}

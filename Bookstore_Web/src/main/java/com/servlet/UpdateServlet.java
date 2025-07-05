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

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String bookID = req.getParameter("bookID");
        String bookName = req.getParameter("bookName");
        String bookPrice = req.getParameter("bookPrice");

        if(bookID == null || bookName == null || bookPrice == null || bookName.isBlank()){
            out.println("Missing Book ID or Book Name or Book Price");
        }

        try {
            int newBookID = Integer.parseInt(bookID.trim());
            float newBookPrice = Float.parseFloat(bookPrice.trim());
            BookDAO dao = new BookDAOImpl();
            int res = dao.update(new Book(newBookID, bookName.trim(), newBookPrice));
            out.println("<h3>" + res + " book/s was updated!</h3>");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

}

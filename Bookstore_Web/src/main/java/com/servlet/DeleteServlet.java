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

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String bookID = req.getParameter("bookID");

        if(bookID == null){
            out.println("Missing Book ID");
        }

        try {
            int newBookID = Integer.parseInt(bookID.trim());
            BookDAO dao = new BookDAOImpl();
            int res = dao.delete(new Book(newBookID, null, 0f));
            out.println("<h3>" + res + " book/s was deleted!</h3>");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

}

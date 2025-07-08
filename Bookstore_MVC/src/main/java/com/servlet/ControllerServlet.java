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

@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        BookDAO bookDAO = new BookDAOImpl();
        String msg = "";
        int res = -1;
        String operation = req.getParameter("operation");
        switch (operation) {
            case "add":
                res = bookDAO.insert(new Book(0, req.getParameter("bookName"), Float.parseFloat(req.getParameter("bookPrice"))));
                msg = res + " rows inserted.";
                req.setAttribute("msg", msg);
                req.getRequestDispatcher("result.jsp").forward(req, resp);
                break;

            case "delete":
                try {
                    res = bookDAO.delete(Integer.parseInt(req.getParameter("bookId")));
                    msg = res + " rows deleted.";
                } catch (NumberFormatException | NullPointerException e) {
                    out.println("Invalid or missing id");
                }
                req.setAttribute("msg", msg);
                req.getRequestDispatcher("result.jsp").forward(req, resp);
                break;

            case "view":
                List<Book> books = bookDAO.view();
                req.setAttribute("books", books);
                req.getRequestDispatcher("view.jsp").forward(req, resp);
                break;

            case "update":
                res = bookDAO.update(new Book(Integer.parseInt(req.getParameter("bookId")), req.getParameter("bookName"), Float.parseFloat(req.getParameter("bookPrice"))));
                msg = res + " rows updated.";
                req.setAttribute("msg", msg);
                req.getRequestDispatcher("result.jsp").forward(req, resp);
                break;

            case "viewById":
                books = bookDAO.view(Integer.parseInt(req.getParameter("bookId")));
                req.setAttribute("books", books);
                req.getRequestDispatcher("view.jsp").forward(req, resp);
                break;

            case "viewByName":
                books = bookDAO.view(req.getParameter("bookName"));
                req.setAttribute("books", books);
                req.getRequestDispatcher("view.jsp").forward(req, resp);
                break;
        }
    }
}
package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession(false);    // false because we do not need to create new session on home servlet

        if(session != null && session.getAttribute("user") != null){
            out.println("<h1>Welcome "+session.getAttribute("user")+" from new code.</h1>");
        }

        else{
//            out.println("<h1>Not welcome</h1>");
            resp.sendRedirect("/login.html");
        }

    }

}

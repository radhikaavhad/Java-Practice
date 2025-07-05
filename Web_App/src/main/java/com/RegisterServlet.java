package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String username = req.getParameter("username");
//        String password = req.getParameter("password");

        HttpSession session = req.getSession(true);     // if session exists do not create new , if doesn't then create new


        if(username!= null && !(username.equals(""))){
            session.setAttribute("user",username);
        }


        out.println("<h1>Welcome, "+session.getAttribute("user")+" from parameter.</h1>");
//        out.println("<h1>Your password is: "+password+"</h1>");
    }

}

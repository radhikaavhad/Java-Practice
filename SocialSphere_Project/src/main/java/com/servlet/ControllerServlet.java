package com.servlet;

import com.dao.*;
import com.dto.UserPostJoin;
import com.model.Comment;
import com.model.Post;
import com.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.List;

@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        UserDAO userDAO = new UserDAOImpl();
        PostDAO postDAO = new PostDAOImpl();
        CommentDAO commentDAO = new CommentDAOImpl();
        String msg = "";
        int res = -1;

        String operation = req.getParameter("operation");
        switch (operation) {
            case "userRegistration":
                if (userDAO.isUserNameTaken(req.getParameter("userName"))) {
                    msg = "User already exists!";
                    req.setAttribute("msg", msg);
                    req.getRequestDispatcher("result.jsp").forward(req, resp);
                } else {
                    res = userDAO.UserRegistration(new User(0, req.getParameter("userName"), req.getParameter("userPassword"), req.getParameter("userEmail")));
                    resp.sendRedirect("userLogin.html");
                }
                break;

            case "userLogin":
                User user = userDAO.userLogin(req.getParameter("userName"), req.getParameter("userPassword"));
                if (user != null) {
                    HttpSession session = req.getSession();
                    session.setAttribute("loggedUser", user);
                    resp.sendRedirect("home.html");
                } else {
                    msg = "Invalid User!";
                    req.setAttribute("msg", msg);
                    req.getRequestDispatcher("result.jsp").forward(req, resp);
                }
                break;

            case "createPost":
                HttpSession session = req.getSession(false);
                if (session == null || session.getAttribute("loggedUser") == null) {
                    resp.sendRedirect("userLogin.html");
                } else {
                    User loggedUser = (User) session.getAttribute("loggedUser");
                    Post post = new Post(0, req.getParameter("postTitle"), req.getParameter("postContent"), loggedUser.getUserId());
                    res = postDAO.createPost(post);
                    msg = res > 0 ? "Post created successfully!" : "Could not create post!";
                    req.setAttribute("msg", msg);
                    req.getRequestDispatcher("result.jsp").forward(req, resp);
                }
                break;

            case "viewPost":
                List<UserPostJoin> posts = postDAO.viewAllPosts();
                req.setAttribute("posts", posts);
                req.getRequestDispatcher("viewPost.jsp").forward(req, resp);
                break;

            case "Add Comment":
                HttpSession session1 = req.getSession(false);
                if (session1 == null || session1.getAttribute("loggedUser") == null) {
                    resp.sendRedirect("userLogin.html");
                }
                else{
                    User loggedUser = (User) session1.getAttribute("loggedUser");
                    Comment comment = new Comment(0,req.getParameter("commentContent"), loggedUser.getUserId(), Integer.parseInt(req.getParameter("postId")));
                    res = commentDAO.addComment(comment);
                    msg = res>0 ? "Comment added successfully" : "Could not add comment";
                    List<UserPostJoin> postAfterComment = postDAO.viewAllPosts();
                    req.setAttribute("msg",msg);
                    req.setAttribute("posts",postAfterComment);
                    req.getRequestDispatcher("viewPost.jsp").forward(req, resp);
                }
                break;

            case "View Comments":
                List<Comment> comments  = commentDAO.viewComment(Integer.parseInt(req.getParameter("postId")));
                List<UserPostJoin> allPosts = postDAO.viewAllPosts();
                req.setAttribute("comments", comments);
                req.setAttribute("postId",Integer.parseInt(req.getParameter("postId")) );
                req.setAttribute("posts", allPosts);
                req.getRequestDispatcher("viewComment.jsp").forward(req, resp);
                break;

            case "LogOut":
                HttpSession logoutSession = req.getSession(false);
                if(logoutSession != null) {logoutSession.invalidate();}
                resp.sendRedirect("userRegistration.html");
                break;
        }

    }
}

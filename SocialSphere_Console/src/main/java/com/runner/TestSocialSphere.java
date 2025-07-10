package com.runner;

import com.dao.*;
import com.dto.UserPostJoin;
import com.model.Comment;
import com.model.Post;
import com.model.User;

import java.util.List;
import java.util.Scanner;

public class TestSocialSphere {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();
        PostDAO postDAO = new PostDAOImpl();
        CommentDAO commentDAO = new CommentDAOImpl();


        Scanner sc = new Scanner(System.in);

        System.out.println("===SocialSphere===");
        System.out.println("1) User Registration");
        System.out.println("2) User Login");
        System.out.println("3) Create Post");
        System.out.println("4) View all Posts");
        System.out.println("5) Add a comment");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        String name;
        String email;
        String password;
        int userId;

        switch (choice){
            case 1:
                System.out.println("Enter your username: ");
                 name = sc.nextLine();
                    System.out.println("Enter your email id: ");
                     email = sc.nextLine();
                    System.out.println("Enter your password: ");
                     password = sc.nextLine();
                if(userDAO.isUserNameTaken(name)){
                    System.out.println("User exists!");
                    break;
                }
                else {
                    int addedUser = userDAO.UserRegistration(new User(0, name, password, email));
                    System.out.println(addedUser + " user registered!");
                }
                break;

            case 2:
                System.out.println("Enter your username: ");
                name = sc.nextLine();
                System.out.println("Enter your password: ");
                password = sc.nextLine();
                if(userDAO.userLogin(name, password))
                    System.out.println("Login Successful!");
                else {
                    System.out.println("Login Failed!");
                }
                break;

            case 3:
                System.out.println("Enter user ID: ");
                userId = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter post title: ");
                String postTitle = sc.nextLine();
                System.out.println("Enter post content: ");
                String postContent = sc.nextLine();
                int addedPost = postDAO.createPost(new Post(0, postTitle, postContent,userId));
                System.out.println(addedPost + " post added!");
                break;

            case 4:
                System.out.println("===Viewing all Posts===");
                List<UserPostJoin> posts =postDAO.viewAllPosts();
                for(UserPostJoin post : posts)
                    System.out.println(post);
                break;

            case 5:
                System.out.println("Enter user Id of the user you want to comment: ");
                userId = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter post Id of the post you want to comment on: ");
                int postId = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter your comment: ");
                String commentContent = sc.nextLine();
                int addedComment = commentDAO.addComment(new Comment(0,commentContent,userId,postId));
                System.out.println(addedComment + " comment added!");
                break;
        }
    }
}

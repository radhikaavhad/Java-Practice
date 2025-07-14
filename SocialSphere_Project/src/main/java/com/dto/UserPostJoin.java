package com.dto;

import java.sql.Timestamp;

public class UserPostJoin {
    private String userName;
    private String postTitle;
    private String postContent;
    private Timestamp postTime;
    private int postId;

    public UserPostJoin(String userName, String postTitle, String postContent, Timestamp postTime, int postId) {
        this.userName = userName;
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.postTime = postTime;
        this.postId = postId;
    }

    public Timestamp getPostTime() {
        return postTime;
    }

    public void setPostTime(Timestamp postTime) {
        this.postTime = postTime;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Override
    public String toString() {
        return "UserPostJoin{" +
                "userName='" + userName + '\'' +
                ", postTitle='" + postTitle + '\'' +
                ", postContent='" + postContent + '\'' +
                ", postTime=" + postTime +
                ", postId=" + postId +
                '}';
    }
}

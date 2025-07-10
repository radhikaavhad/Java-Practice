package com.dto;

import java.sql.Timestamp;

public class UserPostJoin {
    private String userName;
    private String postTitle;
    private String postContent;
    private Timestamp postTime;

    public UserPostJoin(String userName, String postTitle, String postContent, Timestamp postTime) {
        this.userName = userName;
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.postTime = postTime;
    }

    @Override
    public String toString() {
        return
                "userName='" + userName + '\'' +
                ", postTitle='" + postTitle + '\'' +
                ", postContent='" + postContent + '\'' +
                ", postTime='" + postTime + '\'' +
                '}';
    }
}

package com.dao;

import com.dto.UserPostJoin;
import com.model.Post;

import java.util.List;

public interface PostDAO {

    int createPost(Post post);
    List<UserPostJoin> viewAllPosts();
}

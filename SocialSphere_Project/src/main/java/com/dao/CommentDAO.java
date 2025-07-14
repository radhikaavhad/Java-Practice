package com.dao;

import com.model.Comment;

import java.util.List;

public interface CommentDAO {
    int addComment(Comment comment);
    List<Comment> viewComment(int postId);
}

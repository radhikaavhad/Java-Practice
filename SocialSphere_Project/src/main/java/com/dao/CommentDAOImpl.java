package com.dao;

import com.model.Comment;
import com.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CommentDAOImpl implements CommentDAO{

    @Override
    public int addComment(Comment comment) {
        try {
            String sql = "insert into comment(commentContent, userId, postId) values (?, ?, ?)";
            PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, comment.getCommentContent());
            preparedStatement.setInt(2, comment.getUserId());
            preparedStatement.setInt(3, comment.getPostId());
            int res = 0;
            res = preparedStatement.executeUpdate();
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<Comment> viewComment(int postId) {
        List<Comment> commentList = new ArrayList<>();
        try {
            String sql = "select commentContent, userId, PostId from comment where postid = ?";
            PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, postId);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                commentList.add(new Comment(0,resultSet.getString("commentContent"),resultSet.getInt("userId"),resultSet.getInt("postId")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return commentList;
    }
}

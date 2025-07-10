package com.dao;

import com.model.Comment;
import com.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}

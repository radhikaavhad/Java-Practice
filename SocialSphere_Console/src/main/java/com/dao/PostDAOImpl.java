package com.dao;

import com.dto.UserPostJoin;
import com.model.Post;
import com.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PostDAOImpl implements PostDAO {

    @Override
    public int createPost(Post post) {
        try {
            String sql = "insert into post(postTitle,postContent,userId) values (?,?,?)";
            PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, post.getPostTitle());
            preparedStatement.setString(2, post.getPostContent());
            preparedStatement.setInt(3, post.getUserId());
            int res = 0;
            res = preparedStatement.executeUpdate();
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<UserPostJoin> viewAllPosts() {
        List<UserPostJoin> userPostJoinList = new ArrayList<>();
        try {
            Statement statement = DBUtil.getConnection().createStatement();
            String sql = "select u.username, p.postTitle, p.postContent, p.postTime from users u join post p on p.userId = u.userId order by postTime desc";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                userPostJoinList.add(new UserPostJoin(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getTimestamp(4))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userPostJoinList;
    }
}

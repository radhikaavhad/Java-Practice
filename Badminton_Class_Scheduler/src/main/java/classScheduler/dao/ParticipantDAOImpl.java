package classScheduler.dao;

import classScheduler.model.Participant;
import classScheduler.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ParticipantDAOImpl implements ParticipantDAO {

    @Override
    public int addParticipant(int id, Participant participant) {
        String sql = "select count(*) from participants where batchId = ?";
        PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sql);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();

        int maxCapacity = resultSet.getInt("maxCapacity");

        resultSet.next();
        int currentCount = resultSet.getInt("count");

        if(currentCount<maxCapacity)
    }
}

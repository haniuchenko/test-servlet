package com.haniuchenko.dao;

import com.haniuchenko.model.User;
import com.haniuchenko.util.DBConnect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin
 */
public class UserDaoImpl implements UserDao {

    public void delete(Integer id) {
        Connection connection;

        try {
            connection = DBConnect.getCon();
            PreparedStatement statement = connection.prepareStatement(QUERY_DELETE);
            statement.setInt(1, id);
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAll() {
        List<User> result = new ArrayList<User>();
        Connection connection = null;
        try {
            connection = DBConnect.getCon();
            Statement statement = connection.createStatement();
            ResultSet resSet = statement.executeQuery(QUERY_GET_ALL);
            while (resSet.next()) {
                User user = new User();
                user.setId(resSet.getInt("id"));
                user.setName(resSet.getString("name"));
                result.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnect.closeCon(connection);
        }

        return result;
    }
}

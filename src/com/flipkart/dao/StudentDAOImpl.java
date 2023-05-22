package com.flipkart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAOImpl implements StudentDAOInterface{
    private static volatile StudentDAOImpl instance = null;

    public static StudentDAOImpl getInstance() {
        if (instance == null) {
            synchronized (StudentDAOImpl.class) {
                instance = new StudentDAOImpl();
            }
        }
        return instance;
    }

    public boolean addCourse(int semester, String courseCode){

    }

    public boolean updateDetails(int id, String name, String branch, int batch, String email){
        Connection conn = DBInfo.getConnection();

        try {
            String query = "UPDATE Users SET name=?, branch=?, batch=?, email=? WHERE id=?";
            PreparedStatement statement = conn.prepareStatement(query);

            statement.setString(1, name);
            statement.setString(2, branch);
            statement.setString(3, batch);
            statement.setString(4, email);
            statement.setInt(5,id);

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }


}

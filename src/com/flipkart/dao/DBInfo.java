package com.flipkart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBInfo {
    private static String database = "CRSDatabase";
    private Connection conn = null;

    public Connection getConn(){
        if (conn != null){
            return conn;
        }
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database, MySQLCred.username,MySQLCred.password);
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return conn;
    }
}

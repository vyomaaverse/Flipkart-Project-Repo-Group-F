package com.flipkart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBInfo {
	private static String database = "CRSDatabase";

	public static Connection getConnection() {
		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database, MySQLCred.username,
					MySQLCred.password);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return conn;
	}
}

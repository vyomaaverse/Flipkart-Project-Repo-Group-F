package com.flipkart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.flipkart.bean.Student;
import com.flipkart.bean.User;

public class LoginDAOImpl implements LoginDAOInterface {
	private static volatile LoginDAOImpl instance = null;

	public static LoginDAOImpl getInstance() {
		if (instance == null) {
			synchronized (LoginDAOImpl.class) {
				instance = new LoginDAOImpl();
			}
		}
		return instance;
	}

	public User login(String role, String userId, String pass) {
		Connection conn = DBInfo.getConnection();

		try {
			String query = "SELECT * FROM Users WHERE id=? AND password=? AND role=?";
			PreparedStatement statement = conn.prepareStatement(query);

			statement.setString(1, userId);
			statement.setString(2, pass);
			statement.setString(3, role);

			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				String email = resultSet.getString("email");
				String name = resultSet.getString("name");
				int id = Integer.parseInt(userId);

				String tableName = "";
				switch (role) {
				case "admin":
					tableName = "Admins";
					break;
				case "professor":
					tableName = "Professors";
					break;
				case "student":
					tableName = "Students";
					break;
				default:
					break;
				}

				String queryDetails = "SELECT * FROM " + tableName + " WHERE id=?";
				PreparedStatement statementDetails = conn.prepareStatement(queryDetails);

				statementDetails.setString(1, userId);

				ResultSet resultSetDetails = statementDetails.executeQuery();

				if (resultSetDetails.next()) {
					switch (role) {
					case "student": {
						int batch = resultSetDetails.getInt("batch");
						String branch = resultSetDetails.getString("branch");

						Student loggedStudent = new Student();
						loggedStudent.setBatch(batch);
						loggedStudent.setBranch(branch);
						loggedStudent.setEmail(email);
						loggedStudent.setName(name);
						loggedStudent.setRole(role);
						loggedStudent.setStudentId(batch);
						loggedStudent.setUserId(id);

						return loggedStudent;
					}
					default:
						break;
					}

				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public boolean updatePassword(int userId, String oldPass, String newPass) {
		Connection conn = DBInfo.getConnection();

		try {
			String query = "UPDATE Users SET password=? WHERE id=? and password=?";
			PreparedStatement statement = conn.prepareStatement(query);

			statement.setString(1, newPass);
			statement.setInt(2, userId);
			statement.setString(3, oldPass);

			int rowsAffected = statement.executeUpdate();

			if (rowsAffected > 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	private int generateStudentId() {
		Connection conn = DBInfo.getConnection();

		try {
			String query = "SELECT COUNT(*) AS user_count FROM Users";
			PreparedStatement statement = conn.prepareStatement(query);

			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				int userCount = resultSet.getInt("user_count");

				return userCount + 1;
			}

			return -1;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 1;
	}

	public User registerStudent(String name, String branch, int batch, String email, String password) {
		Connection conn = DBInfo.getConnection();

		String role = "student";

		try {
			String query = "INSERT INTO Users (id, name, email, password, role) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement statement = conn.prepareStatement(query);

			int newId = generateStudentId();

			statement.setInt(1, newId);
			statement.setString(2, name);
			statement.setString(3, email);
			statement.setString(4, password);
			statement.setString(5, role);

			int userRowsAffected = statement.executeUpdate();

			if (userRowsAffected > 0) {
				String queryStudent = "INSERT INTO Students (id, batch, branch) VALUES (?, ?, ?)";
				PreparedStatement statementStudent = conn.prepareStatement(queryStudent);

				statementStudent.setInt(1, newId);
				statementStudent.setInt(2, batch);
				statementStudent.setString(3, branch);

				int studentRowsUpdated = statementStudent.executeUpdate();

				if (studentRowsUpdated > 0) {
					Student newStudent = new Student();
					newStudent.setUserId(newId);
					newStudent.setStudentId(newId);
					newStudent.setBatch(batch);
					newStudent.setBranch(branch);
					newStudent.setEmail(email);
					newStudent.setPassword(password);
					newStudent.setRole(role);
					newStudent.setName(name);

					return newStudent;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
}

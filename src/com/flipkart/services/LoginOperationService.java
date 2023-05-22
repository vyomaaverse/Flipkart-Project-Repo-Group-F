package com.flipkart.services;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.bean.User;
import com.flipkart.dao.LoginDAOImpl;
import com.flipkart.dao.LoginDAOInterface;

public class LoginOperationService extends User implements LoginServiceInterface {
	public User login(String role, String username, String password) {
		System.out.println("Verify user credentials");

		User user = LoginDAOImpl.getInstance().login(role, username, password);

		return user;
	}

	public boolean updatePassword(int userId, String oldPass, String newPass) {
		System.out.println("update user's password here");

		boolean updateStatus = LoginDAOImpl.getInstance().updatePassword(userId, oldPass, newPass);

		return updateStatus;
	}

	@Override
	public User registerStudent(String name, String branch, int batch, String email, String password) {
		System.out.println(
				"Registering student " + name + "\n branch: " + branch + "\n batch: " + batch + "\n email : " + email);

		User user = LoginDAOImpl.getInstance().registerStudent(name, branch, batch, email, password);

		return user;
	}
}

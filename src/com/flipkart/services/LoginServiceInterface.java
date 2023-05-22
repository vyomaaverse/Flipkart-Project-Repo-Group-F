package com.flipkart.services;

import com.flipkart.bean.User;

public interface LoginServiceInterface {
	public User login(String role, String username, String password);

	public User registerStudent(String name, String branch, int batch, String email, String password);

	public boolean updatePassword(int userId, String oldPass, String newPass);
}

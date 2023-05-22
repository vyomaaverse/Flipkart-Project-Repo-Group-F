package com.flipkart.dao;

import com.flipkart.bean.User;

public interface LoginDAOInterface {

	public User login(String role, String userId, String pass);

	public boolean updatePassword(int userId, String oldPass, String newPass);

	public User registerStudent(String name, String branch, int batch, String email, String password);
}

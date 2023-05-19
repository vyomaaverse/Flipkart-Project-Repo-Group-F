package com.flipkart.services;

import com.flipkart.bean.User;

public interface LoginServiceInterface {
    public User login(String role, String username, String password);

    public boolean registerStudent();

    public boolean updatePassword(String role, String userId, String oldPass, String newPass);
}

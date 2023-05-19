package com.flipkart.services;

import com.flipkart.bean.User;

public interface LoginServiceInterface {
    public User login(String role, String username, String password);

    public boolean changePassword(String role, String userId, String oldPass, String newPass);
}

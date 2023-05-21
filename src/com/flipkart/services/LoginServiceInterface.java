package com.flipkart.services;

import com.flipkart.bean.User;

public interface LoginServiceInterface {
    public User login(String role, String username, String password);

    public boolean registerStudent(String name, String branch, int batch);

    public boolean updatePassword(String email, String oldPass, String newPass);
}

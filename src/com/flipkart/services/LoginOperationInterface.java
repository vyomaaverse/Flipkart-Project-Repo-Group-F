package com.flipkart.services;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.bean.User;

public interface LoginOperationInterface {
    public User login(String role, String username, String password);

    public boolean changePassword(String role, String userId, String oldPass, String newPass);
}

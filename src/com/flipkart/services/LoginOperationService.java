package com.flipkart.services;

import com.flipkart.bean.Student;
import com.flipkart.bean.User;

public class LoginOperationService extends User {
    public User login(String role, String username, String password){
        System.out.println("Verify user credentials");

        return null;
    }

    public boolean changePassword(String role, String userId, String oldPass, String newPass){
        System.out.println("update user's password here");

        return true;
    }
}
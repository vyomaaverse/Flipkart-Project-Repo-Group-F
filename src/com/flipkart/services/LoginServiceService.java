package com.flipkart.services;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.bean.User;

public class LoginServiceService extends User implements LoginServiceInterface {
    public User login(String role, String username, String password){
        System.out.println("Verify user credentials");

        switch (role){
            case "a":
                return new Admin();
            case "p":
                User p = new Professor();
                p.setName(username);
                return p;
            case "s":
                return new Student();
            default:
                return null;
        }
//        System.out.println(role);
//        return new User();
    }

    public boolean changePassword(String role, String userId, String oldPass, String newPass){
        System.out.println("update user's password here");

        return true;
    }
}

package com.flipkart.services;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.bean.User;

public class LoginOperationService extends User implements LoginServiceInterface {
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

    public boolean updatePassword(String email, String oldPass, String newPass){
        System.out.println("update user's password here");

        return true;
    }

    @Override
    public boolean registerStudent(String name, String branch, int batch) {
        System.out.println("Register " + name + " of branch " + branch + " in batch " + batch);

        return true;
    }
}

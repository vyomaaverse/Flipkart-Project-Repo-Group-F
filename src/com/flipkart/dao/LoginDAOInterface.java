package com.flipkart.dao;

import com.flipkart.bean.User;

public interface LoginDAOInterface {

    //
    public User login(String role, String username, String pass);
}

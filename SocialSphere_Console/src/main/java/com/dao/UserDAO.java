package com.dao;

import com.model.User;

public interface UserDAO {

    int UserRegistration(User user);
    boolean isUserNameTaken(String username);
    boolean userLogin(String username, String password);
}

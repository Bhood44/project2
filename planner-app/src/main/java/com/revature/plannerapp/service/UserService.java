package com.revature.plannerapp.service;

import com.revature.plannerapp.entity.User;

public interface UserService {

    public User findUser(int theId);

    public void addUser(User theUser);

    public void deleteUser(int theId);
}

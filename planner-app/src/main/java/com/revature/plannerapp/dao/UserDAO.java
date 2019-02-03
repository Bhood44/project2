package com.revature.plannerapp.dao;

import com.revature.plannerapp.entity.User;

import java.util.List;

public interface UserDAO {

    public User findUserById(int theId);

    public void addUser(User theUser);

    public void deleteUser(int theId);

}

package com.revature.plannerapp.dao;

import com.revature.plannerapp.entity.User;

import java.util.List;

public interface UserDAO {

    public List<User> findUsers();

}

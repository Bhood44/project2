package com.revature.plannerapp.service;

import com.revature.plannerapp.dao.UserDAO;
import com.revature.plannerapp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO theUserDao){
        userDAO = theUserDao;
    }

    @Override
    @Transactional
    public User findUser(int theId) {
        return userDAO.findUserById(theId);
    }

    @Override
    @Transactional
    public void addUser(User theUser) {
        userDAO.addUser(theUser);

    }

    @Override
    @Transactional
    public void deleteUser(int theId) {
        userDAO.deleteUser(theId);

    }
}

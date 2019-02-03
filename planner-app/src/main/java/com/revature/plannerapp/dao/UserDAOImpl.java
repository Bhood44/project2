package com.revature.plannerapp.dao;

import com.revature.plannerapp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class UserDAOImpl implements UserDAO{

    private EntityManager entityManager;

    @Autowired
    public UserDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    public User findUserById(int employeeId){
      return null;
    };

}

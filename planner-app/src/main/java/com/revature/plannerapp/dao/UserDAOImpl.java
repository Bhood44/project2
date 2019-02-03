package com.revature.plannerapp.dao;

import com.revature.plannerapp.entity.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Component
public class UserDAOImpl implements UserDAO{

    private EntityManager entityManager;

    @Autowired
    public UserDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public List<User> findUsers(){
      Session currentSession = entityManager.unwrap(Session.class);

      Query<User> theQuery = currentSession.createQuery("from User", User.class);

      List<User> users = theQuery.getResultList();

      return users;
    }

}

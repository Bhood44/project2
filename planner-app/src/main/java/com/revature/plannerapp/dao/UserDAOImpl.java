package com.revature.plannerapp.dao;

import com.revature.plannerapp.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    private EntityManager entityManager;

    @Autowired
    public UserDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public User findUserById(int theId){
        Session currentSession = entityManager.unwrap(Session.class);

        User theUser = currentSession.get(User.class, theId);

        return theUser;
    }

    @Override
    public void addUser(User theUser){

        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(theUser);
        //save or update saves the user if the id==0; if id != 0, user is updated
    }

    @Override
    public void deleteUser(int theId){
        Session currentSession = entityManager.unwrap(Session.class);

        Query theQuery = currentSession.createQuery(
                "delete from User where userId =:userId"
        );

        theQuery.setParameter("userId", theId);

        theQuery.executeUpdate();

    }

}


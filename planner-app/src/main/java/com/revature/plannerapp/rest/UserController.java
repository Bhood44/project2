package com.revature.plannerapp.rest;

import com.revature.plannerapp.dao.UserDAO;
import com.revature.plannerapp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    private UserDAO userDAO;

    @Autowired
    public UserController(UserDAO theUserDAO){
        userDAO = theUserDAO;
    }

    @GetMapping("/getusers")
    public List<User> findAllUsers(){
        return userDAO.findUsers();
    }



}

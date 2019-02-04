package com.revature.plannerapp.rest;

import com.revature.plannerapp.dao.UserDAO;
import com.revature.plannerapp.entity.User;
import com.revature.plannerapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService theUserService) {
        userService = theUserService;
    }

    @GetMapping("/getuser/{employeeId}")
    public User findUserById(@PathVariable int theId) {

        User theUser = userService.findUser(theId);

        if (theUser == null) {
            throw new RuntimeException("User ID not found -" + theId);
        }

        return theUser;
    }

    @PostMapping("/adduser")
    public User addUser(@RequestBody User theUser) {

        theUser.setUserId(0);

        userService.addUser(theUser);

        return theUser;
    }

    @DeleteMapping("/deleteuser/{employeeId}")
    public String deleteUser(@PathVariable int theId) {
        User theUser = userService.findUser(theId);
        userService.deleteUser(theUser.getUserId());

        if (theUser == null) {
            throw new RuntimeException("User ID not found -" + theId);
        }
        return "Deleted User ID - " + theId;

        //todo add in some stuff to actually delete the user
    }
}


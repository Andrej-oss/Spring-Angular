package com.example.spring_angular.controllers;

import com.example.spring_angular.dao.UserDao;
import com.example.spring_angular.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MainController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/hello")
    public User hello(){
        return new User(1, "Jack");
    }

    @GetMapping(value = "/users")
    public List<User> getAllUsers(){
        return userDao.findAll();
    }

    @PostMapping("/save")
    public List<User> saveUser(@RequestBody User user){
        userDao.save(user);
        return userDao.findAll();
    }
}

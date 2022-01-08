package com.emanuelzaveruka.userdept.controllers;

import com.emanuelzaveruka.userdept.entities.User;
import com.emanuelzaveruka.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll(){
       List<User> result = repository.findAll();
       return result;
    }
}

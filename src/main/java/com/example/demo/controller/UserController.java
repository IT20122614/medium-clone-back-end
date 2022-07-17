package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable("id") int id){
        System.out.println("=====User controller impl called=====" + id);
        User uData = userService.getUserData(id);


        return new ResponseEntity<>(uData, HttpStatus.OK);

    }
    @GetMapping("/")
    public ResponseEntity<User> displayUser(){
        User uData = userService.getUserData(0);


        return new ResponseEntity<>(uData, HttpStatus.OK);
//        return new ResponseEntity<>("hi", HttpStatus.OK);
    }
}

package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRepositoryImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserData(int id) {
        System.out.println("=====User repository impl called=====");
        User data = userRepository.findById(id);
        return data;
    }
}

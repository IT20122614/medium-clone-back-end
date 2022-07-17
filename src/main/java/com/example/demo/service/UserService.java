package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;


public interface UserService {


    User getUserData(int id);
}

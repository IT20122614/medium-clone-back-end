package com.example.demo.controller;

import com.example.demo.model.BlogsModel;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("blogs")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/")
    public ResponseEntity<List<BlogsModel>> getAllBlogs() {

        List<BlogsModel> data = blogService.getBlogsAll();


        return new ResponseEntity<>(data, HttpStatus.OK);

    }
}

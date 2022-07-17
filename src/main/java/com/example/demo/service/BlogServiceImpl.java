package com.example.demo.service;

import com.example.demo.model.BlogsModel;
import com.example.demo.repository.BlogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    private BlogsRepository blogsRepository;

    @Override
    public List<BlogsModel> getBlogsAll() {

        List<BlogsModel> data = blogsRepository.findAll();
        return data;
    }
}

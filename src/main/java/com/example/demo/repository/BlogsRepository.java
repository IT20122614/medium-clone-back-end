package com.example.demo.repository;

import com.example.demo.model.BlogsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogsRepository extends JpaRepository<BlogsModel, Integer> {
//    @Query("SELECT * FROM blogs;")
    List<BlogsModel> findAll();

}

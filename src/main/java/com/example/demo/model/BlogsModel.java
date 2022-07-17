package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blogs")
public class BlogsModel {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String title;
    private String Content;
    private String date;
    private String authorName;
    private String ImageUrl;

    public BlogsModel() {
    }

    public BlogsModel(Long id, String title, String content, String date, String authorName, String imageUrl) {
        this.id = id;
        this.title = title;
        Content = content;
        this.date = date;
        this.authorName = authorName;
        ImageUrl = imageUrl;
    }

    public BlogsModel(String title, String content, String date, String authorName, String imageUrl) {
        this.title = title;
        Content = content;
        this.date = date;
        this.authorName = authorName;
        ImageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }
}

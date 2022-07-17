package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    private String name;
    private String profileUrl;
    private String password;
    private int followers;
    private int followings;

    public User(String name, String profileUrl, String password, int followers, int followings) {
        this.name = name;
        this.profileUrl = profileUrl;
        this.password = password;
        this.followers = followers;
        this.followings = followings;
    }

    public User(int id, String name, String profileUrl, String password, int followers, int followings) {
        this.id = id;
        this.name = name;
        this.profileUrl = profileUrl;
        this.password = password;
        this.followers = followers;
        this.followings = followings;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowings() {
        return followings;
    }

    public void setFollowings(int followings) {
        this.followings = followings;
    }
}

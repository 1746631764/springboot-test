package com.example.demo2.pojo;

import java.util.Date;

/**
 * @ClassName User
 * @Description
 * @Author linjunjin
 * @Date 2020/5/20 20:51
 **/
public class User {
    private Integer userId;
    private String username;
    private String password;
    private Date birth;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birth=" + birth +
                '}';
    }

    public User(Integer userId, String username, String password, Date birth) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.birth = birth;
    }
}

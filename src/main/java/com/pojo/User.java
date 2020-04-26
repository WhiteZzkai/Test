package com.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class User {
    @Value("#{2000-1}")
    private  Integer userId;
    @Value("#{xx.name}")
    private  String userName;
    @Value("#{xx.user}")
    private  String password;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    @PostConstruct
    public  void  myinit(){
        System.out.println("正在构造！");
    }
    @PreDestroy
    public void  mydestroy(){
        System.out.println("正在销毁！");
    }
}

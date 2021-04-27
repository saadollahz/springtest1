package com.example.demo.User;

import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Id;

@Service
@Entity
public class User {
@Id
private String username;
private  String paasword;

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPaasword() {
        return paasword;
    }

    public User setPaasword(String paasword) {
        this.paasword = paasword;
        return this;
    }
}

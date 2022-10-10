package com.spring.springapi.model;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

public class UserModel implements UserModelInterface {
    private Number id;
    private String name;
    private String email;
    private String password;

    public UserModel() {
        this.id = new Random().nextInt(5);
    }

    @Override
    public Number getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}

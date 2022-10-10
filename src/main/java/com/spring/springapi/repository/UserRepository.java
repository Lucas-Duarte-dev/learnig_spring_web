package com.spring.springapi.repository;

import com.spring.springapi.model.UserModel;
import com.spring.springapi.model.UserModelInterface;

import java.util.Arrays;
import java.util.Stack;

public final class UserRepository implements UserRepositoryInteface {
    private static UserRepository instance;
    private Stack<UserModelInterface> users;

    private UserRepository() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException err) {
            err.printStackTrace();
        }

    }

    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }

        return instance;
    }

    @Override
    public String create(String name, String email, String password) {

        UserModelInterface user = new UserModel();

        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);

        this.users.push(user);


        return String.format("Your account has been created with email %s", user.getEmail());
    }

    @Override
    public Stack<UserModelInterface> get() {
        return this.users;
    }
}

package com.spring.springapi.repository;

import com.spring.springapi.model.UserModelInterface;

import java.util.Stack;

public interface UserRepositoryInteface {

    public String create(String name, String email, String password);

    public Stack<UserModelInterface> get();
}

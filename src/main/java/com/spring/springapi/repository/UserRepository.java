package com.spring.springapi.repository;

import com.spring.springapi.exceptions.NoSuchEntityException;
import com.spring.springapi.model.UserModel;

import java.util.*;

public final class UserRepository implements UserRepositoryInteface {
    private static UserRepository instance;
    private List<UserModel> users = new ArrayList<>();

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
    public UserModel create(UserModel user) {
        this.users.add(user);

        return user;
    }

    @Override
    public List<UserModel> get() {
        return this.users;
    }

    @Override
    public UserModel getById(Long id) throws NoSuchEntityException {
        Optional<UserModel> userFind = this.users.stream().filter(user -> Objects.equals(user.getId(), id)).findFirst();

        if (userFind.isEmpty()) {
            throw new NoSuchEntityException("User not find", 400);
        }

        return userFind.get();
    }
}

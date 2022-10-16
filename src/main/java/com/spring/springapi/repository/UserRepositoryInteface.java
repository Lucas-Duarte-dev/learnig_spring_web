package com.spring.springapi.repository;

import com.spring.springapi.exceptions.NoSuchEntityException;
import com.spring.springapi.model.UserModel;
import java.util.List;
import java.util.Optional;

public interface UserRepositoryInteface {

    public UserModel create(UserModel user);

    public List<UserModel> get();

    public UserModel getById(Long id) throws NoSuchEntityException;
}

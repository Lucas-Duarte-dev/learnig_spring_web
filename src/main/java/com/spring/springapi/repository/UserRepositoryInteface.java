package com.spring.springapi.repository;

import com.spring.springapi.model.UserModel;
import java.util.List;

public interface UserRepositoryInteface {

    public UserModel create(UserModel user);

    public List<UserModel> get();
}

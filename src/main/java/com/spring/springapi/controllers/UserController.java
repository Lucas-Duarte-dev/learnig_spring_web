package com.spring.springapi.controllers;

import com.spring.springapi.model.UserModel;
import com.spring.springapi.repository.UserRepository;
import com.spring.springapi.repository.UserRepositoryInteface;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/create")
    public UserModel create(@RequestBody UserModel user) {
        UserRepositoryInteface userRepository = UserRepository.getInstance();

        return userRepository.create(user);
    }

    @GetMapping("/")
    public List<UserModel> get() {
        return UserRepository.getInstance().get();
    }
}

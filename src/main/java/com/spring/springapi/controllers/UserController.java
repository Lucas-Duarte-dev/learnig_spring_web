package com.spring.springapi.controllers;

import com.spring.springapi.exceptions.NoSuchEntityException;
import com.spring.springapi.model.UserModel;
import com.spring.springapi.repository.UserRepository;
import com.spring.springapi.repository.UserRepositoryInteface;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepositoryInteface userRepository = UserRepository.getInstance();

    @PostMapping("/create")
    public UserModel create(@RequestBody UserModel user) {
        return this.userRepository.create(user);
    }

    @GetMapping("/")
    public List<UserModel> get() {
        return this.userRepository.get();
    }

    @GetMapping("/{id}")
    public UserModel getById(@PathVariable("id") Long id) {
        try {
            return this.userRepository.getById(id);
        } catch (NoSuchEntityException err) {
            System.out.println(err.getMessage());

            return null;
        }
    }
}

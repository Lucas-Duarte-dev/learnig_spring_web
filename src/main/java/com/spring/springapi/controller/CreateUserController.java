package com.spring.springapi.controller;

import com.spring.springapi.repository.UserRepository;
import com.spring.springapi.repository.UserRepositoryInteface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateUserController {

    @GetMapping("/create/user")
    public String index(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "password") String password
    ) {
        UserRepositoryInteface userRepository = UserRepository.getInstance();

        return userRepository.create(name, email, password);
    }
}

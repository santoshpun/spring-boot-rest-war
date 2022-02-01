package com.santosh.springbootrestwar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "users")
public class UsersController {

    @GetMapping
    public List<String> getAllUsers() {
        return Arrays.asList("Ram", "Shyam", "Hari");
    }

    @GetMapping(value = "{userId}")
    public String getUser(@PathVariable(value = "userId") String userId) {
        return "Ram";
    }
}

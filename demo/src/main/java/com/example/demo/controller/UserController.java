package com.example.demo.controller;

import com.example.demo.dto.entity.UserEntity;
import com.example.demo.dto.request.UserRequest;
import com.example.demo.dto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserEntity> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("/users")
    public UserEntity createNewUser(@RequestBody UserRequest request){
        return userService.createNewUser(request);
    }

    @GetMapping("/users/{id}")
    public UserEntity getUserById(@RequestBody UserRequest newRequest, @PathVariable String id){
        return userService.getUserById(id);
    }

    @PutMapping("/users/{id}")
    public UserEntity updateUserById(@RequestBody UserRequest newRequest, @PathVariable String id){
        return userService.updateUserById(newRequest, id);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUserById(@PathVariable String id){
        userService.deleteUserById(id);
        return "User has been deleted!";
    }
}

package com.example.demo.dto.service;

import com.example.demo.dto.entity.UserEntity;
import com.example.demo.dto.repository.UserRepository;
import com.example.demo.dto.request.UserRequest;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }

    public UserEntity createNewUser(UserRequest request) {
        UserEntity user = new UserEntity();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstname(request.getFirstname());
        user.setLastname(request.getLastname());
        user.setDob(request.getDob());
        user.setAddress(request.getAddress());

        return userRepository.save(user);
    }

    public UserEntity getUserById(String id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public UserEntity updateUserById(UserRequest newRequest, String id){
        UserEntity foundUser = getUserById(id);

        foundUser.setPassword(newRequest.getPassword());
        foundUser.setAddress(newRequest.getAddress());
        foundUser.setDob(newRequest.getDob());
        foundUser.setFirstname(newRequest.getFirstname());
        foundUser.setLastname(newRequest.getLastname());

        return userRepository.save(foundUser);
    }

    public void deleteUserById(String id){
        userRepository.deleteById(id);
    }
}

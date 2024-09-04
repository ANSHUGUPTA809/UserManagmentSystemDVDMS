package com.UserStructure.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserStructure.entity.User;
import com.UserStructure.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByUsername(String userName) {
        return userRepository.findByUsername(userName);
    }

    /*public List<User> findAllUsers() {
        return userRepository.findAll();
    }*/
}

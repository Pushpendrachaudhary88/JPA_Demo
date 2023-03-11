package com.HindustaniBhau.JPAdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(User user){
        userRepository.save(user);
        return "User added";
    }
    public List<User> getUsers(){
       return  userRepository.findAll();
    }
    public Optional<User> getUser(int id){
       return userRepository.findById(id);
    }
}

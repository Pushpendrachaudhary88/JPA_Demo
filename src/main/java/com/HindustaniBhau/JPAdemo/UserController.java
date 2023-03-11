package com.HindustaniBhau.JPAdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);

    }
    @GetMapping("/get_user")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @GetMapping("/get_users")
    public Optional<User> getUser(@RequestParam("id") int id){
        return userService.getUser(id);
    }
}

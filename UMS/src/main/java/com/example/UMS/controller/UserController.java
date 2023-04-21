package com.example.UMS.controller;

import com.example.UMS.model.User;
import com.example.UMS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping(value = "/getUserById")
    public User getUserById(@RequestParam int id){
        return userService.getUserById(id);
    }
    @GetMapping(value = "/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @PutMapping(value = "/updateUser/{id}")
    public String updateUser(@PathVariable int id,@RequestBody User user){
        userService.updateuser(id,user);
        return "update successfuly";
    }
    @DeleteMapping(value = "deleteUser")
    public String deleteUser(@RequestParam int id){
        userService.deleteUser(id);
        return "user delete successfuly !";
    }
}

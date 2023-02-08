package com.UserManagementSystem.User.Management.System.controller;

import com.UserManagementSystem.User.Management.System.model.User;
import com.UserManagementSystem.User.Management.System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user-management-system")
public class UserController {
    @Autowired
    private  UserService userService;
//    public UserController(UserService userService){
//        this.userService=userService;
//    }


    @PostMapping("/add-user")
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return "Hey, Your Task addUser has been Compeleted !";
    }

    @GetMapping("/get-user/userId/{userId}")
    public User getUser(@PathVariable int userId){
        return userService.getUser(userId);
    }
    @GetMapping("get-all-user")
    public List<User> getAllUser(){
        return userService.get_all_user();
    }
    @PutMapping("/update-user/userId/{userId}")
    public String updateUserInfo(@PathVariable int userId,@RequestBody User user){
        userService.updateUser(userId,user);
        return "Hey, Your Task updateUser has been Compeleted !";

    }
    @DeleteMapping("/delete-user/userId/{userId}")
    public String deleteUser(@PathVariable int userId){
        userService.deleteUser(userId);
        return "Hey, Your Task deleteUser has been Compeleted !";
    }

}

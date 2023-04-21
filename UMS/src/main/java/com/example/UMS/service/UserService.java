package com.example.UMS.service;

import com.example.UMS.model.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    private List<User> userList = new ArrayList<>();
    public String createUser(User user) {
        userList.add(user);
        return "User has been created with userId "+user.getUserId();
    }

    public User getUserById(int id) {
        User newUser=null;
        for(User user:userList){
            if(user.getUserId()==id){
                newUser=user;
            }
        }
        return newUser;
    }

    public List<User> getAllUser() {
        return userList;
    }

    public void updateuser(int id,User newUser) {
        for(User user:userList){
            if(user.getUserId()==id){
                user.setUserId(newUser.getUserId());
                user.setUserName(newUser.getUserName());
                user.setName(newUser.getName());
                user.setAddress(newUser.getAddress());
                user.setPhoneNumber(newUser.getPhoneNumber());
            }
        }
    }

    public void deleteUser(int id) {
        for(User user:userList){
            if(user.getUserId()==id){
                userList.remove(user);
            }
        }
    }
}

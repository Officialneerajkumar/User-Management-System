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
                user.setUserName(newUser.getUserName());
                user.setPhoneNumber(newUser.getPhoneNumber());
                user.setEmail(newUser.getEmail());
                user.setDateOfBirth(newUser.getDateOfBirth());
                user.setDate(newUser.getDate());
                user.setTime(newUser.getTime());
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

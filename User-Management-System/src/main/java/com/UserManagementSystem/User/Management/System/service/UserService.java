package com.UserManagementSystem.User.Management.System.service;

import com.UserManagementSystem.User.Management.System.model.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    static List<User> users=new ArrayList<>();
    private static int userId=0;
    static {
        users.add(new User(++userId,"Piyush Sonkar","Lucknow",999999999));
        users.add(new User(++userId,"Bilal","Lucknow",888888888));
        users.add(new User(++userId,"Karan Shrivastava","Lucknow",777777777));
        users.add(new User(++userId,"Kashish Mishra","Lucknow",666666666));
        users.add(new User(++userId,"Pratiksha Mishra","Lucknow",555555555));
    }

    public List<User> get_all_user(){ // Task-1 -->bussiness logic of the task
        return users;
    }

    public User getUser(int id){
        for(User obj:users){
            if(obj.getUserId()==id){
                return obj;
            }
        }
        return null;
    }

    public void addUser(User user){
        users.add(user);
    }

    public void updateUser(int userId,User user){
        for(User obj:users){
            if(obj.getUserId()==userId){
                obj.setUserId(user.getUserId());
                obj.setUserName(user.getUserName());
                obj.setAddress(user.getAddress());
                obj.setPhoneNumber(user.getPhoneNumber());
            }
        }
    }

    public void deleteUser(int userId){
        for(User obj:users){
            if(obj.getUserId()==userId){
                users.remove(obj);
            }
        }
    }
}

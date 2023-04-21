package com.example.UMS.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private int userId;
    private String name;
    private String userName;
    private String address;
    private String phoneNumber;

}

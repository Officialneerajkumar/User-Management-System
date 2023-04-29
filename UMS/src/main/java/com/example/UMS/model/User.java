package com.example.UMS.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class User {

    private int userId;
    @NotBlank(message = "UserName can't be null or empty or Blank !!")
    private String userName;
    @Pattern(regexp = "^(1[0-2]|0[1-9])-(3[01]|[12][0-9]|0[1-9])-[0-9]{4}$",message = "Please enter the valid date of birth !!")
    private String dateOfBirth;
    @Email(message = "Please enter valid email !!")
    private String email;
    @Size(min = 12,max = 12)
    @Pattern(regexp = "^(?:[0-9]?){12,12}[0-9]{1}$",message = "Please enter valid phone number")
    private String phoneNumber;
    private String date;
    private String time;

}

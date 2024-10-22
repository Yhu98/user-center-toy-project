package com.hu.usercenter.model;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String surname;
    private String firstname;
    private Integer age;
    private String email;
}
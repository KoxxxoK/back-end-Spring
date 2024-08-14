package com.example.lab4.dto;

import com.example.lab4.models.Car;

import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;

public class AccountDto implements Serializable {
    private Long id;
    private String name;
    private String surname;
    private String sex;
    private Date birthday;
    private Car cars;
}

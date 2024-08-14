package com.example.lab4.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.UUID;

@Getter
@Setter
@Table(name="car")
@Entity
@Data
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable = false)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="model")
    private String model;
    @Column(name="release")
    private Date release;
}

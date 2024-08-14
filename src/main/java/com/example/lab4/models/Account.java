package com.example.lab4.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Table(name="account")
@Entity
@Data
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable = false)
    private Long id;
    @Column(name="name",length = 25, nullable = false)
    private String name;
    @Column(name="surname")
    private String surname;
    @Column(name="sex")
    private String sex;
    @Column(name="birthday")
    private Date birthday;
    @Column(name = "carid")
    private String carid;
    @OneToMany
    @JoinColumn(name="account_id")
    private List<Car> cars;
}

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
@Table(name="techService")
@Entity
@Data
@NoArgsConstructor
public class TechService {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable = false)
    private Long id;
    @OneToOne
    @JoinColumn(name="idClient")
    private Account idClient;
    @OneToOne
    @JoinColumn(name="idMechanic")
    private Account idMechanic;
    @OneToOne
    @JoinColumn(name="idCar")
    private Car idCar;
    @Column(name="dateTechService")
    private Date dateTechService;
    @Column(name = "status")
    private String status;
}

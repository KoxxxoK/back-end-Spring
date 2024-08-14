package com.example.lab4.dao;

import com.example.lab4.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CarRepository extends JpaRepository<Car, Long> {

}

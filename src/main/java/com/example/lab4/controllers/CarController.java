package com.example.lab4.controllers;

import com.example.lab4.dao.CarRepository;
import com.example.lab4.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/car")
@RestController
public class CarController {
    @Autowired
    CarRepository carRepository;

    @GetMapping("/")
    public List<Car> getAll(){
        return carRepository.findAll();
    }
    @PostMapping("/create")
    public Car create(Car car){
        return carRepository.save(car);
    }
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") Long id){
        carRepository.deleteById(id);
    }

}

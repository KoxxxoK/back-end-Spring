package com.example.lab4.controllers;

import com.example.lab4.dao.TechServiceRepository;
import com.example.lab4.models.TechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/techService")
@RestController
public class TechServiceController {
    @Autowired
    private TechServiceRepository techServiceRepository;

    @PostMapping
    public TechService create(TechService techService){
        return techServiceRepository.save(techService);
    }
}

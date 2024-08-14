package com.example.lab4.dao;

import com.example.lab4.models.TechService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TechServiceRepository extends JpaRepository<TechService, Long> {

}

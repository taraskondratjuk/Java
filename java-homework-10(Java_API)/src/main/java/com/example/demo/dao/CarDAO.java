package com.example.demo.dao;

import com.example.demo.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDAO extends JpaRepository<Car,Integer> {
}

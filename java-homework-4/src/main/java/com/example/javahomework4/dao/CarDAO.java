package com.example.javahomework4.dao;

import com.example.javahomework4.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDAO extends JpaRepository<Car,Integer> {
}

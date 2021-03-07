package com.example.hm5.dao;

import com.example.hm5.model.Car;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDAO extends JpaRepository<Car, Integer> {
}

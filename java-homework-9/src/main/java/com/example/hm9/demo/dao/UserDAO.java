package com.example.hm9.demo.dao;

import com.example.hm9.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Integer> {
}

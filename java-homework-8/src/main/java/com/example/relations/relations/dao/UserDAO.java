package com.example.relations.relations.dao;

import com.example.relations.relations.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Integer> {
}

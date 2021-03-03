package com.example.javahomework4.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private int money;
    private boolean isMarried;

    public User(String name, int age, int money, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.isMarried = isMarried;
    }
}

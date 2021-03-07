package com.example.hm5.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String carModel;
    private int price;

    public Car(String carModel, int price) {
        this.carModel = carModel;
        this.price = price;
    }
}

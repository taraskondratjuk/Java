package com.example.relations.relations.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = "users")

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String model;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cars")
    @JsonIgnore
    private List<User> users = new ArrayList<>();

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, List<User> users) {
        this.model = model;
        this.users = users;
    }
}

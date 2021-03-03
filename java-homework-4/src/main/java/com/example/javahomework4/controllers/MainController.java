package com.example.javahomework4.controllers;

import com.example.javahomework4.dao.CarDAO;
import com.example.javahomework4.dao.UserDAO;
import com.example.javahomework4.models.Car;
import com.example.javahomework4.models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor

@RestController
public class MainController {

    private CarDAO carDAO;
    private UserDAO userDAO;

    @GetMapping("/hello")
    public String hello() {
        return "Hello javist";
    }

    @GetMapping("birthDay")
    public int birthDay() {
        return 1993;
    }

    @GetMapping("user")
    public User getUser() {
        User user = new User("Taras", 28, 2500, false);
        return user;
    }

//    @GetMapping("users")
//    public List<User> getUsers() {
//        List<User> userList = Arrays.asList(
//                new User("Taras", 28, 2500, false),
//                new User("Nazar", 27, 1000, true),
//                new User("Diana", 22, 100, true),
//                new User("Igor", 24, 500, false),
//                new User("Romuk", 27, 150, false)
//        );
//        return userList;
//    }

    @GetMapping("getUsers")
    public List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        userList = userDAO.findAll();
        return userList;


    }

    @GetMapping("saveCar")
    public void saveCar(String name){
        Car car=new Car(name);
        carDAO.save(car);
    }

    @GetMapping("getCars")
    public List<Car> getCars(){
        return carDAO.findAll();
    }

}

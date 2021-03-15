package com.example.relations.relations.controllers;

import com.example.relations.relations.dao.UserDAO;
import com.example.relations.relations.models.Car;
import com.example.relations.relations.models.Product;
import com.example.relations.relations.models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
    private UserDAO userDAO;

    @GetMapping("/saveWithProducts")
    public void saveWithProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Coffee"));
        productList.add(new Product("Tea"));
        User user = new User("Nazar", productList);
        userDAO.save(user);
    }

    @GetMapping("/showUser")
    public List<User> showUser() {
        return userDAO.findAll();
    }

    @GetMapping("/saveWithCars")
    public void saveWithCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW"));
        cars.add(new Car("Audi"));

        User user= new User("Taras");
        user.setCars(cars);
        userDAO.save(user);
    }


    @GetMapping("/saveWithCarsAndWithProducts")
    public void saveWithCarsAndWithProducts() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW"));
        cars.add(new Car("Audi"));

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Coffee"));
        productList.add(new Product("Tea"));

        User user= new User("Taras");
        user.setCars(cars);
        user.setProducts(productList);
        userDAO.save(user);
    }

}

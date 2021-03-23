package com.example.demo.controller;

import com.example.demo.dao.CarDAO;
import com.example.demo.model.Car;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/car")
@CrossOrigin(origins = {"http://localhost:4200"})
public class CarController {
    private CarDAO carDAO;

    @PostMapping("/save")
    public void saveCar(@RequestBody Car car) {
        carDAO.save(car);
    }

    @GetMapping("")
    public List<Car> getAllCar() {
        return carDAO.findAll();
    }

    @PostMapping("/{id}")
    public void deleteCar(@PathVariable int id) {
        Car findCar = carDAO.getOne(id);
        carDAO.delete(findCar);
    }

    @PostMapping("/edit/{id}")
    public void editCar(@RequestBody Car car, @PathVariable int id) {
        Car editCar = carDAO.getOne(id);
        editCar.setMark(car.getMark());
        editCar.setModel(car.getModel());
        editCar.setPrice(car.getPrice());
        carDAO.save(editCar);
    }
}

package com.example.hm5.controller;

import com.example.hm5.dao.CarDAO;
import com.example.hm5.model.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@AllArgsConstructor
@Controller
public class MainController {
    private CarDAO carDAO;

    @PostMapping("save")
    public String saveCar(@RequestParam String carModel, @RequestParam int price, Model model) {
        carDAO.save(new Car(carModel, price));
        model.addAttribute("cars", carDAO.findAll());
        return "cars.html";
    }

    @GetMapping("/cars/{id}")
    public String getCar(@PathVariable int id, Model model) {
        model.addAttribute("car", carDAO.getOne(id));
        return "car.html";
    }


}

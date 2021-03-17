package com.example.hm9.demo.controller;

import com.example.hm9.demo.dao.UserDAO;
import com.example.hm9.demo.model.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {
    private UserDAO userDAO;

    @PostMapping("/save")
    public void saveWithImage(@RequestParam String name, @RequestParam MultipartFile image) throws IOException {
        String pathToFolder = System.getProperty("user.home") + File.separator + "pictureHM9" + File.separator + image.getOriginalFilename();
        image.transferTo(new File(pathToFolder));

        String imageName = image.getOriginalFilename();
        User user = new User(name, imageName);
        userDAO.save(user);
    }

    @GetMapping("/getUser/{id}")
    public User getUserById(@PathVariable int id) {
        return userDAO.getOne(id);
    }
}

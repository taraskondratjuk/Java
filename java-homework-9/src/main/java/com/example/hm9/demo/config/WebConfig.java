package com.example.hm9.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        String pathToImage = System.getProperty("user.home") + File.separator + "pictureHM9"+File.separator;

        registry.addResourceHandler("/pic/**")
                .addResourceLocations("file:" + pathToImage);

    }
}

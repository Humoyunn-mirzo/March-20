package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.name}") // Retrieving value from application.properties
    private String appName;

    @GetMapping("/app-name")
    public String getAppName() {
        return "Application Name: " + appName;
    }
}

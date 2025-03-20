package com.example.demo;

import com.example.demo.config.AppConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    private final AppConfig appConfig;

    public ConfigController(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @GetMapping("/config")
    public String getConfig() {
        return "App Name: " + appConfig.getName() +
                ", Version: " + appConfig.getVersion() +
                ", Author: " + appConfig.getAuthor();
    }
}

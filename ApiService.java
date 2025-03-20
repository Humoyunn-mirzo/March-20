package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ApiService {

    @Value("${api.base.url}")
    private String apiUrl;

    @Value("${api.timeout}")
    private int timeout;

    public String getApiDetails() {
        return "API URL: " + apiUrl + ", Timeout: " + timeout + "ms";
    }
}

package com.backend.BlogApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot";
    }

}

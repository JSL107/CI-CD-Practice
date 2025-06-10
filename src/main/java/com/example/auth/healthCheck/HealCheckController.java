package com.example.auth.healthCheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealCheckController {

    @GetMapping("/health")
    public String health() {
        return "App is running";
    }

    @PostMapping("/check")
    public String check() {
        return "Finished Checking";
    }
}
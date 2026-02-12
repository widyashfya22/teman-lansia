src/main/java/com/temanlansiabe/temanlansia_backend/controller/HealthController.java

package com.temanlansiabe.temanlansia_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "Backend Teman Lansia running 🚀";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
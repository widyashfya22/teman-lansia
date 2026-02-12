package com.temanlansiabe.temanlansia_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public String home() {
        return "Backend Teman Lansia Running 🚀";
    }
}

package com.temanlansiabe.temanlansiabackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "Teman Lansia Backend is Running 🚀";
    }
}

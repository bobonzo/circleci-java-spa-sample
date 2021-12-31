package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleContorller {

    @GetMapping("/api/hello")
    public String get() {
        return "hello world";
    }
}

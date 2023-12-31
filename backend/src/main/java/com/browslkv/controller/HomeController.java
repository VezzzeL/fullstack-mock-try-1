package com.browslkv.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/browslkv/")
public class HomeController {

    @GetMapping
    public ResponseEntity<String> getHomePage() {
        String welcomeMessage = "Welcome to Browslkv - Your Beauty Specialist Booking App!";
        return ResponseEntity.ok(welcomeMessage);
    }
}
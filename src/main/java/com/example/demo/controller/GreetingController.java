package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greet")
    public ResponseEntity<String> greet(){
        return ResponseEntity.status(HttpStatus.OK).body("Hi , I am Java Backend Server");
    }
}

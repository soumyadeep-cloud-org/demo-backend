package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/")
    public ResponseEntity<String> healthCheck(){
        return ResponseEntity.status(HttpStatus.OK).body("Healthy!!");
    }

    @GetMapping("/greet")
    public ResponseEntity<String> greet(){
        return ResponseEntity.status(HttpStatus.OK).body("Hello from EC2 instance with hostname: "+System.getenv("HOST_NAME"));
    }
}

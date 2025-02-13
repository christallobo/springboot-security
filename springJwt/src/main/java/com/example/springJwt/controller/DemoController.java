package com.example.springJwt.controller;

import com.example.springJwt.model.AuthenticationResponse;
import com.example.springJwt.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public ResponseEntity<String> demo(){
        return ResponseEntity.ok("Hello from secured url");
    }

    @GetMapping("/admin-only")
    public ResponseEntity<String> adminOnly(){
        return ResponseEntity.ok("Hello from admin url");
    }
}

package com.example.SecurityDemo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @GetMapping("/hello")
    public String sayhello(){
        return "hello";
    }
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String userEndpoint(){
        return "Hello,user";
    }
    @PreAuthorize("hasRole('ADMIN')")

    @GetMapping("/admin")
    public String adminEndpoint(){
        return "Hello,admin ";
    }
}

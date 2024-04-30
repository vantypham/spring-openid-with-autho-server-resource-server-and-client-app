package com.example.oauth2clientandgateway;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @CrossOrigin("*")
    @GetMapping
    public String defaultHome() {
        return "HOME";
    }
}

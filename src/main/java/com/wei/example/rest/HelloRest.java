package com.wei.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class HelloRest {

    @GetMapping("/hello")
    public String index() {
        return "Greetings from Spring Boot!\n";
    }

}
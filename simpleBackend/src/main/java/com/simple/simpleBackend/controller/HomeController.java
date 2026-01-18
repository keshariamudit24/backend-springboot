package com.simple.simpleBackend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// use @RestController instead of @Controller 
// or
// use @Controller with @ResponseBody above the greet method
@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to home page";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is the about page";
    }
    
}
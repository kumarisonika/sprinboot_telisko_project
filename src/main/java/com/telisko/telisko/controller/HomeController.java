package com.telisko.telisko.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")

    public String greet(){
        return "This is my first hello!!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is about!";
    }

}

package com.example.web01.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/hello")
public class helloController {

    @GetMapping
    public String GetHello(){
        System.out.println("hello world");
        return "hello world";
    }
}

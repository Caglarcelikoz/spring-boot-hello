package com.test.springboottestrest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {
    @RequestMapping("/")
    public String showHello(){
        return "hello world test";
    }
}

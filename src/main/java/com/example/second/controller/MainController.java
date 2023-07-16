package com.example.second.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/main")
public class MainController {

    @RequestMapping("/iceCherry")
    public String getOnePoint(){
        return "main ice cherry";
    }

    @RequestMapping("/apple")
    public String getApple(){
        return "main apple";
    }

    @RequestMapping("/banana")
    public String getBanana(){
        return "main banana";
    }
}

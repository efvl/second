package com.example.second.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/second")
public class SecondController {

    @GetMapping("/word")
    public String getWord(){
        return "second word";
    }

    @GetMapping("/point")
    public String getPoint(){
        return "second point";
    }

}

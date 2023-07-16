package com.example.second.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/main")
public class MainController {

    @RequestMapping("/one")
    public String getOnePoint(){
        return "main one";
    }

    @RequestMapping("/coffe")
    public String getPoint(){
        return "main coffee";
    }
}

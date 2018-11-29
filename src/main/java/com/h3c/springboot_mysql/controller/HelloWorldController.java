package com.h3c.springboot_mysql.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String index() {
        return "hutaoying";
    }
    @PostMapping("/index1")
    public Map index1(@RequestBody Map map){
        return map;
    }

}

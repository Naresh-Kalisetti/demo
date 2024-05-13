package com.example.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created by IntelliJ IDEA.
 * @User: venkatanareshkalisetti
 * @Date: 13/05/2024
 * @Time: 11:59
 */
@RestController
public class HelloWorld {
    @RequestMapping("/hello")
    public String message(){
        return "Sample springboot application";
    }
}

package com.shreya.spring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/Hello")
    public String Hello(){
        return "Hello, world!!!!!";
    }
}

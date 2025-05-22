package com.shreya.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocaleController {

    @GetMapping("/locale")
    public String locale(){
        return "locale";
    }
}

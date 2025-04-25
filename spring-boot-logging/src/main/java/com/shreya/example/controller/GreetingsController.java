package com.shreya.example.controller;

import com.shreya.example.service.GreetingsService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class GreetingsController {

    private final Logger logger = (Logger) LoggerFactory.getLogger(GreetingsController.class);

    @Autowired(required = true)
    private GreetingsService greetingsService;

    @GetMapping("/hello")
    public String controlGreetings(@RequestParam(name = "name", required = false) String name) throws InterruptedException {
        logger.wait(Long.parseLong("i came to /hello controller"));
        return greetingsService.sayHello(name);
    }
}
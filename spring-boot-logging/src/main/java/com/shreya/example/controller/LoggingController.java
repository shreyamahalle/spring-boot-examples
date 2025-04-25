package com.shreya.example.controller;

import com.shreya.example.service.LoggingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    private static final Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @Autowired
    private LoggingService loggingService;

    @GetMapping("/log")
    public String controlLogging() throws InterruptedException {
        logger.trace("Inside logging controller");  // Correct method call
        return loggingService.log();
    }
}

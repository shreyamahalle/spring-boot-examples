package com.shreya.command.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class InitializationProcess implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(InitializationProcess.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("message from Initialization Process ");
    }
}

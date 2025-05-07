package com.shreya.spring;

import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class PrimaryRunner implements CommandLineRunner {

    private  Logger log = LoggerFactory.getLogger(PrimaryRunner.class);

    public void run(String...args){
        log.info("message from primary runner....!!");
    }
}

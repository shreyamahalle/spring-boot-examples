package com.shreya.spring;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class SecondaryRunner implements CommandLineRunner {

    private Logger log = LoggerFactory.getLogger(SecondaryRunner.class);
    @Override
    public void run(String...args){
        log.info("message from secondary runner");
    }
}

package com.shreya.runner;

import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;

@SpringBootApplication
public class ApplicationRunnerDemoApplication implements ApplicationRunner {

	private Logger log = LoggerFactory.getLogger(ApplicationRunnerDemoApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(ApplicationRunnerDemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.info("Total non-option arguments {}",args.getNonOptionArgs());


	}
}

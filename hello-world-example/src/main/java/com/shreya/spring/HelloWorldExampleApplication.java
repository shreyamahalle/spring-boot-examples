package com.shreya.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldExampleApplication implements ApplicationRunner {

	private static final Logger logger = LoggerFactory.getLogger(HelloWorldExampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldExampleApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("Total NonOptionArgs: {}", args.getNonOptionArgs().size());
		args.getNonOptionArgs().forEach(arg -> logger.info("Non-option arg: {}", arg));

		logger.info("Total OptionArgs: {}", args.getOptionNames().size());
		args.getOptionNames().forEach(name ->
				logger.info("{} = {}", name, args.getOptionValues(name))
		);
	}
}

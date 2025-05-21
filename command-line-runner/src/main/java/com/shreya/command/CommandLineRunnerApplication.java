package com.shreya.command;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

@SpringBootApplication
public class CommandLineRunnerApplication implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(CommandLineRunnerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CommandLineRunnerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("total noo-option arguments {}", args.length);
		Arrays.stream(args).forEach(name -> logger.info("{} + {} " ,name, args));
	}
}

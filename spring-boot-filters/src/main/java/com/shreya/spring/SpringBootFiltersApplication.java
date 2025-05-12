package com.shreya.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootFiltersApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(SpringBootFiltersApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFiltersApplication.class, args);
	}

	public void run(String... args) {
		if (0 == args.length)
			log.debug("No arguments are provided to this program");
		else
			for (String arg : args)
				log.debug("Argument received: {} ", arg);
	}
}

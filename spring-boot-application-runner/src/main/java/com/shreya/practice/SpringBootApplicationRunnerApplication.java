package com.shreya.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApplicationRunnerApplication implements ApplicationRunner {

	private static final Logger log = LoggerFactory.getLogger(SpringBootApplicationRunnerApplication.class);

	@Override
	public void run(final ApplicationArguments args) throws Exception {
		log.info("Total NonOptionArgs: {}", args.getNonOptionArgs().size());
		args.getNonOptionArgs().forEach( log::info);
		log.info("Total OptionArgs: {}", args.getOptionNames().size());
		args.getOptionNames().forEach(name -> log.info("{} = {}",name, args.getOptionValues(name)));
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationRunnerApplication.class, args);
	}
}

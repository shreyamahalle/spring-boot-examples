package com.shreya.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootCommandlineRunnerApplication implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(SpringBootCommandlineRunnerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCommandlineRunnerApplication.class, args);
	}

	public void run(String...args){
		log.info("total NonOptionArgs {}",args.length);
		Arrays.stream(args).forEach(name -> log.info("{} = {}", name,args));
	}
}

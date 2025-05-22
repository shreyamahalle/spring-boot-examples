package com.shreya.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // 1. Enables Spring’s scheduled task execution capability
public class ECommerceSchedulerServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ECommerceSchedulerServiceApplication.class, args); // 2. Start Spring Boot app
	}
}


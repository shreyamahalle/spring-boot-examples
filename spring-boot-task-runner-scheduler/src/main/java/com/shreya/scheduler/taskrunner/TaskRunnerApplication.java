package com.shreya.scheduler.taskrunner;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TaskRunnerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskRunnerApplication.class, args);
    }
}

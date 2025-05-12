package com.shreya.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    // This method will run every 5 seconds
    @Scheduled(fixedRate = 5000)
    public void performFixedRateTask() {
        System.out.println("Fixed Rate Task: " + System.currentTimeMillis());
    }

    // This method will run every minute
    @Scheduled(cron = "0 * * * * *")  // Runs every minute
    public void performCronTask() {
        System.out.println("Cron Task: " + System.currentTimeMillis());
    }

    // This method will run after an initial delay of 10 seconds and then every 15 seconds
    @Scheduled(initialDelay = 10000, fixedRate = 15000)
    public void performInitialDelayTask() {
        System.out.println("Task with Initial Delay: " + System.currentTimeMillis());
    }
}

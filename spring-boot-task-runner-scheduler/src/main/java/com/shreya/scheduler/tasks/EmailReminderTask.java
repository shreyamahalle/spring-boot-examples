package com.shreya.scheduler.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class EmailReminderTask {

    // Runs every 10 seconds
    @Scheduled(fixedRate = 10000)
    public void sendEmailReminder() {
        System.out.println("Sending email reminder at " + LocalTime.now());
    }
}

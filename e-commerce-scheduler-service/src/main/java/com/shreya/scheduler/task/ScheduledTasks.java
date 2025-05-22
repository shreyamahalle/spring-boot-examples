package com.shreya.scheduler.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
class ScheduledTasks {

    // 3. Runs every day at 9:00 AM (server time)
    @Scheduled(cron = "0 0 9 * * ?")
    public void sendDailyPromotionEmail() {
        System.out.println("Sending promotional emails... " + LocalDateTime.now());
        // In real app: call email service to send emails
    }

    // 4. Runs every hour at minute 0
    @Scheduled(cron = "0 0 * * * ?")
    public void cleanExpiredSessions() {
        System.out.println("Cleaning expired sessions... " + LocalDateTime.now());
        // In real app: remove expired sessions from database/cache
    }

    // 5. Runs every 10 seconds (fixed rate)
    @Scheduled(fixedRate = 10000)
    public void logSystemHealth() {
        System.out.println("System healthy check at " + LocalDateTime.now());
        // In real app: monitor system metrics, send alerts if needed
    }
}

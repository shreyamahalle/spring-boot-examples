# ECommerceSchedulerService

A Spring Boot-based service demonstrating the use of **schedulers** to automate daily tasks such as sending promotional emails, cleaning expired sessions, and logging system health.

---

## 📌 Features

- ⏰ **Scheduled Email Campaigns** – Runs every day at 9:00 AM
- 🧹 **Session Cleanup Task** – Cleans expired sessions every hour
- 📊 **System Health Logging** – Logs system status every 10 seconds

---

## 🚀 Technologies Used

- Java 21
- Spring Boot
- Spring Scheduling (`@Scheduled`)
- Maven

---

## 🧩 Dependencies

Add the following to your `pom.xml`:

```xml
<dependencies>
    <!-- Spring Boot Starter -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter</artifactId>
    </dependency>

    <!-- Scheduler (part of starter-task) -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-task</artifactId>
    </dependency>
</dependencies>
```
## Project Structure
```
ECommerceSchedulerService
├── src
│   └── main
│       ├── java
│       │   └── com.shreya.scheduler
│       │       ├── Task
|       |       |----- ECommerceSchedulerServiceApplication.java
│       │       └── ScheduledTasks.java
│       └── resources
│           └── application.properties
└── pom.xml
```
## Scheduler Details
| Method Name                 | Schedule                        | Purpose                        |
| --------------------------- | ------------------------------- | ------------------------------ |
| `sendDailyPromotionEmail()` | Every day at 9 AM (`cron`)      | Send marketing or promo emails |
| `cleanExpiredSessions()`    | Every hour at minute 0 (`cron`) | Remove expired user sessions   |
| `logSystemHealth()`         | Every 10 seconds (`fixedRate`)  | Log system health metrics      |

## How It Works

- The application uses Spring's @EnableScheduling to activate scheduler capabilities.

- @Scheduled methods are picked up and executed automatically.

- Logs are printed on the console (can be extended to files or monitoring tools).

## To Run the Project
Step 1: Clone this repo
```properties
git clone https://github.com/your-username/ECommerceSchedulerService.git
cd ECommerceSchedulerService
```
# Step 2: Run using Maven
```properties
mvn spring-boot:run
```
##  Real-World Use Cases
- Automatically notify users of new deals every day.

- Clear inactive sessions to free up resources.

- Monitor app performance in real-time for alerts.


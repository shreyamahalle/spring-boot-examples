# Task Runner Scheduler

This is a Spring Boot application that schedules a task to run at regular intervals. In this example, we simulate sending email reminders by printing messages with the current time to the console every 10 seconds.

## Prerequisites

Before running this application, ensure you have the following installed:

- [Java 21](https://adoptium.net/)
- [Maven 3.8+](https://maven.apache.org/)
- [Spring Boot 3.x](https://spring.io/projects/spring-boot) dependencies

## Getting Started

### Clone the Repository

First, clone this repository to your local machine:

```bash
git clone <git@github.com:shreyamahalle/spring-boot-examples.git>
````

```bash
mvn clean install
```
````bash
mvn spring-boot:run
````
````
src/
├── main/
│    ├── java/
│    │    ├── com/
│    │    │    ├── shreya/
│    │    │    │    ├── scheduler/
│    │    │    │    │    ├── TaskRunnerApplication.java
│    │    │    │    │    └── tasks/
│    │    │    │    │        └── EmailReminderTask.java
│    ├── resources/
│    │    └── application.properties
├── pom.xml
````

Shreya Mahalle 

[GitHub](https://github.com/shreyamahalle) | [LinkedIn](https://linkedin.com/in/shreyamahalle)


# 📊 Spring Boot Actuator Integration

This module integrates **Spring Boot Actuator** to monitor and manage the application via production-ready endpoints, including health checks, metrics, environment info, beans, and more.

---

## ✅ Features Enabled

- Health checks
- Metrics (memory, threads, GC, etc.)
- Environment properties
- Beans info
- Request mappings
- Custom `/info` endpoint
- Custom health details
- Shutdown endpoint (optional)

---

## ⚙️ Dependencies

Make sure to include the Actuator dependency in `pom.xml`:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

## `Configuration - application.properties`
````properties
# Expose all actuator endpoints
management.endpoints.web.exposure.include=*

# Show detailed health info
management.endpoint.health.show-details=always

# Enable info contributors
management.info.env.enabled=true
management.info.build.enabled=true
management.info.java.enabled=true
management.info.os.enabled=true

# Optional shutdown endpoint
management.endpoint.shutdown.enabled=true

# Optional: custom base path
# management.endpoints.web.base-path=/actuator
````
## Then run:
````
mvn clean install
````
## Common Actuator Endpoints

| Endpoint                   | Description                         |
| -------------------------- | ----------------------------------- |
| `/actuator`                | Lists all available endpoints       |
| `/actuator/health`         | Application health status           |
| `/actuator/info`           | Custom and build info               |
| `/actuator/metrics`        | Application metrics                 |
| `/actuator/beans`          | All Spring beans                    |
| `/actuator/env`            | Environment variables               |
| `/actuator/mappings`       | Request mappings                    |
| `/actuator/scheduledtasks` | Scheduled task information          |
| `/actuator/shutdown`       | Shut down the app (only if enabled) |

## Access in Browser (Localhost)
After starting the app, open:

````
http://localhost:8080/actuator
http://localhost:8080/actuator/health
http://localhost:8080/actuator/info
````
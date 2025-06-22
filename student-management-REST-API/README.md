# 📚 Student Management REST API

A simple Spring Boot RESTful API for managing students, built using Spring Data JPA, MySQL, and Spring Boot.

---

## 🚀 Tech Stack

- Java 21
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- MySQL 8+
- Lombok
- Maven

---

## 📁 Project Structure
```
com.example.studentapi
│
├── controller
│   └── StudentController.java
│
├── model
│   └── Student.java
│
├── repository
│   └── StudentRepository.java
│
├── service
│   ├── StudentService.java
│   └── impl
│       └── StudentServiceImpl.java
│
├── exception
│   └── ResourceNotFoundException.java
│
├── StudentApiApplication.java
```

---

## ⚙️ Configuration

### `application.properties`

```properties
spring.application.name=student-management-REST-API

spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

spring.profiles.active=dev
```
🧾 API Endpoints
````
| Method | Endpoint             | Description          |
| ------ | -------------------- | -------------------- |
| GET    | `/api/students`      | Get all students     |
| GET    | `/api/students/{id}` | Get student by ID    |
| POST   | `/api/students`      | Create a new student |
| PUT    | `/api/students/{id}` | Update student by ID |
| DELETE | `/api/students/{id}` | Delete student by ID |
````
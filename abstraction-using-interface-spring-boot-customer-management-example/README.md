Full Project Structure with Abstraction using Interface (Spring Boot Customer Management Example)

# Spring Boot Customer Management Project (Using Abstraction - Interface)

## ✅ Project Overview

This project demonstrates **Java Abstraction** using **Interfaces** in a real-world **Spring Boot REST API**.  
It follows a **layered architecture (Controller → Service Interface → Service Implementation → Repository → Database)**.

The main focus is on how **Service Layer Abstraction** works using **Java Interface + Implementation**.

---

## ✅ Technologies Used

- Java 21
- Spring Boot 3.x
- Spring Data JPA
- MySQL Database
- Maven
- Lombok

---

## ✅ Project Structure

````bash
src/main/java
└── com
    └── example
        ├── controller
        │     └── CustomerController.java
        ├── model
        │     └── Customer.java
        ├── repository
        │     └── CustomerRepository.java
        ├── service
        │     └── CustomerService.java
        ├── service
        │    └── impl
        │          └── CustomerServiceImpl.java
        └── SpringBootCustomerManagementApplication.java
````

---

## ✅ application.properties (MySQL Configuration)

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
server.port=8080
```

✅ Example JSON Body for POST
````
{
    "name": "John Doe",
    "email": "john.doe@gmail.com"
}
````

✅ How Abstraction is Applied Here?
````
| Layer                 | Responsibility                                                          |
| --------------------- | ----------------------------------------------------------------------- |
| `CustomerService`     | Interface = Abstraction Layer                                           |
| `CustomerServiceImpl` | Concrete implementation                                                 |
| `CustomerController`  | Works with Service interface only (doesn't know implementation details) |
| `CustomerRepository`  | Database interaction                                                    |
````

✅ Run the Project

````
mvn clean install
mvn spring-boot:run
````

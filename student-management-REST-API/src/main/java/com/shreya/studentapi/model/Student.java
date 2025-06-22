package com.shreya.studentapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Primary key auto-increment
    private Long id;

    private String name;
    private String email;
    private String course;

    // Getters and Setters
}

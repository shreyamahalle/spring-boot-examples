package com.shreya.spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "library")
public class Library {

    private int id;
    private String address;
    private String name;
}

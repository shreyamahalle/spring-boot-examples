package com.shreya.spring.exceptions;

public class TrainingExceptionController extends RuntimeException {
    public TrainingExceptionController(String message) {
        super(message);
    }
}

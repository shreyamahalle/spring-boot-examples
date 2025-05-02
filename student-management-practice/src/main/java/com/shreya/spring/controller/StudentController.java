package com.shreya.spring.controller;
import com.shreya.spring.model.Student;
import com.shreya.spring.model.StudentUpdate;
import com.shreya.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/studentManagement")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student) {
        System.out.println("Inside controller: " + student);
        return service.createStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public Student createStudent(@PathVariable("id") int studentId) {
        System.out.println("Inside controller: " + studentId);
        return service.deleteStudent(studentId);
    }

    @GetMapping("/student/{id}")
    public Student retrieveStudent(@PathVariable("id") int studentId) {
        System.out.println("Inside controller: " + studentId);
        return service.retrieveStudent(studentId);
    }

    @GetMapping("/student")
    public List<Student> retrieveStudentByName(@RequestParam("name") String name) {
        System.out.println("Inside controller: " + name);
        return service.retrieveStudent(name);
    }

    @GetMapping("/students")
    public List<Student> retrieveStudent() {
        return service.retrieveStudents().values().parallelStream().toList();
    }

    @PatchMapping("/student/{id}")
    public Student updatePartialStudent(@PathVariable("id") int studentId, @RequestBody StudentUpdate student) {
        return service.updatePartialStudent(studentId, student);
    }

    @PutMapping("/student/{id}")
    public Student updateStudent(@PathVariable("id") int studentId, @RequestBody StudentUpdate student) {
        return service.updateFullStudent(studentId, student);
    }
}
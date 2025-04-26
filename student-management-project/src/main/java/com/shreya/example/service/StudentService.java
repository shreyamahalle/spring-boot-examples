package com.shreya.example.service;

import com.shreya.example.model.Student;
import com.shreya.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public boolean deleteStudent(Long id) {
        return studentRepository.deleteStudent(id);
    }
}

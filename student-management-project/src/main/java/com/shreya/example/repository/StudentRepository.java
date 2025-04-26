package com.shreya.example.repository;

import com.shreya.example.model.Student;
import com.shreya.example.service.ConnectionService;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    public void addStudent(Student student) {
        Connection connection = ConnectionService.getConnection();
        if (connection == null) {
            throw new RuntimeException("Database connection failed.");
        }
        try {
            String sql = "INSERT INTO student (id, name, email, course) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, student.id());
            statement.setString(2, student.name());
            statement.setString(3, student.email());
            statement.setString(4, student.course());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error saving student", e);
        }
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try (Connection connection = ConnectionService.getConnection()) {
            String sql = "SELECT * FROM student";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                students.add(new Student(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("course")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error fetching students", e);
        }
        return students;
    }

    public boolean deleteStudent(Long id) {
        try (Connection connection = ConnectionService.getConnection()) {
            String sql = "DELETE FROM student WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException("Error deleting student", e);
        }
    }
}

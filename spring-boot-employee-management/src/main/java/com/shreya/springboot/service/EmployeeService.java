package com.shreya.springboot.service;

import com.shreya.springboot.model.Employee;
import com.shreya.springboot.repository.EmployeeRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long empId) {
        return employeeRepository.findById(empId).orElse(null);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long id, Employee updateEmployee) {
         Employee existing = employeeRepository.findById(id).orElse(null);
        if (existing != null){
            existing.setEmpName(updateEmployee.getEmpName());
            existing.setAddress(updateEmployee.getAddress());
            return employeeRepository.save(existing);
        }
        return null;
    }
    public void deleteEmployee(Long empId){
        employeeRepository.deleteById(empId);
    }
}
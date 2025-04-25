package com.shreya.springboot.controller;

import com.shreya.springboot.model.Employee;
import com.shreya.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long empId){
        return employeeService.getEmployeeById(empId);
    }
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long empId){
         employeeService.deleteEmployee(empId);
    }
}

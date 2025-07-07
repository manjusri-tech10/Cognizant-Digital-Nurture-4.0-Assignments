package com.cognizant.controller;

import com.cognizant.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "*") // Allow Angular to access
public class EmployeeController {

    @Autowired
    private ApplicationContext context;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return (List<Employee>) context.getBean("employeeList");
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        List<Employee> employees = (List<Employee>) context.getBean("employeeList");
        return employees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }
}

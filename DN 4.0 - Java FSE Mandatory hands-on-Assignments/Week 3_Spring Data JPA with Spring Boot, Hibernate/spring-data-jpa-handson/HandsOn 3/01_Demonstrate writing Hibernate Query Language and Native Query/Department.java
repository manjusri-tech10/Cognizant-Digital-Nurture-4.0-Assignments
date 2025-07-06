package com.example.ormlearn.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Department {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Employee> employeeList;
    
    // getters, setters
}

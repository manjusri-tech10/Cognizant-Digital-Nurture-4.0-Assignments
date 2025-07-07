package com.cognizant.service;

import com.cognizant.dao.DepartmentDao;
import com.cognizant.model.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentDao departmentDao = new DepartmentDao();

    public List<Department> getAllDepartments() {
        return departmentDao.getAllDepartments();
    }
}

package com.database.incalss.service;

import com.database.incalss.models.Department;
import com.database.incalss.repository.IDepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    IDepartmentRepo repository;

    public List<Department> getAllDepartment() {
        List<Department> departments = this.repository.findAll();
        if(departments.size() > 0) {
            return departments;
        } else {
            return new ArrayList<Department>();
        }
    }

    
}

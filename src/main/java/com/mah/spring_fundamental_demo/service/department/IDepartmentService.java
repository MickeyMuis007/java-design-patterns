package com.mah.spring_fundamental_demo.service.department;

import com.mah.spring_fundamental_demo.model.department.Department;

import java.util.List;

public interface IDepartmentService {
    List<Department> findAll();
}

package com.mah.spring_fundamental_demo.repository.department;

import com.mah.spring_fundamental_demo.model.department.Department;

import java.util.List;

public interface IDepartmentRepository {
    List<Department> findAll();
}

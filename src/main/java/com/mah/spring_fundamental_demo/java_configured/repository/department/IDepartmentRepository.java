package com.mah.spring_fundamental_demo.java_configured.repository.department;

import com.mah.spring_fundamental_demo.java_configured.model.department.Department;

import java.util.List;

public interface IDepartmentRepository {
    List<Department> findAll();
}

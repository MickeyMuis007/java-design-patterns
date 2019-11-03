package com.mah.spring_fundamental_demo.repository.department.Impl;

import com.mah.spring_fundamental_demo.model.department.Department;
import com.mah.spring_fundamental_demo.model.department.DepartmentBuilder;
import com.mah.spring_fundamental_demo.repository.department.IDepartmentRepository;

import java.util.ArrayList;
import java.util.List;

public class HibernateDepartmentRepositoryImpl implements IDepartmentRepository {
    public List<Department> findAll() {
        List<Department> departments = new ArrayList<>();

        DepartmentBuilder departmentBuilder = new DepartmentBuilder();
        Department department = departmentBuilder.name("IT").type("Jnr").build();

        departments.add(department);

        return departments;
    }
}

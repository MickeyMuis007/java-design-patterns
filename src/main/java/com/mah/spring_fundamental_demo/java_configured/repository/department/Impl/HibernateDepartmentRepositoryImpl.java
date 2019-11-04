package com.mah.spring_fundamental_demo.java_configured.repository.department.Impl;

import com.mah.spring_fundamental_demo.java_configured.model.department.Department;
import com.mah.spring_fundamental_demo.java_configured.model.department.DepartmentBuilder;
import com.mah.spring_fundamental_demo.java_configured.repository.department.IDepartmentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("departmentRepository")
public class HibernateDepartmentRepositoryImpl implements IDepartmentRepository {
    public List<Department> findAll() {
        List<Department> departments = new ArrayList<>();

        DepartmentBuilder departmentBuilder = new DepartmentBuilder();
        Department department = departmentBuilder.name("IT").type("Jnr").build();

        departments.add(department);

        return departments;
    }
}

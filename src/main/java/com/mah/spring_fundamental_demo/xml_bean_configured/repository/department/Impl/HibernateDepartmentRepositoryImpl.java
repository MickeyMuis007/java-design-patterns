package com.mah.spring_fundamental_demo.xml_bean_configured.repository.department.Impl;

import com.mah.spring_fundamental_demo.xml_bean_configured.model.department.Department;
import com.mah.spring_fundamental_demo.xml_bean_configured.model.department.DepartmentBuilder;
import com.mah.spring_fundamental_demo.xml_bean_configured.repository.department.IDepartmentRepository;

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

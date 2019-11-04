package com.mah.spring_fundamental_demo.xml_bean_configured.repository.department;

import com.mah.spring_fundamental_demo.xml_bean_configured.model.department.Department;

import java.util.List;

public interface IDepartmentRepository {
    List<Department> findAll();
}

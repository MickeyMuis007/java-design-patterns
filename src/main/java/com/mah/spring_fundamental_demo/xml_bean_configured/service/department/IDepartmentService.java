package com.mah.spring_fundamental_demo.xml_bean_configured.service.department;

import com.mah.spring_fundamental_demo.xml_bean_configured.model.department.Department;

import java.util.List;

public interface IDepartmentService {
    List<Department> findAll();
}

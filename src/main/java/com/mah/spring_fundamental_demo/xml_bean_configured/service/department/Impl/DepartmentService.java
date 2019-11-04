package com.mah.spring_fundamental_demo.xml_bean_configured.service.department.Impl;

import com.mah.spring_fundamental_demo.xml_bean_configured.model.department.Department;
import com.mah.spring_fundamental_demo.xml_bean_configured.repository.department.IDepartmentRepository;
import com.mah.spring_fundamental_demo.xml_bean_configured.service.department.IDepartmentService;

import java.util.List;

public class DepartmentService implements IDepartmentService {
    private IDepartmentRepository departmentRepository;

    public DepartmentService() {

    }

    public DepartmentService(IDepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> findAll() {
        return this.departmentRepository.findAll();
    }
}

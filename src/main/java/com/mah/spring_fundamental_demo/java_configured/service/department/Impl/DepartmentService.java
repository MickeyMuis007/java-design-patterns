package com.mah.spring_fundamental_demo.java_configured.service.department.Impl;

import com.mah.spring_fundamental_demo.java_configured.model.department.Department;
import com.mah.spring_fundamental_demo.java_configured.repository.department.IDepartmentRepository;
import com.mah.spring_fundamental_demo.java_configured.service.department.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("departmentService")
public class DepartmentService implements IDepartmentService {
//    @Autowired
    private IDepartmentRepository departmentRepository;

    public DepartmentService() {

    }

    @Autowired
    public DepartmentService(IDepartmentRepository departmentRepository) {
        System.out.println("[DepartmentService] We are using constructor injection");
        this.departmentRepository = departmentRepository;
    }

    public List<Department> findAll() {
        return this.departmentRepository.findAll();
    }
}

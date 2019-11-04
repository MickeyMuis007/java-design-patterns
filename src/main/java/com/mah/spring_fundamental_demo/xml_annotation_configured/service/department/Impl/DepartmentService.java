package com.mah.spring_fundamental_demo.xml_annotation_configured.service.department.Impl;

import com.mah.spring_fundamental_demo.xml_annotation_configured.model.department.Department;
import com.mah.spring_fundamental_demo.xml_annotation_configured.repository.department.IDepartmentRepository;
import com.mah.spring_fundamental_demo.xml_annotation_configured.service.department.IDepartmentService;
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
        System.out.println("We are using constructor injection Department Repository");
        this.departmentRepository = departmentRepository;
    }

    public List<Department> findAll() {
        return this.departmentRepository.findAll();
    }
}

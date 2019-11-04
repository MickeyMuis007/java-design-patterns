package com.mah.spring_fundamental_demo.xml_annotation_configured.model.department;

public class DepartmentBuilder {
    String name;
    String type;

    public DepartmentBuilder() {
        name = "";
        type = "";
    }

    public DepartmentBuilder name(String name) {
        this.name = name;
        return this;
    }

    public DepartmentBuilder type(String type) {
        this.type = type;
        return this;
    }

    public DepartmentBuilder copy(Department department) {
        name = department.name;
        type = department.type;
        return this;
    }

    public Department build() {
        return new Department(this);
    }
}

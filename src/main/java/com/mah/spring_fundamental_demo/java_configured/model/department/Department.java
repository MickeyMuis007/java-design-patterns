package com.mah.spring_fundamental_demo.java_configured.model.department;

public class Department extends DepartmentBuilder {
    String name;
    String type;

    private Department() {}

    Department(DepartmentBuilder builder) {
        name = builder.name;
        type = builder.type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}

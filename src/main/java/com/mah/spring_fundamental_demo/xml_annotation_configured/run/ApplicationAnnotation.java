package com.mah.spring_fundamental_demo.xml_annotation_configured.run;

import com.mah.spring_fundamental_demo.xml_annotation_configured.service.customer.ICustomerService;
import com.mah.spring_fundamental_demo.xml_annotation_configured.service.department.IDepartmentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationAnnotation {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationAnnotationContext.xml");

        ICustomerService customerService = appContext.getBean("customerService", ICustomerService.class);
        IDepartmentService departmentService = appContext.getBean("departmentService", IDepartmentService.class);

        System.out.println(customerService.findAll().get(0).getFirstname());
        System.out.println(departmentService.findAll().get(0).getName());
    }
}

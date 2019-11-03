package com.mah.spring_fundamental_demo.run;

import com.mah.spring_fundamental_demo.service.customer.ICustomerService;
import com.mah.spring_fundamental_demo.service.customer.Impl.CustomerServiceImpl;

import com.mah.spring_fundamental_demo.service.department.IDepartmentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
//        ICustomerService customerService = new CustomerServiceImpl();


        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        ICustomerService customerService = appContext.getBean("customerService", ICustomerService.class);
        IDepartmentService departmentService = appContext.getBean("departmentService", IDepartmentService.class);

        System.out.println(customerService.findAll().get(0).getFirstname());
        System.out.println(departmentService.findAll().get(0).getName());
    }
}

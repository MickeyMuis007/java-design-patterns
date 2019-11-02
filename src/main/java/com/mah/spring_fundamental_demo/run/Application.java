package com.mah.spring_fundamental_demo.run;

import com.mah.spring_fundamental_demo.service.customer.ICustomerService;
import com.mah.spring_fundamental_demo.service.customer.Impl.CustomerServiceImpl;

public class Application {
    public static void main(String[] args) {
        ICustomerService customerService = new CustomerServiceImpl();

        System.out.println(customerService.findAll().get(0).getFirstname());
    }
}

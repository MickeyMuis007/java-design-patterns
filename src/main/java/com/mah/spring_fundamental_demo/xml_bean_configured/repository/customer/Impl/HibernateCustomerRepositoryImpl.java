package com.mah.spring_fundamental_demo.xml_bean_configured.repository.customer.Impl;

import com.mah.spring_fundamental_demo.xml_bean_configured.model.customer.Customer;
import com.mah.spring_fundamental_demo.xml_bean_configured.model.customer.CustomerBuilder;
import com.mah.spring_fundamental_demo.xml_bean_configured.repository.customer.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements ICustomerRepository {
    private String dbUsername;

    public List<Customer> findAll() {
        System.out.println("[HibernateCustomerRepositoryImpl] dbUsername: " + dbUsername);
        List<Customer> customers = new ArrayList<>();

        CustomerBuilder customerBuilder = new CustomerBuilder();
        Customer customer = customerBuilder.firstname("Mike").lastname("H").build();

        customers.add(customer);

        return customers;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }
}

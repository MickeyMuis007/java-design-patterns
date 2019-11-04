package com.mah.spring_fundamental_demo.xml_annotation_configured.repository.customer.Impl;

import com.mah.spring_fundamental_demo.xml_annotation_configured.model.customer.Customer;
import com.mah.spring_fundamental_demo.xml_annotation_configured.model.customer.CustomerBuilder;
import com.mah.spring_fundamental_demo.xml_annotation_configured.repository.customer.ICustomerRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements ICustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;

    public List<Customer> findAll() {
        System.out.println("[HibernateCustomerRepository] dbUsername: " + dbUsername);
        List<Customer> customers = new ArrayList<>();

        CustomerBuilder customerBuilder = new CustomerBuilder();
        Customer customer = customerBuilder.firstname("Mike").lastname("H").build();

        customers.add(customer);

        return customers;
    }
}

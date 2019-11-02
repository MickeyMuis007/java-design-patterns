package com.mah.spring_fundamental_demo.repository.customer.Impl;

import com.mah.spring_fundamental_demo.model.customer.Customer;
import com.mah.spring_fundamental_demo.model.customer.CustomerBuilder;
import com.mah.spring_fundamental_demo.repository.customer.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements ICustomerRepository {
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        CustomerBuilder customerBuilder = new CustomerBuilder();
        Customer customer = customerBuilder.firstname("Mike").lastname("H").build();

        customers.add(customer);

        return customers;
    }
}

package com.mah.spring_fundamental_demo.java_configured.repository.customer;

import com.mah.spring_fundamental_demo.java_configured.model.customer.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
}

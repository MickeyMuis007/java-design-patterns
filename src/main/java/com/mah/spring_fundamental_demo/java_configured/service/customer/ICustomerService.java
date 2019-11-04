package com.mah.spring_fundamental_demo.java_configured.service.customer;

import com.mah.spring_fundamental_demo.java_configured.model.customer.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}

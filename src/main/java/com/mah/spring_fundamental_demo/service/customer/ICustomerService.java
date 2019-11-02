package com.mah.spring_fundamental_demo.service.customer;

import com.mah.spring_fundamental_demo.model.customer.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}

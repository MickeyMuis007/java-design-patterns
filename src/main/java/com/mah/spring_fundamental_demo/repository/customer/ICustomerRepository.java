package com.mah.spring_fundamental_demo.repository.customer;

import com.mah.spring_fundamental_demo.model.customer.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
}

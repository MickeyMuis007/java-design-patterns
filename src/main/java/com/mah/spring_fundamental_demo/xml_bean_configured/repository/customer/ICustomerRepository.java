package com.mah.spring_fundamental_demo.xml_bean_configured.repository.customer;

import com.mah.spring_fundamental_demo.xml_bean_configured.model.customer.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
}

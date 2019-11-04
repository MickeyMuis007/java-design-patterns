package com.mah.spring_fundamental_demo.xml_bean_configured.service.customer;

import com.mah.spring_fundamental_demo.xml_bean_configured.model.customer.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}

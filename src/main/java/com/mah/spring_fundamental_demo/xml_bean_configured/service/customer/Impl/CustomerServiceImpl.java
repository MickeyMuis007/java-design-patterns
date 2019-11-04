package com.mah.spring_fundamental_demo.xml_bean_configured.service.customer.Impl;

import com.mah.spring_fundamental_demo.xml_bean_configured.model.customer.Customer;
import com.mah.spring_fundamental_demo.xml_bean_configured.repository.customer.ICustomerRepository;
import com.mah.spring_fundamental_demo.xml_bean_configured.service.customer.ICustomerService;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public void setCustomerRepository(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

}

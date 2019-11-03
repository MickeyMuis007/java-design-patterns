package com.mah.spring_fundamental_demo.service.customer.Impl;

import com.mah.spring_fundamental_demo.model.customer.Customer;
import com.mah.spring_fundamental_demo.repository.customer.ICustomerRepository;
import com.mah.spring_fundamental_demo.service.customer.ICustomerService;

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

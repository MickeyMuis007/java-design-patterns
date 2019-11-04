package com.mah.spring_fundamental_demo.xml_annotation_configured.service.customer.Impl;

import com.mah.spring_fundamental_demo.xml_annotation_configured.model.customer.Customer;
import com.mah.spring_fundamental_demo.xml_annotation_configured.repository.customer.ICustomerRepository;
import com.mah.spring_fundamental_demo.xml_annotation_configured.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {

//    @Autowired
    private ICustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Autowired
    public void setCustomerRepository(ICustomerRepository customerRepository) {
        System.out.println("We are using setter injection");
        this.customerRepository = customerRepository;
    }

}

package com.mah.spring_fundamental_demo.java_configured.run;

import com.mah.spring_fundamental_demo.java_configured.repository.customer.ICustomerRepository;
import com.mah.spring_fundamental_demo.java_configured.repository.customer.Impl.HibernateCustomerRepositoryImpl;
import com.mah.spring_fundamental_demo.java_configured.repository.department.IDepartmentRepository;
import com.mah.spring_fundamental_demo.java_configured.repository.department.Impl.HibernateDepartmentRepositoryImpl;
import com.mah.spring_fundamental_demo.java_configured.service.customer.ICustomerService;
import com.mah.spring_fundamental_demo.java_configured.service.customer.Impl.CustomerServiceImpl;
import com.mah.spring_fundamental_demo.java_configured.service.department.IDepartmentService;
import com.mah.spring_fundamental_demo.java_configured.service.department.Impl.DepartmentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.mah.spring_fundamental_demo.java_configured"})
public class AppConfig {
//    @Bean(name="customerService")
//    public ICustomerService getCustomerService() {
//        CustomerServiceImpl service = new CustomerServiceImpl();
////        service.setCustomerRepository(getCustomerRepository());
//
//        return service;
//    }
//
//    @Bean(name="customerRepository")
//    public ICustomerRepository getCustomerRepository() {
//        return new HibernateCustomerRepositoryImpl();
//    }
//
//    @Bean(name="departmentService")
//    public IDepartmentService getDepartmentService() {
////        IDepartmentService service = new DepartmentService(getDepartmentRepository());
//        IDepartmentService service = new DepartmentService();
//        return service;
//    }

//    @Bean(name="departmentRepository")
//    public IDepartmentRepository getDepartmentRepository() {
//        return new HibernateDepartmentRepositoryImpl();
//    }
}

package com.mah.spring_fundamental_demo.model.customer;

public class CustomerBuilder {
    String firstname;
    String lastname;

    public CustomerBuilder() {
        firstname = "";
        lastname = "";
    }

    public CustomerBuilder firstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public CustomerBuilder lastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public CustomerBuilder copy(Customer customer) {
        this.firstname = customer.firstname;
        this.lastname = customer.lastname;
        return this;
    }

    public Customer build() {
        return new Customer(this);
    }
}

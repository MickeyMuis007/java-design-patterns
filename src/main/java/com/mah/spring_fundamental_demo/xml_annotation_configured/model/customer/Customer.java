package com.mah.spring_fundamental_demo.xml_annotation_configured.model.customer;

public class Customer extends CustomerBuilder {
    String firstname;
    String lastname;

    private Customer () { }

    Customer(CustomerBuilder builder) {
        firstname = builder.firstname;
        lastname = builder.lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}

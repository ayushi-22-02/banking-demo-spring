package org.example.service;

import org.example.model.Customer;
import org.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


public class DefaultCustomerService implements CustomerService {

    public void setRepository(CustomerRepository repository) {
        this.repository = repository;
    }

    private CustomerRepository repository ;

    public DefaultCustomerService() {

    }

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

}
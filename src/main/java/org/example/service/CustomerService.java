package org.example.service;

import org.example.model.Customer;
import org.example.repository.CustomerRepositoryDB;

import java.util.List;

public class CustomerService {

    private CustomerRepositoryDB repository = new CustomerRepositoryDB();

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

}
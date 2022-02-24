package org.example.service;

import org.example.model.Customer;
import org.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("customerService")
public class DefaultCustomerService implements CustomerService {

    public void setCustomerRepository(CustomerRepository repository) {
        this.repository = repository;
    }
@Autowired
    private CustomerRepository repository ;

    public DefaultCustomerService() {

    }

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    @Override
    public Customer getCustomer(Long id) {
        Optional<Customer> customerbyId = repository.findById(id);
//    if(customerbyId.isPresent())
        return customerbyId.get();
//    else
//      return new Customer();
    }
    public void deleteCustomer(Long id)
    {
        repository.deleteById(id);
    }




}
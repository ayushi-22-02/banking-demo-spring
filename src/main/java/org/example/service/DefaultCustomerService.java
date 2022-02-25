package org.example.service;

import org.example.model.Customer;
import org.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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
    public ResponseEntity<Customer> getCustomer(Long id) {
        Optional<Customer> optionalCustomer= repository.findById(id);
   if(optionalCustomer.isPresent()) {
       return new ResponseEntity<Customer>(optionalCustomer.get(), HttpStatus.OK);
   }

     throw new ResponseStatusException(HttpStatus.NOT_FOUND,"customer doest not exists");
    }
    public void deleteCustomer(Long id){
        //before deleting, verify that customer is in DB.
        Optional<Customer> optionalCustomer=repository.findById(id);
        if(optionalCustomer.isPresent()) {
            repository.deleteById(id);
//            return new ResponseEntity<>(optionalCustomer.get(),HttpStatus.OK);
            throw new ResponseStatusException(HttpStatus.OK,"customer succesfully deleted");
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND,"customer id can't be deleted");

    }




}
package org.example.app;

import org.example.model.Customer;
import org.example.repository.CustomerRepositoryDB;
import org.example.repository.CustomerRepositoryStub;
import org.example.service.CustomerService;
import org.example.service.DefaultCustomerService;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        CustomerRepositoryStub stubRepository =new CustomerRepositoryStub();
        CustomerRepositoryDB dbRepository =new CustomerRepositoryDB();


        CustomerService service = new DefaultCustomerService(stubRepository);

        List<Customer> customers = service.getAllCustomers();

        customers.forEach(System.out::println);

    }
}
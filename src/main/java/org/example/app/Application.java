package org.example.app;

import org.example.model.Customer;
import org.example.service.CustomerService;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        CustomerService service = new CustomerService();

        List<Customer> customers = service.getAllCustomers();

        customers.forEach(System.out::println);

    }
}
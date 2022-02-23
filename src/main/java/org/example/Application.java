
        package org.example;

import org.example.model.Customer;
import org.example.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
        @SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        CustomerService service = context.getBean("customerService", CustomerService.class);
//
//        List<Customer> customers = service.getAllCustomers();
//        customers.forEach(System.out::println);
    }

}






package com.icodeap.crud_fullstack_angular.controller;

import com.icodeap.crud_fullstack_angular.entity.Customer;
import com.icodeap.crud_fullstack_angular.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    private final CustomerService customerService;
    CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    //localhost:8080
    @PostMapping("/create")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
    //localhost:8080
    @GetMapping
    public List<Customer> findAll(){
        return customerService.findAll();
    }

}

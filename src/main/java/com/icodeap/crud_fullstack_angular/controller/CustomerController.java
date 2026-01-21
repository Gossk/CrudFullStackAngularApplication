package com.icodeap.crud_fullstack_angular.controller;

import com.icodeap.crud_fullstack_angular.entity.Customer;
import com.icodeap.crud_fullstack_angular.service.CustomerService;
import org.springframework.web.bind.annotation.*;

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
    //localhost:8080
    @GetMapping("/{id}")
    public Customer findById(@PathVariable Integer id){
        return customerService.findById(id);
    }
    //localhost:8080
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        customerService.deleteById(id);
    }

}

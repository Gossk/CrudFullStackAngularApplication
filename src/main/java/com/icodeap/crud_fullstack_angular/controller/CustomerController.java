package com.icodeap.crud_fullstack_angular.controller;

import com.icodeap.crud_fullstack_angular.entity.Customer;
import com.icodeap.crud_fullstack_angular.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//http://localhost:8080/api/customers
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customerService;
    CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    //http://localhost:8080/api/customers
    //localhost:8080
    @PostMapping
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
    //http://localhost:8080/api/customers
    //localhost:8080
    @GetMapping
    public List<Customer> findAll(){
        return customerService.findAll();
    }
    //http://localhost:8080/api/customers/1
    //localhost:8080
    @GetMapping("/{id}")
    public Customer findById(@PathVariable Integer id){
        return customerService.findById(id);
    }
    //http://localhost:8080/api/customers/1
    //localhost:8080
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        customerService.deleteById(id);
    }
    //http://localhost:8080/api/customers
    //localhost:8080
    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
        Customer customerDb = customerService.findById(customer.getId());
        customerDb.setFirstName(customer.getFirstName());
        customerDb.setLastName(customer.getLastName());
        customerDb.setEmail(customer.getEmail());
        return customerService.update(customerDb);
    }

}

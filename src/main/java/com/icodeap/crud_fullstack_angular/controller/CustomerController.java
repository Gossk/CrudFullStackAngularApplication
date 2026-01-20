package com.icodeap.crud_fullstack_angular.controller;

import com.icodeap.crud_fullstack_angular.service.CustomerService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private final CustomerService customerService;
    CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

}

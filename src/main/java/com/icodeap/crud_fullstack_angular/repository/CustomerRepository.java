package com.icodeap.crud_fullstack_angular.repository;

import com.icodeap.crud_fullstack_angular.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}


package com.allstate.smallclaims.service;

import com.allstate.smallclaims.domain.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    int countCustomers();
    Customer getCustomerById(Integer id);
    Customer save(Customer customer);
    Customer updateCustomer(Customer customer);
}

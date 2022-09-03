package com.allstate.smallclaims.service;

import com.allstate.smallclaims.data.CustomerRepository;
import com.allstate.smallclaims.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public int countCustomers() {
        return 0;
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return null;
    }

    @Override
    public Customer save(Customer customer) {

        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return null;
    }

}

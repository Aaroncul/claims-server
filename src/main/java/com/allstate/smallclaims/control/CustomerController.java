package com.allstate.smallclaims.control;

import com.allstate.smallclaims.domain.Customer;
import com.allstate.smallclaims.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/customer")
public class CustomerController {

    CustomerService customerService;

    @Autowired
    public void setPaymentsService(CustomerService paymentsService) {
        this.customerService = customerService;
    }

    @GetMapping()
    public List<Customer> getAll() {
        try
        {
            return customerService.getAllCustomers();
        }
        catch(Exception e)
        {
            return new ArrayList<Customer>();
        }
    }
}

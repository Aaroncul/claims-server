package com.allstate.smallclaims.service;

import com.allstate.smallclaims.data.CustomerRepository;
import com.allstate.smallclaims.data.UserRepository;
import com.allstate.smallclaims.domain.Customer;
import com.allstate.smallclaims.domain.User;
import com.allstate.smallclaims.domain.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BootstrapService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    UserManagementService userManagementService;
    @Autowired
    CustomerService customerService;

    @PostConstruct
    public void createInitialUsers () {
        if (userRepository.findAll().size() == 0) {
            User user1 = new User("user1", "thisisabadpasword","Aaron",UserRole.USER);
            User user2 = new User("user2", "thisisabadpasword", "Leah", UserRole.MANAGER);

            userManagementService.save(user1);
            userManagementService.save(user2);
        }
        if(customerRepository.findAll().size() == 0)
        {
            customerService.save(new Customer("Aaron"));
        }
    }
}

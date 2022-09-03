package com.allstate.smallclaims.data;

import com.allstate.smallclaims.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    public Optional<Customer> findById(Integer id);
    public Customer save(Customer customer);
}

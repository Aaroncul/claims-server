package com.allstate.smallclaims.service;

import com.allstate.smallclaims.domain.Claim;
import com.allstate.smallclaims.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface ClaimService {
    List<Claim> findClaimsByCustomer(Customer customer);
    Optional<Claim> findById(Integer id);
    Claim save(Claim claim);
}

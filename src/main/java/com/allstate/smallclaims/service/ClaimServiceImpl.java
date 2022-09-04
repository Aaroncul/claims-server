package com.allstate.smallclaims.service;

import com.allstate.smallclaims.data.ClaimRepository;
import com.allstate.smallclaims.domain.Claim;
import com.allstate.smallclaims.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClaimServiceImpl implements ClaimService{
    @Autowired
    private ClaimRepository claimRepository;

    @Override
    public List<Claim> findClaimsByCustomer(Customer customer) {
        return null;
    }

    @Override
    public Optional<Claim> findById(Integer id) {
        return claimRepository.findById(id);
    }

    public Claim save(Claim claim){
        return claimRepository.save(claim);
    }
}

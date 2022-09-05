package com.allstate.smallclaims.service;

import com.allstate.smallclaims.domain.Claim;
import com.allstate.smallclaims.domain.User;

import java.util.List;
import java.util.Optional;

public interface ClaimService {
    Optional<Claim> findById(Integer id);
    Claim save(Claim claim);
    List<Claim> findClaimsByUser(User user);
    List<Claim> findAll();
}

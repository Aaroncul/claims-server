package com.allstate.smallclaims.service;

import com.allstate.smallclaims.domain.Claim;
import com.allstate.smallclaims.domain.User;

import java.util.List;
import java.util.Map;

public interface ClaimService {
    Claim findById(Integer id);
    Claim save(Claim claim);
    List<Claim> findClaimsByUser(User user);
    List<Claim> findAll();
    Claim updateClaim(Integer id, Map<String, String> data);

    Integer countClaims();
}

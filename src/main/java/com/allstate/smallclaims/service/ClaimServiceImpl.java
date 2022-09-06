package com.allstate.smallclaims.service;

import com.allstate.smallclaims.domain.User;
import com.allstate.smallclaims.domain.data.ClaimRepository;
import com.allstate.smallclaims.domain.Claim;
import com.allstate.smallclaims.domain.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClaimServiceImpl implements ClaimService{
    @Autowired
    private ClaimRepository claimRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Claim> findClaimsByUser(User user) {
        return findClaimsByUser(user);
    }

    @Override
    public List<Claim> findAll() {
        return claimRepository.findAll();
    }

    @Override
    public Optional<Claim> findById(Integer id) {
        return claimRepository.findById(id);
    }

    public Claim save(Claim claim){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        auth.getPrincipal();

        claim.setUser(userRepository.findByUsername(auth.getName()));
        return claimRepository.save(claim);
    }
}

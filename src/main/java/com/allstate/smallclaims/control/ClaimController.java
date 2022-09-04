package com.allstate.smallclaims.control;

import com.allstate.smallclaims.domain.Claim;
import com.allstate.smallclaims.domain.Customer;
import com.allstate.smallclaims.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/claim")
public class ClaimController {

    ClaimService claimService;

    @Autowired
    public void setClaimService(ClaimService claimService) {
        this.claimService = claimService;
    }

    @GetMapping("findByCustomer")
    public List<Claim> findByCustomer(Customer customer) {
        try
        {
            return claimService.findClaimsByCustomer(customer);
        }
        catch(Exception e)
        {
            return new ArrayList<Claim>();
        }
    }

    @PostMapping
    public Claim addClaim(@RequestBody Claim claim)
    {
        return claimService.save(claim);
    }
}

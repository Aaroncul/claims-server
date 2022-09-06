package com.allstate.smallclaims.control;

import com.allstate.smallclaims.domain.Claim;
import com.allstate.smallclaims.domain.User;
import com.allstate.smallclaims.service.ClaimService;
import com.allstate.smallclaims.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/claim")
public class ClaimController {

    @Autowired
    ClaimService claimService;
    @Autowired
    UserManagementService userManagementService;

    @GetMapping("findByUser")
    public List<Claim> findByUser(User user) {
        try
        {
            return claimService.findClaimsByUser(user);
        }
        catch(Exception e)
        {
            return new ArrayList<Claim>();
        }
    }
    @GetMapping("findById")
    public Optional<Claim> findById(@RequestBody Integer id) {
        return claimService.findById(id);
    }
    @GetMapping()
    public List<Claim> findAll() {
/*        Optional<User> optional = userManagementService.findByUserName(username);

        if(optional.isPresent())
        {
            User user = optional.get();
            //Staff can see all claims. Customers can see only their own.
            return optional.get().getRole().equals("STAFF") ?
                    claimService.findAll() : claimService.findClaimsByUser(user);
        }

        return Collections.emptyList();*/
        return claimService.findAll();
    }
    @PostMapping
    public Claim addClaim(@RequestBody Claim claim)
    {
        return claimService.save(claim);
    }
}

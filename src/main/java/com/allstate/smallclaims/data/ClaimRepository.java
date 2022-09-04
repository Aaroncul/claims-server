package com.allstate.smallclaims.data;

import com.allstate.smallclaims.domain.Claim;
import com.allstate.smallclaims.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ClaimRepository extends JpaRepository<Claim,Integer> {
    public Optional<Claim> findById(Integer id);
    public Optional<Claim> findByCustomer(Customer customer);
    public Claim save(Claim claim);

}

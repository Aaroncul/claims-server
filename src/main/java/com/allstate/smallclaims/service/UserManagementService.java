package com.allstate.smallclaims.service;

import com.allstate.smallclaims.domain.Claim;
import com.allstate.smallclaims.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserManagementService {

    public void save(User user);
    public List<User> findAll();
    public Optional<User> findById(Integer id);
    public Optional<User> findByUserName(String username);
}
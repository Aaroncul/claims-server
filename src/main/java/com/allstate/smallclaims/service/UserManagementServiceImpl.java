package com.allstate.smallclaims.service;

import com.allstate.smallclaims.domain.data.UserRepository;
import com.allstate.smallclaims.domain.User;
import com.allstate.smallclaims.exceptions.ClaimNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserManagementServiceImpl implements UserManagementService {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        user.setPassword( bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }
}
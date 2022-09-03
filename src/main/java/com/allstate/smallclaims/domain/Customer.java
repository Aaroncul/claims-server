package com.allstate.smallclaims.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;

    @OneToMany
    List<Policy> policies;

    @OneToMany
    List<Claim> claims;

    public Customer(String name) {
        this.id = id;
        this.name = name;
    }

    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

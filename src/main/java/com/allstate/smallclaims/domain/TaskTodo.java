package com.allstate.smallclaims.domain;

import javax.persistence.*;

@Entity
public class TaskTodo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String description;
    boolean done;
    @ManyToOne
    Claim claim;

    public TaskTodo(String description, Claim claim, boolean done) {
        this.description = description;
        this.claim = claim;
    }

    public TaskTodo() {
    }

    public boolean getDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Claim getClaim() {
        return claim;
    }

    public void setClaim(Claim claim) {
        this.claim = claim;
    }
}

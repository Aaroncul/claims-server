package com.allstate.smallclaims.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.Year;

@Entity
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    Double estimatedValue;

    String reason;
    String incidentDescription;
    String furtherDetails;

    LocalDate dateOfIncident;
    LocalDate dateOfClaim;

    //property only
    String address;

    //motor only
    String make;
    String model;
    Year yearOfManufacture;

    //pet only
    String animal;
    String breed;

    public Claim(Integer id, Double estimatedValue, String reason, String incidentDescription, String furtherDetails, LocalDate dateOfIncident, LocalDate dateOfClaim, String address, String make, String model, Year yearOfManufacture, String animal, String breed) {
        this.id = id;
        this.estimatedValue = estimatedValue;
        this.reason = reason;
        this.incidentDescription = incidentDescription;
        this.furtherDetails = furtherDetails;
        this.dateOfIncident = dateOfIncident;
        this.dateOfClaim = dateOfClaim;
        this.address = address;
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.animal = animal;
        this.breed = breed;
    }

    public Claim() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(Double estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getIncidentDescription() {
        return incidentDescription;
    }

    public void setIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
    }

    public String getFurtherDetails() {
        return furtherDetails;
    }

    public void setFurtherDetails(String furtherDetails) {
        this.furtherDetails = furtherDetails;
    }

    public LocalDate getDateOfIncident() {
        return dateOfIncident;
    }

    public void setDateOfIncident(LocalDate dateOfIncident) {
        this.dateOfIncident = dateOfIncident;
    }

    public LocalDate getDateOfClaim() {
        return dateOfClaim;
    }

    public void setDateOfClaim(LocalDate dateOfClaim) {
        this.dateOfClaim = dateOfClaim;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Year getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(Year yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

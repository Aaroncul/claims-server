package com.allstate.smallclaims.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Year;

@Entity
public class Claim {

    @ManyToOne
    User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String firstName;
    String middleName;
    String lastName;
    String policyNumber;
    LocalDate claimDate;
    Double claimAmount;
    String claimReason;
    String incidentDescription;
    String petAnimal;
    String petbreed;
    String propertyAddress;
    String vehicleMake;
    String vehicleModel;
    Integer vehicleYear;

    public Claim() {
    }

    public Claim(String firstName, String middleName, String lastName, String policyNumber, LocalDate claimDate, Double claimAmount, String claimReason, String incidentDescription, String petAnimal, String petbreed, String propertyAddress, String vehicleMake, String vehicleModel, Integer vehicleYear) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.policyNumber = policyNumber;
        this.claimDate = claimDate;
        this.claimAmount = claimAmount;
        this.claimReason = claimReason;
        this.incidentDescription = incidentDescription;
        this.petAnimal = petAnimal;
        this.petbreed = petbreed;
        this.propertyAddress = propertyAddress;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleYear = vehicleYear;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public LocalDate getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(LocalDate claimDate) {
        this.claimDate = claimDate;
    }

    public Double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(Double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getClaimReason() {
        return claimReason;
    }

    public void setClaimReason(String claimReason) {
        this.claimReason = claimReason;
    }

    public String getIncidentDescription() {
        return incidentDescription;
    }

    public void setIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
    }

    public String getPetAnimal() {
        return petAnimal;
    }

    public void setPetAnimal(String petAnimal) {
        this.petAnimal = petAnimal;
    }

    public String getPetbreed() {
        return petbreed;
    }

    public void setPetbreed(String petbreed) {
        this.petbreed = petbreed;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public Integer getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(Integer vehicleYear) {
        this.vehicleYear = vehicleYear;
    }
}

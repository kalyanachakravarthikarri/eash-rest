package com.ea.rest.domain.com.ea.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by root on 21/3/15.
 */
@Entity
public class Medication {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private EashPHR eashPHR;

    private String medicineName;

    private String periodicity;//TODO use enum

    private int numberOfDays;

    private int quantity;

    private Date medicationEndDate;

    private boolean lifeLongUsage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getMedicationEndDate() {
        return medicationEndDate;
    }

    public void setMedicationEndDate(Date medicationEndDate) {
        this.medicationEndDate = medicationEndDate;
    }

    public boolean isLifeLongUsage() {
        return lifeLongUsage;
    }

    public void setLifeLongUsage(boolean lifeLongUsage) {
        this.lifeLongUsage = lifeLongUsage;
    }

    public EashPHR getEashPHR() {
        return eashPHR;
    }

    public void setEashPHR(EashPHR eashPHR) {
        this.eashPHR = eashPHR;
    }
}

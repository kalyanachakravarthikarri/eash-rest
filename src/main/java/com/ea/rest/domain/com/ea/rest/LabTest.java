package com.ea.rest.domain.com.ea.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by root on 21/3/15.
 */
@Entity
public class LabTest {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private EashPHR eashPHR;

    private String testName;

    private int lowerLimit;

    private int upperLimit;

    private int actualValues;

    private String diagnosisSummary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public int getActualValues() {
        return actualValues;
    }

    public void setActualValues(int actualValues) {
        this.actualValues = actualValues;
    }

    public String getDiagnosisSummary() {
        return diagnosisSummary;
    }

    public void setDiagnosisSummary(String diagnosisSummary) {
        this.diagnosisSummary = diagnosisSummary;
    }

    public EashPHR getEashPHR() {
        return eashPHR;
    }

    public void setEashPHR(EashPHR eashPHR) {
        this.eashPHR = eashPHR;
    }
}

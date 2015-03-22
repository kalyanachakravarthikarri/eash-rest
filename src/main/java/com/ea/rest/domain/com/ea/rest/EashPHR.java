package com.ea.rest.domain.com.ea.rest;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 16/3/15.
 */
@Entity
public class EashPHR {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private PersonalInfo personalInfo;

    @OneToOne
    private Diagnosis diagnosis;

    @OneToMany(mappedBy = "eashPHR")
    private List<Medication> medications;

    @OneToMany(mappedBy = "eashPHR")
    private List<LabTest> labTests;

    @OneToMany(mappedBy = "eashPHR")
    private List<Surgery> surgeries;

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public List<Medication> getMedications() {
        if(medications == null){
            medications = new ArrayList<Medication>();
        }
        return medications;
    }

    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }

    public List<LabTest> getLabTests() {
        if(labTests == null){
            labTests = new ArrayList<LabTest>();
        }
        return labTests;
    }

    public void setLabTests(List<LabTest> labTests) {
        this.labTests = labTests;
    }

    public List<Surgery> getSurgeries() {
        if(surgeries == null){
            surgeries = new ArrayList<Surgery>();
        }
        return surgeries;
    }

    public void setSurgeries(List<Surgery> surgeries) {
        this.surgeries = surgeries;
    }
}

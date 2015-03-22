package com.ea.rest.domain.com.ea.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by root on 21/3/15.
 */
@Entity
public class Surgery {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private EashPHR eashPHR;

    private String surgeryDescription;

    private Date dateOfSurgery;

//    private List<Medication> preSurgeryMedications;
//
//    private List<Medication> postSurgeryMedications;

    private String surgeryDetails;

    private String surgeryObservations;

    private String surgeryResult;

    private String complications;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurgeryDescription() {
        return surgeryDescription;
    }

    public void setSurgeryDescription(String surgeryDescription) {
        this.surgeryDescription = surgeryDescription;
    }

    public Date getDateOfSurgery() {
        return dateOfSurgery;
    }

    public void setDateOfSurgery(Date dateOfSurgery) {
        this.dateOfSurgery = dateOfSurgery;
    }
//
//    public List<Medication> getPreSurgeryMedications() {
//        if(preSurgeryMedications == null){
//            preSurgeryMedications = new ArrayList<Medication>();
//        }
//        return preSurgeryMedications;
//    }
//
//    public void setPreSurgeryMedications(List<Medication> preSurgeryMedications) {
//        this.preSurgeryMedications = preSurgeryMedications;
//    }
//
//    public List<Medication> getPostSurgeryMedications() {
//        if(postSurgeryMedications == null){
//            postSurgeryMedications = new ArrayList<Medication>();
//        }
//        return postSurgeryMedications;
//    }
//
//    public void setPostSurgeryMedications(List<Medication> postSurgeryMedications) {
//        this.postSurgeryMedications = postSurgeryMedications;
//    }

    public String getSurgeryDetails() {
        return surgeryDetails;
    }

    public void setSurgeryDetails(String surgeryDetails) {
        this.surgeryDetails = surgeryDetails;
    }

    public String getSurgeryObservations() {
        return surgeryObservations;
    }

    public void setSurgeryObservations(String surgeryObservations) {
        this.surgeryObservations = surgeryObservations;
    }

    public String getSurgeryResult() {
        return surgeryResult;
    }

    public void setSurgeryResult(String surgeryResult) {
        this.surgeryResult = surgeryResult;
    }

    public String getComplications() {
        return complications;
    }

    public void setComplications(String complications) {
        this.complications = complications;
    }

    public EashPHR getEashPHR() {
        return eashPHR;
    }

    public void setEashPHR(EashPHR eashPHR) {
        this.eashPHR = eashPHR;
    }
}

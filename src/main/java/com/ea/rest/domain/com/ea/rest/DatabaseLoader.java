package com.ea.rest.domain.com.ea.rest;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Profile("!production")
public class DatabaseLoader {

    private final TeammateRepository teammateRepository;
    private final TeamRepository teamRepository;
    private final PersonalInfoRepository personalInfoRepository;
    private final EashPHRRepository eashPHRRepository;
    private final DiagnosisRepository diagnosisRepository;
    private final LabTestRepository labTestRepository;
    private final SurgeryRepository surgeryRepository;
    private final MedicationRepository medicationRepository;


    @Autowired
    public DatabaseLoader(TeammateRepository teammateRepository, TeamRepository teamRepository, PersonalInfoRepository personalInfoRepository, EashPHRRepository eashPHRRepository,
                          DiagnosisRepository diagnosisRepository, LabTestRepository labTestRepository, SurgeryRepository surgeryRepository, MedicationRepository medicationRepository) {
        this.teammateRepository = teammateRepository;
        this.teamRepository = teamRepository;
        this.personalInfoRepository = personalInfoRepository;
        this.eashPHRRepository = eashPHRRepository;
        this.diagnosisRepository = diagnosisRepository;
        this.labTestRepository = labTestRepository;
        this.surgeryRepository = surgeryRepository;
        this.medicationRepository = medicationRepository;
    }

    @PostConstruct
    private void initDatabase() {
        Team springBootTeam = new Team("Spring Boot Badgers");
        teamRepository.save(springBootTeam);

        Teammate greg = new Teammate("Greg", "Turnquist");
        greg.setPosition("2nd base");
        greg.setTeam(springBootTeam);
        teammateRepository.save(greg);

        Teammate roy = new Teammate("Roy", "Clarkson");
        roy.setPosition("1st base");
        roy.setTeam(springBootTeam);
        teammateRepository.save(roy);

        Teammate phil = new Teammate("Phil", "Webb");
        phil.setPosition("pitcher");
        phil.setTeam(springBootTeam);
        teammateRepository.save(phil);

        PersonalInfo jack = new PersonalInfo();
        jack.setFirstName("Jack");
        jack.setLastName("Reacher");
        personalInfoRepository.save(jack);

        EashPHR jacksPhr = new EashPHR();
        jacksPhr.setPersonalInfo(jack);

        Diagnosis diagnosis = new Diagnosis();
        diagnosis.setAllergies("allergies");
        diagnosis.setBpDiastolic(80);
        diagnosis.setBpSystolic(120);
        diagnosis.setComplaint("complaint");
        diagnosis.setDiagnosis("diagnosis");
        diagnosis.setDoctorNotes("doctor notes");
        diagnosis.setProgressNotes("progress notes");
        diagnosis.setTempInFahrenheit(98.6);
        diagnosis.setTreatment("treatment");
        diagnosis.setWeight(75);
        diagnosisRepository.save(diagnosis);

        eashPHRRepository.save(jacksPhr);
//        jacksPhr.setDiagnosis(diagnosis);

        Medication medication1 = new Medication();
        medication1.setLifeLongUsage(true);
        medication1.setMedicationEndDate(new Date());
        medication1.setMedicineName("medication name 1");
        medication1.setPeriodicity("periodicity 1");
        medication1.setQuantity(10);
        medication1.setEashPHR(jacksPhr);
        medicationRepository.save(medication1);
        jacksPhr.getMedications().add(medication1);
        Medication medication2 = new Medication();
        medication2.setLifeLongUsage(true);
        medication2.setMedicationEndDate(new Date());
        medication2.setMedicineName("medication name 2");
        medication2.setPeriodicity("periodicity 2");
        medication2.setQuantity(10);
        medication2.setEashPHR(jacksPhr);
        medicationRepository.save(medication2);
//        jacksPhr.getMedications().add(medication2);

        LabTest labTest1 = new LabTest();
        labTest1.setActualValues(100);
        labTest1.setDiagnosisSummary("diagnosis summary 1");
        labTest1.setLowerLimit(80);
        labTest1.setUpperLimit(120);
        labTest1.setTestName("test name 1");
        labTest1.setEashPHR(jacksPhr);
        labTestRepository.save(labTest1);
//        jacksPhr.getLabTests().add(labTest1);
        LabTest labTest2 = new LabTest();
        labTest2.setActualValues(100);
        labTest2.setDiagnosisSummary("diagnosis summary 2");
        labTest2.setLowerLimit(80);
        labTest2.setUpperLimit(120);
        labTest2.setTestName("test name 2");
        labTest2.setEashPHR(jacksPhr);
        labTestRepository.save(labTest2);
//        jacksPhr.getLabTests().add(labTest2);

        Surgery surgery1 = new Surgery();
        surgery1.setComplications("complication 1");
        surgery1.setDateOfSurgery(new Date());
//        surgery1.getPostSurgeryMedications().add(medication1);
//        surgery1.getPreSurgeryMedications().add(medication1);
        surgery1.setSurgeryDescription("surgery description 1");
        surgery1.setSurgeryDetails("surgery details 1");
        surgery1.setSurgeryResult("surgery results 1");
        surgery1.setEashPHR(jacksPhr);
        surgeryRepository.save(surgery1);
//        jacksPhr.getSurgeries().add(surgery1);

        Surgery surgery2 = new Surgery();
        surgery2.setComplications("complication 2");
        surgery2.setDateOfSurgery(new Date());
//        surgery2.getPostSurgeryMedications().add(medication2);
//        surgery2.getPreSurgeryMedications().add(medication2);
        surgery2.setSurgeryDescription("surgery description 2");
        surgery2.setSurgeryDetails("surgery details 2");
        surgery2.setSurgeryResult("surgery results 2");
        jacksPhr.getSurgeries().add(surgery2);
        surgery2.setEashPHR(jacksPhr);
        surgeryRepository.save(surgery2);


    }

}

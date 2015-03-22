package com.ea.rest.domain.com.ea.rest;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by root on 21/3/15.
 */
public interface MedicationRepository extends CrudRepository<Medication, Long> {

    @Override
    List<Medication> findAll();
}

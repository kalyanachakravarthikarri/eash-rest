package com.ea.rest.domain.com.ea.rest;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by root on 16/3/15.
 */
public interface EashPHRRepository extends CrudRepository<EashPHR, Long>{

    @Override
    List<EashPHR> findAll();
}

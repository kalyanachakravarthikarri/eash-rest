//package com.ea.rest.controllers;
//
//import com.ea.rest.domain.com.ea.rest.EashPHR;
//import com.ea.rest.domain.com.ea.rest.EashPHRRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by root on 21/3/15.
// */
//@RestController
//@RequestMapping("/eashphrs")
//public class PhrRestController {
//
//    @Autowired
//    EashPHRRepository eashPHRRepository;
//
//    @RequestMapping(method= RequestMethod.GET)
//    public List<EashPHR> getAll() {
//        return eashPHRRepository.findAll();
//    }
//
//    @RequestMapping(method= RequestMethod.GET, value="{id}")
//    public EashPHR get(@PathVariable Long id) {
//        return eashPHRRepository.findOne(id);
//    }
//
//    @RequestMapping(method=RequestMethod.POST)
//    public EashPHR create(@RequestBody EashPHR eashPHR) {
//        return eashPHRRepository.save(eashPHR);
//    }
//
//    @RequestMapping(method=RequestMethod.DELETE, value="{id}")
//    public void delete(@PathVariable Long id) {
//        eashPHRRepository.delete(id);
//
//    }
//
//    @RequestMapping(method=RequestMethod.PUT, value="{id}")
//    public EashPHR update(@PathVariable Long id, @RequestBody EashPHR eashPHR) {
//        return eashPHRRepository.save(eashPHR);
//    }
//
//}

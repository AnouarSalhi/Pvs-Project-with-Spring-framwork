package com.pvs.controllers;

import com.pvs.entities.Pv;
import com.pvs.entities.SourcePvs;
import com.pvs.repositories.SourcePvsRepository;
import com.pvs.services.SourcePvsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/sourcepvs")
@RestController
public class SourcePvsController {
    @Autowired
    private SourcePvsService sourcePvsService;
    // get all pv:
    @GetMapping(path = "/all")
    public List<SourcePvs> getSourcePvs() {
        return sourcePvsService.getSourcePvs();
    }


    // add new pv
    @PostMapping(path = "/add")
    public void NewPv(@RequestBody SourcePvs sourcePvs){
        sourcePvsService.addNewSourcePvs(sourcePvs);
    }



    @DeleteMapping("/deletePv/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        sourcePvsService.deleteSourcePvs(id);
    }

}
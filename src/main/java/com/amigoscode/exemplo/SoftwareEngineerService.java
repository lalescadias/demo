package com.amigoscode.exemplo;

import java.util.*;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class SoftwareEngineerService {

 private final SoftawareEngineerRepository repository;

    public SoftwareEngineerService(SoftawareEngineerRepository repository) {
        this.repository = repository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return repository.findAll();
    }

    public void addSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer) {
        repository.save(softwareEngineer);
    }


}

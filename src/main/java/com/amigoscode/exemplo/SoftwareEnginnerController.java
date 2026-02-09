package com.amigoscode.exemplo;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEnginnerController {
    private final SoftwareEngineerService softwareEngineerService;
  
    public SoftwareEnginnerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerService.getAllSoftwareEngineers();
    }
    @PostMapping("add")
    public void addSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer) {
        softwareEngineerService.addSoftwareEngineer(softwareEngineer);
    }
    
}

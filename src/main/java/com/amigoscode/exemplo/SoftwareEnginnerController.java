package com.amigoscode.exemplo;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEnginnerController {
  
    @GetMapping
    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return List.of(
                new SoftwareEngineer("Alice", 1, "Java"),
                new SoftwareEngineer("Bob", 2, "Python"),
                new SoftwareEngineer("Charlie", 3, "JavaScript")
        );
    }
}

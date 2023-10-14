package com.browslkv.controller;

import com.browslkv.model.Specialist;
import com.browslkv.service.SpecialistService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/browslkv/specialist")
public class SpecialistController {

    @Autowired
    private SpecialistService specialistService;

    @GetMapping("/{specialistId}")
    public ResponseEntity<Specialist> viewSpecialist(@PathVariable Long specialistId) {
        Specialist specialist = specialistService.getSpecialistById(specialistId)
                .orElseThrow(() -> new EntityNotFoundException("Specialist not found"));
        return ResponseEntity.ok(specialist);
    }
}

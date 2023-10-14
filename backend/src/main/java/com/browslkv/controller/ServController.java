package com.browslkv.controller;

import com.browslkv.model.Serv;
import com.browslkv.service.ServService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/browslkv/service")
public class ServController {

    @Autowired
    private ServService servService;

    @GetMapping("/{serviceId}")
    public ResponseEntity<Serv> viewService(@PathVariable Long serviceId) {
        Serv service = servService.getServiceById(serviceId)
                .orElseThrow(() -> new EntityNotFoundException("Service not found"));
        return ResponseEntity.ok(service);
    }
}

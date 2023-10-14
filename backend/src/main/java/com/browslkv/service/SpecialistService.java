package com.browslkv.service;

import com.browslkv.model.Specialist;

import java.util.List;
import java.util.Optional;

public interface SpecialistService {
    Specialist createSpecialist(Specialist specialist);

    Specialist updateSpecialist(Specialist specialist);

    Optional<Specialist> getSpecialistById(Long specialistId);

    List<Specialist> getAllSpecialists();

    void deleteSpecialist(Long specialistId);
}

package com.browslkv.service.impl;

import com.browslkv.model.Specialist;
import com.browslkv.repository.SpecialistRepository;
import com.browslkv.service.SpecialistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecialistServiceImpl implements SpecialistService {

    private final SpecialistRepository specialistRepository;

    @Autowired
    public SpecialistServiceImpl(SpecialistRepository specialistRepository) {
        this.specialistRepository = specialistRepository;
    }

    @Override
    public Specialist createSpecialist(Specialist specialist) {
        return specialistRepository.save(specialist);
    }

    @Override
    public Specialist updateSpecialist(Specialist specialist) {
        return specialistRepository.save(specialist);
    }

    @Override
    public Optional<Specialist> getSpecialistById(Long specialistId) {
        return specialistRepository.findById(specialistId);
    }

    @Override
    public List<Specialist> getAllSpecialists() {
        return specialistRepository.findAll();
    }

    @Override
    public void deleteSpecialist(Long specialistId) {
        specialistRepository.deleteById(specialistId);
    }
}

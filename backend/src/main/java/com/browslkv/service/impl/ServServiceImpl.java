package com.browslkv.service.impl;

import com.browslkv.model.Serv;
import com.browslkv.model.Specialist;
import com.browslkv.repository.ServRepository;
import com.browslkv.service.ServService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServServiceImpl implements ServService {
    private final ServRepository servRepository;

    @Autowired
    public ServServiceImpl(ServRepository servRepository) {
        this.servRepository = servRepository;
    }

    @Override
    public Serv createService(Serv service) {
        return servRepository.save(service);
    }

    @Override
    public Serv updateService(Serv service) {
        return servRepository.save(service);
    }

    @Override
    public Optional<Serv> getServiceById(Long serviceId) {
        return servRepository.findById(serviceId);
    }

    @Override
    public List<Serv> getAllServicesBySpecialistId(Long specialistId) {
        Specialist specialist = new Specialist();
        specialist.setSpecialistId(specialistId);
        return servRepository.findBySpecialist(specialist);
    }

    @Override
    public void deleteService(Long serviceId) {
        servRepository.deleteById(serviceId);
    }
}

package com.browslkv.service;

import com.browslkv.model.Serv;

import java.util.List;
import java.util.Optional;

public interface ServService {
    Serv createService(Serv serv);

    Serv updateService(Serv serv);

    Optional<Serv> getServiceById(Long serviceId);

    List<Serv> getAllServicesBySpecialistId(Long specialistId);

    void deleteService(Long serviceId);
}

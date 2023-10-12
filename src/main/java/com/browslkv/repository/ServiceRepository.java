package com.browslkv.repository;

import com.browslkv.model.Service;
import com.browslkv.model.Specialist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Service, Long> {
    List<Service> findBySpecialist(Specialist specialist);
}

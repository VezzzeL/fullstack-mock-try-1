package com.browslkv.repository;

import com.browslkv.model.Service;
import com.browslkv.model.Specialist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {
    List<Service> findBySpecialist(Specialist specialist);
}

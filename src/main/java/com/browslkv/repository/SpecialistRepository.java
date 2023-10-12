package com.browslkv.repository;

import com.browslkv.model.Specialist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SpecialistRepository extends JpaRepository<Specialist, Long> {
    List<Specialist> findByLocation(String location);
    Optional<Specialist> findByUserId(Long userId);
}

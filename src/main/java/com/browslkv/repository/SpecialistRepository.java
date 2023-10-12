package com.browslkv.repository;

import com.browslkv.model.Specialist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SpecialistRepository extends JpaRepository<Specialist, Long> {
    List<Specialist> findByLocation(String location);

    Optional<Specialist> findByUserUserId(Long userId);
}

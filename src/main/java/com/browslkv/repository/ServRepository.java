package com.browslkv.repository;

import com.browslkv.model.Serv;
import com.browslkv.model.Specialist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServRepository extends JpaRepository<Serv, Long> {
    List<Serv> findBySpecialist(Specialist specialist);
}

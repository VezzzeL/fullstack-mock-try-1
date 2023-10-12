package com.browslkv.repository;

import com.browslkv.model.Appointment;
import com.browslkv.model.Specialist;
import com.browslkv.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByCustomer(User customer);

    List<Appointment> findBySpecialist(Specialist specialist);
}

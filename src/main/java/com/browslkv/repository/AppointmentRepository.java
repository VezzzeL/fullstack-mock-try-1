package com.browslkv.repository;

import com.browslkv.model.Appointment;
import com.browslkv.model.Specialist;
import com.browslkv.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByCustomer(User customer);
    List<Appointment> findBySpecialist(Specialist specialist);
}

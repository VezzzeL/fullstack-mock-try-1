package com.browslkv.service;

import com.browslkv.model.Appointment;

import java.util.List;
import java.util.Optional;

public interface AppointmentService {
    Appointment createAppointment(Appointment appointment);

    Appointment updateAppointment(Appointment appointment);

    Optional<Appointment> getAppointmentById(Long appointmentId);

    List<Appointment> getAppointmentsByCustomerId(Long customerId);

    List<Appointment> getAppointmentsBySpecialistId(Long specialistId);

    void deleteAppointment(Long appointmentId);
}

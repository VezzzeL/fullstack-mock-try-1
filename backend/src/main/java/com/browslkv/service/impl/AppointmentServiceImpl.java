package com.browslkv.service.impl;

import com.browslkv.model.Appointment;
import com.browslkv.model.Specialist;
import com.browslkv.model.User;
import com.browslkv.repository.AppointmentRepository;
import com.browslkv.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment updateAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Optional<Appointment> getAppointmentById(Long appointmentId) {
        return appointmentRepository.findById(appointmentId);
    }

    @Override
    public List<Appointment> getAppointmentsByCustomerId(Long customerId) {
        User customer = new User();
        customer.setUserId(customerId);
        return appointmentRepository.findByCustomer(customer);
    }

    @Override
    public List<Appointment> getAppointmentsBySpecialistId(Long specialistId) {
        Specialist specialist = new Specialist();
        specialist.setSpecialistId(specialistId);
        return appointmentRepository.findBySpecialist(specialist);
    }

    @Override
    public void deleteAppointment(Long appointmentId) {
        appointmentRepository.deleteById(appointmentId);
    }
}

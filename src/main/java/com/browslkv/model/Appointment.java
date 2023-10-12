package com.browslkv.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.util.Date;

@Entity
@Data
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private Long appointmentId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @ManyToOne
    @JoinColumn(name = "specialist_id")
    private Specialist specialist;

    @Column(name = "appointment_date")
    @NotNull(message = "Appointment date is required")
    private Date appointmentDate;

    @Column(name = "status")
    @NotBlank(message = "Status is required")
    private String status;

    @Column(name = "confirmation_email_sent")
    private boolean confirmationEmailSent;

    @Column(name = "notes")
    @Size(max = 2000, message = "Notes should be less than 2000 characters")
    private String notes;
}


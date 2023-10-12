package com.browslkv.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "services")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private Long serviceId;

    @ManyToOne
    @JoinColumn(name = "specialist_id")
    private Specialist specialist;

    @Column(name = "duration")
    @NotNull(message = "Duration is required")
    private int duration; // In minutes

    @Column(name = "price")
    @NotNull(message = "Price is required")
    private double price;

    @Column(name = "type")
    @NotBlank(message = "Type of service is required")
    private String type;
}

package com.browslkv.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "specialists")
public class Specialist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "specialist_id")
    private Long specialistId;

    @OneToOne
    @JoinColumn(name = "user_id", unique = true)
    private User user;

    @OneToMany(mappedBy = "specialist", cascade = CascadeType.ALL)
    private List<Serv> servs;

    @Column(name = "location")
    @Size(max = 100, message = "Location should be less than 100 characters")
    private String location;
}


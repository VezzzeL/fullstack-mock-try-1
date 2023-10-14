package com.browslkv.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "username")
    @NotBlank(message = "Username is required")
    private String username;

    @Column(name = "email", unique = true)
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email address")
    private String email;

    @Column(name = "password")
    @NotBlank(message = "Password is required")
    private String password;

    @Column(name = "role")
    @NotBlank(message = "Role is required")
    private String role;

    @Column(name = "contact_number")
    @Pattern(regexp = "\\d{10,15}", message = "Invalid contact number")
    private String contactNumber;

    @Column(name = "instagram")
    @Size(max = 50, message = "Instagram handle should be less than 50 characters")
    private String instagram;
}

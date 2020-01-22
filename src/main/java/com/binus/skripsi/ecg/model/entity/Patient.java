package com.binus.skripsi.ecg.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.binus.skripsi.ecg.model.entity.enumeration.Gender;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "patient")
public class Patient {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernateSequence")
    @SequenceGenerator(name = "hibernateSequence")
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false)
    private Gender gender;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "birth_date", nullable = false)
    private Instant birthDate;

    @Column(name = "registration_date", nullable = false)
    private Instant registrationDate;

    @Column(name = "street_address", nullable = false)
    private String streetAddress;

    @Column(name = "sensor_token", nullable = false, unique = true)
    private String sensorToken;

    @ManyToOne
    @JsonIgnoreProperties("patients")
    private Region region;
}

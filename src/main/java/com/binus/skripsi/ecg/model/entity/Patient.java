package com.binus.skripsi.ecg.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.binus.skripsi.ecg.model.entity.enumeration.Gender;
import com.binus.skripsi.ecg.model.entity.Region;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "patient")
public class Patient implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernateSequence")
    @SequenceGenerator(name = "hibernateSequence")
    private Long id;

    @NonNull
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NonNull
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @NonNull
    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false)
    private Gender gender;

    @NonNull
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @NonNull
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @NonNull
    @Column(name = "birth_date", nullable = false)
    private Instant birthDate;

    @NonNull
    @Column(name = "registration_date", nullable = false)
    private Instant registrationDate;

    @NonNull
    @Column(name = "street_address", nullable = false)
    private String streetAddress;

    @NonNull
    @Column(name = "sensor_token", nullable = false, unique = true)
    private String sensorToken;

    @ManyToOne
    @JsonIgnoreProperties("patients")
    private Region region;
}

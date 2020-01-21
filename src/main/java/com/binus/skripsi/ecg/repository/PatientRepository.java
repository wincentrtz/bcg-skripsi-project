package com.binus.skripsi.ecg.repository;

import com.binus.skripsi.ecg.model.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    Optional<Patient> findBySensorToken(String sensorToken);
}

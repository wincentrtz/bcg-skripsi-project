package com.binus.skripsi.ecg.repository;

import com.binus.skripsi.ecg.model.entity.Electrocardiography;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectrocardiographyRepository extends JpaRepository<Electrocardiography, Long> {
}
